package com.ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.playerkit.videoview.h;
import org.json.JSONException;
import org.json.JSONObject;

public final class aa {
    static {
        Covode.recordClassIndex(93754);
    }

    private static j.g a(h hVar) {
        j.g j2;
        if (hVar == null || (j2 = hVar.j()) == null) {
            return null;
        }
        return j2;
    }

    public static String a(h hVar, String str) {
        return a(a(hVar), str);
    }

    static String a(j.g gVar, String str) {
        if (gVar != null && gVar.f115324b == null && !TextUtils.isEmpty(gVar.f115323a)) {
            try {
                return new JSONObject(gVar.f115323a).getString(str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
