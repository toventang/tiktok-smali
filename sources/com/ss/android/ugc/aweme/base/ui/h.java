package com.ss.android.ugc.aweme.base.ui;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class h extends LinkMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static h f68367a;

    /* renamed from: b  reason: collision with root package name */
    private s f68368b;

    static {
        Covode.recordClassIndex(42095);
    }

    private static boolean a(int i2, Spannable spannable, Object obj) {
        if (i2 < spannable.getSpanStart(obj) || i2 > spannable.getSpanEnd(obj)) {
            return false;
        }
        return true;
    }

    private static s a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY()), (float) x);
        s[] sVarArr = (s[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, s.class);
        if (sVarArr.length <= 0 || !a(offsetForHorizontal, spannable, sVarArr[0])) {
            return null;
        }
        return sVarArr[0];
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            try {
                s a2 = a(textView, spannable, motionEvent);
                this.f68368b = a2;
                if (a2 != null) {
                    a2.f68408a = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f68368b), spannable.getSpanEnd(this.f68368b));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                s a3 = a(textView, spannable, motionEvent);
                s sVar = this.f68368b;
                if (!(sVar == null || a3 == sVar)) {
                    sVar.f68408a = false;
                    this.f68368b = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                e3.printStackTrace();
                return false;
            }
        } else {
            s sVar2 = this.f68368b;
            if (sVar2 != null) {
                sVar2.f68408a = false;
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.f68368b = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
