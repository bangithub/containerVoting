package com.vote.resultat.vote;

import javax.persistence.*;

@Entity
@Table (name = "votes")
public class votes {

    @Id
    private int id;
    private String vote;
    public votes() {}

    public int getId() {
        return id;
    }

    public void setId(int vote_id) {
        this.id = vote_id;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String voteValue) {
        this.vote = voteValue;
    }

    @Override
    public String toString() {
        return "votes{" +
                "id=" + id +
                ", vote='" + vote + '\'' +
                '}';
    }
}
