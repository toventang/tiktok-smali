package com.ss.android.ugc.aweme.notification.bean;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.Objects;

public final class h extends MusNotice {
    static {
        Covode.recordClassIndex(72816);
    }

    public h() {
        super(true);
        ((MusNotice) this).type = 9999;
        ((MusNotice) this).nid = String.valueOf(hashCode());
        ((MusNotice) this).hasRead = true;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type));
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && this.type == ((h) obj).type) {
            return true;
        }
        return false;
    }
}
