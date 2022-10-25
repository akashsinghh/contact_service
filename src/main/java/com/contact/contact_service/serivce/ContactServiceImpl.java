package com.contact.contact_service.serivce;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{
    //fake list of contacts
    List<Contact> list=List.of(
            new Contact(1L,"ak692380@gmail.com","Akash",1311L),
            new Contact(2L,"ak680@gmail.com","RAhul",1313L),
            new Contact(3L,"ak69280@gmail.com","somya",1312L)
    );
    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
