package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class LineProfile implements Parcelable {
    public static final Parcelable.Creator<LineProfile> CREATOR = new Parcelable.Creator<LineProfile>() {
        /* class com.linecorp.linesdk.LineProfile.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34506);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineProfile[] newArray(int i2) {
            return new LineProfile[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineProfile createFromParcel(Parcel parcel) {
            return new LineProfile(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f54934a;

    /* renamed from: b  reason: collision with root package name */
    public final String f54935b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f54936c;

    /* renamed from: d  reason: collision with root package name */
    public final String f54937d;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34505);
    }

    public int hashCode() {
        int i2;
        int hashCode = ((this.f54934a.hashCode() * 31) + this.f54935b.hashCode()) * 31;
        Uri uri = this.f54936c;
        int i3 = 0;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        String str = this.f54937d;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        return "LineProfile{displayName='" + this.f54935b + '\'' + ", userId='" + this.f54934a + '\'' + ", pictureUrl='" + this.f54936c + '\'' + ", statusMessage='" + this.f54937d + '\'' + '}';
    }

    private LineProfile(Parcel parcel) {
        this.f54934a = parcel.readString();
        this.f54935b = parcel.readString();
        this.f54936c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f54937d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineProfile lineProfile = (LineProfile) obj;
            if (!this.f54934a.equals(lineProfile.f54934a) || !this.f54935b.equals(lineProfile.f54935b)) {
                return false;
            }
            Uri uri = this.f54936c;
            if (uri == null ? lineProfile.f54936c != null : !uri.equals(lineProfile.f54936c)) {
                return false;
            }
            String str = this.f54937d;
            String str2 = lineProfile.f54937d;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ LineProfile(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f54934a);
        parcel.writeString(this.f54935b);
        parcel.writeParcelable(this.f54936c, i2);
        parcel.writeString(this.f54937d);
    }

    public LineProfile(String str, String str2, Uri uri, String str3) {
        this.f54934a = str;
        this.f54935b = str2;
        this.f54936c = uri;
        this.f54937d = str3;
    }
}
