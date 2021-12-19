package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.b;
import androidx.core.h.v;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DoubleColorBallAnimationView;
import com.zhiliaoapp.musically.R;

public final class k extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private DoubleColorBallAnimationView f22623a = ((DoubleColorBallAnimationView) findViewById(R.id.kq));

    /* renamed from: b  reason: collision with root package name */
    private TextView f22624b = ((TextView) findViewById(R.id.ek7));

    static {
        Covode.recordClassIndex(13362);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            this.f22623a.a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f22623a.b();
    }

    public final void setMessage(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f22624b.setText(getContext().getString(R.string.gs3));
        } else {
            this.f22624b.setText(charSequence);
        }
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            this.f22623a.a();
        } else if (this.f22623a.f33607a) {
            this.f22623a.b();
        }
    }

    public k(Context context) {
        super(context);
        MethodCollector.i(10785);
        inflate(getContext(), R.layout.bc6, this);
        setOrientation(1);
        v.a(this, b.a(getContext(), (int) R.drawable.bux));
        int b2 = (int) n.b(getContext(), 16.0f);
        setPadding(b2, b2, b2, b2);
        MethodCollector.o(10785);
    }
}
