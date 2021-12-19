package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;

public final class l implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107102a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Activity f107103b;

    static {
        Covode.recordClassIndex(68503);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "privacy_policy";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68504);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f107103b;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public l(Activity activity) {
        h.f.b.l.d(activity, "");
        this.f107103b = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        h.f.b.l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.d9e);
        h.f.b.l.b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(CommonItemView commonItemView) {
        h.f.b.l.d(commonItemView, "");
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f107103b).a(R.string.de8).a();
        } else {
            o.a.a(this, "https://www.tiktok.com/aweme/inapp/v2/c_privacy", this.f107103b.getString(R.string.eub), (Boolean) null, 12);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        h.f.b.l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
