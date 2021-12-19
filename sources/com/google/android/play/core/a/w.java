package com.google.android.play.core.a;

import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

final class w extends a {

    /* renamed from: a  reason: collision with root package name */
    private final String f52736a;

    /* renamed from: b  reason: collision with root package name */
    private final int f52737b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52738c;

    /* renamed from: d  reason: collision with root package name */
    private final int f52739d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f52740e;

    /* renamed from: f  reason: collision with root package name */
    private final int f52741f;

    /* renamed from: g  reason: collision with root package name */
    private final long f52742g;

    /* renamed from: h  reason: collision with root package name */
    private final long f52743h;

    /* renamed from: i  reason: collision with root package name */
    private final long f52744i;

    /* renamed from: j  reason: collision with root package name */
    private final long f52745j;

    /* renamed from: k  reason: collision with root package name */
    private final PendingIntent f52746k;

    /* renamed from: l  reason: collision with root package name */
    private final PendingIntent f52747l;

    /* renamed from: m  reason: collision with root package name */
    private final PendingIntent f52748m;
    private final PendingIntent n;

    static {
        Covode.recordClassIndex(32657);
    }

    w(String str, int i2, int i3, int i4, Integer num, int i5, long j2, long j3, long j4, long j5, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        Objects.requireNonNull(str, "Null packageName");
        this.f52736a = str;
        this.f52737b = i2;
        this.f52738c = i3;
        this.f52739d = i4;
        this.f52740e = num;
        this.f52741f = i5;
        this.f52742g = j2;
        this.f52743h = j3;
        this.f52744i = j4;
        this.f52745j = j5;
        this.f52746k = pendingIntent;
        this.f52747l = pendingIntent2;
        this.f52748m = pendingIntent3;
        this.n = pendingIntent4;
    }

    @Override // com.google.android.play.core.a.a
    public final String a() {
        return this.f52736a;
    }

    @Override // com.google.android.play.core.a.a
    public final int b() {
        return this.f52737b;
    }

    @Override // com.google.android.play.core.a.a
    public final int c() {
        return this.f52738c;
    }

    @Override // com.google.android.play.core.a.a
    public final int d() {
        return this.f52739d;
    }

    @Override // com.google.android.play.core.a.a
    public final Integer e() {
        return this.f52740e;
    }

    public final boolean equals(Object obj) {
        Integer num;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        PendingIntent pendingIntent3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f52736a.equals(aVar.a()) && this.f52737b == aVar.b() && this.f52738c == aVar.c() && this.f52739d == aVar.d() && ((num = this.f52740e) != null ? num.equals(aVar.e()) : aVar.e() == null) && this.f52741f == aVar.f() && this.f52742g == aVar.g() && this.f52743h == aVar.h() && this.f52744i == aVar.i() && this.f52745j == aVar.j() && ((pendingIntent = this.f52746k) != null ? pendingIntent.equals(aVar.k()) : aVar.k() == null) && ((pendingIntent2 = this.f52747l) != null ? pendingIntent2.equals(aVar.l()) : aVar.l() == null) && ((pendingIntent3 = this.f52748m) != null ? pendingIntent3.equals(aVar.m()) : aVar.m() == null)) {
                PendingIntent pendingIntent4 = this.n;
                PendingIntent n2 = aVar.n();
                if (pendingIntent4 != null ? pendingIntent4.equals(n2) : n2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.a.a
    public final int f() {
        return this.f52741f;
    }

    @Override // com.google.android.play.core.a.a
    public final long g() {
        return this.f52742g;
    }

    @Override // com.google.android.play.core.a.a
    public final long h() {
        return this.f52743h;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f52736a.hashCode() ^ 1000003) * 1000003) ^ this.f52737b) * 1000003) ^ this.f52738c) * 1000003) ^ this.f52739d) * 1000003;
        Integer num = this.f52740e;
        int i2 = 0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int i3 = this.f52741f;
        long j2 = this.f52742g;
        long j3 = this.f52743h;
        long j4 = this.f52744i;
        long j5 = this.f52745j;
        int i4 = (((((((((((hashCode ^ hashCode2) * 1000003) ^ i3) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        PendingIntent pendingIntent = this.f52746k;
        int hashCode3 = (i4 ^ (pendingIntent == null ? 0 : pendingIntent.hashCode())) * 1000003;
        PendingIntent pendingIntent2 = this.f52747l;
        int hashCode4 = (hashCode3 ^ (pendingIntent2 == null ? 0 : pendingIntent2.hashCode())) * 1000003;
        PendingIntent pendingIntent3 = this.f52748m;
        int hashCode5 = (hashCode4 ^ (pendingIntent3 == null ? 0 : pendingIntent3.hashCode())) * 1000003;
        PendingIntent pendingIntent4 = this.n;
        if (pendingIntent4 != null) {
            i2 = pendingIntent4.hashCode();
        }
        return hashCode5 ^ i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.a.a
    public final long i() {
        return this.f52744i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.a.a
    public final long j() {
        return this.f52745j;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.a.a
    public final PendingIntent k() {
        return this.f52746k;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.a.a
    public final PendingIntent l() {
        return this.f52747l;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.a.a
    public final PendingIntent m() {
        return this.f52748m;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.a.a
    public final PendingIntent n() {
        return this.n;
    }

    public final String toString() {
        String str = this.f52736a;
        int i2 = this.f52737b;
        int i3 = this.f52738c;
        int i4 = this.f52739d;
        String valueOf = String.valueOf(this.f52740e);
        int i5 = this.f52741f;
        long j2 = this.f52742g;
        long j3 = this.f52743h;
        long j4 = this.f52744i;
        long j5 = this.f52745j;
        String valueOf2 = String.valueOf(this.f52746k);
        String valueOf3 = String.valueOf(this.f52747l);
        String valueOf4 = String.valueOf(this.f52748m);
        String valueOf5 = String.valueOf(this.n);
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        int length4 = String.valueOf(valueOf3).length();
        StringBuilder sb = new StringBuilder(length + 463 + length2 + length3 + length4 + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length());
        sb.append("AppUpdateInfo{packageName=");
        sb.append(str);
        sb.append(", availableVersionCode=");
        sb.append(i2);
        sb.append(", updateAvailability=");
        sb.append(i3);
        sb.append(", installStatus=");
        sb.append(i4);
        sb.append(", clientVersionStalenessDays=");
        sb.append(valueOf);
        sb.append(", updatePriority=");
        sb.append(i5);
        sb.append(", bytesDownloaded=");
        sb.append(j2);
        sb.append(", totalBytesToDownload=");
        sb.append(j3);
        sb.append(", additionalSpaceRequired=");
        sb.append(j4);
        sb.append(", assetPackStorageSize=");
        sb.append(j5);
        sb.append(", immediateUpdateIntent=");
        sb.append(valueOf2);
        sb.append(", flexibleUpdateIntent=");
        sb.append(valueOf3);
        sb.append(", immediateDestructiveUpdateIntent=");
        sb.append(valueOf4);
        sb.append(", flexibleDestructiveUpdateIntent=");
        sb.append(valueOf5);
        sb.append("}");
        return sb.toString();
    }
}
