package com.ss.android.ugc.aweme.base.ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public Class<? extends e> f68369a;

    /* renamed from: b  reason: collision with root package name */
    public String f68370b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f68371c;

    /* renamed from: d  reason: collision with root package name */
    public float f68372d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f68373e;

    static {
        Covode.recordClassIndex(42097);
    }

    public final int hashCode() {
        return (this.f68370b.hashCode() * 31) + this.f68373e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!this.f68370b.equals(jVar.f68370b) || this.f68373e != jVar.f68373e) {
            return false;
        }
        return true;
    }

    public j(Class<? extends e> cls, String str, int i2, float f2, Bundle bundle) {
        this.f68369a = cls;
        this.f68370b = str;
        this.f68371c = bundle;
        this.f68373e = i2;
    }
}
