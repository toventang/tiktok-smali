package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.AVTextView;
import h.f.b.l;

public final class AlwaysMarqueeTextView extends AVTextView {
    static {
        Covode.recordClassIndex(94557);
    }

    public final boolean isFocused() {
        return true;
    }

    private final boolean a() {
        int right = ((getRight() - getLeft()) - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        if (right > 0) {
            Layout layout = getLayout();
            Float f2 = null;
            if (!(layout == null || Float.valueOf(layout.getLineWidth(0)) == null)) {
                Layout layout2 = getLayout();
                if (layout2 == null || (f2 = Float.valueOf(layout2.getLineWidth(0))) == null) {
                    l.b();
                }
                if (f2.floatValue() > ((float) right)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void a(boolean z) {
        setSelected(!z);
        setSelected(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            a(a());
        } else {
            setSelected(false);
        }
    }

    public AlwaysMarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i2, Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z) {
            a(a());
        } else {
            setSelected(false);
        }
    }
}
