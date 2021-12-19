package com.bytedance.globalpayment.payment.common.lib.h.a;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.payment.common.lib.a.d;
import com.bytedance.globalpayment.payment.common.lib.h.a;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings;
import com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings;
import com.bytedance.push.settings.h;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class g implements com.bytedance.globalpayment.payment.common.lib.h.b.g {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f30602a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private Set<d> f30603b;

    static {
        Covode.recordClassIndex(17737);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.a.d
    public final void a() {
        Set<d> set = this.f30603b;
        if (set != null) {
            for (d dVar : set) {
                dVar.a();
            }
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final PaymentOnlineSettings b() {
        return (PaymentOnlineSettings) h.a(a.a().i().b(), PaymentOnlineSettings.class);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final PaymentLocalSettings c() {
        return (PaymentLocalSettings) h.a(a.a().i().b(), PaymentLocalSettings.class);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final boolean d() {
        JSONObject a2 = b().a();
        if (a2 != null) {
            return a2.optBoolean("use_new_restore_order", true);
        }
        return true;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final long e() {
        JSONObject a2 = b().a();
        if (a2 != null) {
            return a2.optLong("try_to_start_restore_task_delay", InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        return InteractFirstFrameTimeOutDurationSetting.DEFAULT;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final long f() {
        JSONObject a2 = b().a();
        if (a2 != null) {
            return a2.optLong("try_to_start_restore_task_delay", 5000);
        }
        return 5000;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final long g() {
        JSONObject a2 = b().a();
        if (a2 != null) {
            return a2.optLong("restore_order_task_delay", 0);
        }
        return 0;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final boolean h() {
        JSONObject a2 = b().a();
        if (a2 != null) {
            return a2.optBoolean("use_new_logic_on_purchase_ok", false);
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final long i() {
        JSONObject a2 = b().a();
        if (a2 != null) {
            return a2.optLong("max_restore_order_time", 259200000);
        }
        return 259200000;
    }

    public g() {
        String str = a.a().i().c().f30510e;
        if (!TextUtils.isEmpty(str) && this.f30602a.compareAndSet(false, true)) {
            a.a().c().b().execute(new com.bytedance.globalpayment.payment.common.lib.i.a(str, this));
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.h.b.g
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            final Context b2 = a.a().i().b();
            final JSONObject optJSONObject = jSONObject.optJSONObject("sdk_key_pipo_pay");
            if (optJSONObject != null) {
                AnonymousClass1 r2 = new Runnable() {
                    /* class com.bytedance.globalpayment.payment.common.lib.h.a.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(17738);
                    }

                    public final void run() {
                        ((PaymentOnlineSettings) h.a(b2, PaymentOnlineSettings.class)).updateSettings(b2, optJSONObject);
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    e.a(r2);
                } else {
                    r2.run();
                }
            }
        }
    }
}
