package com.ss.android.ugc.aweme.im.sdk.common.ui.widget;

import android.content.Context;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.widget.EmojiCompatTuxTextView;

public class SpanInterceptNoTextView extends EmojiCompatTuxTextView {

    /* renamed from: a  reason: collision with root package name */
    CharacterStyle f102566a;

    /* renamed from: b  reason: collision with root package name */
    private GestureDetector f102567b;

    static {
        Covode.recordClassIndex(65684);
    }

    public ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionMode(ActionMode.Callback callback, int i2) {
        return null;
    }

    private CharacterStyle getPressedSpan() {
        CharacterStyle characterStyle = this.f102566a;
        if (characterStyle != null) {
            return characterStyle;
        }
        CharacterStyle charStyle = getCharStyle();
        this.f102566a = charStyle;
        return charStyle;
    }

    /* access modifiers changed from: package-private */
    public CharacterStyle getCharStyle() {
        return new BackgroundColorSpan(getHighlightColor());
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f102567b.onTouchEvent(motionEvent);
    }

    public SpanInterceptNoTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0053, code lost:
        if (r10 != 3) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.MotionEvent r9, int r10) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.SpanInterceptNoTextView.a(android.view.MotionEvent, int):boolean");
    }

    private SpanInterceptNoTextView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, (char) 0);
        getPaint().setUnderlineText(false);
        setTextIsSelectable(true);
        this.f102567b = new GestureDetector(new GestureDetector.SimpleOnGestureListener() {
            /* class com.ss.android.ugc.aweme.im.sdk.common.ui.widget.SpanInterceptNoTextView.AnonymousClass1 */

            /* renamed from: b  reason: collision with root package name */
            private MotionEvent f102569b;

            static {
                Covode.recordClassIndex(65685);
            }

            public final boolean onDown(MotionEvent motionEvent) {
                this.f102569b = motionEvent;
                return SpanInterceptNoTextView.this.a(motionEvent, 0);
            }

            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                return SpanInterceptNoTextView.this.a(this.f102569b, 1);
            }

            public final void onLongPress(MotionEvent motionEvent) {
                SpanInterceptNoTextView.this.a(this.f102569b, 3);
                ((View) SpanInterceptNoTextView.this.getParent()).performLongClick();
            }

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                return SpanInterceptNoTextView.this.a(this.f102569b, 3);
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                return SpanInterceptNoTextView.this.a(this.f102569b, 3);
            }
        });
    }
}
