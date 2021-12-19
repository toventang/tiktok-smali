package com.ss.android.ugc.aweme.account.p.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.m.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public final class a implements com.bytedance.ies.web.a.d {

    /* renamed from: a  reason: collision with root package name */
    public CountDownLatch f65233a;

    /* renamed from: b  reason: collision with root package name */
    public b f65234b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<Context> f65235c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.ies.web.a.a f65236d;

    /* renamed from: e  reason: collision with root package name */
    private final h f65237e = i.a((h.f.a.a) g.f65260a);

    /* renamed from: f  reason: collision with root package name */
    private C1457a f65238f;

    /* renamed from: g  reason: collision with root package name */
    private final h f65239g = i.a((h.f.a.a) f.f65259a);

    /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$a  reason: collision with other inner class name */
    public static final class C1457a {
        @com.google.gson.a.c(a = "getMask")

        /* renamed from: a  reason: collision with root package name */
        public Integer f65240a;
        @com.google.gson.a.c(a = "getToken")

        /* renamed from: b  reason: collision with root package name */
        public Integer f65241b;

        static {
            Covode.recordClassIndex(40123);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: h  reason: collision with root package name */
        public static final C1458a f65242h = new C1458a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public String f65243a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f65244b = 1;

        /* renamed from: c  reason: collision with root package name */
        public volatile int f65245c;

        /* renamed from: d  reason: collision with root package name */
        public volatile int f65246d;

        /* renamed from: e  reason: collision with root package name */
        public volatile int f65247e;

        /* renamed from: f  reason: collision with root package name */
        public volatile String f65248f;

        /* renamed from: g  reason: collision with root package name */
        public volatile String f65249g;

        /* renamed from: i  reason: collision with root package name */
        private final h f65250i = i.a((h.f.a.a) C1459b.f65251a);

        static {
            Covode.recordClassIndex(40124);
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            return (JSONObject) this.f65250i.getValue();
        }

        /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$b$a  reason: collision with other inner class name */
        public static final class C1458a {
            static {
                Covode.recordClassIndex(40125);
            }

            private C1458a() {
            }

            public /* synthetic */ C1458a(byte b2) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.p.a.a$b$b  reason: collision with other inner class name */
        static final class C1459b extends m implements h.f.a.a<JSONObject> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1459b f65251a = new C1459b();

            static {
                Covode.recordClassIndex(40126);
            }

            C1459b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ JSONObject invoke() {
                return new JSONObject();
            }
        }
    }

    static {
        Covode.recordClassIndex(40122);
    }

    private final com.bytedance.sdk.a.k.a.e a() {
        return (com.bytedance.sdk.a.k.a.e) this.f65237e.getValue();
    }

    static final class f extends m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f65259a = new f();

        static {
            Covode.recordClassIndex(40131);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.google.gson.f invoke() {
            return new com.google.gson.f();
        }
    }

    static final class g extends m implements h.f.a.a<com.bytedance.sdk.a.k.a.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f65260a = new g();

        static {
            Covode.recordClassIndex(40132);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.sdk.a.k.a.e invoke() {
            return com.bytedance.sdk.a.k.c.d.a(com.bytedance.sdk.a.k.a.e.class);
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.ies.web.a.h f65257b;

        static {
            Covode.recordClassIndex(40129);
        }

        e(a aVar, com.bytedance.ies.web.a.h hVar) {
            this.f65256a = aVar;
            this.f65257b = hVar;
        }

        public final void run() {
            a.b(this.f65256a).await();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.account.p.a.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f65258a;

                static {
                    Covode.recordClassIndex(40130);
                }

                {
                    this.f65258a = r1;
                }

                public final void run() {
                    JSONObject a2;
                    a aVar = this.f65258a.f65256a;
                    String str = this.f65258a.f65257b.f35531b;
                    l.b(str, "");
                    b a3 = a.a(this.f65258a.f65256a);
                    if (a3.f65244b == 0) {
                        a2 = new JSONObject();
                        a2.put("code", a3.f65244b);
                        String str2 = a3.f65243a;
                        if (str2 == null) {
                            l.a("from");
                        }
                        a2.put("from", str2);
                        a2.put("tokenErrorCode", a3.f65245c);
                        a2.put("maskErrorCode", a3.f65246d);
                        a2.put("networkType", a3.f65247e);
                    } else {
                        a3.a().put("code", a3.f65244b);
                        JSONObject a4 = a3.a();
                        String str3 = a3.f65243a;
                        if (str3 == null) {
                            l.a("from");
                        }
                        a4.put("from", str3);
                        a2 = a3.a();
                    }
                    aVar.f65236d.a(str, a2);
                }
            });
        }
    }

    public static final /* synthetic */ CountDownLatch b(a aVar) {
        CountDownLatch countDownLatch = aVar.f65233a;
        if (countDownLatch == null) {
            l.a("countDownLatch");
        }
        return countDownLatch;
    }

    public static final /* synthetic */ b a(a aVar) {
        b bVar = aVar.f65234b;
        if (bVar == null) {
            l.a("jsResponseBody");
        }
        return bVar;
    }

    public static final class c implements com.bytedance.sdk.a.k.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f65253b;

        static {
            Covode.recordClassIndex(40127);
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(com.bytedance.sdk.a.k.c.c cVar) {
            int i2;
            Integer e2;
            if (!this.f65253b.element) {
                this.f65253b.element = true;
                a.a(this.f65252a).f65244b = 0;
                b a2 = a.a(this.f65252a);
                String str = cVar.f43389c;
                if (str == null || (e2 = p.e(str)) == null) {
                    i2 = -1;
                } else {
                    i2 = e2.intValue();
                }
                a2.f65246d = i2;
                a.b(this.f65252a).countDown();
            }
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(Bundle bundle) {
            String str;
            if (!this.f65253b.element) {
                this.f65253b.element = true;
                if (bundle != null) {
                    str = bundle.getString("security_phone");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    a.a(this.f65252a).f65244b = 0;
                } else {
                    b a2 = a.a(this.f65252a);
                    a2.f65249g = str;
                    a2.a().put("phoneMask", str);
                }
                a.b(this.f65252a).countDown();
            }
        }

        c(a aVar, z.a aVar2) {
            this.f65252a = aVar;
            this.f65253b = aVar2;
        }
    }

    public static final class d implements com.bytedance.sdk.a.k.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f65254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f65255b;

        static {
            Covode.recordClassIndex(40128);
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(com.bytedance.sdk.a.k.c.c cVar) {
            int i2;
            Integer e2;
            if (!this.f65255b.element) {
                this.f65255b.element = true;
                a.a(this.f65254a).f65244b = 0;
                b a2 = a.a(this.f65254a);
                String str = cVar.f43389c;
                if (str == null || (e2 = p.e(str)) == null) {
                    i2 = -1;
                } else {
                    i2 = e2.intValue();
                }
                a2.f65245c = i2;
                a.b(this.f65254a).countDown();
            }
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(Bundle bundle) {
            String str;
            if (!this.f65255b.element) {
                this.f65255b.element = true;
                if (bundle != null) {
                    str = bundle.getString("access_token");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    a.a(this.f65254a).f65244b = 0;
                } else {
                    b a2 = a.a(this.f65254a);
                    a2.f65248f = str;
                    a2.a().put("verifyToken", str);
                }
                a.b(this.f65254a).countDown();
            }
        }

        d(a aVar, z.a aVar2) {
            this.f65254a = aVar;
            this.f65255b = aVar2;
        }
    }

    public a(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        this.f65235c = weakReference;
        this.f65236d = aVar;
    }

    @Override // com.bytedance.ies.web.a.d
    public final void call(com.bytedance.ies.web.a.h hVar, JSONObject jSONObject) {
        String str;
        Integer num;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        Integer num4;
        l.d(hVar, "");
        hVar.f35538i = false;
        b bVar = new b();
        this.f65234b = bVar;
        com.bytedance.sdk.a.k.a.e a2 = a();
        if (a2 == null || (str = a2.a()) == null) {
            str = "";
        }
        l.d(str, "");
        bVar.f65243a = str;
        b bVar2 = this.f65234b;
        if (bVar2 == null) {
            l.a("jsResponseBody");
        }
        bVar2.f65247e = a().b();
        b bVar3 = this.f65234b;
        if (bVar3 == null) {
            l.a("jsResponseBody");
        }
        if (bVar3.f65243a == null) {
            l.a("from");
        }
        Object a3 = ((com.google.gson.f) this.f65239g.getValue()).a(hVar.f35533d.toString(), C1457a.class);
        l.b(a3, "");
        C1457a aVar = (C1457a) a3;
        b bVar4 = this.f65234b;
        if (bVar4 == null) {
            l.a("jsResponseBody");
        }
        if ((aVar.f65240a != null && (((num3 = aVar.f65240a) == null || num3.intValue() != 1) && ((num4 = aVar.f65240a) == null || num4.intValue() != 0))) || (aVar.f65241b != null && (((num = aVar.f65241b) == null || num.intValue() != 1) && ((num2 = aVar.f65241b) == null || num2.intValue() != 0)))) {
            aVar.f65240a = 0;
            aVar.f65241b = 0;
            bVar4.f65244b = 0;
        }
        this.f65238f = aVar;
        Integer num5 = aVar.f65240a;
        if (num5 != null) {
            i2 = num5.intValue();
        } else {
            i2 = 0;
        }
        int i4 = i2 + 0;
        C1457a aVar2 = this.f65238f;
        if (aVar2 == null) {
            l.a("jsParams");
        }
        Integer num6 = aVar2.f65241b;
        if (num6 != null) {
            i3 = num6.intValue();
        } else {
            i3 = 0;
        }
        this.f65233a = new CountDownLatch(i4 + i3);
        C1457a aVar3 = this.f65238f;
        if (aVar3 == null) {
            l.a("jsParams");
        }
        Integer num7 = aVar3.f65240a;
        if (num7 != null && 1 == num7.intValue()) {
            z.a aVar4 = new z.a();
            aVar4.element = false;
            a();
            new c(this, aVar4);
        }
        C1457a aVar5 = this.f65238f;
        if (aVar5 == null) {
            l.a("jsParams");
        }
        Integer num8 = aVar5.f65241b;
        if (num8 != null && 1 == num8.intValue()) {
            z.a aVar6 = new z.a();
            aVar6.element = false;
            a();
            new d(this, aVar6);
        }
        new Thread(new e(this, hVar)).start();
    }
}
