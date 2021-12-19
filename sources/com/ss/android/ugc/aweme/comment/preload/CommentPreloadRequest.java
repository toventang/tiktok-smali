package com.ss.android.ugc.aweme.comment.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;

public class CommentPreloadRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        /* class com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest.AnonymousClass1 */

        static {
            Covode.recordClassIndex(44610);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
            return new CommentPreloadRequest[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CommentPreloadRequest(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f72332a;

    /* renamed from: b  reason: collision with root package name */
    public final long f72333b;

    /* renamed from: c  reason: collision with root package name */
    public final int f72334c;

    /* renamed from: d  reason: collision with root package name */
    public final String f72335d;

    /* renamed from: e  reason: collision with root package name */
    public final int f72336e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f72337f;

    /* renamed from: g  reason: collision with root package name */
    public final int f72338g;

    /* renamed from: h  reason: collision with root package name */
    public final String f72339h;

    /* renamed from: i  reason: collision with root package name */
    public final int f72340i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f72341j;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(44609);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f72342a;

        /* renamed from: b  reason: collision with root package name */
        public long f72343b;

        /* renamed from: c  reason: collision with root package name */
        public int f72344c;

        /* renamed from: d  reason: collision with root package name */
        public String f72345d;

        /* renamed from: e  reason: collision with root package name */
        public int f72346e;

        /* renamed from: f  reason: collision with root package name */
        public Long f72347f;

        /* renamed from: g  reason: collision with root package name */
        public int f72348g;

        /* renamed from: h  reason: collision with root package name */
        public String f72349h;

        /* renamed from: i  reason: collision with root package name */
        public int f72350i;

        /* renamed from: j  reason: collision with root package name */
        public Object f72351j;

        static {
            Covode.recordClassIndex(44611);
        }

        public a(String str) {
            this.f72342a = str;
        }
    }

    private CommentPreloadRequest(a aVar) {
        this.f72332a = aVar.f72342a;
        this.f72333b = aVar.f72343b;
        this.f72334c = aVar.f72344c;
        this.f72335d = aVar.f72345d;
        this.f72336e = aVar.f72346e;
        this.f72337f = aVar.f72347f;
        this.f72338g = aVar.f72348g;
        this.f72339h = aVar.f72349h;
        this.f72340i = aVar.f72350i;
        this.f72341j = aVar.f72351j;
    }

    public CommentPreloadRequest(Parcel parcel) {
        this.f72332a = parcel.readString();
        this.f72333b = parcel.readLong();
        this.f72334c = parcel.readInt();
        this.f72335d = parcel.readString();
        this.f72336e = parcel.readInt();
        this.f72337f = Long.valueOf(parcel.readLong());
        this.f72338g = parcel.readInt();
        this.f72339h = parcel.readString();
        this.f72340i = parcel.readInt();
        this.f72341j = new f().a(parcel.readString(), Object.class);
    }

    public /* synthetic */ CommentPreloadRequest(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f72332a);
        parcel.writeLong(this.f72333b);
        parcel.writeInt(this.f72334c);
        parcel.writeString(this.f72335d);
        parcel.writeInt(this.f72336e);
        parcel.writeLong(this.f72337f.longValue());
        parcel.writeInt(this.f72338g);
        parcel.writeString(this.f72339h);
        parcel.writeInt(this.f72340i);
        parcel.writeString(new f().b(this.f72341j));
    }
}
