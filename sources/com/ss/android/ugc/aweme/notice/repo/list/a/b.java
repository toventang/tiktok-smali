package com.ss.android.ugc.aweme.notice.repo.list.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import h.f.b.l;

public final class b {
    @c(a = "view_type")

    /* renamed from: a  reason: collision with root package name */
    public final int f112797a;
    @c(a = "text_content")

    /* renamed from: b  reason: collision with root package name */
    public final String f112798b;
    @c(a = "action_type")

    /* renamed from: c  reason: collision with root package name */
    public final int f112799c;
    @c(a = "schema_url")

    /* renamed from: d  reason: collision with root package name */
    public final String f112800d;
    @c(a = "matched_friend")

    /* renamed from: e  reason: collision with root package name */
    public final MatchedFriendStruct f112801e;

    static {
        Covode.recordClassIndex(72508);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f112797a == bVar.f112797a && l.a(this.f112798b, bVar.f112798b) && this.f112799c == bVar.f112799c && l.a(this.f112800d, bVar.f112800d) && l.a(this.f112801e, bVar.f112801e);
    }

    public final int hashCode() {
        int i2 = this.f112797a * 31;
        String str = this.f112798b;
        int i3 = 0;
        int hashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f112799c) * 31;
        String str2 = this.f112800d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        MatchedFriendStruct matchedFriendStruct = this.f112801e;
        if (matchedFriendStruct != null) {
            i3 = matchedFriendStruct.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "LabelInfoTemplate(viewType=" + this.f112797a + ", content=" + this.f112798b + ", actionType=" + this.f112799c + ", schema=" + this.f112800d + ", matchedFriendStruct=" + this.f112801e + ")";
    }
}
