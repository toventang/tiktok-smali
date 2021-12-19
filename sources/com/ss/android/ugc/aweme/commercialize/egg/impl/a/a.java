package com.ss.android.ugc.aweme.commercialize.egg.impl.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.drawee.view.c;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.egg.b.b;
import h.f.b.l;

public final class a implements com.ss.android.ugc.aweme.commercialize.egg.a.a {

    /* renamed from: h  reason: collision with root package name */
    public static final C1664a f73971h = new C1664a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f73972a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f73973b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f73974c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f73975d = "";

    /* renamed from: e  reason: collision with root package name */
    public String f73976e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f73977f = "";

    /* renamed from: g  reason: collision with root package name */
    public String f73978g = "";

    static {
        Covode.recordClassIndex(45559);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final boolean c() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final boolean d() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.a$a  reason: collision with other inner class name */
    public static final class C1664a {
        static {
            Covode.recordClassIndex(45560);
        }

        private C1664a() {
        }

        public /* synthetic */ C1664a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void a() {
        IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad", new d().a("egg_ad_id", this.f73972a).a("comment_text", this.f73973b).a("scene_id", "1003").a("enter_from", this.f73978g).a("group_id", this.f73976e).a("author_id", this.f73977f).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void b() {
        IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad_fail", new d().a("egg_ad_id", this.f73972a).a("comment_text", this.f73973b).a("scene_id", "1003").a("enter_from", this.f73978g).a("group_id", this.f73976e).a("author_id", this.f73977f).a("fail_type", "load_fail").f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void a(View view, View view2) {
        com.facebook.drawee.h.a controller;
        Animatable i2;
        l.d(view2, "");
        view2.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
            if ((view instanceof SimpleDraweeView) && (controller = ((c) view).getController()) != null && (i2 = controller.i()) != null && i2.isRunning()) {
                i2.stop();
            }
        }
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
        int i2 = (int) (d2 * 0.64d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.egg.a.a
    public final void a(View view, int i2) {
        l.d(view, "");
        if (!TextUtils.isEmpty(this.f73974c) || !TextUtils.isEmpty(this.f73975d)) {
            b a2 = com.ss.android.ugc.aweme.commercialize.egg.impl.c.a.a();
            if (a2 == null) {
                l.b();
            }
            Context context = view.getContext();
            l.b(context, "");
            if (!a2.b(context, this.f73975d)) {
                Context context2 = view.getContext();
                l.b(context2, "");
                a2.a(context2, this.f73974c, "");
            }
            IAppLogDepend iAppLogDepend = com.bytedance.ies.android.base.runtime.a.f31872a;
            if (iAppLogDepend != null) {
                iAppLogDepend.onEventV3Map("click_egg_ad", new d().a("egg_ad_id", this.f73972a).a("comment_text", this.f73973b).a("scene_id", "1003").a("enter_from", this.f73978g).a("group_id", this.f73976e).a("author_id", this.f73977f).a("duration", i2).f66730a);
            }
        }
    }
}
