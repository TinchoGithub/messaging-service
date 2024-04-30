package com.c1736.messagingservice.service.impl;

import com.c1736.messagingservice.entities.EmailDTO;
import com.c1736.messagingservice.service.IEmailService;
import com.c1736.messagingservice.service.exceptions.MessageNotSendException;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.context.Context;

@Service
public class EmailServiceImpl implements IEmailService {


    private final JavaMailSender javaMailSender;
    private final TemplateEngine templateEngine;


    public EmailServiceImpl(JavaMailSender javaMailSender, TemplateEngine templateEngine) {
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;

    }
    @Override
    public void sendMail(EmailDTO email) throws MessagingException {
           try{
               MimeMessage message = javaMailSender.createMimeMessage();
               MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

               helper.setTo(email.getAddressee());
               helper.setSubject(email.getAffair());

               // Procesar la plantilla Thymeleaf}

               Context context = new Context();
               context.setVariable("message", email.getMessage());
               String contenidoHtml = templateEngine.process("email", context);

               helper.setText(contenidoHtml, true);

               javaMailSender.send(message);
           }catch (Exception e){
               throw new MessageNotSendException();
           }

    }

}
