package com.ss.android.ugc.aweme.video.simplayer;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.a.b;
import com.ss.android.ugc.playerkit.model.c;
import com.ss.android.ugc.playerkit.simapicommon.a;
import org.json.JSONArray;
import org.json.JSONException;

public final class d implements b {
    static {
        Covode.recordClassIndex(94140);
    }

    @Override // com.ss.android.ugc.playerkit.a.b
    public final void onEvent(JSONArray jSONArray) {
        boolean isEnabled = a.d().isEnabled();
        if (isEnabled) {
            a.d().e("video_playq", "to send video_playq log ");
        }
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    if (a.a().isDebug() || a.C3820a.f143369a.b().playEventLogEnabled()) {
                        if (isEnabled) {
                            com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "to send log before " + jSONArray.getJSONObject(i2).toString());
                        }
                        a.C3820a.f143369a.a().recordMiscLog(com.ss.android.ugc.playerkit.simapicommon.a.f148866a, "video_playq", jSONArray.getJSONObject(i2));
                        if (isEnabled) {
                            com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "to send log after " + jSONArray.getJSONObject(i2).toString());
                        }
                    }
                } catch (JSONException e2) {
                    if (isEnabled) {
                        com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "JSONException".concat(String.valueOf(e2)));
                    }
                    e2.printStackTrace();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.playerkit.a.b
    public final void a(JSONArray jSONArray, String str) {
        boolean isEnabled = com.ss.android.ugc.playerkit.simapicommon.a.d().isEnabled();
        if (isEnabled) {
            com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "to send video_playq logv2 ");
        }
        if (!(jSONArray == null || TextUtils.isEmpty(str) || !c.f148702a.isEnablePlayerLogV2())) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (isEnabled) {
                    try {
                        com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "to send video_playq logv2 before");
                    } catch (JSONException e2) {
                        if (isEnabled) {
                            com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "JSONException ".concat(String.valueOf(e2)));
                        }
                        e2.printStackTrace();
                    }
                }
                com.ss.android.ugc.playerkit.simapicommon.a.c().onEvent(str, jSONArray.getJSONObject(i2));
                if (isEnabled) {
                    com.ss.android.ugc.playerkit.simapicommon.a.d().e("video_playq", "to send video_playq logv2 after");
                }
            }
        }
    }
}
