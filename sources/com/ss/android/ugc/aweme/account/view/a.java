package com.ss.android.ugc.aweme.account.view;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f65514a;

    /* renamed from: b  reason: collision with root package name */
    private String f65515b;

    static {
        Covode.recordClassIndex(40295);
    }

    public final void dismiss() {
        super.dismiss();
    }

    public final void show() {
        super.show();
        ObjectAnimator.ofFloat(this.f65514a, "alpha", 0.0f, 1.0f).setDuration(300L).start();
    }

    public a(Context context) {
        super(context, R.style.u_);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fx);
        this.f65514a = (LinearLayout) findViewById(R.id.ald);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.alc);
        ((ProgressBar) findViewById(R.id.ale)).getIndeterminateDrawable().setColorFilter(b.c(getContext(), R.color.f159928l), PorterDuff.Mode.MULTIPLY);
        setCanceledOnTouchOutside(false);
        boolean z = !TextUtils.isEmpty(this.f65515b);
        if (tuxTextView == null) {
            return;
        }
        if (z) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText(this.f65515b);
            return;
        }
        tuxTextView.setVisibility(8);
    }

    public a(Context context, String str) {
        this(context);
        this.f65515b = str;
    }
}
