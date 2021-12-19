package com.bytedance.android.livesdk.chatroom.model.c;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class c {
    @com.google.gson.a.c(a = "rtc_ext_info")

    /* renamed from: a  reason: collision with root package name */
    public String f15747a;

    static {
        Covode.recordClassIndex(8693);
    }

    public c(char c2) {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof c) && l.a(this.f15747a, ((c) obj).f15747a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f15747a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UpdateRoomLayoutSettings(rtcExtInfo=" + this.f15747a + ")";
    }

    private c() {
        this.f15747a = null;
    }

    private /* synthetic */ c(byte b2) {
        this();
    }
}
