package com.ss.android.ugc.aweme.relation.b;

import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.core.widget.h;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(78292);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.a$a  reason: collision with other inner class name */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC3107a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f120342a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CharSequence f120343b;

        static {
            Covode.recordClassIndex(78293);
        }

        public final void onGlobalLayout() {
            int paddingLeft = this.f120342a.getPaddingLeft();
            int paddingRight = this.f120342a.getPaddingRight();
            if (TextUtils.ellipsize(this.f120343b, this.f120342a.getPaint(), (float) (((this.f120342a.getWidth() - paddingLeft) - paddingRight) * this.f120342a.getMaxLines()), TextUtils.TruncateAt.END).length() < this.f120343b.length()) {
                this.f120342a.getLayoutParams().height = this.f120342a.getHeight();
                this.f120342a.setMaxLines(999);
                h.a(this.f120342a, 1, 999, 1, 0);
            }
            this.f120342a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC3107a(TextView textView, CharSequence charSequence) {
            this.f120342a = textView;
            this.f120343b = charSequence;
        }
    }

    public static final void a(TextView textView) {
        l.d(textView, "");
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC3107a(textView, textView.getText()));
    }
}
