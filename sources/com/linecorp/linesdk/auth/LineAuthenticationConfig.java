package com.linecorp.linesdk.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class LineAuthenticationConfig implements Parcelable {
    public static final Parcelable.Creator<LineAuthenticationConfig> CREATOR = new Parcelable.Creator<LineAuthenticationConfig>() {
        /* class com.linecorp.linesdk.auth.LineAuthenticationConfig.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34531);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineAuthenticationConfig[] newArray(int i2) {
            return new LineAuthenticationConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineAuthenticationConfig createFromParcel(Parcel parcel) {
            return new LineAuthenticationConfig(parcel, (byte) 0);
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private static int f54984f = 1;

    /* renamed from: g  reason: collision with root package name */
    private static int f54985g = 2;

    /* renamed from: a  reason: collision with root package name */
    public final String f54986a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f54987b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f54988c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f54989d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f54990e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34530);
    }

    public int hashCode() {
        return (((((((this.f54986a.hashCode() * 31) + this.f54987b.hashCode()) * 31) + this.f54988c.hashCode()) * 31) + (this.f54989d ? 1 : 0)) * 31) + (this.f54990e ? 1 : 0);
    }

    public String toString() {
        return "LineAuthenticationConfig{channelId=" + this.f54986a + ", endPointBaseUrl=" + this.f54987b + ", webLoginPageUrl=" + this.f54988c + ", isLineAppAuthenticationDisabled=" + this.f54989d + ", isEncryptorPreparationDisabled=" + this.f54990e + '}';
    }

    private LineAuthenticationConfig(a aVar) {
        this.f54986a = aVar.f54991a;
        this.f54987b = aVar.f54992b;
        this.f54988c = aVar.f54993c;
        this.f54989d = aVar.f54994d;
        this.f54990e = aVar.f54995e;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f54991a;

        /* renamed from: b  reason: collision with root package name */
        public Uri f54992b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f54993c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f54994d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f54995e;

        static {
            Covode.recordClassIndex(34532);
        }

        public a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f54991a = str;
                this.f54992b = Uri.parse("https://access.line.me/v2");
                this.f54993c = Uri.parse("https://access.line.me/dialog/oauth/weblogin");
                return;
            }
            throw new IllegalArgumentException("channelId is empty.");
        }
    }

    private LineAuthenticationConfig(Parcel parcel) {
        boolean z;
        this.f54986a = parcel.readString();
        this.f54987b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f54988c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        boolean z2 = true;
        if ((f54984f & readInt) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f54989d = z;
        this.f54990e = (readInt & f54985g) <= 0 ? false : z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.f54989d == lineAuthenticationConfig.f54989d && this.f54990e == lineAuthenticationConfig.f54990e && this.f54986a.equals(lineAuthenticationConfig.f54986a) && this.f54987b.equals(lineAuthenticationConfig.f54987b)) {
            return this.f54988c.equals(lineAuthenticationConfig.f54988c);
        }
        return false;
    }

    /* synthetic */ LineAuthenticationConfig(Parcel parcel, byte b2) {
        this(parcel);
    }

    public /* synthetic */ LineAuthenticationConfig(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        parcel.writeString(this.f54986a);
        parcel.writeParcelable(this.f54987b, i2);
        parcel.writeParcelable(this.f54988c, i2);
        int i4 = 0;
        if (this.f54989d) {
            i3 = f54984f;
        } else {
            i3 = 0;
        }
        int i5 = i3 | 0;
        if (this.f54990e) {
            i4 = f54985g;
        }
        parcel.writeInt(i5 | i4);
    }
}
