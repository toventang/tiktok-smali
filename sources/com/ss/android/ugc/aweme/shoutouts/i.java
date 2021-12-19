package com.ss.android.ugc.aweme.shoutouts;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class i {
    @c(a = "order_video_review_time")

    /* renamed from: a  reason: collision with root package name */
    public String f133179a;
    @c(a = "set_price_url")

    /* renamed from: b  reason: collision with root package name */
    String f133180b;
    @c(a = "wallet_url")

    /* renamed from: c  reason: collision with root package name */
    String f133181c;
    @c(a = "request_order_limit")

    /* renamed from: d  reason: collision with root package name */
    public int f133182d;
    @c(a = "intro_video_review_time")

    /* renamed from: e  reason: collision with root package name */
    private String f133183e;

    static {
        Covode.recordClassIndex(87092);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f133183e)) {
            return "24";
        }
        String str = this.f133183e;
        if (str == null) {
            l.b();
        }
        return str;
    }
}
