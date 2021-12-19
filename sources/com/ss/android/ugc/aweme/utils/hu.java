package com.ss.android.ugc.aweme.utils;

import android.text.TextPaint;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class hu {

    /* renamed from: a  reason: collision with root package name */
    public static final hu f143076a = new hu();

    /* renamed from: b  reason: collision with root package name */
    private static final h f143077b = i.a((h.f.a.a) a.f143078a);

    private static SparseIntArray a() {
        return (SparseIntArray) f143077b.getValue();
    }

    private hu() {
    }

    static {
        Covode.recordClassIndex(93647);
    }

    static final class a extends m implements h.f.a.a<SparseIntArray> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143078a = new a();

        static {
            Covode.recordClassIndex(93648);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SparseIntArray invoke() {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(10, R.style.xw);
            sparseIntArray.put(11, R.style.xy);
            sparseIntArray.put(12, R.style.y0);
            sparseIntArray.put(13, R.style.y2);
            sparseIntArray.put(14, R.style.y4);
            sparseIntArray.put(15, R.style.y6);
            sparseIntArray.put(16, R.style.y8);
            sparseIntArray.put(17, R.style.y9);
            return sparseIntArray;
        }
    }

    public static void a(TextView textView, int i2, int i3, int i4) {
        l.d(textView, "");
        CharSequence text = textView.getText();
        TextPaint paint = textView.getPaint();
        Integer valueOf = Integer.valueOf(textView.getLayoutParams().width);
        if (valueOf.intValue() > 0 && valueOf != null) {
            i4 = valueOf.intValue();
        }
        int paddingRight = (i4 - textView.getPaddingRight()) - textView.getPaddingLeft();
        if (i3 >= i2) {
            while (true) {
                l.b(paint, "");
                paint.setTextSize(n.b(textView.getContext(), (float) i3));
                if (paint.measureText(text.toString()) >= ((float) paddingRight)) {
                    if (i3 == i2) {
                        break;
                    }
                    i3--;
                } else {
                    androidx.core.widget.h.a(textView, a().get(i3));
                    return;
                }
            }
        }
        androidx.core.widget.h.a(textView, a().get(i2));
    }
}
