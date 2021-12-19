package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.login.a;

final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final ChildrenModeSettingActivity f77201a;

    static {
        Covode.recordClassIndex(47732);
    }

    f(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f77201a = childrenModeSettingActivity;
    }

    public final void run() {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f77201a;
        if (childrenModeSettingActivity.t == null) {
            childrenModeSettingActivity.t = new a(childrenModeSettingActivity);
        }
        childrenModeSettingActivity.t.show();
    }
}
