package com.bytedance.crash.j;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f27715a;

    /* renamed from: b  reason: collision with root package name */
    public String f27716b;

    /* renamed from: c  reason: collision with root package name */
    public JSONObject f27717c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f27718d;

    static {
        Covode.recordClassIndex(16248);
    }

    public final boolean a() {
        if (this.f27715a != 207) {
            return true;
        }
        return false;
    }

    public n(int i2) {
        this.f27715a = i2;
    }

    public n(String str) {
        this.f27715a = 206;
        this.f27716b = str;
    }

    public n(JSONObject jSONObject) {
        this.f27715a = 0;
        this.f27717c = jSONObject;
    }

    public n(byte[] bArr) {
        this.f27715a = 204;
        this.f27718d = bArr;
    }

    public n(int i2, Throwable th) {
        this.f27715a = i2;
        this.f27716b = th.getMessage();
    }
}
