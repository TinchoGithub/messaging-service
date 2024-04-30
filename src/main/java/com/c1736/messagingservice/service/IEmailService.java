package com.c1736.messagingservice.service;


import com.c1736.messagingservice.entities.EmailDTO;
import jakarta.mail.MessagingException;

public interface IEmailService {
    public void sendMail(EmailDTO emailDTO) throws MessagingException;
}
