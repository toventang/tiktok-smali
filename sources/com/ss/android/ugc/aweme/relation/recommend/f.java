package com.ss.android.ugc.aweme.relation.recommend;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final m f120416a;

    /* renamed from: b  reason: collision with root package name */
    public final String f120417b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120418c;

    static {
        Covode.recordClassIndex(78362);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f120416a, fVar.f120416a) && l.a(this.f120417b, fVar.f120417b) && l.a(this.f120418c, fVar.f120418c);
    }

    public final int hashCode() {
        m mVar = this.f120416a;
        int i2 = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        String str = this.f120417b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f120418c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NewVersionRecFriendsDetail(config=" + this.f120416a + ", platforms=" + this.f120417b + ", skipPlatforms=" + this.f120418c + ")";
    }

    public f(m mVar, String str, String str2) {
        l.d(mVar, "");
        l.d(str, "");
        l.d(str2, "");
        this.f120416a = mVar;
        this.f120417b = str;
        this.f120418c = str2;
    }
}
