package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f137853a;

    /* renamed from: b  reason: collision with root package name */
    public final String f137854b;

    /* renamed from: c  reason: collision with root package name */
    public final String f137855c;

    /* renamed from: d  reason: collision with root package name */
    public final int f137856d;

    /* renamed from: e  reason: collision with root package name */
    public final String f137857e;

    /* renamed from: f  reason: collision with root package name */
    public final String f137858f;

    static {
        Covode.recordClassIndex(90180);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.f137853a, gVar.f137853a) && l.a(this.f137854b, gVar.f137854b) && l.a(this.f137855c, gVar.f137855c) && this.f137856d == gVar.f137856d && l.a(this.f137857e, gVar.f137857e) && l.a(this.f137858f, gVar.f137858f);
    }

    public final int hashCode() {
        Aweme aweme = this.f137853a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f137854b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f137855c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f137856d) * 31;
        String str3 = this.f137857e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f137858f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "StoryReactionBubbleMobEventParam(aweme=" + this.f137853a + ", enterFrom=" + this.f137854b + ", groupId=" + this.f137855c + ", followStatus=" + this.f137856d + ", storyType=" + this.f137857e + ", storyCollectionId=" + this.f137858f + ")";
    }

    public g(Aweme aweme, String str, String str2, int i2, String str3, String str4) {
        this.f137853a = aweme;
        this.f137854b = str;
        this.f137855c = str2;
        this.f137856d = i2;
        this.f137857e = str3;
        this.f137858f = str4;
    }
}
