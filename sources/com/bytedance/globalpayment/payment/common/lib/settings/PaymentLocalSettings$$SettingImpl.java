package com.bytedance.globalpayment.payment.common.lib.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.a;
import com.bytedance.push.settings.c;
import com.bytedance.push.settings.storage.i;

public class PaymentLocalSettings$$SettingImpl implements PaymentLocalSettings {

    /* renamed from: a  reason: collision with root package name */
    private Context f30615a;

    /* renamed from: b  reason: collision with root package name */
    private i f30616b;

    /* renamed from: c  reason: collision with root package name */
    private final c f30617c = new c() {
        /* class com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(17757);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            return null;
        }
    };

    static {
        Covode.recordClassIndex(17756);
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final String a() {
        i iVar = this.f30616b;
        if (iVar == null || !iVar.f("need_restore_orders")) {
            return "";
        }
        return this.f30616b.a("need_restore_orders");
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final long b() {
        i iVar = this.f30616b;
        if (iVar == null || !iVar.f("last_settings_request_time")) {
            return 0;
        }
        return this.f30616b.c("last_settings_request_time");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f30616b;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final void a(long j2) {
        i iVar = this.f30616b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putLong("last_settings_request_time", j2);
            a2.apply();
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final void a(String str) {
        i iVar = this.f30616b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("need_restore_orders", str);
            a2.apply();
        }
    }

    public PaymentLocalSettings$$SettingImpl(Context context, i iVar) {
        this.f30615a = context;
        this.f30616b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f30616b;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
