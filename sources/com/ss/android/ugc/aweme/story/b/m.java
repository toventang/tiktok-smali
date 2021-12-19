package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;

public final class m implements a {

    /* renamed from: a  reason: collision with root package name */
    public final int f136863a;

    static {
        Covode.recordClassIndex(89443);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof m) && this.f136863a == ((m) obj).f136863a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f136863a;
    }

    public final String toString() {
        return "StoryUserStoryDeleteParam(position=" + this.f136863a + ")";
    }

    public m(int i2) {
        this.f136863a = i2;
    }
}
