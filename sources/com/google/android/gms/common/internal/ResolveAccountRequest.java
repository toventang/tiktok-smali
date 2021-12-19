package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ResolveAccountRequest> CREATOR = new ac();

    /* renamed from: a  reason: collision with root package name */
    public final Account f50319a;

    /* renamed from: b  reason: collision with root package name */
    public final int f50320b;

    /* renamed from: c  reason: collision with root package name */
    public final GoogleSignInAccount f50321c;

    /* renamed from: d  reason: collision with root package name */
    private final int f50322d;

    static {
        Covode.recordClassIndex(31362);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.b(parcel, 1, this.f50322d);
        b.a(parcel, 2, this.f50319a, i2);
        b.b(parcel, 3, this.f50320b);
        b.a(parcel, 4, this.f50321c, i2);
        b.b(parcel, a2);
    }

    public ResolveAccountRequest(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i2, googleSignInAccount);
    }

    ResolveAccountRequest(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.f50322d = i2;
        this.f50319a = account;
        this.f50320b = i3;
        this.f50321c = googleSignInAccount;
    }
}
