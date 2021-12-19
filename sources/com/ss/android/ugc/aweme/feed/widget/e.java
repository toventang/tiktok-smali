package com.ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e extends ScrollingMovementMethod {
    static {
        Covode.recordClassIndex(60346);
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        l.d(textView, "");
        l.d(spannable, "");
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            l.b(layout, "");
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    l.b(clickableSpanArr, "");
                    f.a(clickableSpanArr).onClick(textView);
                }
                return true;
            }
            Selection.removeSelection(spannable);
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
