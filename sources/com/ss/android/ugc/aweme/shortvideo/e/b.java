package com.ss.android.ugc.aweme.shortvideo.e;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.als.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.bytedance.creativex.recorder.b.a.x;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.experiment.ei;
import com.ss.android.ugc.aweme.experiment.ej;
import com.ss.android.ugc.aweme.experiment.ek;
import com.ss.android.ugc.aweme.experiment.el;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.ax;
import com.ss.ugc.effectplatform.algorithm.e;
import h.a.ag;
import h.a.n;
import h.f.a.r;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.p;
import h.z;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b extends j<a> implements com.bytedance.o.a, a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f126662a = {new y(b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public final ASCameraView f126663b;

    /* renamed from: c  reason: collision with root package name */
    public String f126664c;

    /* renamed from: d  reason: collision with root package name */
    public int f126665d;

    /* renamed from: e  reason: collision with root package name */
    public int f126666e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f126667f;

    /* renamed from: g  reason: collision with root package name */
    public final r<Integer, Integer, String, ax, z> f126668g;

    /* renamed from: h  reason: collision with root package name */
    public final a f126669h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f126670i = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f126671j = com.bytedance.o.b.a.a(getDiContainer(), m.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f126672k;

    /* renamed from: l  reason: collision with root package name */
    private int f126673l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.o.f f126674m;

    static {
        Covode.recordClassIndex(83076);
    }

    public final ShortVideoContext a() {
        return (ShortVideoContext) this.f126670i.a(this, f126662a[0]);
    }

    public final m b() {
        return (m) this.f126671j.a(this, f126662a[1]);
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.j
    public final /* bridge */ /* synthetic */ a getApiComponent() {
        return this.f126669h;
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.f126674m;
    }

    public final void c() {
        if (this.f126665d != -1) {
            this.f126663b.b(this.f126668g);
            int b2 = this.f126663b.getAudioController().b(this.f126665d);
            this.f126665d = -1;
            bj.a("zyc audio removeTrackAlgorithm ret=".concat(String.valueOf(b2)));
        }
    }

    @Override // com.bytedance.als.j
    public final void onDestroy() {
        super.onDestroy();
        c();
        if (this.f126666e != -1) {
            int a2 = this.f126663b.getAudioController().a(this.f126666e);
            this.f126666e = -1;
            bj.a("zyc audio removeTrackFilter ret=".concat(String.valueOf(a2)));
        }
    }

    public final boolean d() {
        boolean z;
        boolean z2 = !a().f124757b.a();
        if (!a().f124757b.b() || a().f124757b.f124717l) {
            z = false;
        } else {
            z = true;
        }
        bj.a("zyc audio enableLoudnessBalance, noMusic=" + z2 + ", duetMic=" + z);
        if (z2 || z) {
            return true;
        }
        return false;
    }

    static final class g<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f126681a;

        static {
            Covode.recordClassIndex(83083);
        }

        g(b bVar) {
            this.f126681a = bVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            LoudnessDetectResult[] detectAudioLoudness = TEInterface.detectAudioLoudness(new String[]{this.f126681a.a().f124757b.o.f124723d}, new int[]{0}, new int[]{(int) this.f126681a.a().f124757b.f124707b});
            if (!(detectAudioLoudness == null || detectAudioLoudness.length == 0 || detectAudioLoudness[0] == null || detectAudioLoudness[0].result != 0)) {
                this.f126681a.a().as.setPeakLoudness(detectAudioLoudness[0].peakLoudness);
                this.f126681a.a().as.setAvgLoudness(detectAudioLoudness[0].avgLoudness);
            }
            bj.a("zyc loudness detect success! peakLoudness = " + this.f126681a.a().as.getPeakLoudness() + ", avgLoudness = " + this.f126681a.a().as.getAvgLoudness());
            return z.f158842a;
        }
    }

    @Override // com.bytedance.als.j
    public final void onCreate() {
        super.onCreate();
        if (!com.ss.android.ugc.aweme.video.e.b(this.f126664c)) {
            c cVar = new c(this);
            d dVar = d.f126678a;
            Map<String, List<String>> b2 = ag.b(new p("AudioTimeAlignModel", n.c("time_align_44k.model")));
            DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioTimeAlignModel"}, b2, new C3290b("time_align_44k.model", cVar, dVar));
        }
        b().g().a(this, new e(this));
        b().m().a(this, new f(this));
        if (a().f124757b.b() && a().as != null && a().as.getPeakLoudness() == 0.0d && a().as.getAvgLoudness() == 0.0d && d()) {
            b.i.b(new g(this), b.i.f4824a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.e.b$b  reason: collision with other inner class name */
    public static final class C3290b implements IFetchResourceListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f126675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f126676b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f126677c;

        static {
            Covode.recordClassIndex(83078);
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onFailure(Exception exc) {
            l.d(exc, "");
            this.f126677c.invoke(exc);
        }

        @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
        public final void onSuccess(long j2) {
            String realFindResourceUri = e.a.a().a().realFindResourceUri(0, null, this.f126675a);
            if (TextUtils.isEmpty(realFindResourceUri)) {
                this.f126676b.invoke("");
                return;
            }
            URI create = URI.create(realFindResourceUri);
            l.b(create, "");
            String path = create.getPath();
            h.f.a.b bVar = this.f126676b;
            l.b(path, "");
            bVar.invoke(path);
        }

        C3290b(String str, h.f.a.b bVar, h.f.a.b bVar2) {
            this.f126675a = str;
            this.f126676b = bVar;
            this.f126677c = bVar2;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(83079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            String str2 = str;
            l.d(str2, "");
            this.this$0.f126664c = str2;
            bj.a("zyc downloadAudioTimeAlignModel success, path=".concat(String.valueOf(str2)));
            return z.f158842a;
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<Exception, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f126678a = new d();

        static {
            Covode.recordClassIndex(83080);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Exception exc) {
            Exception exc2 = exc;
            l.d(exc2, "");
            bj.b("zyc downloadAudioTimeAlignModel failed, error=" + exc2.getMessage());
            return z.f158842a;
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f126680a;

        static {
            Covode.recordClassIndex(83082);
        }

        f(b bVar) {
            this.f126680a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            x xVar = (x) obj;
            if (this.f126680a.a().f124757b.j().size() == 1) {
                this.f126680a.c();
            }
            l.b(xVar, "");
            if (xVar.f28214a != 1) {
                int i2 = this.f126680a.a().aJ;
                SharedPreferences.Editor edit = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
                edit.putInt("record_bgm_delay", i2);
                com.bytedance.common.utility.e.a.a(edit);
                if (this.f126680a.a().as != null) {
                    LoudnessBalanceParam loudnessBalanceParam = this.f126680a.a().as;
                    SharedPreferences.Editor edit2 = com.ss.android.ugc.aweme.bf.d.a(com.ss.android.ugc.aweme.port.in.i.f115645a, "publish", 0).edit();
                    edit2.putFloat("edit_peak_loudness", (float) loudnessBalanceParam.getPeakLoudness());
                    edit2.putFloat("edit_avg_loudness", (float) loudnessBalanceParam.getAvgLoudness());
                    edit2.putFloat("edit_bgm_loudness", (float) loudnessBalanceParam.getBgmLoudness());
                    com.bytedance.common.utility.e.a.a(edit2);
                }
            }
        }
    }

    public b(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.f126674m = fVar;
        h.h.d a2 = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
        this.f126672k = a2;
        this.f126663b = ((com.bytedance.creativex.recorder.b.a.d) a2.a(this, f126662a[2])).D();
        this.f126665d = -1;
        this.f126666e = -1;
        this.f126673l = -1;
        this.f126668g = new a(this);
        this.f126669h = this;
    }

    static final class e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f126679a;

        static {
            Covode.recordClassIndex(83081);
        }

        e(b bVar) {
            this.f126679a = bVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            double d2;
            double d3;
            if (!this.f126679a.b().e().f6468a.getValue().booleanValue()) {
                b bVar = this.f126679a;
                boolean z2 = com.ss.android.ugc.aweme.shortvideo.b.a.f124989a;
                boolean z3 = true;
                if (!bVar.a().f124757b.b() || bVar.a().f124757b.f124717l) {
                    z = false;
                } else {
                    z = true;
                }
                bj.a("zyc audio enableAudioAlignModel, isPlugged=" + z2 + ", duetMic=" + z);
                if (z2 || !z) {
                    z3 = false;
                }
                if (z3 && this.f126679a.f126665d == -1) {
                    this.f126679a.f126663b.a(this.f126679a.f126668g);
                    String str = this.f126679a.f126664c;
                    if (str != null) {
                        b bVar2 = this.f126679a;
                        bVar2.f126665d = bVar2.f126663b.getAudioController().b(str);
                        bj.a("zyc audio addTrackAlgorithm path=" + str + ", index=" + this.f126679a.f126665d);
                    } else {
                        bj.b("zyc audio addTrackAlgorithm failed, path == null");
                    }
                }
                if (this.f126679a.d() && this.f126679a.f126666e == -1) {
                    boolean b2 = this.f126679a.a().f124757b.b();
                    if (b2) {
                        ei a2 = ej.a();
                        if (a2 == null) {
                            l.b();
                        }
                        d2 = a2.f89925a;
                    } else {
                        ek a3 = el.a();
                        if (a3 == null) {
                            l.b();
                        }
                        d2 = a3.f89931a;
                    }
                    b bVar3 = this.f126679a;
                    bVar3.f126666e = bVar3.f126663b.getAudioController().a(d2);
                    if (b2) {
                        ei a4 = ej.a();
                        if (a4 == null) {
                            l.b();
                        }
                        d3 = a4.f89926b;
                    } else if (!this.f126679a.a().f124757b.a()) {
                        ek a5 = el.a();
                        if (a5 == null) {
                            l.b();
                        }
                        d3 = a5.f89932b;
                    } else {
                        d3 = -18.0d;
                    }
                    b bVar4 = this.f126679a;
                    if (bVar4.a().as != null) {
                        bVar4.a().as.setBgmLoudness(d3);
                    }
                    bj.a("zyc audio addTrackFilter index=" + this.f126679a.f126666e + ", isDuet = " + this.f126679a.a().f124757b.b() + ", filterValue = " + d2);
                }
            }
        }
    }

    static final class a extends h.f.b.m implements r<Integer, Integer, String, ax, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(83077);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(4);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.r
        public final /* synthetic */ z a(Integer num, Integer num2, String str, ax axVar) {
            boolean z;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            if (intValue == aj.B) {
                b bVar = this.this$0;
                if (intValue2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bVar.f126667f = z;
                bj.a("zyc audio set delay ret=".concat(String.valueOf(intValue2)));
            }
            if (this.this$0.f126667f && intValue == aj.A) {
                this.this$0.a().aJ = intValue2;
                bj.a("zyc audio set delay=" + intValue2 + " ms");
                this.this$0.f126667f = false;
            }
            return z.f158842a;
        }
    }
}
