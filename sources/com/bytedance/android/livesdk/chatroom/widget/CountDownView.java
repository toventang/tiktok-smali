package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;

public class CountDownView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Animation f16549a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f16550b;

    /* renamed from: c  reason: collision with root package name */
    public a f16551c;

    /* renamed from: d  reason: collision with root package name */
    int f16552d;

    public interface a {
        static {
            Covode.recordClassIndex(9176);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(9172);
    }

    public void setCountDownListener(a aVar) {
        this.f16551c = aVar;
    }

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(10089);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.q6}, 0, 0);
        this.f16552d = obtainStyledAttributes.getInteger(0, 4000);
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        LiveTextView liveTextView = new LiveTextView(getContext());
        this.f16550b = liveTextView;
        liveTextView.setTypeface(b.a().a(d.f33801g));
        this.f16550b.setTextColor(getResources().getColor(R.color.wk));
        this.f16550b.setTextSize(60.0f);
        this.f16550b.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.f16550b, layoutParams);
        this.f16549a = AnimationUtils.loadAnimation(context2, R.anim.ec);
        MethodCollector.o(10089);
    }
}
