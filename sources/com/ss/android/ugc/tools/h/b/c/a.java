package com.ss.android.ugc.tools.h.b.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.a.b;
import com.ss.android.ugc.tools.h.a.a.c;
import com.ss.android.ugc.tools.h.a.a.d;
import com.ss.android.ugc.tools.h.a.a.e;
import com.ss.android.ugc.tools.h.a.a.f;
import com.ss.android.ugc.tools.h.a.j;
import com.ss.android.ugc.tools.h.a.m;
import com.ss.android.ugc.tools.h.a.n;
import f.a.t;
import h.f.b.l;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a<CATEGORY, DOWNLOAD_EVENT> implements d<CATEGORY, DOWNLOAD_EVENT> {

    /* renamed from: a  reason: collision with root package name */
    private final c f149346a;

    /* renamed from: b  reason: collision with root package name */
    private final f<CATEGORY> f149347b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap<String, CATEGORY> f149348c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final b<Effect> f149349d;

    /* renamed from: e  reason: collision with root package name */
    private final e f149350e;

    static {
        Covode.recordClassIndex(98347);
    }

    @Override // com.ss.android.ugc.tools.h.a.a.d
    public final t<List<m>> a() {
        return this.f149346a.a();
    }

    @Override // com.ss.android.ugc.tools.h.a.a.d
    public final j<Effect, CategoryEffectModel> a(com.ss.android.ugc.tools.h.a.b bVar) {
        l.d(bVar, "");
        return this.f149349d.a(bVar);
    }

    @Override // com.ss.android.ugc.tools.h.a.a.d
    public final t<com.ss.android.ugc.tools.h.a.a<CATEGORY, Effect>> a(n nVar) {
        l.d(nVar, "");
        t<com.ss.android.ugc.tools.h.a.a<CATEGORY, Effect>> b2 = this.f149347b.a(nVar).b(new C4034a(this));
        l.b(b2, "");
        return b2;
    }

    @Override // com.ss.android.ugc.tools.h.a.a.d
    public CATEGORY a(Effect effect) {
        l.d(effect, "");
        return (CATEGORY) d.a.a(this, effect);
    }

    /* renamed from: com.ss.android.ugc.tools.h.b.c.a$a  reason: collision with other inner class name */
    static final class C4034a<T> implements f.a.d.f<com.ss.android.ugc.tools.h.a.a<CATEGORY, Effect>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f149351a;

        static {
            Covode.recordClassIndex(98348);
        }

        C4034a(a aVar) {
            this.f149351a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            for (T t : ((com.ss.android.ugc.tools.h.a.a) obj).f149202b) {
                Object component1 = t.component1();
                for (T t2 : (List) t.component2()) {
                    String effectId = t2.getEffectId();
                    if (effectId != null && !this.f149351a.f149348c.containsKey(effectId)) {
                        ((ConcurrentHashMap<String, CATEGORY>) this.f149351a.f149348c).put(effectId, component1);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.tools.h.a.a.d
    public CATEGORY a(String str) {
        l.d(str, "");
        return this.f149348c.get(str);
    }

    public a(c cVar, f<CATEGORY> fVar, b<Effect> bVar, e eVar) {
        l.d(cVar, "");
        l.d(fVar, "");
        l.d(bVar, "");
        l.d(eVar, "");
        this.f149346a = cVar;
        this.f149347b = fVar;
        this.f149349d = bVar;
        this.f149350e = eVar;
    }
}
