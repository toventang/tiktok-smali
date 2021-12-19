package com.bytedance.android.ecommerce.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public int f6900a;

    /* renamed from: b  reason: collision with root package name */
    public int f6901b;

    /* renamed from: c  reason: collision with root package name */
    public int f6902c;

    /* renamed from: d  reason: collision with root package name */
    public int f6903d;

    /* renamed from: e  reason: collision with root package name */
    public int f6904e;

    /* renamed from: f  reason: collision with root package name */
    public int f6905f;

    /* renamed from: g  reason: collision with root package name */
    public int f6906g;

    /* renamed from: h  reason: collision with root package name */
    public int f6907h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6908i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6909j = false;

    /* renamed from: k  reason: collision with root package name */
    private final String f6910k = b.class.getName();

    static {
        Covode.recordClassIndex(3340);
    }

    public b(JSONObject jSONObject) {
        int i2;
        int i3;
        if (jSONObject != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("left_bottom");
                JSONArray optJSONArray2 = jSONObject.optJSONArray("left_top");
                JSONArray optJSONArray3 = jSONObject.optJSONArray("right_bottom");
                JSONArray optJSONArray4 = jSONObject.optJSONArray("right_top");
                if (optJSONArray != null && optJSONArray2 != null && optJSONArray3 != null && optJSONArray4 != null) {
                    this.f6900a = optJSONArray.getInt(0);
                    this.f6901b = optJSONArray.getInt(1);
                    this.f6902c = optJSONArray2.getInt(0);
                    this.f6903d = optJSONArray2.getInt(1);
                    this.f6904e = optJSONArray3.getInt(0);
                    this.f6905f = optJSONArray3.getInt(1);
                    this.f6906g = optJSONArray4.getInt(0);
                    int i4 = optJSONArray4.getInt(1);
                    this.f6907h = i4;
                    int i5 = this.f6902c;
                    int i6 = this.f6904e;
                    if (i5 > i6 && (i2 = this.f6903d) > (i3 = this.f6905f)) {
                        int i7 = this.f6900a;
                        int i8 = this.f6901b;
                        int i9 = this.f6906g;
                        this.f6902c = i6;
                        this.f6903d = i3;
                        this.f6906g = i7;
                        this.f6907h = i8;
                        this.f6900a = i9;
                        this.f6901b = i4;
                        this.f6904e = i5;
                        this.f6905f = i2;
                        this.f6909j = true;
                    }
                    this.f6908i = true;
                }
            } catch (Throwable unused) {
            }
        }
    }
}
