package com.ss.android.ugc.playerkit.c;

import android.text.TextUtils;
import androidx.c.e;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f148655a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f148656b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile e<String, List<a>> f148657c = new e<>(4);

    /* renamed from: d  reason: collision with root package name */
    public static a f148658d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f148659a;

        /* renamed from: b  reason: collision with root package name */
        String f148660b;

        static {
            Covode.recordClassIndex(97973);
        }

        public final int hashCode() {
            return this.f148659a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass() && this.f148659a == ((a) obj).f148659a) {
                return true;
            }
            return false;
        }

        public a(int i2, String str) {
            this.f148659a = i2;
            this.f148660b = str;
        }
    }

    static {
        Covode.recordClassIndex(97972);
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str) && f148657c.a(str) == null) {
            f148657c.a(str, new CopyOnWriteArrayList());
        }
    }
}
