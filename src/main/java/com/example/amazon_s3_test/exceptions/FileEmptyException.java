package com.example.amazon_s3_test.exceptions;

public class FileEmptyException extends SpringBootFileUploadException {
   public FileEmptyException(String message) {
       super(message);
   }
}
