package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.e.d;
import h.f.b.l;
import org.json.JSONObject;

public final class an {

    /* renamed from: l  reason: collision with root package name */
    public static final a f32547l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f32548a;

    /* renamed from: b  reason: collision with root package name */
    public String f32549b;

    /* renamed from: c  reason: collision with root package name */
    public d f32550c;

    /* renamed from: d  reason: collision with root package name */
    public String f32551d;

    /* renamed from: e  reason: collision with root package name */
    public String f32552e;

    /* renamed from: f  reason: collision with root package name */
    public String f32553f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f32554g;

    /* renamed from: h  reason: collision with root package name */
    public JSONObject f32555h;

    /* renamed from: i  reason: collision with root package name */
    public Boolean f32556i;

    /* renamed from: j  reason: collision with root package name */
    public JSONObject f32557j;

    /* renamed from: k  reason: collision with root package name */
    public JSONObject f32558k;

    static {
        Covode.recordClassIndex(19321);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19322);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private an(String str, JSONObject jSONObject, Boolean bool) {
        l.c(str, "");
        this.f32551d = str;
        this.f32552e = null;
        this.f32553f = null;
        this.f32554g = jSONObject;
        this.f32555h = null;
        this.f32556i = bool;
        this.f32557j = null;
        this.f32558k = null;
        this.f32549b = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(String str, JSONObject jSONObject, Boolean bool, int i2) {
        this(str, (i2 & 8) != 0 ? null : jSONObject, (i2 & 32) != 0 ? false : bool);
    }
}
