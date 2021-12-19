package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f106816a;

    static {
        Covode.recordClassIndex(68299);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "manage_account";
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f106816a;
    }

    public a(Activity activity) {
        l.d(activity, "");
        this.f106816a = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.bm);
        l.b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(CommonItemView commonItemView) {
        l.d(commonItemView, "");
        Activity activity = this.f106816a;
        Intent intent = new Intent(this.f106816a, KidsManageAccountActivity.class);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, activity);
        activity.startActivity(intent);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
