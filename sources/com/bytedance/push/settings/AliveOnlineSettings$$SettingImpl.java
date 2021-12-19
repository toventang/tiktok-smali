package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class AliveOnlineSettings$$SettingImpl implements AliveOnlineSettings {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f42290a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f42291b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private i f42292c;

    /* renamed from: d  reason: collision with root package name */
    private final c f42293d = new c() {
        /* class com.bytedance.push.settings.AliveOnlineSettings$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25831);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            if (cls == e.class) {
                return (T) new e();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25830);
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void a() {
        i iVar = this.f42292c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("allow_push_job_service", false);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void b() {
        i iVar = this.f42292c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("allow_push_daemon_monitor", false);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void c() {
        i iVar = this.f42292c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("is_close_alarm_wakeup", true);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void d() {
        i iVar = this.f42292c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("is_notify_service_stick", false);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f42292c;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    public AliveOnlineSettings$$SettingImpl(i iVar) {
        this.f42292c = iVar;
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void a(String str) {
        i iVar = this.f42292c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("uninstall_question_url", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void a(boolean z) {
        i iVar = this.f42292c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("allow_off_alive", z);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        i iVar;
        if (jSONObject != null && (iVar = this.f42292c) != null) {
            SharedPreferences.Editor a2 = iVar.a();
            if (jSONObject.has("ttpush_i18n_allow_off_alive")) {
                a2.putBoolean("allow_off_alive", d.a(jSONObject, "ttpush_i18n_allow_off_alive"));
            }
            if (jSONObject.has("ttpush_uninstall_question_url")) {
                a2.putString("uninstall_question_url", jSONObject.optString("ttpush_uninstall_question_url"));
            }
            if (jSONObject.has("ttpush_allow_push_job_service")) {
                a2.putBoolean("allow_push_job_service", d.a(jSONObject, "ttpush_allow_push_job_service"));
            }
            if (jSONObject.has("ttpush_i18n_allow_push_daemon_monitor")) {
                a2.putBoolean("allow_push_daemon_monitor", d.a(jSONObject, "ttpush_i18n_allow_push_daemon_monitor"));
            }
            if (jSONObject.has("ttpush_allow_close_boot_receiver")) {
                a2.putBoolean("allow_close_boot_receiver", d.a(jSONObject, "ttpush_allow_close_boot_receiver"));
            }
            if (jSONObject.has("ttpush_is_close_alarm_wakeup")) {
                a2.putBoolean("is_close_alarm_wakeup", d.a(jSONObject, "ttpush_is_close_alarm_wakeup"));
            }
            if (jSONObject.has("ttpush_use_start_foreground_notification")) {
                a2.putBoolean("is_use_start_foreground_notification", d.a(jSONObject, "ttpush_use_start_foreground_notification"));
            }
            if (jSONObject.has("ttpush_job_schedule_wake_up_interval_second")) {
                a2.putInt("job_schedule_wake_up_interval_second", jSONObject.optInt("ttpush_job_schedule_wake_up_interval_second"));
            }
            if (jSONObject.has("ttpush_is_use_c_native_process_keep_alive")) {
                a2.putBoolean("is_use_c_native_process_keep_alive", d.a(jSONObject, "ttpush_is_use_c_native_process_keep_alive"));
            }
            if (jSONObject.has("ttpush_is_notify_service_stick")) {
                a2.putBoolean("is_notify_service_stick", d.a(jSONObject, "ttpush_is_notify_service_stick"));
            }
            if (jSONObject.has("ttpush_key_is_miui_close_daemon")) {
                a2.putBoolean("key_is_miui_close_daemon", d.a(jSONObject, "ttpush_key_is_miui_close_daemon"));
            }
            if (jSONObject.has("ttpush_alv_white_list")) {
                a2.putString("ttpush_alv_white_list", jSONObject.optString("ttpush_alv_white_list"));
            }
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f42292c;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
