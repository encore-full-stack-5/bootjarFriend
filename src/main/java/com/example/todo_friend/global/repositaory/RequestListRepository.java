package com.example.todo_friend.global.repositaory;

import com.example.todo_friend.global.entity.RequestList;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface RequestListRepository extends ReactiveCrudRepository<RequestList,Long> {
    Flux<RequestList> findAllByRequestReceiver(Long receiverId);
}
