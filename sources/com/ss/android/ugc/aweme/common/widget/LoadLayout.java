package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public class LoadLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f76524a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f76525b;

    /* renamed from: c  reason: collision with root package name */
    private Animation f76526c;

    static {
        Covode.recordClassIndex(47249);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        MethodCollector.i(13185);
        super.onFinishInflate();
        this.f76524a = (ImageView) findViewById(R.id.ci1);
        this.f76525b = (TextView) findViewById(R.id.ci7);
        this.f76526c = AnimationUtils.loadAnimation(getContext(), R.anim.cw);
        MethodCollector.o(13185);
    }

    public void setLoadingText(int i2) {
        this.f76525b.setText(i2);
    }

    public void setLoadingText(String str) {
        this.f76525b.setText(str);
    }

    public void setLoadingViewSize(int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.f76524a.setLayoutParams(layoutParams);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            this.f76524a.startAnimation(this.f76526c);
        } else {
            this.f76524a.clearAnimation();
        }
    }

    public LoadLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private LoadLayout(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(13101);
        MethodCollector.o(13101);
    }
}
