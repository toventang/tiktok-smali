package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public class Album implements Parcelable {
    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() {
        /* class com.zhihu.matisse.internal.entity.Album.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103884);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Album[] newArray(int i2) {
            return new Album[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Album createFromParcel(Parcel parcel) {
            return new Album(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final String f156416a = "-1";

    /* renamed from: b  reason: collision with root package name */
    public final String f156417b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f156418c;

    /* renamed from: d  reason: collision with root package name */
    public long f156419d;

    /* renamed from: e  reason: collision with root package name */
    private final String f156420e;

    public int describeContents() {
        return 0;
    }

    public final void a() {
        this.f156419d++;
    }

    public final boolean b() {
        return f156416a.equals(this.f156417b);
    }

    public final boolean c() {
        if (this.f156419d == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(103883);
    }

    public final String a(Context context) {
        if (b()) {
            return context.getString(R.string.d2c);
        }
        return this.f156420e;
    }

    private Album(Parcel parcel) {
        this.f156417b = parcel.readString();
        this.f156418c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f156420e = parcel.readString();
        this.f156419d = parcel.readLong();
    }

    public static Album a(Cursor cursor) {
        return new Album(cursor.getString(cursor.getColumnIndex("bucket_id")), Uri.parse(cursor.getString(cursor.getColumnIndex("uri"))), cursor.getString(cursor.getColumnIndex("bucket_display_name")), cursor.getLong(cursor.getColumnIndex("count")));
    }

    /* synthetic */ Album(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f156417b);
        parcel.writeParcelable(this.f156418c, 0);
        parcel.writeString(this.f156420e);
        parcel.writeLong(this.f156419d);
    }

    private Album(String str, Uri uri, String str2, long j2) {
        this.f156417b = str;
        this.f156418c = uri;
        this.f156420e = str2;
        this.f156419d = j2;
    }
}
