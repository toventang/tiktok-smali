package com.ss.android.ugc.aweme.dynamicfeature;

import android.text.TextUtils;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Set;
import org.json.JSONObject;

final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final LivePluginInitTask f84180a;

    static {
        Covode.recordClassIndex(52494);
    }

    a(LivePluginInitTask livePluginInitTask) {
        this.f84180a = livePluginInitTask;
    }

    public final void run() {
        int i2;
        LivePluginInitTask livePluginInitTask = this.f84180a;
        if (livePluginInitTask.f84178c != null) {
            if (livePluginInitTask.f84176a == null) {
                livePluginInitTask.f84176a = d.a(livePluginInitTask.f84178c, "google_play_plugin_status", 0);
            }
            if (livePluginInitTask.f84177b == null) {
                livePluginInitTask.f84177b = com.google.android.play.core.e.d.a(livePluginInitTask.f84178c);
            }
            Set<String> b2 = livePluginInitTask.f84177b.b();
            for (String str : livePluginInitTask.f84179d) {
                boolean contains = b2.contains(str);
                String string = livePluginInitTask.f84176a.getString(str, "");
                if (contains) {
                    i2 = 3;
                    if (TextUtils.equals("stage_installed", string)) {
                        i2 = 1;
                    } else if (TextUtils.equals("stage_start_install", string)) {
                        i2 = 2;
                    }
                } else {
                    i2 = TextUtils.equals("stage_start_install", string) ? 4 : 0;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("plugin_name", str);
                } catch (Exception unused) {
                }
                try {
                    jSONObject.put("plugin_status", i2);
                } catch (Exception unused2) {
                }
                b.a("ttlive_plugin_installed_all", (JSONObject) null, LivePluginInitTask.a(jSONObject));
            }
        }
    }
}
