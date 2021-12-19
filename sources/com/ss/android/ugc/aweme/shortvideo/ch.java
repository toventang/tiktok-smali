package com.ss.android.ugc.aweme.shortvideo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import com.bytedance.als.dsl.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.d;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.o.f;
import com.bytedance.scene.t;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.shortvideo.ui.n;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.gamora.recorder.b.j;
import com.ss.android.ugc.gamora.recorder.n.a.h;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class ch extends dc implements com.ss.android.ugc.tools.view.a.b {

    /* renamed from: b  reason: collision with root package name */
    public View f125123b;

    /* renamed from: c  reason: collision with root package name */
    public ShortVideoContext f125124c;

    /* renamed from: f  reason: collision with root package name */
    private final d f125125f;

    /* renamed from: g  reason: collision with root package name */
    private f f125126g;

    /* renamed from: h  reason: collision with root package name */
    private a f125127h;

    /* renamed from: i  reason: collision with root package name */
    private f f125128i;

    public interface a {
        static {
            Covode.recordClassIndex(82184);
        }

        void a(com.bytedance.scene.group.b bVar);
    }

    static {
        Covode.recordClassIndex(82183);
    }

    private com.ss.android.ugc.aweme.shortvideo.h.a I() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) E().b(com.ss.android.ugc.aweme.shortvideo.h.a.class, null);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.dc
    public final f E() {
        if (this.f125126g == null) {
            this.f125126g = c.b(this);
        }
        return this.f125126g;
    }

    @Override // com.bytedance.scene.j
    public final void n() {
        super.n();
        com.ss.android.ugc.aweme.mediachoose.helper.c.a(u(), as.a());
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        super.o();
        ((com.ss.android.ugc.tools.view.a.c) t()).b(this);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        b.a.f132249a.end(CameraFirstFramePerformanceMonitor.f132343a, "PlanC onResume");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(com.ss.android.ugc.aweme.shortvideo.ui.task.d.RECORD_ON_UI_SHOW);
    }

    public final boolean F() {
        j jVar;
        if (getLifecycle().a().isAtLeast(i.b.CREATED) && (jVar = (j) a("RecordBottomTabScene")) != null) {
            TabHost tabHost = jVar.f147472a;
            if (tabHost == null) {
                l.a("tabHost");
            }
            TabHost tabHost2 = jVar.f147472a;
            if (tabHost2 == null) {
                l.a("tabHost");
            }
            if (TextUtils.equals((CharSequence) tabHost.a(tabHost2.getCurrentIndex()), c_(R.string.f_b))) {
                return true;
            }
        }
        return false;
    }

    class b implements com.bytedance.scene.navigation.c {
        static {
            Covode.recordClassIndex(82185);
        }

        b() {
        }

        @Override // com.bytedance.scene.navigation.c
        public final void a(com.bytedance.scene.j jVar, com.bytedance.scene.j jVar2, boolean z) {
            if (z) {
                if (jVar2 instanceof h) {
                    com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = true;
                    ch.this.b(R.id.dj9).setVisibility(8);
                    ch.this.f125123b.setVisibility(8);
                    com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = false;
                }
            } else if (jVar instanceof h) {
                com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = true;
                ch.this.f125123b.setVisibility(0);
                ch.this.b(R.id.dj9).setVisibility(0);
                com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = false;
            }
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.h.a I = I();
        if (I != null) {
            I.c(z);
        }
    }

    public final void a(boolean z) {
        com.ss.android.ugc.aweme.shortvideo.h.a I = I();
        if (I != null) {
            I.d(z);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        String str;
        super.a(bundle);
        t B = com.bytedance.scene.ktx.b.b(this).B();
        com.ss.android.ugc.gamora.a.a aVar = new com.ss.android.ugc.gamora.a.a();
        aVar.a(this);
        aVar.a((e) this.f42913m);
        aVar.a(G().f124769a);
        aVar.a(((d) H().a(d.class, (String) null)).D().getMediaController());
        aVar.a((d) H().a(d.class, (String) null));
        aVar.a((m) H().a(m.class, (String) null));
        aVar.a(new h.h<com.ss.android.ugc.gamora.recorder.sticker.c.j>() {
            /* class com.ss.android.ugc.aweme.shortvideo.dc.AnonymousClass1 */

            static {
                Covode.recordClassIndex(82948);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.h
            public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.j getValue() {
                return dc.this.H().b(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, null);
            }

            @Override // h.h
            public final boolean isInitialized() {
                if (dc.this.H().b(com.ss.android.ugc.gamora.recorder.sticker.c.j.class, null) != null) {
                    return true;
                }
                return false;
            }
        });
        aVar.a((com.bytedance.creativex.recorder.a.a.a) H().a(com.bytedance.creativex.recorder.a.a.a.class, (String) null));
        aVar.a((com.bytedance.creativex.recorder.filter.a.a) H().a(com.bytedance.creativex.recorder.filter.a.a.class, (String) null));
        aVar.a(((z) H().a(z.class, (String) null)).aq());
        if (this.f42913m instanceof n) {
            str = ((n) this.f42913m).m();
        } else {
            str = "";
        }
        aVar.a(str);
        B.a("record_env_context", aVar);
        com.bytedance.scene.ktx.b.b(this).a(this, new b());
        this.f125127h.a(this);
        if (!com.ss.android.ugc.aweme.port.in.c.s.a() && !this.f125124c.c()) {
            ((com.ss.android.ugc.gamora.recorder.b.b) E().a(com.ss.android.ugc.gamora.recorder.b.b.class, (String) null)).showBottomTab(false);
        }
        ((com.ss.android.ugc.aweme.adaptation.h) t()).cu_();
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        bj.a("planC => onCreateView start");
        FrameLayout frameLayout = (FrameLayout) com.a.a(layoutInflater, R.layout.a1n, viewGroup, false);
        this.f125123b = frameLayout.findViewById(R.id.dqn);
        ((com.ss.android.ugc.tools.view.a.c) this.f42913m).a(this);
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new dmt.av.video.f.c());
        b.a.f132249a.step("av_video_record_init", "PlanC onCreateView");
        bj.a("planC => onCreateView end");
        return frameLayout;
    }

    @Override // com.ss.android.ugc.tools.view.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        com.ss.android.ugc.aweme.shortvideo.h.a I = I();
        if (I == null) {
            return false;
        }
        I.a(i2, i3, intent);
        return false;
    }

    public ch(ShortVideoContext shortVideoContext, Intent intent, f fVar, a aVar) {
        this.f125124c = shortVideoContext;
        this.f125125f = (d) fVar.a(d.class, (String) null);
        this.f125128i = fVar;
        this.f125127h = aVar;
        Bundle a2 = a(intent);
        if (a2 != null) {
            this.r = a2;
        }
    }
}
