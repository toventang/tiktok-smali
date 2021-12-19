package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class t {
    @c(a = "to_contacts")

    /* renamed from: a  reason: collision with root package name */
    public int f76695a;
    @c(a = "to_fb_friends")

    /* renamed from: b  reason: collision with root package name */
    public int f76696b;
    @c(a = "to_mutual_connections")

    /* renamed from: c  reason: collision with root package name */
    public int f76697c;
    @c(a = "to_who_share_link")

    /* renamed from: d  reason: collision with root package name */
    public int f76698d;
    @c(a = "to_interested_users")

    /* renamed from: e  reason: collision with root package name */
    public int f76699e;

    static {
        Covode.recordClassIndex(47366);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f76695a == tVar.f76695a && this.f76696b == tVar.f76696b && this.f76697c == tVar.f76697c && this.f76698d == tVar.f76698d && this.f76699e == tVar.f76699e;
    }

    public final int hashCode() {
        return (((((((this.f76695a * 31) + this.f76696b) * 31) + this.f76697c) * 31) + this.f76698d) * 31) + this.f76699e;
    }

    public final String toString() {
        return "SuggestSettings(sugToContacts=" + this.f76695a + ", sugToFbFriends=" + this.f76696b + ", sugToMutualConnections=" + this.f76697c + ", sugToWhoShareLink=" + this.f76698d + ", sugToInterestedUsers=" + this.f76699e + ")";
    }

    public t(int i2, int i3, int i4, int i5, int i6) {
        this.f76695a = i2;
        this.f76696b = i3;
        this.f76697c = i4;
        this.f76698d = i5;
        this.f76699e = i6;
    }
}
