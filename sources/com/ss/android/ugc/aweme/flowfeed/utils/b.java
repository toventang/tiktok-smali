package com.ss.android.ugc.aweme.flowfeed.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ct;
import com.ss.android.ugc.aweme.video.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Aweme f96171a;

    /* renamed from: b  reason: collision with root package name */
    public int f96172b;

    /* renamed from: c  reason: collision with root package name */
    public ct f96173c = new ct();

    /* renamed from: d  reason: collision with root package name */
    public long f96174d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f96175e;

    /* renamed from: f  reason: collision with root package name */
    public i f96176f;

    /* renamed from: g  reason: collision with root package name */
    public String f96177g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f96178h = false;

    /* renamed from: i  reason: collision with root package name */
    private long f96179i = -1;

    static {
        Covode.recordClassIndex(60929);
    }

    public final int hashCode() {
        return this.f96177g.hashCode();
    }

    public final void a() {
        if (this.f96174d == -1) {
            this.f96174d = System.currentTimeMillis();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !TextUtils.equals(this.f96177g, ((b) obj).f96177g)) {
            return false;
        }
        return true;
    }

    public static String a(String str, String str2) {
        return str + "_" + str2;
    }

    public b(Aweme aweme, ct ctVar, String str) {
        this.f96171a = aweme;
        this.f96173c = ctVar;
        this.f96177g = str;
    }
}
