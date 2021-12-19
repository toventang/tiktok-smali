package com.ss.android.ad.splash.core.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ad.splash.f.f;
import com.ss.android.ad.splash.f.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f58522a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f58523b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f58524c;

    /* renamed from: d  reason: collision with root package name */
    public String f58525d;

    /* renamed from: e  reason: collision with root package name */
    public long f58526e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f58527f;

    /* renamed from: g  reason: collision with root package name */
    public int f58528g;

    /* renamed from: h  reason: collision with root package name */
    public int f58529h;

    /* renamed from: i  reason: collision with root package name */
    public String f58530i;

    /* renamed from: j  reason: collision with root package name */
    public long f58531j;

    static {
        Covode.recordClassIndex(36301);
    }

    public final boolean a() {
        if (l.a(this.f58525d) || this.f58528g <= 0 || f.a(this.f58524c) || l.a(this.f58524c.get(0))) {
            return false;
        }
        return true;
    }

    public final void a(JSONObject jSONObject) {
        int i2;
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f58522a = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                try {
                    this.f58522a.add(optJSONArray.getString(i3));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f58523b = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                try {
                    this.f58523b.add(optJSONArray2.getString(i4));
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
            this.f58524c = new ArrayList();
            for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                try {
                    this.f58524c.add(optJSONArray3.getString(i5));
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
        this.f58525d = jSONObject.optString("video_id");
        this.f58526e = jSONObject.optLong("video_group_id");
        this.f58527f = jSONObject.optBoolean("voice_switch");
        this.f58531j = jSONObject.optLong("video_duration_ms");
        String optString = jSONObject.optString("video_density");
        this.f58530i = jSONObject.optString("secret_key");
        int indexOf = optString.indexOf("x");
        if (indexOf >= 0 && (i2 = indexOf + 1) < optString.length()) {
            this.f58529h = Integer.parseInt(optString.substring(0, indexOf));
            this.f58528g = Integer.parseInt(optString.substring(i2));
        }
    }
}
