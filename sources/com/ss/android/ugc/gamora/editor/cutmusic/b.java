package com.ss.android.ugc.gamora.editor.cutmusic;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.scene.ktx.c;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.df.r;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.gamora.editor.cutmusic.c;
import com.ss.android.ugc.gamora.editor.s;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.reflect.Type;

public final class b extends com.bytedance.ui_component.b<EditMusicCutViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f145755a;

    /* renamed from: b  reason: collision with root package name */
    public final int f145756b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h f145757c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditMusicCutViewModel> f145758d = C3882b.f145760a;

    /* renamed from: e  reason: collision with root package name */
    private final f f145759e;

    static {
        Covode.recordClassIndex(95756);
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditMusicCutViewModel> b() {
        return this.f145758d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f145755a;
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f145759e;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.cutmusic.b$b  reason: collision with other inner class name */
    static final class C3882b extends m implements h.f.a.a<EditMusicCutViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3882b f145760a = new C3882b();

        static {
            Covode.recordClassIndex(95758);
        }

        C3882b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditMusicCutViewModel invoke() {
            return new EditMusicCutViewModel();
        }
    }

    static final class a extends m implements h.f.a.a<c> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(95757);
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
            this.this$0.f145755a.a(this.this$0.f145756b, cVar, "EditMusicCutScene");
            s sVar = (s) cVar.getDiContainer().a((Type) s.class, (String) null);
            l.d(sVar, "");
            cVar.f145768h = sVar;
            return cVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        boolean z;
        c cVar = (c) this.f145757c.getValue();
        if (cVar.a().mMusicPath != null && !cVar.a().isStickPointMode) {
            cVar.b().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            if (cVar.a().hasOriginalSound()) {
                com.ss.android.ugc.aweme.shortvideo.preview.a b2 = cVar.b();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                l.b(ofVoice, "");
                b2.a(ofVoice);
            }
            cVar.u = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(cVar.a().mMusicPath);
            TextView textView = cVar.f145765e;
            if (textView == null) {
                l.a("mTextViewTotalTime");
            }
            textView.setText(r.a(cVar.u));
            cVar.f145770j = cVar.a().mMusicStart;
            cVar.f145771k = cVar.f145770j;
            Boolean bool = cVar.a().isSoundLoop;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            cVar.f145772l = z;
            cVar.t = cVar.f145772l;
            c.a(cVar, new c.q(cVar));
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
        this.f145759e = fVar;
        this.f145755a = bVar;
    }
}
