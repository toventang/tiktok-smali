package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class d {
    @c(a = "direct_message")

    /* renamed from: a  reason: collision with root package name */
    public int f76647a;
    @c(a = "group_chat_invite")

    /* renamed from: b  reason: collision with root package name */
    public int f76648b;

    static {
        Covode.recordClassIndex(47348);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f76647a == dVar.f76647a && this.f76648b == dVar.f76648b;
    }

    public final int hashCode() {
        return (this.f76647a * 31) + this.f76648b;
    }

    public final String toString() {
        return "ImSettings(directMessage=" + this.f76647a + ", groupChatInvite=" + this.f76648b + ")";
    }

    public d(int i2, int i3) {
        this.f76647a = i2;
        this.f76648b = i3;
    }
}
