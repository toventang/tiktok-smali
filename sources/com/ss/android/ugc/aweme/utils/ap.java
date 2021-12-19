package com.ss.android.ugc.aweme.utils;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public Bundle f142646a = new Bundle();

    static {
        Covode.recordClassIndex(93311);
    }

    public final ap a(String str, int i2) {
        this.f142646a.putInt(str, i2);
        return this;
    }

    public final ap a(String str, Parcelable parcelable) {
        this.f142646a.putParcelable(str, parcelable);
        return this;
    }

    public final ap a(String str, Serializable serializable) {
        this.f142646a.putSerializable(str, serializable);
        return this;
    }

    public final ap a(String str, String str2) {
        this.f142646a.putString(str, str2);
        return this;
    }

    public final ap a(String str, boolean z) {
        this.f142646a.putBoolean(str, z);
        return this;
    }

    public final ap a(String str, String[] strArr) {
        this.f142646a.putStringArray(str, strArr);
        return this;
    }
}
