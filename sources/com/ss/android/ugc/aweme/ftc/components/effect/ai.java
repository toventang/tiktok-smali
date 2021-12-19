package com.ss.android.ugc.aweme.ftc.components.effect;

import androidx.lifecycle.u;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import dmt.av.video.p;
import dmt.av.video.t;
import java.util.Collection;

final /* synthetic */ class ai implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97821a;

    static {
        Covode.recordClassIndex(62172);
    }

    ai(f fVar) {
        this.f97821a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        p value;
        long G;
        p a2;
        f fVar = this.f97821a;
        VEEffectSelectOp vEEffectSelectOp = (VEEffectSelectOp) obj;
        if (vEEffectSelectOp != null) {
            int i2 = vEEffectSelectOp.mType;
            if (i2 == 1) {
                fVar.b(vEEffectSelectOp.mTimePosition, false);
            } else if (i2 == 2) {
                EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                if (!fVar.B.b()) {
                    p b2 = p.b(effectModel.resDir, fVar.B.a());
                    b2.f156929e = fVar.B.d();
                    b2.f156933i = effectModel.color;
                    b2.f156935k = effectModel.key;
                    b2.f156936l = effectModel.name;
                    b2.f156932h = fVar.B.c();
                    b2.n = effectModel.category;
                    b2.f156937m = effectModel.duration;
                    b2.o = effectModel.extra;
                    fVar.f97851d.setValue(b2);
                    fVar.i();
                    long j2 = b2.f156929e + ((long) effectModel.duration);
                    p a3 = p.a((long) fVar.A.s((int) j2));
                    a3.f156930f = j2;
                    a3.f156932h = fVar.B.c();
                    fVar.f97851d.setValue(a3);
                }
            } else if (i2 == 3) {
                int i3 = vEEffectSelectOp.action;
                EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                if (i3 == 0) {
                    if (fVar.A == null) {
                        g.a().I().a("VEEffectHelper selectFilterEffect mVEEditor is null");
                    } else if (!fVar.B.b()) {
                        p b3 = p.b(effectModel2.resDir, fVar.B.a());
                        b3.f156929e = fVar.B.d();
                        b3.f156933i = effectModel2.color;
                        b3.f156935k = effectModel2.key;
                        b3.f156936l = effectModel2.name;
                        b3.f156932h = fVar.B.c();
                        b3.n = effectModel2.category;
                        b3.o = effectModel2.extra;
                        fVar.f97851d.setValue(b3);
                        fVar.i();
                    }
                } else if (i3 == 1 && (value = fVar.f97851d.getValue()) != null && value.f156931g == 0) {
                    p a4 = p.a(fVar.B.a());
                    a4.f156930f = fVar.B.d();
                    a4.f156932h = fVar.B.c();
                    fVar.f97851d.setValue(a4);
                    fVar.j();
                }
            } else if (i2 == 4) {
                EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                fVar.f97852e.setValue(t.b(0));
                VideoEditViewModel videoEditViewModel = fVar.x.getVideoEditViewModel();
                if (videoEditViewModel == null || b.a((Collection) videoEditViewModel.j()) || videoEditViewModel.j().size() != 1) {
                    G = (long) fVar.A.G();
                } else {
                    G = videoEditViewModel.j().get(0).f125478b;
                }
                long a5 = fVar.B.a(G);
                if (effectPointModel == null) {
                    a2 = p.a(effectModel3.resDir, a5);
                } else {
                    a2 = p.a(effectModel3.resDir, a5, effectPointModel.getIndex(), effectPointModel.getUuid());
                }
                a2.f156929e = 0;
                a2.f156930f = G;
                a2.f156933i = effectModel3.color;
                a2.f156935k = effectModel3.key;
                a2.f156936l = effectModel3.name;
                a2.f156932h = fVar.B.c();
                a2.n = effectModel3.category;
                a2.o = effectModel3.extra;
                fVar.f97851d.setValue(a2);
                fVar.i();
            }
        }
    }
}
