package com.bytedance.push;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.c.a;
import com.bytedance.push.c.b;
import com.bytedance.push.c.d;
import com.bytedance.push.c.m;
import com.bytedance.push.c.n;
import com.bytedance.push.c.p;
import com.bytedance.push.c.q;
import com.bytedance.push.notification.h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Application f42057a;

    /* renamed from: b  reason: collision with root package name */
    public final int f42058b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42059c;

    /* renamed from: d  reason: collision with root package name */
    public final int f42060d;

    /* renamed from: e  reason: collision with root package name */
    public final String f42061e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f42062f;

    /* renamed from: g  reason: collision with root package name */
    public final String f42063g;

    /* renamed from: h  reason: collision with root package name */
    public final String f42064h;

    /* renamed from: i  reason: collision with root package name */
    public final String f42065i;

    /* renamed from: j  reason: collision with root package name */
    public final b f42066j;

    /* renamed from: k  reason: collision with root package name */
    public final List<com.ss.android.message.b> f42067k;

    /* renamed from: l  reason: collision with root package name */
    public final d f42068l;

    /* renamed from: m  reason: collision with root package name */
    public final h f42069m;
    public final String n;
    public final q o;
    public final a p;
    public final com.ss.android.pushmanager.c q;
    public final com.bytedance.push.c.c r;
    public final m s;
    public final com.bytedance.push.g.b t;
    public final p u;
    public final String v;
    public final boolean w;
    public final b x;
    public final boolean y;
    public final long z;

    static {
        Covode.recordClassIndex(25709);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Application f42070a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f42071b;

        /* renamed from: c  reason: collision with root package name */
        public String f42072c;

        /* renamed from: d  reason: collision with root package name */
        public b f42073d;

        /* renamed from: e  reason: collision with root package name */
        public List<com.ss.android.message.b> f42074e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public d f42075f;

        /* renamed from: g  reason: collision with root package name */
        public n f42076g;

        /* renamed from: h  reason: collision with root package name */
        public String f42077h;

        /* renamed from: i  reason: collision with root package name */
        public q f42078i;

        /* renamed from: j  reason: collision with root package name */
        public com.bytedance.push.c.a f42079j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f42080k;

        /* renamed from: l  reason: collision with root package name */
        public com.ss.android.pushmanager.c f42081l;

        /* renamed from: m  reason: collision with root package name */
        public com.bytedance.push.c.c f42082m;
        public com.bytedance.push.b.a n;
        public m o;
        public com.bytedance.push.g.b p;
        public p q;
        public a r;
        public String s;
        public boolean t;
        public b u;
        public boolean v;
        public long w = TimeUnit.MINUTES.toMillis(2);

        static {
            Covode.recordClassIndex(25710);
        }

        public final void a(String str) {
            if (this.f42071b) {
                throw new IllegalArgumentException(str);
            }
        }

        public a(Application application, a aVar) {
            this.f42070a = application;
            this.r = aVar;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f42083a;

        /* renamed from: b  reason: collision with root package name */
        public String f42084b;

        static {
            Covode.recordClassIndex(25711);
        }

        public b(String str, String str2) {
            this.f42083a = str2;
            this.f42084b = str;
        }
    }

    private c(Application application, a aVar, boolean z2, String str, b bVar, List<com.ss.android.message.b> list, d dVar, h hVar, String str2, q qVar, a aVar2, com.ss.android.pushmanager.c cVar, com.bytedance.push.c.c cVar2, m mVar, com.bytedance.push.g.b bVar2, p pVar, String str3, boolean z3, b bVar3, a aVar3) {
        this.f42057a = application;
        this.f42058b = aVar.f42037a;
        this.f42059c = aVar.f42038b;
        this.f42060d = aVar.f42040d;
        this.f42061e = aVar.f42039c;
        this.f42063g = aVar.f42041e;
        this.f42065i = aVar.f42042f;
        this.f42062f = z2;
        this.f42064h = str;
        this.f42066j = bVar;
        this.f42067k = new CopyOnWriteArrayList(list);
        this.f42068l = dVar;
        this.f42069m = hVar;
        this.n = str2;
        this.o = qVar;
        this.p = aVar2;
        this.q = cVar;
        this.r = cVar2;
        this.s = mVar;
        this.t = bVar2;
        this.u = pVar;
        this.v = str3;
        this.w = z3;
        this.x = bVar3;
        this.y = aVar3.v;
        this.z = aVar3.w;
    }

    public /* synthetic */ c(Application application, a aVar, boolean z2, String str, b bVar, List list, d dVar, h hVar, String str2, q qVar, a aVar2, com.ss.android.pushmanager.c cVar, com.bytedance.push.c.c cVar2, m mVar, com.bytedance.push.g.b bVar2, p pVar, String str3, boolean z3, b bVar3, a aVar3, byte b2) {
        this(application, aVar, z2, str, bVar, list, dVar, hVar, str2, qVar, aVar2, cVar, cVar2, mVar, bVar2, pVar, str3, z3, bVar3, aVar3);
    }
}
