package com.vote.vote;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

/**
 * Created by patty on 01/08/17.
 */

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class VoteModel implements Serializable {
    private static final long serialVersionUID = 7230157899749915387L;

    private int voter_id;
    private String voteValue;

    public VoteModel() {}

    public VoteModel(int voter_id, String voteValue) {
        this.voter_id = voter_id;
        this.voteValue = voteValue;
    }

    public String toString() {
        return "VoteModel{" +
                "voter_id=" + voter_id +
                ", voteValue='" + voteValue + '\'' +
                '}';
    }

}
