package com.bytedance.android.livesdk.live.model;

import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class LiveFeedDraw {
    public static final a Companion = new a((byte) 0);
    @c(a = "settings")
    private final Map<String, b> settings = new HashMap();
    @c(a = "url")
    private final String url = "";

    static {
        Covode.recordClassIndex(10466);
    }

    public static final String conventRequestFrom(String str, String str2) {
        return a.e(str, str2);
    }

    public static final String getChannelId(String str, String str2) {
        return a.b(str, str2);
    }

    public static final String getReqFrom(String str, String str2) {
        return a.a(str, str2);
    }

    private static final b getSettings(String str) {
        return a.a(str);
    }

    private static final b getSettings(String str, String str2) {
        return a.d(str, str2);
    }

    public static final boolean isFollow(String str, String str2) {
        return a.c(str, str2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(10467);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(String str) {
            Map<String, b> settings = FeedDrawMtSetting.INSTANCE.getValue().getSettings();
            if (str == null) {
                str = "";
            }
            b bVar = settings.get(str);
            if (bVar == null) {
                bVar = new b();
            }
            return bVar;
        }

        public static String a(String str, String str2) {
            return d(str, str2).f18684c;
        }

        public static boolean c(String str, String str2) {
            return d(str, str2).f18683b;
        }

        public static String b(String str, String str2) {
            return String.valueOf(d(str, str2).f18685d);
        }

        public static b d(String str, String str2) {
            return a(str + '_' + str2);
        }

        public static String e(String str, String str2) {
            if (l.a((Object) "homepage_hot", (Object) str) && l.a((Object) "video_head", (Object) str2)) {
                return "homepage_hot_head_draw";
            }
            if (!l.a((Object) "live_merge", (Object) str) || !l.a((Object) "live_cover", (Object) str2)) {
                return "";
            }
            return "feed_draw";
        }
    }

    public final Map<String, b> getSettings() {
        return this.settings;
    }

    public final String getUrl() {
        return this.url;
    }

    public static final LiveFeedDraw defaultInstance() {
        return new LiveFeedDraw();
    }

    public static final boolean isEnable(String str, String str2) {
        return l.a((Object) a.d(str, str2).f18682a, (Object) "1");
    }
}
