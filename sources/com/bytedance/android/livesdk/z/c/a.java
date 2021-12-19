package com.bytedance.android.livesdk.z.c;

import com.bytedance.covode.number.Covode;
import f.a.b.b;
import f.a.t;
import f.a.z;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22931a;

    /* renamed from: b  reason: collision with root package name */
    public long f22932b;

    /* renamed from: c  reason: collision with root package name */
    public long f22933c;

    /* renamed from: d  reason: collision with root package name */
    public b f22934d;

    static {
        Covode.recordClassIndex(13552);
    }

    /* renamed from: com.bytedance.android.livesdk.z.c.a$a  reason: collision with other inner class name */
    public static class C0498a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22936a = new a();

        static {
            Covode.recordClassIndex(13554);
        }
    }

    public final void b() {
        this.f22931a = false;
        b bVar = this.f22934d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public final void a() {
        b();
        if (this.f22932b >= 0) {
            t.a(0, 1, TimeUnit.SECONDS).b((this.f22932b / 1000) + 1).d(new b(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new z<Long>() {
                /* class com.bytedance.android.livesdk.z.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(13553);
                }

                @Override // f.a.z
                public final void onError(Throwable th) {
                }

                @Override // f.a.z
                public final void onComplete() {
                    com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.z.b.b());
                    a.this.b();
                }

                @Override // f.a.z
                public final void onSubscribe(b bVar) {
                    a.this.f22934d = bVar;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.z
                public final /* synthetic */ void onNext(Long l2) {
                    Long l3 = l2;
                    if (l3.longValue() > 0) {
                        a.this.f22933c = l3.longValue();
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.z.b.a(l3.longValue()));
                    }
                }
            });
        }
    }
}
