package com.ss.android.ugc.aweme.effect;

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

public final /* synthetic */ class at implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88819a;

    static {
        Covode.recordClassIndex(55873);
    }

    public at(ac acVar) {
        this.f88819a = acVar;
    }

    public final void run() {
        ac acVar = this.f88819a;
        int frameHeight = acVar.w.getFrameHeight();
        int frameWidth = acVar.w.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (n.a(acVar.L) - (Math.round(n.b(acVar.L, 24.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        acVar.w.setCoverSize(ceil);
        acVar.z = new VEVideoCoverGeneratorImpl(acVar.A, acVar.L, acVar.w.getCoverSize(), bt.a() ? x.a.GET_FRAMES_MODE_NORMAL : null, "special_effects");
        acVar.C = new p(acVar.z, frameWidth, frameHeight, ceil);
        if (acVar.f88779b.isMvThemeVideoType()) {
            a aVar = new a(frameWidth, frameHeight);
            acVar.w.setAdapter(aVar);
            c cVar = new c();
            cVar.f128780b = bb.f88862a;
            cVar.f128791m = acVar.U;
            cVar.f128790l = acVar.T;
            cVar.a(frameWidth, frameHeight).a(acVar.L, acVar.A, ceil, new bc(aVar));
            acVar.w.setAdapter(aVar);
        } else {
            acVar.w.setAdapter(new ChooseVideoCoverView.a(acVar.C, frameWidth, frameHeight));
        }
        if (acVar.A == null) {
            g.a().I().a("VEEffectHelper activity is finishing " + acVar.L.isFinishing());
            return;
        }
        int G = acVar.A.G();
        acVar.y = (CutMultiVideoViewModel) ae.a(acVar.L, (ad.b) null).a(CutMultiVideoViewModel.class);
        acVar.x.setCanEdit(false);
        acVar.x.setMinVideoLength(1000);
        acVar.x.setMaxVideoLength((long) G);
        acVar.y.f125336k = acVar.f88779b.isMvThemeVideoType();
        acVar.y.f125337l = G;
        q.c("initCutTimeView video duration is " + acVar.A.j());
        acVar.x.setVeEditor(acVar.A);
        List<MediaModel> mediaModelList = acVar.f88779b.getMediaModelList();
        w wVar = new w();
        wVar.f126197b = false;
        wVar.a(new com.ss.android.ugc.aweme.effect.c.b.c(acVar.L, new aq(acVar), new ar(acVar), new as(acVar)));
        acVar.x.setViewConfig(wVar);
        acVar.x.a(acVar.L, acVar.y, acVar.C, mediaModelList);
        acVar.x.setPointerType(2);
        acVar.x.getVideoEditViewModel().f126133f.observe(acVar.f88786i, new ah(acVar));
        acVar.x.getVideoEditViewModel().f126138k.observe(acVar.f88786i, new ai(acVar));
        acVar.x.getVideoEditViewModel().f126136i.observe(acVar.f88786i, new aj(acVar));
        acVar.x.getVideoEditViewModel().f126137j.observe(acVar.f88786i, new ak(acVar));
        acVar.x.getVideoEditViewModel().f126134g.observe(acVar.f88786i, new al(acVar));
        acVar.x.getVideoEditViewModel().f126135h.observe(acVar.f88786i, new am(acVar));
        acVar.x.getVideoEditViewModel().f126130c.observe(acVar.f88786i, new an(acVar));
        acVar.x.getVideoEditViewModel().f126132e.observe(acVar.f88786i, new ao(acVar));
        acVar.O.a(G);
    }
}
