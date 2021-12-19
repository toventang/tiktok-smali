package com.ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;

public final class l {

    /* renamed from: d  reason: collision with root package name */
    public static final a f78553d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f78554a;

    /* renamed from: b  reason: collision with root package name */
    public final String f78555b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f78556c;

    static {
        Covode.recordClassIndex(48782);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return h.f.b.l.a(this.f78554a, lVar.f78554a) && h.f.b.l.a(this.f78555b, lVar.f78555b) && h.f.b.l.a(this.f78556c, lVar.f78556c);
    }

    public final int hashCode() {
        String str = this.f78554a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f78555b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f78556c;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DebugUrlMessage(url=" + this.f78554a + ", message=" + this.f78555b + ", type=" + this.f78556c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(48783);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ l(String str, String str2) {
        this(str, str2, 0);
    }

    private l(String str, String str2, Integer num) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        this.f78554a = str;
        this.f78555b = str2;
        this.f78556c = num;
    }
}
