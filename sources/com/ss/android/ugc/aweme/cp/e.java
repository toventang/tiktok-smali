package com.ss.android.ugc.aweme.cp;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import h.f.b.l;
import h.g.a;

public final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    public View f78259a;

    /* renamed from: b  reason: collision with root package name */
    public View f78260b;

    /* renamed from: c  reason: collision with root package name */
    public View f78261c;

    /* renamed from: d  reason: collision with root package name */
    public View f78262d;

    /* renamed from: e  reason: collision with root package name */
    public View f78263e;

    /* renamed from: f  reason: collision with root package name */
    public View f78264f;

    static {
        Covode.recordClassIndex(48525);
    }

    @Override // com.ss.android.ugc.aweme.cp.a
    public final void a() {
        View view = this.f78259a;
        if (view != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            i.a(view, a2, a.a(TypedValue.applyDimension(1, 40.0f, system2.getDisplayMetrics())));
        }
        View view2 = this.f78260b;
        if (view2 != null) {
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            int a3 = a.a(TypedValue.applyDimension(1, 78.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            i.a(view2, a3, a.a(TypedValue.applyDimension(1, 78.0f, system4.getDisplayMetrics())));
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            Integer valueOf = Integer.valueOf(a.a(TypedValue.applyDimension(1, 17.0f, system5.getDisplayMetrics())));
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            i.b(view2, null, null, valueOf, Integer.valueOf(-a.a(TypedValue.applyDimension(1, 18.0f, system6.getDisplayMetrics()))), false, 19);
        }
        View view3 = this.f78261c;
        if (view3 != null) {
            Resources system7 = Resources.getSystem();
            l.a((Object) system7, "");
            int a4 = a.a(TypedValue.applyDimension(1, 40.0f, system7.getDisplayMetrics()));
            Resources system8 = Resources.getSystem();
            l.a((Object) system8, "");
            i.a(view3, a4, a.a(TypedValue.applyDimension(1, 40.0f, system8.getDisplayMetrics())));
            Resources system9 = Resources.getSystem();
            l.a((Object) system9, "");
            i.b(view3, null, null, null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 1.0f, system9.getDisplayMetrics()))), false, 23);
        }
        View view4 = this.f78262d;
        if (view4 != null) {
            Resources system10 = Resources.getSystem();
            l.a((Object) system10, "");
            int a5 = a.a(TypedValue.applyDimension(1, 40.0f, system10.getDisplayMetrics()));
            Resources system11 = Resources.getSystem();
            l.a((Object) system11, "");
            i.a(view4, a5, a.a(TypedValue.applyDimension(1, 40.0f, system11.getDisplayMetrics())));
        }
        View view5 = this.f78263e;
        if (view5 != null) {
            Resources system12 = Resources.getSystem();
            l.a((Object) system12, "");
            int a6 = a.a(TypedValue.applyDimension(1, 22.0f, system12.getDisplayMetrics()));
            Resources system13 = Resources.getSystem();
            l.a((Object) system13, "");
            i.a(view5, a6, a.a(TypedValue.applyDimension(1, 22.0f, system13.getDisplayMetrics())));
        }
        View view6 = this.f78264f;
        if (view6 != null) {
            Resources system14 = Resources.getSystem();
            l.a((Object) system14, "");
            i.a(view6, -2, a.a(TypedValue.applyDimension(1, 78.0f, system14.getDisplayMetrics())));
        }
    }
}
