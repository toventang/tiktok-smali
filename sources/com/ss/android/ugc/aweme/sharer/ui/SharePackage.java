package com.ss.android.ugc.aweme.sharer.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.h;
import com.ss.android.ugc.aweme.sharer.k;
import f.a.n;
import f.a.o;
import f.a.q;
import h.f.b.l;
import h.z;

public class SharePackage implements Parcelable {
    public static final Parcelable.Creator<SharePackage> CREATOR = new c();

    /* renamed from: k  reason: collision with root package name */
    public static final b f124589k = new b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public final String f124590d;

    /* renamed from: e  reason: collision with root package name */
    public final String f124591e;

    /* renamed from: f  reason: collision with root package name */
    public final String f124592f;

    /* renamed from: g  reason: collision with root package name */
    public final String f124593g;

    /* renamed from: h  reason: collision with root package name */
    public final String f124594h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f124595i;

    /* renamed from: j  reason: collision with root package name */
    public final a f124596j;

    public boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context) {
        l.d(bVar, "");
        l.d(context, "");
        return false;
    }

    public boolean a(h hVar, Context context) {
        l.d(hVar, "");
        l.d(context, "");
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81876);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class c implements Parcelable.Creator<SharePackage> {
        static {
            Covode.recordClassIndex(81877);
        }

        c() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharePackage[] newArray(int i2) {
            return new SharePackage[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharePackage createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            a aVar = new a();
            l.d(parcel, "");
            aVar.f124597a = parcel.readString();
            aVar.f124598b = parcel.readString();
            aVar.f124599c = parcel.readString();
            aVar.f124600d = parcel.readString();
            aVar.f124601e = parcel.readString();
            aVar.f124602f.putAll(parcel.readBundle(aVar.getClass().getClassLoader()));
            return new SharePackage(aVar);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f124597a;

        /* renamed from: b  reason: collision with root package name */
        public String f124598b;

        /* renamed from: c  reason: collision with root package name */
        public String f124599c;

        /* renamed from: d  reason: collision with root package name */
        public String f124600d;

        /* renamed from: e  reason: collision with root package name */
        public String f124601e;

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f124602f = new Bundle();

        static {
            Covode.recordClassIndex(81875);
        }

        public final SharePackage a() {
            return new SharePackage(this);
        }

        public final a a(String str) {
            l.d(str, "");
            this.f124597a = str;
            return this;
        }

        public final a b(String str) {
            l.d(str, "");
            this.f124598b = str;
            return this;
        }

        public final a c(String str) {
            l.d(str, "");
            this.f124599c = str;
            return this;
        }

        public final a d(String str) {
            l.d(str, "");
            this.f124600d = str;
            return this;
        }

        public final a e(String str) {
            l.d(str, "");
            this.f124601e = str;
            return this;
        }

        public final a a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f124602f.putString(str, str2);
            return this;
        }
    }

    static {
        Covode.recordClassIndex(81874);
    }

    public h a(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        return new k(this.f124594h, null, null, 6);
    }

    static final class d<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SharePackage f124603a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.sharer.b f124604b;

        static {
            Covode.recordClassIndex(81878);
        }

        d(SharePackage sharePackage, com.ss.android.ugc.aweme.sharer.b bVar) {
            this.f124603a = sharePackage;
            this.f124604b = bVar;
        }

        @Override // f.a.q
        public final void a(o<h> oVar) {
            l.d(oVar, "");
            oVar.a(this.f124603a.a(this.f124604b));
        }
    }

    public n<h> b(com.ss.android.ugc.aweme.sharer.b bVar) {
        l.d(bVar, "");
        n<h> a2 = n.a((q) new d(this, bVar));
        l.b(a2, "");
        return a2;
    }

    public SharePackage(a aVar) {
        String str = "";
        l.d(aVar, str);
        this.f124596j = aVar;
        Bundle bundle = new Bundle();
        this.f124595i = bundle;
        String str2 = aVar.f124597a;
        if (str2 == null) {
            l.b();
        }
        this.f124590d = str2;
        String str3 = aVar.f124598b;
        this.f124591e = str3 == null ? str : str3;
        String str4 = aVar.f124599c;
        this.f124592f = str4 == null ? str : str4;
        String str5 = aVar.f124600d;
        this.f124593g = str5 == null ? str : str5;
        String str6 = aVar.f124601e;
        this.f124594h = str6 != null ? str6 : str;
        bundle.putAll(aVar.f124602f);
    }

    public void a(com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.b<? super h, z> bVar2) {
        l.d(bVar, "");
        l.d(bVar2, "");
        bVar2.invoke(a(bVar));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (parcel != null) {
            parcel.writeString(this.f124590d);
            parcel.writeString(this.f124591e);
            parcel.writeString(this.f124592f);
            parcel.writeString(this.f124593g);
            parcel.writeString(this.f124594h);
            parcel.writeBundle(this.f124595i);
        }
    }

    public void a(Context context, com.ss.android.ugc.aweme.sharer.b bVar, h.f.a.a<z> aVar) {
        l.d(context, "");
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public boolean a(com.ss.android.ugc.aweme.sharer.b bVar, Context context, h.f.a.b<? super Boolean, z> bVar2) {
        l.d(bVar, "");
        l.d(context, "");
        l.d(bVar2, "");
        return a(bVar, context);
    }
}
