package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.ArrayList;

public final class f {
    @c(a = "config")

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e> f20646a = null;

    static {
        Covode.recordClassIndex(12199);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f20646a, ((f) obj).f20646a);
        }
        return true;
    }

    public final int hashCode() {
        ArrayList<e> arrayList = this.f20646a;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ScoreDisplayConfigResponse(configList=" + this.f20646a + ")";
    }

    private f() {
    }
}
