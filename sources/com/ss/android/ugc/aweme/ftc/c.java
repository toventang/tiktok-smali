package com.ss.android.ugc.aweme.ftc;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.j;
import com.bytedance.scene.t;
import com.ss.android.ugc.aweme.property.as;
import com.ss.android.ugc.aweme.servicimpl.PageFactoryDelegate;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.task.d;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.view.a.b;
import com.zhiliaoapp.musically.R;
import h.h;

public class c extends d implements b {

    /* renamed from: b  reason: collision with root package name */
    public View f97531b;

    /* renamed from: c  reason: collision with root package name */
    public ShortVideoContext f97532c;

    /* renamed from: f  reason: collision with root package name */
    private f f97533f;

    static {
        Covode.recordClassIndex(61966);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public LiveData<Float> getZoomEvent() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ftc.d
    public final f E() {
        if (this.f97533f == null) {
            this.f97533f = com.bytedance.als.dsl.c.b(this);
        }
        return this.f97533f;
    }

    public final com.ss.android.ugc.aweme.shortvideo.h.a F() {
        return (com.ss.android.ugc.aweme.shortvideo.h.a) E().b(com.ss.android.ugc.aweme.shortvideo.h.a.class, null);
    }

    @Override // com.bytedance.scene.j
    public final void n() {
        super.n();
        com.ss.android.ugc.aweme.mediachoose.helper.c.a(u(), as.a());
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        super.o();
        ((FTCVideoRecordNewActivity) t()).b(this);
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        b.a.f132249a.end("av_video_record_init", "PlanC onResume");
        com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(d.RECORD_ON_UI_SHOW);
    }

    class a implements com.bytedance.scene.navigation.c {
        static {
            Covode.recordClassIndex(61967);
        }

        a() {
        }

        @Override // com.bytedance.scene.navigation.c
        public final void a(j jVar, j jVar2, boolean z) {
            if (z) {
                if (jVar2 instanceof com.ss.android.ugc.aweme.ftc.l.a.f) {
                    com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = true;
                    c.this.b(R.id.dj9).setVisibility(8);
                    c.this.f97531b.setVisibility(8);
                    com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = false;
                }
            } else if (jVar instanceof com.ss.android.ugc.aweme.ftc.l.a.f) {
                com.ss.android.ugc.aweme.shortvideo.transition.a.f131085a = true;
                c.this.f97531b.setVisibility(0);
                c.this.b(R.id.dj9).setVisibility(0);
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

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        t B = com.bytedance.scene.ktx.b.b(this).B();
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = (FTCVideoRecordNewActivity) this.f42913m;
        com.ss.android.ugc.gamora.a.a aVar = new com.ss.android.ugc.gamora.a.a();
        aVar.a(this);
        aVar.a((e) this.f42913m);
        aVar.a(G().f124769a);
        aVar.a(fTCVideoRecordNewActivity.A.D().getMediaController());
        aVar.a(fTCVideoRecordNewActivity.A);
        aVar.a(fTCVideoRecordNewActivity.B);
        aVar.a(new h<com.ss.android.ugc.gamora.recorder.sticker.c.j>(fTCVideoRecordNewActivity) {
            /* class com.ss.android.ugc.aweme.ftc.d.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FTCVideoRecordNewActivity f98407a;

            static {
                Covode.recordClassIndex(62581);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.h
            public final /* synthetic */ com.ss.android.ugc.gamora.recorder.sticker.c.j getValue() {
                return this.f98407a.m();
            }

            @Override // h.h
            public final boolean isInitialized() {
                if (this.f98407a.m() != null) {
                    return true;
                }
                return false;
            }

            {
                this.f98407a = r2;
            }
        });
        aVar.a(fTCVideoRecordNewActivity.D);
        aVar.a(fTCVideoRecordNewActivity.l());
        aVar.a(fTCVideoRecordNewActivity.f97383i);
        aVar.a("VideoRecordNewActivity");
        B.a("record_env_context", aVar);
        com.bytedance.scene.ktx.b.b(this).a(this, new a());
        PageFactoryDelegate.a().a(this);
        ((com.ss.android.ugc.aweme.adaptation.h) t()).cu_();
    }

    public c(ShortVideoContext shortVideoContext, Intent intent) {
        this.f97532c = shortVideoContext;
        Bundle a2 = a(intent);
        if (a2 != null) {
            this.r = a2;
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        bj.a("planC => onCreateView start");
        FrameLayout frameLayout = (FrameLayout) com.a.a(layoutInflater, R.layout.a30, viewGroup, false);
        this.f97531b = frameLayout.findViewById(R.id.dqn);
        ((FTCVideoRecordNewActivity) this.f42913m).a(this);
        b.a.f132249a.step("av_video_record_init", "PlanC onCreateView");
        bj.a("planC => onCreateView end");
        return frameLayout;
    }

    @Override // com.ss.android.ugc.tools.view.a.b
    public final boolean a(int i2, int i3, Intent intent) {
        com.ss.android.ugc.aweme.shortvideo.h.a F = F();
        if (F == null) {
            return false;
        }
        F.a(i2, i3, intent);
        return false;
    }
}
