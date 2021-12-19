package com.google.android.play.core.install;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

public final class c extends InstallState {

    /* renamed from: a  reason: collision with root package name */
    private final int f53363a;

    /* renamed from: b  reason: collision with root package name */
    private final long f53364b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53365c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53366d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53367e;

    static {
        Covode.recordClassIndex(32960);
    }

    public c(int i2, long j2, long j3, int i3, String str) {
        this.f53363a = i2;
        this.f53364b = j2;
        this.f53365c = j3;
        this.f53366d = i3;
        Objects.requireNonNull(str, "Null packageName");
        this.f53367e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int a() {
        return this.f53363a;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long b() {
        return this.f53364b;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final long c() {
        return this.f53365c;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final int d() {
        return this.f53366d;
    }

    @Override // com.google.android.play.core.install.InstallState
    public final String e() {
        return this.f53367e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f53363a == installState.a() && this.f53364b == installState.b() && this.f53365c == installState.c() && this.f53366d == installState.d() && this.f53367e.equals(installState.e());
        }
    }

    public final int hashCode() {
        int i2 = this.f53363a;
        long j2 = this.f53364b;
        long j3 = this.f53365c;
        return ((((((((i2 ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.f53366d) * 1000003) ^ this.f53367e.hashCode();
    }

    public final String toString() {
        int i2 = this.f53363a;
        long j2 = this.f53364b;
        long j3 = this.f53365c;
        int i3 = this.f53366d;
        String str = this.f53367e;
        StringBuilder sb = new StringBuilder(str.length() + 164);
        sb.append("InstallState{installStatus=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", installErrorCode=");
        sb.append(i3);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
