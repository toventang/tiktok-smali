package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Long f17866a = 0L;

    /* renamed from: b  reason: collision with root package name */
    public static final Boolean f17867b = false;
    @com.google.gson.a.c(a = "item")

    /* renamed from: c  reason: collision with root package name */
    public d f17868c;
    @com.google.gson.a.c(a = "next_expire")

    /* renamed from: d  reason: collision with root package name */
    public Long f17869d;
    @com.google.gson.a.c(a = "equipped")

    /* renamed from: e  reason: collision with root package name */
    public Boolean f17870e;

    static {
        Covode.recordClassIndex(9959);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17868c != null) {
            sb.append(", item=").append(this.f17868c);
        }
        if (this.f17869d != null) {
            sb.append(", next_expire=").append(this.f17869d);
        }
        if (this.f17870e != null) {
            sb.append(", equipped=").append(this.f17870e);
        }
        return sb.replace(0, 2, "DriveBagItem{").append('}').toString();
    }
}
