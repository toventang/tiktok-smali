package com.ss.android.ugc.aweme.app.e.b;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f66700a;

    /* renamed from: b  reason: collision with root package name */
    public String f66701b;

    /* renamed from: c  reason: collision with root package name */
    public String f66702c;

    /* renamed from: d  reason: collision with root package name */
    public String f66703d;

    /* renamed from: e  reason: collision with root package name */
    public String f66704e;

    /* renamed from: f  reason: collision with root package name */
    public String f66705f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f66706g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f66707h;

    /* renamed from: i  reason: collision with root package name */
    public String f66708i;

    /* renamed from: j  reason: collision with root package name */
    public String f66709j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f66710k;

    /* renamed from: l  reason: collision with root package name */
    public String f66711l;

    /* renamed from: m  reason: collision with root package name */
    public String f66712m;
    public int n;
    public String o;
    public String p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public List<String> u = new LinkedList();
    private String v;

    static {
        Covode.recordClassIndex(41064);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: java.util.List<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        if (jSONObject != null) {
            this.f66700a = jSONObject.optString("id", null);
            this.f66701b = jSONObject.optString("source", null);
            this.f66702c = jSONObject.optString("card_type", null);
            this.f66703d = jSONObject.optString("pkg_name", null);
            this.f66704e = jSONObject.optString(StringSet.name, null);
            this.f66705f = jSONObject.optString("download_url", null);
            boolean z4 = true;
            if (jSONObject.optInt("is_ad", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f66707h = z;
            this.v = jSONObject.optString("log_extra", null);
            this.f66708i = jSONObject.optString("event_tag", "game_room_app_ad");
            this.f66709j = jSONObject.optString("event_refer", null);
            this.f66706g = jSONObject.optJSONObject("extra");
            if (jSONObject.optInt("support_multiple", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f66710k = z2;
            this.f66711l = jSONObject.optString("group_id", null);
            this.f66712m = jSONObject.optString("quick_app_url", "");
            this.n = jSONObject.optInt("download_mode", 0);
            this.o = jSONObject.optString("open_url", null);
            this.p = jSONObject.optString("source_avatar", null);
            this.q = jSONObject.optInt("auto_open", 0);
            if (jSONObject.optInt("is_landing_page_ad", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.r = z3;
            if (jSONObject.optInt("disable_download_dialog", 1) != 1) {
                z4 = false;
            }
            this.s = z4;
            this.t = jSONObject.optInt("download_scene", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("click_track_url_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    try {
                        obj = optJSONArray.get(i2);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        obj = null;
                    }
                    if (obj instanceof String) {
                        this.u.add(obj);
                    }
                }
            }
        }
    }
}
