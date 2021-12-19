package com.ss.android.ugc.aweme.ftc.components.cutmusic;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.ktx.c;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.df.r;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.c;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.gamora.editor.s;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<FTCEditMusicCutViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f97774a;

    /* renamed from: b  reason: collision with root package name */
    public final int f97775b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f97776c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<FTCEditMusicCutViewModel> f97777d = C2361b.f97779a;

    /* renamed from: e  reason: collision with root package name */
    private final f f97778e;

    static {
        Covode.recordClassIndex(62135);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<FTCEditMusicCutViewModel> b() {
        return this.f97777d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f97774a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f97778e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.cutmusic.b$b  reason: collision with other inner class name */
    static final class C2361b extends m implements h.f.a.a<FTCEditMusicCutViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2361b f97779a = new C2361b();

        static {
            Covode.recordClassIndex(62137);
        }

        C2361b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FTCEditMusicCutViewModel invoke() {
            return new FTCEditMusicCutViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(62136);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            c cVar = new c(this.this$0.getDiContainer());
            s sVar = (s) cVar.getDiContainer().a((Type) s.class, (String) null);
            l.d(sVar, "");
            cVar.f97786g = sVar;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) cVar.getDiContainer().a((Type) VideoPublishEditModel.class, (String) null);
            l.d(videoPublishEditModel, "");
            cVar.f97787h = videoPublishEditModel;
            this.this$0.f97774a.a(this.this$0.f97775b, cVar, "FTCEditMusicCutScene");
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        boolean z;
        c cVar = (c) this.f97776c.getValue();
        VideoPublishEditModel videoPublishEditModel = cVar.f97787h;
        if (videoPublishEditModel == null) {
            l.a("mModel");
        }
        if (videoPublishEditModel.mMusicPath != null && !videoPublishEditModel.isStickPointMode) {
            cVar.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            if (videoPublishEditModel.hasOriginalSound()) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = cVar.b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                l.b(ofVoice, "");
                b2.a(ofVoice);
            }
            cVar.u = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(videoPublishEditModel.mMusicPath);
            TextView textView = cVar.f97783d;
            if (textView == null) {
                l.a("mTextViewTotalTime");
            }
            textView.setText(r.a(cVar.u));
            cVar.f97789j = videoPublishEditModel.mMusicStart;
            cVar.f97790k = cVar.f97789j;
            Boolean bool = videoPublishEditModel.isSoundLoop;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            cVar.f97791l = z;
            cVar.t = cVar.f97791l;
            c.a(cVar, new c.p(cVar));
            if (!cVar.C) {
                cVar.a(true);
            }
            g value = cVar.b().C().getValue();
            if (value == null) {
                l.b();
            }
            int a2 = value.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek, cVar.A);
            if (a2 != 0) {
                bj.b("cutMusic seek error: ".concat(String.valueOf(a2)));
            }
            com.ss.android.ugc.tools.view.a.c cVar2 = cVar.x;
            if (cVar2 != null) {
                cVar2.b(cVar.B);
            }
        }
    }

    public b(f fVar, com.bytedance.scene.group.b bVar) {
        l.d(fVar, "");
        l.d(bVar, "");
        this.f97778e = fVar;
        this.f97774a = bVar;
    }
}
