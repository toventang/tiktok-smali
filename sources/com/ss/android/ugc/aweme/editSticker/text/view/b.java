package com.ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ColorSelectLayout f88648a;

    /* renamed from: b  reason: collision with root package name */
    private final a f88649b;

    static {
        Covode.recordClassIndex(55781);
    }

    b(ColorSelectLayout colorSelectLayout, a aVar) {
        this.f88648a = colorSelectLayout;
        this.f88649b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ColorSelectLayout colorSelectLayout = this.f88648a;
        a aVar = this.f88649b;
        colorSelectLayout.a();
        ColorSelectLayout.a(view, false);
        ((a) view).f88645c = true;
        if (colorSelectLayout.f88622a != null) {
            colorSelectLayout.f88622a.a(((Integer) view.getTag()).intValue());
        }
        colorSelectLayout.f88623b.a(aVar);
    }
}
