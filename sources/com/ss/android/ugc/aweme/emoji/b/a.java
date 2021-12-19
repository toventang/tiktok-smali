package com.ss.android.ugc.aweme.emoji.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f89103a;

    /* renamed from: b  reason: collision with root package name */
    public String f89104b;

    /* renamed from: c  reason: collision with root package name */
    public String f89105c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.emoji.g.a f89106d;

    static {
        Covode.recordClassIndex(56034);
    }

    public final boolean a() {
        if (this.f89106d != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if ((aVar.f89103a > 0 || !TextUtils.isEmpty(aVar.f89104b)) && aVar.f89103a == this.f89103a && TextUtils.equals(aVar.f89104b, this.f89104b) && TextUtils.equals(aVar.f89105c, this.f89105c)) {
            return true;
        }
        com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
        if (aVar2 == null || !aVar2.equals(this.f89106d)) {
            return false;
        }
        return true;
    }
}
