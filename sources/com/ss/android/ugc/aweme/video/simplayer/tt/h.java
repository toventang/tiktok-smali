package com.ss.android.ugc.aweme.video.simplayer.tt;

import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.j.s;
import org.json.JSONObject;

public final class h {
    static {
        Covode.recordClassIndex(94182);
    }

    public static String a(s sVar) {
        return String.valueOf(sVar.f152996c.hashCode());
    }

    static s a(com.ss.android.ugc.playerkit.simapicommon.a.h hVar) {
        if (hVar == null || hVar.getVideoThumbs() == null || hVar.getVideoThumbs().size() <= 0) {
            return null;
        }
        try {
            s sVar = new s();
            sVar.a(new JSONObject(hVar.getVideoThumbs().get(0).toString()));
            return sVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}
