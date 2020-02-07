package me.kay.plugin

class ReleaseInfo {
    String versionCode
    String versionName
    String versionInfo

    String fileName

    ReleaseInfo(){}

    @Override
    public String toString() {
        return "ReleaseInfo{" +
                "versionCode='" + versionCode + '\'' +
                ", versionName='" + versionName + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", fileName='" + fileName + '\'' +
                '}'
    }
}
