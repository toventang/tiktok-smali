package com.ss.android.ad.splash.core.j;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.f.o;
import com.zhiliaoapp.musically.R;

public final class b extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f58633a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f58634b;

    static {
        Covode.recordClassIndex(36355);
    }

    public final void setText(String str) {
        this.f58633a.setText(str);
    }

    public b(Context context) {
        super(context);
        MethodCollector.i(2827);
        TextView textView = new TextView(context);
        this.f58633a = textView;
        textView.setTextSize(1, 15.0f);
        this.f58633a.setTextColor(-1);
        ImageView imageView = new ImageView(context);
        this.f58634b = imageView;
        imageView.setImageResource(R.drawable.bk3);
        this.f58634b.setPadding((int) o.a(context, 8.0f), 0, 0, 0);
        addView(this.f58633a);
        addView(this.f58634b);
        setBackgroundResource(R.drawable.bk4);
        setGravity(17);
        MethodCollector.o(2827);
    }
}
