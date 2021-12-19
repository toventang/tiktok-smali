package com.ss.android.ugc.g.a.a;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class b {
    @c(a = "start_timeout")

    /* renamed from: a  reason: collision with root package name */
    public int f145580a = 5000;
    @c(a = "dns_timeout")

    /* renamed from: b  reason: collision with root package name */
    public int f145581b = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    @c(a = "ping_timeout")

    /* renamed from: c  reason: collision with root package name */
    public int f145582c = 3000;
    @c(a = "tcp_timeout")

    /* renamed from: d  reason: collision with root package name */
    public int f145583d = 4000;
    @c(a = "black_timeout")

    /* renamed from: e  reason: collision with root package name */
    public int f145584e = 300000;
    @c(a = "frequency_limit")

    /* renamed from: f  reason: collision with root package name */
    public int f145585f = 4;
    @c(a = "target_list")

    /* renamed from: g  reason: collision with root package name */
    public String[] f145586g = {"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"};

    static {
        Covode.recordClassIndex(95625);
    }

    public b() {
    }

    public b(String[] strArr) {
        l.c(strArr, "");
        this.f145586g = strArr;
    }
}
