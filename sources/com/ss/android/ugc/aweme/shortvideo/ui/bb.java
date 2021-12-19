package com.ss.android.ugc.aweme.shortvideo.ui;

import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.sticker.a.b;
import com.ss.android.ugc.aweme.cz.a.d;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.n;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.a;
import com.ss.android.ugc.gamora.recorder.choosemusic.a.b;
import com.ss.android.ugc.gamora.recorder.sticker.c.f;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import h.f.b.l;
import h.p;

public final class bb implements f {

    /* renamed from: a  reason: collision with root package name */
    final e f131456a;

    /* renamed from: b  reason: collision with root package name */
    public final j f131457b;

    /* renamed from: c  reason: collision with root package name */
    private FaceStickerBean f131458c;

    /* renamed from: d  reason: collision with root package name */
    private final ShortVideoContext f131459d;

    static {
        Covode.recordClassIndex(86113);
    }

    private static boolean a() {
        c cVar = cr.a().f125295a;
        if (cVar != null && cVar.getMusicPriority() >= 0) {
            return false;
        }
        return true;
    }

    public final void a(FaceStickerBean faceStickerBean) {
        int i2;
        String forceBindMusicPath;
        if (!this.f131456a.isFinishing() && !this.f131459d.f124757b.b() && !this.f131459d.f124757b.c()) {
            dt dtVar = this.f131459d.f124757b.f124711f;
            if ((dtVar == null || dtVar.isEmpty()) && faceStickerBean != null && (!l.a(faceStickerBean, this.f131458c))) {
                if (faceStickerBean.isForceBind() && h.b(faceStickerBean.getMusicIds()) && a()) {
                    if (bc.a(faceStickerBean) == null || (forceBindMusicPath = faceStickerBean.getForceBindMusicPath()) == null || forceBindMusicPath.length() == 0) {
                        i2 = null;
                    } else {
                        i2 = 1;
                    }
                    a b2 = a.C3961a.b(this.f131456a);
                    if (b2 != null) {
                        b2.showMusicTips(i2);
                    }
                }
                this.f131458c = faceStickerBean;
            }
        }
    }

    public final void a(Effect effect, Effect effect2) {
        if (effect != null && b.a(effect)) {
            if (effect2 == null || !b.a(effect2)) {
                this.f131457b.b(true);
            }
        }
    }

    public final void a(FaceStickerBean faceStickerBean, boolean z) {
        boolean z2;
        String forceBindMusicPath;
        p<Effect, Boolean> stickerMusicCancelState;
        Boolean second;
        p<Effect, Boolean> stickerMusicCancelState2;
        Effect first;
        c cVar;
        l.d(faceStickerBean, "");
        if (!this.f131456a.isFinishing() && !this.f131459d.f124757b.b() && !this.f131459d.f124757b.c() && !this.f131459d.c()) {
            dt dtVar = this.f131459d.f124757b.f124711f;
            if (dtVar == null || dtVar.isEmpty()) {
                cr a2 = cr.a();
                l.b(a2, "");
                a2.n = Boolean.valueOf(faceStickerBean.isBusi());
                String str = null;
                if (!com.ss.android.ugc.aweme.port.in.c.u.a() && AVCommerceServiceImpl.h().a() && ((cVar = cr.a().f125295a) == null || !cVar.isCommerceMusic())) {
                    cr.a().a((c) null);
                    a b2 = a.C3961a.b(this.f131456a);
                    if (b2 != null) {
                        b2.clearMusic();
                    }
                }
                c a3 = bc.a(faceStickerBean);
                c cVar2 = cr.a().f125295a;
                if (a3 != null ? !(cVar2 != null && a3.getMusicPriority() < cVar2.getMusicPriority()) : !(cVar2 == null || cVar2.getMusicPriority() >= 0)) {
                    String valueOf = String.valueOf(faceStickerBean.getStickerId());
                    a b3 = a.C3961a.b(this.f131456a);
                    if (!(b3 == null || (stickerMusicCancelState2 = b3.getStickerMusicCancelState()) == null || (first = stickerMusicCancelState2.getFirst()) == null)) {
                        str = first.getEffectId();
                    }
                    if (l.a((Object) valueOf, (Object) str)) {
                        a b4 = a.C3961a.b(this.f131456a);
                        if (!(b4 == null || (stickerMusicCancelState = b4.getStickerMusicCancelState()) == null || (second = stickerMusicCancelState.getSecond()) == null)) {
                            z2 = second.booleanValue();
                        }
                        z2 = false;
                    } else {
                        if (FaceStickerBean.NONE == faceStickerBean || bc.a(faceStickerBean) == null || (forceBindMusicPath = faceStickerBean.getForceBindMusicPath()) == null || forceBindMusicPath.length() == 0) {
                            z2 = true;
                        }
                        z2 = false;
                    }
                    a b5 = a.C3961a.b(this.f131456a);
                    if (b5 != null) {
                        b5.onChooseMusicDone(z2, "", bc.a(faceStickerBean), faceStickerBean.getForceBindMusicPath());
                    }
                    d dVar = new d(z2, "", bc.a(faceStickerBean), faceStickerBean.getForceBindMusicPath(), !z);
                    cr.a().a(bc.a(faceStickerBean));
                    a b6 = a.C3961a.b(this.f131456a);
                    if (b6 != null) {
                        b6.handleChooseMusic(dVar);
                    }
                }
                if (!z) {
                    a(faceStickerBean);
                }
            }
        }
    }

    public bb(e eVar, m mVar, ShortVideoContext shortVideoContext, j jVar) {
        l.d(eVar, "");
        l.d(mVar, "");
        l.d(shortVideoContext, "");
        l.d(jVar, "");
        this.f131456a = eVar;
        this.f131459d = shortVideoContext;
        this.f131457b = jVar;
        jVar.j().a(mVar, new com.bytedance.als.m(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.bb.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bb f131460a;

            static {
                Covode.recordClassIndex(86114);
            }

            {
                this.f131460a = r1;
            }

            @Override // androidx.lifecycle.u, com.bytedance.als.m
            public final /* synthetic */ void onChanged(Object obj) {
                a b2;
                bb bbVar = this.f131460a;
                FaceStickerBean a2 = com.ss.android.ugc.aweme.sticker.p.f.a((Effect) obj, "");
                l.b(a2, "");
                bbVar.a(a2, com.ss.android.ugc.aweme.sticker.f.e.c(this.f131460a.f131457b));
                bb bbVar2 = this.f131460a;
                a b3 = a.C3961a.b(bbVar2.f131456a);
                if (b3 != null) {
                    b3.stopStickerBGM();
                }
                if (cr.a().f125295a != null && (b2 = a.C3961a.b(bbVar2.f131456a)) != null) {
                    b2.startPreviewMusic(false);
                }
            }
        });
        jVar.t().n().b().observe(mVar, new u(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.bb.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bb f131461a;

            static {
                Covode.recordClassIndex(86115);
            }

            {
                this.f131461a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                Effect effect;
                Boolean bool;
                a b2;
                a b3;
                p<Effect, Boolean> stickerMusicCancelState;
                p<Effect, Boolean> stickerMusicCancelState2;
                Effect effect2 = (Effect) obj;
                FaceStickerBean a2 = com.ss.android.ugc.aweme.sticker.p.f.a(effect2, "");
                l.b(a2, "");
                a b4 = a.C3961a.b(this.f131461a.f131456a);
                if (b4 == null || (stickerMusicCancelState2 = b4.getStickerMusicCancelState()) == null) {
                    effect = null;
                } else {
                    effect = stickerMusicCancelState2.getFirst();
                }
                a b5 = a.C3961a.b(this.f131461a.f131456a);
                if (b5 == null || (stickerMusicCancelState = b5.getStickerMusicCancelState()) == null) {
                    bool = null;
                } else {
                    bool = stickerMusicCancelState.getSecond();
                }
                if (!(effect2 == null || effect == null || bool == null || !(!l.a((Object) effect.getEffectId(), (Object) String.valueOf(a2.getStickerId()))) || (b3 = a.C3961a.b(this.f131461a.f131456a)) == null)) {
                    b3.setStickerMusicCancelState(null);
                }
                if (((a2 != null && a2.getEffectType() == 1) || g.b(a2) || a2.isBusi() || !com.ss.android.ugc.aweme.shortvideo.sticker.c.a(a2.getExtra(), "photosensitive")) && !com.ss.android.ugc.aweme.shortvideo.sticker.c.c(a2)) {
                    bb bbVar = this.f131461a;
                    bbVar.a(a2, com.ss.android.ugc.aweme.sticker.f.e.c(bbVar.f131457b));
                }
                if (com.ss.android.ugc.aweme.shortvideo.sticker.c.h(effect2) && cr.a().f125295a != null && (b2 = a.C3961a.b(this.f131461a.f131456a)) != null) {
                    b2.changeCancelMusicBtnVisible(false);
                }
            }
        });
        jVar.t().n().d().observe(mVar, new u(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.bb.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bb f131462a;

            static {
                Covode.recordClassIndex(86116);
            }

            {
                this.f131462a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                a b2;
                n nVar = (n) obj;
                Effect effect = nVar.f135422a;
                if (effect != null && (!l.a(effect, nVar.f135423b))) {
                    FaceStickerBean a2 = com.ss.android.ugc.aweme.sticker.p.f.a(effect, "");
                    l.b(a2, "");
                    if (a2.isForceBind()) {
                        c a3 = bc.a(a2);
                        c cVar = cr.a().f125295a;
                        if (!(a3 == null || cVar == null || !l.a((Object) a3.getMusicId(), (Object) cVar.getMusicId()) || (b2 = a.C3961a.b(this.f131462a.f131456a)) == null)) {
                            b2.clearMusic();
                        }
                    }
                }
                this.f131462a.a(nVar.f135422a, nVar.f135423b);
            }
        });
        jVar.t().n().e().observe(mVar, new u(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.bb.AnonymousClass4 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bb f131463a;

            static {
                Covode.recordClassIndex(86117);
            }

            {
                this.f131463a = r1;
            }

            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Object obj) {
                com.ss.android.ugc.aweme.sticker.presenter.l lVar = (com.ss.android.ugc.aweme.sticker.presenter.l) obj;
                this.f131463a.a(lVar.f135420a.f135418a, lVar.f135421b.f135418a);
            }
        });
        jVar.b().a(mVar, new com.bytedance.als.m(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.bb.AnonymousClass5 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bb f131464a;

            static {
                Covode.recordClassIndex(86118);
            }

            {
                this.f131464a = r1;
            }

            @Override // androidx.lifecycle.u, com.bytedance.als.m
            public final /* synthetic */ void onChanged(Object obj) {
                com.bytedance.creativex.recorder.sticker.a.b bVar = (com.bytedance.creativex.recorder.sticker.a.b) obj;
                if (bVar instanceof b.a) {
                    Effect effect = ((b.a) bVar).f28380a;
                    bb bbVar = this.f131464a;
                    FaceStickerBean a2 = com.ss.android.ugc.aweme.sticker.p.f.a(effect, "");
                    l.b(a2, "");
                    bbVar.a(a2, com.ss.android.ugc.aweme.sticker.f.e.c(this.f131464a.f131457b));
                }
            }
        });
        jVar.d().a(mVar, new com.bytedance.als.m(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.bb.AnonymousClass6 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ bb f131465a;

            static {
                Covode.recordClassIndex(86119);
            }

            {
                this.f131465a = r1;
            }

            @Override // androidx.lifecycle.u, com.bytedance.als.m
            public final /* synthetic */ void onChanged(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    bb bbVar = this.f131465a;
                    bbVar.a(bbVar.f131457b.i());
                }
            }
        });
    }
}
