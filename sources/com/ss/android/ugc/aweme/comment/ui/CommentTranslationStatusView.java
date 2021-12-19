package com.ss.android.ugc.aweme.comment.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

public class CommentTranslationStatusView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f72480a;

    /* renamed from: b  reason: collision with root package name */
    private ObjectAnimator f72481b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f72482c;

    /* renamed from: d  reason: collision with root package name */
    private TuxTextView f72483d;

    static {
        Covode.recordClassIndex(44674);
    }

    public void setLoadingText(int i2) {
        this.f72483d.setText(i2);
    }

    public void setLoading(boolean z) {
        int i2;
        if (this.f72482c != z) {
            if (z) {
                this.f72481b.start();
                i2 = 0;
            } else {
                this.f72481b.cancel();
                i2 = 8;
            }
            setVisibility(i2);
            this.f72482c = z;
        }
    }

    public CommentTranslationStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private CommentTranslationStatusView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        MethodCollector.i(771);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f72480a = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f72480a.setOrientation(0);
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(2131231208);
        ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.f72481b = duration;
        duration.setInterpolator(new LinearInterpolator());
        this.f72481b.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        this.f72480a.addView(imageView);
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.bg);
        this.f72483d = tuxTextView;
        tuxTextView.setText(R.string.amp);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) n.b(getContext(), 1.0f);
        layoutParams2.gravity = 16;
        this.f72483d.setLayoutParams(layoutParams2);
        this.f72480a.addView(this.f72483d);
        addView(this.f72480a);
        setLoading(false);
        MethodCollector.o(771);
    }
}
