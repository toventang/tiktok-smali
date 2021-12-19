package com.google.android.gms.measurement.internal;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.google.android.gms.common.util.e;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class ef extends jp {

    /* renamed from: a  reason: collision with root package name */
    final SSLSocketFactory f51496a = null;

    static {
        Covode.recordClassIndex(32200);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.jp
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

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ ey I_() {
        return super.I_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ e J_() {
        return super.J_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ kd K_() {
        return super.K_();
    }

    @Override // com.google.android.gms.measurement.internal.jm
    public final /* bridge */ /* synthetic */ jv L_() {
        return super.L_();
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

    public final boolean e() {
        B();
        try {
            NetworkInfo a2 = a((ConnectivityManager) a(m(), "connectivity"));
            if (a2 == null || !a2.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public ef(jo joVar) {
        super(joVar);
        int i2 = Build.VERSION.SDK_INT;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    static byte[] a(HttpURLConnection httpURLConnection) {
        MethodCollector.i(3684);
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream2 = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream2.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream2.close();
                    MethodCollector.o(3684);
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                inputStream.close();
            }
            MethodCollector.o(3684);
            throw th;
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3222);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(3222);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
