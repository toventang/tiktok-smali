package com.ss.android.ugc.aweme.journey.a;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(67219);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.a.a$a  reason: collision with other inner class name */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC2669a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f104803a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CharSequence f104804b;

        static {
            Covode.recordClassIndex(67220);
        }

        public final void onGlobalLayout() {
            int paddingLeft = this.f104803a.getPaddingLeft();
            int paddingRight = this.f104803a.getPaddingRight();
            if (TextUtils.ellipsize(this.f104804b, this.f104803a.getPaint(), (float) (((this.f104803a.getWidth() - paddingLeft) - paddingRight) * this.f104803a.getMaxLines()), TextUtils.TruncateAt.END).length() < this.f104804b.length()) {
                this.f104803a.getLayoutParams().height = this.f104803a.getHeight();
                this.f104803a.setMaxLines(999);
                h.a(this.f104803a, 1, 999, 1, 0);
            }
            this.f104803a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC2669a(TextView textView, CharSequence charSequence) {
            this.f104803a = textView;
            this.f104804b = charSequence;
        }
    }

    public static final void a(TextView textView) {
        l.d(textView, "");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC2669a(textView, textView.getText()));
    }
}
