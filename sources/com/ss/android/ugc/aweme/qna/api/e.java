package com.ss.android.ugc.aweme.qna.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class e {
    @c(a = "cursor")

    /* renamed from: a  reason: collision with root package name */
    public final int f119234a;
    @c(a = "count")

    /* renamed from: b  reason: collision with root package name */
    public final int f119235b;
    @c(a = "collection_category")

    /* renamed from: c  reason: collision with root package name */
    public final int f119236c;
    @c(a = "forum_recommend_scene")

    /* renamed from: d  reason: collision with root package name */
    public final int f119237d;

    static {
        Covode.recordClassIndex(77458);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f119234a == eVar.f119234a && this.f119235b == eVar.f119235b && this.f119236c == eVar.f119236c && this.f119237d == eVar.f119237d;
    }

    public final int hashCode() {
        return (((((this.f119234a * 31) + this.f119235b) * 31) + this.f119236c) * 31) + this.f119237d;
    }

    public final String toString() {
        return "QuestionCollectionRequest(cursor=" + this.f119234a + ", count=" + this.f119235b + ", collectionCategory=" + this.f119236c + ", forumRecommendScene=" + this.f119237d + ")";
    }

    public e(int i2, int i3, int i4, int i5) {
        this.f119234a = i2;
        this.f119235b = i3;
        this.f119236c = i4;
        this.f119237d = i5;
    }
}
