package com.bytedance.creativex.recorder.sticker.types.ar.arcore;

import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.j;
import com.bytedance.creativex.recorder.b.a.m;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.db;
import com.ss.android.ugc.aweme.shortvideo.dm;
import com.ss.android.ugc.aweme.shortvideo.dn;
import com.ss.android.ugc.aweme.sticker.presenter.e;
import com.ss.android.ugc.aweme.sticker.presenter.handler.b;
import com.ss.android.ugc.gamora.recorder.k.d;
import com.ss.android.ugc.gamora.recorder.l.f;
import h.f.b.l;

public final class SharedARStickerHandler extends b implements au, e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28491a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.choosemusic.a f28492b;

    /* renamed from: c  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.m.a f28493c;

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.b.b f28494d;

    /* renamed from: e  reason: collision with root package name */
    private final f f28495e;

    /* renamed from: f  reason: collision with root package name */
    private final d f28496f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.fragment.app.e f28497g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.sharedar.b f28498h;

    /* renamed from: i  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f28499i;

    /* renamed from: j  reason: collision with root package name */
    private final m f28500j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.filter.a.a f28501k;

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.a.a.a f28502l;

    static {
        Covode.recordClassIndex(16741);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(16742);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final ShortVideoContext b() {
        ac a2 = ae.a(this.f28497g, (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        l.b(shortVideoContext, "");
        return shortVideoContext;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
        com.ss.android.ugc.gamora.recorder.m.a aVar;
        b().a(false);
        if (db.b() && (aVar = this.f28493c) != null) {
            aVar.b(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        l.d(aVar, "");
        return com.ss.android.ugc.aweme.sharedar.e.b(aVar.f135378a);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        boolean z;
        String str;
        l.d(bVar, "");
        l.d(aVar, "");
        if (aVar.f135380c != com.ss.android.ugc.aweme.sticker.d.b.a.RECOVER) {
            this.f28498h.a(aVar.f135378a);
            b().a(true);
            if (aVar.f135380c == com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET) {
                z = true;
                SharedARModel sharedARModel = b().S;
                String str2 = null;
                if (sharedARModel != null) {
                    str = sharedARModel.getSharedARSessionId();
                } else {
                    str = null;
                }
                com.ss.android.ugc.aweme.account.model.a e2 = c.u.e();
                if (e2 != null) {
                    str2 = e2.i();
                }
                if (!(str == null || str.length() == 0 || str2 == null || str2.length() == 0)) {
                    this.f28498h.a(str, str2);
                }
            } else {
                z = false;
                SharedARModel sharedARModel2 = b().S;
                if (sharedARModel2 != null) {
                    sharedARModel2.setCurrentUserHost(true);
                }
            }
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
                com.ss.android.ugc.gamora.recorder.b.b bVar2 = this.f28494d;
                if (bVar2 != null) {
                    bVar2.setCurrentTab(com.ss.android.ugc.aweme.shortvideo.ae.f124885c, false);
                }
                d dVar = this.f28496f;
                if (dVar != null) {
                    dVar.d(false);
                }
            }
            if (db.b()) {
                com.ss.android.ugc.gamora.recorder.m.a aVar2 = this.f28493c;
                if (aVar2 != null) {
                    aVar2.a(com.ss.android.ugc.aweme.shortvideo.ae.f124884b, z);
                }
                if (z) {
                    com.ss.android.ugc.gamora.recorder.m.a aVar3 = this.f28493c;
                    if (aVar3 != null) {
                        aVar3.a(false);
                    }
                } else {
                    com.ss.android.ugc.gamora.recorder.m.a aVar4 = this.f28493c;
                    if (aVar4 != null) {
                        aVar4.b(false);
                    }
                }
            } else {
                com.ss.android.ugc.gamora.recorder.b.b bVar3 = this.f28494d;
                if (bVar3 != null) {
                    bVar3.setCurrentTab(com.ss.android.ugc.aweme.shortvideo.ae.f124884b, z);
                }
            }
            this.f28500j.c(true);
            f fVar = this.f28495e;
            if (fVar != null) {
                fVar.b(false);
            }
            this.f28499i.a(com.ss.android.ugc.aweme.tools.i.NORMAL);
            ShortVideoContext b2 = b();
            if (b2.f124757b.a()) {
                dn.a(b2);
                dm.d(b2);
                this.f28500j.a(new j(b2.f124757b.f124707b));
                com.ss.android.ugc.gamora.recorder.choosemusic.a aVar5 = this.f28492b;
                if (aVar5 != null) {
                    aVar5.handleCancelMusicResultEvent();
                }
            }
            com.bytedance.creativex.recorder.filter.a.a aVar6 = this.f28501k;
            if (aVar6 != null) {
                aVar6.setFilterDisable(true, "build_in");
            }
            this.f28502l.c(false);
            this.f28499i.f().f();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.e
    public final void a(int i2, int i3, int i4, String str) {
        this.f28498h.a(i2, i3, i4, str);
    }

    public SharedARStickerHandler(androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.sharedar.b bVar, com.bytedance.creativex.recorder.b.a.d dVar, m mVar, com.bytedance.creativex.recorder.filter.a.a aVar, com.bytedance.creativex.recorder.a.a.a aVar2) {
        l.d(eVar, "");
        l.d(bVar, "");
        l.d(dVar, "");
        l.d(mVar, "");
        l.d(aVar2, "");
        this.f28497g = eVar;
        this.f28498h = bVar;
        this.f28499i = dVar;
        this.f28500j = mVar;
        this.f28501k = aVar;
        this.f28502l = aVar2;
        this.f28492b = (com.ss.android.ugc.gamora.recorder.choosemusic.a) ApiCenter.a.a(eVar).b(com.ss.android.ugc.gamora.recorder.choosemusic.a.class);
        this.f28493c = (com.ss.android.ugc.gamora.recorder.m.a) ApiCenter.a.a(eVar).b(com.ss.android.ugc.gamora.recorder.m.a.class);
        this.f28494d = (com.ss.android.ugc.gamora.recorder.b.b) ApiCenter.a.a(eVar).b(com.ss.android.ugc.gamora.recorder.b.b.class);
        this.f28495e = (f) ApiCenter.a.a(eVar).b(f.class);
        this.f28496f = (d) ApiCenter.a.a(eVar).b(d.class);
    }
}
