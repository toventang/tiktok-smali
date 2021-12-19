package com.bytedance.b.b.a;

import com.bytedance.b.k.a;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static File f25858a;

    /* renamed from: b  reason: collision with root package name */
    private static File f25859b;

    /* renamed from: c  reason: collision with root package name */
    private static File f25860c;

    /* renamed from: d  reason: collision with root package name */
    private static File f25861d;

    static {
        Covode.recordClassIndex(15095);
    }

    public static synchronized File a() {
        File file;
        synchronized (b.class) {
            if (f25861d == null) {
                File file2 = new File(a.f26313g.getFilesDir(), "apm6");
                f25861d = file2;
                if (!file2.exists()) {
                    f25861d.mkdirs();
                }
            }
            file = f25861d;
        }
        return file;
    }

    public static synchronized File c() {
        File file;
        synchronized (b.class) {
            if (f25859b == null) {
                File file2 = new File(a(), "flush");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f25859b = file2;
            }
            file = f25859b;
        }
        return file;
    }

    private static synchronized File d() {
        File file;
        File file2;
        synchronized (b.class) {
            if (f25860c == null) {
                if (com.bytedance.b.e.a.a.c()) {
                    file2 = new File(a(), "persistent");
                } else {
                    file2 = new File(a(), "child_process_persistent");
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f25860c = file2;
            }
            file = f25860c;
        }
        return file;
    }

    public static synchronized File b() {
        File file;
        synchronized (b.class) {
            if (f25858a == null) {
                try {
                    String str = com.bytedance.b.e.a.a.d().replace(".", "_").replace(":", "-") + ".bin";
                    if (!com.bytedance.b.e.a.a.c()) {
                        str = com.bytedance.b.e.a.a.b() + "_" + str;
                    }
                    File file2 = new File(d(), str);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    f25858a = file2;
                } catch (Exception e2) {
                    com.bytedance.b.k.b.b.a(a.f25847a, "prepare PersistentFile fail.", e2);
                }
            }
            file = f25858a;
        }
        return file;
    }
}
