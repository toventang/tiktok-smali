package com.ss.android.ugc.aweme.trending.ui;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f141122a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(92148);
    }

    public static Integer a(Integer num) {
        if (num == null) {
            return null;
        }
        if (num.intValue() == 1) {
            return Integer.valueOf((int) R.raw.icon_fire_2_fill);
        }
        if (num.intValue() == 2) {
            return Integer.valueOf((int) R.raw.icon_arrow_up_line_fill);
        }
        num.intValue();
        return null;
    }
}
