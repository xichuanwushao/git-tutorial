package org.xichaun;

import com.hw.commons.lang.utils.IniFile;
import com.hw.hwcdp3.publiccode.global.SystemPath;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test0105Application   implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Test0105Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        IniFile iniFile = new IniFile(SystemPath.CommonDir.configHomeDir + "Cassandra.ini");
        System.out.println(SystemPath.CommonDir.configHomeDir + "Cassandra.ini");
    }
}
