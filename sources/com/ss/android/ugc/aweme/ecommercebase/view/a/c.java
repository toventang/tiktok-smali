package com.ss.android.ugc.aweme.ecommercebase.view.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(55182);
    }

    public static final boolean a(PromotionItem promotionItem) {
        GImage icon;
        List<String> urls;
        Integer num = null;
        if (promotionItem != null) {
            num = promotionItem.getStyle();
        }
        if ((num != null && num.intValue() == 1) || promotionItem == null || (icon = promotionItem.getIcon()) == null || (urls = icon.getUrls()) == null || urls.isEmpty()) {
            return false;
        }
        return true;
    }
}
