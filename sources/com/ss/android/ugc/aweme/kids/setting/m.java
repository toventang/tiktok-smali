package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class m implements o {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f107104a;

    static {
        Covode.recordClassIndex(68505);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "safety_center";
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f107104a;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public m(Activity activity) {
        l.d(activity, "");
        this.f107104a = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.dry);
        l.b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(CommonItemView commonItemView) {
        l.d(commonItemView, "");
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            new a(this.f107104a).a(R.string.de8).a();
            return;
        }
        String a2 = com.ss.android.ugc.aweme.kids.setting.base.a.a.a(this.f107104a);
        l.b(a2, "");
        o.a.a(this, "https://www.tiktok.com/" + a2 + "/safety/", this.f107104a.getString(R.string.ffh), (Boolean) null, 12);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
