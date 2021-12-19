package com.bytedance.bpea.basics;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import h.m.p;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public final class PrivacyCert extends c {
    private final j privacyPoint;
    private final k[] privacyPolicies;
    private final String usage;

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public String privacyCertId;
        private k[] privacyPolicies;
        private String tag;
        private String usage;

        static {
            Covode.recordClassIndex(15658);
        }

        public static final Builder with(String str) {
            return Companion.with(str);
        }

        public static final class Companion {
            static {
                Covode.recordClassIndex(15659);
            }

            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }

            public final Builder with(String str) {
                l.c(str, "");
                Builder builder = new Builder();
                builder.privacyCertId = str;
                return builder;
            }
        }

        public final String getPrivacyCertId() {
            return this.privacyCertId;
        }

        public final k[] getPrivacyPolicies() {
            return this.privacyPolicies;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getUsage() {
            return this.usage;
        }

        public final PrivacyCert build() {
            j jVar = new j(this.privacyCertId);
            jVar.setTag(this.tag);
            return new PrivacyCert(jVar, this.usage, this.privacyPolicies);
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final Builder usage(String str) {
            l.c(str, "");
            this.usage = str;
            return this;
        }

        public final Builder policies(k... kVarArr) {
            l.c(kVarArr, "");
            int length = kVarArr.length;
            k[] kVarArr2 = new k[length];
            for (int i2 = 0; i2 < length; i2++) {
                kVarArr2[i2] = kVarArr[i2];
            }
            this.privacyPolicies = kVarArr2;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(15657);
    }

    public static /* synthetic */ PrivacyCert copy$default(PrivacyCert privacyCert, j jVar, String str, k[] kVarArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            jVar = privacyCert.privacyPoint;
        }
        if ((i2 & 2) != 0) {
            str = privacyCert.usage;
        }
        if ((i2 & 4) != 0) {
            kVarArr = privacyCert.privacyPolicies;
        }
        return privacyCert.copy(jVar, str, kVarArr);
    }

    public final j component1() {
        return this.privacyPoint;
    }

    public final String component2() {
        return this.usage;
    }

    public final k[] component3() {
        return this.privacyPolicies;
    }

    public final PrivacyCert copy(j jVar, String str, k[] kVarArr) {
        return new PrivacyCert(jVar, str, kVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyCert)) {
            return false;
        }
        PrivacyCert privacyCert = (PrivacyCert) obj;
        return l.a(this.privacyPoint, privacyCert.privacyPoint) && l.a(this.usage, privacyCert.usage) && l.a(this.privacyPolicies, privacyCert.privacyPolicies);
    }

    public final int hashCode() {
        j jVar = this.privacyPoint;
        int i2 = 0;
        int hashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        String str = this.usage;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        k[] kVarArr = this.privacyPolicies;
        if (kVarArr != null) {
            i2 = Arrays.hashCode(kVarArr);
        }
        return hashCode2 + i2;
    }

    @Override // com.bytedance.bpea.basics.c
    public final String toString() {
        return "PrivacyCert(privacyPoint=" + this.privacyPoint + ", usage=" + this.usage + ", privacyPolicies=" + Arrays.toString(this.privacyPolicies) + ")";
    }

    public final j getPrivacyPoint() {
        return this.privacyPoint;
    }

    public final k[] getPrivacyPolicies() {
        return this.privacyPolicies;
    }

    public final String getUsage() {
        return this.usage;
    }

    @Override // com.bytedance.bpea.basics.c, com.bytedance.bpea.basics.d
    public final JSONObject toJSON() {
        String str;
        JSONObject json = super.toJSON();
        try {
            json.put("usage", this.usage);
            j jVar = this.privacyPoint;
            if (jVar != null) {
                str = jVar.getTag();
            } else {
                str = null;
            }
            json.put("tag", str);
            JSONArray jSONArray = new JSONArray();
            k[] kVarArr = this.privacyPolicies;
            if (kVarArr != null) {
                for (k kVar : kVarArr) {
                    jSONArray.put(kVar.getDataType());
                }
            }
            json.put("dataType", jSONArray.toString());
        } catch (Throwable unused) {
        }
        return json;
    }

    @Override // com.bytedance.bpea.basics.c, com.bytedance.bpea.basics.d
    public final void validate(f fVar) {
        String id;
        l.c(fVar, "");
        super.validate(fVar);
        j jVar = this.privacyPoint;
        if (jVar == null || (id = jVar.getId()) == null || p.a((CharSequence) id)) {
            throw new a(-1, "certId is empty");
        }
        k[] kVarArr = this.privacyPolicies;
        if (kVarArr == null || kVarArr.length == 0) {
            throw new a(-1, "policy is empty");
        }
        String[] strArr = fVar.f26601b;
        if (strArr == null || strArr.length == 0) {
            throw new a(-1, "check dataType is empty");
        }
        String[] strArr2 = fVar.f26601b;
        if (strArr2 != null) {
            for (String str : strArr2) {
                boolean z = false;
                for (k kVar : this.privacyPolicies) {
                    String dataType = kVar.getDataType();
                    if (dataType != null && dataType.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    throw new a(-1, "dataType do not match");
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PrivacyCert(com.bytedance.bpea.basics.j r3, java.lang.String r4, com.bytedance.bpea.basics.k[] r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0016
            java.lang.String r1 = r3.getId()
        L_0x0006:
            com.bytedance.bpea.basics.g r0 = com.bytedance.bpea.basics.g.PRIVACY_CERT
            int r0 = r0.getType()
            r2.<init>(r1, r0)
            r2.privacyPoint = r3
            r2.usage = r4
            r2.privacyPolicies = r5
            return
        L_0x0016:
            r1 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.basics.PrivacyCert.<init>(com.bytedance.bpea.basics.j, java.lang.String, com.bytedance.bpea.basics.k[]):void");
    }
}
