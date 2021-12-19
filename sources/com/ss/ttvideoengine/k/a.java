package com.ss.ttvideoengine.k;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.s.c;
import com.ss.ttvideoengine.s.i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected Handler f153007a = new HandlerC4070a(this);

    /* renamed from: b  reason: collision with root package name */
    protected boolean f153008b;

    /* renamed from: c  reason: collision with root package name */
    protected String f153009c;

    /* renamed from: d  reason: collision with root package name */
    public b f153010d;

    /* renamed from: e  reason: collision with root package name */
    protected k f153011e;

    static {
        Covode.recordClassIndex(101684);
    }

    public void b() {
    }

    public void c() {
    }

    public void d() {
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.f153007a.sendEmptyMessage(0);
    }

    /* renamed from: com.ss.ttvideoengine.k.a$a  reason: collision with other inner class name */
    static class HandlerC4070a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<a> f153012a;

        static {
            Covode.recordClassIndex(101685);
        }

        public HandlerC4070a(a aVar) {
            super(i.a());
            this.f153012a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            b bVar;
            a aVar = this.f153012a.get();
            if (aVar != null && (bVar = aVar.f153010d) != null && !aVar.f153008b) {
                int i2 = message.what;
                if (i2 == 0) {
                    bVar.a();
                } else if (i2 == 1) {
                    aVar.d();
                    bVar.a((c) message.obj);
                } else if (i2 == 2) {
                    aVar.d();
                    bVar.a(null, (c) message.obj);
                } else if (i2 == 3) {
                    aVar.d();
                    bVar.a((JSONObject) message.obj, null);
                }
            }
        }
    }

    public a(String str) {
        this.f153009c = str;
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject) {
        this.f153007a.sendMessage(this.f153007a.obtainMessage(3, jSONObject));
    }

    /* access modifiers changed from: protected */
    public final void b(c cVar) {
        this.f153007a.sendMessage(this.f153007a.obtainMessage(1, cVar));
    }

    /* access modifiers changed from: protected */
    public final void c(c cVar) {
        this.f153007a.sendMessage(this.f153007a.obtainMessage(2, cVar));
    }

    public a(String str, k kVar) {
        this.f153009c = str;
        this.f153011e = kVar == null ? new j() : kVar;
    }
}
