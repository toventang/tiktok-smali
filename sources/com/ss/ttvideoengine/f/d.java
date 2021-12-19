package com.ss.ttvideoengine.f;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.k.j;
import com.ss.ttvideoengine.k.k;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.i;
import java.lang.ref.WeakReference;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    Handler f152535a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f152536b;

    /* renamed from: c  reason: collision with root package name */
    public String f152537c = "";

    /* renamed from: d  reason: collision with root package name */
    public a f152538d;

    /* renamed from: e  reason: collision with root package name */
    public k f152539e;

    /* renamed from: f  reason: collision with root package name */
    private Context f152540f;

    public interface a {
        static {
            Covode.recordClassIndex(101577);
        }

        void a();

        void a(String str, c cVar);
    }

    static {
        Covode.recordClassIndex(101575);
    }

    public final void a(c cVar) {
        this.f152535a.sendMessage(this.f152535a.obtainMessage(1, cVar));
    }

    static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<d> f152542a;

        static {
            Covode.recordClassIndex(101578);
        }

        public final void handleMessage(Message message) {
            a aVar;
            d dVar = this.f152542a.get();
            if (dVar != null && (aVar = dVar.f152538d) != null) {
                if (dVar.f152536b) {
                    aVar.a();
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    aVar.a(null, (c) message.obj);
                } else if (i2 == 2) {
                    aVar.a((String) message.obj, null);
                }
            }
        }

        public b(d dVar, Looper looper) {
            super(looper);
            this.f152542a = new WeakReference<>(dVar);
        }
    }

    public d(Context context, k kVar) {
        this.f152540f = context;
        this.f152535a = new b(this, i.a());
        if (kVar == null) {
            this.f152539e = new j();
        } else {
            this.f152539e = kVar;
        }
    }
}
