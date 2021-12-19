package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends a> implements ShareModel {

    /* renamed from: h  reason: collision with root package name */
    public final Uri f49097h;

    /* renamed from: i  reason: collision with root package name */
    public final List<String> f49098i;

    /* renamed from: j  reason: collision with root package name */
    public final String f49099j;

    /* renamed from: k  reason: collision with root package name */
    public final String f49100k;

    /* renamed from: l  reason: collision with root package name */
    public final String f49101l;

    /* renamed from: m  reason: collision with root package name */
    public final ShareHashtag f49102m;

    static {
        Covode.recordClassIndex(30700);
    }

    public int describeContents() {
        return 0;
    }

    protected ShareContent(a aVar) {
        this.f49097h = aVar.f49103a;
        this.f49098i = aVar.f49104b;
        this.f49099j = aVar.f49105c;
        this.f49100k = aVar.f49106d;
        this.f49101l = aVar.f49107e;
        this.f49102m = aVar.f49108f;
    }

    public static abstract class a<P extends ShareContent, E extends a> {

        /* renamed from: a  reason: collision with root package name */
        public Uri f49103a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f49104b;

        /* renamed from: c  reason: collision with root package name */
        public String f49105c;

        /* renamed from: d  reason: collision with root package name */
        public String f49106d;

        /* renamed from: e  reason: collision with root package name */
        public String f49107e;

        /* renamed from: f  reason: collision with root package name */
        public ShareHashtag f49108f;

        static {
            Covode.recordClassIndex(30701);
        }

        public E a(P p) {
            List<String> unmodifiableList;
            if (p == null) {
                return this;
            }
            this.f49103a = p.f49097h;
            List<String> list = p.f49098i;
            if (list == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.f49104b = unmodifiableList;
            this.f49105c = p.f49099j;
            this.f49106d = p.f49100k;
            this.f49107e = p.f49101l;
            this.f49108f = p.f49102m;
            return this;
        }
    }

    public ShareContent(Parcel parcel) {
        List<String> unmodifiableList;
        this.f49097h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            unmodifiableList = null;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f49098i = unmodifiableList;
        this.f49099j = parcel.readString();
        this.f49100k = parcel.readString();
        this.f49101l = parcel.readString();
        ShareHashtag.a aVar = new ShareHashtag.a();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            aVar.f49110a = shareHashtag.f49109a;
        }
        this.f49102m = new ShareHashtag(aVar, (byte) 0);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f49097h, 0);
        parcel.writeStringList(this.f49098i);
        parcel.writeString(this.f49099j);
        parcel.writeString(this.f49100k);
        parcel.writeString(this.f49101l);
        parcel.writeParcelable(this.f49102m, 0);
    }
}
