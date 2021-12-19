package com.ss.android.ugc.aweme.ecommerce.jsb;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class GetInfoByOCRMethod extends BaseCommonJavaMethod implements au {

    /* renamed from: a  reason: collision with root package name */
    public static final a f86113a = new a((byte) 0);

    static {
        Covode.recordClassIndex(53880);
    }

    private GetInfoByOCRMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {

        /* access modifiers changed from: package-private */
        public final /* synthetic */ class d implements com.bytedance.android.ecommerce.i.b {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ h.f.a.m f86124a;

            static {
                Covode.recordClassIndex(53887);
            }

            d(h.f.a.m mVar) {
                this.f86124a = mVar;
            }

            @Override // com.bytedance.android.ecommerce.i.b
            public final /* synthetic */ void a(String str, JSONObject jSONObject) {
                l.b(this.f86124a.invoke(str, jSONObject), "");
            }
        }

        static {
            Covode.recordClassIndex(53881);
        }

        private a() {
        }

        public static final class b implements com.bytedance.android.ecommerce.c.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JSONObject f86115a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseCommonJavaMethod.a f86116b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ BaseBridgeMethod.a f86117c;

            static {
                Covode.recordClassIndex(53883);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b$a  reason: collision with other inner class name */
            static final class RunnableC2070a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f86118a;

                static {
                    Covode.recordClassIndex(53884);
                }

                RunnableC2070a(b bVar) {
                    this.f86118a = bVar;
                }

                public final void run() {
                    a.a(this.f86118a.f86115a, this.f86118a.f86116b, this.f86118a.f86117c);
                }
            }

            @Override // com.bytedance.android.ecommerce.c.b
            public final void a() {
                new Handler(Looper.getMainLooper()).post(new RunnableC2070a(this));
            }

            b(JSONObject jSONObject, BaseCommonJavaMethod.a aVar, BaseBridgeMethod.a aVar2) {
                this.f86115a = jSONObject;
                this.f86116b = aVar;
                this.f86117c = aVar2;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$a  reason: collision with other inner class name */
        public static final /* synthetic */ class C2069a extends j implements h.f.a.m<String, JSONObject, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C2069a f86114a = new C2069a();

            static {
                Covode.recordClassIndex(53882);
            }

            C2069a() {
                super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Lorg/json/JSONObject;)V", 0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(String str, JSONObject jSONObject) {
                r.a(str, jSONObject);
                return z.f158842a;
            }
        }

        public static final class c implements com.bytedance.android.ecommerce.c.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ JSONObject f86119a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ BaseCommonJavaMethod.a f86120b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ BaseBridgeMethod.a f86121c;

            static {
                Covode.recordClassIndex(53885);
            }

            c(JSONObject jSONObject, BaseCommonJavaMethod.a aVar, BaseBridgeMethod.a aVar2) {
                this.f86119a = jSONObject;
                this.f86120b = aVar;
                this.f86121c = aVar2;
            }

            @Override // com.bytedance.android.ecommerce.c.d
            public final void a(int i2, int i3, String str, com.bytedance.android.ecommerce.a.b.b bVar) {
                String str2;
                final JSONObject jSONObject = new JSONObject();
                jSONObject.put("detail_code", i3);
                jSONObject.put("message", str);
                jSONObject.put("code", i2);
                if (bVar == null || (str2 = bVar.f6918h) == null) {
                    str2 = "";
                }
                jSONObject.put("number", str2);
                if (!(bVar == null || bVar.n == null)) {
                    byte[] encode = Base64.encode(bVar.a(), 0);
                    l.b(encode, "");
                    Charset defaultCharset = Charset.defaultCharset();
                    l.b(defaultCharset, "");
                    jSONObject.put("image_str", new String(encode, defaultCharset));
                }
                new Handler(Looper.getMainLooper()).post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod.a.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f86122a;

                    static {
                        Covode.recordClassIndex(53886);
                    }

                    {
                        this.f86122a = r1;
                    }

                    public final void run() {
                        BaseCommonJavaMethod.a aVar = this.f86122a.f86120b;
                        if (aVar != null) {
                            aVar.a(jSONObject);
                        }
                        BaseBridgeMethod.a aVar2 = this.f86122a.f86121c;
                        if (aVar2 != null) {
                            aVar2.a(jSONObject);
                        }
                    }
                });
            }
        }

        public static void b(JSONObject jSONObject, BaseCommonJavaMethod.a aVar, BaseBridgeMethod.a aVar2) {
            if (jSONObject == null) {
                return;
            }
            if (!com.bytedance.android.ecommerce.a.f6869a.a()) {
                c(jSONObject, aVar, aVar2);
            } else {
                a(jSONObject, aVar, aVar2);
            }
        }

        public static JSONObject a(JSONObject jSONObject, BaseCommonJavaMethod.a aVar, BaseBridgeMethod.a aVar2) {
            com.bytedance.android.ecommerce.e.d dVar = com.bytedance.android.ecommerce.a.f6869a;
            com.bytedance.android.ecommerce.a.f6869a.c(jSONObject.optString("nonce"));
            com.bytedance.android.ecommerce.a.f6869a.d(jSONObject.optString("merchant_user_id"));
            dVar.a(jSONObject.optString("merchant_id"), new c(jSONObject, aVar, aVar2));
            return jSONObject;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void c(org.json.JSONObject r4, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r5, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r6) {
            /*
                boolean r0 = com.ss.android.ugc.aweme.language.d.c()
                if (r0 != 0) goto L_0x0053
                java.lang.String r3 = "https://f-p-va.isnssdk.com"
            L_0x0008:
                com.bytedance.android.ecommerce.e.a$a r2 = new com.bytedance.android.ecommerce.e.a$a
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
                r2.<init>(r0)
                com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$a r1 = com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod.a.C2069a.f86114a
                if (r1 == 0) goto L_0x001b
                com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d r0 = new com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$d
                r0.<init>(r1)
                r1 = r0
            L_0x001b:
                com.bytedance.android.ecommerce.i.b r1 = (com.bytedance.android.ecommerce.i.b) r1
                r2.f7053l = r1
                java.lang.String r0 = "merchant_user_id"
                java.lang.String r0 = r4.optString(r0)
                r2.s = r0
                java.lang.String r0 = "nonce"
                java.lang.String r0 = r4.optString(r0)
                r2.r = r0
                com.ss.android.ugc.aweme.ecommerce.combinepayment.a r0 = new com.ss.android.ugc.aweme.ecommerce.combinepayment.a
                r0.<init>()
                r2.n = r0
                com.ss.android.ugc.aweme.setting.services.ISettingService r0 = com.ss.android.ugc.aweme.setting.services.SettingServiceImpl.v()
                java.lang.String r0 = r0.h()
                r2.f7054m = r0
                r2.f7043b = r3
                com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b r0 = new com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod$a$b
                r0.<init>(r4, r5, r6)
                r2.t = r0
                com.bytedance.android.ecommerce.e.a r1 = r2.a()
                com.bytedance.android.ecommerce.e.d r0 = com.bytedance.android.ecommerce.a.f6869a
                r0.a(r1)
                return
            L_0x0053:
                java.lang.String r3 = "https://f-p.sgsnssdk.com"
                goto L_0x0008
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.jsb.GetInfoByOCRMethod.a.c(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
        }
    }

    private /* synthetic */ GetInfoByOCRMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public GetInfoByOCRMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        a.b(jSONObject, aVar, null);
    }
}
