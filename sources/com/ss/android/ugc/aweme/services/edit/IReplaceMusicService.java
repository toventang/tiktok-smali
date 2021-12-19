package com.ss.android.ugc.aweme.services.edit;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public interface IReplaceMusicService {
    static {
        Covode.recordClassIndex(79605);
    }

    void doRequest(String str, ReplaceMusicRequest replaceMusicRequest, e eVar);

    boolean getClickPost();

    String getCover();

    ReplaceMusicRequest getReplaceMusicRequest();

    boolean isInPublish();

    void setClickPost(boolean z);

    void setCover(String str);

    void setReplaceMusicRequest(ReplaceMusicRequest replaceMusicRequest);

    void showWindow(JSONObject jSONObject, boolean z);

    void showWindow(boolean z, String str, ReplaceMusicRequest replaceMusicRequest);
}
