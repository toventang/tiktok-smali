package com.ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class i extends MusNotice {

    /* renamed from: a  reason: collision with root package name */
    public static final a f112863a = new a((byte) 0);

    static {
        Covode.recordClassIndex(72553);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72554);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), Integer.valueOf(this.timeLineType));
    }

    public i(int i2) {
        super(true);
        ((MusNotice) this).type = 999;
        ((MusNotice) this).timeLineType = i2;
        this.nid = String.valueOf(hashCode());
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.type == iVar.type && this.timeLineType == iVar.timeLineType) {
            return true;
        }
        return false;
    }
}
