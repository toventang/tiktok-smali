package com.ss.android.ugc.aweme.v.a;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.g.a.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public View f143199a;

    /* renamed from: b  reason: collision with root package name */
    public g f143200b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f143201c;

    /* renamed from: d  reason: collision with root package name */
    private final LayoutInflater f143202d;

    /* renamed from: e  reason: collision with root package name */
    private final int f143203e;

    static {
        Covode.recordClassIndex(93734);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final g a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        com.ss.android.ugc.aweme.g.a.a aVar = new com.ss.android.ugc.aweme.g.a.a(this.f143201c, viewGroup);
        this.f143200b = aVar;
        return aVar;
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final void b(RelativeLayout relativeLayout) {
        MethodCollector.i(2657);
        l.d(relativeLayout, "");
        View view = this.f143199a;
        if (view != null) {
            relativeLayout.removeView(view);
        }
        MethodCollector.o(2657);
    }

    @Override // com.ss.android.ugc.aweme.v.a.c
    public final void a(RelativeLayout relativeLayout) {
        DmtTextView dmtTextView;
        MethodCollector.i(2653);
        l.d(relativeLayout, "");
        View a2 = com.a.a(this.f143202d, R.layout.aex, relativeLayout, false);
        this.f143199a = a2;
        View view = null;
        if (!(a2 == null || (dmtTextView = (DmtTextView) a2.findViewById(R.id.e_1)) == null)) {
            dmtTextView.setText(this.f143201c.getString(this.f143203e));
        }
        View view2 = this.f143199a;
        int i2 = Build.VERSION.SDK_INT;
        if (view2 != null) {
            view = view2.findViewById(R.id.e9v);
        }
        int c2 = b.c(this.f143201c, R.color.bh);
        d dVar = new d(n.b(this.f143201c, 4.0f), BlurMaskFilter.Blur.NORMAL, n.b(this.f143201c, 2.0f), b.c(this.f143201c, R.color.h_));
        if (view != null) {
            view.setBackground(new e(c2, dVar));
        }
        relativeLayout.addView(this.f143199a);
        MethodCollector.o(2653);
    }

    public a(Context context, LayoutInflater layoutInflater, int i2) {
        l.d(context, "");
        l.d(layoutInflater, "");
        this.f143201c = context;
        this.f143202d = layoutInflater;
        this.f143203e = i2;
    }
}
