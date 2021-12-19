package com.ss.android.ugc.aweme.detail.ui;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.feed.param.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {
    static {
        Covode.recordClassIndex(49749);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a(Activity activity, b bVar, int i2) {
        if (!"undefined".equalsIgnoreCase(bVar.getAid())) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String a2 = a(activity.getIntent(), "invitation_code");
            String a3 = a(activity.getIntent(), "invitor");
            jSONObject.put("id", bVar.getAid());
            jSONObject.put("refer", bVar.getEventType());
            jSONObject.put("ids", bVar.getIds());
            jSONObject.put("userid", bVar.getUid());
            jSONObject.put("video_from", bVar.getFrom());
            jSONObject.put("page_type", i2);
            jSONObject.put("music_id", bVar.getMusicId());
            jSONObject.put("sticker_id", bVar.getStickerId());
            jSONObject.put("movie_id", bVar.getMvId());
            jSONObject.put("challenge_id", bVar.getChallengeId());
            jSONObject.put("question_id", bVar.getQuestionId());
            jSONObject.put("invitation_code", a2);
            jSONObject.put("invitor", a3);
            jSONObject.put("video_type", bVar.getVideoType());
            jSONObject.put("push_params", bVar.getPushParams());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        n.a("aweme_detail_aid_undefined", jSONObject);
        activity.finish();
        return true;
    }
}
