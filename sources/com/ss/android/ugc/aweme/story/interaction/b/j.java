package com.ss.android.ugc.aweme.story.interaction.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f137863a;

    /* renamed from: b  reason: collision with root package name */
    public final String f137864b;

    /* renamed from: c  reason: collision with root package name */
    public final String f137865c;

    /* renamed from: d  reason: collision with root package name */
    public final String f137866d;

    /* renamed from: e  reason: collision with root package name */
    public final int f137867e;

    /* renamed from: f  reason: collision with root package name */
    public final String f137868f;

    /* renamed from: g  reason: collision with root package name */
    public final String f137869g;

    static {
        Covode.recordClassIndex(90184);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f137863a, jVar.f137863a) && l.a(this.f137864b, jVar.f137864b) && l.a(this.f137865c, jVar.f137865c) && l.a(this.f137866d, jVar.f137866d) && this.f137867e == jVar.f137867e && l.a(this.f137868f, jVar.f137868f) && l.a(this.f137869g, jVar.f137869g);
    }

    public final int hashCode() {
        Aweme aweme = this.f137863a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f137864b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f137865c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f137866d;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f137867e) * 31;
        String str4 = this.f137868f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f137869g;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "StoryViewerAndLikerMobEventParam(aweme=" + this.f137863a + ", enterFrom=" + this.f137864b + ", enterMethod=" + this.f137865c + ", groupId=" + this.f137866d + ", followStatus=" + this.f137867e + ", storyType=" + this.f137868f + ", storyCollectionId=" + this.f137869g + ")";
    }

    public j(Aweme aweme, String str, String str2, String str3, int i2, String str4, String str5) {
        this.f137863a = aweme;
        this.f137864b = str;
        this.f137865c = str2;
        this.f137866d = str3;
        this.f137867e = i2;
        this.f137868f = str4;
        this.f137869g = str5;
    }
}
