package com.ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class j extends ScrollingMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static j f95273a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f95274b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f95275c = true;

    /* renamed from: d  reason: collision with root package name */
    private float f95276d;

    static {
        Covode.recordClassIndex(60352);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60353);
        }

        private a() {
        }

        public static j a() {
            if (j.f95273a == null) {
                j.f95273a = new j();
            }
            return j.f95273a;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        l.d(textView, "");
        l.d(spannable, "");
        l.d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 2) {
            if (Math.abs(motionEvent.getY() - this.f95276d) > 10.0f) {
                this.f95275c = false;
            }
        } else if (action == 1 || action == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int totalPaddingLeft = x - textView.getTotalPaddingLeft();
            int totalPaddingTop = y - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            Layout layout = textView.getLayout();
            l.b(layout, "");
            int lineForVertical = layout.getLineForVertical(totalPaddingTop + textView.getScrollY());
            float f2 = (float) scrollX;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f2);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                if (action == 1) {
                    if (this.f95275c) {
                        int lineStart = layout.getLineStart(lineForVertical);
                        int lineEnd = layout.getLineEnd(lineForVertical);
                        TextPaint paint = textView.getPaint();
                        l.b(paint, "");
                        if (f2 >= ((float) textView.getWidth()) - paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                            l.b(clickableSpanArr, "");
                            f.a(clickableSpanArr).onClick(textView);
                        }
                    }
                } else if (action == 0) {
                    this.f95276d = motionEvent.getY();
                    this.f95275c = true;
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
