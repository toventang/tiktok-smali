package com.bytedance.geckox.settings;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.d.b;
import com.bytedance.geckox.i.a;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.geckox.utils.n;

public final class c {
    static {
        Covode.recordClassIndex(17432);
    }

    public static GlobalConfigSettings a(Context context) {
        String b2 = n.a().b(context, "gecko_settings", null);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        try {
            return (GlobalConfigSettings) b.f29780a.f29781b.a(b2, GlobalConfigSettings.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static SettingsLocal b(Context context) {
        String b2 = n.a().b(context, "gecko_settings_local", null);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        try {
            return (SettingsLocal) b.f29780a.f29781b.a(b2, SettingsLocal.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void c(Context context) {
        a.a("settings cache deleted");
        n.a().a(context, "gecko_settings");
    }
}
