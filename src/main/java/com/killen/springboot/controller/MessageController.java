package com.killen.springboot.controller;

import com.killen.springboot.entity.Message;
import com.killen.springboot.server.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName MessageController
 * @Description: TODO
 * @Author killen
 * @Date 2020-01-02
 * @Version V1.0
 **/
@RestController
@RequestMapping("/")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping(value = "messages")
    public List<Message> list(){
        List<Message> all = messageRepository.findAll();
        return all;
    }

    @PostMapping(value = "message")
    public Message create(Message message){
        message = messageRepository.save(message);
        return message;
    }

    @PutMapping(value = "message")
    public Message modify(Message message){
         Message messageResult = messageRepository.update(message);
         return messageResult;
    }

    @PatchMapping(value = "/message/text")
    public Message patch(Message message){
        Message message1 = messageRepository.updateText(message);
        return  message1;
    }

    @GetMapping(value = "message/{id}")
    public Message get(@PathVariable("id") Long id){
        Message message = messageRepository.findMessage(id);
        return message;
    }

    @DeleteMapping(value = "message/{id}")
    public void delete(@PathVariable("id") Long id){
        messageRepository.deleteMessage(id);
    }
}
