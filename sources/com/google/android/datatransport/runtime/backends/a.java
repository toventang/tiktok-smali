package com.google.android.datatransport.runtime.backends;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.h;
import java.util.Arrays;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<h> f49400a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f49401b;

    static {
        Covode.recordClassIndex(30910);
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public final Iterable<h> a() {
        return this.f49400a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public final byte[] b() {
        return this.f49401b;
    }

    public final int hashCode() {
        return ((this.f49400a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f49401b);
    }

    /* renamed from: com.google.android.datatransport.runtime.backends.a$a  reason: collision with other inner class name */
    public static final class C1199a extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<h> f49402a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f49403b;

        static {
            Covode.recordClassIndex(30911);
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public final f a() {
            String str = "";
            if (this.f49402a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f49402a, this.f49403b, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public final f.a a(Iterable<h> iterable) {
            this.f49402a = iterable;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public final f.a a(byte[] bArr) {
            this.f49403b = bArr;
            return this;
        }
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f49400a + ", extras=" + Arrays.toString(this.f49401b) + "}";
    }

    public final boolean equals(Object obj) {
        byte[] b2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f49400a.equals(fVar.a())) {
                byte[] bArr = this.f49401b;
                if (fVar instanceof a) {
                    b2 = ((a) fVar).f49401b;
                } else {
                    b2 = fVar.b();
                }
                if (Arrays.equals(bArr, b2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private a(Iterable<h> iterable, byte[] bArr) {
        this.f49400a = iterable;
        this.f49401b = bArr;
    }

    /* synthetic */ a(Iterable iterable, byte[] bArr, byte b2) {
        this(iterable, bArr);
    }
}
