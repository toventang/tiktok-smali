package com.ss.android.ugc.aweme.comment.barrage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f71532a;

    /* renamed from: b  reason: collision with root package name */
    public final String f71533b;

    /* renamed from: c  reason: collision with root package name */
    public final String f71534c;

    /* renamed from: d  reason: collision with root package name */
    public final int f71535d;

    /* renamed from: e  reason: collision with root package name */
    public final String f71536e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f71537f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f71538g;

    static {
        Covode.recordClassIndex(44014);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f71532a, aVar.f71532a) && l.a(this.f71533b, aVar.f71533b) && l.a(this.f71534c, aVar.f71534c) && this.f71535d == aVar.f71535d && l.a(this.f71536e, aVar.f71536e) && l.a(this.f71537f, aVar.f71537f) && l.a(this.f71538g, aVar.f71538g);
    }

    public final int hashCode() {
        Aweme aweme = this.f71532a;
        int i2 = 0;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f71533b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f71534c;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f71535d) * 31;
        String str3 = this.f71536e;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.f71537f;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Set<String> set = this.f71538g;
        if (set != null) {
            i2 = set.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "CommentAndLikeBubbleMobEventParam(aweme=" + this.f71532a + ", enterFrom=" + this.f71533b + ", groupId=" + this.f71534c + ", followStatus=" + this.f71535d + ", storyType=" + this.f71536e + ", pageType=" + this.f71537f + ", reportShowSet=" + this.f71538g + ")";
    }

    public a(Aweme aweme, String str, String str2, int i2, String str3, Integer num, Set<String> set) {
        this.f71532a = aweme;
        this.f71533b = str;
        this.f71534c = str2;
        this.f71535d = i2;
        this.f71536e = str3;
        this.f71537f = num;
        this.f71538g = set;
    }
}
