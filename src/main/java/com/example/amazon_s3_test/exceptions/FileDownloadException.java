package com.example.amazon_s3_test.exceptions;

public class FileDownloadException extends SpringBootFileUploadException {
   public FileDownloadException(String message) {
       super(message);
   }
}
