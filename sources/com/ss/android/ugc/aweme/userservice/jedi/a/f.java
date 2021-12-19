package com.ss.android.ugc.aweme.userservice.jedi.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.i.a;
import com.bytedance.jedi.a.j.b;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import f.a.l.d;
import h.f.b.l;
import h.p;

public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public final a f142465b;

    /* renamed from: c  reason: collision with root package name */
    public final c f142466c;

    /* renamed from: d  reason: collision with root package name */
    public final d<p<com.ss.android.ugc.aweme.userservice.api.a, FollowStatus>> f142467d;

    /* renamed from: e  reason: collision with root package name */
    public final e f142468e;

    static {
        Covode.recordClassIndex(93176);
    }

    public static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f142471a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f142472b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f142473c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.userservice.api.a f142474d;

        static {
            Covode.recordClassIndex(93179);
        }

        public a(f fVar, p pVar, String str, com.ss.android.ugc.aweme.userservice.api.a aVar) {
            this.f142471a = fVar;
            this.f142472b = pVar;
            this.f142473c = str;
            this.f142474d = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            p pVar;
            Integer num;
            FollowStatus followStatus = (FollowStatus) obj;
            l.b(followStatus, "");
            if (!(followStatus.followStatus != 1 || (pVar = this.f142472b) == null || (num = (Integer) pVar.getSecond()) == null)) {
                if (num.intValue() == 1) {
                    com.ss.android.ugc.aweme.notice.repo.a.b.a(this.f142473c, null);
                } else if (num.intValue() == 0) {
                    com.ss.android.ugc.aweme.notice.repo.a.b.b(this.f142473c, null);
                }
            }
            this.f142471a.f142467d.onNext(new p<>(this.f142474d, followStatus));
        }
    }

    public f(e eVar) {
        l.d(eVar, "");
        this.f142468e = eVar;
        a aVar = new a();
        this.f142465b = aVar;
        c cVar = new c();
        this.f142466c = cVar;
        d<p<com.ss.android.ugc.aweme.userservice.api.a, FollowStatus>> i2 = d.i();
        l.b(i2, "");
        this.f142467d = i2;
        a(com.bytedance.jedi.a.c.b.a(aVar), com.bytedance.jedi.a.c.b.a(eVar), a.b.a(a.b.C0952a.f39257a, AnonymousClass1.f142469a));
        a(com.bytedance.jedi.a.c.b.a(cVar), com.bytedance.jedi.a.c.b.a(eVar), a.b.a(a.b.C0952a.f39257a, AnonymousClass2.f142470a));
    }
}
