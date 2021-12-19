package com.bytedance.sdk.bdlynx.container;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.e.b.a.f;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f43694a;

    /* renamed from: b  reason: collision with root package name */
    public final String f43695b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43696c;

    /* renamed from: d  reason: collision with root package name */
    public f f43697d;

    static {
        Covode.recordClassIndex(26740);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f43695b, bVar.f43695b) && l.a(this.f43696c, bVar.f43696c) && l.a(this.f43697d, bVar.f43697d);
    }

    public final int hashCode() {
        String str = this.f43695b;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f43696c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        f fVar = this.f43697d;
        if (fVar != null) {
            i2 = fVar.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BDLynxUriEntity(groupId=" + this.f43695b + ", cardId=" + this.f43696c + ", extras=" + this.f43697d + ")";
    }

    public b(String str, String str2, f fVar) {
        l.c(str, "");
        l.c(str2, "");
        this.f43695b = str;
        this.f43696c = str2;
        this.f43697d = fVar;
    }
}
