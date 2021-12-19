package com.ss.android.ugc.aweme.video.simplayer.tt;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.a.h;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.ss.android.ugc.aweme.video.simplayer.l;
import com.ss.android.ugc.playerkit.model.m;
import com.ss.ttm.player.b;
import com.ss.ttvideoengine.aj;
import com.ss.ttvideoengine.s.j;
import com.ss.ttvideoengine.s.k;
import java.util.concurrent.ExecutorService;

public class TTSimPlayerServiceImpl implements ISimPlayerService {
    static {
        Covode.recordClassIndex(94171);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void c() {
        aj.bB = false;
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final i b() {
        return new b(false);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final f a() {
        return new c(new h(new com.ss.android.ugc.aweme.player.sdk.a.i(m.e.TT)), false, new l());
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void a(final ISimPlayerService.a aVar) {
        j.f153284b = new k() {
            /* class com.ss.android.ugc.aweme.video.simplayer.tt.TTSimPlayerServiceImpl.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94172);
            }

            @Override // com.ss.ttvideoengine.s.k
            public final void a(String str) {
                aVar.a(str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void a(int i2) {
        int i3 = 1;
        if (i2 != 1) {
            i3 = 0;
        }
        j.a(i3);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final void a(ExecutorService executorService) {
        j.a("TTVideoEngine", "set player threadpool");
        b.a(executorService);
    }

    @Override // com.ss.android.ugc.aweme.video.simplayer.ISimPlayerService
    public final f a(boolean z, boolean z2) {
        return new d().a(z).b(z2).a();
    }
}
