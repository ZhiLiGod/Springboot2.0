package com.springboot2.newfeature.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Slf4j
@Service
public class AsyncService {

  @Async("getAsyncExecutor")
  public void asynvProcess() throws Exception {
    log.info("Async process task, current thread {}",
        Thread.currentThread().getName());
    Thread.sleep(2000);
  }

  @Async("getAsyncExecutor")
  public Future<Integer> asyncProcessReturn() throws Exception {
    log.info("Async process return task, current thread {}",
        Thread.currentThread().getName());
    Thread.sleep(2000);
    return new AsyncResult<>(100);
  }

}
