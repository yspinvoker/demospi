package com.ysp.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName MyTypeFilter
 * @Description TODO
 * @Author mesos
 * @Date 2018/12/30 19:03
 * @Version 1.0
 **/
public class MyTypeFilter implements TypeFilter {
    //metadataReader 读取到的当前正在扫描的类的信息
    //metadataReaderFactory 可以获取到其他任何类信息
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotitionMetadata = metadataReader.getAnnotationMetadata();
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource =  metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println("----->" + className);
        if (className.contains("controller")) {
            return true;
        }
        return false;
    }
}
