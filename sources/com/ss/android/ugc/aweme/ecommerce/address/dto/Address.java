package com.ss.android.ugc.aweme.ecommerce.address.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.hl;
import h.a.i;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class Address implements Parcelable {
    public static final Parcelable.Creator<Address> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f84297f = new a((byte) 0);
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public final String f84298a;
    @com.google.gson.a.c(a = "items")

    /* renamed from: b  reason: collision with root package name */
    public final List<AddressItem> f84299b;
    @com.google.gson.a.c(a = "region")

    /* renamed from: c  reason: collision with root package name */
    public final Region f84300c;
    @com.google.gson.a.c(a = "districts")

    /* renamed from: d  reason: collision with root package name */
    public final List<Region> f84301d;
    @com.google.gson.a.c(a = "address_id")

    /* renamed from: e  reason: collision with root package name */
    public final String f84302e;

    static {
        Covode.recordClassIndex(52561);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return l.a(this.f84298a, address.f84298a) && l.a(this.f84299b, address.f84299b) && l.a(this.f84300c, address.f84300c) && l.a(this.f84301d, address.f84301d) && l.a(this.f84302e, address.f84302e);
    }

    public final int hashCode() {
        String str = this.f84298a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<AddressItem> list = this.f84299b;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Region region = this.f84300c;
        int hashCode3 = (hashCode2 + (region != null ? region.hashCode() : 0)) * 31;
        List<Region> list2 = this.f84301d;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f84302e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "Address(id=" + this.f84298a + ", items=" + this.f84299b + ", region=" + this.f84300c + ", districts=" + this.f84301d + ", addressId=" + this.f84302e + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f84298a);
        List<AddressItem> list = this.f84299b;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (AddressItem addressItem : list) {
                addressItem.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Region region = this.f84300c;
        if (region != null) {
            parcel.writeInt(1);
            region.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Region> list2 = this.f84301d;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Region region2 : list2) {
                region2.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f84302e);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52562);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b implements Parcelable.Creator<Address> {
        static {
            Covode.recordClassIndex(52563);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Address[] newArray(int i2) {
            return new Address[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Address createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            String readString = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(AddressItem.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            Region createFromParcel = parcel.readInt() != 0 ? Region.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(Region.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            }
            return new Address(readString, arrayList, createFromParcel, arrayList2, parcel.readString());
        }
    }

    public final String b() {
        String[] strArr = {a("address"), a("address_detail")};
        l.d(strArr, "");
        List h2 = i.h(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : h2) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, c.f84303a, 30);
    }

    public final boolean a() {
        T t;
        List<AddressItem> list = this.f84299b;
        String str = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.f84305a, (Object) "default")) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                str = t2.f84306b;
            }
        }
        return l.a((Object) str, (Object) "1");
    }

    static final class c extends m implements h.f.a.b<String, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f84303a = new c();

        static {
            Covode.recordClassIndex(52564);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Region, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f84304a = new d();

        static {
            Covode.recordClassIndex(52565);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ CharSequence invoke(Region region) {
            Region region2 = region;
            l.d(region2, "");
            String str = region2.f84320a;
            if (str != null) {
                return str;
            }
            return "";
        }
    }

    public final String a(String str) {
        T t;
        l.d(str, "");
        List<AddressItem> list = this.f84299b;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (l.a((Object) t.f84305a, (Object) str)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                return t2.f84306b;
            }
        }
        return null;
    }

    public static /* synthetic */ String a(Address address) {
        List c2 = n.c(address.f84300c);
        Collection collection = address.f84301d;
        if (collection == null) {
            collection = z.INSTANCE;
        }
        c2.addAll(collection);
        List g2 = n.g((Iterable) c2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g2) {
            if (hl.a(((Region) obj).f84320a)) {
                arrayList.add(obj);
            }
        }
        return n.a(n.h((Iterable) arrayList), ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, d.f84304a, 30);
    }

    public /* synthetic */ Address(String str, List list, Region region, List list2) {
        this(str, list, region, list2, null);
    }

    public Address(String str, List<AddressItem> list, Region region, List<Region> list2, String str2) {
        l.d(str, "");
        this.f84298a = str;
        this.f84299b = list;
        this.f84300c = region;
        this.f84301d = list2;
        this.f84302e = str2;
    }
}
