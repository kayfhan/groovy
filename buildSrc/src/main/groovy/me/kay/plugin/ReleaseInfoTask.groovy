package me.kay.plugin

import groovy.xml.MarkupBuilder
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class ReleaseInfoTask extends DefaultTask {

    ReleaseInfoTask() {
        group: 'kay'
        description: 'i am kay.'
    }

    /**
     * 执行于GRADLE执行阶段的代码
     */
    @TaskAction
    void doAction() {
        updateInfo()
    }

    private void updateInfo() {
        println '-----------============------------'
        String versionCodeMsg = project.extensions.releaseInfo.versionCode
        String versionNameMsg = project.extensions.releaseInfo.versionName
        String versionInfoMsg = project.extensions.releaseInfo.versionInfo
        File file = project.file(project.extensions.releaseInfo.fileName)

        // map -> 对象
        def sw = new StringWriter()
        def xmlBuilder = new MarkupBuilder(sw)
        if (file.text != null && file.text.size() <= 0) {
            xmlBuilder.releasese {
                release {
                    versionCode(versionCodeMsg)
                    versionName(versionNameMsg)
                    versionInfo(versionInfoMsg)
                }
            }
            file.withWriter { write -> write.append(sw.toString()) }
        } else {
            xmlBuilder.release {
                versionCode(versionCodeMsg)
                versionName(versionNameMsg)
                versionInfo(versionInfoMsg)
            }
            // 将生成的节点数据插入到根结点之前
            def lines = file.readLines()
            def lengths = lines.size() - 1
            file.withWriter { writer ->
                lines.eachWithIndex { String line, int index ->
                    if (index != lengths) {
                        writer.append(line + '\r\n')
                    } else if (index == lengths) {
                        writer.append('\r\n' + sw.toString() + '\r\n')
                        writer.append(lines.get(lengths))
                    }
                }
            }
        }
    }

}
