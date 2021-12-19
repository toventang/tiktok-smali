package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.f;
import com.ss.android.ugc.aweme.music.service.b;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.musicprovider.d;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public Activity f112068a;

    /* renamed from: b  reason: collision with root package name */
    public a f112069b;

    /* renamed from: c  reason: collision with root package name */
    public Effect f112070c;

    /* renamed from: d  reason: collision with root package name */
    public Effect f112071d;

    /* renamed from: e  reason: collision with root package name */
    private d f112072e;

    /* renamed from: f  reason: collision with root package name */
    private f f112073f;

    /* renamed from: g  reason: collision with root package name */
    private bf f112074g;

    public interface a {
        static {
            Covode.recordClassIndex(72033);
        }

        void a(MusicModel musicModel);

        void a(MusicModel musicModel, boolean z);

        void a(Effect effect, MusicModel musicModel);

        void a(String str, MusicModel musicModel, int i2);

        void a_(int i2, boolean z);

        void bS_();

        boolean bT_();

        void e_(boolean z);
    }

    static {
        Covode.recordClassIndex(72027);
    }

    public static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void b() {
        this.f112068a = null;
        com.ss.android.ugc.aweme.music.f fVar = this.f112073f;
        if (fVar != null) {
            fVar.a();
        }
        bf bfVar = this.f112074g;
        if (bfVar != null) {
            bfVar.a();
        }
        if (this.f112069b != null) {
            this.f112069b = null;
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.music.f fVar = this.f112073f;
        if (fVar != null && this.f112074g == null) {
            fVar.a(str);
        }
        bf bfVar = this.f112074g;
        if (bfVar != null) {
            bfVar.b();
        }
    }

    public w(Activity activity, a aVar) {
        this(activity, aVar, true);
    }

    public static void a(String str, long j2) {
        double d2;
        long length = new File(str).length();
        if (j2 == 0) {
            d2 = 0.0d;
        } else {
            d2 = (double) (length / j2);
        }
        o.a("aweme_music_detail_download_success_rate", new c().a("duration", Long.valueOf(j2)).a("speed", Double.valueOf(d2)).a("size", Long.valueOf(length)).a("fileName", str).a());
    }

    public w(Activity activity, a aVar, boolean z) {
        this.f112068a = activity;
        this.f112072e = new d();
        com.ss.android.ugc.aweme.music.f fVar = new com.ss.android.ugc.aweme.music.f(this.f112068a, z, true, true, "music_detail_page");
        this.f112073f = fVar;
        fVar.f111468a = 2;
        this.f112069b = aVar;
    }

    public final void a(MusicModel musicModel, String str, int i2, boolean z) {
        b(musicModel, str, i2, z);
    }

    private void b(MusicModel musicModel, String str, int i2, boolean z) {
        this.f112072e.b();
        if (this.f112068a != null) {
            IExternalService a2 = AVExternalServiceImpl.a();
            if (a2 == null || !a2.configService().avsettingsConfig().needLoginBeforeRecord()) {
                bb shortVideoPluginService = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getShortVideoPluginService();
                com.bytedance.ies.ugc.appcontext.d.a();
                shortVideoPluginService.a(new bb.a(musicModel, str, true, i2, z) {
                    /* class com.ss.android.ugc.aweme.music.ui.w.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ MusicModel f112075a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ String f112076b;

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ boolean f112077c = true;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ boolean f112078d = false;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ int f112079e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ boolean f112080f;

                    static {
                        Covode.recordClassIndex(72028);
                    }

                    @Override // com.ss.android.ugc.aweme.port.in.bb.a
                    public final void onSuccess() {
                        w wVar = w.this;
                        MusicModel musicModel = this.f112075a;
                        String str = this.f112076b;
                        boolean z = this.f112077c;
                        boolean z2 = this.f112078d;
                        int i2 = this.f112079e;
                        boolean z3 = this.f112080f;
                        if (!j.f107229h || !j.b() || j.c()) {
                            j.f107229h = w.a();
                        }
                        if (!j.f107229h) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(wVar.f112068a).a(R.string.de8).a();
                        } else {
                            wVar.a(musicModel, str, false, z, z2, i2, z3);
                        }
                    }

                    {
                        this.f112075a = r3;
                        this.f112076b = r4;
                        this.f112079e = r6;
                        this.f112080f = r7;
                    }
                });
                return;
            }
            this.f112069b.bS_();
        }
    }

    public final void a(final MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, final int i2, final boolean z4) {
        if (musicModel != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            com.ss.android.ugc.aweme.framework.a.a.b(4, "Music Download", "ID：" + musicModel.getId());
            if (!AVExternalServiceImpl.a().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload() || z3) {
                this.f112073f.a(musicModel, new b() {
                    /* class com.ss.android.ugc.aweme.music.ui.w.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(72032);
                    }

                    @Override // com.ss.android.ugc.aweme.music.service.b
                    public final void a() {
                    }

                    @Override // com.ss.android.ugc.aweme.music.service.b
                    public final void b() {
                        if (w.this.f112068a != null) {
                            w.this.f112068a.runOnUiThread(new ad(this, musicModel));
                            w.this.f112069b.a(musicModel);
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.music.service.b
                    public final void a(int i2) {
                        if (w.this.f112068a != null) {
                            w.this.f112068a.runOnUiThread(new af(this, i2));
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.music.service.b
                    public final void a(com.ss.android.ugc.musicprovider.a aVar) {
                        if (w.this.f112068a != null) {
                            w.this.f112068a.runOnUiThread(new ag(this));
                        }
                    }

                    @Override // com.ss.android.ugc.aweme.music.service.b
                    public final void a(String str, MusicWaveBean musicWaveBean) {
                        if (w.this.f112069b.bT_()) {
                            if (w.this.f112068a != null) {
                                w.this.f112068a.runOnUiThread(new ae(this, musicModel, musicWaveBean, str, i2));
                            }
                            w.a(str, System.currentTimeMillis() - currentTimeMillis);
                        }
                    }
                }, z2, true);
                return;
            }
            AnonymousClass2 r5 = new g() {
                /* class com.ss.android.ugc.aweme.music.ui.w.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(72029);
                }

                @Override // com.ss.android.ugc.aweme.music.ui.g
                public final void b(Effect effect) {
                    w.this.f112071d = effect;
                }

                @Override // com.ss.android.ugc.aweme.music.ui.g
                public final void b(q qVar) {
                    w.this.f112071d = null;
                    if (w.this.f112068a != null) {
                        w.this.f112068a.runOnUiThread(new z(this, z4));
                    }
                }

                @Override // com.ss.android.ugc.aweme.music.ui.g
                public final void a(q qVar) {
                    w.this.f112071d = null;
                    String str = qVar.f112027a;
                    MusicWaveBean musicWaveBean = qVar.f112028b;
                    w.this.f112070c = qVar.f112031e;
                    if (w.this.f112069b.bT_()) {
                        if (w.this.f112068a != null) {
                            w.this.f112068a.runOnUiThread(new y(this, z4, musicModel, musicWaveBean, str, i2));
                        }
                        w.a(str, System.currentTimeMillis() - currentTimeMillis);
                    }
                }

                @Override // com.ss.android.ugc.aweme.music.ui.g
                public final void a(Effect effect) {
                    if (w.this.f112068a != null) {
                        w.this.f112068a.runOnUiThread(new x(this, musicModel, z4));
                        w.this.f112069b.a(musicModel);
                    }
                }

                @Override // com.ss.android.ugc.aweme.music.ui.g
                public final void a(final String str, Effect effect) {
                    if (w.this.f112069b != null) {
                        if (TextUtils.isEmpty(str)) {
                            w.this.f112071d = null;
                            if (w.this.f112069b.bT_() && w.this.f112068a != null) {
                                w.this.f112068a.runOnUiThread(new ab(this, musicModel));
                                return;
                            }
                            return;
                        }
                        Effect effect2 = w.this.f112071d;
                        w.this.f112071d = null;
                        if (effect == null && (effect = effect2) == null) {
                            AVExternalServiceImpl.a().abilityService().effectService().buildEffectPlatform(w.this.f112068a, new IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f>() {
                                /* class com.ss.android.ugc.aweme.music.ui.w.AnonymousClass2.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(72030);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                                public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
                                    com.ss.android.ugc.aweme.effectplatform.f fVar2 = fVar;
                                    if (fVar2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(str);
                                        fVar2.a((List<String>) arrayList, (Map<String, String>) null, false, (IFetchEffectListListener) new IFetchEffectListListener() {
                                            /* class com.ss.android.ugc.aweme.music.ui.w.AnonymousClass2.AnonymousClass1.AnonymousClass1 */

                                            static {
                                                Covode.recordClassIndex(72031);
                                            }

                                            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                                            public final void onFail(ExceptionResult exceptionResult) {
                                            }

                                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                            public final /* synthetic */ void onSuccess(List<Effect> list) {
                                                List<Effect> list2 = list;
                                                if (list2 != null && list2.size() > 0 && list2.get(0) != null) {
                                                    AnonymousClass2.this.a(str, list2.get(0));
                                                }
                                            }
                                        });
                                    }
                                }
                            }, null);
                        } else if (w.this.f112069b.bT_() && w.this.f112068a != null) {
                            w.this.f112068a.runOnUiThread(new ac(this, effect, musicModel));
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.music.ui.g
                public final void a(int i2, Effect effect, Long l2) {
                    if (w.this.f112068a != null) {
                        w.this.f112068a.runOnUiThread(new aa(this, i2, z4));
                    }
                }
            };
            if (this.f112074g == null) {
                this.f112074g = new bf(this.f112068a, str, musicModel, this.f112073f);
            }
            bf bfVar = this.f112074g;
            if (z) {
                r5 = null;
            }
            bfVar.a(r5, z4);
        }
    }
}
