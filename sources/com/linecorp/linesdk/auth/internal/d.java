package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.a.f;

/* access modifiers changed from: package-private */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {
        /* class com.linecorp.linesdk.auth.internal.d.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34548);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i2) {
            return new d[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    f f55031a;

    /* renamed from: b  reason: collision with root package name */
    String f55032b;

    /* renamed from: c  reason: collision with root package name */
    String f55033c;

    /* renamed from: d  reason: collision with root package name */
    int f55034d;

    public final int describeContents() {
        return 0;
    }

    d() {
        this.f55034d = a.f55035a;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* access modifiers changed from: package-private */
    public static final class a extends Enum<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f55035a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f55036b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f55037c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f55038d = 4;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ int[] f55039e = {1, 2, 3, 4};

        public static int[] a() {
            return (int[]) f55039e.clone();
        }

        static {
            Covode.recordClassIndex(34549);
        }
    }

    static {
        Covode.recordClassIndex(34547);
    }

    private d(Parcel parcel) {
        f fVar;
        this.f55034d = a.f55035a;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        if (TextUtils.isEmpty(readString) || TextUtils.isEmpty(readString2)) {
            fVar = null;
        } else {
            fVar = new f(readString, readString2);
        }
        this.f55031a = fVar;
        this.f55032b = parcel.readString();
        this.f55034d = a.a()[parcel.readByte()];
        this.f55033c = parcel.readString();
    }

    /* synthetic */ d(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        String str;
        f fVar = this.f55031a;
        String str2 = null;
        if (fVar == null) {
            str = null;
        } else {
            str = fVar.f54979a;
        }
        parcel.writeString(str);
        f fVar2 = this.f55031a;
        if (fVar2 != null) {
            str2 = fVar2.f54980b;
        }
        parcel.writeString(str2);
        parcel.writeString(this.f55032b);
        parcel.writeByte((byte) (this.f55034d - 1));
        parcel.writeString(this.f55033c);
    }
}
