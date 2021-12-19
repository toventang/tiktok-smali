package com.ss.ttm.player;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    static String f152094a;

    /* renamed from: b  reason: collision with root package name */
    static String f152095b = "libttmplayer.so";

    /* renamed from: c  reason: collision with root package name */
    static String f152096c;

    /* renamed from: d  reason: collision with root package name */
    static String f152097d = "ttplayer_crash.log";

    /* renamed from: e  reason: collision with root package name */
    static String f152098e;

    /* renamed from: f  reason: collision with root package name */
    private static String f152099f;

    /* renamed from: g  reason: collision with root package name */
    private static final SparseArray<c> f152100g = new SparseArray<>();

    static {
        Covode.recordClassIndex(101367);
        b(13, 1);
        b(14, "999.999.999.9");
        b(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        a(0, false);
        a(1, true);
        a(2, true);
        a(3, false);
        a(4, false);
        a(5, false);
        a(6, false);
        a(7, false);
        a(8, false);
        b(10, 0);
        a(11, false);
        b(18, 2);
        b(25, 32);
    }

    public static final boolean a() {
        if (a(6, 0) == 1) {
            return true;
        }
        if (a(1, 0) == 0) {
            return false;
        }
        if (a(11, 0) == 1) {
            return true;
        }
        if (a(7, 0) == 1 || a(8, 0) == 1 || a(10, 0) >= 3) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: b  reason: collision with root package name */
        public int f152103b = -1;

        static {
            Covode.recordClassIndex(101370);
        }

        protected c(int i2) {
            this.f152103b = i2;
        }
    }

    public static Context b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static File c(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    public static final String d(Context context) {
        if (context != null && f152094a == null) {
            f152094a = c(b(context)).getAbsolutePath();
        }
        String str = f152099f;
        if (str != null) {
            return str;
        }
        String str2 = f152094a;
        if (str2 != null) {
            return str2;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = c(b(context)).getAbsolutePath();
            f152094a = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String a(Context context) {
        String str = f152094a;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = c(b(context)).getAbsolutePath();
            f152094a = absolutePath;
            return absolutePath;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean a(int i2) {
        c cVar = f152100g.get(i2);
        if (cVar == null || !(cVar instanceof a) || ((a) cVar).f152101a != 1) {
            return false;
        }
        return true;
    }

    public static final void a(int i2, boolean z) {
        b(i2, z ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public int f152101a;

        static {
            Covode.recordClassIndex(101368);
        }

        public a(int i2, int i3) {
            super(i2);
            this.f152101a = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public String f152102a;

        static {
            Covode.recordClassIndex(101369);
        }

        public b(int i2, String str) {
            super(i2);
            this.f152102a = str;
        }
    }

    public static final int a(int i2, int i3) {
        c cVar = f152100g.get(i2);
        if (cVar == null || !(cVar instanceof a)) {
            return i3;
        }
        return ((a) cVar).f152101a;
    }

    public static final void b(int i2, String str) {
        SparseArray<c> sparseArray = f152100g;
        c cVar = sparseArray.get(i2);
        if (cVar != null) {
            if (cVar instanceof b) {
                ((b) cVar).f152102a = str;
                return;
            }
            sparseArray.remove(i2);
        }
        sparseArray.append(i2, new b(i2, str));
    }

    public static final String a(int i2, String str) {
        if (i2 == 17) {
            return f152097d;
        }
        c cVar = f152100g.get(i2);
        if (cVar == null || !(cVar instanceof b)) {
            return str;
        }
        return ((b) cVar).f152102a;
    }

    public static final void b(int i2, int i3) {
        SparseArray<c> sparseArray = f152100g;
        c cVar = sparseArray.get(i2);
        if (cVar != null) {
            if (!(cVar instanceof a)) {
                sparseArray.remove(i2);
            } else if (i2 != 2 || !a(6)) {
                ((a) cVar).f152101a = i3;
                return;
            } else {
                return;
            }
        }
        sparseArray.append(i2, new a(i2, i3));
    }
}
