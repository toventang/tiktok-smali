package com.facebook.a;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.ad;
import java.io.Serializable;

public final class a implements Serializable {
    private static final long serialVersionUID = 1;
    private final String accessTokenString;
    private final String applicationId;

    static {
        Covode.recordClassIndex(28407);
    }

    public final String getAccessTokenString() {
        return this.accessTokenString;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    /* renamed from: com.facebook.a.a$a  reason: collision with other inner class name */
    static class C1157a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;
        private final String accessTokenString;
        private final String appId;

        static {
            Covode.recordClassIndex(28408);
        }

        private Object readResolve() {
            return new a(this.accessTokenString, this.appId);
        }

        private C1157a(String str, String str2) {
            this.accessTokenString = str;
            this.appId = str2;
        }

        /* synthetic */ C1157a(String str, String str2, byte b2) {
            this(str, str2);
        }
    }

    private Object writeReplace() {
        return new C1157a(this.accessTokenString, this.applicationId, (byte) 0);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.accessTokenString;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.applicationId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.facebook.AccessToken r3) {
        /*
            r2 = this;
            java.lang.String r1 = r3.f46498e
            com.facebook.internal.ae.a()
            java.lang.String r0 = com.facebook.m.f48915a
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.a.<init>(com.facebook.AccessToken):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!ad.a((Object) aVar.accessTokenString, (Object) this.accessTokenString) || !ad.a((Object) aVar.applicationId, (Object) this.applicationId)) {
            return false;
        }
        return true;
    }

    public a(String str, String str2) {
        this.accessTokenString = ad.a(str) ? null : str;
        this.applicationId = str2;
    }
}
