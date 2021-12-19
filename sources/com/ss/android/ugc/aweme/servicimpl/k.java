package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bd;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.x.j;
import com.ss.android.ugc.aweme.tools.f;
import f.a.h.a;
import f.a.t;

final /* synthetic */ class k implements j {

    /* renamed from: a  reason: collision with root package name */
    private final j f121915a;

    static {
        Covode.recordClassIndex(79931);
    }

    k(j jVar) {
        this.f121915a = jVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.j
    public final void a(String str, String str2, String str3, int i2) {
        t a2;
        j jVar = this.f121915a;
        bj.a("MultiEditLog: concat statusCode".concat(String.valueOf(i2)));
        b.a.f132249a.step("av_video_edit", "concatEnd");
        f fVar = new f(str, str2, str3, i2);
        jVar.f121909h.f132687k.b();
        jVar.f121906e++;
        t a3 = t.a(new p(jVar.f121910i));
        ShortVideoContext shortVideoContext = jVar.f121910i;
        String str4 = fVar.f140196c;
        if (shortVideoContext.c()) {
            a2 = t.a(n.f121919a);
        } else {
            a2 = t.a(new o(jVar, shortVideoContext, str4)).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        }
        t.a(a3, a2, t.a(new q(jVar, fVar)).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)), l.f121916a).a(new m(jVar, fVar), bd.a.f132258a);
    }
}
