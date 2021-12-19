package com.ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.util.List;

public final class b {
    @c(a = "owner_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f119475a;
    @c(a = "qa_id")

    /* renamed from: b  reason: collision with root package name */
    public final long f119476b;
    @c(a = "title")

    /* renamed from: c  reason: collision with root package name */
    public final String f119477c;
    @c(a = "video_count")

    /* renamed from: d  reason: collision with root package name */
    public final int f119478d;
    @c(a = "share_info")

    /* renamed from: e  reason: collision with root package name */
    public final ShareInfo f119479e;
    @c(a = "aweme_list")

    /* renamed from: f  reason: collision with root package name */
    public final List<Aweme> f119480f;

    static {
        Covode.recordClassIndex(77660);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f119475a, bVar.f119475a) && this.f119476b == bVar.f119476b && l.a(this.f119477c, bVar.f119477c) && this.f119478d == bVar.f119478d && l.a(this.f119479e, bVar.f119479e) && l.a(this.f119480f, bVar.f119480f);
    }

    public final String toString() {
        return "Qna(ownerId=" + this.f119475a + ", questionId=" + this.f119476b + ", questionName=" + this.f119477c + ", userCount=" + this.f119478d + ", shareInfo=" + this.f119479e + ", awemeCoverList=" + this.f119480f + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        String str = this.f119475a;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f119476b;
        int i6 = ((i2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.f119477c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f119478d) * 31;
        ShareInfo shareInfo = this.f119479e;
        if (shareInfo != null) {
            i4 = shareInfo.hashCode();
        } else {
            i4 = 0;
        }
        int i8 = (i7 + i4) * 31;
        List<Aweme> list = this.f119480f;
        if (list != null) {
            i5 = list.hashCode();
        }
        return i8 + i5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(String str, long j2, String str2, int i2, ShareInfo shareInfo, List<? extends Aweme> list) {
        l.d(str, "");
        l.d(str2, "");
        l.d(list, "");
        this.f119475a = str;
        this.f119476b = j2;
        this.f119477c = str2;
        this.f119478d = i2;
        this.f119479e = shareInfo;
        this.f119480f = list;
    }
}
