package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.f.c;
import com.bytedance.push.settings.storage.i;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class LocalFrequencySettings$$SettingImpl implements LocalFrequencySettings {

    /* renamed from: a  reason: collision with root package name */
    private Context f42295a;

    /* renamed from: b  reason: collision with root package name */
    private i f42296b;

    /* renamed from: c  reason: collision with root package name */
    private final c f42297c = new c() {
        /* class com.bytedance.push.settings.LocalFrequencySettings$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25836);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            if (cls == j.class) {
                return (T) new j();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25835);
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final long a() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_update_sender_time_mil")) {
            return 0;
        }
        return this.f42296b.c("last_update_sender_time_mil");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String b() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_update_sender_did")) {
            return "";
        }
        return this.f42296b.a("last_update_sender_did");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String c() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_update_sender_vc")) {
            return "";
        }
        return this.f42296b.a("last_update_sender_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String d() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_update_sender_gray_vc")) {
            return "";
        }
        return this.f42296b.a("last_update_sender_gray_vc");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String e() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_update_sender_channel")) {
            return "";
        }
        return this.f42296b.a("last_update_sender_channel");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String f() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_update_sender_supported")) {
            return "";
        }
        return this.f42296b.a("last_update_sender_supported");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final boolean g() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_send_switcher_stat")) {
            return false;
        }
        return this.f42296b.e("last_send_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final int h() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("sys_switcher_stat")) {
            return -2;
        }
        return this.f42296b.b("sys_switcher_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String i() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("notify_channel_stat")) {
            return "";
        }
        return this.f42296b.a("notify_channel_stat");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final long k() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("last_upload_switch_ts")) {
            return 0;
        }
        return this.f42296b.c("last_upload_switch_ts");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final List<c> j() {
        i iVar = this.f42296b;
        if (iVar == null || !iVar.f("token_cache")) {
            b.a(j.class, this.f42297c);
            return new ArrayList();
        }
        String a2 = this.f42296b.a("token_cache");
        b.a(j.class, this.f42297c);
        return j.a(a2);
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f42296b;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void a(int i2) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putInt("sys_switcher_stat", i2);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void b(long j2) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putLong("last_upload_switch_ts", j2);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void c(String str) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("last_update_sender_gray_vc", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void d(String str) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("last_update_sender_channel", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void e(String str) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("last_update_sender_supported", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void f(String str) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("notify_channel_stat", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void a(long j2) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putLong("last_update_sender_time_mil", j2);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void b(String str) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("last_update_sender_vc", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void a(String str) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("last_update_sender_did", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void a(List<c> list) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            b.a(j.class, this.f42297c);
            JSONArray jSONArray = new JSONArray();
            for (c cVar : list) {
                if (cVar != null) {
                    jSONArray.put(cVar.a());
                }
            }
            a2.putString("token_cache", jSONArray.toString());
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void a(boolean z) {
        i iVar = this.f42296b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("last_send_switcher_stat", z);
            a2.apply();
        }
    }

    public LocalFrequencySettings$$SettingImpl(Context context, i iVar) {
        this.f42295a = context;
        this.f42296b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f42296b;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
