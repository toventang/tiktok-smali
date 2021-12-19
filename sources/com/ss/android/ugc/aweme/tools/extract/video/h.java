package com.ss.android.ugc.aweme.tools.extract.video;

import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.extract.a;
import com.ss.android.ugc.aweme.tools.extract.d;
import com.ss.android.ugc.aweme.tools.extract.l;

final /* synthetic */ class h implements l.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f140138a;

    /* renamed from: b  reason: collision with root package name */
    private final a f140139b;

    /* renamed from: c  reason: collision with root package name */
    private final j f140140c;

    static {
        Covode.recordClassIndex(91568);
    }

    h(Object obj, a aVar, j jVar) {
        this.f140138a = obj;
        this.f140139b = aVar;
        this.f140140c = jVar;
    }

    @Override // com.ss.android.ugc.aweme.tools.extract.l.a
    public final void a(boolean z) {
        Object obj = this.f140138a;
        a aVar = this.f140139b;
        j jVar = this.f140140c;
        if (z) {
            if ((obj instanceof VideoPublishEditModel) && !(aVar instanceof d)) {
                ((VideoPublishEditModel) obj).extractFramesModel = aVar.c();
            }
            jVar.b((Object) null);
            return;
        }
        jVar.b((Exception) new IllegalStateException("frame extractor fail"));
    }
}
