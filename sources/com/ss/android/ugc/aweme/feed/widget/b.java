package com.ss.android.ugc.aweme.feed.widget;

import android.text.Layout;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.feed.x.z;
import h.f.b.ab;
import h.f.b.l;

public final class b extends ScrollingMovementMethod {

    /* renamed from: a  reason: collision with root package name */
    public static b f95252a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f95253b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f95254c = true;

    /* renamed from: d  reason: collision with root package name */
    private float f95255d;

    static {
        Covode.recordClassIndex(60342);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60343);
        }

        private a() {
        }

        public static b a() {
            MethodCollector.i(8427);
            if (b.f95252a == null) {
                synchronized (ab.a(e.class)) {
                    try {
                        if (b.f95252a == null) {
                            b.f95252a = new b();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(8427);
                        throw th;
                    }
                }
            }
            b bVar = b.f95252a;
            MethodCollector.o(8427);
            return bVar;
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
            if (Math.abs(motionEvent.getY() - this.f95255d) > 10.0f) {
                this.f95254c = false;
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
                    if (this.f95254c) {
                        int lineStart = layout.getLineStart(lineForVertical);
                        int lineEnd = layout.getLineEnd(lineForVertical);
                        TextPaint paint = textView.getPaint();
                        l.b(paint, "");
                        if (f2 <= paint.measureText(textView.getText().subSequence(lineStart, lineEnd).toString())) {
                            l.b(clickableSpanArr, "");
                            ClickableSpan a2 = f.a(clickableSpanArr);
                            if (z.a(a2)) {
                                a2.onClick(textView);
                            }
                        }
                    }
                } else if (action == 0) {
                    this.f95255d = motionEvent.getY();
                    l.b(clickableSpanArr, "");
                    z.a(layout, lineForVertical, scrollX, textView, clickableSpanArr);
                    this.f95254c = true;
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
