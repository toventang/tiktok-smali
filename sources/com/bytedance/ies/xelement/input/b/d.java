package com.bytedance.ies.xelement.input.b;

import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spannable;
import com.bytedance.covode.number.Covode;
import h.a.i;
import h.f.a;
import h.f.b.l;
import h.k.c;

public final class d<T> implements SpanWatcher {

    /* renamed from: a  reason: collision with root package name */
    private int f37135a;

    /* renamed from: b  reason: collision with root package name */
    private int f37136b;

    /* renamed from: c  reason: collision with root package name */
    private final c<T> f37137c;

    static {
        Covode.recordClassIndex(22338);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
    }

    public d(c<T> cVar) {
        l.c(cVar, "");
        this.f37137c = cVar;
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
        Object[] spans;
        Object d2;
        Object[] spans2;
        Object d3;
        if (l.a(obj, Selection.SELECTION_END) && this.f37136b != i4) {
            this.f37136b = i4;
            if (!(spannable == null || (spans2 = spannable.getSpans(i4, i5, a.a(this.f37137c))) == null || (d3 = i.d(spans2)) == null)) {
                int spanStart = spannable.getSpanStart(d3);
                int spanEnd = spannable.getSpanEnd(d3);
                if (Math.abs(this.f37136b - spanEnd) <= Math.abs(this.f37136b - spanStart)) {
                    spanStart = spanEnd;
                }
                Selection.setSelection(spannable, Selection.getSelectionStart(spannable), spanStart);
            }
        }
        if (obj == Selection.SELECTION_START && this.f37135a != i4) {
            this.f37135a = i4;
            if (spannable != null && (spans = spannable.getSpans(i4, i5, a.a(this.f37137c))) != null && (d2 = i.d(spans)) != null) {
                int spanStart2 = spannable.getSpanStart(d2);
                int spanEnd2 = spannable.getSpanEnd(d2);
                if (Math.abs(this.f37135a - spanEnd2) <= Math.abs(this.f37135a - spanStart2)) {
                    spanStart2 = spanEnd2;
                }
                Selection.setSelection(spannable, spanStart2, Selection.getSelectionEnd(spannable));
            }
        }
    }
}
