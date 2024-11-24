package com.student.ExploreYourCity.exception;

import com.student.ExploreYourCity.helper.Message;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex) {
//        Map<String, String> resp = new HashMap<>();
//        ex.getBindingResult().getAllErrors().forEach((error)->{
//            String fieldName = ((FieldError) error).getField();
//            String message = error.getDefaultMessage();
//            System.out.println(message);
//            resp.put(fieldName, message);
//        });
//
//        return new ResponseEntity<Map<String,String>>(resp, HttpStatus.BAD_REQUEST);
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ResponseEntity<Map<String, String>> handleValidationExceptions(MethodArgumentNotValidException ex, HttpSession session) {
//        BindingResult result = ex.getBindingResult();
//        Map<String, String> errors = new HashMap<>();
//        for (FieldError error : result.getFieldErrors()) {
//            session.setAttribute(error.getField(), new Message("Something went wrong !!" +error.getDefaultMessage(),"alert-danger"));
//            errors.put(error.getField(), error.getDefaultMessage());
//        }
////        return ResponseEntity.badRequest().body(errors);
//        return new ResponseEntity<Map<String,String>>(errors, HttpStatus.BAD_REQUEST);
//
//    }

//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public String handleValidationExceptions(MethodArgumentNotValidException ex, HttpSession session) {
//        BindingResult result = ex.getBindingResult();
//        Map<String, String> errors = new HashMap<>();
//        for (FieldError error : result.getFieldErrors()) {
//            session.setAttribute(error.getField(), new Message(error.getDefaultMessage(),"alert-danger"));
//            System.out.println(error.getField());
//            errors.put(error.getField(), error.getDefaultMessage());
//        }
////        return ResponseEntity.badRequest().body(errors);
//        return "registration";
//
//    }
//
//}
