package com.ss.android.ugc.aweme.v.a;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.g.a.a;
import com.ss.android.ugc.aweme.g.a.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private View f143204a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f143205b;

    /* renamed from: c  reason: collision with root package name */
    private final LayoutInflater f143206c;

    /* renamed from: d  reason: collision with root package name */
    private final int f143207d = R.string.f51;

    /* renamed from: e  reason: collision with root package name */
    private final int f143208e = R.string.cz;

    static {
        Covode.recordClassIndex(93735);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final g a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return new a(this.f143205b, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final void b(RelativeLayout relativeLayout) {
        MethodCollector.i(3317);
        l.d(relativeLayout, "");
        View view = this.f143204a;
        if (view != null) {
            relativeLayout.removeView(view);
        }
        MethodCollector.o(3317);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final void a(RelativeLayout relativeLayout) {
        View view;
        DmtTextView dmtTextView;
        DmtTextView dmtTextView2;
        MethodCollector.i(3316);
        l.d(relativeLayout, "");
        View a2 = com.a.a(this.f143206c, R.layout.aey, relativeLayout, false);
        this.f143204a = a2;
        View view2 = null;
        if (!(a2 == null || (dmtTextView2 = (DmtTextView) a2.findViewById(R.id.br4)) == null)) {
            dmtTextView2.setText(this.f143205b.getString(this.f143207d));
        }
        View view3 = this.f143204a;
        int i2 = Build.VERSION.SDK_INT;
        if (view3 != null) {
            view = view3.findViewById(R.id.brf);
        } else {
            view = null;
        }
        int c2 = androidx.core.content.b.c(this.f143205b, R.color.a9);
        d dVar = new d(n.b(this.f143205b, 4.0f), BlurMaskFilter.Blur.NORMAL, n.b(this.f143205b, 2.0f), androidx.core.content.b.c(this.f143205b, R.color.h_));
        if (view != null) {
            view.setBackground(new e(c2, dVar));
        }
        View view4 = this.f143204a;
        if (!(view4 == null || (dmtTextView = (DmtTextView) view4.findViewById(R.id.e_1)) == null)) {
            dmtTextView.setText(this.f143205b.getString(this.f143208e));
        }
        View view5 = this.f143204a;
        int i3 = Build.VERSION.SDK_INT;
        if (view5 != null) {
            view2 = view5.findViewById(R.id.djd);
        }
        int c3 = androidx.core.content.b.c(this.f143205b, R.color.bh);
        d dVar2 = new d(n.b(this.f143205b, 4.0f), BlurMaskFilter.Blur.NORMAL, n.b(this.f143205b, 2.0f), androidx.core.content.b.c(this.f143205b, R.color.h_));
        if (view2 != null) {
            view2.setBackground(new e(c3, dVar2));
        }
        relativeLayout.addView(this.f143204a);
        MethodCollector.o(3316);
    }

    public b(Context context, LayoutInflater layoutInflater) {
        l.d(context, "");
        l.d(layoutInflater, "");
        this.f143205b = context;
        this.f143206c = layoutInflater;
    }
}
