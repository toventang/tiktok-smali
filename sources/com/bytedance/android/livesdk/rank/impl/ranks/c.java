package com.bytedance.android.livesdk.rank.impl.ranks;

import android.text.TextUtils;
import androidx.core.g.d;
import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f20906a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f20907b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20908c;

    /* renamed from: d  reason: collision with root package name */
    public final long f20909d;

    static {
        Covode.recordClassIndex(12379);
    }

    public final int hashCode() {
        return d.a(Integer.valueOf(this.f20906a), this.f20907b, Integer.valueOf(this.f20908c), Long.valueOf(this.f20909d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f20906a == cVar.f20906a && this.f20908c == cVar.f20908c && this.f20909d == cVar.f20909d && TextUtils.equals(this.f20907b, cVar.f20907b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public c(int i2, CharSequence charSequence, int i3, long j2) {
        this.f20906a = i2;
        this.f20907b = charSequence;
        this.f20908c = i3;
        this.f20909d = j2;
    }
}
