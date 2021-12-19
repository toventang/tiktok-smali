package com.bytedance.android.livesdkapi.depend.model.live;

import android.text.TextUtils;
import com.bytedance.android.livesdk.model.ag;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements ag {
    @com.google.gson.a.c(a = "title")
    public String A;
    @com.google.gson.a.c(a = "label")
    public String B;
    @com.google.gson.a.c(a = "display_type")
    public int C;
    @com.google.gson.a.c(a = "play_track_url_list")
    public List<String> D;
    @com.google.gson.a.c(a = "playover_track_url_list")
    public List<String> E;
    @com.google.gson.a.c(a = "effective_play_track_url_list")
    public List<String> F;
    @com.google.gson.a.c(a = "effective_play_time")
    public int G;
    @com.google.gson.a.c(a = "use_compound_land_page")
    public boolean H;
    public String I;
    public String J;
    public long K;
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f23110a;
    @com.google.gson.a.c(a = StringSet.type)

    /* renamed from: b  reason: collision with root package name */
    public String f23111b;
    @com.google.gson.a.c(a = "log_extra")

    /* renamed from: c  reason: collision with root package name */
    public String f23112c;
    @com.google.gson.a.c(a = "image_list")

    /* renamed from: d  reason: collision with root package name */
    public List<b> f23113d;
    @com.google.gson.a.c(a = "author")

    /* renamed from: e  reason: collision with root package name */
    public a f23114e;
    @com.google.gson.a.c(a = "open_url")

    /* renamed from: f  reason: collision with root package name */
    public String f23115f;
    @com.google.gson.a.c(a = "web_url")

    /* renamed from: g  reason: collision with root package name */
    public String f23116g;
    @com.google.gson.a.c(a = "web_title")

    /* renamed from: h  reason: collision with root package name */
    public String f23117h;
    @com.google.gson.a.c(a = "appleid")

    /* renamed from: i  reason: collision with root package name */
    public String f23118i;
    @com.google.gson.a.c(a = "package")

    /* renamed from: j  reason: collision with root package name */
    public String f23119j;
    @com.google.gson.a.c(a = "app_name")

    /* renamed from: k  reason: collision with root package name */
    public String f23120k;
    @com.google.gson.a.c(a = "download_url")

    /* renamed from: l  reason: collision with root package name */
    public String f23121l;
    @com.google.gson.a.c(a = "hide_if_exists")

    /* renamed from: m  reason: collision with root package name */
    public int f23122m;
    @com.google.gson.a.c(a = "auto_open")
    public int n;
    @com.google.gson.a.c(a = "button_text")
    public String o;
    @com.google.gson.a.c(a = "track_url_list")
    public List<String> p;
    @com.google.gson.a.c(a = "click_track_url_list")
    public List<String> q;
    @com.google.gson.a.c(a = "allow_comment")
    public boolean r;
    @com.google.gson.a.c(a = "allow_dislike")
    public boolean s;
    @com.google.gson.a.c(a = "allow_share")
    public boolean t;
    @com.google.gson.a.c(a = "digg_count")
    public long u;
    @com.google.gson.a.c(a = "video_info")
    public c v;
    @com.google.gson.a.c(a = "filter_words")
    public List<Object> w;
    @com.google.gson.a.c(a = "show_button_seconds")
    public int x;
    @com.google.gson.a.c(a = "learn_more_bg_color")
    public String y;
    @com.google.gson.a.c(a = "show_mask_times")
    public int z;

    public static class a {
        @com.google.gson.a.c(a = "nickname")

        /* renamed from: a  reason: collision with root package name */
        public String f23123a;
        @com.google.gson.a.c(a = "avatar")

        /* renamed from: b  reason: collision with root package name */
        public b f23124b;

        static {
            Covode.recordClassIndex(13713);
        }
    }

    public static class b {
        @com.google.gson.a.c(a = "width")

        /* renamed from: a  reason: collision with root package name */
        public int f23125a;
        @com.google.gson.a.c(a = "height")

        /* renamed from: b  reason: collision with root package name */
        public int f23126b;
        @com.google.gson.a.c(a = "url_list")

        /* renamed from: c  reason: collision with root package name */
        public List<String> f23127c;
        @com.google.gson.a.c(a = "uri")

        /* renamed from: d  reason: collision with root package name */
        public String f23128d;

        static {
            Covode.recordClassIndex(13714);
        }
    }

    public static class c {
        @com.google.gson.a.c(a = "video_duration")

        /* renamed from: a  reason: collision with root package name */
        public int f23129a;
        @com.google.gson.a.c(a = "video_transpose")

        /* renamed from: b  reason: collision with root package name */
        public int f23130b;
        @com.google.gson.a.c(a = "thumb_width")

        /* renamed from: c  reason: collision with root package name */
        public int f23131c;
        @com.google.gson.a.c(a = "thumb_height")

        /* renamed from: d  reason: collision with root package name */
        public int f23132d;
        @com.google.gson.a.c(a = "url_list")

        /* renamed from: e  reason: collision with root package name */
        public List<String> f23133e;
        @com.google.gson.a.c(a = "video_id")

        /* renamed from: f  reason: collision with root package name */
        public String f23134f;

        static {
            Covode.recordClassIndex(13715);
        }
    }

    static {
        Covode.recordClassIndex(13712);
    }

    @Override // com.bytedance.android.livesdk.model.ag
    public long getId() {
        return this.f23110a;
    }

    @Override // com.bytedance.android.livesdk.model.ag
    public String getMixId() {
        return String.valueOf(this.f23110a);
    }

    public final String a() {
        return String.valueOf(this.f23110a) + "_" + String.valueOf(this.K) + "_1";
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", this.f23112c);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("refer", str);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
