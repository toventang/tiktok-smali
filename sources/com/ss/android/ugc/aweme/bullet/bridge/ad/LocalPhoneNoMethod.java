package com.ss.android.ugc.aweme.bullet.bridge.ad;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.m.p;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public final class LocalPhoneNoMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public CountDownLatch f68883b;

    /* renamed from: c  reason: collision with root package name */
    public b f68884c;

    /* renamed from: d  reason: collision with root package name */
    private final String f68885d = "localPhoneNo";

    /* renamed from: e  reason: collision with root package name */
    private final h f68886e = i.a((h.f.a.a) g.f68909a);

    /* renamed from: f  reason: collision with root package name */
    private a f68887f;

    /* renamed from: g  reason: collision with root package name */
    private final h f68888g = i.a((h.f.a.a) c.f68901a);

    public static final class a {
        @com.google.gson.a.c(a = "getMask")

        /* renamed from: a  reason: collision with root package name */
        public Integer f68889a;
        @com.google.gson.a.c(a = "getToken")

        /* renamed from: b  reason: collision with root package name */
        public Integer f68890b;

        static {
            Covode.recordClassIndex(42455);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: h  reason: collision with root package name */
        public static final a f68891h = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public String f68892a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f68893b = 1;

        /* renamed from: c  reason: collision with root package name */
        public volatile int f68894c;

        /* renamed from: d  reason: collision with root package name */
        public volatile int f68895d;

        /* renamed from: e  reason: collision with root package name */
        public volatile int f68896e;

        /* renamed from: f  reason: collision with root package name */
        public volatile String f68897f;

        /* renamed from: g  reason: collision with root package name */
        public volatile String f68898g;

        /* renamed from: i  reason: collision with root package name */
        private final h f68899i = i.a((h.f.a.a) C1559b.f68900a);

        static {
            Covode.recordClassIndex(42456);
        }

        /* access modifiers changed from: package-private */
        public final JSONObject a() {
            return (JSONObject) this.f68899i.getValue();
        }

        public static final class a {
            static {
                Covode.recordClassIndex(42457);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod$b$b  reason: collision with other inner class name */
        static final class C1559b extends m implements h.f.a.a<JSONObject> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1559b f68900a = new C1559b();

            static {
                Covode.recordClassIndex(42458);
            }

            C1559b() {
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
        Covode.recordClassIndex(42454);
    }

    private final com.bytedance.sdk.a.k.a.e k() {
        return (com.bytedance.sdk.a.k.a.e) this.f68886e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f68885d;
    }

    static final class c extends m implements h.f.a.a<com.google.gson.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f68901a = new c();

        static {
            Covode.recordClassIndex(42459);
        }

        c() {
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
        public static final g f68909a = new g();

        static {
            Covode.recordClassIndex(42464);
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

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocalPhoneNoMethod f68906a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f68907b;

        static {
            Covode.recordClassIndex(42462);
        }

        f(LocalPhoneNoMethod localPhoneNoMethod, BaseBridgeMethod.a aVar) {
            this.f68906a = localPhoneNoMethod;
            this.f68907b = aVar;
        }

        public final void run() {
            LocalPhoneNoMethod.b(this.f68906a).await();
            new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f68908a;

                static {
                    Covode.recordClassIndex(42463);
                }

                {
                    this.f68908a = r1;
                }

                public final void run() {
                    JSONObject a2;
                    BaseBridgeMethod.a aVar = this.f68908a.f68907b;
                    b a3 = LocalPhoneNoMethod.a(this.f68908a.f68906a);
                    if (a3.f68893b == 0) {
                        a2 = new JSONObject();
                        a2.put("code", a3.f68893b);
                        String str = a3.f68892a;
                        if (str == null) {
                            l.a("from");
                        }
                        a2.put("from", str);
                        a2.put("tokenErrorCode", a3.f68894c);
                        a2.put("maskErrorCode", a3.f68895d);
                        a2.put("networkType", a3.f68896e);
                    } else {
                        a3.a().put("code", a3.f68893b);
                        JSONObject a4 = a3.a();
                        String str2 = a3.f68892a;
                        if (str2 == null) {
                            l.a("from");
                        }
                        a4.put("from", str2);
                        a2 = a3.a();
                    }
                    aVar.a(a2);
                }
            });
        }
    }

    public static final /* synthetic */ b a(LocalPhoneNoMethod localPhoneNoMethod) {
        b bVar = localPhoneNoMethod.f68884c;
        if (bVar == null) {
            l.a("jsResponseBody");
        }
        return bVar;
    }

    public static final /* synthetic */ CountDownLatch b(LocalPhoneNoMethod localPhoneNoMethod) {
        CountDownLatch countDownLatch = localPhoneNoMethod.f68883b;
        if (countDownLatch == null) {
            l.a("countDownLatch");
        }
        return countDownLatch;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalPhoneNoMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    public static final class d implements com.bytedance.sdk.a.k.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocalPhoneNoMethod f68902a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f68903b;

        static {
            Covode.recordClassIndex(42460);
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(com.bytedance.sdk.a.k.c.c cVar) {
            int i2;
            Integer e2;
            if (!this.f68903b.element) {
                this.f68903b.element = true;
                LocalPhoneNoMethod.a(this.f68902a).f68893b = 0;
                b a2 = LocalPhoneNoMethod.a(this.f68902a);
                String str = cVar.f43389c;
                if (str == null || (e2 = p.e(str)) == null) {
                    i2 = -1;
                } else {
                    i2 = e2.intValue();
                }
                a2.f68895d = i2;
                LocalPhoneNoMethod.b(this.f68902a).countDown();
            }
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(Bundle bundle) {
            String str;
            if (!this.f68903b.element) {
                this.f68903b.element = true;
                if (bundle != null) {
                    str = bundle.getString("security_phone");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    LocalPhoneNoMethod.a(this.f68902a).f68893b = 0;
                } else {
                    b a2 = LocalPhoneNoMethod.a(this.f68902a);
                    a2.f68898g = str;
                    a2.a().put("phoneMask", str);
                }
                LocalPhoneNoMethod.b(this.f68902a).countDown();
            }
        }

        d(LocalPhoneNoMethod localPhoneNoMethod, z.a aVar) {
            this.f68902a = localPhoneNoMethod;
            this.f68903b = aVar;
        }
    }

    public static final class e implements com.bytedance.sdk.a.k.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocalPhoneNoMethod f68904a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f68905b;

        static {
            Covode.recordClassIndex(42461);
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(com.bytedance.sdk.a.k.c.c cVar) {
            int i2;
            Integer e2;
            if (!this.f68905b.element) {
                this.f68905b.element = true;
                LocalPhoneNoMethod.a(this.f68904a).f68893b = 0;
                b a2 = LocalPhoneNoMethod.a(this.f68904a);
                String str = cVar.f43389c;
                if (str == null || (e2 = p.e(str)) == null) {
                    i2 = -1;
                } else {
                    i2 = e2.intValue();
                }
                a2.f68894c = i2;
                LocalPhoneNoMethod.b(this.f68904a).countDown();
            }
        }

        @Override // com.bytedance.sdk.a.k.c.b
        public final void a(Bundle bundle) {
            String str;
            if (!this.f68905b.element) {
                this.f68905b.element = true;
                if (bundle != null) {
                    str = bundle.getString("access_token");
                } else {
                    str = null;
                }
                if (str == null || str.length() == 0) {
                    LocalPhoneNoMethod.a(this.f68904a).f68893b = 0;
                } else {
                    b a2 = LocalPhoneNoMethod.a(this.f68904a);
                    a2.f68897f = str;
                    a2.a().put("verifyToken", str);
                }
                LocalPhoneNoMethod.b(this.f68904a).countDown();
            }
        }

        e(LocalPhoneNoMethod localPhoneNoMethod, z.a aVar) {
            this.f68904a = localPhoneNoMethod;
            this.f68905b = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        String str;
        Integer num;
        Integer num2;
        int i2;
        int i3;
        Integer num3;
        Integer num4;
        l.d(jSONObject, "");
        l.d(aVar, "");
        b bVar = new b();
        this.f68884c = bVar;
        com.bytedance.sdk.a.k.a.e k2 = k();
        if (k2 == null || (str = k2.a()) == null) {
            str = "";
        }
        l.d(str, "");
        bVar.f68892a = str;
        b bVar2 = this.f68884c;
        if (bVar2 == null) {
            l.a("jsResponseBody");
        }
        bVar2.f68896e = k().b();
        b bVar3 = this.f68884c;
        if (bVar3 == null) {
            l.a("jsResponseBody");
        }
        if (bVar3.f68892a == null) {
            l.a("from");
        }
        Object a2 = ((com.google.gson.f) this.f68888g.getValue()).a(jSONObject.toString(), a.class);
        l.b(a2, "");
        a aVar2 = (a) a2;
        b bVar4 = this.f68884c;
        if (bVar4 == null) {
            l.a("jsResponseBody");
        }
        if ((aVar2.f68889a != null && (((num3 = aVar2.f68889a) == null || num3.intValue() != 1) && ((num4 = aVar2.f68889a) == null || num4.intValue() != 0))) || (aVar2.f68890b != null && (((num = aVar2.f68890b) == null || num.intValue() != 1) && ((num2 = aVar2.f68890b) == null || num2.intValue() != 0)))) {
            aVar2.f68889a = 0;
            aVar2.f68890b = 0;
            bVar4.f68893b = 0;
        }
        this.f68887f = aVar2;
        Integer num5 = aVar2.f68889a;
        if (num5 != null) {
            i2 = num5.intValue();
        } else {
            i2 = 0;
        }
        int i4 = i2 + 0;
        a aVar3 = this.f68887f;
        if (aVar3 == null) {
            l.a("jsParams");
        }
        Integer num6 = aVar3.f68890b;
        if (num6 != null) {
            i3 = num6.intValue();
        } else {
            i3 = 0;
        }
        this.f68883b = new CountDownLatch(i4 + i3);
        a aVar4 = this.f68887f;
        if (aVar4 == null) {
            l.a("jsParams");
        }
        Integer num7 = aVar4.f68889a;
        if (num7 != null && 1 == num7.intValue()) {
            z.a aVar5 = new z.a();
            aVar5.element = false;
            k();
            new d(this, aVar5);
        }
        a aVar6 = this.f68887f;
        if (aVar6 == null) {
            l.a("jsParams");
        }
        Integer num8 = aVar6.f68890b;
        if (num8 != null && 1 == num8.intValue()) {
            z.a aVar7 = new z.a();
            aVar7.element = false;
            k();
            new e(this, aVar7);
        }
        new Thread(new f(this, aVar)).start();
    }
}
