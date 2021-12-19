package com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    static final d f102628a = new c();

    static {
        Covode.recordClassIndex(65702);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.d
    public final void a(b bVar) {
        bVar.f102606g.setVisibility(0);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.d
    public final void a(ViewGroup viewGroup, b bVar) {
        MethodCollector.i(7931);
        View view = bVar.f102606g;
        view.setVisibility(8);
        viewGroup.removeView(view);
        MethodCollector.o(7931);
    }
}
