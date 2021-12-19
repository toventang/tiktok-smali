package com.ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.BaseMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.x.z;

public final class a extends BaseMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    private static a f95251a;

    static {
        Covode.recordClassIndex(60341);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(8093);
        if (f95251a == null) {
            synchronized (d.class) {
                try {
                    if (f95251a == null) {
                        f95251a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8093);
                    throw th;
                }
            }
        }
        a aVar = f95251a;
        MethodCollector.o(8093);
        return aVar;
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
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (f2 <= textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString())) {
                        ClickableSpan a2 = f.a(clickableSpanArr);
                        if (z.a(a2)) {
                            a2.onClick(textView);
                        }
                    }
                } else if (action == 0) {
                    z.a(layout, lineForVertical, scrollX, textView, clickableSpanArr);
                }
            }
        }
        return true;
    }
}
