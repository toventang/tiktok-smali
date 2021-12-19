package com.ss.android.ugc.aweme.choosemusic.c;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.choosemusic.e.c;
import com.ss.android.ugc.aweme.choosemusic.h.a.a;
import com.ss.android.ugc.aweme.choosemusic.h.c.b;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;

final /* synthetic */ class k implements u {

    /* renamed from: a  reason: collision with root package name */
    private final j f70488a;

    static {
        Covode.recordClassIndex(43463);
    }

    k(j jVar) {
        this.f70488a = jVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        j jVar = this.f70488a;
        Integer num = (Integer) obj;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                aj value = jVar.f70485l.c().getValue();
                if (value != null && value.f70626b == 3) {
                    String str = value.f70627c;
                    r.a("search_sug", new d().a("action_type", "click").a("log_pb", ac.a.f91473a.a(jVar.r)).a("sug_keyword", jVar.q).a("search_keyword", str).a("search_type", "video_music").a("order", value.f70629e).f66730a);
                }
            } else if (intValue == 1) {
                jVar.c();
            } else if (intValue == 2) {
                jVar.n();
                jVar.d();
                jVar.m();
                if (jVar.f70484k == null) {
                    jVar.f70484k = new a(jVar.getActivity());
                }
                if (jVar.f70479b.getAdapter() != jVar.f70484k) {
                    jVar.f70479b.setAdapter(jVar.f70484k);
                }
                jVar.f70478a.f70555c.f70564a = c.g().e();
                b bVar = jVar.f70478a;
                bVar.f70556d = jVar.q;
                bVar.f70557e = "music_create";
                bVar.f70554b.removeCallbacks(bVar.f70558f);
                bVar.f70554b.postDelayed(bVar.f70558f, 150);
            }
        }
    }
}
