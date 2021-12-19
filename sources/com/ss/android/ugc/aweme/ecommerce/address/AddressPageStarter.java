package com.ss.android.ugc.aweme.ecommerce.address;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.account.util.i;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.router.j;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;
import h.m.p;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public final class AddressPageStarter {

    /* renamed from: a  reason: collision with root package name */
    public static final AddressPageStarter f84243a = new AddressPageStarter();

    public static final class AddressListEnterParams implements Parcelable {
        public static final Parcelable.Creator<AddressListEnterParams> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public static final a f84255c = new a((byte) 0);
        @c(a = "is_select_mode")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f84256a;
        @c(a = "trackParams")

        /* renamed from: b  reason: collision with root package name */
        public final String f84257b;

        static {
            Covode.recordClassIndex(52538);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeInt(this.f84256a ? 1 : 0);
            parcel.writeString(this.f84257b);
        }

        public static final class a {
            static {
                Covode.recordClassIndex(52539);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static AddressListEnterParams a(Intent intent) {
                boolean z;
                if (intent == null) {
                    return null;
                }
                String a2 = a(intent, "trackParams");
                try {
                    String a3 = a(intent, "is_select_mode");
                    if (a3 != null) {
                        z = Boolean.parseBoolean(a3);
                    } else {
                        z = false;
                    }
                    return new AddressListEnterParams(z, a2);
                } catch (Exception unused) {
                    return new AddressListEnterParams(false, a2);
                }
            }

            private static String a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        public static class b implements Parcelable.Creator<AddressListEnterParams> {
            static {
                Covode.recordClassIndex(52540);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AddressListEnterParams[] newArray(int i2) {
                return new AddressListEnterParams[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AddressListEnterParams createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new AddressListEnterParams(parcel.readInt() != 0, parcel.readString());
            }
        }

        private /* synthetic */ AddressListEnterParams() {
            this(false, null);
        }

        public AddressListEnterParams(boolean z, String str) {
            this.f84256a = z;
            this.f84257b = str;
        }
    }

    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final C2012a f84258c = new C2012a((byte) 0);
        @c(a = "address_id")

        /* renamed from: a  reason: collision with root package name */
        public final String f84259a;
        @c(a = StringSet.type)

        /* renamed from: b  reason: collision with root package name */
        public final int f84260b;

        static {
            Covode.recordClassIndex(52541);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$a$a  reason: collision with other inner class name */
        public static final class C2012a {
            static {
                Covode.recordClassIndex(52542);
            }

            private C2012a() {
            }

            public /* synthetic */ C2012a(byte b2) {
                this();
            }

            public static a a(String str) {
                Object obj;
                l.d(str, "");
                try {
                    obj = dg.a(str, a.class);
                } catch (Exception unused) {
                    obj = null;
                }
                a aVar = (a) obj;
                if (aVar == null) {
                    return new a("", -1);
                }
                return aVar;
            }
        }

        public final String a() {
            String b2 = i.a().b(this);
            if (b2 == null) {
                return "{}";
            }
            return b2;
        }

        public a(String str, int i2) {
            l.d(str, "");
            this.f84259a = str;
            this.f84260b = i2;
        }
    }

    private AddressPageStarter() {
    }

    public static final class AddressEditEnterParams implements Parcelable {
        public static final Parcelable.Creator<AddressEditEnterParams> CREATOR = new b();

        /* renamed from: k  reason: collision with root package name */
        public static final a f84244k = new a((byte) 0);
        @c(a = "districts")

        /* renamed from: a  reason: collision with root package name */
        public final List<Region> f84245a;
        @c(a = "address")

        /* renamed from: b  reason: collision with root package name */
        public final Address f84246b;
        @c(a = "from")

        /* renamed from: c  reason: collision with root package name */
        public final String f84247c;
        @c(a = "trackParams")

        /* renamed from: d  reason: collision with root package name */
        public final String f84248d;
        @c(a = "current_progress")

        /* renamed from: e  reason: collision with root package name */
        public final Integer f84249e;
        @c(a = "total_progress")

        /* renamed from: f  reason: collision with root package name */
        public final Integer f84250f;
        @c(a = "template_data")

        /* renamed from: g  reason: collision with root package name */
        public final InputItemData f84251g;
        @c(a = "keep_alive")

        /* renamed from: h  reason: collision with root package name */
        public final boolean f84252h;
        @c(a = "button_type")

        /* renamed from: i  reason: collision with root package name */
        public final int f84253i;
        @c(a = "override_quit_message")

        /* renamed from: j  reason: collision with root package name */
        public final String f84254j;

        public static final class a {
            static {
                Covode.recordClassIndex(52535);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.AddressPageStarter$AddressEditEnterParams$a$a  reason: collision with other inner class name */
            public static final class C2011a extends com.google.gson.b.a<List<? extends Region>> {
                static {
                    Covode.recordClassIndex(52536);
                }

                C2011a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static AddressEditEnterParams a(Intent intent) {
                Address address;
                Integer num;
                Integer num2;
                boolean z;
                int i2;
                List list;
                Integer e2;
                Object obj;
                InputItemData inputItemData = null;
                if (intent == null) {
                    return null;
                }
                String a2 = a(intent, "address");
                if (a2 != null) {
                    try {
                        obj = dg.a(a2, Address.class);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    address = (Address) obj;
                } else {
                    address = null;
                }
                String a3 = a(intent, "current_progress");
                if (a3 != null) {
                    num = p.e(a3);
                } else {
                    num = null;
                }
                String a4 = a(intent, "total_progress");
                if (a4 != null) {
                    num2 = p.e(a4);
                } else {
                    num2 = null;
                }
                String a5 = a(intent, "keep_alive");
                if (a5 != null) {
                    z = Boolean.parseBoolean(a5);
                } else {
                    z = false;
                }
                String a6 = a(intent, "button_type");
                if (a6 == null || (e2 = p.e(a6)) == null) {
                    i2 = 0;
                } else {
                    i2 = e2.intValue();
                }
                try {
                    Type type = new C2011a().type;
                    f a7 = dg.a();
                    String a8 = a(intent, "districts");
                    if (a8 == null) {
                        a8 = "{}";
                    }
                    list = (List) a7.a(a8, type);
                } catch (Exception unused2) {
                    list = null;
                }
                try {
                    String a9 = a(intent, "template_data");
                    if (a9 != null) {
                        inputItemData = (InputItemData) dg.a().a(a9, InputItemData.class);
                    }
                } catch (Exception unused3) {
                }
                String a10 = a(intent, "from");
                if (a10 == null) {
                    a10 = "";
                }
                l.b(a10, "");
                return new AddressEditEnterParams(list, address, a10, a(intent, "trackParams"), num, num2, inputItemData, z, i2, a(intent, "override_quit_message"));
            }

            private static String a(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception unused) {
                    return null;
                }
            }
        }

        static {
            Covode.recordClassIndex(52534);
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            List<Region> list = this.f84245a;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            Address address = this.f84246b;
            if (address != null) {
                parcel.writeInt(1);
                address.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f84247c);
            parcel.writeString(this.f84248d);
            Integer num = this.f84249e;
            if (num != null) {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            } else {
                parcel.writeInt(0);
            }
            Integer num2 = this.f84250f;
            if (num2 != null) {
                parcel.writeInt(1);
                parcel.writeInt(num2.intValue());
            } else {
                parcel.writeInt(0);
            }
            InputItemData inputItemData = this.f84251g;
            if (inputItemData != null) {
                parcel.writeInt(1);
                inputItemData.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.f84252h ? 1 : 0);
            parcel.writeInt(this.f84253i);
            parcel.writeString(this.f84254j);
        }

        public static class b implements Parcelable.Creator<AddressEditEnterParams> {
            static {
                Covode.recordClassIndex(52537);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ AddressEditEnterParams[] newArray(int i2) {
                return new AddressEditEnterParams[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ AddressEditEnterParams createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                l.d(parcel, "");
                InputItemData inputItemData = null;
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                } else {
                    arrayList = null;
                }
                Address createFromParcel = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                if (parcel.readInt() != 0) {
                    inputItemData = InputItemData.CREATOR.createFromParcel(parcel);
                }
                return new AddressEditEnterParams(arrayList, createFromParcel, readString, readString2, valueOf, valueOf2, inputItemData, parcel.readInt() != 0, parcel.readInt(), parcel.readString());
            }
        }

        public /* synthetic */ AddressEditEnterParams(String str) {
            this(null, null, str, null, null, null, null, false, 0, null);
        }

        public AddressEditEnterParams(List<Region> list, Address address, String str, String str2, Integer num, Integer num2, InputItemData inputItemData, boolean z, int i2, String str3) {
            l.d(str, "");
            this.f84245a = list;
            this.f84246b = address;
            this.f84247c = str;
            this.f84248d = str2;
            this.f84249e = num;
            this.f84250f = num2;
            this.f84251g = inputItemData;
            this.f84252h = z;
            this.f84253i = i2;
            this.f84254j = str3;
        }
    }

    static {
        Covode.recordClassIndex(52533);
    }

    public static /* synthetic */ void a(Context context, Address address, List list, String str, boolean z, String str2, String str3, int i2) {
        if ((i2 & 2) != 0) {
            address = null;
        }
        if ((i2 & 4) != 0) {
            list = null;
        }
        if ((i2 & 16) != 0) {
            z = false;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 2048) != 0) {
            str3 = null;
        }
        l.d(str, "");
        if (context != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (address != null) {
                linkedHashMap.put("address", address);
            }
            if (list != null) {
                linkedHashMap.put("districts", list);
            }
            if (str2 != null) {
                linkedHashMap.put("trackParams", str2);
            }
            linkedHashMap.put("from", str);
            linkedHashMap.put("keep_alive", false);
            linkedHashMap.put("button_type", 0);
            if (str3 == null || str3.length() == 0) {
                str3 = "aweme://ec/address/edit";
            }
            j.a(context, str3, linkedHashMap, z).open();
        }
    }
}
