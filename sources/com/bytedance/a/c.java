package com.bytedance.a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

final class c {

    /* renamed from: a  reason: collision with root package name */
    String f6424a;

    /* renamed from: b  reason: collision with root package name */
    String f6425b;

    /* renamed from: c  reason: collision with root package name */
    int f6426c;

    /* renamed from: d  reason: collision with root package name */
    int f6427d = -1;

    /* renamed from: e  reason: collision with root package name */
    long f6428e;

    /* renamed from: f  reason: collision with root package name */
    int f6429f = -1;

    /* renamed from: g  reason: collision with root package name */
    long f6430g;

    /* renamed from: h  reason: collision with root package name */
    int f6431h = -1;

    /* renamed from: i  reason: collision with root package name */
    int f6432i = -1;

    /* renamed from: j  reason: collision with root package name */
    JSONObject f6433j;

    static {
        Covode.recordClassIndex(3093);
    }

    c() {
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder append = new StringBuilder("Record{scene='").append(this.f6424a).append('\'').append(", subScene='").append(this.f6425b).append('\'').append(", isFirst=").append(this.f6426c);
        String str4 = "";
        if (this.f6427d >= 0) {
            str = ", type=" + this.f6427d;
        } else {
            str = str4;
        }
        StringBuilder append2 = append.append(str);
        if (this.f6429f >= 0) {
            str2 = ", status=" + this.f6429f;
        } else {
            str2 = str4;
        }
        StringBuilder append3 = append2.append(str2).append(", duration=").append(this.f6430g);
        if (this.f6431h >= 0) {
            str3 = ", reason=" + this.f6431h;
        } else {
            str3 = str4;
        }
        StringBuilder append4 = append3.append(str3);
        if (this.f6432i >= 0) {
            str4 = ", code=" + this.f6432i;
        }
        return append4.append(str4).append('}').toString();
    }
}
