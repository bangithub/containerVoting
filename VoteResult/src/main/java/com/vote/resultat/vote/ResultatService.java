package com.vote.resultat.vote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface ResultatService extends JpaRepository<votes, String> {

}
