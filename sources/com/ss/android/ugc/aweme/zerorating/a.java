package com.ss.android.ugc.aweme.zerorating;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.api.d;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;

public final class a implements d {
    static {
        Covode.recordClassIndex(95036);
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void b() {
        r.onEventV3("data_saver_show");
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void c() {
        r.onEventV3("network_authorization_tab_show");
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void d() {
        r.onEventV3("data_plan_tab_show");
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void e() {
        r.onEventV3("data_plan_tab_click");
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void a() {
        r.a("zero_toast_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "feed").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void b(String str) {
        l.d(str, "");
        r.a("data_plan_list_show", new com.ss.android.ugc.aweme.app.f.d().a("plan_id_list", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void c(String str) {
        l.d(str, "");
        r.a("data_plan_detail_show", new com.ss.android.ugc.aweme.app.f.d().a("plan_id", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void a(String str) {
        l.d(str, "");
        r.a("network_authorization_switch", new com.ss.android.ugc.aweme.app.f.d().a("to_status", str).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.api.d
    public final void a(String str, String str2, String str3, String str4, String str5) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        l.d(str5, "");
        r.a("zero_rating_status", new com.ss.android.ugc.aweme.app.f.d().a("plan_id", str).a("start_date", str2).a("status", str3).a("network_carrier", str4).a("network_mccmnc", str5).f66730a);
    }
}
