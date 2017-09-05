package com.vote.vote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VoterRepositoryImpl implements VoteRepository{

    private static final String KEY = "votes";
    private final RedisTemplate<String, VoteModel> redisTemplate ;

    @Autowired
    public VoterRepositoryImpl(RedisTemplate<String, VoteModel> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
    public void save(VoteModel entity) {
        Long push = redisTemplate.boundListOps(KEY).rightPush(entity);
        System.out.println(push);
        System.out.println("hash key: "+redisTemplate.hasKey(KEY));
        System.out.println("range: "+redisTemplate.boundListOps(KEY).range(0,-1));
    }
}
