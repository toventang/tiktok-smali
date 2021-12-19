package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<IMUser> f72314a;

    /* renamed from: b  reason: collision with root package name */
    public final List<IMUser> f72315b;

    /* renamed from: c  reason: collision with root package name */
    public final List<IMUser> f72316c;

    /* renamed from: d  reason: collision with root package name */
    public final List<IMUser> f72317d;

    static {
        Covode.recordClassIndex(44599);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f72314a, aVar.f72314a) && l.a(this.f72315b, aVar.f72315b) && l.a(this.f72316c, aVar.f72316c) && l.a(this.f72317d, aVar.f72317d);
    }

    public final int hashCode() {
        List<IMUser> list = this.f72314a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<IMUser> list2 = this.f72315b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<IMUser> list3 = this.f72316c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<IMUser> list4 = this.f72317d;
        if (list4 != null) {
            i2 = list4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "AllFriends(recentFriends=" + this.f72314a + ", mutualFriends=" + this.f72315b + ", followingFriends=" + this.f72316c + ", allFriendsList=" + this.f72317d + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(List<? extends IMUser> list, List<? extends IMUser> list2, List<? extends IMUser> list3, List<? extends IMUser> list4) {
        l.d(list, "");
        l.d(list2, "");
        l.d(list3, "");
        l.d(list4, "");
        this.f72314a = list;
        this.f72315b = list2;
        this.f72316c = list3;
        this.f72317d = list4;
    }
}
