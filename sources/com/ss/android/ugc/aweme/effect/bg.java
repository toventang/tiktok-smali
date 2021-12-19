package com.ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.StoryEditEtParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import dmt.av.video.p;
import dmt.av.video.t;
import h.f.b.l;

public final /* synthetic */ class bg implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88869a;

    static {
        Covode.recordClassIndex(55902);
    }

    public bg(ac acVar) {
        this.f88869a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        p value;
        String str;
        String str2;
        p a2;
        ac acVar = this.f88869a;
        VEEffectSelectOp vEEffectSelectOp = (VEEffectSelectOp) obj;
        if (vEEffectSelectOp != null) {
            int i2 = vEEffectSelectOp.mType;
            if (i2 == 1) {
                acVar.a(vEEffectSelectOp.mTimePosition, false, true);
            } else if (i2 == 2) {
                EffectModel effectModel = vEEffectSelectOp.mEffectModel;
                if (!acVar.B.b()) {
                    p b2 = p.b(effectModel.resDir, acVar.B.a());
                    b2.f156929e = acVar.B.d();
                    b2.f156933i = effectModel.color;
                    b2.f156935k = effectModel.key;
                    b2.f156936l = effectModel.name;
                    b2.f156932h = acVar.B.c();
                    b2.n = effectModel.category;
                    b2.f156937m = effectModel.duration;
                    b2.o = effectModel.extra;
                    acVar.f88781d.setValue(b2);
                    acVar.k();
                    long j2 = b2.f156929e + ((long) effectModel.duration);
                    p a3 = p.a((long) acVar.A.s((int) j2));
                    a3.f156930f = j2;
                    a3.f156932h = acVar.B.c();
                    acVar.f88781d.setValue(a3);
                    b a4 = new b().a("creation_id", acVar.f88779b.creationId).a("scene_id", 1003).a("shoot_way", acVar.f88779b.mShootWay).a("tab_name", acVar.P).a("effect_name", effectModel.name).a("effect_id", effectModel.key);
                    if (acVar.f88779b.draftId != 0) {
                        a4.a("draft_id", acVar.f88779b.draftId);
                    }
                    if (!TextUtils.isEmpty(acVar.f88779b.newDraftId)) {
                        a4.a("new_draft_id", acVar.f88779b.newDraftId);
                    }
                    d.a("effect_click", a4.f149193a);
                }
            } else if (i2 == 3) {
                int i3 = vEEffectSelectOp.action;
                EffectModel effectModel2 = vEEffectSelectOp.mEffectModel;
                if (i3 == 0) {
                    if (acVar.A == null) {
                        g.a().I().a("VEEffectHelper selectFilterEffect mVEEditor is null");
                    } else if (!acVar.B.b()) {
                        p b3 = p.b(effectModel2.resDir, acVar.B.a());
                        b3.f156929e = acVar.B.d();
                        b3.f156933i = effectModel2.color;
                        b3.f156935k = effectModel2.key;
                        b3.f156936l = effectModel2.name;
                        b3.f156932h = acVar.B.c();
                        b3.n = effectModel2.category;
                        b3.o = effectModel2.extra;
                        b3.p = effectModel2.adjustParams;
                        b3.q = effectModel2.isNewEngineEffect;
                        b3.f156928d = (long) acVar.A.j();
                        acVar.f88781d.setValue(b3);
                        acVar.k();
                        VideoPublishEditModel videoPublishEditModel = acVar.f88779b;
                        l.d(videoPublishEditModel, "");
                        b bVar = new b();
                        StoryEditEtParam storyEditEtParam = videoPublishEditModel.storyEditEtParam;
                        if (storyEditEtParam == null || (str = storyEditEtParam.getShootPage()) == null) {
                            str = "video_shoot_page";
                        }
                        b a5 = bVar.a("shoot_page", str);
                        StoryEditEtParam storyEditEtParam2 = videoPublishEditModel.storyEditEtParam;
                        if ((storyEditEtParam2 == null || (str2 = storyEditEtParam2.getShootTabName()) == null) && (str2 = es.e(videoPublishEditModel)) == null) {
                            str2 = "";
                        }
                        b a6 = a5.a("shoot_tab_name", str2);
                        if (videoPublishEditModel.storyEditEtParam != null) {
                            StoryEditEtParam storyEditEtParam3 = videoPublishEditModel.storyEditEtParam;
                            a6.a("clips_cnt", storyEditEtParam3 != null ? storyEditEtParam3.getClipCount() : 1);
                        }
                        l.b(a6, "");
                        b a7 = a6.a("creation_id", acVar.f88779b.creationId).a("scene_id", 1003).a("shoot_way", acVar.f88779b.mShootWay).a("tab_name", acVar.P).a("effect_name", effectModel2.name).a("effect_id", effectModel2.key);
                        if (acVar.f88779b.draftId != 0) {
                            a7.a("draft_id", acVar.f88779b.draftId);
                        }
                        if (!TextUtils.isEmpty(acVar.f88779b.newDraftId)) {
                            a7.a("new_draft_id", acVar.f88779b.newDraftId);
                        }
                        d.a("effect_click", a7.f149193a);
                    }
                } else if (i3 == 1 && (value = acVar.f88781d.getValue()) != null && value.f156931g == 0) {
                    p a8 = p.a(acVar.B.a());
                    a8.f156930f = acVar.B.d();
                    a8.f156932h = acVar.B.c();
                    a8.q = effectModel2.isNewEngineEffect;
                    acVar.f88781d.setValue(a8);
                    acVar.l();
                }
            } else if (i2 == 4) {
                EffectModel effectModel3 = vEEffectSelectOp.mEffectModel;
                EffectPointModel effectPointModel = vEEffectSelectOp.mPreviousModel;
                acVar.f88782e.setValue(t.b(0));
                acVar.x.getVideoEditViewModel();
                long j3 = (long) acVar.A.j();
                long a9 = acVar.B.a(j3);
                if (effectPointModel == null) {
                    a2 = p.a(effectModel3.resDir, a9);
                } else {
                    a2 = p.a(effectModel3.resDir, a9, effectPointModel.getIndex(), effectPointModel.getUuid());
                }
                a2.f156929e = 0;
                a2.f156930f = j3;
                a2.f156933i = effectModel3.color;
                a2.f156935k = effectModel3.key;
                a2.f156936l = effectModel3.name;
                a2.f156932h = acVar.B.c();
                a2.n = effectModel3.category;
                a2.o = effectModel3.extra;
                acVar.f88781d.setValue(a2);
                acVar.k();
            }
        }
    }
}
