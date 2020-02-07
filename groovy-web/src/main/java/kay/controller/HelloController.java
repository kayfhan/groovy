package kay.controller;

import me.kay.plugin.myplugin.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/list")
    public String getList(){
        return "list";
    }
}
