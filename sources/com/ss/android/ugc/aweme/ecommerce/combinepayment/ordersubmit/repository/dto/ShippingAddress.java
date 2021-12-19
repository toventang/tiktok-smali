package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Address;
import h.f.b.l;
import java.util.List;

public final class ShippingAddress {
    @c(a = "address_reachable")
    private final Boolean addressReachable;
    @c(a = "address_valid")
    private final Boolean addressValid;
    @c(a = "invalid_hint_message")
    private final String invalidHintMessage;
    @c(a = "shipping_address")
    private final Address shippingAddress;
    @c(a = "sku_reachables")
    private final List<SkuReachable> skuReachables;

    static {
        Covode.recordClassIndex(53115);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShippingAddress */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingAddress copy$default(ShippingAddress shippingAddress2, Address address, Boolean bool, List list, String str, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            address = shippingAddress2.shippingAddress;
        }
        if ((i2 & 2) != 0) {
            bool = shippingAddress2.addressReachable;
        }
        if ((i2 & 4) != 0) {
            list = shippingAddress2.skuReachables;
        }
        if ((i2 & 8) != 0) {
            str = shippingAddress2.invalidHintMessage;
        }
        if ((i2 & 16) != 0) {
            bool2 = shippingAddress2.addressValid;
        }
        return shippingAddress2.copy(address, bool, list, str, bool2);
    }

    public final Address component1() {
        return this.shippingAddress;
    }

    public final Boolean component2() {
        return this.addressReachable;
    }

    public final List<SkuReachable> component3() {
        return this.skuReachables;
    }

    public final String component4() {
        return this.invalidHintMessage;
    }

    public final Boolean component5() {
        return this.addressValid;
    }

    public final ShippingAddress copy(Address address, Boolean bool, List<SkuReachable> list, String str, Boolean bool2) {
        return new ShippingAddress(address, bool, list, str, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingAddress)) {
            return false;
        }
        ShippingAddress shippingAddress2 = (ShippingAddress) obj;
        return l.a(this.shippingAddress, shippingAddress2.shippingAddress) && l.a(this.addressReachable, shippingAddress2.addressReachable) && l.a(this.skuReachables, shippingAddress2.skuReachables) && l.a(this.invalidHintMessage, shippingAddress2.invalidHintMessage) && l.a(this.addressValid, shippingAddress2.addressValid);
    }

    public final int hashCode() {
        Address address = this.shippingAddress;
        int i2 = 0;
        int hashCode = (address != null ? address.hashCode() : 0) * 31;
        Boolean bool = this.addressReachable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        List<SkuReachable> list = this.skuReachables;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.invalidHintMessage;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool2 = this.addressValid;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "ShippingAddress(shippingAddress=" + this.shippingAddress + ", addressReachable=" + this.addressReachable + ", skuReachables=" + this.skuReachables + ", invalidHintMessage=" + this.invalidHintMessage + ", addressValid=" + this.addressValid + ")";
    }

    public final Boolean getAddressReachable() {
        return this.addressReachable;
    }

    public final Boolean getAddressValid() {
        return this.addressValid;
    }

    public final String getInvalidHintMessage() {
        return this.invalidHintMessage;
    }

    public final Address getShippingAddress() {
        return this.shippingAddress;
    }

    public final List<SkuReachable> getSkuReachables() {
        return this.skuReachables;
    }

    public final ShippingAddress merge(ShippingAddress shippingAddress2) {
        if (shippingAddress2 == null) {
            return this;
        }
        Address address = shippingAddress2.shippingAddress;
        if (address == null) {
            address = this.shippingAddress;
        }
        Boolean bool = shippingAddress2.addressReachable;
        if (bool == null) {
            bool = this.addressReachable;
        }
        List<SkuReachable> list = shippingAddress2.skuReachables;
        if (list == null) {
            list = this.skuReachables;
        }
        String str = shippingAddress2.invalidHintMessage;
        if (str == null) {
            str = this.invalidHintMessage;
        }
        Boolean bool2 = shippingAddress2.addressValid;
        if (bool2 == null) {
            bool2 = this.addressValid;
        }
        return new ShippingAddress(address, bool, list, str, bool2);
    }

    public ShippingAddress(Address address, Boolean bool, List<SkuReachable> list, String str, Boolean bool2) {
        this.shippingAddress = address;
        this.addressReachable = bool;
        this.skuReachables = list;
        this.invalidHintMessage = str;
        this.addressValid = bool2;
    }
}
