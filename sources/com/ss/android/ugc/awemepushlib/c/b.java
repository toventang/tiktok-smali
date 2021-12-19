package com.ss.android.ugc.awemepushlib.c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.d;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class b implements Serializable {
    public int alertType;
    public transient JSONObject appData;
    public String callback;
    public a extra;
    public int filter = 1;
    public boolean functionalPush;
    public long id;
    public int imageType;
    public String imageUrl;
    public int isPing;
    public boolean led;
    public String openUrl;
    public transient JSONObject originData;
    public int pass_through = 1;
    public String postBack;
    public boolean preloadArticle;
    public String rawJson;
    public long rid64;
    public boolean sound;
    public int soundType;
    public String soundUrl;
    public String targetSecUid;
    public String text;
    public String title;
    public boolean useSound;
    public boolean vibrator;

    static {
        Covode.recordClassIndex(95058);
    }

    public static final class a implements Serializable {
        public ArrayList<String[]> actionList = new ArrayList<>();
        public int activeClickValid;
        public boolean allowBannerDelete = true;
        public String authorId;
        public int badgeCount = -1;
        public String bg_color = "";
        public String challengeId;
        public String customAction;
        public String extra_text;
        public int floatWindow = -1;
        public long float_window_show_time = 12000;
        public String inAppPushType;
        public boolean isBannerDeteled;
        public boolean isGroupSummary = true;
        public boolean isZeroVibrate = true;
        public boolean is_notification_top;
        public String largeModeIconUrl;
        public String musicId;
        public int notificaitonPriority = 1;
        public String notificationChannelId = "";
        public int oppoFloatWindow = -2;
        public int oppo_push_style = 11;
        public ArrayList<String> pre_o_urls = new ArrayList<>();
        public String push_user_id;
        public String rawExtra;
        public int redBadgeOnly = -1;
        public String roomId;
        public String soundId;
        public String soundUrl;
        public long stickTopOffset;
        public int stick_top;
        public int style = -1;
        public String tagId;
        public String trackInfo;
        public boolean turn_screen_on;
        public boolean useAssetSound;
        public String userId;
        public boolean user_system_style = true;
        public int visibility;
        public float volumeFactor = 1.0f;

        static {
            Covode.recordClassIndex(95059);
        }

        public final String toJsonString() {
            return this.rawExtra;
        }

        public final int getPriority() {
            int i2 = this.notificaitonPriority;
            if (i2 > 2) {
                return 2;
            }
            if (i2 < -2) {
                return -2;
            }
            return i2;
        }

        static a a(String str) {
            boolean z;
            a aVar = new a();
            try {
                aVar.rawExtra = str;
                if (TextUtils.isEmpty(str)) {
                    return aVar;
                }
                JSONObject jSONObject = new JSONObject(str);
                aVar.notificationChannelId = jSONObject.optString("notification_channel", "");
                aVar.soundUrl = jSONObject.optString("surl");
                aVar.soundId = null;
                aVar.badgeCount = jSONObject.optInt("badge", -1);
                aVar.customAction = jSONObject.optString("in_app_push");
                aVar.inAppPushType = jSONObject.optString("in_app_push_type");
                aVar.redBadgeOnly = jSONObject.optInt("red_badge_only", -1);
                if (!TextUtils.isEmpty(aVar.soundUrl)) {
                    aVar.soundId = d.b(aVar.soundUrl);
                }
                aVar.volumeFactor = (float) jSONObject.optDouble("vfac", 1.0d);
                aVar.stickTopOffset = jSONObject.optLong("stof");
                if (jSONObject.optInt("sdef") == 1) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.useAssetSound = z;
                aVar.redBadgeOnly = jSONObject.optInt("red_badge_only");
                aVar.largeModeIconUrl = jSONObject.optString("large_mode_icon");
                aVar.visibility = jSONObject.optInt("visibility", 0);
                aVar.turn_screen_on = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "turn_screen_on", false);
                aVar.user_system_style = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "use_system_style", true);
                aVar.is_notification_top = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "is_notification_top", false);
                aVar.stick_top = jSONObject.optInt("stick_top", 0);
                aVar.floatWindow = jSONObject.optInt("show_float_window", -1);
                aVar.oppoFloatWindow = jSONObject.optInt("show_float_window", -2);
                aVar.float_window_show_time = jSONObject.optLong("float_window_show_time", 12000);
                aVar.oppo_push_style = jSONObject.optInt("oppo_push_style", 11);
                aVar.isZeroVibrate = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "is_zero_vibrate", true);
                aVar.bg_color = jSONObject.optString("bg_color", "");
                aVar.style = jSONObject.optInt("notification_style", -1);
                aVar.isGroupSummary = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "is_group_summary", true);
                aVar.extra_text = jSONObject.optString("extra_text");
                aVar.authorId = jSONObject.optString("author_id");
                aVar.roomId = jSONObject.optString("room_id");
                aVar.userId = jSONObject.optString("user_id");
                aVar.musicId = jSONObject.optString("music_id");
                aVar.tagId = jSONObject.optString("tag_id");
                aVar.trackInfo = jSONObject.optString("track_info");
                aVar.challengeId = jSONObject.optString("challenge_id");
                JSONArray optJSONArray = jSONObject.optJSONArray("pre_o_urls");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length = optJSONArray.length();
                    aVar.pre_o_urls.clear();
                    for (int i2 = 0; i2 < length; i2++) {
                        String optString = optJSONArray.optString(i2);
                        if (!TextUtils.isEmpty(optString)) {
                            aVar.pre_o_urls.add(0, optString);
                        }
                    }
                }
                aVar.push_user_id = jSONObject.optString("push_user_id");
                aVar.allowBannerDelete = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "allow_banner_delete", true);
                aVar.notificaitonPriority = jSONObject.optInt("push_priority", 1);
                aVar.activeClickValid = jSONObject.optInt("active_click_valid", 0);
                JSONArray optJSONArray2 = jSONObject.optJSONArray("action_list");
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    JSONObject optJSONObject = optJSONArray2.optJSONObject(i3);
                    aVar.actionList.add(new String[]{optJSONObject.optString("action_id"), optJSONObject.optString("action_title"), optJSONObject.optString("action_url")});
                }
                return aVar;
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject getOriginData() {
        return this.originData;
    }

    public static int getShortMsgID(long j2) {
        return (int) (j2 % 2147483647L);
    }

    public static b from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        b bVar = new b();
        bVar.rawJson = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.originData = jSONObject;
            bVar.id = jSONObject.optLong("id", 0);
            bVar.rid64 = jSONObject.optLong("rid64", 0);
            bVar.title = jSONObject.optString("title");
            bVar.text = jSONObject.optString("text");
            bVar.pass_through = jSONObject.optInt("pass_through", 1);
            bVar.openUrl = jSONObject.optString("open_url");
            bVar.imageUrl = jSONObject.optString("image_url");
            bVar.callback = jSONObject.optString("callback");
            bVar.isPing = jSONObject.optInt("is_ping", 0);
            bVar.imageType = jSONObject.optInt("image_type");
            bVar.filter = jSONObject.optInt("filter", 1);
            bVar.alertType = jSONObject.optInt("alert_type", 0);
            bVar.soundType = jSONObject.optInt("sound_type", 0);
            String optString = jSONObject.optString("extra_str");
            bVar.postBack = jSONObject.optString("post_back");
            bVar.led = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "use_led", false);
            bVar.sound = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "sound", false);
            bVar.vibrator = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "use_vibrator", false);
            bVar.preloadArticle = com.ss.android.ugc.awemepushlib.f.a.a(jSONObject, "preload_article", false);
            bVar.appData = jSONObject.optJSONObject("app_data");
            bVar.extra = a.a(optString);
            bVar.targetSecUid = jSONObject.optString("ttpush_sec_target_uid");
            if (bVar.extra.style >= 0 && bVar.extra.style <= 8) {
                bVar.imageType = bVar.extra.style;
            }
            if (!TextUtils.isEmpty(bVar.openUrl)) {
                try {
                    bVar.functionalPush = "1".equals(Uri.parse(bVar.openUrl).getQueryParameter("functional_push"));
                } catch (Throwable unused) {
                }
            }
            return bVar;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
