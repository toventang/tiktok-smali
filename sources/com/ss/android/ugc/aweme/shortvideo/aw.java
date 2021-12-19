package com.ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bd;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.x.j;
import com.ss.android.ugc.aweme.tools.f;
import f.a.h.a;
import f.a.t;

final /* synthetic */ class aw implements j {

    /* renamed from: a  reason: collision with root package name */
    private final av f124982a;

    static {
        Covode.recordClassIndex(82101);
    }

    aw(av avVar) {
        this.f124982a = avVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.x.j
    public final void a(String str, String str2, String str3, int i2) {
        t a2;
        av avVar = this.f124982a;
        bj.a("MultiEditLog: concat statusCode".concat(String.valueOf(i2)));
        b.a.f132249a.step("av_video_edit", "concatEnd");
        f fVar = new f(str, str2, str3, i2);
        avVar.f124978h.f132687k.b();
        avVar.f124975e++;
        t<com.google.c.a.j<d>> a3 = av.a(avVar.f124979i);
        ShortVideoContext shortVideoContext = avVar.f124979i;
        String str4 = fVar.f140196c;
        if (shortVideoContext.c()) {
            a2 = t.a(az.f124986a);
        } else {
            a2 = t.a(new ba(avVar, shortVideoContext, str4)).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        }
        t.a(a3, a2, t.a(new bc(avVar, fVar)).b(a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)), ax.f124983a).a(new ay(avVar, fVar), bd.a.f132258a);
    }
}
