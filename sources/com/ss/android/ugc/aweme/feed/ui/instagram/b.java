package com.ss.android.ugc.aweme.feed.ui.instagram;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f94795a;

    /* renamed from: b  reason: collision with root package name */
    public final String f94796b;

    /* renamed from: c  reason: collision with root package name */
    public final String f94797c;

    /* renamed from: d  reason: collision with root package name */
    public final String f94798d;

    static {
        Covode.recordClassIndex(60137);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f94798d, ((b) obj).f94798d);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f94798d;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StoreKey(platformName=" + this.f94798d + ")";
    }

    public b(String str) {
        l.d(str, "");
        this.f94798d = str;
        this.f94795a = str + "_dialog_bind_phone_or_email";
        this.f94796b = str + "_dialog_last_time_appear";
        this.f94797c = str + "_dialog_has_bind";
    }
}
