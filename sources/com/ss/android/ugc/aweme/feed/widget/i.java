package com.ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class i extends BaseMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    private static i f95272a;

    static {
        Covode.recordClassIndex(60351);
    }

    public static i a() {
        if (f95272a == null) {
            f95272a = new i();
        }
        return f95272a;
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
            float f2 = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f2);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0 && action == 1) {
                if (f2 >= ((float) textView.getWidth()) - textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                    f.a(clickableSpanArr).onClick(textView);
                }
            }
        }
        return true;
    }
}
