package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;

public class LineApiError implements Parcelable {
    public static final Parcelable.Creator<LineApiError> CREATOR = new Parcelable.Creator<LineApiError>() {
        /* class com.linecorp.linesdk.LineApiError.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34502);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineApiError[] newArray(int i2) {
            return new LineApiError[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineApiError createFromParcel(Parcel parcel) {
            return new LineApiError(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final LineApiError f54929a = new LineApiError(-1, "");

    /* renamed from: b  reason: collision with root package name */
    public final int f54930b;

    /* renamed from: c  reason: collision with root package name */
    public final String f54931c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i2;
        int i3 = this.f54930b * 31;
        String str = this.f54931c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return i3 + i2;
    }

    static {
        Covode.recordClassIndex(34501);
    }

    public String toString() {
        return "LineApiError{httpResponseCode=" + this.f54930b + ", message='" + this.f54931c + '\'' + '}';
    }

    private LineApiError(Parcel parcel) {
        this.f54930b = parcel.readInt();
        this.f54931c = parcel.readString();
    }

    private static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public LineApiError(Exception exc) {
        this(-1, a(exc));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LineApiError lineApiError = (LineApiError) obj;
            if (this.f54930b != lineApiError.f54930b) {
                return false;
            }
            String str = this.f54931c;
            String str2 = lineApiError.f54931c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public LineApiError(String str) {
        this(-1, str);
    }

    /* synthetic */ LineApiError(Parcel parcel, byte b2) {
        this(parcel);
    }

    public LineApiError(int i2, Exception exc) {
        this(i2, a(exc));
    }

    public LineApiError(int i2, String str) {
        this.f54930b = i2;
        this.f54931c = str;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f54930b);
        parcel.writeString(this.f54931c);
    }
}
