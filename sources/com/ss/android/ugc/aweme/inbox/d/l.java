package com.ss.android.ugc.aweme.inbox.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public final class l<TYPE> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f104200d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final TYPE f104201a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f104202b;

    /* renamed from: c  reason: collision with root package name */
    public final String f104203c;

    static {
        Covode.recordClassIndex(66716);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f104201a, lVar.f104201a) && h.f.b.l.a(this.f104202b, lVar.f104202b) && h.f.b.l.a(this.f104203c, lVar.f104203c);
    }

    public final int hashCode() {
        TYPE type = this.f104201a;
        int i2 = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Throwable th = this.f104202b;
        int hashCode2 = (hashCode + (th != null ? th.hashCode() : 0)) * 31;
        String str = this.f104203c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "RespMetaData(result=" + ((Object) this.f104201a) + ", error=" + this.f104202b + ", logId=" + this.f104203c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66717);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static <TYPE> l<TYPE> a(Throwable th) {
            String str;
            BaseResponse.ServerTimeExtra serverTimeExtra;
            h.f.b.l.d(th, "");
            if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                return new l<>(null, th, null);
            }
            Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
            if (!(rawResponse instanceof BaseResponse)) {
                rawResponse = null;
            }
            BaseResponse baseResponse = (BaseResponse) rawResponse;
            if (baseResponse == null || (serverTimeExtra = baseResponse.extra) == null) {
                str = null;
            } else {
                str = serverTimeExtra.logid;
            }
            return new l<>(null, th, str);
        }
    }

    public l(TYPE type, Throwable th, String str) {
        this.f104201a = type;
        this.f104202b = th;
        this.f104203c = str;
    }
}
