package com.ss.android.ugc.aweme.discover.mixfeed.e;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.b;
import com.ss.android.ugc.aweme.discover.e.p;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.ui.SearchMixUserCell;
import com.ss.android.ugc.aweme.discover.ui.bb;
import com.ss.android.ugc.aweme.search.j;
import java.util.List;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    public SearchMixUserCell f81770a;

    /* renamed from: b  reason: collision with root package name */
    public List<SearchUser> f81771b;

    static {
        Covode.recordClassIndex(50798);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        SearchMixUserCell searchMixUserCell = this.f81770a;
        if (searchMixUserCell != null) {
            return searchMixUserCell.a();
        }
        return null;
    }

    public e(View view, Context context) {
        super(view);
        SearchMixUserCell searchMixUserCell = new SearchMixUserCell(view, context, new bb.a() {
            /* class com.ss.android.ugc.aweme.discover.mixfeed.e.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50799);
            }

            @Override // com.ss.android.ugc.aweme.discover.ui.bb.a
            public final void a() {
                r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(new c().a("search_type", "user").a()));
                com.ss.android.ugc.d.a.c.a(new p(j.f121155c));
            }
        });
        this.f81770a = searchMixUserCell;
        searchMixUserCell.f82165m = false;
    }
}
