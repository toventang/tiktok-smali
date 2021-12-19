package com.bytedance.sdk.b.d;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.b.b.b;
import com.bytedance.sdk.b.f.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.sdk.b.d.a.a f43561a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f43562b;

    static {
        Covode.recordClassIndex(26662);
    }

    /* renamed from: com.bytedance.sdk.b.d.a$a  reason: collision with other inner class name */
    public static class C1051a {

        /* renamed from: a  reason: collision with root package name */
        public static a f43568a = new a((byte) 0);

        static {
            Covode.recordClassIndex(26665);
        }
    }

    private a() {
        this.f43561a = new com.bytedance.sdk.b.d.d.a();
        this.f43562b = new Handler(Looper.getMainLooper());
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Context context, com.bytedance.sdk.b.d.b.a<b> aVar, boolean z) {
        this.f43561a.a(c.a(context, false), aVar, z);
    }
}
