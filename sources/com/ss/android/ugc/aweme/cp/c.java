package com.ss.android.ugc.aweme.cp;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import h.f.b.l;
import h.g.a;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public View f78251a;

    /* renamed from: b  reason: collision with root package name */
    public View f78252b;

    /* renamed from: c  reason: collision with root package name */
    public View f78253c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f78254d;

    static {
        Covode.recordClassIndex(48523);
    }

    @Override // com.ss.android.ugc.aweme.cp.a
    public final void a() {
        View view = this.f78251a;
        if (view != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i.b(view, null, null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 9.5f, system.getDisplayMetrics()))), null, false, 27);
        }
        View view2 = this.f78252b;
        if (view2 != null) {
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            int a2 = a.a(TypedValue.applyDimension(1, 45.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            i.a(view2, a2, a.a(TypedValue.applyDimension(1, 45.0f, system3.getDisplayMetrics())));
        }
        View view3 = this.f78253c;
        if (view3 != null) {
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            int a3 = a.a(TypedValue.applyDimension(1, 36.0f, system4.getDisplayMetrics()));
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            i.a(view3, a3, a.a(TypedValue.applyDimension(1, 36.0f, system5.getDisplayMetrics())));
        }
        TextView textView = this.f78254d;
        if (textView != null) {
            textView.setTextSize(1, 11.0f);
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            i.b(textView, null, Integer.valueOf(-a.a(TypedValue.applyDimension(1, 1.0f, system6.getDisplayMetrics()))), null, null, false, 29);
            Resources system7 = Resources.getSystem();
            l.a((Object) system7, "");
            i.a((View) textView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 12.0f, system7.getDisplayMetrics()))), false, 23);
        }
    }
}
