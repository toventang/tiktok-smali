package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.b;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f49724a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f49725b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49726c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f49727d;

    /* renamed from: e  reason: collision with root package name */
    private final int f49728e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f49729a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f49730b = true;

        /* renamed from: c  reason: collision with root package name */
        int f49731c = 1;

        static {
            Covode.recordClassIndex(31060);
        }

        public final CredentialPickerConfig a() {
            return new CredentialPickerConfig(this, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(31059);
    }

    private CredentialPickerConfig(a aVar) {
        this(2, aVar.f49729a, aVar.f49730b, false, aVar.f49731c);
    }

    /* synthetic */ CredentialPickerConfig(a aVar, byte b2) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = b.a(parcel, 20293);
        boolean z = true;
        b.a(parcel, 1, this.f49724a);
        b.a(parcel, 2, this.f49725b);
        if (this.f49728e != 3) {
            z = false;
        }
        b.a(parcel, 3, z);
        b.b(parcel, 4, this.f49728e);
        b.b(parcel, 1000, this.f49726c);
        b.b(parcel, a2);
    }

    CredentialPickerConfig(int i2, boolean z, boolean z2, boolean z3, int i3) {
        this.f49726c = i2;
        this.f49724a = z;
        this.f49725b = z2;
        boolean z4 = true;
        int i4 = 1;
        if (i2 < 2) {
            this.f49727d = z3;
            this.f49728e = z3 ? 3 : i4;
            return;
        }
        this.f49727d = i3 != 3 ? false : z4;
        this.f49728e = i3;
    }
}
