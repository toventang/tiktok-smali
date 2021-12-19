package com.google.android.play.core.e;

import android.app.PendingIntent;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
public final class h extends f {

    /* renamed from: a  reason: collision with root package name */
    private final int f53316a;

    /* renamed from: b  reason: collision with root package name */
    private final int f53317b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53318c;

    /* renamed from: d  reason: collision with root package name */
    private final long f53319d;

    /* renamed from: e  reason: collision with root package name */
    private final long f53320e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f53321f;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f53322g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f53323h;

    /* renamed from: i  reason: collision with root package name */
    private final List<Intent> f53324i;

    static {
        Covode.recordClassIndex(32936);
    }

    h(int i2, int i3, int i4, long j2, long j3, List<String> list, List<String> list2, PendingIntent pendingIntent, List<Intent> list3) {
        this.f53316a = i2;
        this.f53317b = i3;
        this.f53318c = i4;
        this.f53319d = j2;
        this.f53320e = j3;
        this.f53321f = list;
        this.f53322g = list2;
        this.f53323h = pendingIntent;
        this.f53324i = list3;
    }

    @Override // com.google.android.play.core.e.f
    public final int a() {
        return this.f53316a;
    }

    @Override // com.google.android.play.core.e.f
    public final int b() {
        return this.f53317b;
    }

    @Override // com.google.android.play.core.e.f
    public final int c() {
        return this.f53318c;
    }

    @Override // com.google.android.play.core.e.f
    public final long d() {
        return this.f53319d;
    }

    @Override // com.google.android.play.core.e.f
    public final long e() {
        return this.f53320e;
    }

    public final boolean equals(Object obj) {
        List<String> list;
        List<String> list2;
        PendingIntent pendingIntent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f53316a == fVar.a() && this.f53317b == fVar.b() && this.f53318c == fVar.c() && this.f53319d == fVar.d() && this.f53320e == fVar.e() && ((list = this.f53321f) != null ? list.equals(fVar.i()) : fVar.i() == null) && ((list2 = this.f53322g) != null ? list2.equals(fVar.j()) : fVar.j() == null) && ((pendingIntent = this.f53323h) != null ? pendingIntent.equals(fVar.h()) : fVar.h() == null)) {
                List<Intent> list3 = this.f53324i;
                List<Intent> k2 = fVar.k();
                if (list3 != null ? list3.equals(k2) : k2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.e.f
    public final PendingIntent h() {
        return this.f53323h;
    }

    public final int hashCode() {
        int i2 = this.f53316a;
        int i3 = this.f53317b;
        int i4 = this.f53318c;
        long j2 = this.f53319d;
        long j3 = this.f53320e;
        int i5 = (((((((((i2 ^ 1000003) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        List<String> list = this.f53321f;
        int i6 = 0;
        int hashCode = (i5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<String> list2 = this.f53322g;
        int hashCode2 = (hashCode ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        PendingIntent pendingIntent = this.f53323h;
        int hashCode3 = (hashCode2 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        List<Intent> list3 = this.f53324i;
        if (list3 != null) {
            i6 = list3.hashCode();
        }
        return hashCode3 ^ i6;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.e.f
    public final List<String> i() {
        return this.f53321f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.e.f
    public final List<String> j() {
        return this.f53322g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.e.f
    public final List<Intent> k() {
        return this.f53324i;
    }

    public final String toString() {
        int i2 = this.f53316a;
        int i3 = this.f53317b;
        int i4 = this.f53318c;
        long j2 = this.f53319d;
        long j3 = this.f53320e;
        String valueOf = String.valueOf(this.f53321f);
        String valueOf2 = String.valueOf(this.f53322g);
        String valueOf3 = String.valueOf(this.f53323h);
        String valueOf4 = String.valueOf(this.f53324i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 251 + length2 + length3 + String.valueOf(valueOf4).length());
        sb.append("SplitInstallSessionState{sessionId=");
        sb.append(i2);
        sb.append(", status=");
        sb.append(i3);
        sb.append(", errorCode=");
        sb.append(i4);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
