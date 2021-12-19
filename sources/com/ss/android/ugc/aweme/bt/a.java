package com.ss.android.ugc.aweme.bt;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class a extends BaseMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    private static a f68807a;

    static {
        Covode.recordClassIndex(42379);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(1593);
        if (f68807a == null) {
            synchronized (a.class) {
                try {
                    if (f68807a == null) {
                        f68807a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1593);
                    throw th;
                }
            }
        }
        a aVar = f68807a;
        MethodCollector.o(1593);
        return aVar;
    }

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        ClickableSpan clickableSpan;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(totalPaddingTop + textView.getScrollY()), (float) scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (!(clickableSpanArr == null || clickableSpanArr.length == 0)) {
                if (action == 1 && (clickableSpan = clickableSpanArr[0]) != null) {
                    clickableSpan.onClick(textView);
                }
                return true;
            }
        }
        return false;
    }
}
