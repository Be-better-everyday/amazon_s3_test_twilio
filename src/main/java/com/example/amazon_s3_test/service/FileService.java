package com.example.amazon_s3_test.service;


import com.example.amazon_s3_test.exceptions.FileDownloadException;
import com.example.amazon_s3_test.exceptions.FileUploadException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
public interface FileService {
   String uploadFile(MultipartFile multipartFile) throws FileUploadException, IOException;

   Object downloadFile(String fileName) throws FileDownloadException, IOException;

   boolean delete(String fileName);
}
