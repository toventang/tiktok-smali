package com.bytedance.android.livesdk.rank.impl.ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final MarqueeTextView f20950a;

    /* renamed from: b  reason: collision with root package name */
    private final MarqueeTextView f20951b;

    static {
        Covode.recordClassIndex(12393);
    }

    a(MarqueeTextView marqueeTextView, MarqueeTextView marqueeTextView2) {
        this.f20950a = marqueeTextView;
        this.f20951b = marqueeTextView2;
    }

    public final void run() {
        MarqueeTextView marqueeTextView = this.f20950a;
        MarqueeTextView marqueeTextView2 = this.f20951b;
        marqueeTextView.setAlpha(0.0f);
        marqueeTextView.setEllipsize(null);
        marqueeTextView.b();
        marqueeTextView2.setAlpha(1.0f);
        marqueeTextView2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        marqueeTextView2.setMarqueeRepeatLimit(-1);
        marqueeTextView2.a();
    }
}
