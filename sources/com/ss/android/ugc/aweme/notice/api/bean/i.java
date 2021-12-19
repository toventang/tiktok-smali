package com.ss.android.ugc.aweme.notice.api.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;
import java.util.List;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f112688a;

    /* renamed from: b  reason: collision with root package name */
    public final int f112689b;

    /* renamed from: c  reason: collision with root package name */
    public final List<User> f112690c;

    static {
        Covode.recordClassIndex(72424);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f112688a == iVar.f112688a && this.f112689b == iVar.f112689b && l.a(this.f112690c, iVar.f112690c);
    }

    public final int hashCode() {
        int i2 = ((this.f112688a * 31) + this.f112689b) * 31;
        List<User> list = this.f112690c;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NoticeFollowingTabInfo(group=" + this.f112688a + ", level=" + this.f112689b + ", followeeInfo=" + this.f112690c + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public i(int i2, int i3, List<? extends User> list) {
        this.f112688a = i2;
        this.f112689b = i3;
        this.f112690c = list;
    }
}
