package com.ss.android.ugc.aweme.challenge.ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.views.c;

public final class x extends LinkMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static x f70225a;

    /* renamed from: b  reason: collision with root package name */
    private c f70226b;

    static {
        Covode.recordClassIndex(43316);
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
            try {
                c a2 = a(textView, spannable, motionEvent);
                this.f70226b = a2;
                if (a2 != null) {
                    a2.f65525d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f70226b), spannable.getSpanEnd(this.f70226b));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                c a3 = a(textView, spannable, motionEvent);
                c cVar = this.f70226b;
                if (!(cVar == null || a3 == cVar)) {
                    cVar.f65525d = false;
                    this.f70226b = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                e3.printStackTrace();
                return false;
            }
        } else {
            c cVar2 = this.f70226b;
            if (cVar2 != null) {
                cVar2.f65525d = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f70226b = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
