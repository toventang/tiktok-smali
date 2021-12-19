package com.ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class q extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f132666a;

    static {
        Covode.recordClassIndex(86802);
    }

    public q(Context context) {
        this(context, (byte) 0);
    }

    public final void setTagName(String str) {
        this.f132666a.setText(str);
    }

    private q(Context context, byte b2) {
        this(context, (char) 0);
    }

    private q(Context context, char c2) {
        super(context, null, 0);
        MethodCollector.i(11914);
        View inflate = LayoutInflater.from(context).inflate(R.layout.bjn, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f132666a = (TextView) inflate.findViewById(R.id.f8z);
        MethodCollector.o(11914);
    }
}
