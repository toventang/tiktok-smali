package com.ss.android.ugc.aweme.share.d;

import android.app.Activity;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.share.improve.a.k;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.f.b.l;
import java.util.Objects;

public final class e implements u<Aweme> {
    static {
        Covode.recordClassIndex(81061);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Aweme aweme) {
        Activity j2;
        String str;
        Aweme aweme2 = aweme;
        if (aweme2 != null && (j2 = f.j()) != null) {
            String aid = aweme2.getAid();
            Aweme aweme3 = c.f123453e;
            if (aweme3 != null) {
                str = aweme3.getAid();
            } else {
                str = null;
            }
            if (l.a((Object) aid, (Object) str)) {
                c.f123456h++;
            } else {
                c.f123456h = 0;
            }
            h hVar = ah.f123353b.a(j2, aweme2, c.f123454f, "retry");
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.share.improve.action.DownloadAction");
            ((k) hVar).a(aweme2, j2, c.f123458j, c.f123457i, false);
        }
    }
}
