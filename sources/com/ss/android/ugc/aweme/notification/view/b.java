package com.ss.android.ugc.aweme.notification.view;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.views.c;

public final class b extends LinkMovementMethod {

    /* renamed from: d  reason: collision with root package name */
    public static b f113932d;

    /* renamed from: a  reason: collision with root package name */
    public c f113933a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f113934b = false;

    /* renamed from: c  reason: collision with root package name */
    public View f113935c;

    /* renamed from: e  reason: collision with root package name */
    private final long f113936e = ((long) (ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout()));

    /* renamed from: f  reason: collision with root package name */
    private Runnable f113937f = new Runnable() {
        /* class com.ss.android.ugc.aweme.notification.view.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(73260);
        }

        public final void run() {
            if (b.this.f113933a == null) {
                b.this.f113934b = true;
                if (b.this.f113935c != null) {
                    View view = b.this.f113935c;
                    ViewGroup viewGroup = view;
                    if (view != null) {
                        while (viewGroup.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                            boolean performLongClick = viewGroup2.performLongClick();
                            viewGroup = viewGroup2;
                            if (performLongClick) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(73259);
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

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: android.view.ViewGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        this.f113935c = textView;
        if (motionEvent.getAction() == 0) {
            try {
                this.f113933a = a(textView, spannable, motionEvent);
                this.f113934b = false;
                textView.getHandler().removeCallbacks(this.f113937f);
                textView.postDelayed(this.f113937f, this.f113936e);
                c cVar = this.f113933a;
                if (cVar != null) {
                    cVar.f65525d = true;
                    Selection.setSelection(spannable, spannable.getSpanStart(this.f113933a), spannable.getSpanEnd(this.f113933a));
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e2.printStackTrace();
                return false;
            }
        } else if (motionEvent.getAction() == 2) {
            try {
                c a2 = a(textView, spannable, motionEvent);
                c cVar2 = this.f113933a;
                if (!(cVar2 == null || a2 == cVar2)) {
                    cVar2.f65525d = false;
                    this.f113933a = null;
                    Selection.removeSelection(spannable);
                }
            } catch (ArrayIndexOutOfBoundsException e3) {
                e3.printStackTrace();
                return false;
            }
        } else {
            textView.getHandler().removeCallbacks(this.f113937f);
            if (motionEvent.getAction() == 1 && !this.f113934b) {
                c cVar3 = this.f113933a;
                TextView textView2 = textView;
                if (cVar3 == null) {
                    while (true) {
                        if (!(textView2.getParent() instanceof ViewGroup)) {
                            break;
                        }
                        ViewGroup viewGroup = (ViewGroup) textView2.getParent();
                        boolean hasOnClickListeners = viewGroup.hasOnClickListeners();
                        textView2 = viewGroup;
                        if (hasOnClickListeners) {
                            viewGroup.performClick();
                            break;
                        }
                    }
                } else {
                    cVar3.f65525d = false;
                    super.onTouchEvent(textView, spannable, motionEvent);
                }
            }
            c cVar4 = this.f113933a;
            if (cVar4 != null) {
                cVar4.f65525d = false;
            }
            this.f113934b = false;
            this.f113933a = null;
            this.f113935c = null;
            Selection.removeSelection(spannable);
        }
        return true;
    }
}
