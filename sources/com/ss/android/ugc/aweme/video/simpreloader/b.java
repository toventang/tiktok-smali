package com.ss.android.ugc.aweme.video.simpreloader;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.video.preload.api.a;
import org.json.JSONObject;

public final class b implements a {
    static {
        Covode.recordClassIndex(94196);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.a
    public final String a() {
        return AppLog.getServerDeviceId();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.a
    public final String b() {
        return AppLog.getCurrentSessionId();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.api.a
    public final void a(Context context, String str, JSONObject jSONObject) {
        AppLog.recordMiscLog(context, str, jSONObject);
    }
}
