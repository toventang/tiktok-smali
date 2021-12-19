package com.ss.android.ugc.aweme.challenge.ui.a;

import android.text.Layout;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;

public final class e implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    private static e f70060a;

    static {
        Covode.recordClassIndex(43219);
    }

    public static e a() {
        if (f70060a == null) {
            f70060a = new e();
        }
        return f70060a;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TextView textView = (TextView) view;
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
        int action = motionEvent.getAction();
        if (action != 1 && action != 0) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) newSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length == 0) {
            return false;
        }
        if (action == 1) {
            clickableSpanArr[0].onClick(textView);
        }
        return true;
    }
}
