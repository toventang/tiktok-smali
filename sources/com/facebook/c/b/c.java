package com.facebook.c.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.c.a.b;
import com.facebook.c.a.d;
import com.facebook.c.a.h;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.common.d.l;
import java.io.File;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f46979a;

    /* renamed from: b  reason: collision with root package name */
    public final String f46980b;

    /* renamed from: c  reason: collision with root package name */
    public final k<File> f46981c;

    /* renamed from: d  reason: collision with root package name */
    public final long f46982d;

    /* renamed from: e  reason: collision with root package name */
    public final long f46983e;

    /* renamed from: f  reason: collision with root package name */
    public final long f46984f;

    /* renamed from: g  reason: collision with root package name */
    public final h f46985g;

    /* renamed from: h  reason: collision with root package name */
    public final b f46986h;

    /* renamed from: i  reason: collision with root package name */
    public final d f46987i;

    /* renamed from: j  reason: collision with root package name */
    public final com.facebook.common.a.b f46988j;

    /* renamed from: k  reason: collision with root package name */
    public final Context f46989k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f46990l;

    static {
        Covode.recordClassIndex(28588);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f46991a;

        /* renamed from: b  reason: collision with root package name */
        public String f46992b;

        /* renamed from: c  reason: collision with root package name */
        public k<File> f46993c;

        /* renamed from: d  reason: collision with root package name */
        public long f46994d;

        /* renamed from: e  reason: collision with root package name */
        public long f46995e;

        /* renamed from: f  reason: collision with root package name */
        public long f46996f;

        /* renamed from: g  reason: collision with root package name */
        public h f46997g;

        /* renamed from: h  reason: collision with root package name */
        public b f46998h;

        /* renamed from: i  reason: collision with root package name */
        public d f46999i;

        /* renamed from: j  reason: collision with root package name */
        public com.facebook.common.a.b f47000j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f47001k;

        /* renamed from: l  reason: collision with root package name */
        public final Context f47002l;

        static {
            Covode.recordClassIndex(28589);
        }

        public final c a() {
            boolean z;
            if (this.f46993c == null && this.f47002l == null) {
                z = false;
            } else {
                z = true;
            }
            i.b(z, "Either a non-null context or a base directory path or supplier must be provided.");
            if (this.f46993c == null && this.f47002l != null) {
                this.f46993c = new k<File>() {
                    /* class com.facebook.c.b.c.a.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(28590);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // com.facebook.common.d.k
                    public final /* synthetic */ File b() {
                        Context applicationContext = a.this.f47002l.getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                        }
                        if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                            com.ss.android.ugc.aweme.lancet.d.f107194b = applicationContext.getCacheDir();
                        }
                        return com.ss.android.ugc.aweme.lancet.d.f107194b;
                    }
                };
            }
            return new c(this, (byte) 0);
        }

        public final a a(File file) {
            this.f46993c = l.a(file);
            return this;
        }

        private a(Context context) {
            this.f46991a = 1;
            this.f46992b = "image_cache";
            this.f46994d = 41943040;
            this.f46995e = 10485760;
            this.f46996f = 2097152;
            this.f46997g = new b();
            this.f47002l = context;
        }

        /* synthetic */ a(Context context, byte b2) {
            this(context);
        }
    }

    public static a a(Context context) {
        return new a(context, (byte) 0);
    }

    private c(a aVar) {
        b bVar;
        d dVar;
        com.facebook.common.a.b bVar2;
        this.f46979a = aVar.f46991a;
        this.f46980b = (String) i.a(aVar.f46992b);
        this.f46981c = (k) i.a(aVar.f46993c);
        this.f46982d = aVar.f46994d;
        this.f46983e = aVar.f46995e;
        this.f46984f = aVar.f46996f;
        this.f46985g = (h) i.a(aVar.f46997g);
        if (aVar.f46998h == null) {
            bVar = h.a();
        } else {
            bVar = aVar.f46998h;
        }
        this.f46986h = bVar;
        if (aVar.f46999i == null) {
            dVar = com.facebook.c.a.i.a();
        } else {
            dVar = aVar.f46999i;
        }
        this.f46987i = dVar;
        if (aVar.f47000j == null) {
            bVar2 = com.facebook.common.a.c.a();
        } else {
            bVar2 = aVar.f47000j;
        }
        this.f46988j = bVar2;
        this.f46989k = aVar.f47002l;
        this.f46990l = aVar.f47001k;
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
