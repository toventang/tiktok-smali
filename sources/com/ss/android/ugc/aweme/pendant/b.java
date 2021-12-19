package com.ss.android.ugc.aweme.pendant;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.util.s;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f114614a = "fission_sp";

    /* renamed from: b  reason: collision with root package name */
    public static final String f114615b = "last_show_feed_pendant_date";

    /* renamed from: c  reason: collision with root package name */
    public static final int f114616c = 86400000;

    /* renamed from: d  reason: collision with root package name */
    public static final String f114617d = "app_open";

    /* renamed from: e  reason: collision with root package name */
    public static final String f114618e = "open_time";

    /* renamed from: f  reason: collision with root package name */
    public static final String f114619f = "bubble_state";

    /* renamed from: g  reason: collision with root package name */
    public static final String f114620g = "today_showed_time";

    /* renamed from: h  reason: collision with root package name */
    public static final String f114621h = "current_day";

    /* renamed from: i  reason: collision with root package name */
    public static final String f114622i = "pendant_close_day_list";

    /* renamed from: j  reason: collision with root package name */
    public static final String f114623j = "not_show_before_stamp";

    /* renamed from: k  reason: collision with root package name */
    public static final a f114624k = new a((byte) 0);

    /* renamed from: l  reason: collision with root package name */
    private final Keva f114625l = Keva.getRepo(f114614a);

    /* renamed from: m  reason: collision with root package name */
    private final s f114626m = new s(f114622i);
    private int n = -1;
    private int o = -1;
    private int p = -1;

    public static final class a {
        static {
            Covode.recordClassIndex(73776);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.pendant.b$b  reason: collision with other inner class name */
    public static final class C2935b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f114627a = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final C2935b f114628b = new C2935b();

        private C2935b() {
        }

        static {
            Covode.recordClassIndex(73777);
        }
    }

    public final Keva a() {
        Keva keva = this.f114625l;
        l.b(keva, "");
        return keva;
    }

    private final void d() {
        a().storeInt(f114620g, 0);
    }

    private final boolean e() {
        return l.a((Object) g(), (Object) i());
    }

    private final void f() {
        a().storeString(f114621h, g());
    }

    private final String i() {
        return a().getString(f114621h, "");
    }

    private final int c() {
        if (e()) {
            return a().getInt(f114620g, 0);
        }
        f();
        d();
        return 0;
    }

    static {
        Covode.recordClassIndex(73775);
    }

    private static String g() {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return String.valueOf(instance.getTimeInMillis());
    }

    private static long h() {
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public final void b() {
        s sVar = this.f114626m;
        if (sVar != null) {
            long b2 = s.b();
            List<String> a2 = sVar.a();
            a2.add(String.valueOf(b2));
            Keva keva = sVar.f142552a;
            String str = sVar.f142553b;
            String[] strArr = new String[a2.size()];
            int i2 = 0;
            for (String str2 : a2) {
                strArr[i2] = str2;
                i2++;
            }
            keva.storeStringArray(str, strArr);
            int i3 = this.n;
            if (i3 > 0 && this.p > 0 && this.o > 0) {
                s sVar2 = this.f114626m;
                long b3 = s.b();
                List<String> a3 = sVar2.a();
                ArrayList arrayList = new ArrayList();
                long j2 = b3 - ((long) ((i3 - 1) * 86400000));
                for (String str3 : a3) {
                    Long g2 = p.g(str3);
                    if (g2 != null && g2.longValue() >= j2) {
                        arrayList.add(String.valueOf(g2.longValue()));
                    }
                }
                if (arrayList.size() >= this.o) {
                    a().storeLong(f114623j, h() + ((long) (this.p * f114616c)));
                }
            }
        }
    }

    public final void a(Context context) {
        l.d(context, "");
        a().storeInt(f114620g, c() + 1);
    }

    public final boolean a(int i2, Context context) {
        l.d(context, "");
        if (c() + 1 <= i2) {
            return true;
        }
        return false;
    }

    private static boolean a(Context context, int i2) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        long j2 = 0;
        if (packageInfo != null) {
            j2 = packageInfo.firstInstallTime;
        }
        if (System.currentTimeMillis() - j2 < ((long) (i2 * f114616c))) {
            return true;
        }
        return false;
    }

    public final boolean a(int i2, int i3, int i4) {
        this.n = i2;
        this.o = i3;
        this.p = i4;
        Keva a2 = a();
        String str = f114623j;
        long j2 = a2.getLong(str, -1);
        if (j2 <= 0) {
            return true;
        }
        if (h() < j2) {
            return false;
        }
        a().storeLong(str, -1);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cd, code lost:
        if (r7 == null) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pendant.b.a(android.content.Context, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        if (r6.getCount() < r18) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        if (r6 == null) goto L_0x00da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r16, int r17, int r18) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pendant.b.b(android.content.Context, int, int):boolean");
    }
}
