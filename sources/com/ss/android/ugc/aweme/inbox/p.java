package com.ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class p {
    @c(a = "hide_days")

    /* renamed from: a  reason: collision with root package name */
    public final int f104338a;
    @c(a = "max_delete_times")

    /* renamed from: b  reason: collision with root package name */
    public final int f104339b;
    @c(a = "max_no_action_times")

    /* renamed from: c  reason: collision with root package name */
    public final int f104340c;

    static {
        Covode.recordClassIndex(66820);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f104338a == pVar.f104338a && this.f104339b == pVar.f104339b && this.f104340c == pVar.f104340c;
    }

    public final int hashCode() {
        return (((this.f104338a * 31) + this.f104339b) * 31) + this.f104340c;
    }

    public final String toString() {
        return "InboxInvitationCellMeta(hideDays=" + this.f104338a + ", maxDeleteTimes=" + this.f104339b + ", maxNoActionTimes=" + this.f104340c + ")";
    }

    private p() {
        this.f104338a = 14;
        this.f104339b = 3;
        this.f104340c = 3;
    }

    public /* synthetic */ p(byte b2) {
        this();
    }
}
