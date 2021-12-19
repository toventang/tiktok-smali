package com.ss.android.ugc.aweme.video.e;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.aweme.video.simcommon.a;
import com.ss.android.ugc.playerkit.videoview.d.i;
import com.ss.android.ugc.playerkit.videoview.d.j;
import com.ss.android.ugc.playerkit.videoview.d.l;
import com.ss.android.ugc.playerkit.videoview.d.n;

public final class b implements n {
    static {
        Covode.recordClassIndex(93831);
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j a(n.a aVar) {
        i a2 = aVar.a();
        String a3 = LocalVideoPlayerManager.a().a(a.a(a2.f148932a));
        if (TextUtils.isEmpty(a3)) {
            return aVar.a(a2);
        }
        bj.a("LocalVideoCache=>play video using cache,filePath:".concat(String.valueOf(a3)));
        j jVar = new j(a3);
        if (com.bytedance.ies.abmock.b.a().a(true, "force_software_play", 1) == 1) {
            jVar.f148936b = true;
        }
        return jVar;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j b(n.a aVar) {
        com.ss.android.ugc.playerkit.videoview.d.a b2 = aVar.b();
        String a2 = LocalVideoPlayerManager.a().a(a.a(b2.f148923a));
        if (TextUtils.isEmpty(a2)) {
            return aVar.a(b2);
        }
        bj.a("LocalVideoCache=>play audio using cache,filePath:".concat(String.valueOf(a2)));
        j jVar = new j(a2);
        if (com.bytedance.ies.abmock.b.a().a(true, "force_software_play", 1) == 1) {
            jVar.f148936b = true;
        }
        return jVar;
    }

    @Override // com.ss.android.ugc.playerkit.videoview.d.n
    public final j c(n.a aVar) {
        l c2 = aVar.c();
        String a2 = LocalVideoPlayerManager.a().a(a.a(c2.f148937a));
        if (TextUtils.isEmpty(a2)) {
            return aVar.a(c2);
        }
        bj.a("LocalVideoCache=>play subtitle using cache,filePath:".concat(String.valueOf(a2)));
        j jVar = new j(a2);
        if (com.bytedance.ies.abmock.b.a().a(true, "force_software_play", 1) == 1) {
            jVar.f148936b = true;
        }
        return jVar;
    }
}
