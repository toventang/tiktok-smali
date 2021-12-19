package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new af();

    /* renamed from: a  reason: collision with root package name */
    String f50307a;

    /* renamed from: b  reason: collision with root package name */
    IBinder f50308b;

    /* renamed from: c  reason: collision with root package name */
    Scope[] f50309c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f50310d;

    /* renamed from: e  reason: collision with root package name */
    Account f50311e;

    /* renamed from: f  reason: collision with root package name */
    Feature[] f50312f;

    /* renamed from: g  reason: collision with root package name */
    Feature[] f50313g;

    /* renamed from: h  reason: collision with root package name */
    private final int f50314h;

    /* renamed from: i  reason: collision with root package name */
    private final int f50315i;

    /* renamed from: j  reason: collision with root package name */
    private int f50316j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f50317k;

    /* renamed from: l  reason: collision with root package name */
    private int f50318l;

    static {
        Covode.recordClassIndex(31360);
    }

    public GetServiceRequest(int i2) {
        this.f50314h = 4;
        this.f50316j = c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.f50315i = i2;
        this.f50317k = true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f50314h);
        b.b(parcel, 2, this.f50315i);
        b.b(parcel, 3, this.f50316j);
        b.a(parcel, 4, this.f50307a);
        b.a(parcel, 5, this.f50308b);
        b.a(parcel, 6, this.f50309c, i2);
        b.a(parcel, 7, this.f50310d);
        b.a(parcel, 8, this.f50311e, i2);
        b.a(parcel, 10, this.f50312f, i2);
        b.a(parcel, 11, this.f50313g, i2);
        b.a(parcel, 12, this.f50317k);
        b.b(parcel, 13, this.f50318l);
        b.b(parcel, a2);
    }

    GetServiceRequest(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i5) {
        this.f50314h = i2;
        this.f50315i = i3;
        this.f50316j = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f50307a = "com.google.android.gms";
        } else {
            this.f50307a = str;
        }
        if (i2 < 2) {
            this.f50311e = iBinder != null ? a.a(l.a.a(iBinder)) : null;
        } else {
            this.f50308b = iBinder;
            this.f50311e = account;
        }
        this.f50309c = scopeArr;
        this.f50310d = bundle;
        this.f50312f = featureArr;
        this.f50313g = featureArr2;
        this.f50317k = z;
        this.f50318l = i5;
    }
}
