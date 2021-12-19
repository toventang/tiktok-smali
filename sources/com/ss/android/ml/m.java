package com.ss.android.ml;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ml.process.c;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f59874a;

    /* renamed from: b  reason: collision with root package name */
    public l f59875b;

    /* renamed from: c  reason: collision with root package name */
    public final n f59876c;

    /* renamed from: d  reason: collision with root package name */
    public MLConfigModel f59877d;

    /* renamed from: e  reason: collision with root package name */
    public j f59878e;

    /* renamed from: f  reason: collision with root package name */
    public final o f59879f;

    /* renamed from: g  reason: collision with root package name */
    public String f59880g;

    /* renamed from: h  reason: collision with root package name */
    private int f59881h;

    /* renamed from: i  reason: collision with root package name */
    private int f59882i;

    /* renamed from: j  reason: collision with root package name */
    private final l f59883j;

    /* renamed from: k  reason: collision with root package name */
    private g f59884k;

    /* renamed from: l  reason: collision with root package name */
    private String f59885l;

    static {
        Covode.recordClassIndex(37004);
    }

    public final boolean c() {
        return this.f59876c.c();
    }

    public final List<? extends c> a() {
        if (this.f59877d.intput == null) {
            return this.f59877d.input;
        }
        return this.f59877d.intput;
    }

    private synchronized void d() {
        l sVar;
        MethodCollector.i(11781);
        if (this.f59878e == null) {
            this.f59878e = i.a().f59856b;
        }
        if (this.f59884k == null) {
            this.f59884k = this.f59878e.f59860d;
        }
        if (this.f59875b == null) {
            l lVar = this.f59883j;
            if (lVar == null || ((!(lVar instanceof s) || !c.f59851c) && (!(this.f59883j instanceof a) || !c.f59849a))) {
                String d2 = this.f59876c.d();
                if (TextUtils.isEmpty(d2)) {
                    sVar = new q(d2);
                } else if ("bytenn".equals(d2)) {
                    sVar = new a();
                } else {
                    sVar = new s();
                }
            } else {
                sVar = this.f59883j;
            }
            this.f59875b = sVar;
            sVar.a(this.f59879f);
            this.f59875b.a(this.f59880g);
        }
        MethodCollector.o(11781);
    }

    public final boolean b() {
        final long j2;
        if (i.a().f59856b == null) {
            return false;
        }
        d();
        if (c() && !this.f59875b.a() && !this.f59874a && this.f59881h <= 5) {
            this.f59874a = true;
            this.f59881h++;
            if (t.f59923a) {
                j2 = System.currentTimeMillis();
            } else {
                j2 = 0;
            }
            AnonymousClass1 r2 = new Runnable() {
                /* class com.ss.android.ml.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(37005);
                }

                /* JADX WARNING: Removed duplicated region for block: B:71:0x02d0  */
                /* JADX WARNING: Removed duplicated region for block: B:74:0x0320  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 1279
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.m.AnonymousClass1.run():void");
                }
            };
            j jVar = this.f59878e;
            if (jVar.f59863g == null && jVar.f59861e != null) {
                jVar.f59863g = jVar.f59861e.a();
            }
            jVar.f59863g.submit(r2);
        }
        if (t.f59923a) {
            c();
            this.f59875b.a();
            this.f59876c.b();
            this.f59876c.d();
        }
        return this.f59875b.a();
    }

    public m(n nVar) {
        this(nVar, (byte) 0);
    }

    public static void a(String... strArr) {
        for (String str : strArr) {
            File file = new File(str);
            if (file.exists()) {
                b(file);
            }
        }
    }

    private static boolean b(File file) {
        MethodCollector.i(11784);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(11784);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(11784);
        return delete;
    }

    public final boolean a(File file) {
        Throwable th;
        MethodCollector.i(11944);
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                this.f59875b.a(fileInputStream2, this.f59877d);
                a(7, (Throwable) null);
                this.f59879f.b(this.f59875b.a());
                t.a(fileInputStream2);
                MethodCollector.o(11944);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    k.a(this.f59880g, "loadModel error: ", th);
                    a(8, th);
                    this.f59879f.b(this.f59875b.a());
                    t.a(fileInputStream);
                    MethodCollector.o(11944);
                    return false;
                } catch (Throwable th3) {
                    this.f59879f.b(this.f59875b.a());
                    t.a(fileInputStream);
                    MethodCollector.o(11944);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            k.a(this.f59880g, "loadModel error: ", th);
            a(8, th);
            this.f59879f.b(this.f59875b.a());
            t.a(fileInputStream);
            MethodCollector.o(11944);
            return false;
        }
    }

    public final void a(int i2, Throwable th) {
        this.f59882i = i2;
        b(i2, th);
    }

    private void b(int i2, Throwable th) {
        g gVar = this.f59884k;
        if (gVar != null) {
            this.f59876c.a();
            if (th != null) {
                th.getMessage();
                th.printStackTrace(new PrintWriter(new StringWriter()));
            }
            gVar.a();
        }
    }

    private m(n nVar, byte b2) {
        this.f59885l = "default";
        this.f59880g = "ml#evaluator";
        if (nVar != null) {
            this.f59883j = null;
            this.f59876c = nVar;
            if (nVar.c()) {
                this.f59885l = nVar.b();
            }
            String str = this.f59885l;
            o oVar = p.f59903a.get(str);
            if (oVar == null) {
                oVar = new o(str);
                p.f59903a.put(str, oVar);
            }
            this.f59879f = oVar;
            oVar.a();
            if (t.f59923a) {
                new StringBuilder("-----MLModelComponent created.---!!! config:").append(nVar).append(" engine:").append((Object) null);
                new Throwable("not crash, only for debug!!");
                return;
            }
            return;
        }
        throw new RuntimeException("MLModelConfig can not be null!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.io.File r11, java.io.File r12) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ml.m.a(java.io.File, java.io.File):boolean");
    }
}
