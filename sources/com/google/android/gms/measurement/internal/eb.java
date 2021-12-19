package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.util.e;

public final class eb extends fy {

    /* renamed from: a  reason: collision with root package name */
    char f51466a;

    /* renamed from: b  reason: collision with root package name */
    long f51467b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final ee f51468c = new ee(this, 6, false, false);

    /* renamed from: d  reason: collision with root package name */
    public final ee f51469d = new ee(this, 6, true, false);

    /* renamed from: e  reason: collision with root package name */
    public final ee f51470e = new ee(this, 6, false, true);

    /* renamed from: f  reason: collision with root package name */
    public final ee f51471f = new ee(this, 5, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final ee f51472g = new ee(this, 5, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final ee f51473h = new ee(this, 5, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final ee f51474i = new ee(this, 4, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final ee f51475j = new ee(this, 3, false, false);

    /* renamed from: k  reason: collision with root package name */
    public final ee f51476k = new ee(this, 2, false, false);

    /* renamed from: l  reason: collision with root package name */
    private String f51477l;

    static {
        Covode.recordClassIndex(32196);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.fy
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ j k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ e l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ dz n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ jz o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ ex p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ eb q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ em r() {
        return super.r();
    }

    @Override // com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ km s() {
        return super.s();
    }

    @Override // com.google.android.gms.measurement.internal.gb, com.google.android.gms.measurement.internal.fz
    public final /* bridge */ /* synthetic */ kl t() {
        return super.t();
    }

    private final String f() {
        String str;
        String str2;
        MethodCollector.i(7557);
        synchronized (this) {
            try {
                if (this.f51477l == null) {
                    if (this.z.f51598c != null) {
                        str2 = this.z.f51598c;
                    } else {
                        s().t();
                        str2 = "FA";
                    }
                    this.f51477l = str2;
                }
                str = this.f51477l;
            } finally {
                MethodCollector.o(7557);
            }
        }
        return str;
    }

    public final String e() {
        Pair<String, Long> a2 = r().f51521c.a();
        if (a2 == null || a2 == em.f51519a) {
            return null;
        }
        String valueOf = String.valueOf(a2.second);
        String str = (String) a2.first;
        return new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length()).append(valueOf).append(":").append(str).toString();
    }

    protected static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new ed(str);
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i2) {
        return Log.isLoggable(f(), i2);
    }

    eb(ff ffVar) {
        super(ffVar);
    }

    private static String a(boolean z, Object obj) {
        String th;
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            return new StringBuilder(str.length() + 43 + str.length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d)).toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th2 = (Throwable) obj;
                if (z) {
                    th = th2.getClass().getName();
                } else {
                    th = th2.toString();
                }
                StringBuilder sb = new StringBuilder(th);
                String b2 = b(ff.class.getCanonicalName());
                StackTraceElement[] stackTrace = th2.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b2)) {
                        sb.append(": ");
                        sb.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb.toString();
            } else if (obj instanceof ed) {
                return ((ed) obj).f51491a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a2 = a(z, obj);
        String a3 = a(z, obj2);
        String a4 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a4)) {
            sb.append(str3);
            sb.append(a4);
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        int i3 = i2;
        if (!z && a(i3)) {
            a(false, str, obj, obj2, obj3);
        }
        if (!z2 && i3 >= 5) {
            r.a((Object) str);
            ex exVar = this.z.f51602g;
            if (exVar != null && exVar.w()) {
                if (i3 < 0) {
                    i3 = 0;
                } else if (i3 >= 9) {
                    i3 = 8;
                }
                exVar.a(new ea(this, i3, str, obj, obj2, obj3));
            }
        }
    }
}
