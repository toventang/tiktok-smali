package com.bytedance.ugc.glue.monitor;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class UGCMonitor {
    public static final String EVENT_COMMENT = "comment";
    public static final String EVENT_PUBLISH = "ugc_publish";
    public static final int STATUS_CLICK = 1;
    public static final int STATUS_FINISH = 4;
    public static final int STATUS_REQUEST = 2;
    public static final int STATUS_RESPONSE = 3;
    public static final String TYPE_ARTICLE = "article";
    public static final String TYPE_BAOLIAO = "baoliao";
    public static final String TYPE_COMMENT_REPOST = "comment_repost";
    public static final String TYPE_FEED_COMMENTL = "feed_comment";
    public static final String TYPE_FM_AUDIO = "fm_audio";
    public static final String TYPE_PAID_COLUMN = "paid_column";
    public static final String TYPE_PHOTO = "photo";
    public static final String TYPE_POST = "post";
    public static final String TYPE_POST_DETAIL = "post_detail";
    public static final String TYPE_REPOST = "repost";
    public static final String TYPE_SHORT_VIDEO = "short_video";
    public static final String TYPE_VIDEO = "video";
    public static final String TYPE_WENDA = "wenda";
    public static final String TYPE_WENDA_ANSWER = "wenda_answer";
    public static final String TYPE_WENDA_ANSWER2 = "wenda_answer2";
    public static final String TYPE_WENDA_QUESTION = "wenda_question";

    static {
        Covode.recordClassIndex(27959);
    }

    private UGCMonitor() {
    }

    public static void event(String str, Bundle bundle) {
        UGCMonitorService.event(str, bundle);
    }

    public static void debug(int i2, Object... objArr) {
        monitor("ugc_debugger", (String) null, i2, objArr);
    }

    public static void event(String str, JSONObject jSONObject) {
        UGCMonitorService.event(str, jSONObject);
    }

    public static void metric(String str, int i2, JSONObject jSONObject) {
        metric(str, (String) null, i2, jSONObject);
    }

    public static void monitor(String str, int i2, JSONObject jSONObject) {
        monitor(str, (String) null, i2, jSONObject);
    }

    public static void metric(String str, int i2, Object... objArr) {
        metric(str, (String) null, i2, objArr);
    }

    public static void monitor(String str, int i2, Object... objArr) {
        monitor(str, (String) null, i2, objArr);
    }

    public static void metric(String str, String str2, int i2, Object... objArr) {
        UGCMonitorService.metric(str, str2, i2, objArr);
    }

    public static void monitor(String str, String str2, int i2, Object... objArr) {
        UGCMonitorService.monitor(str, str2, i2, objArr);
    }

    public static void send(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        UGCMonitorService.send(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void metric(String str, String str2, int i2, JSONObject jSONObject) {
        UGCMonitorService.metric(str, str2, i2, jSONObject);
    }

    public static void monitor(String str, String str2, int i2, JSONObject jSONObject) {
        UGCMonitorService.monitor(str, str2, i2, jSONObject);
    }
}
