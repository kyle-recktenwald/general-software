package com.krecktenwald.generalsoftware.io;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class IoUtil {
    public String stringFromLocalFile(String fileName) throws IOException {
        return FileUtils.readFileToString(new File("/path/to/file"), StandardCharsets.UTF_8);
    }

    public String stringFromResourceFile(String fileName) throws IOException {
        ClassPathResource resource = new ClassPathResource(fileName);
        byte[] bytes = FileCopyUtils.copyToByteArray(resource.getInputStream());
        return new String(bytes, StandardCharsets.UTF_8);
    }

    public void stringToLocalFile(String str, String outputFilename) throws IOException {
        File outputFile = new File(outputFilename);
        OutputStream outputStream = new FileOutputStream(outputFile);
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);
        outputStream.close();
    }
}
