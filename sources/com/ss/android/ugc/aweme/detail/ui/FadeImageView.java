package com.ss.android.ugc.aweme.detail.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.k;

public class FadeImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public a f79904a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f79905b;

    public interface a {
        static {
            Covode.recordClassIndex(49704);
        }
    }

    static {
        Covode.recordClassIndex(49703);
    }

    public boolean isSelected() {
        return this.f79905b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a(this);
    }

    public void setListener(a aVar) {
        this.f79904a = aVar;
    }

    public void setSelected(boolean z) {
        this.f79905b = z;
    }

    public FadeImageView(Context context) {
        this(context, null);
    }

    public FadeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private FadeImageView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(4808);
        MethodCollector.o(4808);
    }
}
