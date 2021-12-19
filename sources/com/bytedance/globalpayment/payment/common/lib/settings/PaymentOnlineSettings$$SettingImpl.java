package com.bytedance.globalpayment.payment.common.lib.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.a;
import com.bytedance.push.settings.b;
import com.bytedance.push.settings.c;
import com.bytedance.push.settings.d;
import com.bytedance.push.settings.storage.i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class PaymentOnlineSettings$$SettingImpl implements PaymentOnlineSettings {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f30619a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f30620b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private i f30621c;

    /* renamed from: d  reason: collision with root package name */
    private final c f30622d = new c() {
        /* class com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17760);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            if (cls == a.class) {
                return (T) new a();
            }
            if (cls == a.class) {
                return (T) new a();
            }
            if (cls == a.class) {
                return (T) new a();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(17759);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final JSONObject a() {
        i iVar = this.f30621c;
        if (iVar == null || !iVar.f("restore_settings")) {
            return null;
        }
        String a2 = this.f30621c.a("restore_settings");
        b.a(a.class, this.f30622d);
        return a.a(a2);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final boolean b() {
        i iVar = this.f30621c;
        if (iVar == null || !iVar.f("pipo_process_settings")) {
            return true;
        }
        return this.f30621c.e("pipo_process_settings");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final long c() {
        i iVar = this.f30621c;
        if (iVar == null || !iVar.f("payment_settings_request_interval")) {
            return 10800000;
        }
        return this.f30621c.c("payment_settings_request_interval");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final long d() {
        i iVar = this.f30621c;
        if (iVar == null || !iVar.f("auto_ack_after_upload_token_in_ms")) {
            return 120000;
        }
        return this.f30621c.c("auto_ack_after_upload_token_in_ms");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final boolean e() {
        i iVar = this.f30621c;
        if (iVar == null || !iVar.f("need_ack_after_success_query")) {
            return false;
        }
        return this.f30621c.e("need_ack_after_success_query");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f30621c;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    public PaymentOnlineSettings$$SettingImpl(i iVar) {
        this.f30621c = iVar;
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        i iVar;
        if (jSONObject != null && (iVar = this.f30621c) != null) {
            SharedPreferences.Editor a2 = iVar.a();
            if (jSONObject.has("restore_settings")) {
                a2.putString("restore_settings", jSONObject.optString("restore_settings"));
            }
            if (jSONObject.has("pipo_process_settings")) {
                a2.putBoolean("pipo_process_settings", d.a(jSONObject, "pipo_process_settings"));
            }
            if (jSONObject.has("payment_settings_request_interval")) {
                a2.putLong("payment_settings_request_interval", jSONObject.optLong("payment_settings_request_interval"));
            }
            if (jSONObject.has("gecko_config")) {
                a2.putString("gecko_config", jSONObject.optString("gecko_config"));
            }
            if (jSONObject.has("webview_config")) {
                a2.putString("webview_config", jSONObject.optString("webview_config"));
            }
            if (jSONObject.has("auto_ack_after_upload_token_in_ms")) {
                a2.putLong("auto_ack_after_upload_token_in_ms", jSONObject.optLong("auto_ack_after_upload_token_in_ms"));
            }
            if (jSONObject.has("need_ack_after_success_query")) {
                a2.putBoolean("need_ack_after_success_query", d.a(jSONObject, "need_ack_after_success_query"));
            }
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f30621c;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
