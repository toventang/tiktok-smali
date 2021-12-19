package com.ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public final class AppWidgetStruct {
    @c(a = "ch_info")
    private List<ChallengeStruct> challengeStructList;
    @c(a = "cursor")
    private long cursor;
    @c(a = "status_code")
    private int statusCode;
    @c(a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(71029);
    }

    public final List<ChallengeStruct> getChallengeStructList() {
        return this.challengeStructList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setChallengeStructList(List<ChallengeStruct> list) {
        this.challengeStructList = list;
    }

    public final void setCursor(long j2) {
        this.cursor = j2;
    }

    public final void setStatusCode(int i2) {
        this.statusCode = i2;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public AppWidgetStruct(int i2, String str, long j2, List<ChallengeStruct> list) {
        this.statusCode = i2;
        this.statusMsg = str;
        this.cursor = j2;
        this.challengeStructList = list;
    }
}
