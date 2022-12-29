package com.example.Corso_Spring_Hibernate.Hibernate.service;

import com.example.Corso_Spring_Hibernate.Hibernate.entity.Corso;
import com.example.Corso_Spring_Hibernate.Hibernate.repository.CorsoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorsoServiceImpl implements CorsoService{
    @Autowired
    CorsoRepository corsoRepository;

    @Override
    public List<Corso> getListaCorsi() {
        return corsoRepository.getListaCorsi();
    }
}
