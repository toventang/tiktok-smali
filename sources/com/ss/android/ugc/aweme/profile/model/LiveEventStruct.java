package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class LiveEventStruct implements Serializable {
    @c(a = "id")
    private String id = "";
    @c(a = "is_paid_event")
    private boolean isPaidEvent;
    @c(a = "start_time")
    private long startTime;
    @c(a = "title")
    private String title = "";

    static {
        Covode.recordClassIndex(75238);
    }

    public final String getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPaidEvent() {
        return this.isPaidEvent;
    }

    public final void setPaidEvent(boolean z) {
        this.isPaidEvent = z;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setId(String str) {
        l.d(str, "");
        this.id = str;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }
}
