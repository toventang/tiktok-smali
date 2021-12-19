package com.ss.android.ugc.aweme.tools.draft.l;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.tools.draft.l.d;

public class b extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    private d.c f139814a;

    static {
        Covode.recordClassIndex(91391);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtTextView
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            e.a(e2);
            return null;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        d.c cVar;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            e.a(e2);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            d.c cVar2 = (d.c) a(motionEvent, d.c.class);
            if (cVar2 != null) {
                cVar2.a(true);
                this.f139814a = cVar2;
                return true;
            } else if (a(motionEvent, ClickableSpan.class) != null) {
                return true;
            } else {
                return false;
            }
        } else if (action == 1) {
            d.c cVar3 = this.f139814a;
            if (cVar3 == null || cVar3 != a(motionEvent, d.c.class)) {
                return false;
            }
            this.f139814a.a(false);
            this.f139814a = null;
            return true;
        } else if (action != 2) {
            if (action == 3 && (cVar = this.f139814a) != null) {
                cVar.a(false);
                this.f139814a = null;
            }
            return false;
        } else {
            d.c cVar4 = this.f139814a;
            if (!(cVar4 == null || cVar4 == a(motionEvent, d.c.class))) {
                this.f139814a.a(false);
                this.f139814a = null;
            }
            return false;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private <T extends ClickableSpan> T a(MotionEvent motionEvent, Class<T> cls) {
        if (!(getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) getText();
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        try {
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, cls);
            if (clickableSpanArr.length <= 0) {
                return null;
            }
            ClickableSpan clickableSpan = clickableSpanArr[0];
            if (offsetForHorizontal < spanned.getSpanStart(clickableSpan) || offsetForHorizontal > spanned.getSpanEnd(clickableSpan)) {
                return null;
            }
            return (T) clickableSpanArr[0];
        } catch (Exception unused) {
            return null;
        }
    }
}
