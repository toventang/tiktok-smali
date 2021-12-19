package com.bytedance.b.b.a.b;

import com.bytedance.b.b.a.b;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public File f25878a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f25879b;

    static {
        Covode.recordClassIndex(15098);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f25881a = new c();

        static {
            Covode.recordClassIndex(15100);
        }
    }

    public final synchronized void a() {
        if (!this.f25879b) {
            try {
                File file = new File(b.a(), "header");
                this.f25878a = file;
                if (!file.exists()) {
                    this.f25878a.mkdirs();
                }
            } catch (Throwable th) {
                com.bytedance.b.k.b.b.a("APM", "header store init error " + th.toString());
            }
            this.f25879b = true;
        }
    }

    public static String a(String str) {
        return str + ".bin";
    }
}
