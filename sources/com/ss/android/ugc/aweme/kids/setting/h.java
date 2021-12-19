package com.ss.android.ugc.aweme.kids.setting;

import android.app.Activity;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.ss.android.common.util.g;
import com.ss.android.ugc.aweme.kids.setting.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class h implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f106833a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Activity f106834b;

    static {
        Covode.recordClassIndex(68318);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final String a() {
        return "report_problem";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68319);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final Activity b() {
        return this.f106834b;
    }

    public h(Activity activity) {
        l.d(activity, "");
        this.f106834b = activity;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final CommonItemView a(View view) {
        l.d(view, "");
        CommonItemView commonItemView = (CommonItemView) view.findViewById(R.id.b27);
        l.b(commonItemView, "");
        return commonItemView;
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(CommonItemView commonItemView) {
        l.d(commonItemView, "");
        String a2 = new g("https://www.tiktok.com/aweme/inapp/v2/c_feedback").a();
        l.b(a2, "");
        o.a.a((o) this, a2, (String) null, (Boolean) true, 10);
    }

    @Override // com.ss.android.ugc.aweme.kids.setting.o
    public final void a(String str, String str2, Boolean bool) {
        l.d(str, "");
        o.a.a(this, str, str2, bool, (Boolean) null);
    }
}
