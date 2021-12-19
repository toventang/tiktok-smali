package com.ss.android.ugc.aweme.sticker.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.g.c;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.handler.f;
import com.ss.android.ugc.aweme.sticker.presenter.i;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.tools.utils.d;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import java.util.List;
import java.util.Map;

public final class e {
    static {
        Covode.recordClassIndex(88150);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134839a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f134840b;

        static {
            Covode.recordClassIndex(88151);
        }

        a(i iVar, Effect effect) {
            this.f134839a = iVar;
            this.f134840b = effect;
        }

        public final void run() {
            Effect effect = this.f134840b;
            if (effect == null) {
                e.a(this.f134839a, a.a(com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET));
            } else {
                e.a(this.f134839a, a.a(effect, -1, com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET, null, null, null, null, 0, false, 252));
            }
        }
    }

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.sticker.presenter.handler.m, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134841a = new b();

        static {
            Covode.recordClassIndex(88152);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sticker.presenter.handler.m mVar) {
            l.d(mVar, "");
            return Boolean.valueOf(mVar instanceof f);
        }
    }

    public static final Effect a(i iVar) {
        l.d(iVar, "");
        return iVar.t().f();
    }

    public static final void b(i iVar) {
        l.d(iVar, "");
        iVar.u().a(a.a(com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET));
    }

    public static final boolean c(i iVar) {
        l.d(iVar, "");
        com.ss.android.ugc.aweme.sticker.panel.i v = iVar.v();
        if (v == null || !v.d()) {
            return false;
        }
        return true;
    }

    public static final class c implements IFetchEffectListByIdsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134842a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f134843b = null;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f134844c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Effect f134845d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f134846e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c.a f134847f;

        static {
            Covode.recordClassIndex(88153);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener
        public final void onFail(ExceptionResult exceptionResult) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectListResponse effectListResponse) {
            List<Effect> data;
            com.ss.ugc.effectplatform.model.Effect effect;
            int i2;
            EffectListResponse effectListResponse2 = effectListResponse;
            if (effectListResponse2 != null && (data = effectListResponse2.getData()) != null && (effect = (com.ss.ugc.effectplatform.model.Effect) n.h((List) data)) != null && !d.a(effect.getChildren())) {
                if (!d.a(effectListResponse2.getCollection())) {
                    this.f134842a.t().c().j().a(effectListResponse2.getCollection());
                }
                if (!d.a(effectListResponse2.getBindEffects())) {
                    this.f134842a.t().c().j().b(effectListResponse2.getBindEffects());
                }
                com.ss.android.ugc.aweme.sticker.d.d u = this.f134842a.u();
                Effect effect2 = this.f134845d;
                if (this.f134846e) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                u.a(a.a(effect2, i2, com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET, null, null, this.f134847f, null, 0, false, 236));
            }
        }

        c(i iVar, List list, Effect effect, boolean z, c.a aVar) {
            this.f134842a = iVar;
            this.f134844c = list;
            this.f134845d = effect;
            this.f134846e = z;
            this.f134847f = aVar;
        }
    }

    public static final void a(i iVar, com.ss.android.ugc.aweme.sticker.d.b.b<?> bVar) {
        l.d(iVar, "");
        l.d(bVar, "");
        iVar.u().a(bVar);
    }

    public static final void a(i iVar, Effect effect) {
        l.d(iVar, "");
        iVar.x().post(new a(iVar, effect));
    }

    public static final void a(i iVar, List<? extends Effect> list) {
        l.d(iVar, "");
        if (list != null) {
            iVar.t().c().j().a(list);
        }
    }

    public static final void a(i iVar, List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        l.d(iVar, "");
        l.d(list, "");
        iVar.t().a(list, map, iFetchEffectListByIdsListener);
    }

    public static /* synthetic */ void a(i iVar, List list, boolean z, boolean z2, c.a aVar, int i2, Effect effect, int i3) {
        int i4;
        int i5;
        int i6;
        com.ss.android.ugc.aweme.sticker.panel.a.b c2;
        c.a aVar2 = aVar;
        int i7 = i2;
        Effect effect2 = effect;
        if ((i3 & 16) != 0) {
            aVar2 = null;
        }
        if ((i3 & 32) != 0) {
            i7 = c.a(iVar.t());
        }
        if ((i3 & 128) != 0) {
            effect2 = (Effect) n.h(list);
        }
        l.d(iVar, "");
        l.d(list, "");
        if (!list.isEmpty()) {
            if (z) {
                iVar.t().a(i7, list);
            }
            if (z2 && effect2 != null) {
                com.ss.android.ugc.aweme.sticker.panel.i v = iVar.v();
                if (!(v == null || (c2 = v.c()) == null)) {
                    c2.a(new com.ss.android.ugc.aweme.sticker.panel.a.e(i7, effect2));
                }
                iVar.t().a(i7);
                if (g.a(effect2)) {
                    com.ss.android.ugc.aweme.sticker.d.d u = iVar.u();
                    if (z) {
                        i6 = 1;
                    } else {
                        i6 = -1;
                    }
                    u.a(a.a(effect2, i6, com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET, null, null, aVar2, null, 0, false, 236));
                    return;
                }
                String parentId = effect2.getParentId();
                if (!(parentId == null || parentId.length() == 0)) {
                    iVar.t().b(effect2);
                }
                if (!iVar.t().a() || g.t(effect2)) {
                    g.t(effect2);
                    com.ss.android.ugc.aweme.sticker.d.d u2 = iVar.u();
                    if (z) {
                        i4 = 1;
                    } else {
                        i4 = -1;
                    }
                    u2.a(a.a(effect2, i4, com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET, null, null, aVar2, null, 0, false, 236));
                    return;
                }
                String parentId2 = effect2.getParentId();
                if (parentId2 == null || parentId2.length() == 0) {
                    com.ss.android.ugc.aweme.sticker.d.d u3 = iVar.u();
                    if (z) {
                        i5 = 1;
                    } else {
                        i5 = -1;
                    }
                    u3.a(a.a(effect2, i5, com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET, null, null, aVar2, null, 0, false, 236));
                    return;
                }
                String parentId3 = effect2.getParentId();
                if (parentId3 == null) {
                    l.b();
                }
                a(iVar, n.a(parentId3), null, new c(iVar, list, effect2, z, aVar2));
            }
        }
    }
}
