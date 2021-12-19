package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class a implements Serializable {
    @c(a = "data")
    private final C1430a data;
    @c(a = "message")
    private final String message;

    static {
        Covode.recordClassIndex(39366);
    }

    public static /* synthetic */ a copy$default(a aVar, String str, C1430a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aVar.message;
        }
        if ((i2 & 2) != 0) {
            aVar2 = aVar.data;
        }
        return aVar.copy(str, aVar2);
    }

    public final String component1() {
        return this.message;
    }

    public final C1430a component2() {
        return this.data;
    }

    public final a copy(String str, C1430a aVar) {
        return new a(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.message, aVar.message) && l.a(this.data, aVar.data);
    }

    public final int hashCode() {
        String str = this.message;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C1430a aVar = this.data;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "AddVerificationResponse(message=" + this.message + ", data=" + this.data + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.a$a  reason: collision with other inner class name */
    public static final class C1430a implements Serializable {
        @c(a = "default_verify_way")
        private final String default_verify_way;
        @c(a = "error_code")
        private final Integer errorCode;
        @c(a = "description")
        private final String errorDescription;
        @c(a = "two_step_verify_ways")
        private final List<aa> two_step_verify_ways;

        static {
            Covode.recordClassIndex(39367);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.twostep.a$a */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C1430a copy$default(C1430a aVar, List list, String str, String str2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = aVar.two_step_verify_ways;
            }
            if ((i2 & 2) != 0) {
                str = aVar.default_verify_way;
            }
            if ((i2 & 4) != 0) {
                str2 = aVar.errorDescription;
            }
            if ((i2 & 8) != 0) {
                num = aVar.errorCode;
            }
            return aVar.copy(list, str, str2, num);
        }

        public final List<aa> component1() {
            return this.two_step_verify_ways;
        }

        public final String component2() {
            return this.default_verify_way;
        }

        public final String component3() {
            return this.errorDescription;
        }

        public final Integer component4() {
            return this.errorCode;
        }

        public final C1430a copy(List<aa> list, String str, String str2, Integer num) {
            return new C1430a(list, str, str2, num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1430a)) {
                return false;
            }
            C1430a aVar = (C1430a) obj;
            return l.a(this.two_step_verify_ways, aVar.two_step_verify_ways) && l.a(this.default_verify_way, aVar.default_verify_way) && l.a(this.errorDescription, aVar.errorDescription) && l.a(this.errorCode, aVar.errorCode);
        }

        public final int hashCode() {
            List<aa> list = this.two_step_verify_ways;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.default_verify_way;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.errorDescription;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Integer num = this.errorCode;
            if (num != null) {
                i2 = num.hashCode();
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "Data(two_step_verify_ways=" + this.two_step_verify_ways + ", default_verify_way=" + this.default_verify_way + ", errorDescription=" + this.errorDescription + ", errorCode=" + this.errorCode + ")";
        }

        public final String getDefault_verify_way() {
            return this.default_verify_way;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final List<aa> getTwo_step_verify_ways() {
            return this.two_step_verify_ways;
        }

        public C1430a(List<aa> list, String str, String str2, Integer num) {
            this.two_step_verify_ways = list;
            this.default_verify_way = str;
            this.errorDescription = str2;
            this.errorCode = num;
        }
    }

    public final C1430a getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public a(String str, C1430a aVar) {
        this.message = str;
        this.data = aVar;
    }
}
