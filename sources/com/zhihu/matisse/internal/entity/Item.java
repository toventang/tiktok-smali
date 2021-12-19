package com.zhihu.matisse.internal.entity;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.b;

public class Item implements Parcelable {
    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        /* class com.zhihu.matisse.internal.entity.Item.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103886);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Item[] newArray(int i2) {
            return new Item[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Item createFromParcel(Parcel parcel) {
            return new Item(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f156421a;

    /* renamed from: b  reason: collision with root package name */
    public final String f156422b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f156423c;

    /* renamed from: d  reason: collision with root package name */
    public final long f156424d;

    /* renamed from: e  reason: collision with root package name */
    public final long f156425e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103885);
    }

    public final boolean b() {
        String str = this.f156422b;
        if (str == null) {
            return false;
        }
        return str.equals(b.GIF.toString());
    }

    public int hashCode() {
        int hashCode = Long.valueOf(this.f156421a).hashCode() + 31;
        String str = this.f156422b;
        if (str != null) {
            hashCode = (hashCode * 31) + str.hashCode();
        }
        return (((((hashCode * 31) + this.f156423c.hashCode()) * 31) + Long.valueOf(this.f156424d).hashCode()) * 31) + Long.valueOf(this.f156425e).hashCode();
    }

    public final boolean a() {
        String str = this.f156422b;
        if (str == null) {
            return false;
        }
        if (str.equals(b.JPEG.toString()) || this.f156422b.equals(b.PNG.toString()) || this.f156422b.equals(b.GIF.toString()) || this.f156422b.equals(b.BMP.toString()) || this.f156422b.equals(b.WEBP.toString())) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        String str = this.f156422b;
        if (str == null) {
            return false;
        }
        if (str.equals(b.MPEG.toString()) || this.f156422b.equals(b.MP4.toString()) || this.f156422b.equals(b.QUICKTIME.toString()) || this.f156422b.equals(b.THREEGPP.toString()) || this.f156422b.equals(b.THREEGPP2.toString()) || this.f156422b.equals(b.MKV.toString()) || this.f156422b.equals(b.WEBM.toString()) || this.f156422b.equals(b.TS.toString()) || this.f156422b.equals(b.AVI.toString())) {
            return true;
        }
        return false;
    }

    public static Item a(Cursor cursor) {
        return new Item(cursor.getLong(cursor.getColumnIndex("_id")), cursor.getString(cursor.getColumnIndex("mime_type")), cursor.getLong(cursor.getColumnIndex("_size")), cursor.getLong(cursor.getColumnIndex("duration")));
    }

    private Item(Parcel parcel) {
        this.f156421a = parcel.readLong();
        this.f156422b = parcel.readString();
        this.f156423c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f156424d = parcel.readLong();
        this.f156425e = parcel.readLong();
    }

    public boolean equals(Object obj) {
        String str;
        Uri uri;
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (this.f156421a != item.f156421a || ((((str = this.f156422b) == null || !str.equals(item.f156422b)) && (this.f156422b != null || item.f156422b != null)) || ((((uri = this.f156423c) == null || !uri.equals(item.f156423c)) && (this.f156423c != null || item.f156423c != null)) || this.f156424d != item.f156424d || this.f156425e != item.f156425e))) {
            return false;
        }
        return true;
    }

    /* synthetic */ Item(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f156421a);
        parcel.writeString(this.f156422b);
        parcel.writeParcelable(this.f156423c, 0);
        parcel.writeLong(this.f156424d);
        parcel.writeLong(this.f156425e);
    }

    private Item(long j2, String str, long j3, long j4) {
        Uri contentUri;
        this.f156421a = j2;
        this.f156422b = str;
        if (a()) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (c()) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        this.f156423c = ContentUris.withAppendedId(contentUri, j2);
        this.f156424d = j3;
        this.f156425e = j4;
    }
}
