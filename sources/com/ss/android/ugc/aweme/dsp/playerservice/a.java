package com.ss.android.ugc.aweme.dsp.playerservice;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.s;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.f.c;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements s, i, j {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.f.b f83361a = new com.ss.android.ugc.aweme.dsp.playerservice.f.b();

    /* renamed from: b  reason: collision with root package name */
    public final c f83362b = new c();

    /* renamed from: c  reason: collision with root package name */
    public int f83363c;

    static {
        Covode.recordClassIndex(52010);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(200, new g(a.class, "onMusicDspTabChangeEvent", com.ss.android.ugc.aweme.dsp.a.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        this.f83361a.bc_();
        this.f83362b.bc_();
        cg.b(this);
    }

    private final void e() {
        this.f83361a.a(new C1963a(this));
        this.f83362b.a(new b(this));
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        this.f83361a.bb_();
        this.f83362b.bb_();
        e();
        cg.a(this);
    }

    public final void a() {
        this.f83363c++;
        String.valueOf("onAttach " + this.f83363c + ' ' + this);
        if (this.f83363c <= 1) {
            bb_();
        }
    }

    public final void b() {
        this.f83363c--;
        String.valueOf("onDetach " + this.f83363c + ' ' + this);
        if (this.f83363c <= 0) {
            bc_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.a$a  reason: collision with other inner class name */
    public static final class C1963a implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83364a;

        static {
            Covode.recordClassIndex(52011);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final com.ss.android.ugc.aweme.dsp.playerservice.b.c a_(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
            return cVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean a_(long j2) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean c(f fVar) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean d(f fVar) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C1963a(a aVar) {
            this.f83364a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean a(f fVar) {
            if (this.f83364a.f83362b.f83565a.e().isStopState()) {
                return false;
            }
            this.f83364a.f83362b.h(new f("STOP_FROM_MAIN_PLAYER"));
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean b(f fVar) {
            if (this.f83364a.f83362b.f83565a.e().isStopState()) {
                return false;
            }
            this.f83364a.f83362b.h(new f("STOP_FROM_MAIN_PLAYER"));
            return false;
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f83365a;

        static {
            Covode.recordClassIndex(52012);
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final com.ss.android.ugc.aweme.dsp.playerservice.b.c a_(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
            return cVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean a_(long j2) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean b(f fVar) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean c(f fVar) {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean d(f fVar) {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f83365a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
        public final boolean a(f fVar) {
            if (!this.f83365a.f83361a.f83565a.e().startPlaying()) {
                return false;
            }
            this.f83365a.f83361a.f(new f("PAUSE_FROM_SUB_PLAYER"));
            return false;
        }
    }

    @r
    public final void onMusicDspTabChangeEvent(com.ss.android.ugc.aweme.dsp.a.a aVar) {
        l.d(aVar, "");
        if (l.a((Object) aVar.f83239c, (Object) "Daily Mix") && !this.f83362b.f83565a.e().startPlaying() && !this.f83362b.f83565a.k() && !com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b() && !this.f83361a.f83565a.e().startPlaying() && !this.f83361a.f83565a.k() && this.f83361a.f83565a.e().isPauseState()) {
            this.f83361a.g(new f("RESUME_FROM_DSP_TAB_CHANGE"));
        }
    }
}
