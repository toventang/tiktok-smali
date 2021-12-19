package com.ss.ttvideoengine.j;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class s {
    private int A;
    private int B;
    private double C;
    private String D;

    /* renamed from: a  reason: collision with root package name */
    public int f152994a;

    /* renamed from: b  reason: collision with root package name */
    public String f152995b;

    /* renamed from: c  reason: collision with root package name */
    public String f152996c;

    /* renamed from: d  reason: collision with root package name */
    public int f152997d;

    /* renamed from: e  reason: collision with root package name */
    public int f152998e;

    /* renamed from: f  reason: collision with root package name */
    public int f152999f;

    /* renamed from: g  reason: collision with root package name */
    public int f153000g;

    /* renamed from: h  reason: collision with root package name */
    public double f153001h;

    /* renamed from: i  reason: collision with root package name */
    public double f153002i;

    /* renamed from: j  reason: collision with root package name */
    public String f153003j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<String> f153004k;

    /* renamed from: l  reason: collision with root package name */
    public int f153005l = 1;

    /* renamed from: m  reason: collision with root package name */
    private int f153006m;
    private String n;
    private String o;
    private int p;
    private int q;
    private int r;
    private int s;
    private double t;
    private double u;
    private String v;
    private int w;
    private ArrayList<String> x;
    private int y;
    private int z;

    static {
        Covode.recordClassIndex(101682);
    }

    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("img_num")) {
                if (this.f153005l != 3) {
                    this.f153005l = 1;
                }
            } else if (jSONObject.has("ImgUrl")) {
                this.f153005l = 2;
            }
            int i2 = this.f153005l;
            int i3 = 0;
            if (i2 == 1 || i2 == 3) {
                try {
                    this.f152994a = jSONObject.getInt("img_num");
                    String optString = jSONObject.optString("uri");
                    this.f152995b = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.f152995b = jSONObject.optString("img_uri");
                    }
                    this.f152996c = jSONObject.optString("img_url");
                    this.f152997d = jSONObject.optInt("img_x_size");
                    this.f152998e = jSONObject.optInt("img_y_size");
                    this.f152999f = jSONObject.optInt("img_x_len");
                    this.f153000g = jSONObject.optInt("img_y_len");
                    this.f153001h = jSONObject.optDouble("duration");
                    this.f153002i = jSONObject.optDouble("interval");
                    this.f153003j = jSONObject.optString("fext");
                    JSONArray optJSONArray = jSONObject.optJSONArray("img_urls");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        this.f153004k = new ArrayList<>();
                        while (i3 < optJSONArray.length()) {
                            this.f153004k.add(optJSONArray.optString(i3));
                            i3++;
                        }
                    }
                } catch (JSONException unused) {
                }
            } else if (i2 == 2) {
                try {
                    this.f153006m = jSONObject.getInt("ImgNum");
                    this.n = jSONObject.optString("Uri");
                    this.o = jSONObject.optString("ImgUrl");
                    this.p = jSONObject.optInt("ImgXSize");
                    this.q = jSONObject.optInt("ImgYSize");
                    this.r = jSONObject.optInt("ImgXLen");
                    this.s = jSONObject.optInt("ImgYLen");
                    this.t = jSONObject.optDouble("Duration");
                    this.u = jSONObject.optDouble("Interval");
                    this.v = jSONObject.optString("Fext");
                } catch (JSONException unused2) {
                }
            } else if (i2 == 4) {
                this.w = jSONObject.optInt("CaptureNum");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("StoreUrls");
                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                    this.x = new ArrayList<>();
                    while (i3 < optJSONArray2.length()) {
                        this.x.add(optJSONArray2.optString(i3));
                        i3++;
                    }
                }
                this.y = jSONObject.optInt("CellWidth");
                this.z = jSONObject.optInt("CellHeight");
                this.A = jSONObject.optInt("ImgXLen");
                this.B = jSONObject.optInt("ImgYLen");
                this.C = jSONObject.optDouble("Interval");
                this.D = jSONObject.optString("Format");
            }
        }
    }
}
