package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class x implements Serializable {
    @c(a = "data")
    private final a data;
    @c(a = "message")
    private final String message;

    static {
        Covode.recordClassIndex(39485);
    }

    public static /* synthetic */ x copy$default(x xVar, String str, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = xVar.message;
        }
        if ((i2 & 2) != 0) {
            aVar = xVar.data;
        }
        return xVar.copy(str, aVar);
    }

    public final String component1() {
        return this.message;
    }

    public final a component2() {
        return this.data;
    }

    public final x copy(String str, a aVar) {
        return new x(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return l.a(this.message, xVar.message) && l.a(this.data, xVar.data);
    }

    public final int hashCode() {
        String str = this.message;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        a aVar = this.data;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UnusualInfoResponse(message=" + this.message + ", data=" + this.data + ")";
    }

    public static final class a implements Serializable {
        @c(a = "error_code")
        private final Integer errorCode;
        @c(a = "description")
        private final String errorDescription;
        @c(a = "new_notice")
        private final Integer new_notice;

        static {
            Covode.recordClassIndex(39486);
        }

        public static /* synthetic */ a copy$default(a aVar, Integer num, String str, Integer num2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                num = aVar.new_notice;
            }
            if ((i2 & 2) != 0) {
                str = aVar.errorDescription;
            }
            if ((i2 & 4) != 0) {
                num2 = aVar.errorCode;
            }
            return aVar.copy(num, str, num2);
        }

        public final Integer component1() {
            return this.new_notice;
        }

        public final String component2() {
            return this.errorDescription;
        }

        public final Integer component3() {
            return this.errorCode;
        }

        public final a copy(Integer num, String str, Integer num2) {
            return new a(num, str, num2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.new_notice, aVar.new_notice) && l.a(this.errorDescription, aVar.errorDescription) && l.a(this.errorCode, aVar.errorCode);
        }

        public final int hashCode() {
            Integer num = this.new_notice;
            int i2 = 0;
            int hashCode = (num != null ? num.hashCode() : 0) * 31;
            String str = this.errorDescription;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num2 = this.errorCode;
            if (num2 != null) {
                i2 = num2.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Data(new_notice=" + this.new_notice + ", errorDescription=" + this.errorDescription + ", errorCode=" + this.errorCode + ")";
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final Integer getNew_notice() {
            return this.new_notice;
        }

        public a(Integer num, String str, Integer num2) {
            this.new_notice = num;
            this.errorDescription = str;
            this.errorCode = num2;
        }
    }

    public final a getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public x(String str, a aVar) {
        this.message = str;
        this.data = aVar;
    }
}
