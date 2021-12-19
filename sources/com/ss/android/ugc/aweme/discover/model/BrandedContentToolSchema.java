package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BrandedContentToolSchema {
    @c(a = "ba_bc_schema")
    public final String baBcSchema = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=branded-content%2Ftemplate.js&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_ba_lynx_v2%2Fbranded-content%3Fpage_module%3Doverview&page_module=overview";
    @c(a = "ba_view_insights_schema")
    public final String baViewInsightsSchema = "aweme://lynxview/?channel=tiktok_ba_lynx_v2&bundle=branded-content%2Ftemplate.js&hide_nav_bar=1&use_bdx=1&trans_status_bar=1&group=tiktok_ba_lynx_v2&hide_status_bar=0&fallback_url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Ftiktok_ba_lynx_v2%2Fbranded-content%3Fbct_insight_path%3Ddetail%26page_module%3Dinsight&bct_insight_path=detail&enable_canvas=1&page_module=insight";
    @c(a = "branded_content_info")
    public final String brandedContentInfo;
    @c(a = "branded_content_policy")
    public final String brandedContentPolicy;

    static {
        Covode.recordClassIndex(50872);
    }
}
