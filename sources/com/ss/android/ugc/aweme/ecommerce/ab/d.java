package com.ss.android.ugc.aweme.ecommerce.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.a.n;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final i f84210a = new i(n.c("entrance_form", "rec_content_id", "rec_content_type", "source_page_type", "enter_from_info", "action_type", "enter_from_merge", "source_content_id", "source_page_type", "search_id", "search_result_id"), n.c("entrance_form", "rec_content_id", "rec_content_type", "source_page_type", "enter_from_info", "action_type", "enter_from_merge", "source_content_id", "source_page_type", "search_id", "search_result_id", "author_id"));

    /* renamed from: b  reason: collision with root package name */
    public static final d f84211b = new d();

    private d() {
    }

    public static final i a() {
        SettingsManager a2 = SettingsManager.a();
        i iVar = f84210a;
        i iVar2 = (i) a2.a("ecom_order_config", i.class, iVar);
        return iVar2 == null ? iVar : iVar2;
    }

    static {
        Covode.recordClassIndex(52520);
    }
}
