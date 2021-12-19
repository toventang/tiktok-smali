package com.bytedance.push.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.storage.i;

public class LocalSettings$$SettingImpl implements LocalSettings {

    /* renamed from: a  reason: collision with root package name */
    private Context f42299a;

    /* renamed from: b  reason: collision with root package name */
    private i f42300b;

    /* renamed from: c  reason: collision with root package name */
    private final c f42301c = new c() {
        /* class com.bytedance.push.settings.LocalSettings$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25839);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25838);
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final String a() {
        i iVar = this.f42300b;
        if (iVar == null || !iVar.f("push_daemon_monitor_result")) {
            return "";
        }
        return this.f42300b.a("push_daemon_monitor_result");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final String b() {
        i iVar = this.f42300b;
        if (iVar == null || !iVar.f("push_channels_json_array")) {
            return "";
        }
        return this.f42300b.a("push_channels_json_array");
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final boolean c() {
        i iVar = this.f42300b;
        if (iVar == null || !iVar.f("push_notify_enable")) {
            return true;
        }
        return this.f42300b.e("push_notify_enable");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f42300b;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void a(String str) {
        i iVar = this.f42300b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("push_daemon_monitor_result", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void b(String str) {
        i iVar = this.f42300b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putString("push_channels_json_array", str);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void a(boolean z) {
        i iVar = this.f42300b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putBoolean("allow_network", z);
            a2.apply();
        }
    }

    public LocalSettings$$SettingImpl(Context context, i iVar) {
        this.f42299a = context;
        this.f42300b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f42300b;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
