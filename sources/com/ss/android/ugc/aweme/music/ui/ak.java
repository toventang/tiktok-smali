package com.ss.android.ugc.aweme.music.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.discover.mob.l;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.login.c;
import com.ss.android.ugc.aweme.music.presenter.n;
import com.ss.android.ugc.aweme.music.presenter.o;

final /* synthetic */ class ak implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111884a;

    static {
        Covode.recordClassIndex(71911);
    }

    ak(ah ahVar) {
        this.f111884a = ahVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        ah ahVar = this.f111884a;
        if (ahVar.q != null) {
            ahVar.q.b();
        }
        n nVar = ahVar.ag;
        e activity = ahVar.getActivity();
        nVar.v = true;
        String str = "";
        if (!nVar.s) {
            r.a("favourite_song", new d().a("enter_from", nVar.n).a("process_id", nVar.w).a("music_id", nVar.f111604f != null ? nVar.f111604f.getMusicId() : str).a("group_id", nVar.o).f66730a);
        } else {
            r.a("cancel_favourite_song", new d().a("enter_from", nVar.n).a("process_id", nVar.w).a("music_id", nVar.f111604f != null ? nVar.f111604f.getMusicId() : str).a("group_id", nVar.o).f66730a);
        }
        if ((TextUtils.equals(nVar.f111607l, "search_result") || TextUtils.equals(nVar.f111607l, "general_search")) && !nVar.s) {
            ISearchResultStatistics a2 = SearchResultStatisticsImpl.a();
            if (nVar.f111604f != null && !TextUtils.isEmpty(nVar.f111604f.getMusicId())) {
                str = nVar.f111604f.getMusicId();
            }
            a2.a(new l("search_favourite", "single_song", str, TextUtils.equals(nVar.f111607l, "search_result")));
        }
        if (!b.g().isLogin()) {
            c.a(activity, "single_song", "click_favorite_music", (Bundle) null, new o(nVar, activity));
        } else {
            nVar.a(activity);
        }
    }
}
