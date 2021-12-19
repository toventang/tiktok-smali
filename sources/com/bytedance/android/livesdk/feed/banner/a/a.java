package com.bytedance.android.livesdk.feed.banner.a;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.p;
import com.bytedance.android.livesdk.model.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    HSImageView f17289a;

    /* renamed from: b  reason: collision with root package name */
    TextView f17290b;

    /* renamed from: c  reason: collision with root package name */
    TextView f17291c;

    /* renamed from: d  reason: collision with root package name */
    Context f17292d;

    /* renamed from: e  reason: collision with root package name */
    n f17293e;

    /* renamed from: f  reason: collision with root package name */
    String f17294f;

    /* renamed from: g  reason: collision with root package name */
    int f17295g;

    /* renamed from: h  reason: collision with root package name */
    private p f17296h;

    static {
        Covode.recordClassIndex(9593);
    }

    public a(View view, Context context, String str, p pVar, int i2) {
        this.f17289a = (HSImageView) view.findViewById(R.id.bm4);
        this.f17290b = (TextView) view.findViewById(R.id.text);
        this.f17291c = (TextView) view.findViewById(R.id.c46);
        this.f17289a.setOnClickListener(new b(this));
        this.f17292d = context;
        this.f17294f = str;
        this.f17296h = pVar;
        this.f17295g = i2;
    }
}
