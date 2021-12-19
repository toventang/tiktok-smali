package com.ss.android.ugc.aweme.feed.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.n;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.simplayer.f;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.o;
import h.r;
import h.z;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bz;

public final class a implements com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c {

    /* renamed from: a  reason: collision with root package name */
    public o f92886a;

    static {
        Covode.recordClassIndex(58922);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long d() {
        return -1;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long e() {
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.a
    public final void a() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.k
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c g() {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    public final o h() {
        o oVar = this.f92886a;
        if (oVar == null) {
            l.a("playerController");
        }
        return oVar;
    }

    public final boolean i() {
        if (this.f92886a != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long c() {
        o oVar = this.f92886a;
        if (oVar == null) {
            l.a("playerController");
        }
        i M = oVar.M();
        l.b(M, "");
        return M.n();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final long f() {
        o oVar = this.f92886a;
        if (oVar == null) {
            l.a("playerController");
        }
        i M = oVar.M();
        l.b(M, "");
        return h.g.a.b((double) M.i());
    }

    public final void k() {
        String str;
        if (i()) {
            o oVar = this.f92886a;
            if (oVar == null) {
                l.a("playerController");
            }
            Aweme I = oVar.I();
            o oVar2 = this.f92886a;
            if (oVar2 == null) {
                l.a("playerController");
            }
            al s = oVar2.s();
            if (s != null) {
                str = s.a_(true);
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.feed.helper.a.a(I, str);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o b() {
        o oVar = this.f92886a;
        if (oVar == null) {
            l.a("playerController");
        }
        i M = oVar.M();
        l.b(M, "");
        f L = M.L();
        l.b(L, "");
        f.c j2 = L.j();
        l.b(j2, "");
        switch (j2.b()) {
            case 0:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_PAUSED;
            case 1:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_START;
            case 2:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_START;
            case 3:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_START;
            case 4:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_PLAYING;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_PAUSED;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_PAUSED;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_STOPPED;
            default:
                return com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o.PLAYBACK_STATE_ERROR;
        }
    }

    public final void j() {
        String str;
        if (i() && com.ss.android.ugc.aweme.feed.experiment.c.b()) {
            o oVar = this.f92886a;
            if (oVar == null) {
                l.a("playerController");
            }
            Aweme I = oVar.I();
            o oVar2 = this.f92886a;
            if (oVar2 == null) {
                l.a("playerController");
            }
            al s = oVar2.s();
            if (s != null) {
                str = s.a_(true);
            } else {
                str = null;
            }
            if (I != null && str != null && com.ss.android.ugc.aweme.feed.experiment.c.b() && com.ss.android.ugc.aweme.feed.helper.a.a(I)) {
                com.ss.android.ugc.aweme.feed.helper.a.a(I, str, "enter_background");
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void e(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        bz unused = kotlinx.coroutines.i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new c(this, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.e.a$a  reason: collision with other inner class name */
    static final class C2259a extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2259a(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2259a(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C2259a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                if (this.this$0.i()) {
                    this.this$0.h().M().B();
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class b extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                if (this.this$0.i()) {
                    this.this$0.h().M().y();
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static final class c extends k implements m<am, d<? super z>, Object> {
        int label;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(58925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, d dVar) {
            super(2, dVar);
            this.this$0 = aVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                if (this.this$0.i()) {
                    this.this$0.h().M().y();
                }
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.j
    public final void a(com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.i iVar) {
        l.d(iVar, "");
        l.c(iVar, "");
        l.c(iVar, "");
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void f(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        if (i()) {
            o oVar = this.f92886a;
            if (oVar == null) {
                l.a("playerController");
            }
            oVar.M().z();
            k();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void a(n nVar) {
        throw new o("An operation is not implemented: ".concat("Not yet implemented"));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void c(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        String str;
        if (i()) {
            o oVar = this.f92886a;
            if (oVar == null) {
                l.a("playerController");
            }
            Aweme I = oVar.I();
            o oVar2 = this.f92886a;
            if (oVar2 == null) {
                l.a("playerController");
            }
            al s = oVar2.s();
            if (s != null) {
                str = s.a_(true);
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.feed.helper.a.a();
            if (!(I == null || str == null)) {
                com.ss.android.ugc.aweme.feed.helper.a.a(I, str, "click_audio_play", (Map<String, String>) null);
            }
            if (com.bytedance.ies.ugc.appcontext.f.f34637l && !com.ss.android.ugc.aweme.feed.experiment.c.b()) {
                com.ss.android.ugc.aweme.feed.helper.a.f93313a = true;
            }
            bz unused = kotlinx.coroutines.i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new b(this, null), 3);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void d(com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.c cVar) {
        String str;
        String str2;
        if (i()) {
            if (!(cVar == null || (str = cVar.f36975a) == null)) {
                int hashCode = str.hashCode();
                if (hashCode != 270608360) {
                    if (hashCode == 1836520147) {
                        str.equals("PAUSE_FROM_LOSS_FOCUS_TRANSIENT");
                    } else if (hashCode == 2062106709 && str.equals("PAUSE_FROM_MEDIA_SESSION_CALLBACK")) {
                        o oVar = this.f92886a;
                        if (oVar == null) {
                            l.a("playerController");
                        }
                        Aweme I = oVar.I();
                        o oVar2 = this.f92886a;
                        if (oVar2 == null) {
                            l.a("playerController");
                        }
                        al s = oVar2.s();
                        if (s != null) {
                            str2 = s.a_(true);
                        } else {
                            str2 = null;
                        }
                        if (!(I == null || str2 == null)) {
                            com.ss.android.ugc.aweme.feed.helper.a.a(I, str2, "click_audio_pause", (Map<String, String>) null);
                        }
                        k();
                    }
                } else if (str.equals("PAUSE_FROM_LOSS_FOCUS")) {
                    k();
                }
            }
            bz unused = kotlinx.coroutines.i.a(an.a(kotlinx.coroutines.internal.o.f159148a), null, null, new C2259a(this, null), 3);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.c
    public final void a(long j2, com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.m mVar) {
        if (i()) {
            o oVar = this.f92886a;
            if (oVar == null) {
                l.a("playerController");
            }
            oVar.M().a((((float) j2) / -1.0f) * 100.0f);
        }
    }
}
