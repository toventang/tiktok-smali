package com.ss.android.ugc.aweme.ttep;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.a.a;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.ch;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.ss.android.ugc.aweme.shortvideo.dc;
import com.ss.android.ugc.aweme.shortvideo.ui.f;
import com.ss.android.ugc.gamora.recorder.b.b;
import com.ss.android.ugc.gamora.recorder.choosemusic.a;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TTEPEffectPreviewActivity f141223a;

    static {
        Covode.recordClassIndex(92211);
    }

    aa(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
        this.f141223a = tTEPEffectPreviewActivity;
    }

    public final void run() {
        d a2;
        c cVar;
        TTEPEffectPreviewActivity tTEPEffectPreviewActivity = this.f141223a;
        ch chVar = tTEPEffectPreviewActivity.s;
        q.a("addFragment onFragmentActivityCreated PlanC");
        f.a(tTEPEffectPreviewActivity.v);
        if (chVar instanceof dc) {
            tTEPEffectPreviewActivity.f141214l = (FrameLayout) tTEPEffectPreviewActivity.findViewById(R.id.c7a);
            q.a("addFragment onFragmentActivityCreated initFilterModule");
            tTEPEffectPreviewActivity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(92203);
                }

                public final void onGlobalLayout() {
                    a aVar = (a) TTEPEffectPreviewActivity.this.f141208f.b(a.class, null);
                    if (aVar != null) {
                        aVar.c();
                    }
                    TTEPEffectPreviewActivity.this.s().c();
                    TTEPEffectPreviewActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
            j q = tTEPEffectPreviewActivity.q();
            q.K();
            q.n();
            com.ss.android.ugc.aweme.shortvideo.ui.task.f.a(new h(tTEPEffectPreviewActivity, q));
            tTEPEffectPreviewActivity.q().C().a();
            if (tTEPEffectPreviewActivity.z == null) {
                tTEPEffectPreviewActivity.z = (com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a) tTEPEffectPreviewActivity.f141207e.getValue().a(com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a.class);
            }
            if (tTEPEffectPreviewActivity.getIntent() != null && (((a2 = com.ss.android.ugc.aweme.port.in.c.f115629h.a(tTEPEffectPreviewActivity.getIntent().getSerializableExtra("music_wave_data"))) != null && k.b.a(a2.getMusicWavePointArray())) || ((cVar = cr.a().f125295a) != null && k.b.a(cVar.getMusicWaveData()) && (a2 = k.b(cVar)) != null && k.b.a(a2.getMusicWavePointArray())))) {
                if (tTEPEffectPreviewActivity.z != null) {
                    tTEPEffectPreviewActivity.z.a(true);
                }
                tTEPEffectPreviewActivity.f141209g.aw = k.a(a2);
            } else if (tTEPEffectPreviewActivity.f141209g.f124757b.y != null) {
                k.a(tTEPEffectPreviewActivity.f141209g.f124757b.y, new i(tTEPEffectPreviewActivity));
            }
            if (tTEPEffectPreviewActivity.f141209g != null) {
                b bVar = (b) ApiCenter.a.a(tTEPEffectPreviewActivity).b(b.class);
                if (tTEPEffectPreviewActivity.s == null || bVar == null) {
                    com.ss.android.ugc.aweme.shortvideo.n.c.a(tTEPEffectPreviewActivity.f141209g.r);
                } else {
                    bVar.isZTLiveSwitch();
                    com.ss.android.ugc.aweme.shortvideo.n.c.a(tTEPEffectPreviewActivity.f141209g.r);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.n.b.f129514c.a(tTEPEffectPreviewActivity.f141209g.o).observe(tTEPEffectPreviewActivity, new z(tTEPEffectPreviewActivity));
            ((b) ApiCenter.a.a(tTEPEffectPreviewActivity).a(b.class)).getBottomTabIndexChangeEvent().a(tTEPEffectPreviewActivity, new m<com.ss.android.ugc.gamora.recorder.b.c>() {
                /* class com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(92204);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u, com.bytedance.als.m
                public final /* synthetic */ void onChanged(com.ss.android.ugc.gamora.recorder.b.c cVar) {
                    boolean z;
                    String obj = cVar.f147371c.toString();
                    if (obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f_2)) || obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f_4)) || obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f_3)) || obj.equals(TTEPEffectPreviewActivity.this.getString(R.string.f_g))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    com.ss.android.ugc.gamora.recorder.sticker.c.k.a(TTEPEffectPreviewActivity.this.G, z);
                }
            });
            if (tTEPEffectPreviewActivity.f141209g.f124757b.f124714i) {
                com.ss.android.ugc.gamora.recorder.k.a aVar = (com.ss.android.ugc.gamora.recorder.k.a) ApiCenter.a.a(tTEPEffectPreviewActivity).a(com.ss.android.ugc.gamora.recorder.k.a.class);
                aVar.a(tTEPEffectPreviewActivity.f141209g.n());
                aVar.a(0);
                tTEPEffectPreviewActivity.D.x();
            }
            if (tTEPEffectPreviewActivity.f141209g.c()) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a a3 = a.C3961a.a(tTEPEffectPreviewActivity);
                if (com.ss.android.ugc.aweme.shortvideo.record.b.a.b(tTEPEffectPreviewActivity.f141209g.F.f124773a)) {
                    cr.a().a(tTEPEffectPreviewActivity.f141209g.F.f124773a.getMusic());
                    a3.handleChooseMusic(new com.ss.android.ugc.aweme.cz.a.d(false, "", tTEPEffectPreviewActivity.f141209g.F.f124773a.getMusic(), tTEPEffectPreviewActivity.f141209g.F.f124773a.getMusicPath(), true));
                } else {
                    cr.a().a((c) null);
                }
                a3.initStitch();
            }
            if (tTEPEffectPreviewActivity.o) {
                tTEPEffectPreviewActivity.f141210h.post(new Runnable() {
                    /* class com.ss.android.ugc.aweme.ttep.TTEPEffectPreviewActivity.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(92205);
                    }

                    public final void run() {
                        if (TTEPEffectPreviewActivity.this.r() != null) {
                            TTEPEffectPreviewActivity.this.r().a(true);
                        }
                    }
                });
            }
            if (tTEPEffectPreviewActivity.getIntent().getBooleanExtra("from_special_plus", false)) {
                new SuperEntranceEvent(3, false).post();
            }
        }
    }
}
