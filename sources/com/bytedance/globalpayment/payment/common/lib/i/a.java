package com.bytedance.globalpayment.payment.common.lib.i;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.a.d;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.push.settings.h;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public d f30607a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30608b = a.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private String f30609c;

    static {
        Covode.recordClassIndex(17748);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public void run() {
        final Context b2 = com.bytedance.globalpayment.payment.common.lib.h.a.a().i().b();
        if (Math.abs(System.currentTimeMillis() - ((PaymentLocalSettings) h.a(b2, PaymentLocalSettings.class)).b()) < ((PaymentOnlineSettings) h.a(b2, PaymentOnlineSettings.class)).c()) {
            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
        } else {
            if (!j.f107226e || !j.b() || j.c()) {
                j.f107226e = a();
            }
            if (j.f107226e) {
                try {
                    String a2 = com.bytedance.common.utility.j.f26946a.a(com.bytedance.globalpayment.payment.common.lib.j.d.a(this.f30609c + "/service/settings/v3/?caller_name=pipo_pay", com.bytedance.globalpayment.payment.common.lib.h.a.a().i().f()), null);
                    if (TextUtils.isEmpty(a2)) {
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(a2);
                        String optString = jSONObject.optString("message");
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        if (TextUtils.equals(optString, "success") && optJSONObject != null) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
                            if (optJSONObject2 == null) {
                                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                                return;
                            }
                            final JSONObject optJSONObject3 = optJSONObject2.optJSONObject("sdk_key_pipo_pay");
                            if (optJSONObject3 == null) {
                                com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                                return;
                            }
                            com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                            AnonymousClass1 r2 = new Runnable() {
                                /* class com.bytedance.globalpayment.payment.common.lib.i.a.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(17749);
                                }

                                public final void run() {
                                    ((PaymentOnlineSettings) h.a(b2, PaymentOnlineSettings.class)).updateSettings(b2, optJSONObject3);
                                    ((PaymentLocalSettings) h.a(b2, PaymentLocalSettings.class)).a(System.currentTimeMillis());
                                    a.this.f30607a.a();
                                }
                            };
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                e.a(r2);
                                return;
                            } else {
                                r2.run();
                                return;
                            }
                        } else {
                            return;
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                        return;
                    }
                } catch (Exception e3) {
                    com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
                    Log.getStackTraceString(e3);
                    return;
                }
            }
        }
        com.bytedance.globalpayment.payment.common.lib.h.a.a().e();
    }

    public a(String str, d dVar) {
        this.f30609c = str;
        this.f30607a = dVar;
    }
}
