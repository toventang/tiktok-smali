package com.ss.android.ugc.aweme.sticker.presenter.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.a.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.Random;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final h f135267a = i.a((h.f.a.a) C3522a.f135270a);

    /* renamed from: b  reason: collision with root package name */
    private Effect f135268b;

    /* renamed from: c  reason: collision with root package name */
    private final s<Integer, Integer, String, Effect, Boolean, Integer> f135269c;

    static {
        Covode.recordClassIndex(88394);
    }

    private final Random b() {
        return (Random) this.f135267a.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.a.a$a  reason: collision with other inner class name */
    static final class C3522a extends m implements h.f.a.a<Random> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3522a f135270a = new C3522a();

        static {
            Covode.recordClassIndex(88395);
        }

        C3522a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Random invoke() {
            return new Random();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.a.c
    public final int a() {
        return b(null, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.s<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.String, ? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super java.lang.Boolean, java.lang.Integer> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(s<? super Integer, ? super Integer, ? super String, ? super Effect, ? super Boolean, Integer> sVar) {
        l.d(sVar, "");
        this.f135269c = sVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.a.c
    public final int a(Effect effect, boolean z) {
        l.d(effect, "");
        return b(effect, z);
    }

    private final int b(Effect effect, boolean z) {
        String str;
        int i2;
        String effectId;
        Integer e2;
        this.f135268b = effect;
        int nextInt = b().nextInt();
        if (effect == null || (str = effect.getUnzipPath()) == null) {
            str = "";
        }
        if (effect == null || (effectId = effect.getEffectId()) == null || (e2 = p.e(effectId)) == null) {
            i2 = 0;
        } else {
            i2 = e2.intValue();
        }
        return this.f135269c.invoke(Integer.valueOf(nextInt), Integer.valueOf(i2), str, effect, Boolean.valueOf(z)).intValue();
    }
}
