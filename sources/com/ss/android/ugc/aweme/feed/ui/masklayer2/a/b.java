package com.ss.android.ugc.aweme.feed.ui.masklayer2.a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.a;
import com.ss.android.ugc.aweme.feed.ui.masklayer2.f;
import com.ss.android.ugc.aweme.mix.b.i;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.utils.z;
import com.ss.android.ugc.d.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends n {

    /* renamed from: a  reason: collision with root package name */
    public final a f94871a;

    static {
        Covode.recordClassIndex(60171);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.masklayer2.a.f
    public final void a(View view) {
        l.d(view, "");
        if (this.f94901f != null) {
            Aweme aweme = this.f94901f;
            if (aweme == null) {
                l.b();
            }
            if (aweme.playlistBlocked) {
                IMixFeedService k2 = MixFeedService.k();
                Context context = view.getContext();
                l.b(context, "");
                k2.a(context);
            } else if (!z.b(this.f94901f)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(view.getContext()).a(R.string.gj5).a();
            } else if (MixFeedService.k().a(this.f94901f)) {
                c.a(new i(this.f94901f, this.f94871a.f94866c));
            } else {
                c.a(new com.ss.android.ugc.aweme.mix.b.a(this.f94901f));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, f fVar) {
        super(aVar, fVar);
        l.d(aVar, "");
        l.d(fVar, "");
        this.f94871a = aVar;
    }
}
