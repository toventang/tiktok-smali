package com.ss.android.ugc.aweme.qna.vm;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f119669a;

    /* renamed from: b  reason: collision with root package name */
    public final String f119670b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f119671c;

    static {
        Covode.recordClassIndex(77738);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f119669a, dVar.f119669a) && l.a(this.f119670b, dVar.f119670b) && l.a(this.f119671c, dVar.f119671c);
    }

    public final int hashCode() {
        String str = this.f119669a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f119670b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l2 = this.f119671c;
        if (l2 != null) {
            i2 = l2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "NavigateUserProfileData(userId=" + this.f119669a + ", secId=" + this.f119670b + ", questionId=" + this.f119671c + ")";
    }

    public d(String str, String str2, Long l2) {
        this.f119669a = str;
        this.f119670b = str2;
        this.f119671c = l2;
    }
}
