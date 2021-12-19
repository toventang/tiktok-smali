package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class cs {

    /* renamed from: a  reason: collision with root package name */
    public final String f53003a;

    /* renamed from: b  reason: collision with root package name */
    public final long f53004b;

    /* renamed from: c  reason: collision with root package name */
    public final int f53005c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f53006d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f53007e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f53008f;

    static {
        Covode.recordClassIndex(32738);
    }

    cs() {
    }

    cs(String str, long j2, int i2, boolean z, boolean z2, byte[] bArr) {
        this();
        this.f53003a = str;
        this.f53004b = j2;
        this.f53005c = i2;
        this.f53006d = z;
        this.f53007e = z2;
        this.f53008f = bArr;
    }

    static cs a(String str, long j2, int i2, boolean z, byte[] bArr, boolean z2) {
        return new cs(str, j2, i2, z, z2, bArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        String str = this.f53003a;
        if (str == null) {
            return false;
        }
        return str.endsWith("/");
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f53005c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cs) {
            cs csVar = (cs) obj;
            String str = this.f53003a;
            if (str != null ? str.equals(csVar.f53003a) : csVar.f53003a == null) {
                if (this.f53004b == csVar.f53004b && this.f53005c == csVar.f53005c && this.f53006d == csVar.f53006d && this.f53007e == csVar.f53007e) {
                    boolean z = csVar instanceof cs;
                    if (Arrays.equals(this.f53008f, csVar.f53008f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f53003a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f53004b;
        int i2 = (((((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f53005c) * 1000003;
        int i3 = 1237;
        int i4 = (i2 ^ (true != this.f53006d ? 1237 : 1231)) * 1000003;
        if (true == this.f53007e) {
            i3 = 1231;
        }
        return ((i4 ^ i3) * 1000003) ^ Arrays.hashCode(this.f53008f);
    }

    public final String toString() {
        String str = this.f53003a;
        long j2 = this.f53004b;
        int i2 = this.f53005c;
        boolean z = this.f53006d;
        boolean z2 = this.f53007e;
        String arrays = Arrays.toString(this.f53008f);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j2);
        sb.append(", compressionMethod=");
        sb.append(i2);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
