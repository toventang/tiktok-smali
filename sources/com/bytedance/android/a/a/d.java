package com.bytedance.android.a.a;

import android.content.Context;
import com.bytedance.android.a.a.g.b;
import com.bytedance.android.a.a.h.e;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public abstract class d implements b {
    static {
        Covode.recordClassIndex(3187);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, com.bytedance.android.a.a.f.a aVar);

    /* access modifiers changed from: protected */
    public abstract void a(com.bytedance.android.a.a.a.a aVar);

    public abstract void a(com.bytedance.android.a.a.f.a aVar);

    /* access modifiers changed from: protected */
    public abstract void a(f fVar);

    public abstract void a(com.bytedance.android.a.a.g.a aVar);

    /* access modifiers changed from: protected */
    public abstract void a(ExecutorService executorService);

    public abstract boolean a();

    public abstract boolean b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.android.a.a.f.a f6612a;

        /* renamed from: b  reason: collision with root package name */
        public com.bytedance.android.a.a.a.a f6613b;

        /* renamed from: c  reason: collision with root package name */
        public f f6614c;

        /* renamed from: d  reason: collision with root package name */
        private Context f6615d;

        /* renamed from: e  reason: collision with root package name */
        private ExecutorService f6616e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, com.bytedance.android.a.a.g.a> f6617f;

        /* renamed from: g  reason: collision with root package name */
        private g f6618g;

        static {
            Covode.recordClassIndex(3188);
        }

        public final void a() {
            if (!e.d().a()) {
                e.d().a(this.f6615d, this.f6612a);
                e.d().a(this.f6613b);
                e.d().a(this.f6614c);
                e.d().f6651i = this.f6618g;
                e.d().a(this.f6616e);
                for (Map.Entry<String, com.bytedance.android.a.a.g.a> entry : this.f6617f.entrySet()) {
                    e.d().a(entry.getValue());
                }
                e eVar = e.f6671a;
                Context applicationContext = this.f6615d.getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                eVar.a(applicationContext);
                e.d().c();
            }
        }

        private a(Context context) {
            this.f6615d = context;
        }

        public final a a(com.bytedance.android.a.a.g.a aVar) {
            if (aVar != null) {
                if (this.f6617f == null) {
                    this.f6617f = new HashMap();
                }
                this.f6617f.put(aVar.b(), aVar);
            }
            return this;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    public static a a(Context context) {
        return new a(context, (byte) 0);
    }
}
