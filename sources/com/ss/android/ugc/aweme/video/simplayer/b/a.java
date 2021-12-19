package com.ss.android.ugc.aweme.video.simplayer.b;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.f;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f143844a = SettingsManager.a().a("playermanager_background_check", 0);

    static {
        Covode.recordClassIndex(94135);
    }

    private static void b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            b.a("play_video_in_app_background", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    public static boolean a(String str) {
        int i2 = f143844a;
        if (i2 == 1) {
            if (TextUtils.equals("resumePlay", str)) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "PlayerManagerLegacyHelper", Log.getStackTraceString(new Throwable("resumePlay")));
            }
        } else if (i2 != 1) {
            return false;
        }
        if (!f.f34637l) {
            return false;
        }
        String stackTraceString = Log.getStackTraceString(new Throwable("PlayVideoInAppBackground"));
        b(stackTraceString);
        com.ss.android.ugc.aweme.framework.a.a.b(4, "PlayerManagerLegacyHelper", "Try play video when app is in background, trace is ".concat(String.valueOf(stackTraceString)));
        return true;
    }
}
