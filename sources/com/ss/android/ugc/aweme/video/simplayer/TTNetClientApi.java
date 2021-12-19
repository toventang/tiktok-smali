package com.ss.android.ugc.aweme.video.simplayer;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.l;
import java.util.List;
import l.b.a;
import l.b.f;
import l.b.o;
import l.b.x;
import org.json.JSONObject;

public interface TTNetClientApi {
    static {
        Covode.recordClassIndex(94129);
    }

    @f
    b<String> get(@x String str, @l List<com.bytedance.retrofit2.client.b> list);

    @o
    b<String> post(@x String str, @l List<com.bytedance.retrofit2.client.b> list, @a JSONObject jSONObject);
}
