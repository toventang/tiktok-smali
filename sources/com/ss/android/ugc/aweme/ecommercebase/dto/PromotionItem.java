package com.ss.android.ugc.aweme.ecommercebase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class PromotionItem implements Parcelable, Serializable {
    public static final Parcelable.Creator<PromotionItem> CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    @c(a = "back_ground")
    private final GImage backGround;
    @c(a = "icon")
    private final GImage icon;
    @c(a = "id")
    private final String id;
    @c(a = "log_extra")
    private final String log_extra;
    @c(a = StringSet.name)
    private final String name;
    @c(a = "style")
    private final Integer style;
    @c(a = "subheaders")
    private final List<String> subHeaders;
    @c(a = StringSet.type)
    private final Integer type;
    @c(a = "voucher_id")
    private final String voucherId;

    static {
        Covode.recordClassIndex(55167);
    }

    public PromotionItem() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionItem copy$default(PromotionItem promotionItem, String str, String str2, List list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = promotionItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = promotionItem.name;
        }
        if ((i2 & 4) != 0) {
            list = promotionItem.subHeaders;
        }
        if ((i2 & 8) != 0) {
            gImage = promotionItem.icon;
        }
        if ((i2 & 16) != 0) {
            gImage2 = promotionItem.backGround;
        }
        if ((i2 & 32) != 0) {
            num = promotionItem.style;
        }
        if ((i2 & 64) != 0) {
            str3 = promotionItem.voucherId;
        }
        if ((i2 & 128) != 0) {
            num2 = promotionItem.type;
        }
        if ((i2 & 256) != 0) {
            str4 = promotionItem.log_extra;
        }
        return promotionItem.copy(str, str2, list, gImage, gImage2, num, str3, num2, str4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final List<String> component3() {
        return this.subHeaders;
    }

    public final GImage component4() {
        return this.icon;
    }

    public final GImage component5() {
        return this.backGround;
    }

    public final Integer component6() {
        return this.style;
    }

    public final String component7() {
        return this.voucherId;
    }

    public final Integer component8() {
        return this.type;
    }

    public final String component9() {
        return this.log_extra;
    }

    public final PromotionItem copy(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4) {
        return new PromotionItem(str, str2, list, gImage, gImage2, num, str3, num2, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionItem)) {
            return false;
        }
        PromotionItem promotionItem = (PromotionItem) obj;
        return l.a(this.id, promotionItem.id) && l.a(this.name, promotionItem.name) && l.a(this.subHeaders, promotionItem.subHeaders) && l.a(this.icon, promotionItem.icon) && l.a(this.backGround, promotionItem.backGround) && l.a(this.style, promotionItem.style) && l.a(this.voucherId, promotionItem.voucherId) && l.a(this.type, promotionItem.type) && l.a(this.log_extra, promotionItem.log_extra);
    }

    public final int hashCode() {
        String str = this.id;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.subHeaders;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        GImage gImage = this.icon;
        int hashCode4 = (hashCode3 + (gImage != null ? gImage.hashCode() : 0)) * 31;
        GImage gImage2 = this.backGround;
        int hashCode5 = (hashCode4 + (gImage2 != null ? gImage2.hashCode() : 0)) * 31;
        Integer num = this.style;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.voucherId;
        int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num2 = this.type;
        int hashCode8 = (hashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str4 = this.log_extra;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode8 + i2;
    }

    public final String toString() {
        return "PromotionItem(id=" + this.id + ", name=" + this.name + ", subHeaders=" + this.subHeaders + ", icon=" + this.icon + ", backGround=" + this.backGround + ", style=" + this.style + ", voucherId=" + this.voucherId + ", type=" + this.type + ", log_extra=" + this.log_extra + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeStringList(this.subHeaders);
        GImage gImage = this.icon;
        if (gImage != null) {
            parcel.writeInt(1);
            gImage.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        GImage gImage2 = this.backGround;
        if (gImage2 != null) {
            parcel.writeInt(1);
            gImage2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.style;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.voucherId);
        Integer num2 = this.type;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.log_extra);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55168);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final GImage getBackGround() {
        return this.backGround;
    }

    public final GImage getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLog_extra() {
        return this.log_extra;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getStyle() {
        return this.style;
    }

    public final List<String> getSubHeaders() {
        return this.subHeaders;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getVoucherId() {
        return this.voucherId;
    }

    public static class b implements Parcelable.Creator<PromotionItem> {
        static {
            Covode.recordClassIndex(55169);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PromotionItem[] newArray(int i2) {
            return new PromotionItem[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PromotionItem createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Integer num = null;
            GImage createFromParcel = parcel.readInt() != 0 ? GImage.CREATOR.createFromParcel(parcel) : null;
            GImage createFromParcel2 = parcel.readInt() != 0 ? GImage.CREATOR.createFromParcel(parcel) : null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new PromotionItem(readString, readString2, createStringArrayList, createFromParcel, createFromParcel2, valueOf, readString3, num, parcel.readString());
        }
    }

    public PromotionItem(String str, String str2, List<String> list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4) {
        this.id = str;
        this.name = str2;
        this.subHeaders = list;
        this.icon = gImage;
        this.backGround = gImage2;
        this.style = num;
        this.voucherId = str3;
        this.type = num2;
        this.log_extra = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionItem(String str, String str2, List list, GImage gImage, GImage gImage2, Integer num, String str3, Integer num2, String str4, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : gImage, (i2 & 16) != 0 ? null : gImage2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : num2, (i2 & 256) == 0 ? str4 : null);
    }
}
