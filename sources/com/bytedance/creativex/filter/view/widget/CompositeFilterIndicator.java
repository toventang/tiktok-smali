package com.bytedance.creativex.filter.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;

public final class CompositeFilterIndicator extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final a f28034a;

    /* renamed from: b  reason: collision with root package name */
    private final a f28035b;

    static {
        Covode.recordClassIndex(16419);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeFilterIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(7413);
        a aVar = new a(getContext());
        this.f28034a = aVar;
        a aVar2 = new a(getContext());
        this.f28035b = aVar2;
        setOrientation(1);
        addView(aVar);
        addView(aVar2);
        aVar2.setScaleX(0.5f);
        aVar2.setScaleY(0.5f);
        MethodCollector.o(7413);
    }

    public final void a(b bVar, b bVar2, boolean z) {
        l.d(bVar, "");
        l.d(bVar2, "");
        this.f28034a.a(bVar.f28049a, bVar2.f28049a, z);
        this.f28035b.a(bVar.f28050b, bVar2.f28050b, z);
        setVisibility(0);
    }
}
