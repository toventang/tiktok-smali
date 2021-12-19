package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.g;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.creativex.recorder.sticker.a.b;
import com.ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.am;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.reaction.CopiedReactionWindowInfo;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.util.bl;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.gamora.recorder.choosemusic.a;
import com.ss.android.vesdk.ax;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.y;
import h.v;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class h extends com.bytedance.als.j<c> implements com.bytedance.o.a, c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f131295a = {new y(h.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new y(h.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(h.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new y(h.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0), new y(h.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(h.class, "stickerMobHelper", "getStickerMobHelper()Lcom/ss/android/ugc/aweme/sticker/mob/IStickerMob;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final c f131296b = this;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.fragment.app.e f131297c = ((androidx.fragment.app.e) getDiContainer().a(androidx.fragment.app.e.class, (String) null));

    /* renamed from: d  reason: collision with root package name */
    public final ShortVideoContext f131298d = ((ShortVideoContext) getDiContainer().a(ShortVideoContext.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    final h.h f131299e = h.i.a((h.f.a.a) new a(this));

    /* renamed from: f  reason: collision with root package name */
    final h.h.d f131300f = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.sticker.m.h.class);

    /* renamed from: g  reason: collision with root package name */
    long f131301g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f131302h = com.bytedance.o.b.a.a(getDiContainer(), z.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f131303i = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f131304j = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.filter.a.a.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f131305k = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.a.a.a.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f131306l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);

    /* renamed from: m  reason: collision with root package name */
    private final f.a.b.a f131307m = new f.a.b.a();
    private final com.bytedance.o.f n;

    static {
        Covode.recordClassIndex(86017);
    }

    private final com.bytedance.creativex.recorder.b.a.m e() {
        return (com.bytedance.creativex.recorder.b.a.m) this.f131303i.a(this, f131295a[1]);
    }

    public final z a() {
        return (z) this.f131302h.a(this, f131295a[0]);
    }

    public final com.bytedance.creativex.recorder.filter.a.a b() {
        return (com.bytedance.creativex.recorder.filter.a.a) this.f131304j.a(this, f131295a[2]);
    }

    public final com.bytedance.creativex.recorder.a.a.a c() {
        return (com.bytedance.creativex.recorder.a.a.a) this.f131305k.a(this, f131295a[3]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j d() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f131306l.a(this, f131295a[4]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ c getApiComponent() {
        return this.f131296b;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.n;
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.recorder.choosemusic.a> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(86018);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.recorder.choosemusic.a invoke() {
            return a.C3961a.b(this.this$0.f131297c);
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        this.f131307m.a();
    }

    static final class q<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f131325a;

        static {
            Covode.recordClassIndex(86035);
        }

        q(String str) {
            this.f131325a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            try {
                if (TextUtils.isEmpty(this.f131325a)) {
                    return null;
                }
                com.ss.android.ugc.tools.utils.i.a(new File(this.f131325a));
                return null;
            } catch (Exception unused) {
                com.ss.android.ugc.aweme.port.in.g.a().I().a("delete failed");
                return null;
            }
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        e().n().a(this, new c(this));
        e().F().a(this, new d(this));
        e().p().a(this, new e(this));
        a().v().a(this, new f(this));
        e().l().a(this, new g(this));
        f.a.b.b a2 = e().f().a(new C3418h(this), com.ss.android.ugc.tools.utils.p.f150012a);
        h.f.b.l.b(a2, "");
        f.a.j.a.a(a2, this.f131307m);
        a().D().a(new o(this));
        a().i().a(this, new m(this));
        a().m().a(this, new n(this));
        c().h().a(this, new b(this));
        d().b().a(this, new i(this));
        d().f().a(this, new j(this));
        f.a.b.b a3 = d().g().a(new k(this), com.ss.android.ugc.tools.utils.p.f150012a);
        h.f.b.l.b(a3, "");
        f.a.j.a.a(a3, this.f131307m);
    }

    public static ComposerBeautyBuriedInfo a(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy) {
        ComposerBeautyBuriedInfo composerBeautyBuriedInfo = (ComposerBeautyBuriedInfo) com.ss.android.ugc.aweme.df.h.a(com.ss.android.ugc.aweme.df.h.a().b(composerBeautyBuriedInfoCopy), ComposerBeautyBuriedInfo.class);
        h.f.b.l.b(composerBeautyBuriedInfo, "");
        return composerBeautyBuriedInfo;
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131312a;

        static {
            Covode.recordClassIndex(86023);
        }

        f(h hVar) {
            this.f131312a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.tools.j jVar = (com.ss.android.ugc.aweme.tools.j) obj;
            h hVar = this.f131312a;
            h.f.b.l.b(jVar, "");
            if (hVar.f131298d.f124757b.c() || com.ss.android.ugc.aweme.shortvideo.duet.a.a(hVar.f131298d) || hVar.f131298d.c()) {
                int i2 = jVar.f140202a;
                if (i2 == 1) {
                    h.a(hVar.f131298d, "on");
                } else if (i2 == 2) {
                    h.a(hVar.f131298d, "off");
                }
            }
        }
    }

    public static com.ss.android.ugc.aweme.beauty.g a(com.ss.android.ugc.aweme.dependence.beauty.data.a aVar) {
        com.ss.android.ugc.aweme.beauty.g gVar = (com.ss.android.ugc.aweme.beauty.g) com.ss.android.ugc.aweme.df.h.a(com.ss.android.ugc.aweme.df.h.a().b(aVar), com.ss.android.ugc.aweme.beauty.g.class);
        h.f.b.l.b(gVar, "");
        return gVar;
    }

    static final class i<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131315a;

        static {
            Covode.recordClassIndex(86026);
        }

        i(h hVar) {
            this.f131315a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.sticker.a.b bVar = (com.bytedance.creativex.recorder.sticker.a.b) obj;
            if (bVar instanceof b.a) {
                h hVar = this.f131315a;
                com.ss.android.ugc.aweme.utils.d.a("light_warn_notice_show", ag.c(v.a("enter_from", "video_shoot_page"), v.a("shoot_way", hVar.f131298d.r), v.a("creation_id", hVar.f131298d.q), v.a("content_source", hVar.f131298d.j().getContentSource()), v.a("content_type", hVar.f131298d.j().getContentType()), v.a("tab_name", FaceStickerBean.sCurPropSource), v.a("prop_id", ((b.a) bVar).f28380a.getEffectId())));
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131319a;

        static {
            Covode.recordClassIndex(86030);
        }

        m(h hVar) {
            this.f131319a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                boolean z = false;
                if (this.f131319a.a().al() == 2) {
                    com.ss.android.ugc.aweme.port.in.g.a().e().setRecordUseSuccessCameraType(1);
                } else {
                    com.ss.android.ugc.aweme.port.in.g.a().e().setRecordUseSuccessCameraType(0);
                }
                am amVar = com.ss.android.ugc.aweme.port.in.c.s;
                if (this.f131319a.a().N() == 1) {
                    z = true;
                }
                amVar.b(z);
            }
        }
    }

    public static String a(Integer num) {
        if (num != null) {
            num.intValue();
            if (num.intValue() == 0) {
                return "-1";
            }
            String valueOf = String.valueOf(num.intValue());
            if (valueOf == null) {
                return "";
            }
            return valueOf;
        }
        return "";
    }

    static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131308a;

        static {
            Covode.recordClassIndex(86019);
        }

        b(h hVar) {
            this.f131308a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            int i2;
            com.bytedance.creativex.recorder.a.a.b bVar = (com.bytedance.creativex.recorder.a.a.b) obj;
            if (bVar.f28064a == com.bytedance.creativex.recorder.a.a.c.BEAUTY_ON_OFF && (bVar instanceof com.bytedance.creativex.recorder.a.a.d)) {
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f131308a.f131298d.q).a("shoot_way", this.f131308a.f131298d.r).a("content_source", this.f131308a.f131298d.j().getContentSource()).a("content_type", this.f131308a.f131298d.j().getContentType()).a("enter_from", "video_shoot_page").a("shoot_page", "video_shoot_page").a("shoot_tab_name", this.f131308a.f131298d.r());
                if (this.f131308a.f131298d.f124757b.B) {
                    str = "on";
                } else {
                    str = "off";
                }
                r.a("click_beautify_entrance", a2.a("to_status", str).f149193a);
                AVPreferences e2 = com.ss.android.ugc.aweme.port.in.g.a().e();
                if (((com.bytedance.creativex.recorder.a.a.d) bVar).f28066b) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                e2.setBeautificationMode(i2);
            }
        }
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131311a;

        static {
            Covode.recordClassIndex(86022);
        }

        e(h hVar) {
            this.f131311a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String id;
            Integer num;
            h hVar = this.f131311a;
            FaceStickerBean i2 = hVar.d().i();
            T value = hVar.b().getCurSelectedFilter().f6468a.getValue();
            String str = "";
            if (i2 == null) {
                id = str;
            } else {
                id = i2.getId();
            }
            if (value != null) {
                str = String.valueOf(value.getId());
            }
            ASCameraView D = hVar.a().D();
            r.a("video_shoot_page_end", new com.ss.android.ugc.tools.f.b().a("creation_id", hVar.f131298d.q).a("shoot_way", hVar.f131298d.r).a("prop_list", id).a("filter_id_list", str).a("fps", D.getFPS()).a("beautify_used", String.valueOf(com.ss.android.ugc.aweme.beauty.c.b(com.ss.android.ugc.aweme.beauty.c.f68625b))).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.f68624a).f149193a);
            ShortVideoContext shortVideoContext = hVar.f131298d;
            com.ss.android.ugc.asve.recorder.c.a mediaController = D.getMediaController();
            FaceStickerBean i3 = hVar.d().i();
            T value2 = hVar.b().getCurSelectedFilter().f6468a.getValue();
            if (value2 != null) {
                num = Integer.valueOf(value2.getId());
            } else {
                num = null;
            }
            com.ss.android.ugc.aweme.shortvideo.eventtrack.a.a(shortVideoContext, mediaController, i3, num, h.a(hVar.c().i().p()), h.a(hVar.c().i().o()), "exit_record_page", l.f131318a);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131313a;

        static {
            Covode.recordClassIndex(86024);
        }

        g(h hVar) {
            this.f131313a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            h hVar = this.f131313a;
            r.a("video_record_end", new com.ss.android.ugc.tools.f.b().a("creation_id", hVar.f131298d.q).a("shoot_way", hVar.f131298d.r).a("content_type", "video").a("prop_list", RecordScene.getStickerIdsByModel(hVar.f131298d.f124757b.f124711f)).a("filter_id_list", hVar.f131298d.f124757b.G.f124741b.toString()).a("fps", hVar.a().D().getFPS()).a("reshoot", hVar.f131298d.f124757b.f124714i).a("beautify_used", String.valueOf(com.ss.android.ugc.aweme.beauty.c.b(com.ss.android.ugc.aweme.beauty.c.f68625b))).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.f68624a).f149193a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.h$h  reason: collision with other inner class name */
    static final class C3418h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131314a;

        static {
            Covode.recordClassIndex(86025);
        }

        C3418h(h hVar) {
            this.f131314a = hVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.creativex.recorder.b.a.g gVar = (com.bytedance.creativex.recorder.b.a.g) obj;
            if (gVar instanceof g.b) {
                int i2 = ((g.b) gVar).f28186a;
                bj.b("start Record ret :".concat(String.valueOf(i2)));
                gr.a("record_error", "2", "start failed , ve result = ".concat(String.valueOf(i2)), (String) null, 8);
            } else if (gVar instanceof g.a) {
                int i3 = ((g.a) gVar).f28185a;
                com.ss.android.ugc.aweme.port.in.g.a().I().a("record", new ar().a("error", String.valueOf(i3)).a());
                gr.a("record_error", "2", "running error , ve result = ".concat(String.valueOf(i3)), (String) null, 8);
            } else if (gVar instanceof g.c) {
                this.f131314a.a("end_duration", ((g.c) gVar).f28187a);
            } else if (gVar instanceof g.d) {
                this.f131314a.a("stop_record", ((g.d) gVar).f28188a);
            }
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131317a;

        static {
            Covode.recordClassIndex(86028);
        }

        k(h hVar) {
            this.f131317a = hVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: h.h.d */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            h.p pVar = (h.p) obj;
            EffectTemplate effectTemplate = (EffectTemplate) pVar.component1();
            com.bytedance.creativex.recorder.sticker.b.a aVar = (com.bytedance.creativex.recorder.sticker.b.a) pVar.component2();
            int i2 = aVar.f28381a;
            int i3 = aVar.f28382b;
            String str2 = aVar.f28384d;
            h hVar = this.f131317a;
            if (i2 == 17) {
                String str3 = null;
                if (i3 == 3) {
                    if (effectTemplate == null || (str = effectTemplate.getEffectId()) == null) {
                        str = "";
                    } else {
                        com.ss.android.ugc.aweme.port.in.g.a().I().a("sticker_id: ".concat(String.valueOf(str)));
                    }
                    long currentTimeMillis = System.currentTimeMillis() - hVar.f131301g;
                    com.ss.android.ugc.aweme.port.in.g.a().I().a("type_av_sticker_show_time", new ar().a("duration", Long.valueOf(currentTimeMillis)).a());
                    ((com.ss.android.ugc.aweme.sticker.m.h) hVar.f131300f.a(hVar, h.f131295a[5])).a(str, currentTimeMillis);
                    String.valueOf(currentTimeMillis);
                    com.ss.android.ugc.aweme.port.in.g.a().I().a("3d_sticker_show_rate", 0, (JSONObject) null);
                    hVar.f131301g = 0;
                    return;
                }
                if (i3 == 4) {
                    if (effectTemplate != null) {
                        str3 = effectTemplate.getUnzipPath();
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        b.i.b(new q(str3), com.ss.android.ugc.aweme.cw.g.a());
                    }
                }
                com.ss.android.ugc.tools.view.widget.d.b(hVar.f131297c, R.string.co_).b();
                com.ss.android.ugc.aweme.port.in.g.a().I().a("3d_sticker_show_rate", i3, new ar().a("resource_name", str2).a());
                hVar.f131301g = 0;
            }
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131320a;

        static {
            Covode.recordClassIndex(86031);
        }

        n(h hVar) {
            this.f131320a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.creativex.recorder.b.a.e eVar = (com.bytedance.creativex.recorder.b.a.e) obj;
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f131320a.f131298d.q).a("shoot_way", this.f131320a.f131298d.r).a("draft_id", this.f131320a.f131298d.C).a("to_status", eVar.f28181c).a("enter_from", "video_shoot_page").a("camera_type", eVar.f28180b).a("duration", eVar.f28179a).a("shoot_page", "video_shoot_page").a("shoot_tab_name", this.f131320a.f131298d.r());
            if (this.f131320a.f131298d.C != 0) {
                a2.a("draft_id", this.f131320a.f131298d.C);
            }
            if (!TextUtils.isEmpty(this.f131320a.f131298d.D)) {
                a2.a("new_draft_id", this.f131320a.f131298d.D);
            }
            if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                a2.a("from_group_id", dv.a());
            }
            com.ss.android.ugc.aweme.utils.d.a("flip_camera", a2.f149193a);
        }
    }

    public h(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.n = fVar;
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131316a;

        static {
            Covode.recordClassIndex(86027);
        }

        j(h hVar) {
            this.f131316a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            boolean z;
            boolean z2;
            String str3;
            AVChallenge aVChallenge;
            AVChallenge aVChallenge2;
            com.ss.android.ugc.gamora.recorder.choosemusic.a aVar;
            com.ss.android.ugc.aweme.shortvideo.c currentMusic;
            com.ss.android.ugc.aweme.sticker.presenter.handler.c.c cVar = (com.ss.android.ugc.aweme.sticker.presenter.handler.c.c) obj;
            h hVar = this.f131316a;
            h.f.b.l.b(cVar, "");
            hVar.f131301g = System.currentTimeMillis();
            Effect a2 = cVar.a();
            Boolean bool = null;
            if (a2 != null) {
                str = a2.getEffectId();
            } else {
                str = null;
            }
            dmt.av.video.a.a("sticker_id", str);
            if (a2 == null || (str2 = a2.getEffectId()) == null) {
                str2 = "";
            }
            AVServiceImpl.a().setLastStickerId(hVar.f131297c, str2, 1);
            if (a2 != null && a2.isBusiness() && com.ss.android.ugc.tools.utils.k.a(hVar.f131298d.f124757b.f124711f) && ((aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.a) hVar.f131299e.getValue()) == null || (currentMusic = aVar.getCurrentMusic()) == null || !currentMusic.isCommerceMusic())) {
                com.ss.android.ugc.gamora.recorder.choosemusic.a b2 = a.C3961a.b(hVar.f131297c);
                cr.a().a((com.ss.android.ugc.aweme.shortvideo.c) null);
                if (b2 != null) {
                    b2.handleCancelMusicResultEvent();
                    b2.changeHasMusic(null);
                }
            }
            if (cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.d) {
                cr a3 = cr.a();
                h.f.b.l.b(a3, "");
                a3.n = false;
                cr a4 = cr.a();
                h.f.b.l.b(a4, "");
                a4.f125303i = false;
                cr a5 = cr.a();
                h.f.b.l.b(a5, "");
                a5.f125304j = false;
            } else {
                cr a6 = cr.a();
                h.f.b.l.b(a6, "");
                if (a2 == null || !a2.isBusiness()) {
                    z = false;
                } else {
                    z = true;
                }
                a6.n = Boolean.valueOf(z);
            }
            if (!com.ss.android.ugc.aweme.sticker.p.g.y(a2)) {
                boolean z3 = cVar instanceof com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
                if (!z3 || ((com.ss.android.ugc.aweme.sticker.presenter.handler.c.a) cVar).f135380c != com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                String str4 = hVar.f131298d.q;
                String str5 = hVar.f131298d.x;
                String str6 = hVar.f131298d.r;
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
                createIAVServiceProxybyMonsterPlugin.getBusiStickerService().a(str2, Boolean.valueOf(z3), Boolean.valueOf(z2), str4, str5, str6);
                String str7 = hVar.f131298d.r;
                cr a7 = cr.a();
                h.f.b.l.b(a7, "");
                List<AVChallenge> list = a7.f125298d;
                if (list == null || (aVChallenge2 = (AVChallenge) h.a.n.h((List) list)) == null) {
                    str3 = null;
                } else {
                    str3 = aVChallenge2.cid;
                }
                cr a8 = cr.a();
                h.f.b.l.b(a8, "");
                List<AVChallenge> list2 = a8.f125298d;
                if (!(list2 == null || (aVChallenge = (AVChallenge) h.a.n.h((List) list2)) == null)) {
                    bool = Boolean.valueOf(aVChallenge.isCommerce);
                }
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                h.f.b.l.b(createIAVServiceProxybyMonsterPlugin2, "");
                createIAVServiceProxybyMonsterPlugin2.getBusiStickerService().a(Boolean.valueOf(z2), str7, str3, str2, bool);
            }
            hVar.d().a(false);
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131309a;

        static {
            Covode.recordClassIndex(86020);
        }

        c(h hVar) {
            this.f131309a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Float f2;
            String str;
            String str2;
            Long l2;
            String valueOf;
            float f3;
            Integer num;
            String str3;
            h hVar = this.f131309a;
            com.ss.android.ugc.aweme.draft.g.c(dj.f126462e, hVar.f131298d.q);
            ASCameraView D = hVar.a().D();
            ComposerBeautyBuriedInfo a2 = h.a(hVar.c().i().p());
            com.ss.android.ugc.aweme.beauty.g a3 = h.a(hVar.c().i().o());
            long endFrameTimeUS = D.getEndFrameTimeUS() / 1000;
            FaceStickerBean i2 = hVar.d().i();
            if (!(com.ss.android.ugc.asve.recorder.j.f62303a == null || com.ss.android.ugc.asve.recorder.j.f62304b == null)) {
                com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("creation_id", hVar.f131298d.j().getCreationId()).a("content_type", hVar.f131298d.j().getContentType()).a("content_source", hVar.f131298d.j().getContentSource()).a("record_mode", hVar.f131298d.Z);
                Integer num2 = com.ss.android.ugc.asve.recorder.j.f62303a;
                if (num2 == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.tools.f.b a5 = a4.a("record_block_tms", num2.intValue());
                Integer num3 = com.ss.android.ugc.asve.recorder.j.f62304b;
                if (num3 == null) {
                    h.f.b.l.b();
                }
                com.ss.android.ugc.tools.f.b a6 = a5.a("record_block_duration", num3.intValue()).a("record_duration", D.getEndFrameTimeUS() / 1000).a("is_composer", com.ss.android.ugc.aweme.beauty.c.c(a2)).a("beautify_used", com.ss.android.ugc.aweme.beauty.c.b(a2)).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.a(a2));
                T value = hVar.b().getCurSelectedFilter().f6468a.getValue();
                if (value != null) {
                    num = Integer.valueOf(value.getId());
                } else {
                    num = null;
                }
                com.ss.android.ugc.tools.f.b a7 = a6.a("filter_id", h.a(num));
                if (i2 == null || (str3 = String.valueOf(i2.getStickerId())) == null) {
                    str3 = "";
                }
                r.a("video_record_block", a7.a("prop_id", str3).a("eyes", hVar.c().l()).a("smooth", hVar.c().k()).f149193a);
                com.ss.android.ugc.asve.recorder.j.f62303a = null;
                com.ss.android.ugc.asve.recorder.j.f62304b = null;
            }
            String[] t = D.getMediaController().t();
            if (t == null || t.length == 0) {
                f2 = "";
            } else {
                String str4 = t[t.length - 1];
                if (str4 != null && str4.length() > 0) {
                    File file = new File(str4);
                    if (file.exists() && file.isFile() && file.length() > 0) {
                        long length = file.length();
                        if (length > 0 && endFrameTimeUS > 0) {
                            f3 = ((((float) length) * 8.0f) / 1000.0f) / (((float) endFrameTimeUS) / 1000.0f);
                            f2 = Float.valueOf(f3);
                        }
                    }
                }
                f3 = 0.0f;
                f2 = Float.valueOf(f3);
            }
            T value2 = hVar.b().getCurSelectedFilter().f6468a.getValue();
            com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
            CameraComponentModel cameraComponentModel = hVar.f131298d.f124757b;
            h.f.b.l.b(cameraComponentModel, "");
            com.ss.android.ugc.tools.f.b a8 = bVar.a("source_duration", cameraComponentModel.h()).a("creation_id", hVar.f131298d.q).a("shoot_way", hVar.f131298d.r).a("resolution", com.ss.android.ugc.aweme.property.b.e());
            if (i2 == null || (str = i2.getId()) == null) {
                str = "";
            }
            com.ss.android.ugc.tools.f.b a9 = a8.a("effect_id", str);
            if (i2 == null || (str2 = i2.getRecId()) == null) {
                str2 = "";
            }
            com.ss.android.ugc.tools.f.b a10 = a9.a("effect_rec_id", str2);
            if (i2 != null) {
                l2 = Long.valueOf(i2.getStickerId());
            } else {
                l2 = "";
            }
            com.ss.android.ugc.tools.f.b a11 = a10.a("effect_sticker_id", l2);
            if (value2 == null) {
                valueOf = "";
            } else {
                int id = value2.getId();
                if (id == 0) {
                    valueOf = "-1";
                } else {
                    valueOf = String.valueOf(id);
                }
            }
            Map<String, String> map = a11.a("filter_id", valueOf).a("beauty_status", com.ss.android.ugc.aweme.beauty.c.a(a2, a3)).a("lag_count", D.getMediaController().i()).a("lag_max", D.getMediaController().j()).a("fps", String.valueOf(D.getMediaController().l())).a("file_bitrate", f2).a("bitrate", String.valueOf(com.ss.android.ugc.aweme.property.b.c())).a("lag_total_duration", D.getMediaController().k()).a("duration", endFrameTimeUS).a("write_fps", String.valueOf(D.getMediaController().q())).a("frame_total", D.getMediaController().r()).a("beautify_used", com.ss.android.ugc.aweme.beauty.c.b(a2)).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.a(a2)).a("is_composer", com.ss.android.ugc.aweme.beauty.c.c(a2)).f149193a;
            h.f.b.l.b(map, "");
            com.ss.android.ugc.aweme.shortvideo.util.performance.a.a("tool_performance_video_record", map);
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f131310a;

        static {
            Covode.recordClassIndex(86021);
        }

        d(h hVar) {
            this.f131310a = hVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            String str;
            String str2;
            Integer num;
            String str3;
            String str4;
            String str5;
            String gradeKey;
            String str6;
            String propSource;
            String str7;
            LiveData<com.ss.android.ugc.aweme.sticker.presenter.b> g2;
            com.ss.android.ugc.aweme.sticker.presenter.b value;
            com.ss.android.ugc.aweme.sticker.presenter.r value2;
            Long l2;
            Integer valueOf;
            Long l3;
            String str8;
            String str9;
            String str10;
            Long l4;
            String str11;
            Integer num2;
            String str12;
            String str13;
            float f2;
            float f3;
            String str14;
            com.ss.android.ugc.aweme.filter.repository.a.m mVar;
            com.ss.android.ugc.aweme.filter.repository.a.m mVar2;
            String str15;
            String str16;
            com.bytedance.creativex.recorder.b.a.o oVar = (com.bytedance.creativex.recorder.b.a.o) obj;
            h hVar = this.f131310a;
            h.f.b.l.b(oVar, "");
            if (hVar.f131298d.f124757b.f124712g < hVar.f131298d.f124757b.f124707b) {
                FaceStickerBean i2 = hVar.d().i();
                if (i2 == FaceStickerBean.NONE) {
                    i2 = null;
                }
                T value3 = hVar.b().getCurSelectedFilter().f6468a.getValue();
                boolean z = !com.ss.android.ugc.aweme.beauty.b.b();
                com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", hVar.f131298d.q).a("enter_from", "video_shoot_page").a("content_type", hVar.f131298d.j().getContentType()).a("content_source", hVar.f131298d.j().getContentSource()).a("shoot_way", hVar.f131298d.r);
                if (hVar.a().N() == 1) {
                    str = "front";
                } else {
                    str = "back";
                }
                com.ss.android.ugc.tools.f.b a3 = a2.a("camera", str).a("speed_mode", hVar.a().K().toString());
                if (value3 == null || (str2 = value3.getEnName()) == null) {
                    str2 = "";
                }
                com.ss.android.ugc.tools.f.b a4 = a3.a("filter_name", str2);
                if (value3 != null) {
                    num = Integer.valueOf(value3.getId());
                } else {
                    num = null;
                }
                com.ss.android.ugc.tools.f.b a5 = a4.a("filter_id", h.a(num));
                int i3 = hVar.f131298d.Z;
                String str17 = "press";
                if (i3 == 0) {
                    str3 = "click";
                } else if (i3 == 1) {
                    str3 = str17;
                } else if (i3 == 8) {
                    str3 = "video";
                } else if (i3 == 14) {
                    str3 = "video_180";
                } else if (i3 == 10) {
                    str3 = "video_15";
                } else if (i3 != 11) {
                    str3 = "";
                } else {
                    str3 = "video_60";
                }
                com.ss.android.ugc.tools.f.b a6 = a5.a("record_mode", str3);
                int i4 = oVar.f28198a;
                if (i4 == 1) {
                    str17 = "click";
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        str17 = "";
                    } else {
                        str17 = "countdown";
                    }
                }
                com.ss.android.ugc.tools.f.b a7 = a6.a("record_type", str17);
                if (i2 == null || (str4 = String.valueOf(i2.getStickerId())) == null) {
                    str4 = "";
                }
                com.ss.android.ugc.tools.f.b a8 = a7.a("prop_id", str4).a("is_westwindow_exist", hVar.f131298d.aR);
                String str18 = "0";
                if (i2 == null || (str5 = i2.getRecId()) == null) {
                    str5 = str18;
                }
                com.ss.android.ugc.tools.f.b a9 = a8.a("prop_rec_id", str5);
                if (i2 == null) {
                    gradeKey = "";
                } else {
                    gradeKey = i2.getGradeKey();
                }
                com.ss.android.ugc.tools.f.b a10 = a9.a("prop_index", gradeKey);
                CommentVideoModel commentVideoModel = hVar.f131298d.f124767l;
                if (commentVideoModel == null || (str6 = commentVideoModel.getEnterMethod()) == null) {
                    str6 = "";
                }
                com.ss.android.ugc.tools.f.b a11 = a10.a("enter_method", str6);
                if (hVar.f131298d.C != 0) {
                    a11.a("draft_id", hVar.f131298d.C);
                }
                String str19 = hVar.f131298d.D;
                h.f.b.l.b(str19, "");
                if (str19.length() > 0) {
                    a11.a("new_draft_id", hVar.f131298d.D);
                }
                if (i2 == null) {
                    propSource = "";
                } else {
                    propSource = i2.getPropSource();
                }
                String a12 = com.ss.android.ugc.aweme.sticker.n.a(propSource, true);
                GreenScreenMaterial greenScreenMaterial = hVar.f131298d.w;
                if (greenScreenMaterial != null) {
                    str7 = greenScreenMaterial.getMediasource();
                } else {
                    str7 = null;
                }
                a11.a("prop_selected_from", str7);
                if (!TextUtils.isEmpty(a12)) {
                    a11.a("prop_selected_from", a12);
                }
                h.f.b.l.b(a11, "");
                FaceStickerBean i5 = hVar.d().i();
                if (!(i5 == null || (g2 = hVar.d().t().n().g()) == null || (value = g2.getValue()) == null)) {
                    h.f.b.l.b(value, "");
                    LiveData<com.ss.android.ugc.aweme.sticker.presenter.r> f4 = hVar.d().t().n().f();
                    if (!(f4 == null || (value2 = f4.getValue()) == null)) {
                        h.f.b.l.b(value2, "");
                        if (!value.f135276d && !h.f.b.l.a(i5, FaceStickerBean.NONE)) {
                            int i6 = value2.f135428a;
                            if (i6 >= 0) {
                                a11.a("prop_tab_order", String.valueOf(i6));
                            }
                            int i7 = value.f135275c;
                            if (i7 >= 0) {
                                a11.a("prop_impr_position", String.valueOf(i7));
                            }
                        }
                    }
                }
                FaceStickerBean i8 = hVar.d().i();
                if (i8 != null) {
                    l2 = Long.valueOf(i8.getStickerId());
                } else {
                    l2 = null;
                }
                String valueOf2 = String.valueOf(l2);
                if (hVar.f131298d.u != null && valueOf2 != null && hVar.f131298d.r.equals("draft_again") && !TextUtils.isEmpty(valueOf2)) {
                    int indexOf = TextUtils.indexOf(hVar.f131298d.u, valueOf2);
                    if (indexOf == 0) {
                        str16 = "first";
                    } else if (indexOf == -1) {
                        str16 = "not_drafts";
                    } else {
                        str16 = "other";
                    }
                    a11.a("prop_from", str16);
                }
                if (hVar.a().ap() != null) {
                    com.ss.android.ugc.aweme.shortvideo.record.a.a ap = hVar.a().ap();
                    if (ap == null) {
                        h.f.b.l.b();
                    }
                    ReactionWindowInfo reactionWindowInfo = ap.f130009c.getReactionWindowInfo();
                    ReactionParams reactionParams = hVar.f131298d.f124757b.p.f124739a;
                    if (reactionParams == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(reactionWindowInfo, "");
                    h.f.b.l.d(reactionWindowInfo, "");
                    reactionParams.addReactionWindowInfo(new CopiedReactionWindowInfo(reactionWindowInfo.getWidth(), reactionWindowInfo.getHeight(), reactionWindowInfo.getAngle(), reactionWindowInfo.getType()));
                    com.ss.android.ugc.tools.f.b a13 = a11.a("height", reactionWindowInfo.getHeight()).a("width", reactionWindowInfo.getWidth()).a("angle", new StringBuilder().append(reactionWindowInfo.getAngle()).toString());
                    if (reactionWindowInfo.getType() == 1) {
                        str15 = "round";
                    } else {
                        str15 = "square";
                    }
                    a13.a("window_type", str15);
                }
                if (z) {
                    a11.a("smooth", hVar.c().k()).a("shape", hVar.c().m()).a("eyes", hVar.c().l()).a("tanning", hVar.c().n());
                }
                T value4 = hVar.b().getCurSelectedFilter().f6468a.getValue();
                if (value4 != null) {
                    com.bytedance.creativex.recorder.filter.a.e value5 = hVar.b().getCurrentFilterSource().getValue();
                    if (value5 == null || (mVar2 = value5.f28228c) == null) {
                        f2 = -1.0f;
                    } else {
                        f2 = mVar2.a(value4);
                    }
                    com.bytedance.creativex.recorder.filter.a.e value6 = hVar.b().getCurrentFilterSource().getValue();
                    if (value6 == null || (mVar = value6.f28228c) == null) {
                        f3 = -1.0f;
                    } else {
                        f3 = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(mVar, value4);
                    }
                    a11.a("filter_value", Float.valueOf(f3));
                    if (((double) Math.abs(com.ss.android.ugc.aweme.filter.c.a(value4) - f2)) < 0.01d || com.ss.android.ugc.aweme.filter.c.a(value4) == -1.0f) {
                        str14 = "1";
                    } else {
                        str14 = str18;
                    }
                    a11.a("is_original_filter", str14);
                } else {
                    a11.a("filter_value", "");
                }
                a11.a("camera_type", com.ss.android.ugc.aweme.shortvideo.util.z.a(hVar.a().D().getCurrentCameraType()));
                if (oVar.f28199b == 0) {
                    valueOf = "";
                } else {
                    valueOf = Integer.valueOf(oVar.f28199b);
                }
                a11.a("countdown_type", valueOf);
                String str20 = "upload";
                if (hVar.f131298d.aB != 0) {
                    if (hVar.f131298d.aB == 1) {
                        str13 = str20;
                    } else {
                        str13 = "shoot";
                    }
                    a11.a("picture_source", str13);
                }
                if (hVar.f131298d.f124757b.f124714i) {
                    a11.a("action_type", "reshoot");
                }
                String str21 = "off";
                if (com.ss.android.ugc.aweme.shortvideo.duet.a.a(hVar.f131298d)) {
                    a11.a("duet_layout", hVar.f131298d.f124757b.o.f124729j);
                    if (hVar.f131298d.f124757b.f124717l) {
                        str12 = str21;
                    } else {
                        str12 = "on";
                    }
                    a11.a("mic_status", str12);
                }
                a11.a("from_group_id", dv.a());
                if (TextUtils.equals(hVar.f131298d.x, "super_entrance")) {
                    a11.a("is_special_icon", 1);
                }
                String str22 = hVar.f131298d.X;
                if (str22 == null) {
                    str22 = "";
                }
                a11.a("from_prop_id", str22);
                String str23 = hVar.f131298d.X;
                if (i2 != null) {
                    l3 = Long.valueOf(i2.getStickerId());
                } else {
                    l3 = null;
                }
                if (h.f.b.l.a((Object) str23, (Object) String.valueOf(l3))) {
                    str8 = "1";
                } else {
                    str8 = str18;
                }
                a11.a("is_default_prop", str8);
                if (i2 == null || !i2.isBusi()) {
                    str9 = str18;
                } else {
                    str9 = "1";
                }
                a11.a("is_commercial_prop", str9);
                GreenScreenMaterial greenScreenMaterial2 = hVar.f131298d.w;
                if (greenScreenMaterial2 != null) {
                    str10 = greenScreenMaterial2.getResId();
                } else {
                    str10 = null;
                }
                a11.a("giphy_id", str10);
                String str24 = hVar.f131298d.X;
                if (i2 != null) {
                    l4 = Long.valueOf(i2.getStickerId());
                } else {
                    l4 = null;
                }
                if (h.f.b.l.a((Object) str24, (Object) String.valueOf(l4))) {
                    str11 = "1";
                } else {
                    str11 = str18;
                }
                a11.a("is_default_prop", str11);
                if (i2 != null && i2.isBusi()) {
                    str18 = "1";
                }
                a11.a("is_commercial_prop", str18);
                if (hVar.f131298d.i()) {
                    a11.a("shoot_entrance", hVar.f131298d.r);
                    a11.a("reviewed", hVar.f131298d.ab.getReviewed());
                    if (!TextUtils.isEmpty(hVar.f131298d.ab.getOrderId())) {
                        a11.a(com.ss.android.ugc.aweme.shoutouts.d.MOD_ORDER_ID, hVar.f131298d.ab.getOrderId());
                    }
                }
                a11.a("shoot_page", "video_shoot_page");
                a11.a("shoot_tab_name", hVar.f131298d.r());
                r.a("record_video", a11.f149193a);
                if (hVar.f131298d.aB == 0) {
                    hVar.f131298d.aC.add("");
                } else {
                    ArrayList<String> arrayList = hVar.f131298d.aC;
                    if (hVar.f131298d.aB != 1) {
                        str20 = "shoot";
                    }
                    arrayList.add(str20);
                }
                com.ss.android.ugc.aweme.beauty.c.b(h.a(hVar.c().i().p()), h.a(hVar.c().i().o()));
                if (hVar.f131298d.aZ == null) {
                    hVar.f131298d.aZ = com.ss.android.ugc.aweme.beauty.d.a(hVar.c().i().s());
                }
                if (com.ss.android.ugc.aweme.port.in.l.f115658a.g().b(com.ss.android.ugc.aweme.df.b.a())) {
                    str21 = "on";
                }
                r.a("earphone_status", new com.ss.android.ugc.tools.f.b().a("plugin_type", "record_video").a("to_status", str21).f149193a);
                ShortVideoContext shortVideoContext = hVar.f131298d;
                com.ss.android.ugc.asve.recorder.c.a mediaController = hVar.a().D().getMediaController();
                FaceStickerBean i9 = hVar.d().i();
                T value7 = hVar.b().getCurSelectedFilter().f6468a.getValue();
                if (value7 != null) {
                    num2 = Integer.valueOf(value7.getId());
                } else {
                    num2 = null;
                }
                com.ss.android.ugc.aweme.shortvideo.eventtrack.a.a(shortVideoContext, mediaController, i9, num2, h.a(hVar.c().i().p()), h.a(hVar.c().i().o()), "start_record", p.f131324a);
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.m<String, Map<String, String>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f131318a = new l();

        static {
            Covode.recordClassIndex(86029);
        }

        l() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(map2, "");
            com.ss.android.ugc.aweme.shortvideo.util.performance.a.a(str2, map2);
            return h.z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<String, Map<String, String>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f131324a = new p();

        static {
            Covode.recordClassIndex(86034);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, Map<String, String> map) {
            String str2 = str;
            Map<String, String> map2 = map;
            h.f.b.l.d(str2, "");
            h.f.b.l.d(map2, "");
            com.ss.android.ugc.aweme.shortvideo.util.performance.a.a(str2, map2);
            return h.z.f158842a;
        }
    }

    static void a(ShortVideoContext shortVideoContext, String str) {
        String str2;
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("content_type", "video").a("creation_id", shortVideoContext.q).a("to_status", str).a("shoot_way", shortVideoContext.r).a("enter_from", "video_shoot_page");
        if (shortVideoContext.O) {
            str2 = "click_draft";
        } else {
            str2 = "";
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("enter_method", str2);
        if (shortVideoContext.C != 0) {
            a3.a("draft_id", shortVideoContext.C);
        }
        if (!TextUtils.isEmpty(shortVideoContext.D)) {
            a3.a("new_draft_id", shortVideoContext.D);
        }
        r.a("mute_microphone", a3.f149193a);
    }

    public final void a(String str, long j2) {
        CameraComponentModel e2 = a().e();
        ar arVar = new ar();
        arVar.a("error_type", str);
        arVar.a("error_duration", Long.valueOf(j2));
        arVar.a("segment_count", Integer.valueOf(e2.f124711f.size()));
        Workspace workspace = e2.f124713h;
        h.f.b.l.b(workspace, "");
        File e3 = workspace.e();
        h.f.b.l.b(e3, "");
        if (e3.isDirectory()) {
            arVar.a("file_path", bl.a(e3.list(), ","));
        }
        com.ss.android.ugc.aweme.port.in.g.a().I().a("aweme_draft_edit_error", arVar.a());
    }

    static final class o extends h.f.b.m implements h.f.a.r<Integer, Integer, String, ax, h.z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(86032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h hVar) {
            super(4);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ h.z a(Integer num, Integer num2, String str, ax axVar) {
            Integer num3;
            String valueOf;
            int intValue = num.intValue();
            num2.intValue();
            ax axVar2 = axVar;
            String str2 = "";
            h.f.b.l.d(axVar2, str2);
            if (intValue == 1076) {
                com.ss.android.ugc.asve.recorder.j.f62305c = axVar2.C();
                com.ss.android.ugc.asve.recorder.j.f62306d = axVar2.D();
                com.ss.android.ugc.asve.recorder.j.f62307e = axVar2.E();
                com.ss.android.ugc.asve.recorder.j.f62308f = axVar2.F();
                final ComposerBeautyBuriedInfo a2 = h.a(this.this$0.c().i().p());
                final com.ss.android.ugc.aweme.beauty.g a3 = h.a(this.this$0.c().i().o());
                com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.this$0.f131298d.j().getCreationId()).a("content_type", this.this$0.f131298d.j().getContentType()).a("content_source", this.this$0.f131298d.j().getContentSource()).a("record_mode", this.this$0.f131298d.Z).a("record_duration", this.this$0.a().D().getEndFrameTimeUS() / 1000);
                T value = this.this$0.b().getCurSelectedFilter().f6468a.getValue();
                if (value != null) {
                    num3 = Integer.valueOf(value.getId());
                } else {
                    num3 = null;
                }
                com.ss.android.ugc.tools.f.b a5 = a4.a("filter_id", h.a(num3));
                FaceStickerBean i2 = this.this$0.d().i();
                if (!(i2 == null || (valueOf = String.valueOf(i2.getStickerId())) == null)) {
                    str2 = valueOf;
                }
                final com.ss.android.ugc.tools.f.b a6 = a5.a("prop_id", str2).a("eyes", this.this$0.c().l()).a("smooth", this.this$0.c().k()).a("reshape", this.this$0.c().m()).a("record_preview_frame_rate_start", Double.valueOf(com.ss.android.ugc.asve.recorder.j.f62305c)).a("record_preview_frame_rate_end", Double.valueOf(com.ss.android.ugc.asve.recorder.j.f62306d)).a("record_render_frame_time", Double.valueOf(com.ss.android.ugc.asve.recorder.j.f62307e)).a("record_effect_render_time", Double.valueOf(com.ss.android.ugc.asve.recorder.j.f62308f));
                b.i.b(new Callable() {
                    /* class com.ss.android.ugc.aweme.shortvideo.ui.a.h.o.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(86033);
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        r.a("record_frame_rate_info", a6.a("is_composer", com.ss.android.ugc.aweme.beauty.c.c(a2)).a("beautify_used", com.ss.android.ugc.aweme.beauty.c.b(a2)).a("beautify_info", com.ss.android.ugc.aweme.beauty.c.a(a2)).a("beautify_status", com.ss.android.ugc.aweme.beauty.c.a(a2, a3)).f149193a);
                        return h.z.f158842a;
                    }
                }, r.a());
            }
            return h.z.f158842a;
        }
    }
}
