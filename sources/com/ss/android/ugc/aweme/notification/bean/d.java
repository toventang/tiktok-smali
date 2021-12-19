package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Objects;

public final class d extends MusNotice {

    /* renamed from: a  reason: collision with root package name */
    public final int f113238a;

    /* renamed from: b  reason: collision with root package name */
    public final List<User> f113239b;

    static {
        Covode.recordClassIndex(72812);
    }

    public final String toString() {
        return "FollowRequestNotice(followRequestTotal=" + this.f113238a + ", followRequestList=" + this.f113239b + ")";
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.f113238a), this.f113239b);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.type == dVar.type && this.f113238a == dVar.f113238a && Objects.equals(this.f113239b, dVar.f113239b)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i2, List<? extends User> list) {
        super(true);
        this.f113238a = i2;
        this.f113239b = list;
        ((MusNotice) this).type = 13;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }
}
