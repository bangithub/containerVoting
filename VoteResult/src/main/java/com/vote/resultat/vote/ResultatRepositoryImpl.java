package com.vote.resultat.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public abstract class ResultatRepositoryImpl implements ResultatService {

    @Qualifier("resultatRepositoryImpl")
    @Autowired
    private ResultatService resultatservice;

    @Transactional
    public List<votes> trouver(){
        return (List<votes>) resultatservice.findAll();
    }


}
