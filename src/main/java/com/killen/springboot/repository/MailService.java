package com.killen.springboot.repository;

/**
 * @Date 2020-03-08
 **/
public interface MailService {
     void sendSimpleMail(String to, String subject, String content);
}
