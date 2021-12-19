package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CredentialRequest> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f49732a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f49733b;

    /* renamed from: c  reason: collision with root package name */
    public final CredentialPickerConfig f49734c;

    /* renamed from: d  reason: collision with root package name */
    public final CredentialPickerConfig f49735d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f49736e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49737f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49738g;

    /* renamed from: h  reason: collision with root package name */
    private final int f49739h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f49740i;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f49741a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f49742b;

        /* renamed from: c  reason: collision with root package name */
        CredentialPickerConfig f49743c;

        /* renamed from: d  reason: collision with root package name */
        CredentialPickerConfig f49744d;

        /* renamed from: e  reason: collision with root package name */
        boolean f49745e;

        /* renamed from: f  reason: collision with root package name */
        String f49746f;

        /* renamed from: g  reason: collision with root package name */
        String f49747g;

        static {
            Covode.recordClassIndex(31062);
        }
    }

    static {
        Covode.recordClassIndex(31061);
    }

    private CredentialRequest(a aVar) {
        this(4, aVar.f49741a, aVar.f49742b, aVar.f49743c, aVar.f49744d, aVar.f49745e, aVar.f49746f, aVar.f49747g, false);
    }

    public /* synthetic */ CredentialRequest(a aVar, byte b2) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49732a);
        b.a(parcel, 2, this.f49733b);
        b.a(parcel, 3, this.f49734c, i2);
        b.a(parcel, 4, this.f49735d, i2);
        b.a(parcel, 5, this.f49736e);
        b.a(parcel, 6, this.f49737f);
        b.a(parcel, 7, this.f49738g);
        b.a(parcel, 8, this.f49740i);
        b.b(parcel, 1000, this.f49739h);
        b.b(parcel, a2);
    }

    CredentialRequest(int i2, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f49739h = i2;
        this.f49732a = z;
        this.f49733b = (String[]) r.a(strArr);
        this.f49734c = credentialPickerConfig == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig;
        this.f49735d = credentialPickerConfig2 == null ? new CredentialPickerConfig.a().a() : credentialPickerConfig2;
        if (i2 < 3) {
            this.f49736e = true;
            this.f49737f = null;
            this.f49738g = null;
        } else {
            this.f49736e = z2;
            this.f49737f = str;
            this.f49738g = str2;
        }
        this.f49740i = z3;
    }
}
