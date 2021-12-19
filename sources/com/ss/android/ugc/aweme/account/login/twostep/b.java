package com.ss.android.ugc.aweme.account.login.twostep;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class b implements Serializable {
    @c(a = "data")
    private final a data;
    @c(a = "message")
    private final String message;

    static {
        Covode.recordClassIndex(39370);
    }

    public static /* synthetic */ b copy$default(b bVar, String str, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.message;
        }
        if ((i2 & 2) != 0) {
            aVar = bVar.data;
        }
        return bVar.copy(str, aVar);
    }

    public final String component1() {
        return this.message;
    }

    public final a component2() {
        return this.data;
    }

    public final b copy(String str, a aVar) {
        return new b(str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.message, bVar.message) && l.a(this.data, bVar.data);
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
        return "AuthDeviceResponse(message=" + this.message + ", data=" + this.data + ")";
    }

    public static final class a implements Serializable {
        @c(a = "auth_device")
        private final List<e> auth_device;
        @c(a = "error_code")
        private final Integer errorCode;
        @c(a = "description")
        private final String errorDescription;

        static {
            Covode.recordClassIndex(39371);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.account.login.twostep.b$a */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, List list, String str, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = aVar.auth_device;
            }
            if ((i2 & 2) != 0) {
                str = aVar.errorDescription;
            }
            if ((i2 & 4) != 0) {
                num = aVar.errorCode;
            }
            return aVar.copy(list, str, num);
        }

        public final List<e> component1() {
            return this.auth_device;
        }

        public final String component2() {
            return this.errorDescription;
        }

        public final Integer component3() {
            return this.errorCode;
        }

        public final a copy(List<e> list, String str, Integer num) {
            return new a(list, str, num);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.auth_device, aVar.auth_device) && l.a(this.errorDescription, aVar.errorDescription) && l.a(this.errorCode, aVar.errorCode);
        }

        public final int hashCode() {
            List<e> list = this.auth_device;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.errorDescription;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.errorCode;
            if (num != null) {
                i2 = num.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Data(auth_device=" + this.auth_device + ", errorDescription=" + this.errorDescription + ", errorCode=" + this.errorCode + ")";
        }

        public final List<e> getAuth_device() {
            return this.auth_device;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public a(List<e> list, String str, Integer num) {
            this.auth_device = list;
            this.errorDescription = str;
            this.errorCode = num;
        }
    }

    public final a getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public b(String str, a aVar) {
        this.message = str;
        this.data = aVar;
    }
}
