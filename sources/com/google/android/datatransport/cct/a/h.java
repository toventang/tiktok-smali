package com.google.android.datatransport.cct.a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.a.q;
import java.util.List;

public final class h extends q {

    /* renamed from: a  reason: collision with root package name */
    public final long f49342a;

    /* renamed from: b  reason: collision with root package name */
    public final long f49343b;

    /* renamed from: c  reason: collision with root package name */
    public final m f49344c;

    /* renamed from: d  reason: collision with root package name */
    public final int f49345d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49346e;

    /* renamed from: f  reason: collision with root package name */
    public final List<o> f49347f;

    /* renamed from: g  reason: collision with root package name */
    private final b f49348g;

    static {
        Covode.recordClassIndex(30867);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j2 = this.f49342a;
        long j3 = this.f49343b;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        m mVar = this.f49344c;
        int i3 = 0;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int i4 = (((i2 ^ hashCode) * 1000003) ^ this.f49345d) * 1000003;
        String str = this.f49346e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        List<o> list = this.f49347f;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode3) * 1000003;
        b bVar = this.f49348g;
        if (bVar != null) {
            i3 = bVar.hashCode();
        }
        return i6 ^ i3;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f49342a + ", requestUptimeMs=" + this.f49343b + ", clientInfo=" + this.f49344c + ", logSource=" + this.f49345d + ", logSourceName=" + this.f49346e + ", logEvents=" + this.f49347f + ", qosTier=" + this.f49348g + "}";
    }

    public static final class a extends q.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f49349a;

        /* renamed from: b  reason: collision with root package name */
        private Long f49350b;

        /* renamed from: c  reason: collision with root package name */
        private m f49351c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f49352d;

        /* renamed from: e  reason: collision with root package name */
        private String f49353e;

        /* renamed from: f  reason: collision with root package name */
        private List<o> f49354f;

        /* renamed from: g  reason: collision with root package name */
        private b f49355g;

        static {
            Covode.recordClassIndex(30868);
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q a() {
            String str = "";
            if (this.f49349a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f49350b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f49352d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new h(this.f49349a.longValue(), this.f49350b.longValue(), this.f49351c, this.f49352d.intValue(), this.f49353e, this.f49354f, this.f49355g);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a a(b bVar) {
            this.f49355g = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a a(int i2) {
            this.f49352d = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a b(long j2) {
            this.f49350b = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a a(long j2) {
            this.f49349a = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a a(m mVar) {
            this.f49351c = mVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a a(String str) {
            this.f49353e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.a.q.a
        public final q.a a(List<o> list) {
            this.f49354f = list;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        m mVar;
        String str;
        List<o> list;
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            h hVar = (h) ((q) obj);
            if (this.f49342a != hVar.f49342a || this.f49343b != hVar.f49343b || ((mVar = this.f49344c) != null ? !mVar.equals(hVar.f49344c) : hVar.f49344c != null) || this.f49345d != hVar.f49345d || ((str = this.f49346e) != null ? !str.equals(hVar.f49346e) : hVar.f49346e != null) || ((list = this.f49347f) != null ? !list.equals(hVar.f49347f) : hVar.f49347f != null) || ((bVar = this.f49348g) != null ? !bVar.equals(hVar.f49348g) : hVar.f49348g != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* synthetic */ h(long j2, long j3, m mVar, int i2, String str, List list, b bVar) {
        this.f49342a = j2;
        this.f49343b = j3;
        this.f49344c = mVar;
        this.f49345d = i2;
        this.f49346e = str;
        this.f49347f = list;
        this.f49348g = bVar;
    }
}
