package com.example.amazon_s3_test.exceptions;

public class FileUploadException extends SpringBootFileUploadException{

   public FileUploadException(String message) {
       super(message);
   }
}
