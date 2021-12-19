package com.ss.android.ugc.aweme.mvtemplate.view;

import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.challenge.a.c;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.e.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import java.lang.ref.WeakReference;

public final class d implements s.b {
    private WeakReference<e> activity;

    static {
        Covode.recordClassIndex(72074);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final void onJumpToDetail(String str) {
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final boolean sendCustomRequest(b<? extends a<?, ?>> bVar, int i2) {
        return false;
    }

    public final WeakReference<e> getActivity() {
        return this.activity;
    }

    public final void setActivity(WeakReference<e> weakReference) {
        this.activity = weakReference;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final b<? extends a<?, ?>> getPresenter(int i2, e eVar) {
        b<? extends a<?, ?>> bVar = new b<>();
        bVar.a((com.ss.android.ugc.aweme.common.b) new com.ss.android.ugc.aweme.mvtemplate.a.b());
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final s.c getJumpToVideoParam(s.c cVar, Aweme aweme) {
        String str;
        l.d(cVar, "");
        l.d(aweme, "");
        cVar.f70216a = "from_detail_activity";
        cVar.f70217b = "movie_id";
        if (aweme.getUploadMiscInfoStruct().mvType == 1) {
            str = "jianying_mv_page";
        } else {
            str = "mv_page";
        }
        cVar.f70218c = str;
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.s.b
    public final c onCreateDetailAwemeViewHolder(View view, String str, com.ss.android.ugc.aweme.challenge.d dVar) {
        return new e(view, str, dVar);
    }
}
