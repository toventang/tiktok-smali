package com.ss.android.ugc.aweme.api.resp;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class EnterContext implements Serializable {
    @c(a = "enter_source_id")
    private final String enterSourceId;
    @c(a = "req_type")
    private final Integer reqType;

    static {
        Covode.recordClassIndex(40850);
    }

    public static /* synthetic */ EnterContext copy$default(EnterContext enterContext, Integer num, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = enterContext.reqType;
        }
        if ((i2 & 2) != 0) {
            str = enterContext.enterSourceId;
        }
        return enterContext.copy(num, str);
    }

    public final Integer component1() {
        return this.reqType;
    }

    public final String component2() {
        return this.enterSourceId;
    }

    public final EnterContext copy(Integer num, String str) {
        return new EnterContext(num, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterContext)) {
            return false;
        }
        EnterContext enterContext = (EnterContext) obj;
        return l.a(this.reqType, enterContext.reqType) && l.a(this.enterSourceId, enterContext.enterSourceId);
    }

    public final int hashCode() {
        Integer num = this.reqType;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.enterSourceId;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "EnterContext(reqType=" + this.reqType + ", enterSourceId=" + this.enterSourceId + ")";
    }

    public final String getEnterSourceId() {
        return this.enterSourceId;
    }

    public final Integer getReqType() {
        return this.reqType;
    }

    public EnterContext(Integer num, String str) {
        this.reqType = num;
        this.enterSourceId = str;
    }
}
