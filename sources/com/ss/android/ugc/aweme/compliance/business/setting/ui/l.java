package com.ss.android.ugc.aweme.compliance.business.setting.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.c.c;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ChildrenModeSettingActivity f77207a;

    static {
        Covode.recordClassIndex(47738);
    }

    l(ChildrenModeSettingActivity childrenModeSettingActivity) {
        this.f77207a = childrenModeSettingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ChildrenModeSettingActivity childrenModeSettingActivity = this.f77207a;
        if (!ChildrenModeSettingActivity.a()) {
            new a(childrenModeSettingActivity).a(R.string.de8).a();
            return;
        }
        c.a(childrenModeSettingActivity, "log_out_popup", "confirm");
        r.a("log_out", new d().a("enter_from", "settings_page").a("f_mode", 1).f66730a);
        b.a();
        b.f62864a.a(childrenModeSettingActivity);
        childrenModeSettingActivity.runOnUiThread(new f(childrenModeSettingActivity));
        b.b().logout("user_logout", "user_logout");
    }
}
