package com.bytedance.tux.extension.player.a;

import com.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Arrays;
import java.util.Locale;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f44930a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(27423);
    }

    public static String a(int i2) {
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            if (i6 >= 10) {
                Locale locale = Locale.ENGLISH;
                l.a((Object) locale, "");
                String a2 = a.a(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
                l.a((Object) a2, "");
                return a2;
            } else if (i6 < 10) {
                Locale locale2 = Locale.ENGLISH;
                l.a((Object) locale2, "");
                String a3 = a.a(locale2, "%1d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
                l.a((Object) a3, "");
                return a3;
            }
        }
        Locale locale3 = Locale.ENGLISH;
        l.a((Object) locale3, "");
        String a4 = a.a(locale3, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
        l.a((Object) a4, "");
        return a4;
    }

    public static String a(int i2, int i3) {
        return a((int) ((((float) i3) / 100.0f) * ((float) i2)));
    }
}
