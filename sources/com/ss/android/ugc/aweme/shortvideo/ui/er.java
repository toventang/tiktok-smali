package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import h.f.a.m;

final /* synthetic */ class er implements m {

    /* renamed from: a  reason: collision with root package name */
    private final CommonItemView f131730a;

    /* renamed from: b  reason: collision with root package name */
    private final v f131731b;

    static {
        Covode.recordClassIndex(86274);
    }

    er(CommonItemView commonItemView, v vVar) {
        this.f131730a = commonItemView;
        this.f131731b = vVar;
    }

    @Override // h.f.a.m
    public final Object invoke(Object obj, Object obj2) {
        CommonItemView commonItemView = this.f131730a;
        v vVar = this.f131731b;
        Boolean bool = (Boolean) obj2;
        commonItemView.setChecked(bool.booleanValue());
        vVar.f129898j = bool.booleanValue();
        return null;
    }
}
