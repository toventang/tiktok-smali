package com.bytedance.ies.bullet.service.f.a.c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.a.q;
import h.f.b.m;
import h.m.p;

public final class b {
    static {
        Covode.recordClassIndex(19497);
    }

    public static final class c extends m implements h.f.a.m<Bundle, String, String> {
        static {
            Covode.recordClassIndex(19500);
        }

        public c() {
            super(2);
        }

        public final String invoke(Bundle bundle, String str) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (bundle.containsKey(str)) {
                return bundle.getString(str);
            }
            return null;
        }
    }

    public static final class f extends m implements h.f.a.m<Bundle, String, Integer> {
        static {
            Covode.recordClassIndex(19503);
        }

        public f() {
            super(2);
        }

        public final Integer invoke(Bundle bundle, String str) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (bundle.containsKey(str)) {
                return Integer.valueOf(bundle.getInt(str));
            }
            return null;
        }
    }

    public static final class j extends m implements h.f.a.m<Bundle, String, Float> {
        static {
            Covode.recordClassIndex(19507);
        }

        public j() {
            super(2);
        }

        public final Float invoke(Bundle bundle, String str) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (bundle.containsKey(str)) {
                return Float.valueOf(bundle.getFloat(str));
            }
            return null;
        }
    }

    public static final class l extends m implements h.f.a.m<Bundle, String, Double> {
        static {
            Covode.recordClassIndex(19509);
        }

        public l() {
            super(2);
        }

        public final Double invoke(Bundle bundle, String str) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (bundle.containsKey(str)) {
                return Double.valueOf(bundle.getDouble(str));
            }
            return null;
        }
    }

    public static final class a extends m implements h.f.a.m<Bundle, String, Boolean> {
        static {
            Covode.recordClassIndex(19498);
        }

        public a() {
            super(2);
        }

        public final Boolean invoke(Bundle bundle, String str) {
            boolean z;
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (!bundle.containsKey(str)) {
                return null;
            }
            String string = bundle.getString(str);
            if (string != null) {
                z = h.f.b.l.a((Object) string, (Object) "1");
            } else {
                z = bundle.getBoolean(str);
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class h extends m implements h.f.a.m<Bundle, String, Long> {
        static {
            Covode.recordClassIndex(19505);
        }

        public h() {
            super(2);
        }

        public final Long invoke(Bundle bundle, String str) {
            long j2;
            Long g2;
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            if (!bundle.containsKey(str)) {
                return null;
            }
            String string = bundle.getString(str);
            if (string == null || (g2 = p.g(string)) == null) {
                j2 = bundle.getLong(str);
            } else {
                j2 = g2.longValue();
            }
            return Long.valueOf(j2);
        }
    }

    public static final class d extends m implements q<Bundle, String, String, Bundle> {
        static {
            Covode.recordClassIndex(19501);
        }

        public d() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, String str2) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putString(str, str2);
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$b  reason: collision with other inner class name */
    public static final class C0707b extends m implements q<Bundle, String, Double, Bundle> {
        static {
            Covode.recordClassIndex(19499);
        }

        public C0707b() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Double d2) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putDouble(str, d2.doubleValue());
            return bundle;
        }
    }

    public static final class e extends m implements q<Bundle, String, Boolean, Bundle> {
        static {
            Covode.recordClassIndex(19502);
        }

        public e() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Boolean bool) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putBoolean(str, bool.booleanValue());
            return bundle;
        }
    }

    public static final class g extends m implements q<Bundle, String, Integer, Bundle> {
        static {
            Covode.recordClassIndex(19504);
        }

        public g() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Integer num) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putInt(str, num.intValue());
            return bundle;
        }
    }

    public static final class i extends m implements q<Bundle, String, Long, Bundle> {
        static {
            Covode.recordClassIndex(19506);
        }

        public i() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Long l2) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putLong(str, l2.longValue());
            return bundle;
        }
    }

    public static final class k extends m implements q<Bundle, String, Float, Bundle> {
        static {
            Covode.recordClassIndex(19508);
        }

        public k() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Float f2) {
            h.f.b.l.c(bundle, "");
            h.f.b.l.c(str, "");
            bundle.putFloat(str, f2.floatValue());
            return bundle;
        }
    }
}
