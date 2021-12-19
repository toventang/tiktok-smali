package com.ss.android.ugc.aweme.ecommercebase.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class PromotionView implements Parcelable, Serializable {
    public static final Parcelable.Creator<PromotionView> CREATOR = new a();
    @c(a = "promotion_items")
    private final List<PromotionItem> promotion_items;

    static {
        Covode.recordClassIndex(55170);
    }

    public PromotionView() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommercebase.dto.PromotionView */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionView copy$default(PromotionView promotionView, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = promotionView.promotion_items;
        }
        return promotionView.copy(list);
    }

    public final List<PromotionItem> component1() {
        return this.promotion_items;
    }

    public final PromotionView copy(List<PromotionItem> list) {
        return new PromotionView(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PromotionView) && l.a(this.promotion_items, ((PromotionView) obj).promotion_items);
        }
        return true;
    }

    public final int hashCode() {
        List<PromotionItem> list = this.promotion_items;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PromotionView(promotion_items=" + this.promotion_items + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        List<PromotionItem> list = this.promotion_items;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (PromotionItem promotionItem : list) {
                promotionItem.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public final List<PromotionItem> getPromotion_items() {
        return this.promotion_items;
    }

    public static class a implements Parcelable.Creator<PromotionView> {
        static {
            Covode.recordClassIndex(55171);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PromotionView[] newArray(int i2) {
            return new PromotionView[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PromotionView createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            l.d(parcel, "");
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(PromotionItem.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            return new PromotionView(arrayList);
        }
    }

    public PromotionView(List<PromotionItem> list) {
        this.promotion_items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionView(List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list);
    }
}
