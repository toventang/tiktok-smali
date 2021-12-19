package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.bt;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.w;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.x;
import java.util.List;

final /* synthetic */ class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f97887a;

    static {
        Covode.recordClassIndex(62214);
    }

    v(f fVar) {
        this.f97887a = fVar;
    }

    public final void run() {
        f fVar = this.f97887a;
        int frameHeight = fVar.w.getFrameHeight();
        int frameWidth = fVar.w.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (n.a(fVar.L) - (Math.round(n.b(fVar.L, 24.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        fVar.w.setCoverSize(ceil);
        fVar.z = new VEVideoCoverGeneratorImpl(fVar.A, fVar.L, fVar.w.getCoverSize(), bt.a() ? x.a.GET_FRAMES_MODE_NORMAL : x.a.GET_FRAMES_MODE_NOEFFECT, "special_effects");
        fVar.C = new p(fVar.z, frameWidth, frameHeight, ceil);
        if (fVar.f97849b.isMvThemeVideoType()) {
            a aVar = new a(frameWidth, frameHeight);
            fVar.w.setAdapter(aVar);
            c cVar = new c();
            cVar.f128780b = ac.f97813a;
            cVar.f128791m = fVar.U;
            cVar.f128790l = fVar.T;
            cVar.a(frameWidth, frameHeight).a(fVar.L, fVar.A, ceil, new ae(aVar));
            fVar.w.setAdapter(aVar);
            return;
        }
        fVar.w.setAdapter(new ChooseVideoCoverView.a(fVar.C, frameWidth, frameHeight));
        if (fVar.A == null) {
            g.a().I().a("VEEffectHelper activity is finishing " + fVar.L.isFinishing());
            return;
        }
        int G = fVar.A.G();
        fVar.y = (CutMultiVideoViewModel) ae.a(fVar.L, (ad.b) null).a(CutMultiVideoViewModel.class);
        fVar.x.setCanEdit(false);
        fVar.x.setMinVideoLength(1000);
        fVar.x.setMaxVideoLength((long) G);
        fVar.y.f125336k = fVar.f97849b.isMvThemeVideoType();
        fVar.y.f125337l = G;
        q.c("initCutTimeView video duration is " + fVar.A.j());
        fVar.x.setVeEditor(fVar.A);
        List<MediaModel> mediaModelList = fVar.f97849b.getMediaModelList();
        w wVar = new w();
        wVar.f126197b = false;
        wVar.a(new com.ss.android.ugc.aweme.effect.c.b.c(fVar.L, new r(fVar), new t(fVar), new u(fVar)));
        fVar.x.setViewConfig(wVar);
        fVar.x.a(fVar.L, fVar.y, fVar.C, mediaModelList);
        fVar.x.setPointerType(2);
        fVar.x.getVideoEditViewModel().f126133f.observe(fVar.f97856i, new j(fVar));
        fVar.x.getVideoEditViewModel().f126138k.observe(fVar.f97856i, new k(fVar));
        fVar.x.getVideoEditViewModel().f126136i.observe(fVar.f97856i, new l(fVar));
        fVar.x.getVideoEditViewModel().f126137j.observe(fVar.f97856i, new m(fVar));
        fVar.x.getVideoEditViewModel().f126134g.observe(fVar.f97856i, new n(fVar));
        fVar.x.getVideoEditViewModel().f126135h.observe(fVar.f97856i, new o(fVar));
        fVar.x.getVideoEditViewModel().f126130c.observe(fVar.f97856i, new p(fVar));
        fVar.x.getVideoEditViewModel().f126132e.observe(fVar.f97856i, new q(fVar));
        fVar.O.a(G);
    }
}
