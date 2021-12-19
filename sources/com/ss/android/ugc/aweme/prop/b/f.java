package com.ss.android.ugc.aweme.prop.b;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.c.c;
import com.ss.android.ugc.aweme.sticker.model.g;

public class f implements s.b {
    g faceStickerBean;
    String mPreviousPage;

    static {
        Covode.recordClassIndex(76779);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public void onJumpToDetail(String str) {
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public boolean sendCustomRequest(b bVar, int i2) {
        return false;
    }

    public f() {
    }

    public void setFaceStickerBean(g gVar) {
        this.faceStickerBean = gVar;
    }

    public f(String str) {
        this.mPreviousPage = str;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public b getPresenter(int i2, e eVar) {
        b bVar = new b();
        bVar.a((com.ss.android.ugc.aweme.common.b) new c(this.mPreviousPage));
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public s.c getJumpToVideoParam(s.c cVar, Aweme aweme) {
        r.a("feed_enter", new d().a("enter_from", "prop_page").a("group_id", aweme.getAid()).a("tag_id", cVar.f70219d).a("rank_index", cVar.f70221f).a("process_id", cVar.f70220e).f66730a);
        cVar.f70216a = "from_sticker";
        cVar.f70217b = "sticker_id";
        cVar.f70218c = "prop_page";
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public com.ss.android.ugc.aweme.challenge.a.c onCreateDetailAwemeViewHolder(View view, String str, com.ss.android.ugc.aweme.challenge.d dVar) {
        return new i(view, str, dVar, new g(this));
    }
}
