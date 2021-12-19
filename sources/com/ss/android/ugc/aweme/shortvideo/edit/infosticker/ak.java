package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    static int f127125a;

    /* renamed from: b  reason: collision with root package name */
    public static int f127126b = 100;

    /* renamed from: c  reason: collision with root package name */
    public static final ak f127127c = new ak();

    /* renamed from: d  reason: collision with root package name */
    private static t<Integer> f127128d = new t<>();

    private ak() {
    }

    static {
        Covode.recordClassIndex(83394);
    }

    public static int a() {
        int i2 = f127125a + 1;
        f127125a = i2;
        int i3 = f127126b;
        if (i2 > i3) {
            int i4 = i3 + 50;
            f127126b = i4;
            f127128d.setValue(Integer.valueOf(i4));
        }
        return f127125a;
    }
}
