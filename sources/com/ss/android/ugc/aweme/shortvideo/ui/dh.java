package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.als.l;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.tools.utils.q;

final /* synthetic */ class dh implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131683a;

    /* renamed from: b  reason: collision with root package name */
    private final l f131684b;

    static {
        Covode.recordClassIndex(86237);
    }

    dh(cj cjVar, l lVar) {
        this.f131683a = cjVar;
        this.f131684b = lVar;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        cj cjVar = this.f131683a;
        l lVar = this.f131684b;
        Boolean bool = (Boolean) obj;
        q.a("VideoPublishFragment -> onResume: fromPublishSettingPanel = ".concat(String.valueOf(bool)));
        if (bool.booleanValue()) {
            CommonItemView commonItemView = cjVar.I.f129822m;
            if (commonItemView != null) {
                commonItemView.setDesc(null);
            }
            lVar.b(false);
        }
    }
}
