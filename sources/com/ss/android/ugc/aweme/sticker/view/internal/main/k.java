package com.ss.android.ugc.aweme.sticker.view.internal.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.view.internal.f;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.c;
import h.f.b.ad;
import h.f.b.l;
import h.p;
import h.u;
import h.v;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public final class k implements f {

    /* renamed from: a  reason: collision with root package name */
    public final t<Map<String, p<c, Integer>>> f136311a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    private final t<u<Effect, c, Integer>> f136312b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sticker.repository.a.p f136313c;

    static {
        Covode.recordClassIndex(89028);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.f
    public final LiveData<u<Effect, c, Integer>> a() {
        return this.f136312b;
    }

    public k(com.ss.android.ugc.aweme.sticker.repository.a.p pVar) {
        l.d(pVar, "");
        this.f136313c = pVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.f
    public final p<c, Integer> a(Effect effect) {
        p<c, Integer> pVar;
        l.d(effect, "");
        effect.getName();
        Map<String, p<c, Integer>> value = this.f136311a.getValue();
        if (value == null || (pVar = value.get(effect.getId())) == null) {
            effect.getName();
            if (this.f136313c.b(effect)) {
                pVar = v.a(c.UNKNOWN, 0);
            } else {
                pVar = v.a(c.NOT_DOWNLOAD, 0);
            }
            a(effect, pVar.component1(), pVar.component2(), false);
        }
        return pVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.f
    public final void a(Effect effect, c cVar, Integer num, boolean z) {
        l.d(effect, "");
        l.d(cVar, "");
        Map<String, p<c, Integer>> value = this.f136311a.getValue();
        if (value == null) {
            value = new ConcurrentHashMap<>();
        }
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Pair<com.ss.android.ugc.tools.repository.api.CommonDataState, kotlin.Int?>>");
        Map<String, p<c, Integer>> h2 = ad.h(value);
        h2.put(effect.getId(), v.a(cVar, num));
        this.f136311a.postValue(h2);
        if (z) {
            this.f136312b.postValue(new u<>(effect, cVar, num));
        }
    }
}
