package com.bytedance.common.utility;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static int f26936a = 5;

    /* renamed from: b  reason: collision with root package name */
    public static a f26937b;

    /* renamed from: c  reason: collision with root package name */
    private static b f26938c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f26939d;

    /* renamed from: e  reason: collision with root package name */
    private static Printer f26940e;

    public interface a {
        static {
            Covode.recordClassIndex(15908);
        }
    }

    static {
        Covode.recordClassIndex(15907);
    }

    /* access modifiers changed from: package-private */
    public static class b implements Printer {

        /* renamed from: a  reason: collision with root package name */
        List<Printer> f26941a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        List<Printer> f26942b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        List<Printer> f26943c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        boolean f26944d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f26945e = false;

        static {
            Covode.recordClassIndex(15909);
        }

        b() {
        }

        public final void println(String str) {
            long j2;
            if (!TextUtils.isEmpty(str)) {
                if (i.f26937b != null) {
                    j2 = System.currentTimeMillis();
                } else {
                    j2 = 0;
                }
                if (str.charAt(0) == '>' && this.f26945e) {
                    for (Printer printer : this.f26943c) {
                        if (!this.f26941a.contains(printer)) {
                            this.f26941a.add(printer);
                        }
                    }
                    this.f26943c.clear();
                    this.f26945e = false;
                }
                this.f26941a.size();
                for (Printer printer2 : this.f26941a) {
                    if (printer2 != null) {
                        printer2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.f26944d) {
                    for (Printer printer3 : this.f26942b) {
                        this.f26941a.remove(printer3);
                        this.f26943c.remove(printer3);
                    }
                    this.f26942b.clear();
                    this.f26944d = false;
                }
                if (i.f26937b != null && j2 > 0) {
                    System.currentTimeMillis();
                }
            }
        }
    }

    private static Printer b() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a() {
        if (!f26939d) {
            f26939d = true;
            f26938c = new b();
            Printer b2 = b();
            f26940e = b2;
            if (b2 != null) {
                f26938c.f26941a.add(f26940e);
            }
            Looper.getMainLooper().setMessageLogging(f26938c);
        }
    }

    public static void a(Printer printer) {
        if (printer != null && !f26938c.f26943c.contains(printer)) {
            f26938c.f26943c.add(printer);
            f26938c.f26945e = true;
        }
    }
}
