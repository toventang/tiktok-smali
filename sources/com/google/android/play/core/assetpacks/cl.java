package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class cl {

    /* renamed from: a  reason: collision with root package name */
    public final int f52981a;

    /* renamed from: b  reason: collision with root package name */
    public final String f52982b;

    /* renamed from: c  reason: collision with root package name */
    public final long f52983c;

    /* renamed from: d  reason: collision with root package name */
    public final long f52984d;

    /* renamed from: e  reason: collision with root package name */
    public final int f52985e;

    static {
        Covode.recordClassIndex(32731);
    }

    cl() {
    }

    cl(int i2, String str, long j2, long j3, int i3) {
        this();
        this.f52981a = i2;
        this.f52982b = str;
        this.f52983c = j2;
        this.f52984d = j3;
        this.f52985e = i3;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cl) {
            cl clVar = (cl) obj;
            return this.f52981a == clVar.f52981a && ((str = this.f52982b) != null ? str.equals(clVar.f52982b) : clVar.f52982b == null) && this.f52983c == clVar.f52983c && this.f52984d == clVar.f52984d && this.f52985e == clVar.f52985e;
        }
    }

    public final int hashCode() {
        int i2 = (this.f52981a ^ 1000003) * 1000003;
        String str = this.f52982b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f52983c;
        long j3 = this.f52984d;
        return ((((((i2 ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f52985e;
    }

    public final String toString() {
        int i2 = this.f52981a;
        String str = this.f52982b;
        long j2 = this.f52983c;
        long j3 = this.f52984d;
        int i3 = this.f52985e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i2);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j2);
        sb.append(", remainingBytes=");
        sb.append(j3);
        sb.append(", previousChunk=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
