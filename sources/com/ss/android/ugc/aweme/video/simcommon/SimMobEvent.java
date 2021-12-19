package com.ss.android.ugc.aweme.video.simcommon;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import org.json.JSONObject;

public class SimMobEvent implements IEvent {
    static {
        Covode.recordClassIndex(94068);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent
    public void onEvent(String str, JSONObject jSONObject) {
        r.a(str, jSONObject);
    }

    public void onEvent(String str, String str2, long j2) {
        r.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setExtValueLong(j2));
    }

    public void onEvent(String str, String str2, String str3) {
        r.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setExtValueString(str3));
    }
}
