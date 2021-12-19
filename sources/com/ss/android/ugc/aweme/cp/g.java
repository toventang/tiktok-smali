package com.ss.android.ugc.aweme.cp;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import h.f.b.l;
import h.g.a;

public final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    public View f78266a;

    /* renamed from: b  reason: collision with root package name */
    public View f78267b;

    /* renamed from: c  reason: collision with root package name */
    public View f78268c;

    /* renamed from: d  reason: collision with root package name */
    public View f78269d;

    static {
        Covode.recordClassIndex(48527);
    }

    @Override // com.ss.android.ugc.aweme.cp.a
    public final void a() {
        View view = this.f78266a;
        if (view != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i.b(view, null, null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 9.5f, system.getDisplayMetrics()))), null, false, 27);
        }
        View view2 = this.f78267b;
        if (view2 != null) {
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            i.a(view2, a.a(TypedValue.applyDimension(1, 45.0f, system2.getDisplayMetrics())), -2);
        }
        View view3 = this.f78268c;
        if (view3 != null) {
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            int a2 = a.a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            i.a(view3, a2, a.a(TypedValue.applyDimension(1, 36.0f, system4.getDisplayMetrics())));
        }
        View view4 = this.f78269d;
        if (view4 != null) {
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            int a3 = a.a(TypedValue.applyDimension(1, 36.0f, system5.getDisplayMetrics()));
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            i.a(view4, a3, a.a(TypedValue.applyDimension(1, 36.0f, system6.getDisplayMetrics())));
        }
    }

    public static void a(TextView textView) {
        l.d(textView, "");
        if (b()) {
            textView.setTextSize(1, 11.0f);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i.b(textView, null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 3.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }
    }
}
