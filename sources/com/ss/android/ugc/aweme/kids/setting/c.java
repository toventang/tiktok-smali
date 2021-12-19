package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class c implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f106826a;

    static {
        Covode.recordClassIndex(68311);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "clear_cache";
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f106826a;
    }

    public c(Activity activity) {
        l.d(activity, "");
        this.f106826a = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.a76);
        l.b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(CommonItemView commonItemView) {
        l.d(commonItemView, "");
        SmartRouter.buildRoute(this.f106826a, "aweme://children/setting/clearcache").open();
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
