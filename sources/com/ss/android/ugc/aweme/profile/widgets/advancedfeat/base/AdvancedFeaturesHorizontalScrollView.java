package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import i.a.a.a.a.b;

public final class AdvancedFeaturesHorizontalScrollView extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    private a f117595a;

    public interface a {
        static {
            Covode.recordClassIndex(76026);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(76025);
    }

    public AdvancedFeaturesHorizontalScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final a getOnScrollListener() {
        return this.f117595a;
    }

    public final void setOnScrollListener(a aVar) {
        this.f117595a = aVar;
    }

    private /* synthetic */ AdvancedFeaturesHorizontalScrollView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdvancedFeaturesHorizontalScrollView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(9197);
        MethodCollector.o(9197);
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        a aVar;
        super.onScrollChanged(i2, i3, i4, i5);
        if (((float) Math.abs(i2 - i4)) > b.a(1.0f) && (aVar = this.f117595a) != null) {
            aVar.a();
        }
    }
}
