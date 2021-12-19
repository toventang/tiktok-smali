package com.ss.android.ugc.aweme.account.views;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class a extends LinkMovementMethod {

    /* renamed from: b  reason: collision with root package name */
    private static a f65518b;

    /* renamed from: a  reason: collision with root package name */
    private c f65519a;

    static {
        Covode.recordClassIndex(40299);
    }

    public static MovementMethod a() {
        if (f65518b == null) {
            f65518b = new a();
        }
        return f65518b;
    }

    private static boolean a(int i2, Spannable spannable, Object obj) {
        if (i2 < spannable.getSpanStart(obj) || i2 > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    private static c a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        c[] cVarArr = (c[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, c.class);
        if (cVarArr.length <= 0 || !a(offsetForHorizontal, spannable, cVarArr[0])) {
            return null;
        }
        return cVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            c a2 = a(textView, spannable, motionEvent);
            this.f65519a = a2;
            if (a2 != null) {
                a2.f65525d = true;
                Selection.setSelection(spannable, spannable.getSpanStart(this.f65519a), spannable.getSpanEnd(this.f65519a));
            }
        } else if (motionEvent.getAction() == 2) {
            c a3 = a(textView, spannable, motionEvent);
            c cVar = this.f65519a;
            if (!(cVar == null || a3 == cVar)) {
                cVar.f65525d = false;
                this.f65519a = null;
                Selection.removeSelection(spannable);
            }
        } else {
            c cVar2 = this.f65519a;
            if (cVar2 != null) {
                cVar2.f65525d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f65519a = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
