package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

final class ah extends AssetPackState {

    /* renamed from: a  reason: collision with root package name */
    private final String f52783a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52784b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52785c;

    /* renamed from: d  reason: collision with root package name */
    private final long f52786d;

    /* renamed from: e  reason: collision with root package name */
    private final long f52787e;

    /* renamed from: f  reason: collision with root package name */
    private final int f52788f;

    /* renamed from: g  reason: collision with root package name */
    private final int f52789g;

    static {
        Covode.recordClassIndex(32673);
    }

    ah(String str, int i2, int i3, long j2, long j3, int i4, int i5) {
        Objects.requireNonNull(str, "Null name");
        this.f52783a = str;
        this.f52784b = i2;
        this.f52785c = i3;
        this.f52786d = j2;
        this.f52787e = j3;
        this.f52788f = i4;
        this.f52789g = i5;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final String a() {
        return this.f52783a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int b() {
        return this.f52784b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int c() {
        return this.f52785c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long d() {
        return this.f52786d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final long e() {
        return this.f52787e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f52783a.equals(assetPackState.a()) && this.f52784b == assetPackState.b() && this.f52785c == assetPackState.c() && this.f52786d == assetPackState.d() && this.f52787e == assetPackState.e() && this.f52788f == assetPackState.f() && this.f52789g == assetPackState.g();
        }
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int f() {
        return this.f52788f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    public final int g() {
        return this.f52789g;
    }

    public final int hashCode() {
        int hashCode = this.f52783a.hashCode();
        int i2 = this.f52784b;
        int i3 = this.f52785c;
        long j2 = this.f52786d;
        long j3 = this.f52787e;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f52788f) * 1000003) ^ this.f52789g;
    }

    public final String toString() {
        String str = this.f52783a;
        int i2 = this.f52784b;
        int i3 = this.f52785c;
        long j2 = this.f52786d;
        long j3 = this.f52787e;
        int i4 = this.f52788f;
        int i5 = this.f52789g;
        StringBuilder sb = new StringBuilder(str.length() + 217);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", transferProgressPercentage=");
        sb.append(i4);
        sb.append(", updateAvailability=");
        sb.append(i5);
        sb.append("}");
        return sb.toString();
    }
}
