package com.bytedance.globalpayment.a.a.a.e.a;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.a.a.a.e.b.b;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.j.a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class b implements com.bytedance.globalpayment.a.a.a.e.b.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f30191a = b.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f30192b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public String f30193c;

    static {
        Covode.recordClassIndex(17535);
    }

    @Override // com.bytedance.globalpayment.a.a.a.e.b.b
    public final String a(String str, String str2) {
        try {
            if (TextUtils.equals(str, this.f30193c)) {
                return this.f30192b.get(str2);
            }
            Map<String, String> a2 = com.bytedance.globalpayment.payment.common.lib.j.b.a(new JSONObject(a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), "pipo_starling.json")));
            if (!TextUtils.equals(this.f30193c, str)) {
                this.f30193c = str;
                final AnonymousClass1 r2 = new b.a() {
                    /* class com.bytedance.globalpayment.a.a.a.e.a.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b.a f30194a = null;

                    static {
                        Covode.recordClassIndex(17536);
                    }

                    @Override // com.bytedance.globalpayment.a.a.a.e.b.b.a
                    public final void a(Map<String, String> map) {
                        b.this.f30192b = map;
                        b.a aVar = this.f30194a;
                        if (aVar != null) {
                            aVar.a(map);
                        }
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    e.a(new Runnable() {
                        /* class com.bytedance.globalpayment.a.a.a.e.a.b.AnonymousClass2 */

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ String f30197b = null;

                        static {
                            Covode.recordClassIndex(17537);
                        }

                        public final void run() {
                            b bVar = b.this;
                            bVar.a(bVar.f30193c, r2, this.f30197b);
                        }
                    });
                } else {
                    a(this.f30193c, r2, null);
                }
            }
            return a2.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final void a(final String str, final b.a aVar, String str2) {
        final HashMap hashMap = new HashMap();
        com.bytedance.globalpayment.payment.common.lib.h.a.a().f();
        try {
            hashMap.putAll(com.bytedance.globalpayment.payment.common.lib.j.b.a(new JSONObject(a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b(), "pipo_starling.json"))));
        } catch (Throwable unused) {
        }
        String string = com.bytedance.globalpayment.a.a.a.b.a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b()).f30145a.getString("sp_key_starling_data_".concat(String.valueOf(str)), "");
        com.bytedance.globalpayment.payment.common.lib.h.a.a().f();
        if (!TextUtils.isEmpty(string)) {
            try {
                hashMap.putAll(com.bytedance.globalpayment.payment.common.lib.j.b.a(new JSONObject(string)));
            } catch (Throwable unused2) {
            }
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().f();
        com.bytedance.globalpayment.a.a.a.a.a().b().a(com.bytedance.globalpayment.a.a.a.b.a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b()).f30145a.getLong("sp_key_starling_version_".concat(String.valueOf(str)), 0), str, str2, new com.bytedance.globalpayment.payment.common.lib.a.a<com.bytedance.globalpayment.a.a.a.d.e>() {
            /* class com.bytedance.globalpayment.a.a.a.e.a.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17538);
            }

            @Override // com.bytedance.globalpayment.payment.common.lib.a.a
            public final void a(AbsResult absResult) {
                b.this.f30192b.putAll(hashMap);
                com.bytedance.globalpayment.payment.common.lib.h.a.a().f();
                b.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(b.this.f30192b);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.bytedance.globalpayment.payment.common.lib.a.a
            public final /* synthetic */ void a(com.bytedance.globalpayment.a.a.a.d.e eVar) {
                com.bytedance.globalpayment.a.a.a.d.e eVar2 = eVar;
                hashMap.putAll(eVar2.f30182c);
                b.this.f30192b.putAll(hashMap);
                com.bytedance.globalpayment.a.a.a.b.a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b()).f30145a.edit().putLong("sp_key_starling_version_".concat(String.valueOf(str)), Long.valueOf(eVar2.f30181b).longValue()).apply();
                com.bytedance.globalpayment.a.a.a.b.a a2 = com.bytedance.globalpayment.a.a.a.b.a.a(com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b());
                String str = str;
                a2.f30145a.edit().putString("sp_key_starling_data_".concat(String.valueOf(str)), eVar2.f30183d).apply();
                b.a aVar = aVar;
                if (aVar != null) {
                    aVar.a(b.this.f30192b);
                }
                com.bytedance.globalpayment.payment.common.lib.h.a.a().f();
            }
        });
    }
}
