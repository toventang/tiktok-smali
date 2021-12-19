package com.ss.android.ugc.aweme.prop;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.m;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.account.a;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.e;
import com.ss.android.ugc.aweme.music.ui.g;
import com.ss.android.ugc.aweme.music.ui.l;
import com.ss.android.ugc.aweme.music.ui.q;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.sticker.h;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.utils.bt;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public l A;
    public String B;
    public int C;
    public Effect D;
    public IFetchEffectListListener E;
    h F;
    OnUnlockShareFinishListener G;
    public g H;
    public b I;
    private SafeHandler J;
    private Music K;
    private AbstractC3019a L;

    /* renamed from: a  reason: collision with root package name */
    public f f118165a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f118166b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f118167c;

    /* renamed from: d  reason: collision with root package name */
    public String f118168d;

    /* renamed from: e  reason: collision with root package name */
    public ShootExtraData f118169e;

    /* renamed from: f  reason: collision with root package name */
    public int f118170f;

    /* renamed from: g  reason: collision with root package name */
    public d f118171g;

    /* renamed from: h  reason: collision with root package name */
    public e f118172h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f118173i;

    /* renamed from: j  reason: collision with root package name */
    public Context f118174j;

    /* renamed from: k  reason: collision with root package name */
    public String f118175k;

    /* renamed from: l  reason: collision with root package name */
    public String f118176l;

    /* renamed from: m  reason: collision with root package name */
    public String f118177m;
    public String n;
    public String o;
    public boolean p;
    public com.ss.android.ugc.aweme.tools.f.a q;
    public com.ss.android.ugc.aweme.tools.f.b r;
    public IAVEffectService s;
    public String t;
    public String u;
    public String v;
    public Effect w;
    public boolean x;
    public long y;
    public long z;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.prop.a$a  reason: collision with other inner class name */
    public interface AbstractC3019a {
        static {
            Covode.recordClassIndex(76757);
        }

        void a(b.g<f, Void> gVar);
    }

    public interface b extends IEffectDownloadProgressListener {
        static {
            Covode.recordClassIndex(76758);
        }

        void a(Effect effect);

        void a(String str, Effect effect);
    }

    static {
        Covode.recordClassIndex(76741);
    }

    /* access modifiers changed from: package-private */
    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        Effect f118210a;

        /* renamed from: b  reason: collision with root package name */
        String f118211b;

        static {
            Covode.recordClassIndex(76759);
        }

        @Override // com.ss.android.ugc.aweme.common.o
        public final void c() {
            com.ss.android.b.a.a.a.b(new Runnable() {
                /* class com.ss.android.ugc.aweme.prop.a.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(76760);
                }

                public final void run() {
                    a aVar = a.this;
                    Effect effect = c.this.f118210a;
                    String str = c.this.f118211b;
                    IStickerUtilsService stickerInfo = AVExternalServiceImpl.a().infoService().stickerInfo();
                    if (stickerInfo.hasUnlocked(effect)) {
                        com.ss.android.ugc.aweme.shortvideo.sticker.e.a.f130267a = aVar.t;
                        aVar.a(effect, str, false);
                    } else if (TextUtils.equals(aVar.t, "prop_reuse") && stickerInfo.isStickerPreviewable(effect)) {
                        com.ss.android.ugc.aweme.shortvideo.sticker.e.a.f130267a = aVar.t;
                        aVar.a(effect, str, false);
                    }
                }
            });
        }

        @Override // com.ss.android.ugc.aweme.common.o
        public final void a_(Exception exc) {
            if ((a.this.f118174j instanceof Activity) && !((Activity) a.this.f118174j).isFinishing()) {
                com.ss.android.ugc.aweme.shortvideo.sticker.e.a.a((Activity) a.this.f118174j);
            }
        }

        c(Effect effect, String str) {
            this.f118210a = effect;
            this.f118211b = str;
        }
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean e() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean d2 = d();
        j.f107229h = d2;
        return d2;
    }

    private void f() {
        if (this.f118174j instanceof m) {
            SafeHandler safeHandler = new SafeHandler((m) this.f118174j);
            this.J = safeHandler;
            safeHandler.postDelayed(new Runnable() {
                /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(76753);
                }

                public final void run() {
                    if (a.this.f118173i && (a.this.f118174j instanceof Activity) && !((Activity) a.this.f118174j).isFinishing()) {
                        a aVar = a.this;
                        aVar.f118172h = e.b.a(aVar.f118174j);
                        a.this.f118172h.setMessage(a.this.f118174j.getResources().getString(R.string.g4k));
                    }
                }
            }, 300);
        }
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("scene", this.u);
        if (!TextUtils.isEmpty(this.v)) {
            hashMap.put("grade_key", this.v);
        }
        return hashMap;
    }

    private boolean g() {
        if (!com.ss.android.ugc.aweme.video.e.e()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f118174j).a(R.string.fhb).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.e.f() >= 20971520) {
            return true;
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f118174j).a(R.string.fhc).a();
            return false;
        }
    }

    public final l b() {
        MusicModel convertToMusicModel;
        if (this.A == null) {
            Context context = this.f118174j;
            String str = this.f118167c.get(0);
            Music music = this.K;
            if (music == null) {
                convertToMusicModel = null;
            } else {
                convertToMusicModel = music.convertToMusicModel();
            }
            this.A = new l(context, str, convertToMusicModel);
        }
        return this.A;
    }

    private void c() {
        if (g()) {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!e() || !this.x) {
                return;
            }
            if (this.f118171g == null) {
                Context context = this.f118174j;
                d a2 = d.a(context, context.getResources().getString(R.string.bdz));
                this.f118171g = a2;
                a2.setProgress(1);
                this.f118171g.setIndeterminate(false);
                return;
            }
            Context context2 = this.f118174j;
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                this.f118171g.setProgress(1);
            }
        }
    }

    public a(Context context) {
        this(context, "prop_reuse");
    }

    public final void a(Music music) {
        if (!CommerceMediaServiceImpl.f().b(music)) {
            this.K = music;
        }
    }

    private static boolean a(Effect effect) {
        if (effect != null && !TextUtils.isEmpty(effect.getExtra())) {
            try {
                if ("true".equals(new JSONObject(effect.getExtra()).optString("no_apply_sound_in_effect_reuse"))) {
                    return true;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }

    public final void a(int i2) {
        Context context;
        if (this.f118171g != null && (context = this.f118174j) != null && (context instanceof Activity) && !((Activity) context).isFinishing() && this.f118171g.isShowing()) {
            this.f118171g.setProgress(i2);
        }
    }

    public a(Context context, String str) {
        this(context, str, "");
    }

    public final void b(Effect effect, String str) {
        new c(effect, str).c();
    }

    public final void a(final Effect effect, final String str) {
        if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
            b(effect, str);
            return;
        }
        com.ss.android.ugc.aweme.login.c.a((Activity) this.f118174j, "prop_page", "prop_page");
        a.C1369a.a(new com.ss.android.ugc.aweme.account.g() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass11 */

            static {
                Covode.recordClassIndex(76745);
            }

            @Override // com.ss.android.ugc.aweme.account.g
            public final void onStart() {
            }

            @Override // com.ss.android.ugc.aweme.account.g
            public final void a() {
                if (com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                    if (!in.d()) {
                        a.this.b(effect, str);
                    } else {
                        return;
                    }
                }
                a.C1369a.b(this);
            }
        });
    }

    private a(Context context, String str, String str2) {
        this.f118168d = "";
        this.f118169e = new ShootExtraData();
        this.f118170f = 0;
        this.f118173i = false;
        this.f118175k = "";
        this.n = "";
        this.s = AVExternalServiceImpl.a().abilityService().effectService();
        this.t = "";
        this.u = "";
        this.v = "";
        this.x = true;
        this.C = 0;
        this.D = null;
        this.L = new AbstractC3019a() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(76742);
            }

            @Override // com.ss.android.ugc.aweme.prop.a.AbstractC3019a
            public final void a(final b.g<com.ss.android.ugc.aweme.effectplatform.f, Void> gVar) {
                final b.j jVar = new b.j();
                if (a.this.f118165a == null) {
                    a.this.s.buildEffectPlatform(a.this.f118174j, "prop_page".equals(a.this.t), new IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f>() {
                        /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass1.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(76743);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
                            com.ss.android.ugc.aweme.effectplatform.f fVar2 = fVar;
                            if (fVar2 != null) {
                                a.this.f118165a = fVar2;
                                jVar.a(fVar2);
                                jVar.f4869a.a((b.g) gVar);
                                return;
                            }
                            a.this.I.onFail(null, new ExceptionResult(new RuntimeException("effect so fail")));
                            if (a.this.f118171g != null) {
                                a.this.f118171g.dismiss();
                            }
                        }
                    }, b.f118222a);
                    return;
                }
                jVar.a(a.this.f118165a);
                jVar.f4869a.a((b.g) gVar);
            }
        };
        this.E = new IFetchEffectListListener() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass7 */

            static {
                Covode.recordClassIndex(76754);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                a.this.I.onFail(null, exceptionResult);
                if (a.this.f118171g != null) {
                    a.this.f118171g.dismiss();
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(List<Effect> list) {
                Map<String, String> a2 = a.this.a();
                if (AVExternalServiceImpl.a().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload()) {
                    a.this.b().a(a2, a.this.H, false, a.this.f118167c.get(a.this.f118170f));
                } else {
                    AVExternalServiceImpl.a().abilityService().effectService().fetchEffectResource(a.this.f118167c.get(a.this.f118170f), true, a2, a.this.f118165a, a.this.I);
                }
            }
        };
        this.G = new OnUnlockShareFinishListener() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass8 */

            static {
                Covode.recordClassIndex(76755);
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onVKShareSucceed(Effect effect) {
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppFailed() {
                if ((a.this.f118174j instanceof Activity) && !((Activity) a.this.f118174j).isFinishing()) {
                    com.ss.android.ugc.aweme.shortvideo.sticker.e.a.a((Activity) a.this.f118174j);
                }
            }

            @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
            public final void onShareAppSucceed(Effect effect) {
                if (a.this.F != null) {
                    com.ss.android.ugc.aweme.sticker.types.unlock.c cVar = new com.ss.android.ugc.aweme.sticker.types.unlock.c();
                    cVar.f136178a = UnLockSticker.STICKER_UNLOCKED;
                    cVar.f136179b = effect;
                    cVar.f136180c = a.this.t;
                    com.ss.android.ugc.d.a.c.b(cVar);
                    com.ss.android.ugc.aweme.shortvideo.sticker.e.a.f130267a = a.this.t;
                    a.this.w = effect;
                    if (TextUtils.equals(a.this.t, "prop_page")) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.sticker.types.unlock.a());
                    } else if (TextUtils.equals(a.this.t, "prop_reuse")) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.sticker.types.unlock.b());
                    }
                }
            }
        };
        this.H = new g() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass12 */

            static {
                Covode.recordClassIndex(76746);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.g
            public final void a(Effect effect) {
                a.this.I.onStart(effect);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.g
            public final void b(Effect effect) {
                a.this.I.a(effect);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.g
            public final void b(q qVar) {
                a.this.I.onFail(qVar.f112031e, qVar.f112033g);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.g
            public final void a(q qVar) {
                a.this.B = qVar.f112027a;
                a.this.I.onSuccess(qVar.f112031e);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.g
            public final void a(String str, Effect effect) {
                a.this.I.a(str, effect);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.g
            public final void a(int i2, Effect effect, Long l2) {
                a.this.I.onProgress(effect, i2, l2.longValue());
            }
        };
        this.I = new b() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(76747);
            }

            @Override // com.ss.android.ugc.aweme.prop.a.b
            public final void a(Effect effect) {
                a.this.D = effect;
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
                a.this.z = 0;
            }

            /* access modifiers changed from: package-private */
            public final boolean a(i<com.ss.android.ugc.aweme.sticker.model.h> iVar) {
                List<com.ss.android.ugc.aweme.sticker.model.g> list;
                if (!(iVar.b() || iVar.c() || iVar.d() == null || (list = iVar.d().mStickers) == null || list.size() == 0)) {
                    com.ss.android.ugc.aweme.commerce_sticker_api.service.a b2 = CommerceStickerServiceImpl.c().b();
                    com.ss.android.ugc.aweme.sticker.model.g gVar = list.get(0);
                    if (b2.a(gVar)) {
                        b2.a(a.this.f118174j, gVar, "homepage_hot");
                        return true;
                    }
                }
                return false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final /* synthetic */ void onSuccess(Effect effect) {
                Effect effect2 = effect;
                a.this.f118167c.size();
                a.this.f118167c.get(0);
                a.this.D = null;
                a.this.f118166b = true;
                a.this.w = effect2;
                a.this.a(100);
                bt.b(a.this.f118171g);
                a.this.f118173i = false;
                bt.b(a.this.f118172h);
                if (TextUtils.isEmpty(a.this.f118175k)) {
                    a.this.f118175k = UUID.randomUUID().toString();
                }
                if (a.this.q != null) {
                    a.this.q.onIntercept(a.this.f118175k, effect2);
                } else {
                    String str = "homepage_hot";
                    if (a.this.f118176l.equals("green_screen")) {
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("content_type", "video").a("content_source", "shoot");
                        if (!TextUtils.isEmpty(a.this.o)) {
                            str = a.this.o;
                        }
                        r.a("shoot", a2.a("enter_from", str).a("creation_id", a.this.f118175k).a("group_id", a.this.n).a("giphy_id", a.this.f118168d).f66730a);
                    } else {
                        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", a.this.f118175k).a("shoot_way", a.this.f118176l).a("prop_id", effect2.getEffectId()).a("giphy_id", a.this.f118168d);
                        if (!TextUtils.isEmpty(a.this.o)) {
                            str = a.this.o;
                        }
                        r.a("shoot", a3.a("enter_from", str).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(a.this.f118175k)).f66730a);
                    }
                }
                if (TextUtils.equals(a.this.t, "prop_page")) {
                    FaceStickerBean.sCurPropSource = "prop_page";
                }
                if (!AVExternalServiceImpl.a().infoService().stickerInfo().isLockSticker(effect2) || ((!TextUtils.equals(a.this.t, "prop_reuse") && !TextUtils.equals(a.this.t, "prop_page")) || in.d())) {
                    a aVar = a.this;
                    aVar.a(effect2, aVar.f118175k, false);
                } else if (effect2.isBusiness()) {
                    i.b(new c(effect2), i.f4824a).a(new d(this, effect2), i.f4826c, null);
                } else {
                    a aVar2 = a.this;
                    aVar2.a(effect2, aVar2.f118175k);
                }
                if (a.this.r != null) {
                    a.this.r.onFinish(0);
                }
                AVExternalServiceImpl.a().infoService().endDownloadEffectAlog(effect2, a.this.z, System.currentTimeMillis() - a.this.y, 0, null);
            }

            @Override // com.ss.android.ugc.aweme.prop.a.b
            public final void a(final String str, Effect effect) {
                if (TextUtils.isEmpty(str)) {
                    onFail(effect, new ExceptionResult(-1));
                    return;
                }
                Effect effect2 = a.this.D;
                a.this.D = null;
                if (effect == null && (effect = effect2) == null) {
                    AVExternalServiceImpl.a().abilityService().effectService().buildEffectPlatform(a.this.f118174j, new IAVEffectService.IAVEffectReadyCallback<com.ss.android.ugc.aweme.effectplatform.f>() {
                        /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(76748);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                        public final /* synthetic */ void finish(com.ss.android.ugc.aweme.effectplatform.f fVar) {
                            com.ss.android.ugc.aweme.effectplatform.f fVar2 = fVar;
                            if (fVar2 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(str);
                                fVar2.a((List<String>) arrayList, a.this.a(), false, (IFetchEffectListListener) new IFetchEffectListListener() {
                                    /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass2.AnonymousClass1.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(76749);
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
                    return;
                }
                a.this.f118173i = false;
                bt.b(a.this.f118172h);
                if (TextUtils.isEmpty(a.this.f118175k)) {
                    a.this.f118175k = UUID.randomUUID().toString();
                }
                if (a.this.q != null) {
                    a.this.q.onIntercept(a.this.f118175k, effect);
                } else {
                    String str2 = "homepage_hot";
                    if (a.this.f118176l.equals("green_screen")) {
                        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("content_type", "video").a("content_source", "shoot");
                        if (!TextUtils.isEmpty(a.this.o)) {
                            str2 = a.this.o;
                        }
                        r.a("shoot", a2.a("enter_from", str2).a("creation_id", a.this.f118175k).a("group_id", a.this.n).a("giphy_id", a.this.f118168d).f66730a);
                    } else {
                        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("creation_id", a.this.f118175k).a("shoot_way", a.this.f118176l).a("prop_id", str).a("giphy_id", a.this.f118168d);
                        if (!TextUtils.isEmpty(a.this.o)) {
                            str2 = a.this.o;
                        }
                        r.a("shoot", a3.a("enter_from", str2).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(a.this.f118175k)).f66730a);
                    }
                }
                if (TextUtils.equals(a.this.t, "prop_page")) {
                    FaceStickerBean.sCurPropSource = "prop_page";
                }
                if (!AVExternalServiceImpl.a().infoService().stickerInfo().isLockSticker(effect) || ((!TextUtils.equals(a.this.t, "prop_reuse") && !TextUtils.equals(a.this.t, "prop_page")) || in.d())) {
                    a aVar = a.this;
                    aVar.a(effect, aVar.f118175k, true);
                } else if (effect.isBusiness()) {
                    i.b(new e(effect), i.f4824a).a(new f(this, effect), i.f4826c, null);
                } else {
                    a aVar2 = a.this;
                    aVar2.a(effect, aVar2.f118175k);
                }
                if (a.this.r != null) {
                    a.this.r.onFinish(0);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                exceptionResult.getMsg();
                exceptionResult.getErrorCode();
                a.this.f118173i = false;
                bt.b(a.this.f118172h);
                a.this.D = null;
                int errorCode = exceptionResult.getErrorCode();
                if (errorCode == 2004 || errorCode == 2002 || errorCode == 2003 || errorCode == 2006) {
                    a.this.f118170f++;
                    if (!a.this.p || a.this.f118170f >= a.this.f118167c.size()) {
                        if (!a.this.f118166b) {
                            if (errorCode == 2004 || errorCode == 2002) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f118174j).a(a.this.f118174j.getResources().getString(R.string.bm4)).a();
                            } else if (errorCode == 2003) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f118174j).a(a.this.f118174j.getResources().getString(R.string.b6w)).a();
                            } else if (errorCode == 2006) {
                                if (!com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getStickerUpdateApp().booleanValue() || com.bytedance.common.utility.collection.b.a((Collection) a.this.f118167c) || TextUtils.isEmpty(a.this.f118167c.get(0))) {
                                    new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f118174j).a(a.this.f118174j.getResources().getString(R.string.h5w)).a();
                                    if (a.this.r != null) {
                                        a.this.r.onFinish(errorCode);
                                    }
                                } else {
                                    if (a.this.f118174j instanceof Activity) {
                                        String str = a.this.f118167c.get(0);
                                        if (Build.VERSION.SDK_INT < 21) {
                                            new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f118174j).a(a.this.f118174j.getResources().getString(R.string.h5w)).a();
                                        } else {
                                            Activity activity = (Activity) a.this.f118174j;
                                            a.C0731a aVar = new a.C0731a(activity);
                                            aVar.a(R.string.g7b).b(R.string.g7_).a(R.string.g7c, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity, str) {
                                                /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass4 */

                                                /* renamed from: a  reason: collision with root package name */
                                                final /* synthetic */ Activity f118192a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ String f118193b;

                                                static {
                                                    Covode.recordClassIndex(76751);
                                                }

                                                {
                                                    this.f118192a = r1;
                                                    this.f118193b = r2;
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                                    UgCommonServiceImpl.j().b().a(this.f118192a, true, this.f118193b);
                                                    new com.bytedance.cukaie.closet.a(new com.bytedance.cukaie.closet.internal.d()).a(this.f118192a, ReuseStickerUpdateSP.class);
                                                    System.currentTimeMillis();
                                                    com.bytedance.ies.ugc.appcontext.d.e();
                                                }
                                            }, false).b(R.string.g7a, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                                                /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass3 */

                                                static {
                                                    Covode.recordClassIndex(76750);
                                                }

                                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                                }
                                            }, false);
                                            Dialog c2 = aVar.a().c();
                                            c2.setCanceledOnTouchOutside(false);
                                            if (!((Activity) a.this.f118174j).isFinishing()) {
                                                c2.show();
                                            }
                                        }
                                    }
                                    if (a.this.r != null) {
                                        a.this.r.onFinish(2006);
                                    }
                                }
                            }
                        }
                        if (!(a.this.r == null || errorCode == 2006)) {
                            a.this.r.onFinish(errorCode);
                        }
                        AVExternalServiceImpl.a().infoService().endDownloadEffectAlog(a.this.w, a.this.z, System.currentTimeMillis() - a.this.y, -1, exceptionResult);
                    }
                    AVExternalServiceImpl.a().abilityService().effectService().fetchEffectResource(a.this.f118167c.get(a.this.f118170f), true, a.this.a(), a.this.f118165a, a.this.I);
                    a.this.r.onFinish(errorCode);
                    AVExternalServiceImpl.a().infoService().endDownloadEffectAlog(a.this.w, a.this.z, System.currentTimeMillis() - a.this.y, -1, exceptionResult);
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(a.this.f118174j).a(a.this.f118174j.getResources().getString(R.string.br1)).a();
                bt.b(a.this.f118171g);
                a.this.r.onFinish(errorCode);
                AVExternalServiceImpl.a().infoService().endDownloadEffectAlog(a.this.w, a.this.z, System.currentTimeMillis() - a.this.y, -1, exceptionResult);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
            public final void onProgress(Effect effect, int i2, long j2) {
                a.this.a(i2);
                if (a.this.z == 0) {
                    a.this.z = j2;
                    AVExternalServiceImpl.a().infoService().startDownloadEffectAlog(effect, j2);
                }
            }
        };
        this.f118174j = context;
        this.f118176l = str;
        this.n = str2;
    }

    public final void a(Effect effect, String str, boolean z2) {
        String str2;
        String str3;
        MusicModel musicModel = null;
        if (this.s.isEffectControlGame(effect)) {
            this.K = null;
        }
        com.ss.android.ugc.aweme.shortvideo.sticker.e.a.f130267a = this.t;
        final RecordConfig.Builder videoLength = new RecordConfig.Builder().shootWay(this.f118176l).creationId(str).startRecordTime(this.y).effectDownloadDuration(System.currentTimeMillis() - this.y).translationType(com.ss.android.ugc.aweme.setting.i.c.a()).stickers(this.f118167c).giphyGifIds(this.f118168d).shootExtraData(this.f118169e).prepareFilter(true).firstSticker(effect).stickerMusic(this.K).stickerWithMusicFilePath(this.B).stickerParams(a()).videoLength(Integer.valueOf(this.C));
        String str4 = this.o;
        if (str4 != null) {
            videoLength.enterFrom(str4);
        }
        if (this.K != null && !a(effect)) {
            if (MusicService.m().a(this.K.convertToMusicModel(), this.f118174j, false)) {
                videoLength.autoUseMusic(new StringBuilder().append(this.K.getId()).toString());
            }
        }
        if (z2) {
            if (effect != null) {
                str2 = effect.getEffectId();
            } else {
                str2 = null;
            }
            if (this.K == null || a(effect)) {
                str3 = null;
            } else {
                str3 = new StringBuilder().append(this.K.getId()).toString();
            }
            Music music = this.K;
            if (music != null) {
                musicModel = music.convertToMusicModel();
            }
            videoLength.recordPresetResource(new RecordPresetResource(str2, effect, str3, musicModel));
        }
        if (this.f118177m != null && !a(effect)) {
            videoLength.musicOrigin(this.f118177m);
        }
        String str5 = "reuse_sticker";
        if (this.f118176l.equals("prop_page") || this.f118176l.equals("scan")) {
            IExternalService a2 = AVExternalServiceImpl.a();
            if (!TextUtils.isEmpty(this.f118176l)) {
                str5 = this.f118176l;
            }
            a2.asyncService(str5, new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(76756);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(a.this.f118174j, videoLength.build());
                }
            });
            return;
        }
        IExternalService a3 = AVExternalServiceImpl.a();
        if (!TextUtils.isEmpty(this.f118176l)) {
            str5 = this.f118176l;
        }
        a3.asyncServiceWithOutPanel(str5, new SimpleServiceLoadCallback() {
            /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass10 */

            static {
                Covode.recordClassIndex(76744);
            }

            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                asyncAVService.uiService().recordService().startRecord(a.this.f118174j, videoLength.build());
            }
        });
    }

    public final void a(final boolean z2, ArrayList<String> arrayList, boolean z3, final boolean z4) {
        this.p = z3;
        this.y = System.currentTimeMillis();
        AVExternalServiceImpl.a().provideAVPerformance().start("av_video_record_init", "clickReuseSticker");
        this.f118167c = arrayList;
        c();
        if (z2 && !z4) {
            this.f118173i = true;
            f();
        }
        ArrayList<String> arrayList2 = this.f118167c;
        if (arrayList2 != null && arrayList2.size() > 0) {
            this.f118166b = false;
            this.L.a(new b.g<com.ss.android.ugc.aweme.effectplatform.f, Void>() {
                /* class com.ss.android.ugc.aweme.prop.a.AnonymousClass5 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f118194a = false;

                static {
                    Covode.recordClassIndex(76752);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ Void then(i<com.ss.android.ugc.aweme.effectplatform.f> iVar) {
                    g gVar;
                    if (a.this.f118165a != null) {
                        Map<String, String> a2 = a.this.a();
                        if (this.f118194a) {
                            a.this.s.fetchEffectListResource(a.this.f118167c, a2, false, a.this.f118165a, a.this.E);
                        } else if (AVExternalServiceImpl.a().provideTakeInSameOptimize().enableCombineMusicAndEffectDownload()) {
                            l b2 = a.this.b();
                            if (z4) {
                                gVar = null;
                            } else {
                                gVar = a.this.H;
                            }
                            b2.a(a2, gVar, z2, a.this.f118167c.get(0));
                        } else {
                            a.this.s.fetchEffectResource(a.this.f118167c.get(0), true, a2, a.this.f118165a, a.this.I);
                        }
                    }
                    return null;
                }
            });
        }
    }

    public final void a(ArrayList<String> arrayList, String str, String str2, boolean z2, int i2, boolean z3) {
        boolean z4;
        this.t = str;
        this.u = str2;
        this.C = i2;
        if (z2 || z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.x = z4;
        a(z3, arrayList, false, z2);
    }
}
