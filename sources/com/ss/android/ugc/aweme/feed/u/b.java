package com.ss.android.ugc.aweme.feed.u;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.ss.android.ugc.aweme.global.config.settings.c;
import java.util.HashMap;
import java.util.concurrent.Callable;

final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f93973a;

    static {
        Covode.recordClassIndex(59773);
    }

    b(Object[] objArr) {
        this.f93973a = objArr;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        c cVar = (c) this.f93973a[0];
        if (g.a()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(cVar.f93974a)) {
            hashMap.put("item_id", cVar.f93974a);
        }
        if (cVar.f93975b > 0) {
            hashMap.put("share_delta", String.valueOf(cVar.f93975b));
        }
        if (cVar.f93976c > 0) {
            hashMap.put("play_delta", String.valueOf(cVar.f93976c));
        }
        if (cVar.f93977d > 0) {
            hashMap.put("download_delta", String.valueOf(cVar.f93977d));
        }
        if (cVar.f93978e >= 0) {
            hashMap.put("aweme_type", String.valueOf(cVar.f93978e));
        }
        if (cVar.f93979f >= 0) {
            hashMap.put("tab_type", String.valueOf(cVar.f93979f));
        }
        if (cVar.f93980g > 0) {
            hashMap.put("item_type", String.valueOf(cVar.f93980g));
        }
        String str = cVar.f93981h;
        if (str != null) {
            hashMap.put("stats_channel", str);
        }
        if (cVar.f93982i >= 0) {
            hashMap.put("follow_status", String.valueOf(cVar.f93982i));
        }
        if (cVar.f93983j >= 0) {
            hashMap.put("follower_status", String.valueOf(cVar.f93983j));
        }
        if (!TextUtils.isEmpty(cVar.f93984k)) {
            hashMap.put("origin_item_id", cVar.f93984k);
        }
        if (!TextUtils.isEmpty(cVar.f93985l)) {
            hashMap.put("origin_author_id", cVar.f93985l);
        }
        if (cVar.f93986m >= 0) {
            hashMap.put("origin_follow_status", String.valueOf(cVar.f93986m));
        }
        if (cVar.n >= 0) {
            hashMap.put("impr_order", String.valueOf(cVar.n));
        }
        if (cVar.o >= 0) {
            hashMap.put("last_impr_order", String.valueOf(cVar.o));
        }
        String str2 = cVar.p;
        if (str2 != null) {
            hashMap.put("order", str2);
        }
        String str3 = cVar.q;
        if (str3 != null) {
            hashMap.put("request_id", str3);
        }
        if (cVar.r > -1) {
            hashMap.put("session_id", String.valueOf(cVar.r));
        }
        if (cVar.s >= 0) {
            hashMap.put("origin_follower_status", String.valueOf(cVar.s));
        }
        hashMap.put("sync_origin", String.valueOf(cVar.t));
        hashMap.put("pre_item_id", cVar.u);
        hashMap.put("pre_item_playtime", cVar.v);
        hashMap.put("pre_hot_sentence", cVar.w);
        if (!TextUtils.isEmpty(cVar.x)) {
            hashMap.put("creative_id", cVar.x);
        }
        if (!TextUtils.isEmpty(cVar.z)) {
            hashMap.put("ad_id", cVar.z);
        }
        if (!TextUtils.isEmpty(cVar.y)) {
            hashMap.put("log_extra", cVar.y);
        }
        if (!TextUtils.isEmpty(cVar.A)) {
            hashMap.put("user_agent", cVar.A);
        }
        if (!TextUtils.isEmpty(cVar.B)) {
            hashMap.put("access", cVar.B);
        }
        if (!TextUtils.isEmpty(cVar.D)) {
            hashMap.put("google_aid", cVar.D);
        }
        if (!TextUtils.isEmpty(cVar.C)) {
            hashMap.put("package", cVar.C);
        }
        if (!TextUtils.isEmpty(cVar.E)) {
            hashMap.put("previous_page", cVar.E);
        }
        if (!TextUtils.isEmpty(cVar.F)) {
            hashMap.put("enter_from", cVar.F);
        }
        if (cVar.G == 1) {
            hashMap.put("is_ba", String.valueOf(cVar.G));
        }
        if (!TextUtils.isEmpty(cVar.H)) {
            hashMap.put("item_distribute_source", cVar.H);
        }
        hashMap.put("is_ad", String.valueOf(cVar.I));
        if (cVar.J > 0) {
            hashMap.put("item_source_category", String.valueOf(cVar.J));
        }
        hashMap.put("first_install_time", c.f99077a.f99078b.getFirstInstallTime().toString());
        hashMap.put("action_time", String.valueOf(System.currentTimeMillis() / 1000));
        AwemeStatsApi.f91915a.awemeStatsReport(hashMap).get();
        return null;
    }
}
