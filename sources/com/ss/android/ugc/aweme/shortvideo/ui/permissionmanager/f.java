package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.b;
import com.ss.android.ugc.aweme.port.in.c;
import h.a.n;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public final class f {
    static {
        Covode.recordClassIndex(86399);
    }

    public static final boolean a() {
        return a("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static final boolean a(String str) {
        l.d(str, "");
        return a(new String[]{str});
    }

    public static final String[] b(String[] strArr) {
        l.d(strArr, "");
        return a(strArr, c(strArr));
    }

    public static final boolean a(int[] iArr) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] c(String[] strArr) {
        l.d(strArr, "");
        Context a2 = b.a();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(androidx.core.content.b.a(a2, str)));
        }
        return n.e((Collection<Integer>) arrayList);
    }

    public static final boolean a(String[] strArr) {
        l.d(strArr, "");
        return a(c(strArr));
    }

    public static final boolean a(Activity activity, String[] strArr) {
        boolean z;
        l.d(activity, "");
        l.d(strArr, "");
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            }
            String str = strArr[i2];
            if (androidx.core.content.b.a(activity, str) != 0 && !a.a(activity, str)) {
                z = false;
                break;
            }
            i2++;
        }
        if (!c.D.c().a() || !z) {
            return false;
        }
        return true;
    }

    public static final p<String, Boolean>[] b(String[] strArr, int[] iArr) {
        boolean z;
        if (strArr == null || strArr.length == 0 || iArr == null || iArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            if (i3 <= iArr.length) {
                if (iArr[i3] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new p(str, Boolean.valueOf(z)));
            }
            i2++;
            i3 = i4;
        }
        Object[] array = arrayList.toArray(new p[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (p[]) array;
    }

    public static final String[] a(String[] strArr, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        if (!(iArr == null || strArr == null)) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                int i5 = i3 + 1;
                if (i3 <= strArr.length && i4 == -1) {
                    arrayList.add(strArr[i3]);
                }
                i2++;
                i3 = i5;
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
