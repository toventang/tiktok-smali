package com.ss.android.ugc.aweme.commercialize.egg.impl.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.ss.android.ugc.aweme.app.f.d;
import h.f.b.l;

public final class b implements com.ss.android.ugc.aweme.commercialize.egg.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static final a f73979d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f73980a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f73981b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f73982c = "";

    static {
        Covode.recordClassIndex(45561);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final boolean c() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final boolean d() {
        return false;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void a() {
        IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad", new d().a("enter_from", this.f73982c).a("group_id", this.f73980a).a("author_id", this.f73981b).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void b() {
        IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad_fail", new d().a("fail_type", "load_fail").a("enter_from", this.f73982c).a("group_id", this.f73980a).a("author_id", this.f73981b).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void a(View view, int i2) {
        l.d(view, "");
        l.d(view, "");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void a(View view, View view2) {
        l.d(view2, "");
        l.d(view2, "");
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void b(View view, View view2) {
        l.d(view, "");
        l.d(view2, "");
        Context context = view2.getContext();
        l.b(context, "");
        Resources resources = context.getResources();
        l.b(resources, "");
        double d2 = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d2);
        Context context2 = view2.getContext();
        l.b(context2, "");
        Resources resources2 = context2.getResources();
        l.b(resources2, "");
        double d3 = (double) resources2.getDisplayMetrics().heightPixels;
        Double.isNaN(d3);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (d2 * 0.64d), (int) (d3 * 0.64d));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }
}
