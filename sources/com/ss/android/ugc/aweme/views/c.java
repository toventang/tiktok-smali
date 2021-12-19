package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.views.MentionTextView;

public class c extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    private MentionTextView.c f144605a;

    static {
        Covode.recordClassIndex(94622);
    }

    @Override // com.bytedance.ies.dmt.ui.widget.DmtTextView
    public AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e2) {
            a.a("", e2);
            return null;
        }
    }

    public c(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MentionTextView.c cVar;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            a.a("", e2);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            MentionTextView.c cVar2 = (MentionTextView.c) a(motionEvent, MentionTextView.c.class);
            if (cVar2 != null) {
                cVar2.a(true);
                this.f144605a = cVar2;
                return true;
            } else if (a(motionEvent, ClickableSpan.class) != null) {
                return true;
            } else {
                return false;
            }
        } else if (action == 1) {
            MentionTextView.c cVar3 = this.f144605a;
            if (cVar3 == null || cVar3 != a(motionEvent, MentionTextView.c.class)) {
                return false;
            }
            this.f144605a.a(false);
            this.f144605a = null;
            return true;
        } else if (action != 2) {
            if (action == 3 && (cVar = this.f144605a) != null) {
                cVar.a(false);
                this.f144605a = null;
            }
            return false;
        } else {
            MentionTextView.c cVar4 = this.f144605a;
            if (!(cVar4 == null || cVar4 == a(motionEvent, MentionTextView.c.class))) {
                this.f144605a.a(false);
                this.f144605a = null;
            }
            return false;
        }
    }

    public c(Context context, AttributeSet attributeSet) {
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
