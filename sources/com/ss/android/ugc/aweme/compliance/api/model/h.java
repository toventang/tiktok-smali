package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class h {
    @c(a = "favorite_list")

    /* renamed from: a  reason: collision with root package name */
    public int f76667a;

    static {
        Covode.recordClassIndex(47352);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && this.f76667a == ((h) obj).f76667a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f76667a;
    }

    public final String toString() {
        return "LikedList(favoriteList=" + this.f76667a + ")";
    }

    public h(int i2) {
        this.f76667a = i2;
    }
}
