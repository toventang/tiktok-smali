package com.ss.android.ugc.aweme.share.l;

import com.bytedance.covode.number.Covode;

public enum a {
    Default(1, 2131232313),
    H_THREE_POINT(2, 2131232314),
    ARROW(3, 2131232315),
    T_THREE_POINT(4, 2131232316);
    
    private int res;
    private int style;

    public final int getDrawable() {
        return this.res;
    }

    public final int getStyle() {
        return this.style;
    }

    static {
        Covode.recordClassIndex(81472);
    }

    public static a build(int i2) {
        a aVar = Default;
        a aVar2 = H_THREE_POINT;
        if (i2 != aVar2.getStyle()) {
            aVar2 = T_THREE_POINT;
            if (i2 != aVar2.getStyle()) {
                aVar2 = ARROW;
                if (i2 != aVar2.getStyle()) {
                    return aVar;
                }
            }
        }
        return aVar2;
    }

    private a(int i2, int i3) {
        this.style = i2;
        this.res = i3;
    }
}
