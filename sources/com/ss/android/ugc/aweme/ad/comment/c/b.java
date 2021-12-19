package com.ss.android.ugc.aweme.ad.comment.c;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ad.comment.a.c;
import com.ss.android.ugc.aweme.ad.comment.d;
import com.ss.android.ugc.aweme.ad.comment.f;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class b extends com.ss.android.ugc.aweme.commercialize_ad_api.b.b<d> {

    /* renamed from: a  reason: collision with root package name */
    private f f65619a;

    static {
        Covode.recordClassIndex(40392);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        l.d(view, "");
        this.f65619a = (f) view;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, com.ss.android.ugc.aweme.commercialize_ad_api.a.c] */
    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.b.b
    public final /* synthetic */ void a(Context context, d dVar) {
        d dVar2 = dVar;
        l.d(context, "");
        l.d(dVar2, "");
        f fVar = this.f65619a;
        if (fVar != null) {
            fVar.setDataCenter(dVar2.f65623d);
        }
        f fVar2 = this.f65619a;
        if (fVar2 != null) {
            ac acVar = dVar2.f65620a;
            l.b(acVar, "");
            Aweme aweme = dVar2.f65621b;
            l.b(aweme, "");
            fVar2.a(acVar, aweme);
        }
        f fVar3 = this.f65619a;
        if (fVar3 != null) {
            c cVar = dVar2.f65622c;
            l.b(cVar, "");
            fVar3.setOnDislikeCommentAdListener(cVar);
        }
    }
}
