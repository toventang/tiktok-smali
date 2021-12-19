package com.ss.android.ugc.aweme.profile.survey;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class b {
    @c(a = "action_type")

    /* renamed from: a  reason: collision with root package name */
    public int f116637a;
    @c(a = "dialog_id")

    /* renamed from: b  reason: collision with root package name */
    public int f116638b;
    @c(a = "original_id")

    /* renamed from: c  reason: collision with root package name */
    public int f116639c;

    static {
        Covode.recordClassIndex(75360);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f116637a == bVar.f116637a && this.f116638b == bVar.f116638b && this.f116639c == bVar.f116639c;
    }

    public final int hashCode() {
        return (((this.f116637a * 31) + this.f116638b) * 31) + this.f116639c;
    }

    public final String toString() {
        return "SurveyAnswer(actionType=" + this.f116637a + ", dialogId=" + this.f116638b + ", originalId=" + this.f116639c + ")";
    }

    public b(int i2, int i3, int i4) {
        this.f116637a = i2;
        this.f116638b = i3;
        this.f116639c = i4;
    }
}
