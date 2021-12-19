package com.bytedance.geckox;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.k.c;
import com.bytedance.geckox.utils.o;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29782a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f29783b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f29784c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.geckox.statistic.a f29785d;

    /* renamed from: e  reason: collision with root package name */
    public c f29786e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f29787f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f29788g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.geckox.b.a.a f29789h;

    /* renamed from: i  reason: collision with root package name */
    public Long f29790i;

    /* renamed from: j  reason: collision with root package name */
    public final String f29791j;

    /* renamed from: k  reason: collision with root package name */
    public String f29792k;

    /* renamed from: l  reason: collision with root package name */
    public final String f29793l;

    /* renamed from: m  reason: collision with root package name */
    public final String f29794m;
    public final String n;
    public final File o;
    public final boolean p;
    public final boolean q;

    static {
        Covode.recordClassIndex(17289);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f29795a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f29796b;

        /* renamed from: c  reason: collision with root package name */
        public List<String> f29797c;

        /* renamed from: d  reason: collision with root package name */
        public Context f29798d;

        /* renamed from: e  reason: collision with root package name */
        public Executor f29799e;

        /* renamed from: f  reason: collision with root package name */
        public com.bytedance.geckox.statistic.a f29800f;

        /* renamed from: g  reason: collision with root package name */
        public com.bytedance.geckox.b.a.a f29801g;

        /* renamed from: h  reason: collision with root package name */
        public Long f29802h;

        /* renamed from: i  reason: collision with root package name */
        public String f29803i;

        /* renamed from: j  reason: collision with root package name */
        public String f29804j;

        /* renamed from: k  reason: collision with root package name */
        public String f29805k;

        /* renamed from: l  reason: collision with root package name */
        public File f29806l;

        /* renamed from: m  reason: collision with root package name */
        public String f29807m;
        public String n;
        public boolean o;
        public boolean p;

        static {
            Covode.recordClassIndex(17290);
        }

        public final a a() {
            return this;
        }

        public final e b() {
            return new e(this, (byte) 0);
        }

        public final a b(String str) {
            this.f29804j = str;
            return this;
        }

        public final a c(String str) {
            this.f29805k = str;
            return this;
        }

        public final a d(String str) {
            this.f29807m = str;
            return this;
        }

        public final a a(long j2) {
            this.f29802h = Long.valueOf(j2);
            return this;
        }

        public final a b(String... strArr) {
            this.f29796b = Arrays.asList(strArr);
            return this;
        }

        public final a a(com.bytedance.geckox.b.a.a aVar) {
            this.f29801g = aVar;
            return this;
        }

        public a(Context context) {
            Context applicationContext = context.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            this.f29798d = applicationContext;
        }

        public final a a(c cVar) {
            this.f29795a = cVar;
            return this;
        }

        public final a a(com.bytedance.geckox.statistic.a aVar) {
            this.f29800f = aVar;
            return this;
        }

        public final a a(File file) {
            this.f29806l = file;
            return this;
        }

        public final a a(String str) {
            this.f29803i = str;
            return this;
        }

        public final a a(boolean z) {
            this.o = z;
            return this;
        }

        public final a a(String... strArr) {
            if (strArr != null && strArr.length > 0) {
                this.f29797c = Arrays.asList(strArr);
            }
            return this;
        }
    }

    public final String a() {
        return this.f29787f.get(0);
    }

    private e(a aVar) {
        Context context = aVar.f29798d;
        this.f29782a = context;
        if (context != null) {
            List<String> list = aVar.f29796b;
            this.f29787f = list;
            List<String> list2 = aVar.f29797c;
            this.f29788g = list2;
            this.f29789h = aVar.f29801g;
            this.f29790i = aVar.f29802h;
            if (TextUtils.isEmpty(aVar.f29803i)) {
                this.f29791j = com.bytedance.geckox.utils.a.a(context);
            } else {
                this.f29791j = aVar.f29803i;
            }
            this.f29792k = aVar.f29804j;
            this.f29794m = aVar.f29807m;
            this.n = aVar.n;
            if (aVar.f29806l == null) {
                if (d.f107195c == null || !d.f107197e) {
                    d.f107195c = context.getFilesDir();
                }
                this.o = new File(d.f107195c, "gecko_offline_res_x");
            } else {
                this.o = aVar.f29806l;
            }
            String str = aVar.f29805k;
            this.f29793l = str;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("host is null");
            } else if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("accessKey is empty");
            } else if (list2 == null || list2.isEmpty()) {
                throw new IllegalArgumentException("local accessKey is empty");
            } else if (!list2.containsAll(list)) {
                throw new IllegalArgumentException("local accessKey must contain accessKey");
            } else if (this.f29790i == null) {
                throw new IllegalArgumentException("appId is null");
            } else if (!TextUtils.isEmpty(this.f29792k)) {
                o a2 = o.a();
                if (a2.f30135a == null) {
                    a2.f30135a = new com.bytedance.geckox.policy.c.a();
                }
                this.f29783b = a2.f30135a;
                if (aVar.f29799e == null) {
                    this.f29784c = o.a(new ThreadFactory() {
                        /* class com.bytedance.geckox.utils.o.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(17509);
                        }

                        public final Thread newThread(Runnable runnable) {
                            MethodCollector.i(11993);
                            Thread thread = new Thread(runnable);
                            thread.setName("gecko-check-update-thread");
                            thread.setPriority(3);
                            MethodCollector.o(11993);
                            return thread;
                        }
                    });
                } else {
                    this.f29784c = aVar.f29799e;
                }
                if (aVar.f29795a == null) {
                    this.f29786e = new com.bytedance.geckox.k.a();
                } else {
                    this.f29786e = aVar.f29795a;
                }
                this.f29785d = aVar.f29800f;
                this.p = aVar.o;
                this.q = aVar.p;
            } else {
                throw new IllegalArgumentException("deviceId key empty");
            }
        } else {
            throw new IllegalArgumentException("context == null");
        }
    }

    /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }
}
