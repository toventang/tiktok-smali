package com.bytedance.android.live.liveinteract.cohost.a.e;

import com.bytedance.covode.number.Covode;
import java.util.Locale;

public final class e {
    static {
        Covode.recordClassIndex(5349);
    }

    public static String a(long j2) {
        return com.a.a(Locale.US, "%02d", new Object[]{Long.valueOf(j2 / 60)});
    }

    public static String b(long j2) {
        return com.a.a(Locale.US, "%02d", new Object[]{Long.valueOf(j2 % 60)});
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10180a;

        /* renamed from: b  reason: collision with root package name */
        public int f10181b;

        static {
            Covode.recordClassIndex(5350);
        }

        public a(int i2, int i3) {
            this.f10180a = i2;
            this.f10181b = i3;
        }
    }
}
