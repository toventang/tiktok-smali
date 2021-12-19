package com.ss.android.ugc.aweme.duet.ui;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class b implements s.b {
    private WeakReference<e> activity;
    private final String hostId;

    static {
        Covode.recordClassIndex(52459);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final boolean sendCustomRequest(com.ss.android.ugc.aweme.common.e.b<? extends a<?, ?>> bVar, int i2) {
        return false;
    }

    public final WeakReference<e> getActivity() {
        return this.activity;
    }

    public final void setActivity(WeakReference<e> weakReference) {
        this.activity = weakReference;
    }

    public b(String str) {
        l.d(str, "");
        this.hostId = str;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final com.ss.android.ugc.aweme.common.e.b<? extends a<?, ?>> getPresenter(int i2, e eVar) {
        com.ss.android.ugc.aweme.common.e.b<? extends a<?, ?>> bVar = new com.ss.android.ugc.aweme.common.e.b<>();
        bVar.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.duet.a.b());
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final s.c getJumpToVideoParam(s.c cVar, Aweme aweme) {
        l.d(cVar, "");
        l.d(aweme, "");
        cVar.f70216a = "from_duet_detail";
        cVar.f70217b = "duet_id";
        cVar.f70218c = "duet_page";
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final c onCreateDetailAwemeViewHolder(View view, String str, d dVar) {
        l.d(view, "");
        return new c(this.hostId, view, str, dVar);
    }
}
