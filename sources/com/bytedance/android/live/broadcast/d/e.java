package com.bytedance.android.live.broadcast.d;

import android.os.Build;
import com.bytedance.android.live.broadcast.stream.a.a;
import com.bytedance.android.live.effect.d;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.broadcast.CameraTypeSettingSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdkapi.host.b;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.android.livesdkapi.e f7846a = ((b) com.bytedance.android.live.t.a.a(b.class)).b();

    static {
        Covode.recordClassIndex(3881);
    }

    private static int a(List<FilterModel> list) {
        int intValue = com.bytedance.android.livesdk.ap.a.O.a().intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    @Override // com.bytedance.android.live.broadcast.stream.a.a
    public final void a(String str, JSONObject jSONObject) {
        String filterPath;
        boolean z;
        if (!"live_client_monitor_log".equals(str)) {
            ((com.bytedance.android.live.base.b.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.base.b.a.class)).a(str, jSONObject);
            return;
        }
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("mode");
                if ("live_client_monitor_log".equals(str) && "rtc".equals(string)) {
                    ((com.bytedance.android.live.base.b.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.base.b.a.class)).a(str, jSONObject);
                    return;
                }
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a(6, "uploadLog", e2.getMessage());
            }
        }
        try {
            int cameraType = CameraTypeSettingSetting.INSTANCE.getValue().getCameraType();
            if (Build.VERSION.SDK_INT >= 28) {
                cameraType = 2;
            }
            jSONObject.put("camera", cameraType);
            List<FilterModel> a2 = d.a().a();
            if (!h.a(a2)) {
                if (a2.isEmpty()) {
                    filterPath = "";
                } else {
                    filterPath = a2.get(a(a2)).getFilterPath();
                }
                if (!m.a(filterPath)) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject.put("filter_opened", z);
                jSONObject.put("filter_name", a2.get(a(a2)).getName());
            }
            jSONObject.put("beauty_white", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f18943a.f18948a * com.bytedance.android.livesdk.ap.a.P.a().floatValue()));
            jSONObject.put("beauty_skin", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f18944b.f18948a * com.bytedance.android.livesdk.ap.a.Q.a().floatValue()));
            jSONObject.put("beauty_eye", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f18945c.f18948a * com.bytedance.android.livesdk.ap.a.R.a().floatValue()));
            jSONObject.put("beauty_face", (double) (LiveBeautyParamSetting.INSTANCE.getValue().f18946d.f18948a * com.bytedance.android.livesdk.ap.a.S.a().floatValue()));
        } catch (Throwable th) {
            com.bytedance.android.live.core.c.a.a("StreamLog", th);
        }
        try {
            jSONObject.put("live_platform_version", 2160);
        } catch (Throwable th2) {
            com.bytedance.android.live.core.c.a.a("StreamLog", th2);
        }
        ((com.bytedance.android.live.i.a.d) com.bytedance.android.live.t.a.a(com.bytedance.android.live.i.a.d.class)).getLivePlayController().a(jSONObject, str);
    }
}
