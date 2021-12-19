package com.ss.android.ugc.aweme.shoutouts.review.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shoutouts.a.a;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsOrderListApi;
import com.ss.android.ugc.aweme.shoutouts.model.ShoutoutsProductApi;
import com.ss.android.ugc.aweme.shoutouts.model.g;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC3448a f133417a;

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.d.a$a  reason: collision with other inner class name */
    static final class C3457a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C3457a f133418a = new C3457a();

        static {
            Covode.recordClassIndex(87254);
        }

        C3457a() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f133420a = new c();

        static {
            Covode.recordClassIndex(87256);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f133423a = new f();

        static {
            Covode.recordClassIndex(87259);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(87253);
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f133421a;

        static {
            Covode.recordClassIndex(87257);
        }

        d(a aVar) {
            this.f133421a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f133421a.f133417a.a();
        }
    }

    public a(a.AbstractC3448a aVar) {
        l.d(aVar, "");
        this.f133417a = aVar;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f133419a;

        static {
            Covode.recordClassIndex(87255);
        }

        b(a aVar) {
            this.f133419a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.shoutouts.model.d dVar = (com.ss.android.ugc.aweme.shoutouts.model.d) obj;
            if (dVar != null && dVar.f133209a == 0 && dVar.f133210b != null && dVar.f133210b.length != 0) {
                this.f133419a.f133417a.b();
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f133422a;

        static {
            Covode.recordClassIndex(87258);
        }

        e(a aVar) {
            this.f133422a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            g gVar = (g) obj;
            if (gVar == null || gVar.f133225a != 0 || gVar.f133226b == null) {
                this.f133422a.f133417a.a();
            } else {
                this.f133422a.f133417a.a(gVar.f133226b);
            }
        }
    }

    public final void a(String str) {
        l.d(str, "");
        ShoutoutsOrderListApi.a.a().getOrderList(2, str, 1).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(C3457a.f133418a).a(new b(this), c.f133420a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0066 A[Catch:{ Exception -> 0x0067 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shoutouts.review.d.a.b(java.lang.String):boolean");
    }

    public final void a(String str, String str2) {
        ShoutoutsProductApi.a.a().getProduct(str, str2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).c(new d(this)).a(new e(this), f.f133423a);
    }
}
