package com.ss.android.ugc.aweme.sticker.types.lock;

import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.core.g.e;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.port.in.bk;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.h;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import h.f.a.b;
import h.z;
import java.util.List;

public final class LockStickerHandler implements au, l, m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f136117a;

    /* renamed from: b  reason: collision with root package name */
    public final d f136118b;

    /* renamed from: c  reason: collision with root package name */
    private Effect f136119c;

    /* renamed from: d  reason: collision with root package name */
    private int f136120d = -1;

    /* renamed from: e  reason: collision with root package name */
    private boolean f136121e;

    /* renamed from: f  reason: collision with root package name */
    private h f136122f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f136123g;

    /* renamed from: h  reason: collision with root package name */
    private final OnUnlockShareFinishListener f136124h = new a(this);

    /* renamed from: i  reason: collision with root package name */
    private final o f136125i;

    /* renamed from: j  reason: collision with root package name */
    private final b<com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> f136126j;

    /* renamed from: k  reason: collision with root package name */
    private final h.f.a.a<z> f136127k;

    static {
        Covode.recordClassIndex(88915);
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
        d();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f136117a) {
            b();
        }
    }

    public static final class a implements OnUnlockShareFinishListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LockStickerHandler f136128a;

        static {
            Covode.recordClassIndex(88916);
        }

        @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppFailed() {
            g.a().F().a(this.f136128a.f136118b);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(LockStickerHandler lockStickerHandler) {
            this.f136128a = lockStickerHandler;
        }

        @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppSucceed(Effect effect) {
            h.f.b.l.d(effect, "");
            this.f136128a.f136117a = true;
        }

        @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onVKShareSucceed(Effect effect) {
            h.f.b.l.d(effect, "");
            this.f136128a.b();
        }
    }

    private final void c() {
        String str;
        bk F = g.a().F();
        if (this.f136121e) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        this.f136122f = F.a(str, this.f136118b, this.f136119c, this.f136124h, true);
    }

    public final void b() {
        String str;
        bk F = g.a().F();
        d dVar = this.f136118b;
        if (this.f136121e) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        F.a(dVar, str);
        this.f136127k.invoke();
        Effect effect = this.f136119c;
        if (effect != null) {
            this.f136126j.invoke(com.ss.android.ugc.aweme.sticker.f.a.a(effect, this.f136120d, null, null, null, null, null, 0, false, 254));
        }
        this.f136117a = false;
        this.f136121e = false;
    }

    private final void d() {
        List<String> a2;
        if (this.f136123g) {
            com.ss.android.ugc.aweme.port.in.z A = g.a().A();
            if (A.b() && !TextUtils.isEmpty(A.c())) {
                e<Effect, Integer> a3 = a(this.f136125i);
                F f2 = a3.f2397a;
                S s = a3.f2398b;
                if (f2 != null && (a2 = b.a(this.f136118b, A.c())) != null && !a2.isEmpty() && !a2.contains(f2.getEffectId()) && b.b(f2)) {
                    b.a(this.f136118b, A.c(), f2.getEffectId());
                    this.f136119c = f2;
                    if (s == null) {
                        h.f.b.l.b();
                    }
                    this.f136120d = s.intValue();
                    c();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f136123g = true;
        d();
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f136123g = false;
    }

    private static e<Effect, Integer> a(o oVar) {
        List<EffectCategoryModel> a2 = com.ss.android.ugc.aweme.sticker.repository.b.a(oVar.c().j());
        e<Effect, Integer> eVar = new e<>(null, -1);
        if (a2.isEmpty()) {
            return eVar;
        }
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            CategoryEffectModel a3 = com.ss.android.ugc.aweme.sticker.repository.b.a(oVar.c().j(), a2.get(i2).getKey());
            if (a3 != null) {
                int size2 = a3.getEffects().size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Effect effect = a3.getEffects().get(i3);
                    if (c.b(effect)) {
                        return new e<>(effect, Integer.valueOf(i3));
                    }
                }
                continue;
            }
        }
        return eVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar, m.a aVar) {
        h.f.b.l.d(cVar, "");
        h.f.b.l.d(aVar, "");
        if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar2 = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar;
            if (b.b(aVar2.f135378a)) {
                com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a2 = aVar.a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a.a(aVar2.f135378a, aVar2.f135379b, aVar2.f135380c, aVar2.f135382e));
                this.f136119c = aVar2.f135378a;
                this.f136121e = true;
                c();
                return a2;
            }
        }
        return aVar.a(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public LockStickerHandler(d dVar, o oVar, b<? super com.ss.android.ugc.aweme.sticker.d.b.b<?>, z> bVar, h.f.a.a<z> aVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(oVar, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        this.f136118b = dVar;
        this.f136125i = oVar;
        this.f136126j = bVar;
        this.f136127k = aVar;
        dVar.getLifecycle().a(this);
    }
}
