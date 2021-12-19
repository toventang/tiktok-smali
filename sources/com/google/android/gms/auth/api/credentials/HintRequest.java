package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<HintRequest> CREATOR = new i();

    /* renamed from: a  reason: collision with root package name */
    public final CredentialPickerConfig f49748a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f49749b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f49750c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f49751d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49752e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49753f;

    /* renamed from: g  reason: collision with root package name */
    private final int f49754g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49755h;

    static {
        Covode.recordClassIndex(31063);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f49756a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f49757b;

        /* renamed from: c  reason: collision with root package name */
        String[] f49758c;

        /* renamed from: d  reason: collision with root package name */
        CredentialPickerConfig f49759d = new CredentialPickerConfig.a().a();

        /* renamed from: e  reason: collision with root package name */
        boolean f49760e = false;

        /* renamed from: f  reason: collision with root package name */
        String f49761f;

        /* renamed from: g  reason: collision with root package name */
        String f49762g;

        static {
            Covode.recordClassIndex(31064);
        }

        public final HintRequest a() {
            if (this.f49758c == null) {
                this.f49758c = new String[0];
            }
            if (this.f49756a || this.f49757b || this.f49758c.length != 0) {
                return new HintRequest(this, (byte) 0);
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }

        public final a a(CredentialPickerConfig credentialPickerConfig) {
            this.f49759d = (CredentialPickerConfig) r.a(credentialPickerConfig);
            return this;
        }
    }

    private HintRequest(a aVar) {
        this(2, aVar.f49759d, aVar.f49756a, aVar.f49757b, aVar.f49758c, aVar.f49760e, aVar.f49761f, aVar.f49762g);
    }

    /* synthetic */ HintRequest(a aVar, byte b2) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        b.a(parcel, 1, this.f49748a, i2);
        b.a(parcel, 2, this.f49749b);
        b.a(parcel, 3, this.f49755h);
        b.a(parcel, 4, this.f49750c);
        b.a(parcel, 5, this.f49751d);
        b.a(parcel, 6, this.f49752e);
        b.a(parcel, 7, this.f49753f);
        b.b(parcel, 1000, this.f49754g);
        b.b(parcel, a2);
    }

    HintRequest(int i2, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f49754g = i2;
        this.f49748a = (CredentialPickerConfig) r.a(credentialPickerConfig);
        this.f49749b = z;
        this.f49755h = z2;
        this.f49750c = (String[]) r.a(strArr);
        if (i2 < 2) {
            this.f49751d = true;
            this.f49752e = null;
            this.f49753f = null;
            return;
        }
        this.f49751d = z3;
        this.f49752e = str;
        this.f49753f = str2;
    }
}
