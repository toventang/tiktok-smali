package com.bytedance.android.live.design.widget.a;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f9586a = ((TextView) findViewById(R.id.cd8));

    static {
        Covode.recordClassIndex(4857);
    }

    public final void setText(int i2) {
        this.f9586a.setText(i2);
    }

    public final void setText(CharSequence charSequence) {
        this.f9586a.setText(charSequence);
    }

    public a(Context context) {
        super(context);
        MethodCollector.i(4569);
        inflate(getContext(), R.layout.ajw, this);
        setOrientation(0);
        setGravity(17);
        MethodCollector.o(4569);
    }
}
