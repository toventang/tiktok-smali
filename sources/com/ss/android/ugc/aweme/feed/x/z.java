package com.ss.android.ugc.aweme.feed.x;

import android.text.Layout;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.feed.widget.f;
import h.f.b.l;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f95371a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f95372b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f95373c = new int[2];

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f95374d = new int[2];

    /* renamed from: e  reason: collision with root package name */
    public static final z f95375e = new z();

    /* renamed from: f  reason: collision with root package name */
    private static boolean f95376f = true;

    /* renamed from: g  reason: collision with root package name */
    private static int f95377g;

    private z() {
    }

    static {
        Covode.recordClassIndex(60396);
        int a2 = b.a().a(true, "feed_palm_rejection_2", 0);
        if (a2 == 1) {
        } else if (a2 != 2) {
            return;
        }
    }

    public static boolean a(ClickableSpan clickableSpan) {
        l.d(clickableSpan, "");
        if (!f95376f || f95377g == 0) {
            return true;
        }
        clickableSpan.hashCode();
        if (f95377g == clickableSpan.hashCode()) {
            return true;
        }
        return false;
    }

    public static void a(Layout layout, int i2, int i3, TextView textView, ClickableSpan[] clickableSpanArr) {
        l.d(layout, "");
        l.d(textView, "");
        l.d(clickableSpanArr, "");
        if (f95376f) {
            int lineStart = layout.getLineStart(i2);
            int lineEnd = layout.getLineEnd(i2);
            TextPaint paint = textView.getPaint();
            l.b(paint, "");
            if (((float) i3) <= paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                ClickableSpan a2 = f.a(clickableSpanArr);
                f95377g = a2.hashCode();
                a2.hashCode();
            }
        }
    }
}
