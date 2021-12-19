package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.i;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class PushOnlineSettings$$SettingImpl implements PushOnlineSettings {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f42303a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f42304b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private i f42305c;

    /* renamed from: d  reason: collision with root package name */
    private final c f42306d = new c() {
        /* class com.bytedance.push.settings.PushOnlineSettings$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25842);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25841);
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long b() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("ttpush_update_sender_interval")) {
            return 10800000;
        }
        return this.f42305c.c("ttpush_update_sender_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long c() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("ttpush_update_token_interval")) {
            return 86400000;
        }
        return this.f42305c.c("ttpush_update_token_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean d() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("ttpush_enable_restrict_update_token")) {
            return false;
        }
        return this.f42305c.e("ttpush_enable_restrict_update_token");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean e() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("ttpush_shut_push_on_stop_service")) {
            return false;
        }
        return this.f42305c.e("ttpush_shut_push_on_stop_service");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean f() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("is_receiver_message_wakeup_screen")) {
            return false;
        }
        return this.f42305c.e("is_receiver_message_wakeup_screen");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int g() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("receiver_message_wakeup_screen_time")) {
            return 5000;
        }
        return this.f42305c.b("receiver_message_wakeup_screen_time");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long h() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("ttpush_upload_switch_interval")) {
            return 86400000;
        }
        return this.f42305c.c("ttpush_upload_switch_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int i() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("ttpush_forbid_alias")) {
            return 0;
        }
        return this.f42305c.b("ttpush_forbid_alias");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean j() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("need_control_miui_flares_v2")) {
            return true;
        }
        return this.f42305c.e("need_control_miui_flares_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean k() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("remove_auto_boot_v2")) {
            return false;
        }
        return this.f42305c.e("remove_auto_boot_v2");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long l() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("frontier_update_setting_interval")) {
            return 10080;
        }
        return this.f42305c.c("frontier_update_setting_interval");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int m() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("frontier_strategy")) {
            return 0;
        }
        return this.f42305c.b("frontier_strategy");
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean a() {
        i iVar = this.f42305c;
        if (iVar == null || !iVar.f("allow_settings_notify_enable")) {
            return true;
        }
        return this.f42305c.e("allow_settings_notify_enable");
    }

    @Override // com.bytedance.push.settings.ISettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f42305c;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    public PushOnlineSettings$$SettingImpl(i iVar) {
        this.f42305c = iVar;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final void a(boolean z) {
        i iVar = this.f42305c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("allow_settings_notify_enable", z);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final void b(boolean z) {
        i iVar = this.f42305c;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("ttpush_shut_push_on_stop_service", z);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void updateSettings(Context context, JSONObject jSONObject) {
        i iVar;
        if (jSONObject != null && (iVar = this.f42305c) != null) {
            SharedPreferences.Editor a2 = iVar.a();
            if (jSONObject.has("ttpush_allow_settings_notify_enable")) {
                a2.putBoolean("allow_settings_notify_enable", d.a(jSONObject, "ttpush_allow_settings_notify_enable"));
            }
            if (jSONObject.has("ttpush_update_sender_interval")) {
                a2.putLong("ttpush_update_sender_interval", jSONObject.optLong("ttpush_update_sender_interval"));
            }
            if (jSONObject.has("ttpush_update_token_interval")) {
                a2.putLong("ttpush_update_token_interval", jSONObject.optLong("ttpush_update_token_interval"));
            }
            if (jSONObject.has("ttpush_enable_restrict_update_token")) {
                a2.putBoolean("ttpush_enable_restrict_update_token", d.a(jSONObject, "ttpush_enable_restrict_update_token"));
            }
            if (jSONObject.has("ttpush_shut_push_on_stop_service")) {
                a2.putBoolean("ttpush_shut_push_on_stop_service", d.a(jSONObject, "ttpush_shut_push_on_stop_service"));
            }
            if (jSONObject.has("ttpush_is_receiver_message_wakeup_screen")) {
                a2.putBoolean("is_receiver_message_wakeup_screen", d.a(jSONObject, "ttpush_is_receiver_message_wakeup_screen"));
            }
            if (jSONObject.has("ttpush_receiver_message_wakeup_screen_time")) {
                a2.putInt("receiver_message_wakeup_screen_time", jSONObject.optInt("ttpush_receiver_message_wakeup_screen_time"));
            }
            if (jSONObject.has("ttpush_upload_switch_interval")) {
                a2.putLong("ttpush_upload_switch_interval", jSONObject.optLong("ttpush_upload_switch_interval"));
            }
            if (jSONObject.has("ttpush_forbid_alias")) {
                a2.putInt("ttpush_forbid_alias", jSONObject.optInt("ttpush_forbid_alias"));
            }
            if (jSONObject.has("need_control_miui_flares_v2")) {
                a2.putBoolean("need_control_miui_flares_v2", d.a(jSONObject, "need_control_miui_flares_v2"));
            }
            if (jSONObject.has("remove_auto_boot_v2")) {
                a2.putBoolean("remove_auto_boot_v2", d.a(jSONObject, "remove_auto_boot_v2"));
            }
            if (jSONObject.has("remove_umeng_autoboot")) {
                a2.putBoolean("remove_umeng_autoboot", d.a(jSONObject, "remove_umeng_autoboot"));
            }
            if (jSONObject.has("frontier_update_setting_interval")) {
                a2.putLong("frontier_update_setting_interval", jSONObject.optLong("frontier_update_setting_interval"));
            }
            if (jSONObject.has("frontier_strategy")) {
                a2.putInt("frontier_strategy", jSONObject.optInt("frontier_strategy"));
            }
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f42305c;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
