package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.a.a;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class av implements bb {

    /* renamed from: a  reason: collision with root package name */
    private final c f139414a;

    /* renamed from: b  reason: collision with root package name */
    private m<? super Boolean, ? super String, z> f139415b;

    /* renamed from: c  reason: collision with root package name */
    private a<z> f139416c;

    static {
        Covode.recordClassIndex(91151);
    }

    @Override // com.ss.android.ugc.aweme.tools.draft.bb
    public final void a() {
        com.ss.android.ugc.aweme.shortvideo.c cVar = this.f139414a.f83185f;
        l.b(cVar, "");
        if (ax.a(cVar)) {
            c cVar2 = this.f139414a;
            com.ss.android.ugc.aweme.shortvideo.c cVar3 = cVar2.f83185f;
            l.b(cVar3, "");
            cVar2.f83187h = ax.b(cVar3);
            bj.b("draft_music_process, Local Music exist, path: " + this.f139414a.f83187h);
            m<? super Boolean, ? super String, z> mVar = this.f139415b;
            if (mVar != null) {
                mVar.invoke(true, null);
            }
            a<z> aVar = this.f139416c;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        bj.b("draft_music_process, Local Music not exist, path: " + this.f139414a.f83187h);
        m<? super Boolean, ? super String, z> mVar2 = this.f139415b;
        if (mVar2 != null) {
            mVar2.invoke(false, null);
        }
        a<z> aVar2 = this.f139416c;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public av(c cVar, m<? super Boolean, ? super String, z> mVar, a<z> aVar) {
        l.d(cVar, "");
        this.f139414a = cVar;
        this.f139415b = mVar;
        this.f139416c = aVar;
    }
}
