package com.ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.zhiliaoapp.musically.R;

public class i extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    LinearLayout f144621a;

    /* renamed from: b  reason: collision with root package name */
    ProgressBar f144622b;

    /* renamed from: c  reason: collision with root package name */
    DmtTextView f144623c;

    /* renamed from: d  reason: collision with root package name */
    private String f144624d;

    static {
        Covode.recordClassIndex(94629);
    }

    public void dismiss() {
        super.dismiss();
        LinearLayout linearLayout = this.f144621a;
        ObjectAnimator.ofFloat(linearLayout, "alpha", linearLayout.getAlpha(), 0.0f).setDuration(300L).addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.views.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94630);
            }

            public final void onAnimationEnd(Animator animator) {
            }
        });
    }

    public void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f144621a, "alpha", 0.0f, 1.0f).setDuration(300L).start();
    }

    public i(Context context) {
        super(context, R.style.fm);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.x4);
        this.f144621a = (LinearLayout) findViewById(R.id.ck_);
        this.f144622b = (ProgressBar) findViewById(R.id.dc1);
        this.f144623c = (DmtTextView) findViewById(R.id.ci7);
        this.f144622b.getIndeterminateDrawable().setColorFilter(b.c(getContext(), R.color.f159928l), PorterDuff.Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        if (!TextUtils.isEmpty(this.f144624d)) {
            n.a(this.f144623c, this.f144624d);
        }
    }

    public i(Context context, String str) {
        this(context);
        this.f144624d = str;
    }
}
