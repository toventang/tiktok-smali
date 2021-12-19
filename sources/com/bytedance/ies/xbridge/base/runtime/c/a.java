package com.bytedance.ies.xbridge.base.runtime.c;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f35830a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f35831b = i.a((h.f.a.a) C0815a.f35832a);

    public static final Handler a() {
        return (Handler) f35831b.getValue();
    }

    private a() {
    }

    /* renamed from: com.bytedance.ies.xbridge.base.runtime.c.a$a  reason: collision with other inner class name */
    static final class C0815a extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0815a f35832a = new C0815a();

        static {
            Covode.recordClassIndex(21394);
        }

        C0815a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        Covode.recordClassIndex(21393);
    }
}
