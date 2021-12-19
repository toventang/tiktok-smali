package com.google.android.gms.common.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class p {
    static {
        Covode.recordClassIndex(31417);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f50428a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f50429b;

        static {
            Covode.recordClassIndex(31418);
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(100).append(this.f50429b.getClass().getSimpleName()).append('{');
            int size = this.f50428a.size();
            for (int i2 = 0; i2 < size; i2++) {
                append.append(this.f50428a.get(i2));
                if (i2 < size - 1) {
                    append.append(", ");
                }
            }
            return append.append('}').toString();
        }

        private a(Object obj) {
            this.f50429b = r.a(obj);
            this.f50428a = new ArrayList();
        }

        /* synthetic */ a(Object obj, byte b2) {
            this(obj);
        }

        public final a a(String str, Object obj) {
            List<String> list = this.f50428a;
            String str2 = (String) r.a((Object) str);
            String valueOf = String.valueOf(obj);
            list.add(new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length()).append(str2).append("=").append(valueOf).toString());
            return this;
        }
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a a(Object obj) {
        return new a(obj, (byte) 0);
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }
}
