package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class WaitingReviewInfo {
    @c(a = "audit_content")
    private String content;
    @c(a = "audit_status")
    private int status;
    @c(a = "total_queue_cnt")
    private int totalWaitingCount;
    @c(a = "cur_wait_cnt")
    private int waitingCount;
    @c(a = "rule_info")
    private List<q> waitingReviewRules;
    @c(a = "to_wait_time")
    private int waitingTime;

    static {
        Covode.recordClassIndex(3910);
    }

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<q> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setTotalWaitingCount(int i2) {
        this.totalWaitingCount = i2;
    }

    public void setWaitingCount(int i2) {
        this.waitingCount = i2;
    }

    public void setWaitingReviewRules(List<q> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i2) {
        this.waitingTime = i2;
    }
}
