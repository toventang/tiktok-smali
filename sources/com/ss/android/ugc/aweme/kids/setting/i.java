package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106835a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Activity f106836b;

    static {
        Covode.recordClassIndex(68320);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "help_center";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68321);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f106836b;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public i(Activity activity) {
        l.d(activity, "");
        this.f106836b = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.bg1);
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
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f106836b).a(R.string.de8).a();
            return;
        }
        g gVar = new g("https://support.tiktok.com");
        gVar.a("lang", com.ss.android.ugc.aweme.kids.setting.base.a.a.a(this.f106836b));
        String a2 = gVar.a();
        l.b(a2, "");
        o.a.a(this, a2, this.f106836b.getString(R.string.bwa), (Boolean) null, 12);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
