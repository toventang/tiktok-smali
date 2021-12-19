package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.b.d;
import com.ss.android.ugc.aweme.choosemusic.h.d.a;
import com.ss.android.ugc.aweme.choosemusic.h.d.c;
import com.ss.android.ugc.aweme.choosemusic.model.an;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.common.r;

final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final v f71032a;

    /* renamed from: b  reason: collision with root package name */
    private final an f71033b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71034c;

    static {
        Covode.recordClassIndex(43734);
    }

    x(v vVar, an anVar, int i2) {
        this.f71032a = vVar;
        this.f71033b = anVar;
        this.f71034c = i2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        an anVar = this.f71033b;
        int i2 = this.f71034c;
        String str = "";
        r.a("sug_arrow_click", new a().a("words_source", "sug").a("search_position", "video_music").a("words_position", i2).a("words_content", anVar.getContent()).a("group_id", anVar.getWordRecord() != null ? anVar.getWordRecord().getId() : str).a("creation_id", b.f70721d).a(anVar.getExtraParam()).a("new_sug_session_id", c.f70567d).f70563a);
        a a2 = new a().a("action_type", "complete").a("enter_method", "sug").a("group_id", anVar.getWordRecord() != null ? anVar.getWordRecord().getId() : str).a("input_keyword", anVar.getExtraParam() != null ? anVar.getExtraParam().get("raw_query") : str).a("order", i2);
        if (anVar.getExtraParam() != null) {
            str = anVar.getExtraParam().get("impr_id");
        }
        r.a("search_trending_click", a2.a("query_id", str).a("search_keyword", anVar.getContent()).a("search_type", "video_music").a("words_type", "sug").a("new_sug_session_id", c.f70567d).f70563a);
        com.ss.android.ugc.d.a.c.a(new d(anVar.getContent()));
    }
}
