package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.m;
import com.ss.android.ugc.aweme.photo.a.a;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.setting.bm;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.tools.f.b;
import h.a.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ex implements j {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131737a;

    static {
        Covode.recordClassIndex(86280);
    }

    ex(cj cjVar) {
        this.f131737a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.j
    public final void a(int i2) {
        m a2;
        cj cjVar = this.f131737a;
        boolean z = cjVar.f131594a;
        String str = "public";
        if (i2 != 0) {
            if (i2 == 1) {
                str = "private";
            } else if (i2 == 2) {
                str = "friends";
            } else if (i2 == 3) {
                str = "exclude";
            }
        } else if (z) {
            str = "followers";
        }
        r.a("select_privacy_setting", new b().a("creation_id", cjVar.K.creationId).a("shoot_way", cjVar.K.mShootWay).a("content_source", es.d(cjVar.K)).a("content_type", es.c(cjVar.K)).a("enter_from", "video_post_page").a("to_status", str).a("is_private", z ? 1 : 0).a("enter_method", "publishing").f149193a);
        cjVar.f131606m.setValue(new a(i2));
        if (i.a(new Integer[]{0, 2, 1}, Integer.valueOf(i2))) {
            com.ss.android.ugc.aweme.cs.g.b.f79064d = i2;
            com.ss.android.ugc.aweme.cs.g.b.f79062b.storeInt(com.ss.android.ugc.aweme.cs.g.b.a(com.ss.android.ugc.aweme.cs.g.b.f79061a), i2);
        }
        if (cjVar.f131600g != null) {
            cjVar.f131600g.a(i2);
        }
        cjVar.L = true;
        if (bm.a() != 0 && (a2 = com.ss.android.ugc.aweme.compliance.api.a.s().a("video_visibility_select")) != null && a2.f76684a == 1) {
            l.f115658a.a().b(cjVar.requireActivity());
            com.ss.android.ugc.aweme.compliance.api.a.s().b("video_visibility_select");
        }
    }
}
