package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import h.f.b.l;

public final class BillItem {
    @c(a = "item_name")
    private final String itemName;
    @c(a = "item_price")
    private final Price itemPrice;
    @c(a = "item_text_color")
    private final Integer itemTextColor;
    @c(a = "item_type")
    private final Integer itemType;
    @c(a = "logo")
    private final Icon logo;

    static {
        Covode.recordClassIndex(53108);
    }

    public static /* synthetic */ BillItem copy$default(BillItem billItem, Integer num, String str, Price price, Icon icon, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = billItem.itemType;
        }
        if ((i2 & 2) != 0) {
            str = billItem.itemName;
        }
        if ((i2 & 4) != 0) {
            price = billItem.itemPrice;
        }
        if ((i2 & 8) != 0) {
            icon = billItem.logo;
        }
        if ((i2 & 16) != 0) {
            num2 = billItem.itemTextColor;
        }
        return billItem.copy(num, str, price, icon, num2);
    }

    public final Integer component1() {
        return this.itemType;
    }

    public final String component2() {
        return this.itemName;
    }

    public final Price component3() {
        return this.itemPrice;
    }

    public final Icon component4() {
        return this.logo;
    }

    public final Integer component5() {
        return this.itemTextColor;
    }

    public final BillItem copy(Integer num, String str, Price price, Icon icon, Integer num2) {
        return new BillItem(num, str, price, icon, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillItem)) {
            return false;
        }
        BillItem billItem = (BillItem) obj;
        return l.a(this.itemType, billItem.itemType) && l.a(this.itemName, billItem.itemName) && l.a(this.itemPrice, billItem.itemPrice) && l.a(this.logo, billItem.logo) && l.a(this.itemTextColor, billItem.itemTextColor);
    }

    public final int hashCode() {
        Integer num = this.itemType;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.itemName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Price price = this.itemPrice;
        int hashCode3 = (hashCode2 + (price != null ? price.hashCode() : 0)) * 31;
        Icon icon = this.logo;
        int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 31;
        Integer num2 = this.itemTextColor;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "BillItem(itemType=" + this.itemType + ", itemName=" + this.itemName + ", itemPrice=" + this.itemPrice + ", logo=" + this.logo + ", itemTextColor=" + this.itemTextColor + ")";
    }

    public final String getItemName() {
        return this.itemName;
    }

    public final Price getItemPrice() {
        return this.itemPrice;
    }

    public final Integer getItemTextColor() {
        return this.itemTextColor;
    }

    public final Integer getItemType() {
        return this.itemType;
    }

    public final Icon getLogo() {
        return this.logo;
    }

    public final BillItem merge(BillItem billItem) {
        if (billItem == null) {
            return this;
        }
        Integer num = billItem.itemType;
        if (num == null) {
            num = this.itemType;
        }
        String str = billItem.itemName;
        if (str == null) {
            str = this.itemName;
        }
        Price price = billItem.itemPrice;
        if (price == null) {
            price = this.itemPrice;
        }
        Icon icon = billItem.logo;
        if (icon == null) {
            icon = this.logo;
        }
        Integer num2 = billItem.itemTextColor;
        if (num2 == null) {
            num2 = this.itemTextColor;
        }
        return new BillItem(num, str, price, icon, num2);
    }

    public BillItem(Integer num, String str, Price price, Icon icon, Integer num2) {
        this.itemType = num;
        this.itemName = str;
        this.itemPrice = price;
        this.logo = icon;
        this.itemTextColor = num2;
    }
}
