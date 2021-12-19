package com.ss.android.ugc.aweme.discover.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.d.a.b;
import h.f.b.l;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final GlobalDoodleConfig f80966a;

    /* renamed from: b  reason: collision with root package name */
    public final LogPbBean f80967b;

    static {
        Covode.recordClassIndex(50333);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return l.a(this.f80966a, mVar.f80966a) && l.a(this.f80967b, mVar.f80967b);
    }

    public final int hashCode() {
        GlobalDoodleConfig globalDoodleConfig = this.f80966a;
        int i2 = 0;
        int hashCode = (globalDoodleConfig != null ? globalDoodleConfig.hashCode() : 0) * 31;
        LogPbBean logPbBean = this.f80967b;
        if (logPbBean != null) {
            i2 = logPbBean.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "SearchRequestSuccessConfigEvent(globalDoodleConfig=" + this.f80966a + ", logPb=" + this.f80967b + ")";
    }

    public m(GlobalDoodleConfig globalDoodleConfig, LogPbBean logPbBean) {
        this.f80966a = globalDoodleConfig;
        this.f80967b = logPbBean;
    }
}
