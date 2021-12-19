package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class s {
    @c(a = "upvote")

    /* renamed from: a  reason: collision with root package name */
    public int f76694a;

    static {
        Covode.recordClassIndex(47365);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof s) && this.f76694a == ((s) obj).f76694a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f76694a;
    }

    public final String toString() {
        return "RecommendationSettings(upvote=" + this.f76694a + ")";
    }
}
