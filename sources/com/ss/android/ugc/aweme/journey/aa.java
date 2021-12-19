package com.ss.android.ugc.aweme.journey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class aa {
    @c(a = "page_id")

    /* renamed from: a  reason: collision with root package name */
    public final int f104810a;
    @c(a = "interest_step")

    /* renamed from: b  reason: collision with root package name */
    public final v f104811b = null;
    @c(a = "content_language_step")

    /* renamed from: c  reason: collision with root package name */
    public final k f104812c = null;
    @c(a = "new_user_add_fb_friends_step")

    /* renamed from: d  reason: collision with root package name */
    public final u f104813d = null;

    static {
        Covode.recordClassIndex(67225);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return this.f104810a == aaVar.f104810a && l.a(this.f104811b, aaVar.f104811b) && l.a(this.f104812c, aaVar.f104812c) && l.a(this.f104813d, aaVar.f104813d);
    }

    public final int hashCode() {
        int i2 = this.f104810a * 31;
        v vVar = this.f104811b;
        int i3 = 0;
        int hashCode = (i2 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        k kVar = this.f104812c;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        u uVar = this.f104813d;
        if (uVar != null) {
            i3 = uVar.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "NewUserJourneyStep(id=" + this.f104810a + ", new_user_interest_page=" + this.f104811b + ", new_user_content_language_page=" + this.f104812c + ", new_user_add_fb_friends_step=" + this.f104813d + ")";
    }

    public aa(int i2) {
        this.f104810a = i2;
    }
}
