package com.smail.generator;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorRun {
    public void GeneratorRun() throws Exception{
        List<String> warnings=new ArrayList<>();
        boolean overwrite=true;
        //指向逆向工程配置文件
        File configFile=new File(GeneratorRun.class.getResource("/generatorConfig.xml").getFile());
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,
                callback,warnings);
        myBatisGenerator.generate(null);
    }
}
