package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.livesdk.at.a;
import com.bytedance.android.livesdk.at.k;
import com.bytedance.android.livesdkapi.host.c.b;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;
import f.a.z;

final /* synthetic */ class i implements w {

    /* renamed from: a  reason: collision with root package name */
    private final c f22090a;

    /* renamed from: b  reason: collision with root package name */
    private final k f22091b;

    /* renamed from: c  reason: collision with root package name */
    private final a f22092c;

    static {
        Covode.recordClassIndex(13009);
    }

    i(c cVar, k kVar, a aVar) {
        this.f22090a = cVar;
        this.f22091b = kVar;
        this.f22092c = aVar;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        c cVar = this.f22090a;
        k kVar = this.f22091b;
        cVar.f22059b.unFollowWithConfirm(kVar.f14166d, kVar.f14164b, kVar.f14132a, new b(this.f22092c, kVar, vVar) {
            /* class com.bytedance.android.livesdk.userservice.c.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f22073a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ k f22074b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ v f22075c;

            static {
                Covode.recordClassIndex(13002);
            }

            @Override // com.bytedance.android.livesdkapi.host.c.b
            public final void a() {
                c.this.a(0, this.f22073a.f14132a, this.f22074b.f14167e).b(new z<com.bytedance.android.livesdkapi.depend.model.b.a>() {
                    /* class com.bytedance.android.livesdk.userservice.c.AnonymousClass3.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(13003);
                    }

                    @Override // f.a.z
                    public final void onSubscribe(f.a.b.b bVar) {
                    }

                    @Override // f.a.z
                    public final void onComplete() {
                        AnonymousClass3.this.f22075c.a();
                    }

                    @Override // f.a.z
                    public final void onError(Throwable th) {
                        AnonymousClass3.this.f22075c.a(th);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.z
                    public final /* synthetic */ void onNext(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
                        AnonymousClass3.this.f22075c.a(aVar);
                        AnonymousClass3.this.f22075c.a();
                    }
                });
            }

            {
                this.f22073a = r2;
                this.f22074b = r3;
                this.f22075c = r4;
            }
        });
    }
}
