package com.bytedance.globalpayment.payment.common.lib.h.a;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.payment.common.lib.a.b;
import com.bytedance.globalpayment.payment.common.lib.h.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class f implements com.bytedance.globalpayment.payment.common.lib.h.b.f {
    static {
        Covode.recordClassIndex(17733);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.f
    public final String a() {
        String str = a.a().i().c().f30517l;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.globalpayment.payment.common.lib.b.a c2 = a.a().i().c();
        if (c2.f30514i) {
            boolean z = c2.f30513h;
            return "";
        } else if (c2.f30511f == com.bytedance.globalpayment.payment.common.lib.d.a.SG) {
            if (c2.f30513h) {
                return "";
            }
            return "https://f-p.sgsnssdk.com";
        } else if (c2.f30511f != com.bytedance.globalpayment.payment.common.lib.d.a.VA || c2.f30513h) {
            return "";
        } else {
            return "https://f-p-va.isnssdk.com";
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.f
    public final void a(final String str, final b bVar) {
        a.a().c().b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.payment.common.lib.h.a.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(17734);
            }

            public final void run() {
                try {
                    bVar.a(j.f26946a.a(str, a.a().i().c().o));
                } catch (Throwable th) {
                    int i2 = -100;
                    if (th instanceof com.bytedance.common.utility.b) {
                        i2 = th.getResponseCode();
                    }
                    bVar.a(new AbsResult().withErrorCode(1).withDetailCode(i2).withMessage(th.getMessage()));
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.f
    public final void a(final String str, final Map<String, String> map, final b bVar) {
        a.a().c().b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.payment.common.lib.h.a.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(17735);
            }

            public final void run() {
                ArrayList arrayList = new ArrayList();
                Map map = map;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
                try {
                    bVar.a(j.f26946a.a(str, arrayList, a.a().i().c().o));
                } catch (Throwable th) {
                    int i2 = -100;
                    if (th instanceof com.bytedance.common.utility.b) {
                        i2 = th.getResponseCode();
                    }
                    bVar.a(new AbsResult().withErrorCode(1).withDetailCode(i2).withMessage(th.getMessage()));
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.f
    public final void a(final String str, final byte[] bArr, final Map<String, String> map, final j.a aVar, final b bVar) {
        a.a().c().b().execute(new Runnable() {
            /* class com.bytedance.globalpayment.payment.common.lib.h.a.f.AnonymousClass3 */

            static {
                Covode.recordClassIndex(17736);
            }

            public final void run() {
                try {
                    HashMap hashMap = new HashMap();
                    Map map = map;
                    if (map != null) {
                        hashMap.putAll(map);
                    }
                    com.bytedance.globalpayment.payment.common.lib.b.a c2 = a.a().i().c();
                    if (c2.o != null) {
                        hashMap.putAll(c2.o);
                    }
                    bVar.a(j.f26946a.a(str, bArr, hashMap));
                } catch (Throwable th) {
                    int i2 = -100;
                    if (th instanceof com.bytedance.common.utility.b) {
                        i2 = th.getResponseCode();
                    }
                    bVar.a(new AbsResult().withErrorCode(1).withDetailCode(i2).withMessage(th.getMessage()));
                }
            }
        });
    }
}
