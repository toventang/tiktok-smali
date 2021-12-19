package com.bytedance.lobby.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.c;

public final class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new Parcelable.Creator<AuthResult>() {
        /* class com.bytedance.lobby.auth.AuthResult.AnonymousClass1 */

        static {
            Covode.recordClassIndex(24751);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthResult[] newArray(int i2) {
            return new AuthResult[0];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthResult createFromParcel(Parcel parcel) {
            return new AuthResult(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public boolean f40147a;

    /* renamed from: b  reason: collision with root package name */
    public transient boolean f40148b;

    /* renamed from: c  reason: collision with root package name */
    public c f40149c;

    /* renamed from: d  reason: collision with root package name */
    public String f40150d;

    /* renamed from: e  reason: collision with root package name */
    public String f40151e;

    /* renamed from: f  reason: collision with root package name */
    public String f40152f;

    /* renamed from: g  reason: collision with root package name */
    public String f40153g;

    /* renamed from: h  reason: collision with root package name */
    public long f40154h;

    /* renamed from: i  reason: collision with root package name */
    public int f40155i;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f40156j;

    public final int describeContents() {
        return 0;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f40157a;

        /* renamed from: b  reason: collision with root package name */
        public c f40158b;

        /* renamed from: c  reason: collision with root package name */
        public String f40159c;

        /* renamed from: d  reason: collision with root package name */
        public String f40160d = "";

        /* renamed from: e  reason: collision with root package name */
        public String f40161e = "";

        /* renamed from: f  reason: collision with root package name */
        public String f40162f = "";

        /* renamed from: g  reason: collision with root package name */
        public long f40163g;

        /* renamed from: h  reason: collision with root package name */
        public int f40164h;

        /* renamed from: i  reason: collision with root package name */
        public Bundle f40165i;

        static {
            Covode.recordClassIndex(24752);
        }

        public final AuthResult a() {
            return new AuthResult(this, (byte) 0);
        }

        public a(String str, int i2) {
            this.f40159c = str;
            this.f40164h = i2;
        }
    }

    public final String toString() {
        return super.toString();
    }

    static {
        Covode.recordClassIndex(24750);
    }

    private AuthResult(Parcel parcel) {
        this.f40150d = "";
        this.f40151e = "";
        this.f40152f = "";
        this.f40153g = "";
        boolean z = parcel.readInt() != 1 ? false : true;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        a aVar = new a(readString, readInt);
        aVar.f40157a = z;
        aVar.f40158b = (c) parcel.readSerializable();
        aVar.f40160d = readString2;
        aVar.f40161e = readString3;
        aVar.f40162f = readString4;
        aVar.f40163g = readLong;
        aVar.f40165i = readBundle;
        aVar.a();
    }

    private AuthResult(a aVar) {
        Bundle bundle;
        this.f40150d = "";
        this.f40151e = "";
        this.f40152f = "";
        this.f40153g = "";
        boolean z = aVar.f40157a;
        this.f40147a = z;
        boolean z2 = true;
        if (!z) {
            if (aVar.f40158b == null) {
                this.f40149c = new c(1, "Auth is unsuccessful with no Error Cause");
            } else {
                this.f40149c = aVar.f40158b;
            }
        }
        c cVar = this.f40149c;
        if (cVar == null || (!cVar.isCancelled() && this.f40149c.getErrorCode() != 4)) {
            z2 = false;
        }
        this.f40148b = z2;
        this.f40150d = aVar.f40159c;
        this.f40151e = aVar.f40160d;
        this.f40152f = aVar.f40161e;
        this.f40153g = aVar.f40162f;
        this.f40154h = aVar.f40163g;
        this.f40155i = aVar.f40164h;
        if (aVar.f40165i == null) {
            bundle = new Bundle();
        } else {
            bundle = aVar.f40165i;
        }
        this.f40156j = bundle;
    }

    /* synthetic */ AuthResult(Parcel parcel, byte b2) {
        this(parcel);
    }

    /* synthetic */ AuthResult(a aVar, byte b2) {
        this(aVar);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f40147a ? 1 : 0);
        parcel.writeSerializable(this.f40149c);
        parcel.writeString(this.f40150d);
        parcel.writeString(this.f40153g);
        parcel.writeString(this.f40151e);
        parcel.writeString(this.f40152f);
        parcel.writeLong(this.f40154h);
        parcel.writeInt(this.f40155i);
        parcel.writeBundle(this.f40156j);
    }
}
