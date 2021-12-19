package com.ss.android.ugc.aweme.sticker.repository.internals.c;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.a.b.b;
import com.ss.android.ugc.aweme.bw.b.a;
import com.ss.android.ugc.aweme.sticker.repository.a.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import f.a.ab;
import f.a.d.f;
import f.a.x;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class a extends com.bytedance.jedi.a.j.b implements i, com.ss.android.ugc.aweme.sticker.repository.internals.a {

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.sticker.repository.b.a<FetchFavoriteListResponse> f135533b;

    /* renamed from: c  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.bw.b.a<FetchFavoriteListResponse>> f135534c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    private final t<com.ss.android.ugc.aweme.sticker.repository.a.b> f135535d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    private final t<Boolean> f135536e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    private final com.bytedance.jedi.a.f.b<z, d, d, List<String>> f135537f;

    /* renamed from: g  reason: collision with root package name */
    private final com.bytedance.jedi.a.f.d<z, FetchFavoriteListResponse> f135538g;

    static {
        Covode.recordClassIndex(88582);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.h
    public final i a() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.i
    public final LiveData<com.ss.android.ugc.aweme.bw.b.a<FetchFavoriteListResponse>> b() {
        return this.f135534c;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.i
    public final LiveData<Boolean> c() {
        return this.f135536e;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.internals.a
    public final void d() {
        bn_();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.c.a$a  reason: collision with other inner class name */
    static final class C3529a<T> implements f<f.a.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135539a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f135540b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f135541c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.c f135542d;

        static {
            Covode.recordClassIndex(88583);
        }

        C3529a(a aVar, Effect effect, boolean z, com.ss.android.ugc.aweme.sticker.repository.a.c cVar) {
            this.f135539a = aVar;
            this.f135540b = effect;
            this.f135541c = z;
            this.f135542d = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(f.a.b.b bVar) {
            this.f135539a.b(this.f135540b, !this.f135541c, this.f135542d);
        }
    }

    static final class b<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135543a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f135544b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f135545c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sticker.repository.a.c f135546d;

        static {
            Covode.recordClassIndex(88584);
        }

        b(a aVar, Effect effect, boolean z, com.ss.android.ugc.aweme.sticker.repository.a.c cVar) {
            this.f135543a = aVar;
            this.f135544b = effect;
            this.f135545c = z;
            this.f135546d = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f135543a.b(this.f135544b, this.f135545c, this.f135546d);
        }
    }

    static final class d<T> implements f<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135548a;

        static {
            Covode.recordClassIndex(88586);
        }

        d(a aVar) {
            this.f135548a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Throwable th) {
            this.f135548a.f135534c.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.ERROR, th));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.h
    public final void b(boolean z) {
        this.f135536e.setValue(Boolean.valueOf(z));
    }

    static final class c<T> implements f<FetchFavoriteListResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f135547a;

        static {
            Covode.recordClassIndex(88585);
        }

        c(a aVar) {
            this.f135547a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(FetchFavoriteListResponse fetchFavoriteListResponse) {
            this.f135547a.f135533b.a(z.f158842a, fetchFavoriteListResponse);
            this.f135547a.f135534c.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.SUCCESS, fetchFavoriteListResponse));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.h
    public final ab<FetchFavoriteListResponse> a(boolean z) {
        com.bytedance.jedi.a.f.b a2;
        if (z) {
            a2 = this.f135538g;
        } else {
            a2 = com.bytedance.jedi.a.b.b.a(this.f135538g, this.f135533b, b.a.f39096a).a(e.f135549a);
        }
        ab<FetchFavoriteListResponse> c2 = ab.a((x) a2.c(z.f158842a)).b((f) new c(this)).c(new d(this));
        l.b(c2, "");
        return c2;
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.h
    public final boolean a(String str) {
        FetchFavoriteListResponse b2;
        List<Effect> effects;
        if (str != null && (b2 = this.f135533b.b(z.f158842a)) != null && (effects = b2.getEffects()) != null) {
            Iterator<T> it = effects.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a((Object) next.getEffectId(), (Object) str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static final class e extends m implements h.f.a.m<f.a.t<FetchFavoriteListResponse>, f.a.t<FetchFavoriteListResponse>, f.a.t<FetchFavoriteListResponse>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f135549a = new e();

        static {
            Covode.recordClassIndex(88587);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ f.a.t<FetchFavoriteListResponse> invoke(f.a.t<FetchFavoriteListResponse> tVar, f.a.t<FetchFavoriteListResponse> tVar2) {
            f.a.t<FetchFavoriteListResponse> tVar3 = tVar;
            f.a.t<FetchFavoriteListResponse> tVar4 = tVar2;
            l.d(tVar3, "");
            l.d(tVar4, "");
            f.a.t<FetchFavoriteListResponse> d2 = tVar4.d(tVar3);
            l.b(d2, "");
            return d2;
        }
    }

    public a(com.bytedance.jedi.a.f.b<z, d, d, List<String>> bVar, com.bytedance.jedi.a.f.d<z, FetchFavoriteListResponse> dVar) {
        l.d(bVar, "");
        l.d(dVar, "");
        this.f135537f = bVar;
        this.f135538g = dVar;
        com.ss.android.ugc.aweme.sticker.repository.b.a<FetchFavoriteListResponse> aVar = new com.ss.android.ugc.aweme.sticker.repository.b.a<>();
        this.f135533b = aVar;
        com.bytedance.jedi.a.j.c.a(this, dVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.repository.a.h
    public final ab<List<String>> a(Effect effect, boolean z, com.ss.android.ugc.aweme.sticker.repository.a.c cVar) {
        l.d(effect, "");
        l.d(cVar, "");
        ab<List<String>> c2 = ab.a((x) this.f135537f.c(new d(effect, !z))).a((f<? super f.a.b.b>) new C3529a(this, effect, z, cVar)).c(new b(this, effect, z, cVar));
        l.b(c2, "");
        return c2;
    }

    public final void b(Effect effect, boolean z, com.ss.android.ugc.aweme.sticker.repository.a.c cVar) {
        this.f135535d.setValue(new com.ss.android.ugc.aweme.sticker.repository.a.b(z, effect, cVar));
        FetchFavoriteListResponse b2 = this.f135533b.b(z.f158842a);
        if (b2 != null) {
            List<? extends Effect> g2 = n.g((Collection) b2.getEffects());
            if (z) {
                g2.add(0, effect);
            } else {
                Iterator<T> it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (l.a((Object) next.getEffectId(), (Object) effect.getEffectId())) {
                        if (next != null) {
                            effect = next;
                        }
                    }
                }
                g2.remove(effect);
            }
            b2.setEffects(g2);
            this.f135533b.a(z.f158842a, b2);
            this.f135534c.setValue(com.ss.android.ugc.aweme.bw.b.a.a(a.EnumC1574a.SUCCESS, b2));
        }
    }
}
