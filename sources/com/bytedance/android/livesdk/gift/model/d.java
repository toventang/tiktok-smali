package com.bytedance.android.livesdk.gift.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Integer f17871a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final Integer f17872b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final Long f17873c = 0L;
    @c(a = "level")

    /* renamed from: d  reason: collision with root package name */
    public Integer f17874d;
    @c(a = StringSet.type)

    /* renamed from: e  reason: collision with root package name */
    public Integer f17875e;
    @c(a = "count")

    /* renamed from: f  reason: collision with root package name */
    public Long f17876f;

    static {
        Covode.recordClassIndex(9960);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f17874d != null) {
            sb.append(", level=").append(this.f17874d);
        }
        if (this.f17875e != null) {
            sb.append(", type=").append(this.f17875e);
        }
        if (this.f17876f != null) {
            sb.append(", count=").append(this.f17876f);
        }
        return sb.replace(0, 2, "DriveItem{").append('}').toString();
    }
}
