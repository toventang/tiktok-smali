package com.ss.android.ugc.musicprovider;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl;
import com.ss.android.ugc.aweme.settings.w;
import com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut;
import java.io.File;

public class e {

    /* renamed from: d  reason: collision with root package name */
    public static int f148618d = 30000;

    /* renamed from: e  reason: collision with root package name */
    public static long f148619e = ((long) w.a());

    /* renamed from: f  reason: collision with root package name */
    private static e f148620f;

    /* renamed from: a  reason: collision with root package name */
    public a f148621a;

    /* renamed from: b  reason: collision with root package name */
    public a f148622b;

    /* renamed from: c  reason: collision with root package name */
    public Context f148623c;

    /* renamed from: g  reason: collision with root package name */
    private boolean f148624g;

    public interface a {
        static {
            Covode.recordClassIndex(97944);
        }

        String a();
    }

    private a e() {
        if (this.f148621a == null) {
            b();
        }
        return this.f148621a;
    }

    private a f() {
        if (this.f148622b == null) {
            b();
        }
        return this.f148622b;
    }

    public final String d() {
        return f().a();
    }

    static {
        Covode.recordClassIndex(97943);
    }

    public static e a() {
        MethodCollector.i(889);
        if (f148620f == null) {
            synchronized (e.class) {
                try {
                    if (f148620f == null) {
                        f148620f = new e();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(889);
                    throw th;
                }
            }
        }
        e eVar = f148620f;
        MethodCollector.o(889);
        return eVar;
    }

    public final void b() {
        MethodCollector.i(890);
        if (!this.f148624g) {
            synchronized (this) {
                try {
                    if (!this.f148624g) {
                        IProviderConfigOut d2 = ProviderConfigOutImpl.d();
                        if (d2 != null) {
                            this.f148623c = d2.c();
                            this.f148621a = d2.a();
                            this.f148622b = d2.b();
                        }
                        this.f148624g = true;
                    }
                } finally {
                    MethodCollector.o(890);
                }
            }
            return;
        }
        MethodCollector.o(890);
    }

    public final String c() {
        String a2 = e().a();
        if (a2.endsWith("/")) {
            return a2;
        }
        return a2 + File.separator;
    }

    private String c(String str) {
        return c() + b.c(str);
    }

    public final String a(String str) {
        return e().a() + b.c(str);
    }

    public final String b(String str) {
        if (!MusicService.m().f()) {
            return c(str);
        }
        return d(str);
    }

    private String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return c() + com.toutiao.proxyserver.g.a.a(str);
        }
        com.ss.android.ugc.aweme.framework.a.a.a("MusicProviderConfig getFilePathById music id is null");
        return "";
    }
}
