package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.language.d;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class q implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107108a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Activity f107109b;

    static {
        Covode.recordClassIndex(68511);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "terms_of_service";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68512);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f107109b;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public q(Activity activity) {
        l.d(activity, "");
        this.f107109b = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.eiv);
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
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f107109b).a(R.string.de8).a();
            return;
        }
        g gVar = new g("https://www.tiktok.com/in_app/redirect?region=" + d.g() + "&language=" + com.ss.android.ugc.aweme.kids.setting.items.language.d.a.c() + "&projectKey=terms-of-use");
        gVar.a("lang", com.ss.android.ugc.aweme.kids.setting.base.a.a.a(this.f107109b));
        String a2 = gVar.a();
        l.b(a2, "");
        o.a.a(this, a2, this.f107109b.getString(R.string.da9), (Boolean) null, 12);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
