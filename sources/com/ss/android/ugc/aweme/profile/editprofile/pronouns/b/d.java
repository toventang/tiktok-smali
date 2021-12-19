package com.ss.android.ugc.aweme.profile.editprofile.pronouns.b;

import com.bytedance.assem.arch.extensions.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f116187a;

    /* renamed from: b  reason: collision with root package name */
    public final String f116188b;

    static {
        Covode.recordClassIndex(74956);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f116187a, dVar.f116187a) && l.a(this.f116188b, dVar.f116188b);
    }

    public final int hashCode() {
        String str = this.f116187a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f116188b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ProfileEditPronounsInitData(contentName=" + this.f116187a + ", contentValue=" + this.f116188b + ")";
    }

    private /* synthetic */ d() {
        this("", "");
    }

    public d(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f116187a = str;
        this.f116188b = str2;
    }
}
