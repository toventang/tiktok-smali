package com.ss.android.ugc.aweme.dg;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class b {
    @c(a = "page_charge_schema")

    /* renamed from: a  reason: collision with root package name */
    public String f80073a;
    @c(a = "page_index_schema")

    /* renamed from: b  reason: collision with root package name */
    public String f80074b;

    static {
        Covode.recordClassIndex(49846);
    }

    public final String a() {
        if (TextUtils.isEmpty(this.f80073a)) {
            return "";
        }
        return this.f80073a;
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f80074b)) {
            return "";
        }
        return this.f80074b;
    }
}
