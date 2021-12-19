package com.ss.android.ugc.aweme.feed.adapter;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.extensions.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.assem.b;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class VideoBaseCell$dispatcher$1 implements k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VideoBaseCell f91525a;

    static {
        Covode.recordClassIndex(57584);
    }

    VideoBaseCell$dispatcher$1(VideoBaseCell videoBaseCell) {
        this.f91525a = videoBaseCell;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        l.d(mVar, "");
        l.d(aVar, "");
        com.bytedance.assem.arch.extensions.k kVar = j.f25647b;
        if (kVar != null) {
            kVar.a("AssemList", "dispatcher: cell=" + this.f91525a + ", cellProxy=" + this.f91525a.n + ", rootAssem=" + this.f91525a.o + ", event=" + aVar + ", currentState: " + this.f91525a.getLifecycle().a());
        }
        b bVar = this.f91525a.o;
        if (bVar != null) {
            switch (ba.f91672c[aVar.ordinal()]) {
                case 1:
                    if (bVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                        bVar.f();
                    } else {
                        if (bVar.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                            bVar.l();
                        }
                        if (bVar.f25546d.a().compareTo((Enum) i.b.CREATED) > 0) {
                            bVar.n();
                        }
                    }
                    bVar.f25546d.a(i.a.ON_CREATE);
                    return;
                case 2:
                    if (bVar.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                        if (bVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                            bVar.f();
                        }
                        bVar.bO_();
                    } else if (bVar.f25546d.a().compareTo((Enum) i.b.STARTED) > 0) {
                        bVar.l();
                    }
                    bVar.f25546d.a(i.a.ON_START);
                    return;
                case 3:
                    if (bVar.f25546d.a().compareTo((Enum) i.b.RESUMED) < 0) {
                        if (bVar.f25546d.a().compareTo((Enum) i.b.CREATED) < 0) {
                            bVar.f();
                        }
                        if (bVar.f25546d.a().compareTo((Enum) i.b.STARTED) < 0) {
                            bVar.bO_();
                        }
                        bVar.j();
                    }
                    bVar.f25546d.a(i.a.ON_RESUME);
                    return;
                case 4:
                    bVar.f25546d.a(i.a.ON_PAUSE);
                    bVar.l();
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    bVar.f25546d.a(i.a.ON_STOP);
                    bVar.n();
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    bVar.f25546d.a(i.a.ON_DESTROY);
                    bVar.p();
                    return;
                default:
                    return;
            }
        }
    }
}
