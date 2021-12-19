package com.bytedance.android.live.p;

import android.view.ViewGroup;
import com.bytedance.android.live.core.f.y;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.n;

public enum q {
    ICON(R.layout.bc7),
    ICON_WITH_TEXT(R.layout.bc8),
    ICON_TITLE_HORIZONTAL(R.layout.bc9);
    
    private final ViewGroup.MarginLayoutParams iconLayoutParams;
    private final ViewGroup.LayoutParams iconTitleHorizontalLayoutParams = new ViewGroup.LayoutParams(-1, y.a(48.0f));
    private final ViewGroup.LayoutParams iconWithTextLayoutParams = new ViewGroup.LayoutParams(y.a(44.0f), y.a(36.0f));
    private final int layoutId;

    public final int getLayoutId() {
        return this.layoutId;
    }

    public final boolean getHasText() {
        if (this == ICON_WITH_TEXT) {
            return true;
        }
        return false;
    }

    public final boolean getHasTitle() {
        if (this == ICON_TITLE_HORIZONTAL) {
            return true;
        }
        return false;
    }

    public final boolean isPopup() {
        if (this == ICON_TITLE_HORIZONTAL) {
            return true;
        }
        return false;
    }

    public final ViewGroup.LayoutParams getLayoutParams() {
        int i2 = r.f12172a[ordinal()];
        if (i2 == 1) {
            return this.iconLayoutParams;
        }
        if (i2 == 2) {
            return this.iconWithTextLayoutParams;
        }
        if (i2 == 3) {
            return this.iconTitleHorizontalLayoutParams;
        }
        throw new n();
    }

    static {
        Covode.recordClassIndex(6684);
    }

    private q(int i2) {
        this.layoutId = i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(y.a(36.0f), y.a(36.0f));
        marginLayoutParams.leftMargin = y.a(8.0f);
        this.iconLayoutParams = marginLayoutParams;
    }
}
