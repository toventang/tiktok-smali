package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    /* renamed from: a  reason: collision with root package name */
    private final int f50458a;

    /* renamed from: b  reason: collision with root package name */
    private final long f50459b;

    /* renamed from: c  reason: collision with root package name */
    private int f50460c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50461d;

    /* renamed from: e  reason: collision with root package name */
    private final String f50462e;

    /* renamed from: f  reason: collision with root package name */
    private final String f50463f;

    /* renamed from: g  reason: collision with root package name */
    private final int f50464g;

    /* renamed from: h  reason: collision with root package name */
    private final List<String> f50465h;

    /* renamed from: i  reason: collision with root package name */
    private final String f50466i;

    /* renamed from: j  reason: collision with root package name */
    private final long f50467j;

    /* renamed from: k  reason: collision with root package name */
    private int f50468k;

    /* renamed from: l  reason: collision with root package name */
    private final String f50469l;

    /* renamed from: m  reason: collision with root package name */
    private final float f50470m;
    private final long n;
    private final boolean o;
    private long p;

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long a() {
        return this.f50459b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int b() {
        return this.f50460c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long c() {
        return this.p;
    }

    static {
        Covode.recordClassIndex(31450);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String d() {
        String join;
        String str = this.f50461d;
        int i2 = this.f50464g;
        List<String> list = this.f50465h;
        String str2 = "";
        if (list == null) {
            join = str2;
        } else {
            join = TextUtils.join(",", list);
        }
        int i3 = this.f50468k;
        String str3 = this.f50462e;
        if (str3 == null) {
            str3 = str2;
        }
        String str4 = this.f50469l;
        if (str4 == null) {
            str4 = str2;
        }
        float f2 = this.f50470m;
        String str5 = this.f50463f;
        if (str5 != null) {
            str2 = str5;
        }
        return new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(join).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str2).length()).append("\t").append(str).append("\t").append(i2).append("\t").append(join).append("\t").append(i3).append("\t").append(str3).append("\t").append(str4).append("\t").append(f2).append("\t").append(str2).append("\t").append(this.o).toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f50458a);
        b.a(parcel, 2, a());
        b.a(parcel, 4, this.f50461d);
        b.b(parcel, 5, this.f50464g);
        b.a(parcel, 6, this.f50465h);
        b.a(parcel, 8, this.f50467j);
        b.a(parcel, 10, this.f50462e);
        b.b(parcel, 11, b());
        b.a(parcel, 12, this.f50466i);
        b.a(parcel, 13, this.f50469l);
        b.b(parcel, 14, this.f50468k);
        float f2 = this.f50470m;
        b.a(parcel, 15, 4);
        parcel.writeFloat(f2);
        b.a(parcel, 16, this.n);
        b.a(parcel, 17, this.f50463f);
        b.a(parcel, 18, this.o);
        b.b(parcel, a2);
    }

    public WakeLockEvent(long j2, int i2, String str, int i3, List<String> list, String str2, long j3, int i4, String str3, String str4, float f2, long j4, String str5) {
        this(2, j2, i2, str, i3, list, str2, j3, i4, str3, str4, f2, j4, null, false);
    }

    WakeLockEvent(int i2, long j2, int i3, String str, int i4, List<String> list, String str2, long j3, int i5, String str3, String str4, float f2, long j4, String str5, boolean z) {
        this.f50458a = i2;
        this.f50459b = j2;
        this.f50460c = i3;
        this.f50461d = str;
        this.f50462e = str3;
        this.f50463f = str5;
        this.f50464g = i4;
        this.p = -1;
        this.f50465h = list;
        this.f50466i = str2;
        this.f50467j = j3;
        this.f50468k = i5;
        this.f50469l = str4;
        this.f50470m = f2;
        this.n = j4;
        this.o = z;
    }
}
