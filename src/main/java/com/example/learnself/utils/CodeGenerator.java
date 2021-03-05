package com.example.learnself.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * @Description: Mybatis-plus 的代码生成器
 * @Date: 2021/2/24 9:52
 * @Author: Mr.Zhao_Nan
 * @Version: 1.0
 */
public class CodeGenerator {

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotBlank(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void codeGenerator(){
        // 代码生成器
        AutoGenerator autoGenerator = new AutoGenerator();

        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setAuthor("Mr.ZhaoNan");
        System.out.println(projectPath);
        globalConfig.setOutputDir(projectPath + "/src/main/java");
        globalConfig.setFileOverride(true);
        globalConfig.setOpen(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        autoGenerator.setGlobalConfig(globalConfig);

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.POSTGRE_SQL);
        dataSourceConfig.setUrl("jdbc:postgresql://localhost:5432/educationSystem");
        dataSourceConfig.setDriverName("org.postgresql.Driver");
        dataSourceConfig.setUsername("postgres");
        dataSourceConfig.setPassword("postgres");
        autoGenerator.setDataSource(dataSourceConfig);

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.example.learnself");
//        packageConfig.setModuleName(scanner("模块名："));
        autoGenerator.setPackageInfo(packageConfig);

        // 自定义配置
        InjectionConfig injectionConfig = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
//
        // 如果模板引擎是 freemarker
        String templatePath = "/templates/mapper.xml.ftl";
//        // 如果模板引擎是 velocity
////        String templatePath = "/templates/mapper.xml.vm";
//        // 自定义输出配置
        List<FileOutConfig> fileOutConfigList = new ArrayList<>();
        fileOutConfigList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                if(packageConfig.getModuleName()==null){
                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                    return projectPath + "/src/main/resources/mapper/"+ tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                }
                // 自定义输出文件名，如果你 Entity 设置了前后缀，此处注意 xml 的名称会跟着发生变化。
                return projectPath + "/src/main/resources/mapper"
                        + "/" +tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });

//        injectionConfig.setFileCreate(new IFileCreate() {
//            @Override
//            public boolean isCreate(ConfigBuilder configBuilder, FileType fileType, String filePath) {
//                // 判断自定义文件是否需要创建
//                checkDir("调用默认方法穿件的目录，自定义目录用");
//                if (fileType == FileType.MAPPER){
//                    // 已经生成 mapper 文件判断存在， 不想重新生成返回 false；
//                    return !new File(filePath).exists();
//                }
//                // 允许生成模板
//                return true;
//            }
//        });
//
        injectionConfig.setFileOutConfigList(fileOutConfigList);
        autoGenerator.setCfg(injectionConfig);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        autoGenerator.setTemplate(templateConfig);

        // 策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setRestControllerStyle(true);
        strategyConfig.setEntityTableFieldAnnotationEnable(true);
        strategyConfig.setInclude(scanner("表名, 以逗号分割").split(","));
        strategyConfig.setControllerMappingHyphenStyle(true);
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.setTemplateEngine(new FreemarkerTemplateEngine());
        autoGenerator.execute();
    }

    public static void main(String[] args) {
        CodeGenerator.codeGenerator();
    }
}
