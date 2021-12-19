package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.c;

final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChildrenModeSettingActivity f77206a;

    static {
        Covode.recordClassIndex(47737);
    }

    k(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f77206a = childrenModeSettingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        c.a(this.f77206a, "log_out_popup", "cancel");
    }
}
