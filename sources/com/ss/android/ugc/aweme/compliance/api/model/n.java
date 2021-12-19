package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.Map;

public final class n implements Serializable {
    public static final a Companion = new a((byte) 0);
    @c(a = "account")
    private final Map<String, o> account;
    @c(a = "video")
    private final Map<String, o> videoPrivacy;

    static {
        Covode.recordClassIndex(47359);
    }

    public n() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.n */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ n copy$default(n nVar, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = nVar.account;
        }
        if ((i2 & 2) != 0) {
            map2 = nVar.videoPrivacy;
        }
        return nVar.copy(map, map2);
    }

    public final Map<String, o> component1() {
        return this.account;
    }

    public final Map<String, o> component2() {
        return this.videoPrivacy;
    }

    public final n copy(Map<String, o> map, Map<String, o> map2) {
        return new n(map, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return l.a(this.account, nVar.account) && l.a(this.videoPrivacy, nVar.videoPrivacy);
    }

    public final int hashCode() {
        Map<String, o> map = this.account;
        int i2 = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map<String, o> map2 = this.videoPrivacy;
        if (map2 != null) {
            i2 = map2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PrivacySettingRestriction(account=" + this.account + ", videoPrivacy=" + this.videoPrivacy + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47360);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Map<String, o> getAccount() {
        return this.account;
    }

    public final Map<String, o> getVideoPrivacy() {
        return this.videoPrivacy;
    }

    public n(Map<String, o> map, Map<String, o> map2) {
        this.account = map;
        this.videoPrivacy = map2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.compliance.api.model.o getTargetRestrictionItem(int r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r4, r0)
            r1 = 0
            if (r3 == 0) goto L_0x0012
            r0 = 1
            if (r3 == r0) goto L_0x000f
            r0 = 2
            if (r3 == r0) goto L_0x000f
        L_0x000e:
            return r1
        L_0x000f:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.o> r0 = r2.videoPrivacy
            goto L_0x0014
        L_0x0012:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.compliance.api.model.o> r0 = r2.account
        L_0x0014:
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r0.get(r4)
            com.ss.android.ugc.aweme.compliance.api.model.o r0 = (com.ss.android.ugc.aweme.compliance.api.model.o) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.api.model.n.getTargetRestrictionItem(int, java.lang.String):com.ss.android.ugc.aweme.compliance.api.model.o");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Map map, Map map2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : map, (i2 & 2) != 0 ? null : map2);
    }
}
