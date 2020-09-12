package com.github.qiushijie;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class WebAnnotationEntry {

    private static final int PORT = 15652;

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(PORT);
        tomcat.setBaseDir(System.getProperty("java.io.tmpdir"));
        tomcat.addWebapp("", new File(System.getProperty("java.io.tmpdir")).getAbsolutePath());

        // tomcat 9不加这个启动不了
        tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();
    }

}
