package com.bytedance.push.frontier.setting;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.a;
import com.bytedance.push.settings.b;
import com.bytedance.push.settings.c;
import com.bytedance.push.settings.storage.i;

public class FrontierLocalSetting$$SettingImpl implements FrontierLocalSetting {

    /* renamed from: a  reason: collision with root package name */
    private Context f42152a;

    /* renamed from: b  reason: collision with root package name */
    private i f42153b;

    /* renamed from: c  reason: collision with root package name */
    private final c f42154c = new c() {
        /* class com.bytedance.push.frontier.setting.FrontierLocalSetting$$SettingImpl.AnonymousClass1 */

        static {
            Covode.recordClassIndex(25759);
        }

        @Override // com.bytedance.push.settings.c
        public final <T> T a(Class<T> cls) {
            if (cls == b.class) {
                return (T) new b();
            }
            return null;
        }
    };

    static {
        Covode.recordClassIndex(25758);
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final long a() {
        i iVar = this.f42153b;
        if (iVar == null || !iVar.f("last_request_setting_time_mil")) {
            return 0;
        }
        return this.f42153b.c("last_request_setting_time_mil");
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final a b() {
        i iVar = this.f42153b;
        if (iVar == null || !iVar.f("frontier_setting")) {
            b.a(b.class, this.f42154c);
            return new a();
        }
        String a2 = this.f42153b.a("frontier_setting");
        b.a(b.class, this.f42154c);
        return b.a(a2);
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(a aVar) {
        i iVar = this.f42153b;
        if (iVar != null) {
            iVar.a(aVar);
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final void a(long j2) {
        i iVar = this.f42153b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            a2.putLong("last_request_setting_time_mil", j2);
            a2.apply();
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final void a(a aVar) {
        i iVar = this.f42153b;
        if (iVar != null) {
            SharedPreferences.Editor a2 = iVar.a();
            b.a(b.class, this.f42154c);
            a2.putString("frontier_setting", aVar.a().toString());
            a2.apply();
        }
    }

    public FrontierLocalSetting$$SettingImpl(Context context, i iVar) {
        this.f42152a = context;
        this.f42153b = iVar;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        i iVar = this.f42153b;
        if (iVar != null) {
            iVar.a(context, str, str2, aVar);
        }
    }
}
