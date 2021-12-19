package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.h;
import com.ss.android.ugc.aweme.dc.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import h.f.a.b;

final /* synthetic */ class al implements b {

    /* renamed from: a  reason: collision with root package name */
    private final a f77856a;

    static {
        Covode.recordClassIndex(48246);
    }

    al(a aVar) {
        this.f77856a = aVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        VideoControl videoControl;
        h hVar = (h) obj;
        Aweme aweme = this.f77856a.f77828c;
        boolean z = false;
        if (!(aweme == null || (videoControl = aweme.getVideoControl()) == null || videoControl.preventDownloadType == 3)) {
            z = true;
        }
        return i.b(i.a(hVar, z), true);
    }
}
