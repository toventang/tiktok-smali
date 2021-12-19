package com.ss.android.ugc.aweme.shortvideo.ui.task;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.setting.bl;

public final class PreloadMusicListTask implements au, a {
    static {
        Covode.recordClassIndex(86429);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final boolean b() {
        return false;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.ui.task.a
    public final void a() {
        if (bl.a()) {
            l.f115658a.b().e();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        l.f115658a.b().f();
    }

    public PreloadMusicListTask(i iVar) {
        h.f.b.l.d(iVar, "");
        iVar.a(this);
    }
}
