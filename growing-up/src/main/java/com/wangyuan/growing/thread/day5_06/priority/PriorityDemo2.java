package com.wangyuan.growing.thread.day5_06.priority;

import lombok.Data;

/**
 * @program: serviceparent
 * @description: priority test
 * @author: WangYuan
 * @create: 2019-05-06 22:42
 */
@Data
public class PriorityDemo2 extends Thread {
    private long count;

    @Override
    public void run() {
        while(true) {
            count++;
        }
    }
}
