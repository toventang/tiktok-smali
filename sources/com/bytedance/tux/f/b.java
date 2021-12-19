package com.bytedance.tux.f;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.f.a.a;
import h.f.b.l;

public final class b extends BaseMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static final b f45048a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(27485);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        Integer valueOf;
        if (textView == null || spannable == null) {
            return super.onTouchEvent(textView, spannable, motionEvent);
        }
        if (!(motionEvent == null || (valueOf = Integer.valueOf(motionEvent.getAction())) == null || (valueOf.intValue() != 1 && valueOf.intValue() != 0))) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            l.a((Object) clickableSpanArr, "");
            boolean z = false;
            if (clickableSpanArr.length == 0) {
                Selection.removeSelection(spannable);
            } else {
                ClickableSpan clickableSpan = clickableSpanArr[0];
                if (clickableSpan instanceof a.AbstractC1104a) {
                    if (valueOf.intValue() == 1) {
                        ((a.AbstractC1104a) clickableSpan).b(textView, spannable);
                    } else if (valueOf.intValue() == 0) {
                        ((a.AbstractC1104a) clickableSpan).a(textView, spannable);
                    }
                    z = true;
                }
                if (valueOf.intValue() == 1) {
                    clickableSpan.onClick(textView);
                }
                if (z) {
                    textView.invalidate();
                }
                return true;
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
