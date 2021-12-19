package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.aweme.sticker.repository.a.ac;
import com.ss.android.ugc.aweme.sticker.view.internal.f;
import com.ss.android.ugc.aweme.sticker.view.internal.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.tools.h.a.e;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import h.p;
import h.u;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class BaseStickerListViewModel extends HumbleViewModel implements b<Effect>, b {

    /* renamed from: a  reason: collision with root package name */
    private final f.a.b.a f136621a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    private final c f136622b = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private final h f136623c = i.a((h.f.a.a) new d(this));

    /* renamed from: l  reason: collision with root package name */
    public final t<List<Effect>> f136624l = new t<>();

    /* renamed from: m  reason: collision with root package name */
    public final t<com.ss.android.ugc.tools.view.widget.b.a> f136625m = new t<>();
    public final t<com.bytedance.jedi.arch.d<Effect>> n = new t<>();
    public final o o;
    public final com.ss.android.ugc.aweme.sticker.d.d p;
    public final g q;
    public final f r;

    static final class b implements IUpdateTagListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f136630a = new b();

        static {
            Covode.recordClassIndex(89233);
        }

        b() {
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IUpdateTagListener
        public final void onFinally() {
        }
    }

    static {
        Covode.recordClassIndex(89230);
    }

    /* access modifiers changed from: protected */
    public abstract Effect a(f<Effect> fVar);

    /* access modifiers changed from: protected */
    public final e<Effect> o() {
        return (e) this.f136623c.getValue();
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final LiveData<List<Effect>> l() {
        return this.f136624l;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final LiveData<com.ss.android.ugc.tools.view.widget.b.a> m() {
        return this.f136625m;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final LiveData<com.bytedance.jedi.arch.d<Effect>> n() {
        return this.n;
    }

    static final class d extends h.f.b.m implements h.f.a.a<e<Effect>> {
        final /* synthetic */ BaseStickerListViewModel this$0;

        static {
            Covode.recordClassIndex(89235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BaseStickerListViewModel baseStickerListViewModel) {
            super(0);
            this.this$0 = baseStickerListViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e<Effect> invoke() {
            return this.this$0.i();
        }
    }

    /* access modifiers changed from: protected */
    public e<Effect> i() {
        return new a();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final LiveData<u<Effect, com.ss.android.ugc.tools.h.a.c, Integer>> k() {
        return this.r.a();
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        super.onCleared();
        this.f136621a.a();
    }

    public static final class a implements e<Effect> {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<String, Integer> f136626a = new HashMap<>();

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, Integer> f136627b = new HashMap<>();

        static {
            Covode.recordClassIndex(89231);
        }

        a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.BaseStickerListViewModel$a$a  reason: collision with other inner class name */
        static final class CallableC3565a<V> implements Callable<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f136628a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f136629b;

            static {
                Covode.recordClassIndex(89232);
            }

            CallableC3565a(a aVar, List list) {
                this.f136628a = aVar;
                this.f136629b = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ z call() {
                int i2 = 0;
                for (Object obj : this.f136629b) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    EffectTemplate effectTemplate = (EffectTemplate) obj;
                    if (effectTemplate != null) {
                        String effectId = effectTemplate.getEffectId();
                        if (!TextUtils.isEmpty(effectId)) {
                            this.f136628a.f136626a.put(effectId, Integer.valueOf(i2));
                        }
                        String resourceId = effectTemplate.getResourceId();
                        if (!TextUtils.isEmpty(resourceId)) {
                            this.f136628a.f136627b.put(resourceId, Integer.valueOf(i2));
                        }
                    }
                    i2 = i3;
                }
                return z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.e
        public final void a(List<? extends Effect> list) {
            l.d(list, "");
            this.f136626a.clear();
            this.f136627b.clear();
            b.i.a((Callable) new CallableC3565a(this, list));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.e
        public final /* synthetic */ int a(Effect effect) {
            Effect effect2 = effect;
            if (effect2 == null) {
                return -1;
            }
            Integer num = this.f136626a.get(effect2.getEffectId());
            if (num != null || (!TextUtils.isEmpty(effect2.getResourceId()) && (num = this.f136627b.get(effect2.getResourceId())) != null)) {
                return num.intValue();
            }
            return -1;
        }
    }

    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseStickerListViewModel f136631a;

        static {
            Covode.recordClassIndex(89234);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(BaseStickerListViewModel baseStickerListViewModel) {
            this.f136631a = baseStickerListViewModel;
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void b(Effect effect) {
            l.d(effect, "");
            this.f136631a.a(effect, com.ss.android.ugc.tools.h.a.c.DOWNLOAD_SUCCESS, null);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void c(Effect effect) {
            l.d(effect, "");
            this.f136631a.a(effect, com.ss.android.ugc.tools.h.a.c.DOWNLOADING, null);
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void a(Effect effect, int i2) {
            l.d(effect, "");
            this.f136631a.a(effect, com.ss.android.ugc.tools.h.a.c.DOWNLOADING, Integer.valueOf(i2));
        }

        @Override // com.ss.android.ugc.aweme.sticker.g.c.a
        public final void a(Effect effect, ExceptionResult exceptionResult) {
            l.d(effect, "");
            this.f136631a.a(effect, com.ss.android.ugc.tools.h.a.c.DOWNLOAD_FAILED, null);
            this.f136631a.n.setValue(new com.bytedance.jedi.arch.d<>(effect));
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final /* synthetic */ p a(Object obj) {
        Effect effect = (Effect) obj;
        l.d(effect, "");
        return this.r.a(effect);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final /* synthetic */ int b(Object obj) {
        return o().a((Effect) obj);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.b
    public final void b(f<Effect> fVar) {
        boolean z;
        Effect effect;
        l.d(fVar, "");
        DATA data = fVar.f136649a;
        int i2 = fVar.f136650b;
        int i3 = fVar.f136651c;
        boolean z2 = fVar.f136652d;
        boolean z3 = fVar.f136653e;
        boolean z4 = fVar.f136654f;
        Bundle bundle = fVar.f136655g;
        c.b bVar = fVar.f136656h;
        h.f.a.a<z> aVar = fVar.f136657i;
        h.f.a.a<z> aVar2 = fVar.f136658j;
        if (!com.ss.android.ugc.aweme.sticker.p.g.t(this.o.f())) {
            boolean a2 = a(data, z3);
            if (z2) {
                z = a2;
            } else {
                z = false;
            }
            this.o.n().a(new com.ss.android.ugc.aweme.sticker.presenter.b(data, i3, i2, z, z3));
            if (!a2 || z3) {
                o oVar = this.o;
                l.d(oVar, "");
                l.d(data, "");
                com.ss.android.ugc.aweme.sticker.repository.a.l c2 = oVar.c().c();
                l.d(c2, "");
                l.d(data, "");
                p<e, Boolean> b2 = c2.b(new ac(data));
                if (b2 != null) {
                    e component1 = b2.component1();
                    boolean booleanValue = b2.component2().booleanValue();
                    if ((component1 == e.PENDING || component1 == e.START) && booleanValue) {
                        return;
                    }
                }
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                this.q.a((Effect) data, (IUpdateTagListener) b.f136630a);
                com.ss.android.ugc.aweme.sticker.d.d dVar = this.p;
                com.ss.android.ugc.aweme.sticker.d.b.a aVar3 = com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK;
                if (z4) {
                    effect = a(fVar);
                } else {
                    effect = null;
                }
                dVar.a(com.ss.android.ugc.aweme.sticker.f.a.a(data, i2, aVar3, effect, bundle, this.f136622b, bVar, i3, false, 128));
            } else if (z2) {
                if (aVar != null) {
                    aVar.invoke();
                }
                com.ss.android.ugc.aweme.sticker.d.d dVar2 = this.p;
                com.ss.android.ugc.aweme.sticker.d.b.a aVar4 = com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK;
                l.d(aVar4, "");
                dVar2.a(new com.ss.android.ugc.aweme.sticker.d.b.d(data, i2, aVar4, bundle));
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(Effect effect, boolean z) {
        l.d(effect, "");
        if (!z) {
            return com.ss.android.ugc.aweme.sticker.f.c.b(this.o, effect);
        }
        return com.ss.android.ugc.aweme.sticker.f.c.c(this.o, effect);
    }

    /* access modifiers changed from: protected */
    public final void a(Effect effect, com.ss.android.ugc.tools.h.a.c cVar, Integer num) {
        l.d(effect, "");
        l.d(cVar, "");
        this.r.a(effect, cVar, num, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseStickerListViewModel(m mVar, o oVar, com.ss.android.ugc.aweme.sticker.d.d dVar, g gVar, f fVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(dVar, "");
        l.d(gVar, "");
        l.d(fVar, "");
        this.o = oVar;
        this.p = dVar;
        this.q = gVar;
        this.r = fVar;
    }
}
