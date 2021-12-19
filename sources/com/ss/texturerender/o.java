package com.ss.texturerender;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private Object f151856a;

    /* renamed from: b  reason: collision with root package name */
    private Method f151857b;

    /* renamed from: c  reason: collision with root package name */
    private Method f151858c;

    /* renamed from: d  reason: collision with root package name */
    private Method f151859d;

    /* renamed from: e  reason: collision with root package name */
    private Method f151860e;

    /* renamed from: f  reason: collision with root package name */
    private Method f151861f;

    /* renamed from: g  reason: collision with root package name */
    private Method f151862g;

    /* renamed from: h  reason: collision with root package name */
    private Method f151863h;

    /* renamed from: i  reason: collision with root package name */
    private Method f151864i;

    static {
        Covode.recordClassIndex(101266);
    }

    public o() {
        l.a("VideoOCLSRWrapper", "new VideoOCLSRWrapper");
        c();
    }

    public final void b() {
        Method method;
        Object obj = this.f151856a;
        if (!(obj == null || (method = this.f151864i) == null)) {
            a(method, obj, new Object[0]);
            l.a("VideoOCLSRWrapper", "ReleaseVideoOclSr");
        }
        this.f151856a = null;
    }

    public final int a() {
        if (this.f151856a == null || this.f151863h == null) {
            c();
        }
        Object a2 = a(this.f151863h, this.f151856a, new Object[0]);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) a2).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c3 A[SYNTHETIC, Splitter:B:12:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.texturerender.o.c():void");
    }

    private static Object a(Method method, Object obj, Object... objArr) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_texturerender_VideoOCLSRWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_texturerender_VideoOCLSRWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Exception e2) {
            l.a("VideoOCLSRWrapper", e2.toString());
            return null;
        }
    }

    public final int a(int i2, int i3, int i4) {
        if (this.f151856a == null || this.f151862g == null) {
            c();
        }
        Object a2 = a(this.f151862g, this.f151856a, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), true);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) a2).intValue();
    }

    public final int a(int i2, int i3, int i4, float[] fArr) {
        if (this.f151856a == null || this.f151861f == null) {
            c();
        }
        Object a2 = a(this.f151861f, this.f151856a, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fArr, true);
        if (a2 == null) {
            return -1;
        }
        return ((Integer) a2).intValue();
    }

    public final boolean a(String str, int i2, boolean z, String str2) {
        Object a2;
        if (this.f151856a == null || this.f151860e == null) {
            c();
        }
        Object obj = this.f151856a;
        if (obj != null) {
            if (this.f151860e != null) {
                l.a("VideoOCLSRWrapper", "mInitWithLicenseMethod ".concat(String.valueOf(str2)));
                a2 = a(this.f151860e, this.f151856a, str, Integer.valueOf(i2), Boolean.valueOf(z), true, str2, 720, 1440);
            } else {
                Method method = this.f151857b;
                if (method != null) {
                    a2 = a(method, obj, str, Integer.valueOf(i2), Boolean.valueOf(z));
                }
            }
            if (a2 == null || !((Boolean) a2).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean a(String str, int i2, boolean z, boolean z2, int i3, int i4, String str2) {
        Object a2;
        if (this.f151856a == null || this.f151860e == null) {
            c();
        }
        Object obj = this.f151856a;
        if (obj != null) {
            if (this.f151860e != null) {
                l.a("VideoOCLSRWrapper", "mInitWithLicenseMethod ".concat(String.valueOf(str2)));
                a2 = a(this.f151860e, this.f151856a, str, Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), str2, Integer.valueOf(i3), Integer.valueOf(i4));
            } else {
                Method method = this.f151859d;
                if (method != null) {
                    a2 = a(method, obj, str, Integer.valueOf(i2), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i3), Integer.valueOf(i4));
                } else if (this.f151858c != null) {
                    l.a("VideoOCLSRWrapper", "mInitMethodMaxMalisync null, use mInitMethodMax");
                    a2 = a(this.f151858c, this.f151856a, str, Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4));
                } else if (this.f151857b != null) {
                    l.a("VideoOCLSRWrapper", "mInitMethodMaxMalisync/mInitMethodMax null,use mInitMethod");
                    a2 = a(this.f151857b, this.f151856a, str, Integer.valueOf(i2), Boolean.valueOf(z));
                }
            }
            if (a2 == null || !((Boolean) a2).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
