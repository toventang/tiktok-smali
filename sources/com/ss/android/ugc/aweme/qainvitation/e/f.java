package com.ss.android.ugc.aweme.qainvitation.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class f {
    @c(a = "qa_invitation_limit")

    /* renamed from: a  reason: collision with root package name */
    public final Integer f119149a;

    static {
        Covode.recordClassIndex(77371);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof f) && l.a(this.f119149a, ((f) obj).f119149a);
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.f119149a;
        if (num != null) {
            return num.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "QAInvitationSettingsData(invitationLimit=" + this.f119149a + ")";
    }

    public f(Integer num) {
        this.f119149a = num;
    }
}
