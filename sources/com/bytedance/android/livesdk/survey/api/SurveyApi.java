package com.bytedance.android.livesdk.survey.api;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.survey.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import f.a.t;
import java.util.HashMap;

public interface SurveyApi {
    static {
        Covode.recordClassIndex(12658);
    }

    @h(a = "/webcast/room/survey/list/")
    t<d<a>> list(@z(a = "room_id") long j2);

    @com.bytedance.retrofit2.b.t(a = "/webcast/room/survey/submit/")
    @g
    t<d<Void>> submit(@f HashMap<String, Object> hashMap);
}
