package com.bytedance.android.livesdk.gift.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class g {
    @c(a = "group_count")

    /* renamed from: a  reason: collision with root package name */
    public int f17882a;
    @c(a = "group_text")

    /* renamed from: b  reason: collision with root package name */
    public String f17883b;

    static {
        Covode.recordClassIndex(9963);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (gVar.f17882a != this.f17882a || !TextUtils.equals(gVar.f17883b, this.f17883b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
