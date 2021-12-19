package com.ss.android.ugc.aweme.prop.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.tools.f.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements a {

    /* renamed from: a  reason: collision with root package name */
    private final j f118269a;

    static {
        Covode.recordClassIndex(76806);
    }

    w(j jVar) {
        this.f118269a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.f.a
    public final void onIntercept(String str, Effect effect) {
        j jVar = this.f118269a;
        IAVMobService aVMobService = AVExternalServiceImpl.a().getAVMobService();
        d a2 = new d().a("creation_id", str).a("shoot_way", "prop_page").a("prop_id", effect.getEffectId()).a("group_id", jVar.ar).a("log_pb", jVar.aq).a("enter_from", "prop_page").a("enter_method", "click_prop_publish").a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(str)).a("is_ui_shoot", (Object) false).a("shoot_enter_from", jVar.as).a("is_bundled", jVar.au);
        if (!TextUtils.isEmpty(jVar.at)) {
            a2.a("from_banner_id", jVar.at);
        }
        aVMobService.onEventV3("shoot", a2.f66730a);
    }
}
