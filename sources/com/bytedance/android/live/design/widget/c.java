package com.bytedance.android.live.design.widget;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.util.FontSpan;
import com.bytedance.ies.dmt.ui.widget.util.a;
import com.bytedance.ies.dmt.ui.widget.util.d;
import com.zhiliaoapp.musically.R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f9592a;

    /* renamed from: b  reason: collision with root package name */
    private static final SparseIntArray f9593b;

    /* renamed from: c  reason: collision with root package name */
    private static final SparseIntArray f9594c;

    static {
        Covode.recordClassIndex(4864);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9592a = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f9593b = sparseIntArray2;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f9594c = sparseIntArray3;
        sparseIntArray.put(0, R.style.k0);
        sparseIntArray.put(1, R.style.k3);
        sparseIntArray.put(2, R.style.k6);
        sparseIntArray.put(3, R.style.k9);
        sparseIntArray.put(4, R.style.kb);
        sparseIntArray.put(5, R.style.ke);
        sparseIntArray.put(6, R.style.kh);
        sparseIntArray.put(7, R.style.kk);
        sparseIntArray.put(8, R.style.kn);
        sparseIntArray2.put(0, R.dimen.zs);
        sparseIntArray2.put(1, R.dimen.zt);
        sparseIntArray2.put(2, R.dimen.zu);
        sparseIntArray2.put(3, R.dimen.zv);
        sparseIntArray2.put(4, R.dimen.zw);
        sparseIntArray2.put(5, R.dimen.zx);
        sparseIntArray2.put(6, R.dimen.zy);
        sparseIntArray2.put(7, R.dimen.zz);
        sparseIntArray2.put(8, R.dimen.a00);
        sparseIntArray3.put(0, R.dimen.zj);
        sparseIntArray3.put(1, R.dimen.zk);
        sparseIntArray3.put(2, R.dimen.zl);
        sparseIntArray3.put(3, R.dimen.zm);
        sparseIntArray3.put(4, R.dimen.zn);
        sparseIntArray3.put(5, R.dimen.zo);
        sparseIntArray3.put(6, R.dimen.zp);
        sparseIntArray3.put(7, R.dimen.zq);
        sparseIntArray3.put(8, R.dimen.zr);
    }

    private static Typeface b(int i2) {
        return a.a().a(a(i2));
    }

    private static String a(int i2) {
        if (i2 == 700) {
            return d.f33796b;
        }
        if (i2 == 600) {
            return d.f33801g;
        }
        return d.f33795a;
    }

    public static void a(TextView textView, int i2) {
        if (textView != null) {
            textView.setTypeface(b(i2));
        }
    }

    public static void a(Context context, Paint paint, int i2, int i3) {
        if (context != null && paint != null) {
            paint.setTextSize((float) context.getResources().getDimensionPixelSize(f9593b.get(i2)));
            paint.setTypeface(b(i3));
        }
    }

    public static void a(Spannable spannable, int i2, int i3, int i4) {
        if (spannable != null) {
            spannable.setSpan(new FontSpan(a(i4)), i2, i3, 33);
        }
    }

    public static void a(Context context, Spannable spannable, int i2, int i3, int i4, int i5) {
        if (context != null) {
            spannable.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(f9593b.get(i4))), i2, i3, 33);
        }
        a(spannable, i2, i3, i5);
    }
}
