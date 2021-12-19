package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class a {
    @c(a = "talk_sei_enable")

    /* renamed from: a  reason: collision with root package name */
    public final boolean f18727a;
    @c(a = "talk_sei_interval")

    /* renamed from: b  reason: collision with root package name */
    public final int f18728b;

    static {
        Covode.recordClassIndex(10783);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f18727a == aVar.f18727a && this.f18728b == aVar.f18728b;
    }

    public final int hashCode() {
        boolean z = this.f18727a;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return (i2 * 31) + this.f18728b;
    }

    public final String toString() {
        return "LiveSeiTalkSettingConfig(seiTalkEnable=" + this.f18727a + ", seiInterval=" + this.f18728b + ")";
    }

    private a() {
        this.f18727a = false;
        this.f18728b = 1000;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
