package com.ss.android.ugc.aweme.tools.mvtemplate.f;

import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e;
import h.f.b.l;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f140832a;

    static {
        Covode.recordClassIndex(91962);
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void pause() {
        e eVar = this.f140832a;
        if (eVar != null) {
            eVar.pause();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void stop() {
        e eVar = this.f140832a;
        if (eVar != null) {
            eVar.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final boolean isPlaying() {
        e eVar = this.f140832a;
        if (eVar != null) {
            return eVar.isPlaying();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void addPlayerListener(c cVar) {
        l.d(cVar, "");
        e eVar = this.f140832a;
        if (eVar != null) {
            eVar.addPlayerListener(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void tryResume(Video video) {
        l.d(video, "");
        e eVar = this.f140832a;
        if (eVar != null) {
            eVar.tryResume(video);
        }
    }

    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.c.a.e
    public final void wrap(TextureView textureView) {
        l.d(textureView, "");
        e eVar = this.f140832a;
        if (eVar != null) {
            eVar.wrap(textureView);
        }
    }

    public a(f fVar) {
        e eVar;
        com.ss.android.ugc.aweme.tools.mvtemplate.c.a aVar;
        com.ss.android.ugc.aweme.tools.mvtemplate.c.a.f aVVideoViewComponentFactory;
        if (fVar == null || (aVar = (com.ss.android.ugc.aweme.tools.mvtemplate.c.a) fVar.a(com.ss.android.ugc.aweme.tools.mvtemplate.c.a.class)) == null || (aVVideoViewComponentFactory = aVar.getAVVideoViewComponentFactory()) == null) {
            eVar = null;
        } else {
            eVar = aVVideoViewComponentFactory.create();
        }
        this.f140832a = eVar;
    }
}
