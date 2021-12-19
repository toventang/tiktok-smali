package com.ss.android.ugc.aweme.discover.mixfeed.e;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.b;
import com.ss.android.ugc.aweme.discover.e.p;
import com.ss.android.ugc.aweme.discover.ui.be;
import com.ss.android.ugc.aweme.discover.ui.bg;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.j;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public bg f81754a;

    /* renamed from: b  reason: collision with root package name */
    public Music f81755b;

    static {
        Covode.recordClassIndex(50789);
    }

    @Override // com.ss.android.ugc.aweme.discover.adapter.b
    public final View I() {
        bg bgVar = this.f81754a;
        if (bgVar != null) {
            return bgVar.c();
        }
        return null;
    }

    public c(View view, Context context) {
        super(view);
        this.f81754a = new bg(view, context, false, new be.a() {
            /* class com.ss.android.ugc.aweme.discover.mixfeed.e.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(50790);
            }

            @Override // com.ss.android.ugc.aweme.discover.ui.be.a
            public final void a() {
                r.onEvent(MobClick.obtain().setEventName("check_more_result").setLabelName("general_search").setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("search_type", "music").a()));
                com.ss.android.ugc.d.a.c.a(new p(j.f121157e));
            }
        });
    }
}
