package com.ss.android.ugc.aweme.ecommerce.sku.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class AddToCartButton implements Parcelable, Serializable {
    public static final a AddToCartButtonStatus = new a((byte) 0);
    public static final Parcelable.Creator<AddToCartButton> CREATOR = new b();
    @c(a = "available_count")
    private final Integer availableCount;
    @c(a = "click_hint")
    private final String clickHint;
    @c(a = "status")
    private final Integer status;

    static {
        Covode.recordClassIndex(54896);
    }

    public static /* synthetic */ AddToCartButton copy$default(AddToCartButton addToCartButton, Integer num, String str, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = addToCartButton.status;
        }
        if ((i2 & 2) != 0) {
            str = addToCartButton.clickHint;
        }
        if ((i2 & 4) != 0) {
            num2 = addToCartButton.availableCount;
        }
        return addToCartButton.copy(num, str, num2);
    }

    public final Integer component1() {
        return this.status;
    }

    public final String component2() {
        return this.clickHint;
    }

    public final Integer component3() {
        return this.availableCount;
    }

    public final AddToCartButton copy(Integer num, String str, Integer num2) {
        return new AddToCartButton(num, str, num2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddToCartButton)) {
            return false;
        }
        AddToCartButton addToCartButton = (AddToCartButton) obj;
        return l.a(this.status, addToCartButton.status) && l.a(this.clickHint, addToCartButton.clickHint) && l.a(this.availableCount, addToCartButton.availableCount);
    }

    public final int hashCode() {
        Integer num = this.status;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.clickHint;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.availableCount;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "AddToCartButton(status=" + this.status + ", clickHint=" + this.clickHint + ", availableCount=" + this.availableCount + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Integer num = this.status;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.clickHint);
        Integer num2 = this.availableCount;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
            return;
        }
        parcel.writeInt(0);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54897);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Integer getAvailableCount() {
        return this.availableCount;
    }

    public final String getClickHint() {
        return this.clickHint;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public static class b implements Parcelable.Creator<AddToCartButton> {
        static {
            Covode.recordClassIndex(54898);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AddToCartButton[] newArray(int i2) {
            return new AddToCartButton[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AddToCartButton createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            Integer num = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new AddToCartButton(valueOf, readString, num);
        }
    }

    public AddToCartButton(Integer num, String str, Integer num2) {
        this.status = num;
        this.clickHint = str;
        this.availableCount = num2;
    }
}
