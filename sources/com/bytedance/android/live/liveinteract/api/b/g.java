package com.bytedance.android.live.liveinteract.api.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    public static final String f9979b = "start_co_host";

    /* renamed from: c  reason: collision with root package name */
    public static final String f9980c = "start_match";

    /* renamed from: d  reason: collision with root package name */
    public static final String f9981d = "start_rematch";

    /* renamed from: e  reason: collision with root package name */
    public static final a f9982e = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    private static final String f9983f = "LinkStartEvent";

    /* renamed from: a  reason: collision with root package name */
    public final String f9984a;

    public static final class a {
        static {
            Covode.recordClassIndex(5171);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(5170);
    }

    public g(String str) {
        l.d(str, "");
        this.f9984a = str;
        if (!TextUtils.equals(str, f9979b) && !TextUtils.equals(str, f9980c) && !TextUtils.equals(str, f9981d)) {
            com.bytedance.android.live.core.c.a.a(6, f9983f, "type error");
        }
    }
}
