package com.ss.android.ugc.aweme.ecommercebase.dto;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import h.a.n;
import h.f.b.l;
import h.q;
import h.r;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(55172);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.dto.a$a  reason: collision with other inner class name */
    public static final class C2120a extends com.google.gson.b.a<Map<String, ? extends Object>> {
        static {
            Covode.recordClassIndex(55173);
        }

        C2120a() {
        }
    }

    private static final Map<String, Object> a(String str) {
        Object obj;
        Map<String, Object> map = null;
        if (str == null) {
            return null;
        }
        try {
            obj = q.m223constructorimpl((Map) new f().a(str, new C2120a().type));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        if (!q.m228isFailureimpl(obj)) {
            map = obj;
        }
        return map;
    }

    public static final String a(PromotionView promotionView, int i2) {
        List<PromotionItem> d2;
        l.d(promotionView, "");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (!(promotion_items == null || (d2 = n.d((Iterable) promotion_items, i2)) == null)) {
            for (PromotionItem promotionItem : d2) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                String voucherId = promotionItem.getVoucherId();
                if (voucherId == null) {
                    voucherId = "-1";
                }
                sb.append(voucherId);
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final String b(PromotionView promotionView, int i2) {
        List<PromotionItem> d2;
        l.d(promotionView, "");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (!(promotion_items == null || (d2 = n.d((Iterable) promotion_items, i2)) == null)) {
            for (PromotionItem promotionItem : d2) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getId());
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final String c(PromotionView promotionView, int i2) {
        List<PromotionItem> d2;
        l.d(promotionView, "");
        StringBuilder sb = new StringBuilder(64);
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (!(promotion_items == null || (d2 = n.d((Iterable) promotion_items, i2)) == null)) {
            for (PromotionItem promotionItem : d2) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(promotionItem.getName());
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }

    public static final String a(PromotionView promotionView, String str) {
        Object obj;
        l.d(promotionView, "");
        l.d(str, "");
        StringBuilder sb = new StringBuilder();
        List<PromotionItem> promotion_items = promotionView.getPromotion_items();
        if (promotion_items != null) {
            Iterator<T> it = promotion_items.iterator();
            while (it.hasNext()) {
                Map<String, Object> a2 = a(it.next().getLog_extra());
                if (!(a2 == null || (obj = a2.get(str)) == null)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(obj);
                }
            }
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        return sb2;
    }
}
