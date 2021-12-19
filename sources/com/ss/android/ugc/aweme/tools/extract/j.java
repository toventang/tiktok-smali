package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ar;
import h.f.b.l;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public String f140090a = "";

    /* renamed from: b  reason: collision with root package name */
    public int f140091b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f140092c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f140093d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f140094e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f140095f;

    /* renamed from: g  reason: collision with root package name */
    public int f140096g;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f140097h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f140098i;

    /* renamed from: j  reason: collision with root package name */
    public String f140099j = "";

    static {
        Covode.recordClassIndex(91541);
    }

    public final JSONObject a() {
        int i2;
        ar a2 = new ar().a("stage", (Integer) 2).a("aweme_id", this.f140090a).a("match_factors", Integer.valueOf(this.f140091b)).a("origin", this.f140092c).a("is_draft", this.f140093d).a("is_backup", this.f140094e);
        Integer num = this.f140095f;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        JSONObject a3 = a2.a("err_code", Integer.valueOf(i2)).a("status", Integer.valueOf(this.f140096g)).a("is_retry", this.f140097h).a("upload_err_code", Long.valueOf(this.f140098i)).a("description", this.f140099j).a();
        l.b(a3, "");
        return a3;
    }

    public final void a(String str) {
        l.d(str, "");
        this.f140099j = str;
    }
}
