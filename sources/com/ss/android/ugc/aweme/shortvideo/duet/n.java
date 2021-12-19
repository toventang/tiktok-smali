package com.ss.android.ugc.aweme.shortvideo.duet;

import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.basics.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.bytedance.o.f;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.experiment.fz;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.m;
import com.ss.android.ugc.aweme.shortvideo.x.m;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class n implements com.bytedance.o.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f126570k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f126571a;

    /* renamed from: b  reason: collision with root package name */
    public Effect f126572b;

    /* renamed from: c  reason: collision with root package name */
    public int f126573c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f126574d = ((com.bytedance.creativex.recorder.b.a.d) getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null));

    /* renamed from: e  reason: collision with root package name */
    public final e f126575e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.fragment.app.e f126576f;

    /* renamed from: g  reason: collision with root package name */
    public final ASCameraView f126577g;

    /* renamed from: h  reason: collision with root package name */
    public final j f126578h;

    /* renamed from: i  reason: collision with root package name */
    public final m f126579i;

    /* renamed from: j  reason: collision with root package name */
    final y f126580j;

    /* renamed from: l  reason: collision with root package name */
    private final f f126581l;

    static {
        Covode.recordClassIndex(83014);
    }

    static final class a {
        static {
            Covode.recordClassIndex(83015);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.f126581l;
    }

    public final void b() {
        if (!this.f126571a) {
            this.f126577g.setDuetSupportChangeLayout(true);
            this.f126571a = true;
        }
    }

    public final void a() {
        this.f126580j.a().a(this.f126576f, new b(this));
    }

    public static final class e implements com.bytedance.creativex.recorder.sticker.panel.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f126584a;

        static {
            Covode.recordClassIndex(83020);
        }

        @Override // com.bytedance.creativex.recorder.sticker.panel.f
        public final boolean a() {
            if (!n.a(this.f126584a.f126572b)) {
                return false;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f126584a.f126576f).a(R.string.be1).a();
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(n nVar) {
            this.f126584a = nVar;
        }
    }

    public static boolean a(Effect effect) {
        boolean z = false;
        if (effect == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(effect.getSdkExtra());
            z = jSONObject.optBoolean("effect_exclusive", false);
            z.f126627f = jSONObject.optInt("appearance_duration", 3000);
            return z;
        } catch (Exception e2) {
            e2.printStackTrace();
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f126582a;

        static {
            Covode.recordClassIndex(83016);
        }

        b(n nVar) {
            this.f126582a = nVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f126582a.f126571a = false;
                if (this.f126582a.f126572b != null) {
                    this.f126582a.b();
                }
                n nVar = this.f126582a;
                if (h.b() || nVar.f126572b != null) {
                    ChangeDuetLayoutViewModel changeDuetLayoutViewModel = (ChangeDuetLayoutViewModel) t.a(nVar.f126576f).a(ChangeDuetLayoutViewModel.class);
                    Effect effect = nVar.f126572b;
                    if (effect == null) {
                        effect = new Effect(null, 1, null);
                        effect.setName("left-right");
                        effect.setUnzipPath(h.c());
                        effect.setExtra("{\"duet_layout_mode\": \"{\\\"name\\\":\\\"horizontal\\\",\\\"change_direction_mode\\\":0,\\\"safety_status\\\":[\\\"new_left\\\"]}\"}");
                        effect.setSdkExtra("");
                    }
                    changeDuetLayoutViewModel.a(effect);
                }
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.d<? extends Integer>, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(83019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.d<? extends Integer> dVar) {
            int i2;
            com.bytedance.jedi.arch.d<? extends Integer> dVar2 = dVar;
            String str = "";
            l.d(dVar2, str);
            if (this.this$0.f126572b != null) {
                this.this$0.f126573c = dVar2.f39404b.intValue();
                m mVar = this.this$0.f126579i;
                Effect effect = this.this$0.f126572b;
                if (effect == null) {
                    l.b();
                }
                String unzipPath = effect.getUnzipPath();
                float f2 = (float) this.this$0.f126573c;
                if (mVar.f133009a != null) {
                    com.ss.android.ugc.asve.recorder.effect.composer.c g2 = mVar.f133009a.g();
                    g2.b(unzipPath, "switchButton", f2);
                    g2.a();
                }
                n nVar = this.this$0;
                Effect effect2 = nVar.f126572b;
                if (effect2 == null) {
                    l.b();
                }
                int i3 = this.this$0.f126573c;
                l.d(effect2, str);
                e a2 = l.a(effect2);
                if (a2 != null) {
                    List<String> list = a2.f126516c;
                    if (list != null) {
                        i2 = list.size();
                    } else {
                        i2 = -1;
                    }
                    if (i2 > i3) {
                        List<String> list2 = a2.f126516c;
                        if (list2 == null) {
                            l.b();
                        }
                        str = list2.get(i3);
                    }
                }
                r.a("switch_duet_layout", new com.ss.android.ugc.tools.f.b().a("creation_id", nVar.f126580j.b().q).a("shoot_way", nVar.f126580j.b().r).a("enter_from", "video_shoot_page").a("shoot_at", str).f149193a);
                Effect effect3 = this.this$0.f126572b;
                if (effect3 != null) {
                    n nVar2 = this.this$0;
                    nVar2.a(effect3, nVar2.f126573c);
                }
            }
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.d<? extends Effect>, z> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(83017);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(1);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.d<? extends Effect> dVar) {
            MethodCollector.i(10877);
            com.bytedance.jedi.arch.d<? extends Effect> dVar2 = dVar;
            l.d(dVar2, "");
            this.this$0.b();
            if (!l.a((Object) dVar2.f39404b, (Object) this.this$0.f126572b)) {
                this.this$0.f126573c = 0;
                if (n.a(dVar2.f39404b)) {
                    j jVar = this.this$0.f126578h;
                    if (!(jVar == null || com.ss.android.ugc.aweme.sticker.f.e.a(jVar) == null)) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.this$0.f126576f).a(R.string.be1).a();
                    }
                    j jVar2 = this.this$0.f126578h;
                    if (jVar2 != null) {
                        com.ss.android.ugc.aweme.sticker.f.e.a(jVar2, (Effect) null);
                    }
                    com.bytedance.creativex.recorder.sticker.a.c cVar = (com.bytedance.creativex.recorder.sticker.a.c) ApiCenter.a.a(this.this$0.f126576f).b(com.bytedance.creativex.recorder.sticker.a.c.class);
                    if (cVar != null) {
                        cVar.a(this.this$0.f126575e);
                    }
                }
                if (g.a("camera_front", (Effect) dVar2.f39404b) && this.this$0.f126574d.f().g() != 1) {
                    PrivacyCert privacyCert = new PrivacyCert(new com.bytedance.bpea.basics.j("1037"), "Open the camera on the shooting page to preview and shoot the video.", new k[]{com.bytedance.bpea.store.a.b.a()});
                    if (this.this$0.f126574d.b()) {
                        com.ss.android.ugc.aweme.cn.a.f c2 = this.this$0.f126574d.c();
                        com.ss.android.ugc.aweme.tools.g a2 = com.ss.android.ugc.aweme.tools.g.a();
                        l.b(a2, "");
                        c2.a(a2, privacyCert, (String) null);
                    } else {
                        com.bytedance.creativex.recorder.b.a.d dVar3 = this.this$0.f126574d;
                        com.ss.android.ugc.aweme.tools.g a3 = com.ss.android.ugc.aweme.tools.g.a();
                        l.b(a3, "");
                        int unused = dVar3.a(a3, privacyCert, (String) null);
                    }
                }
                if (TextUtils.isEmpty(dVar2.f39404b.getHint())) {
                    d dVar4 = (d) ApiCenter.a.a(this.this$0.f126576f).b(d.class);
                    if (dVar4 != null) {
                        dVar4.a("");
                    }
                } else {
                    d dVar5 = (d) ApiCenter.a.a(this.this$0.f126576f).b(d.class);
                    if (dVar5 != null) {
                        dVar5.a(dVar2.f39404b.getHint());
                    }
                }
            }
            this.this$0.f126572b = dVar2.f39404b;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ComposerInfo(dVar2.f39404b.getUnzipPath() + ";switchButton;" + this.this$0.f126573c, dVar2.f39404b.getSdkExtra()));
            m mVar = this.this$0.f126579i;
            if (mVar.f133009a != null) {
                mVar.f133009a.b(arrayList, 60000);
            }
            Effect effect = this.this$0.f126572b;
            if (effect != null) {
                this.this$0.a(effect, 0);
            }
            ASCameraView aSCameraView = this.this$0.f126577g;
            AnonymousClass1 r1 = new m.b(this) {
                /* class com.ss.android.ugc.aweme.shortvideo.duet.n.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f126583a;

                static {
                    Covode.recordClassIndex(83018);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f126583a = r1;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.m.b
                public final void a(boolean z) {
                    ac a2 = ae.a(this.f126583a.this$0.f126576f, (ad.b) null).a(ShortVideoContextViewModel.class);
                    l.b(a2, "");
                    ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
                    l.b(shortVideoContext, "");
                    shortVideoContext.f124757b.o.f124726g = z;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.m.b
                public final void a(boolean z, int i2, Exception exc) {
                    String c2;
                    int i3 = !z ? 1 : 0;
                    ar a2 = new ar().a("error_code", String.valueOf(i2));
                    if (exc == null) {
                        c2 = "";
                    } else {
                        c2 = com.facebook.common.d.m.c(exc);
                    }
                    q.a("download_aec_model", i3, a2.a("exception", c2).a());
                }
            };
            l.d(aSCameraView, "");
            if (fz.a() == 1) {
                m.d dVar6 = new m.d(aSCameraView, r1);
                com.ss.android.ugc.tools.utils.q.a("start download aec model");
                String audioAECModelName = TEEffectUtils.getAudioAECModelName();
                Map<String, List<String>> b2 = ag.b(new p("AudioAECModel", h.a.n.c(audioAECModelName)));
                DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioAECModel"}, b2, new m.c(audioAECModelName, dVar6));
            } else {
                com.ss.android.ugc.tools.utils.q.a("disable aec");
            }
            Effect effect2 = this.this$0.f126572b;
            if (effect2 != null) {
                this.this$0.a(effect2, 0);
            }
            z zVar = z.f158842a;
            MethodCollector.o(10877);
            return zVar;
        }
    }

    public final void a(Effect effect, int i2) {
        Object a2 = getDiContainer().a(com.bytedance.creativex.recorder.b.a.d.class, (String) null);
        String str = "";
        l.b(a2, str);
        if (((com.bytedance.creativex.recorder.b.a.d) a2).e().f124711f.size() == 0) {
            ac a3 = ae.a(this.f126576f, (ad.b) null).a(ShortVideoContextViewModel.class);
            l.b(a3, str);
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a3).f124769a;
            l.b(shortVideoContext, str);
            DuetContext duetContext = shortVideoContext.f124757b.o;
            l.d(effect, str);
            e a4 = l.a(effect);
            if (a4 != null && a4.f126517d.size() > i2) {
                str = a4.f126517d.get(i2);
            }
            duetContext.f124729j = str;
            duetContext.o = l.c(effect);
            duetContext.p = i2;
        }
    }

    public n(androidx.fragment.app.e eVar, ASCameraView aSCameraView, j jVar, com.ss.android.ugc.aweme.shortvideo.x.m mVar, y yVar, f fVar) {
        l.d(eVar, "");
        l.d(aSCameraView, "");
        l.d(mVar, "");
        l.d(yVar, "");
        l.d(fVar, "");
        this.f126576f = eVar;
        this.f126577g = aSCameraView;
        this.f126578h = jVar;
        this.f126579i = mVar;
        this.f126580j = yVar;
        this.f126581l = fVar;
        f.a.b.b unused = ((BaseJediViewModel) t.a(eVar).a(ChangeDuetLayoutViewModel.class)).a(eVar, o.f126585a, new ah(), new c(this));
        f.a.b.b unused2 = ((BaseJediViewModel) t.a(eVar).a(ChangeDuetLayoutViewModel.class)).a(eVar, p.f126586a, new ah(), new d(this));
        this.f126575e = new e(this);
    }
}
