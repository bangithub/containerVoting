package com.vote.vote;

import org.springframework.stereotype.Service;

/**
 * Created by patty on 01/08/17.
 */

@Service
public interface VoteRepository {
    void save(VoteModel entity);
}
