package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.utils.gb;
import h.f.a.b;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f70902a;

    static {
        Covode.recordClassIndex(43677);
    }

    g(a aVar) {
        this.f70902a = aVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        MethodCollector.i(4932);
        a aVar = this.f70902a;
        View view = (View) obj;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        boolean a2 = gb.a(aVar.p.getContext());
        if (a2) {
            layoutParams.addRule(7, aVar.f70880a.getId());
        } else {
            layoutParams.addRule(5, aVar.f70880a.getId());
        }
        layoutParams.addRule(6, aVar.f70880a.getId());
        aVar.p.addView(view, layoutParams);
        Integer valueOf = Integer.valueOf(a2 ? 1 : 0);
        MethodCollector.o(4932);
        return valueOf;
    }
}
