package kay.config;

import me.kay.plugin.myplugin.entity.Account;
import org.springframework.context.annotation.Bean;

//@Configuration
public class AccountConfig {

    @Bean
    public Account account() {
        return new Account();
    }
}
