package com.ss.android.ugc.aweme.ecommerce.delivery;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.utils.dg;
import h.c.d;
import h.f.b.l;
import h.q;
import java.util.ArrayList;
import java.util.List;

public final class DeliveryPanelStarter {

    /* renamed from: a  reason: collision with root package name */
    public static final DeliveryPanelStarter f85785a = new DeliveryPanelStarter();

    /* renamed from: b  reason: collision with root package name */
    private static d<? super PackedDeliverySelectResult> f85786b;

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ DeliveryPanelStarter this$0;

        static {
            Covode.recordClassIndex(53669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DeliveryPanelStarter deliveryPanelStarter, d dVar) {
            super(dVar);
            this.this$0 = deliveryPanelStarter;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, null, null, false, this);
        }
    }

    private DeliveryPanelStarter() {
    }

    public static final class EnterParam implements Parcelable {
        public static final Parcelable.Creator<EnterParam> CREATOR = new b();

        /* renamed from: i  reason: collision with root package name */
        public static final a f85787i = new a((byte) 0);
        @c(a = "delivery_type")

        /* renamed from: a  reason: collision with root package name */
        public final String f85788a;
        @c(a = "address_id")

        /* renamed from: b  reason: collision with root package name */
        public final String f85789b;
        @c(a = "area")

        /* renamed from: c  reason: collision with root package name */
        public final List<Region> f85790c;
        @c(a = "product_id")

        /* renamed from: d  reason: collision with root package name */
        public final String f85791d;
        @c(a = "sku_id")

        /* renamed from: e  reason: collision with root package name */
        public final String f85792e;
        @c(a = "quantity")

        /* renamed from: f  reason: collision with root package name */
        public final int f85793f;
        @c(a = "logistic_list")

        /* renamed from: g  reason: collision with root package name */
        public final List<LogisticDTO> f85794g;
        @c(a = "track_params")

        /* renamed from: h  reason: collision with root package name */
        public final String f85795h;

        public static final class a {
            static {
                Covode.recordClassIndex(53659);
            }

            /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam$a$a  reason: collision with other inner class name */
            public static final class C2057a extends com.google.gson.b.a<List<? extends LogisticDTO>> {
                static {
                    Covode.recordClassIndex(53660);
                }

                C2057a() {
                }
            }

            public static final class b extends com.google.gson.b.a<List<? extends Region>> {
                static {
                    Covode.recordClassIndex(53661);
                }

                b() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            public static EnterParam a(Intent intent) {
                String str;
                int i2;
                List list;
                String str2 = "{}";
                List list2 = null;
                if (intent == null) {
                    return null;
                }
                String a2 = a(intent, "delivery_type");
                if (a2 != null) {
                    str = a2.toString();
                } else {
                    str = null;
                }
                String a3 = a(intent, "address_id");
                String a4 = a(intent, "product_id");
                if (a4 == null) {
                    a4 = "";
                }
                l.b(a4, "");
                String a5 = a(intent, "sku_id");
                if (a5 == null) {
                    a5 = "";
                }
                l.b(a5, "");
                String a6 = a(intent, "quantity");
                if (a6 != null) {
                    i2 = Integer.parseInt(a6);
                } else {
                    i2 = 1;
                }
                try {
                    f a7 = dg.a();
                    String a8 = a(intent, "logistic_list");
                    if (a8 == null) {
                        a8 = str2;
                    }
                    list = (List) a7.a(a8, new C2057a().type);
                } catch (Exception unused) {
                    list = null;
                }
                try {
                    f a9 = dg.a();
                    String a10 = a(intent, "area");
                    if (a10 != null) {
                        str2 = a10;
                    }
                    list2 = (List) a9.a(str2, new b().type);
                } catch (Exception unused2) {
                }
                String a11 = a(intent, "from");
                if (a11 == null) {
                    a11 = "";
                }
                l.b(a11, "");
                return new EnterParam(str, a3, list2, a4, a5, i2, list, a(intent, "track_params"));
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
            Covode.recordClassIndex(53658);
        }

        public EnterParam() {
            this(null, null, null, null, null, 0, null, null, 255);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParam)) {
                return false;
            }
            EnterParam enterParam = (EnterParam) obj;
            return l.a(this.f85788a, enterParam.f85788a) && l.a(this.f85789b, enterParam.f85789b) && l.a(this.f85790c, enterParam.f85790c) && l.a(this.f85791d, enterParam.f85791d) && l.a(this.f85792e, enterParam.f85792e) && this.f85793f == enterParam.f85793f && l.a(this.f85794g, enterParam.f85794g) && l.a(this.f85795h, enterParam.f85795h);
        }

        public final int hashCode() {
            String str = this.f85788a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f85789b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<Region> list = this.f85790c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str3 = this.f85791d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f85792e;
            int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f85793f) * 31;
            List<LogisticDTO> list2 = this.f85794g;
            int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
            String str5 = this.f85795h;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return hashCode6 + i2;
        }

        public final String toString() {
            return "EnterParam(selectedDeliveryTypeId=" + this.f85788a + ", selectedBuyerAddressId=" + this.f85789b + ", selectedArea=" + this.f85790c + ", productId=" + this.f85791d + ", skuId=" + this.f85792e + ", quantity=" + this.f85793f + ", logisticList=" + this.f85794g + ", trackParams=" + this.f85795h + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f85788a);
            parcel.writeString(this.f85789b);
            List<Region> list = this.f85790c;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f85791d);
            parcel.writeString(this.f85792e);
            parcel.writeInt(this.f85793f);
            List<LogisticDTO> list2 = this.f85794g;
            if (list2 != null) {
                parcel.writeInt(1);
                parcel.writeInt(list2.size());
                for (LogisticDTO logisticDTO : list2) {
                    logisticDTO.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f85795h);
        }

        public static class b implements Parcelable.Creator<EnterParam> {
            static {
                Covode.recordClassIndex(53662);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ EnterParam[] newArray(int i2) {
                return new EnterParam[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EnterParam createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                l.d(parcel, "");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                ArrayList arrayList2 = null;
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
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt2 = parcel.readInt();
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    arrayList2 = new ArrayList(readInt3);
                    while (readInt3 != 0) {
                        arrayList2.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                        readInt3--;
                    }
                }
                return new EnterParam(readString, readString2, arrayList, readString3, readString4, readInt2, arrayList2, parcel.readString());
            }
        }

        public EnterParam(String str, String str2, List<Region> list, String str3, String str4, int i2, List<LogisticDTO> list2, String str5) {
            l.d(str3, "");
            l.d(str4, "");
            this.f85788a = str;
            this.f85789b = str2;
            this.f85790c = list;
            this.f85791d = str3;
            this.f85792e = str4;
            this.f85793f = i2;
            this.f85794g = list2;
            this.f85795h = str5;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ EnterParam(java.lang.String r11, java.lang.String r12, java.util.List r13, java.lang.String r14, java.lang.String r15, int r16, java.util.List r17, java.lang.String r18, int r19) {
            /*
                r10 = this;
                r8 = r17
                r7 = r16
                r2 = r11
                r3 = r12
                r1 = r19
                r5 = r14
                r4 = r13
                r0 = r1 & 1
                r9 = 0
                if (r0 == 0) goto L_0x0010
                r2 = r9
            L_0x0010:
                r0 = r1 & 2
                if (r0 == 0) goto L_0x0015
                r3 = r9
            L_0x0015:
                r0 = r1 & 4
                if (r0 == 0) goto L_0x001a
                r4 = r9
            L_0x001a:
                r0 = r1 & 8
                java.lang.String r6 = "0"
                if (r0 == 0) goto L_0x0021
                r5 = r6
            L_0x0021:
                r0 = r1 & 16
                if (r0 == 0) goto L_0x003b
            L_0x0025:
                r0 = r1 & 32
                if (r0 == 0) goto L_0x002a
                r7 = 1
            L_0x002a:
                r0 = r1 & 64
                if (r0 == 0) goto L_0x002f
                r8 = r9
            L_0x002f:
                r0 = r1 & 128(0x80, float:1.794E-43)
                if (r0 == 0) goto L_0x0038
            L_0x0033:
                r1 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return
            L_0x0038:
                r9 = r18
                goto L_0x0033
            L_0x003b:
                r6 = r15
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.EnterParam.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, java.util.List, java.lang.String, int):void");
        }
    }

    public static final class EnterParamForOrderSubmitPage implements Parcelable {
        public static final Parcelable.Creator<EnterParamForOrderSubmitPage> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final List<LogisticDTO> f85796a;

        /* renamed from: b  reason: collision with root package name */
        public final String f85797b;

        /* renamed from: c  reason: collision with root package name */
        public final String f85798c;

        static {
            Covode.recordClassIndex(53663);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParamForOrderSubmitPage)) {
                return false;
            }
            EnterParamForOrderSubmitPage enterParamForOrderSubmitPage = (EnterParamForOrderSubmitPage) obj;
            return l.a(this.f85796a, enterParamForOrderSubmitPage.f85796a) && l.a(this.f85797b, enterParamForOrderSubmitPage.f85797b) && l.a(this.f85798c, enterParamForOrderSubmitPage.f85798c);
        }

        public final int hashCode() {
            List<LogisticDTO> list = this.f85796a;
            int i2 = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.f85797b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f85798c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "EnterParamForOrderSubmitPage(logisticList=" + this.f85796a + ", selectedLogisticTypeId=" + this.f85797b + ", trackParams=" + this.f85798c + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            List<LogisticDTO> list = this.f85796a;
            parcel.writeInt(list.size());
            for (LogisticDTO logisticDTO : list) {
                logisticDTO.writeToParcel(parcel, 0);
            }
            parcel.writeString(this.f85797b);
            parcel.writeString(this.f85798c);
        }

        public static class a implements Parcelable.Creator<EnterParamForOrderSubmitPage> {
            static {
                Covode.recordClassIndex(53664);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ EnterParamForOrderSubmitPage[] newArray(int i2) {
                return new EnterParamForOrderSubmitPage[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EnterParamForOrderSubmitPage createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(LogisticDTO.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                return new EnterParamForOrderSubmitPage(arrayList, parcel.readString(), parcel.readString());
            }
        }

        public EnterParamForOrderSubmitPage(List<LogisticDTO> list, String str, String str2) {
            l.d(list, "");
            this.f85796a = list;
            this.f85797b = str;
            this.f85798c = str2;
        }
    }

    public static final class EnterParamForProductDetailPage implements Parcelable {
        public static final Parcelable.Creator<EnterParamForProductDetailPage> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final String f85799a;

        /* renamed from: b  reason: collision with root package name */
        public final String f85800b;

        /* renamed from: c  reason: collision with root package name */
        public final List<Region> f85801c;

        /* renamed from: d  reason: collision with root package name */
        public final String f85802d;

        /* renamed from: e  reason: collision with root package name */
        public final String f85803e;

        /* renamed from: f  reason: collision with root package name */
        public final int f85804f;

        /* renamed from: g  reason: collision with root package name */
        public final String f85805g;

        static {
            Covode.recordClassIndex(53665);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EnterParamForProductDetailPage)) {
                return false;
            }
            EnterParamForProductDetailPage enterParamForProductDetailPage = (EnterParamForProductDetailPage) obj;
            return l.a(this.f85799a, enterParamForProductDetailPage.f85799a) && l.a(this.f85800b, enterParamForProductDetailPage.f85800b) && l.a(this.f85801c, enterParamForProductDetailPage.f85801c) && l.a(this.f85802d, enterParamForProductDetailPage.f85802d) && l.a(this.f85803e, enterParamForProductDetailPage.f85803e) && this.f85804f == enterParamForProductDetailPage.f85804f && l.a(this.f85805g, enterParamForProductDetailPage.f85805g);
        }

        public final int hashCode() {
            String str = this.f85799a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f85800b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            List<Region> list = this.f85801c;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str3 = this.f85802d;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f85803e;
            int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.f85804f) * 31;
            String str5 = this.f85805g;
            if (str5 != null) {
                i2 = str5.hashCode();
            }
            return hashCode5 + i2;
        }

        public final String toString() {
            return "EnterParamForProductDetailPage(selectedLogisticTypeId=" + this.f85799a + ", selectedBuyerAddressId=" + this.f85800b + ", selectedArea=" + this.f85801c + ", productId=" + this.f85802d + ", skuId=" + this.f85803e + ", quantity=" + this.f85804f + ", trackParams=" + this.f85805g + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f85799a);
            parcel.writeString(this.f85800b);
            List<Region> list = this.f85801c;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f85802d);
            parcel.writeString(this.f85803e);
            parcel.writeInt(this.f85804f);
            parcel.writeString(this.f85805g);
        }

        public static class a implements Parcelable.Creator<EnterParamForProductDetailPage> {
            static {
                Covode.recordClassIndex(53666);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ EnterParamForProductDetailPage[] newArray(int i2) {
                return new EnterParamForProductDetailPage[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ EnterParamForProductDetailPage createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                l.d(parcel, "");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
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
                return new EnterParamForProductDetailPage(readString, readString2, arrayList, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            }
        }

        public EnterParamForProductDetailPage(String str, String str2, List<Region> list, String str3, String str4, int i2, String str5) {
            l.d(str3, "");
            l.d(str4, "");
            this.f85799a = str;
            this.f85800b = str2;
            this.f85801c = list;
            this.f85802d = str3;
            this.f85803e = str4;
            this.f85804f = i2;
            this.f85805g = str5;
        }
    }

    public static final class PackedDeliverySelectResult implements Parcelable {
        public static final Parcelable.Creator<PackedDeliverySelectResult> CREATOR = new a();
        @c(a = "logistic")

        /* renamed from: a  reason: collision with root package name */
        public final LogisticDTO f85806a;
        @c(a = "address_id")

        /* renamed from: b  reason: collision with root package name */
        public final String f85807b;
        @c(a = "area")

        /* renamed from: c  reason: collision with root package name */
        public final List<Region> f85808c;

        static {
            Covode.recordClassIndex(53667);
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackedDeliverySelectResult)) {
                return false;
            }
            PackedDeliverySelectResult packedDeliverySelectResult = (PackedDeliverySelectResult) obj;
            return l.a(this.f85806a, packedDeliverySelectResult.f85806a) && l.a(this.f85807b, packedDeliverySelectResult.f85807b) && l.a(this.f85808c, packedDeliverySelectResult.f85808c);
        }

        public final int hashCode() {
            LogisticDTO logisticDTO = this.f85806a;
            int i2 = 0;
            int hashCode = (logisticDTO != null ? logisticDTO.hashCode() : 0) * 31;
            String str = this.f85807b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            List<Region> list = this.f85808c;
            if (list != null) {
                i2 = list.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "PackedDeliverySelectResult(selectedLogistic=" + this.f85806a + ", selectedBuyerAddressId=" + this.f85807b + ", selectedArea=" + this.f85808c + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            LogisticDTO logisticDTO = this.f85806a;
            if (logisticDTO != null) {
                parcel.writeInt(1);
                logisticDTO.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.f85807b);
            List<Region> list = this.f85808c;
            if (list != null) {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                for (Region region : list) {
                    region.writeToParcel(parcel, 0);
                }
                return;
            }
            parcel.writeInt(0);
        }

        public static class a implements Parcelable.Creator<PackedDeliverySelectResult> {
            static {
                Covode.recordClassIndex(53668);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ PackedDeliverySelectResult[] newArray(int i2) {
                return new PackedDeliverySelectResult[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PackedDeliverySelectResult createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                ArrayList arrayList = null;
                LogisticDTO createFromParcel = parcel.readInt() != 0 ? LogisticDTO.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    while (readInt != 0) {
                        arrayList.add(Region.CREATOR.createFromParcel(parcel));
                        readInt--;
                    }
                }
                return new PackedDeliverySelectResult(createFromParcel, readString, arrayList);
            }
        }

        public /* synthetic */ PackedDeliverySelectResult() {
            this(null, null, null);
        }

        public PackedDeliverySelectResult(LogisticDTO logisticDTO, String str, List<Region> list) {
            this.f85806a = logisticDTO;
            this.f85807b = str;
            this.f85808c = list;
        }
    }

    static {
        Covode.recordClassIndex(53657);
    }

    public static void a(PackedDeliverySelectResult packedDeliverySelectResult) {
        l.d(packedDeliverySelectResult, "");
        d<? super PackedDeliverySelectResult> dVar = f85786b;
        if (dVar != null) {
            dVar.resumeWith(q.m223constructorimpl(packedDeliverySelectResult));
        }
        f85786b = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(android.content.Context r9, java.lang.Boolean r10, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.EnterParam r11, boolean r12, h.c.d<? super com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.PackedDeliverySelectResult> r13) {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.a(android.content.Context, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParam, boolean, h.c.d):java.lang.Object");
    }
}
