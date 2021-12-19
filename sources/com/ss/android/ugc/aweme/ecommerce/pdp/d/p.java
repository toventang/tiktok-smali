package com.ss.android.ugc.aweme.ecommerce.pdp.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import h.f.b.l;

public final class p {
    static {
        Covode.recordClassIndex(54163);
    }

    public static final o a(ProductPackStruct productPackStruct) {
        Image image;
        String str;
        String str2;
        String str3;
        l.d(productPackStruct, "");
        SellerInfo sellerInfo = productPackStruct.f86640d;
        Long l2 = null;
        if (sellerInfo != null) {
            image = sellerInfo.f86659c;
        } else {
            image = null;
        }
        SellerInfo sellerInfo2 = productPackStruct.f86640d;
        if (sellerInfo2 == null || (str = sellerInfo2.f86658b) == null) {
            str = "";
        }
        SellerInfo sellerInfo3 = productPackStruct.f86640d;
        if (sellerInfo3 != null) {
            l2 = sellerInfo3.f86660d;
        }
        SellerInfo sellerInfo4 = productPackStruct.f86640d;
        if (sellerInfo4 == null || (str2 = sellerInfo4.f86661e) == null) {
            str2 = "";
        }
        SellerInfo sellerInfo5 = productPackStruct.f86640d;
        if (sellerInfo5 == null || (str3 = sellerInfo5.f86662f) == null) {
            str3 = "";
        }
        return new o(image, str, l2, str2, str3);
    }
}
