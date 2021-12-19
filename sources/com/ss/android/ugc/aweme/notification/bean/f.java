package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Objects;

public final class f extends MusNotice {

    /* renamed from: a  reason: collision with root package name */
    public final User f113246a;

    /* renamed from: b  reason: collision with root package name */
    public final int f113247b;

    /* renamed from: c  reason: collision with root package name */
    public final RoomInfo f113248c;

    static {
        Covode.recordClassIndex(72814);
    }

    public final String toString() {
        return "LiveNotice(user=" + this.f113246a + ", liveType=" + this.f113247b + ", roomInfo=" + this.f113248c + ")";
    }

    public final String a() {
        RoomInfo roomInfo = this.f113248c;
        if (roomInfo != null) {
            return roomInfo.title;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(this.type);
        User user = this.f113246a;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        objArr[1] = str;
        objArr[2] = Integer.valueOf(this.f113247b);
        return Objects.hash(objArr);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.type != fVar.type || !Objects.equals(this.f113246a, fVar.f113246a) || this.f113247b != fVar.f113247b || !Objects.equals(this.f113248c, fVar.f113248c)) {
            return false;
        }
        return true;
    }

    public f(User user, int i2, RoomInfo roomInfo) {
        super(true);
        this.f113246a = user;
        this.f113247b = i2;
        this.f113248c = roomInfo;
        ((MusNotice) this).type = 1001;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        this.priority = 2;
        this.timeLineType = 0;
        this.createTime = 9223372036854775805L;
    }
}
