package com.ss.android.ugc.aweme.sticker.presenter.handler;

import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.panel.guide.i;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.d;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.z;

public final class n implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final a f135402b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final i f135403a;

    /* renamed from: c  reason: collision with root package name */
    private SafeHandler f135404c;

    /* renamed from: d  reason: collision with root package name */
    private Effect f135405d;

    /* renamed from: e  reason: collision with root package name */
    private final m f135406e;

    /* renamed from: f  reason: collision with root package name */
    private final o f135407f;

    /* renamed from: g  reason: collision with root package name */
    private final h.f.a.b<Effect, z> f135408g;

    static {
        Covode.recordClassIndex(88452);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(88453);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f135409a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m.a f135410b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f135411c;

        static {
            Covode.recordClassIndex(88454);
        }

        b(n nVar, m.a aVar, c cVar) {
            this.f135409a = nVar;
            this.f135410b = aVar;
            this.f135411c = cVar;
        }

        public final void run() {
            this.f135409a.f135403a.hideNotice();
            this.f135410b.a(this.f135411c);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final com.ss.android.ugc.aweme.sticker.presenter.handler.c.b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        if (this.f135407f.a()) {
            return aVar.a(cVar);
        }
        boolean z = cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
        if (z) {
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar2 = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar;
            if (aVar2.f135380c != com.ss.android.ugc.aweme.sticker.d.b.a.RECOVER) {
                Effect effect = aVar2.f135378a;
                if (effect == null || l.a(effect, this.f135405d) || g.a(effect)) {
                    return aVar.a(cVar);
                }
                this.f135405d = effect;
                this.f135404c.removeCallbacksAndMessages(null);
                this.f135403a.hideNotice();
                if (!g.D(effect)) {
                    return aVar.a(cVar);
                }
                this.f135408g.invoke(effect);
                this.f135403a.hide();
                this.f135403a.b(effect);
                this.f135404c.postDelayed(new b(this, aVar, cVar), 3000);
                return new com.ss.android.ugc.aweme.sticker.presenter.handler.c.b(-1);
            }
        }
        boolean z2 = cVar instanceof d;
        if (z2 || (z && ((com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar).f135380c == com.ss.android.ugc.aweme.sticker.d.b.a.RECOVER)) {
            this.f135404c.removeCallbacksAndMessages(null);
            this.f135403a.hideNotice();
            this.f135403a.hide();
            if (!z2 ? !(!z || ((com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar).f135380c != com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK) : ((d) cVar).f135386c == com.ss.android.ugc.aweme.sticker.d.b.a.UI_CLICK) {
                this.f135403a.a();
            }
            this.f135405d = null;
        }
        return aVar.a(cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.effectmanager.effect.model.Effect, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public n(androidx.lifecycle.m mVar, o oVar, i iVar, h.f.a.b<? super Effect, z> bVar) {
        l.d(mVar, "");
        l.d(oVar, "");
        l.d(iVar, "");
        l.d(bVar, "");
        this.f135406e = mVar;
        this.f135407f = oVar;
        this.f135403a = iVar;
        this.f135408g = bVar;
        this.f135404c = new SafeHandler(mVar);
    }
}
