package com.ss.android.ugc.aweme.dsp.playerservice.plugin;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.TTDspViewModel;
import com.ss.android.ugc.aweme.dsp.playerservice.a.d;
import com.ss.android.ugc.aweme.dsp.playerservice.a.h;
import com.ss.android.ugc.aweme.dsp.playerservice.a.m;
import com.ss.android.ugc.aweme.dsp.playerservice.b.f;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b;
import com.ss.android.ugc.aweme.dsp.playpage.subpage.SubPlayerActivity;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.cg;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a implements h, m, ActivityStack.b, i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final C1983a f83570c = new C1983a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final String f83571h = a.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public d f83572a;

    /* renamed from: b  reason: collision with root package name */
    public String f83573b = "MUSIC_DSP";

    /* renamed from: d  reason: collision with root package name */
    private boolean f83574d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<com.ss.android.ugc.aweme.dsp.playerservice.a.a> f83575e = new com.ss.android.ugc.aweme.dsp.playerservice.d.d.a<>();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f83576f = true;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f83577g = h.i.a((h.f.a.a) new c(this));

    private final c.AnonymousClass1 e() {
        return (c.AnonymousClass1) this.f83577g.getValue();
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

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(44, new g(a.class, "onTabChangeEvent", com.ss.android.ugc.aweme.ug.guide.m.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.dsp.playerservice.plugin.a$a  reason: collision with other inner class name */
    public static final class C1983a {
        static {
            Covode.recordClassIndex(52158);
        }

        private C1983a() {
        }

        public /* synthetic */ C1983a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(52160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new Application.ActivityLifecycleCallbacks(this) {
                /* class com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f83590a;

                static {
                    Covode.recordClassIndex(52161);
                }

                public final void onActivityDestroyed(Activity activity) {
                    l.d(activity, "");
                }

                public final void onActivityPaused(Activity activity) {
                    l.d(activity, "");
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    l.d(activity, "");
                    l.d(bundle, "");
                }

                public final void onActivityStopped(Activity activity) {
                    l.d(activity, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f83590a = r1;
                }

                public final void onActivityResumed(Activity activity) {
                    l.d(activity, "");
                    if (!com.ss.android.ugc.aweme.dsp.common.b.c.a(activity) || !l.a((Object) this.f83590a.this$0.f83573b, (Object) "MUSIC_DSP")) {
                        this.f83590a.this$0.a(false, new f("PAUSE_FROM_ON_PAUSE"));
                    } else {
                        this.f83590a.this$0.a(true, new f("RESUME_FROM_ON_RESUME"));
                    }
                }

                public final void onActivityStarted(Activity activity) {
                    l.d(activity, "");
                    if (!com.ss.android.ugc.aweme.dsp.common.b.c.a(activity) || !l.a((Object) this.f83590a.this$0.f83573b, (Object) "MUSIC_DSP")) {
                        this.f83590a.this$0.a(false, new f("PAUSE_FROM_ON_PAUSE"));
                    } else {
                        this.f83590a.this$0.a(true, new f("RESUME_FROM_ON_RESUME"));
                    }
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    l.d(activity, "");
                    if (!com.ss.android.ugc.aweme.dsp.common.b.c.a(activity) || !l.a((Object) this.f83590a.this$0.f83573b, (Object) "MUSIC_DSP")) {
                        this.f83590a.this$0.a(false, new f("PAUSE_FROM_ON_PAUSE"));
                    } else {
                        this.f83590a.this$0.a(true, new f("RESUME_FROM_ON_RESUME"));
                    }
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void a() {
        a(true);
    }

    @Override // com.ss.android.ugc.aweme.utils.ActivityStack.b
    public final void b() {
        a(false);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final d v() {
        d dVar = this.f83572a;
        if (dVar == null) {
            l.a("mMediaPlayerService");
        }
        return dVar;
    }

    static {
        Covode.recordClassIndex(52157);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bb_() {
        v().a((h) this);
        ActivityStack.addAppBackGroundListener(this);
        com.bytedance.ies.ugc.appcontext.g.a().registerActivityLifecycleCallbacks(e());
        cg.a(this);
    }

    private final boolean f() {
        com.ss.android.ugc.aweme.dsp.playerservice.b.c n;
        if (!b.b() || (n = v().n()) == null || com.ss.android.ugc.aweme.dsp.b.b.a(n.a(), v())) {
            return false;
        }
        if (!ActivityStack.isAppBackGround() || b.f83579a.f83374e) {
            return true;
        }
        com.ss.android.ugc.aweme.dsp.b.a.a();
        b.c();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.s
    public final void bc_() {
        v().b(this);
        ActivityStack.removeAppBackGroundListener(this);
        com.bytedance.ies.ugc.appcontext.g.a().unregisterActivityLifecycleCallbacks(e());
        cg.b(this);
        this.f83575e.f83515a.clear();
    }

    public final void a(com.ss.android.ugc.aweme.dsp.playerservice.a.a aVar) {
        l.d(aVar, "");
        this.f83575e.a(aVar);
    }

    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.a.a aVar) {
        l.d(aVar, "");
        this.f83575e.b(aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.dsp.playerservice.a.a, z> {
        final /* synthetic */ boolean $isActive;
        final /* synthetic */ f $operation;

        static {
            Covode.recordClassIndex(52159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z, f fVar) {
            super(1);
            this.$isActive = z;
            this.$operation = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.dsp.playerservice.a.a aVar) {
            com.ss.android.ugc.aweme.dsp.playerservice.a.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.a(this.$isActive, this.$operation);
            return z.f158842a;
        }
    }

    private static String a(e eVar) {
        if (eVar instanceof SubPlayerActivity) {
            return "dsp_player";
        }
        String b2 = TTDspViewModel.a.a(eVar).b();
        if (b2 == null) {
            return "track_reco";
        }
        return b2;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean b(f fVar) {
        if (f()) {
            return true;
        }
        if (this.f83576f) {
            return false;
        }
        this.f83574d = true;
        return true;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.m
    public final void a(d dVar) {
        l.d(dVar, "");
        this.f83572a = dVar;
    }

    @r
    public final void onTabChangeEvent(com.ss.android.ugc.aweme.ug.guide.m mVar) {
        l.d(mVar, "");
        if (l.a((Object) mVar.f141945b, (Object) "MUSIC_DSP")) {
            a(true, new f("RESUME_FROM_CHANGE_TAB"));
        } else {
            a(false, new f("PAUSE_FROM_CHANGE_TAB"));
        }
        this.f83573b = mVar.f141945b;
        String.valueOf("onTabChangeEvent " + mVar.f141945b);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(boolean r6) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.a(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.dsp.playerservice.a.h
    public final boolean a(f fVar) {
        if (f()) {
            return true;
        }
        if (this.f83576f) {
            return false;
        }
        this.f83574d = true;
        return true;
    }

    public final void a(boolean z, f fVar) {
        if (this.f83576f != z) {
            this.f83576f = z;
            if (z) {
                if (this.f83574d) {
                    com.ss.android.ugc.aweme.dsp.playerservice.c.f e2 = v().e();
                    if (e2.isPauseState()) {
                        v().g(fVar);
                    } else if (e2.isStopState()) {
                        v().e(fVar);
                    }
                    this.f83574d = false;
                }
            } else if (v().e().startPlaying() || v().k()) {
                v().f(fVar);
                this.f83574d = true;
            }
            this.f83575e.a(new b(z, fVar));
        }
    }
}
