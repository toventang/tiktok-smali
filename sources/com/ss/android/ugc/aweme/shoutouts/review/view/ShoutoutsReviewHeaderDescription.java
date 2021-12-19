package com.ss.android.ugc.aweme.shoutouts.review.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ShoutoutsReviewHeaderDescription extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TuxTextView f133452a;

    static {
        Covode.recordClassIndex(87276);
    }

    public ShoutoutsReviewHeaderDescription(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.e3g);
        l.b(findViewById, "");
        this.f133452a = (TuxTextView) findViewById;
    }

    public final void setDescription(String str) {
        l.d(str, "");
        if (!TextUtils.isEmpty(str)) {
            setVisibility(0);
            TuxTextView tuxTextView = this.f133452a;
            if (tuxTextView == null) {
                l.a("tvDescription");
            }
            tuxTextView.setText(str);
        }
    }

    private /* synthetic */ ShoutoutsReviewHeaderDescription(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShoutoutsReviewHeaderDescription(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(1592);
        MethodCollector.o(1592);
    }
}
