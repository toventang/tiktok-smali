package com.facebook.c.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.c.a.b;
import com.facebook.c.b.d;
import com.facebook.common.c.c;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class f implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f47024b = f.class;

    /* renamed from: a  reason: collision with root package name */
    volatile a f47025a = new a(null, null);

    /* renamed from: c  reason: collision with root package name */
    private final int f47026c;

    /* renamed from: d  reason: collision with root package name */
    private final k<File> f47027d;

    /* renamed from: e  reason: collision with root package name */
    private final String f47028e;

    /* renamed from: f  reason: collision with root package name */
    private final b f47029f;

    @Override // com.facebook.c.b.d
    public final void c() {
        e().c();
    }

    static {
        Covode.recordClassIndex(28598);
    }

    @Override // com.facebook.c.b.d
    public final Collection<d.a> d() {
        return e().d();
    }

    @Override // com.facebook.c.b.d
    public final boolean a() {
        try {
            return e().a();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.c.b.d
    public final void b() {
        try {
            e().b();
        } catch (IOException e2) {
            com.facebook.common.e.a.b(f47024b, "purgeUnexpectedResources", e2);
        }
    }

    private synchronized d e() {
        d dVar;
        MethodCollector.i(2439);
        a aVar = this.f47025a;
        if (aVar.f47030a == null || aVar.f47031b == null || !aVar.f47031b.exists()) {
            if (!(this.f47025a.f47030a == null || this.f47025a.f47031b == null)) {
                com.facebook.common.c.a.b(this.f47025a.f47031b);
            }
            File file = new File(this.f47027d.b(), this.f47028e);
            try {
                c.a(file);
                Class<?> cls = f47024b;
                String absolutePath = file.getAbsolutePath();
                if (com.facebook.common.e.a.f47081a.b(3)) {
                    com.facebook.common.e.a.f47081a.b(cls.getSimpleName(), com.a.a(null, "Created cache directory %s", new Object[]{absolutePath}));
                }
                this.f47025a = new a(file, new a(file, this.f47026c, this.f47029f));
            } catch (c.a e2) {
                MethodCollector.o(2439);
                throw e2;
            }
        }
        dVar = (d) i.a(this.f47025a.f47030a);
        MethodCollector.o(2439);
        return dVar;
    }

    @Override // com.facebook.c.b.d
    public final long a(d.a aVar) {
        return e().a(aVar);
    }

    @Override // com.facebook.c.b.d
    public final long b(String str) {
        return e().b(str);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f47030a;

        /* renamed from: b  reason: collision with root package name */
        public final File f47031b;

        static {
            Covode.recordClassIndex(28599);
        }

        a(File file, d dVar) {
            this.f47030a = dVar;
            this.f47031b = file;
        }
    }

    @Override // com.facebook.c.b.d
    public final boolean c(String str, Object obj) {
        return e().c(str, obj);
    }

    @Override // com.facebook.c.b.d
    public final d.b a(String str, Object obj) {
        return e().a(str, obj);
    }

    @Override // com.facebook.c.b.d
    public final com.facebook.b.a b(String str, Object obj) {
        return e().b(str, obj);
    }

    public f(int i2, k<File> kVar, String str, b bVar) {
        this.f47026c = i2;
        this.f47029f = bVar;
        this.f47027d = kVar;
        this.f47028e = str;
    }
}
