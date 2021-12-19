package com.ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.b.l;
import h.m.p;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87554a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(55036);
    }

    public static void a(c.a aVar, Map<String, ? extends Object> map, ProductPackStruct productPackStruct, SkuPrice skuPrice, int i2, String str) {
        String str2;
        String str3;
        String str4;
        float f2;
        Object obj;
        SellerInfo sellerInfo;
        String str5;
        Price realPrice;
        Price realPrice2;
        String priceVal;
        Float c2;
        Price realPrice3;
        String priceVal2;
        Float c3;
        ProductBase productBase;
        String str6 = "";
        l.d(aVar, str6);
        l.d(map, str6);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("author_id", map.get("author_id"));
        Object obj2 = map.get("source_page_type");
        if (l.a(obj2, (Object) "video")) {
            str2 = "ShortVideo";
        } else if (l.a(obj2, (Object) "live")) {
            str2 = "Live";
        } else if (l.a(obj2, (Object) "show_window")) {
            str2 = "ShowCase";
        } else {
            str2 = "Else";
        }
        jSONObject.put("screen_refer", str2);
        Object obj3 = map.get("source_page_type");
        if (l.a(obj3, (Object) "video")) {
            jSONObject.put("feed_id", map.get("source_content_id"));
        } else if (!l.a(obj3, (Object) "live")) {
            jSONObject.put("source_page_type", map.get("source_content_id"));
        } else if (map.get("room_id") != null) {
            jSONObject.put("room_id", map.get("room_id"));
        } else {
            jSONObject.put("room_id", map.get("source_content_id"));
        }
        if (productPackStruct == null || (str3 = productPackStruct.f86638b) == null) {
            str3 = str6;
        }
        jSONObject.put("content_id", str3);
        if (productPackStruct == null || (productBase = productPackStruct.f86641e) == null || (str4 = productBase.f86623a) == null) {
            str4 = str6;
        }
        jSONObject.put("content_name", str4);
        jSONObject.put("quantity", i2);
        float f3 = 0.0f;
        if (skuPrice == null || (realPrice3 = skuPrice.getRealPrice()) == null || (priceVal2 = realPrice3.getPriceVal()) == null || (c3 = p.c(priceVal2)) == null) {
            f2 = 0.0f;
        } else {
            f2 = c3.floatValue();
        }
        jSONObject.put("discount_price", Float.valueOf(f2));
        jSONObject.put("content_type", "product");
        jSONObject.put("page_type", str);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        aVar.b("contents", jSONArray);
        if (!(skuPrice == null || (realPrice2 = skuPrice.getRealPrice()) == null || (priceVal = realPrice2.getPriceVal()) == null || (c2 = p.c(priceVal)) == null)) {
            f3 = c2.floatValue();
        }
        aVar.b("value", Float.valueOf(f3 * ((float) i2)));
        aVar.b("quantity", Integer.valueOf(i2));
        if (skuPrice == null || (realPrice = skuPrice.getRealPrice()) == null || (obj = realPrice.getCurrency()) == null) {
            obj = str6;
        }
        aVar.b("currency", obj);
        aVar.b("is_ad_signal", 1);
        if (!(productPackStruct == null || (sellerInfo = productPackStruct.f86640d) == null || (str5 = sellerInfo.f86657a) == null)) {
            str6 = str5;
        }
        aVar.b("shop_id", str6);
    }
}
