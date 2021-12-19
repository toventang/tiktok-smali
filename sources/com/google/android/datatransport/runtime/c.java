package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.d;
import com.google.android.datatransport.runtime.k;
import java.util.Arrays;
import java.util.Objects;

final class c extends k {

    /* renamed from: a  reason: collision with root package name */
    private final String f49424a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f49425b;

    /* renamed from: c  reason: collision with root package name */
    private final d f49426c;

    static {
        Covode.recordClassIndex(30927);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private String f49427a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f49428b;

        /* renamed from: c  reason: collision with root package name */
        private d f49429c;

        static {
            Covode.recordClassIndex(30928);
        }

        a() {
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public final k a() {
            String str = "";
            if (this.f49427a == null) {
                str = str + " backendName";
            }
            if (this.f49429c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.f49427a, this.f49428b, this.f49429c, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public final k.a a(byte[] bArr) {
            this.f49428b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public final k.a a(d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f49429c = dVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.k.a
        public final k.a a(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f49427a = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.k
    public final String a() {
        return this.f49424a;
    }

    @Override // com.google.android.datatransport.runtime.k
    public final byte[] b() {
        return this.f49425b;
    }

    @Override // com.google.android.datatransport.runtime.k
    public final d c() {
        return this.f49426c;
    }

    public final int hashCode() {
        return ((((this.f49424a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49425b)) * 1000003) ^ this.f49426c.hashCode();
    }

    public final boolean equals(Object obj) {
        byte[] b2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f49424a.equals(kVar.a())) {
                byte[] bArr = this.f49425b;
                if (kVar instanceof c) {
                    b2 = ((c) kVar).f49425b;
                } else {
                    b2 = kVar.b();
                }
                if (!Arrays.equals(bArr, b2) || !this.f49426c.equals(kVar.c())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private c(String str, byte[] bArr, d dVar) {
        this.f49424a = str;
        this.f49425b = bArr;
        this.f49426c = dVar;
    }

    /* synthetic */ c(String str, byte[] bArr, d dVar, byte b2) {
        this(str, bArr, dVar);
    }
}
