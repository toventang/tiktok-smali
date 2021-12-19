package com.ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class f implements e {

    /* renamed from: b  reason: collision with root package name */
    private final String f110907b;

    static {
        Covode.recordClassIndex(71153);
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String a() {
        return a(this.f110907b, "anchor_id");
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String b() {
        return a(this.f110907b, "anchor_type");
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String c() {
        return a(this.f110907b, "anchor_name");
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String d() {
        return a(this.f110907b, "anchor_id");
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String e() {
        return a(this.f110907b, "anchor_type");
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String f() {
        return a(this.f110907b, "anchor_name");
    }

    public f(String str) {
        this.f110907b = str;
    }

    @Override // com.ss.android.ugc.aweme.multi.e
    public final String a(String str) {
        l.d(str, "");
        return a(this.f110907b, str);
    }

    private static String a(String str, String str2) {
        boolean z;
        l.d(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String optString = new JSONObject(str).optString(str2, "");
            l.b(optString, "");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }
}
