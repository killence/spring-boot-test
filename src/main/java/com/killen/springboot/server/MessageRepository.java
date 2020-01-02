package com.killen.springboot.server;

import com.killen.springboot.entity.Message;

import java.util.List;

/**
 * @Date 2020-01-02
 **/
public interface MessageRepository {

    List<Message> findAll();

    Message save(Message message);

    Message update(Message message);

    Message updateText(Message message);

    Message findMessage(Long id);

    void deleteMessage(Long id);
}
