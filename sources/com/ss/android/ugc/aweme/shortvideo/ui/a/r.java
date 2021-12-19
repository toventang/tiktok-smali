package com.ss.android.ugc.aweme.shortvideo.ui.a;

import android.content.Context;
import android.opengl.EGLContext;
import android.view.SurfaceHolder;
import com.bytedance.als.g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.z;
import com.bytedance.creativex.recorder.filter.b.b;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.experiment.gt;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.port.in.br;
import com.ss.android.ugc.aweme.port.in.j;
import com.ss.android.ugc.aweme.property.ae;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.property.ds;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ao;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.record.a.a;
import com.ss.android.ugc.aweme.shortvideo.record.k;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.i;
import com.ss.android.ugc.aweme.shortvideo.ui.task.d;
import com.ss.android.ugc.aweme.shortvideo.ui.task.f;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bc;
import com.ss.android.ugc.aweme.shortvideo.util.bl;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.x.m;
import com.ss.android.ugc.aweme.utils.gf;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.runtime.VERuntime;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class r extends k<z> implements z {
    protected m aa;
    protected a ab;
    boolean ac;
    final com.bytedance.als.k<h.z> ad;
    final com.bytedance.als.k<h.z> ae;
    private String af;
    private boolean ag;
    private boolean ah;

    static {
        Covode.recordClassIndex(86063);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final boolean a(boolean z, boolean z2) {
        return false;
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final g<h.z> an() {
        return this.ae;
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final g<h.z> ao() {
        return this.ad;
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final a ap() {
        return this.ab;
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final m aq() {
        return this.aa;
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final void a(FilterBean filterBean, Float f2) {
        float floatValue;
        m mVar = this.aa;
        if (f2 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f2.floatValue();
        }
        if (filterBean == null) {
            return;
        }
        if (com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
            if (mVar.f133010b != null) {
                mVar.f133012d.remove(mVar.f133010b.getFilterFolder());
            }
            String filterFolder = filterBean.getFilterFolder();
            if (!(filterFolder == null || mVar.f133010b == null || !mVar.f133012d.containsKey(filterFolder))) {
                Integer num = mVar.f133012d.get(filterFolder);
                if (num.intValue() == 1) {
                    mVar.b(filterBean.getFilterFilePath(), mVar.f133010b.getFilterFilePath(), 1.0f);
                } else if (num.intValue() == 2) {
                    mVar.b(mVar.f133010b.getFilterFolder(), filterBean.getFilterFolder(), 0.0f);
                }
                mVar.f133012d.remove(filterFolder);
            }
            if (!mVar.f133012d.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (String str : mVar.f133012d.keySet()) {
                    arrayList.add(new ComposerInfo(str + ":Filter_intensity", "", ""));
                    arrayList.add(new ComposerInfo(str + ":leftSlidePosition", "", ""));
                    arrayList.add(new ComposerInfo(str + ":rightSlidePosition", "", ""));
                }
                mVar.f133009a.a(arrayList);
                mVar.f133012d.clear();
            }
            if (mVar.f133010b != null) {
                mVar.f133009a.a(m.a(mVar.f133010b), m.a(filterBean, floatValue), 500);
                mVar.f133012d.put(filterBean.getFilterFilePath(), 3);
            } else {
                mVar.f133009a.a(new ArrayList(), m.a(filterBean, floatValue), 500);
                mVar.f133012d.put(filterBean.getFilterFolder(), 3);
            }
            mVar.f133010b = filterBean;
            mVar.f133011c = floatValue;
            return;
        }
        mVar.b(filterBean.getFilterFolder(), floatValue);
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final void a(FilterBean filterBean) {
        m mVar = this.aa;
        if (filterBean == null) {
            mVar.a("");
        } else if (com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(filterBean)) {
            mVar.f133009a.a(m.a(filterBean));
            mVar.f133010b = null;
            mVar.f133011c = 0.0f;
            mVar.f133012d.clear();
        } else {
            mVar.a("");
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(b bVar, b bVar2, float f2) {
        m mVar = this.aa;
        boolean a2 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(bVar.f28240a);
        boolean a3 = com.ss.android.ugc.aweme.filter.repository.internal.utils.a.a(bVar2.f28240a);
        float abs = f2 < 0.0f ? Math.abs(f2) : 1.0f - f2;
        if (!a2 || !a3) {
            mVar.f133009a.a(mVar.a(bVar), mVar.a(bVar2), abs, bVar.f28241b, bVar2.f28241b);
            return;
        }
        if (Math.abs(f2) < 0.05f) {
            abs = f2 <= 0.0f ? 0.0f : 1.0f;
        }
        String filterFolder = bVar.f28240a.getFilterFolder();
        String filterFolder2 = bVar2.f28240a.getFilterFolder();
        if (abs == 0.0f) {
            if (mVar.f133012d.containsKey(filterFolder)) {
                mVar.b(filterFolder, filterFolder2, 0.0f);
                mVar.f133009a.b(new String[]{bVar.f28240a.getFilterFolder()}, 1);
                mVar.f133012d.remove(filterFolder);
            }
        } else if (abs != 1.0f) {
            if (!mVar.f133012d.containsKey(filterFolder)) {
                mVar.f133009a.a(new String[]{filterFolder + ":leftSlidePosition:0"}, 1);
                mVar.f133009a.a(filterFolder, "Filter_intensity", bVar.f28241b);
                mVar.f133012d.put(filterFolder, 1);
            }
            if (!mVar.f133012d.containsKey(filterFolder2)) {
                mVar.f133009a.a(new String[]{filterFolder2 + ":rightSlidePosition:1"}, 1);
                mVar.f133009a.a(filterFolder2, "Filter_intensity", bVar2.f28241b);
                mVar.f133012d.put(filterFolder2, 2);
            }
            mVar.b(filterFolder, filterFolder2, abs);
        } else if (mVar.f133012d.containsKey(filterFolder2)) {
            mVar.b(filterFolder, filterFolder2, 1.0f);
            mVar.f133009a.b(new String[]{bVar2.f28240a.getFilterFolder()}, 1);
            mVar.f133012d.remove(filterFolder2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(boolean z, int i2, String str) {
        boolean a2 = i.f131885a.a(this.t);
        gr.a("camera_error", "3", "onCameraOpenFailed : errorCode," + i2 + "msg :" + str + " permission : " + a2);
        if (a2) {
            p.f131352a.b(this.t);
            return;
        }
        boolean a3 = gs.a();
        boolean a4 = gt.a();
        if (a3 || a4) {
            com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g.a(this.t, new t(this));
        } else {
            bc.a(this.t, new u(this), new v(this));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(String[] strArr, double[] dArr, boolean[] zArr) {
        super.a(strArr, dArr, zArr);
        com.ss.android.ugc.aweme.shortvideo.f.a.a(this.A.n);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2) {
        gf.b();
        f.a(d.RECORD_ON_FIRST_FRAME);
        b.a.f132249a.end(CameraFirstFramePerformanceMonitor.f132343a, "camera frame available");
        super.a(eGLContext, i2, i3, i4, i5, j2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(SurfaceHolder surfaceHolder) {
        q.a("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f130121b + " isOpenCameraSuccess: " + this.f130122c + " cameraClosedByLive: " + this.ag);
        com.ss.android.ugc.aweme.df.q.a("zoom_info_log", new ar().a("camera_surface_view_size", "w = " + this.u.getWidth() + "   h = " + this.u.getHeight()).a());
        super.a(surfaceHolder);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(File file, int i2) {
        ar a2 = new ar().a("error_code", Integer.valueOf(i2));
        a2.a("segment_count", Integer.valueOf(this.A.d().size()));
        StringBuilder sb = new StringBuilder();
        Iterator it = this.A.d().iterator();
        while (it.hasNext()) {
            sb.append(((TimeSpeedModelExtension) it.next()).getDuration()).append(",");
        }
        if (sb.length() == 0) {
            a2.a("video_durations", "");
        } else {
            a2.a("video_durations", sb.substring(0, sb.length() - 1));
        }
        a2.a("total_duration", Long.valueOf(this.A.f124712g));
        a2.a("path", file.getPath());
        if (file.isDirectory()) {
            a2.a("file_path", bl.a(file.list(), ","));
        }
        a2.a("enter_from", new StringBuilder().append(this.t.getIntent().getIntExtra("record_from", 0)).toString());
        JSONObject a3 = a2.a();
        com.ss.android.ugc.aweme.df.q.a("aweme_draft_edit_error", a3);
        q.a(a3.toString() + " RestoreType: " + this.A.f124706a);
        super.a(file, i2);
    }

    @Override // com.bytedance.creativex.recorder.b.a.d, com.ss.android.ugc.aweme.shortvideo.record.k
    public final void a(PrivacyCert privacyCert) {
        c.f149151f.d("TAG openCamera cameraClosedByLive: " + this.ag);
        super.a(privacyCert);
        this.ag = false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final boolean aK() {
        return bn.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z aY() {
        this.t.finish();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z aZ() {
        this.t.finish();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z ba() {
        this.t.finish();
        return null;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aE() {
        super.aE();
        b.a.f132249a.step("av_video_record_init", "camera open start");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aF() {
        super.aF();
        b.a.f132249a.end("av_video_record_change_camera", "changeCamera#onFirstFrame");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aG() {
        if (gr.f143024b) {
            gr.f143024b = false;
            gr.b("camera_success");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aH() {
        e.a("initMediaProcess() called");
        super.aH();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aN() {
        e.a("resetAllPlayStatus() called");
        super.aN();
        com.ss.android.ugc.aweme.shortvideo.f.a.a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aP() {
        super.aP();
        dmt.av.video.a.a("extracting_frame", "extract_shot");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aQ() {
        super.aQ();
        dmt.av.video.a.a("extracting_frame");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void az() {
        super.az();
        e.a("closeWavFile() called");
    }

    private static JSONObject bb() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DataType.AUDIO, false);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aA() {
        super.aA();
        e.a("lackPermission() called");
        com.ss.android.ugc.aweme.df.q.a("checkPermission", 1, bb());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aL() {
        super.aL();
        if (this.A.b()) {
            e.a("initDuet() called");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aM() {
        if (this.A.c()) {
            e.a("initReaction() called");
            if (this.ab == null) {
                this.ab = new a(this.t, this.w, this);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        this.x.c().a(new w(this));
        f.a(d.RECORD_ON_CREATE);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onDestroy() {
        super.onDestroy();
        if (bn.a()) {
            VERuntime.a.INSTANCE.veRuntime.f151404i = false;
            VERuntime.a.INSTANCE.veRuntime.f151405j = false;
        }
        f.a(d.RECORD_ON_DESTROY);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aw() {
        super.aw();
        q.a("TikTokCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f130121b + " isOpenCameraSuccess: " + this.f130122c + " cameraClosedByLive: " + this.ag);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onResume() {
        super.onResume();
        f.a(d.RECORD_ON_RESUME);
        if (bn.a() && !this.ah) {
            this.x.c().o.h();
        }
        if (this.ah) {
            this.ah = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aJ() {
        e.a("initDuetAndReaction() called");
        File e2 = this.A.f124713h.e();
        if (!e2.exists() || (e2.exists() && e2.isDirectory() && (e2.listFiles() == null || e2.listFiles().length == 0))) {
            for (int i2 = 0; i2 < this.A.d().size(); i2++) {
                this.w.a((h.f.a.b<? super Integer, h.z>) null, (h.f.a.a<h.z>) null);
            }
            this.A.d().clear();
            this.A.a(0);
        }
        super.aJ();
    }

    static final /* synthetic */ h.z a(com.bytedance.o.f fVar) {
        br.a(((androidx.appcompat.app.d) fVar.a(androidx.appcompat.app.d.class, (String) null)).getApplication(), com.ss.android.ugc.aweme.port.in.m.f115659a, new j().a(), com.ss.android.ugc.aweme.port.in.c.I).a(com.ss.android.ugc.aweme.port.in.m.f115659a.a());
        VERuntime.a(ae.a());
        return h.z.f158842a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void c(int i2) {
        b.a.f132249a.step("av_video_record_init", "camera open success");
        super.c(i2);
        com.ss.android.ugc.aweme.df.q.a("aweme_open_camera_error_rate", 0, new ar().a("useVERecoder", (Boolean) true).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void d(int i2) {
        super.d(i2);
        com.ss.android.ugc.aweme.df.q.a("aweme_open_camera_error_rate", 0, new ar().a("useVERecoder", (Boolean) true).a());
        b.a.f132249a.step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void e(int i2) {
        if (this.af != null) {
            this.aa.f133009a.b("CreationID", this.af);
        }
        e.a("onNativeInitCallBack() called with: ret = [" + i2 + "]");
        com.ss.android.ugc.aweme.df.q.a("aweme_camera_preview_init_fail", 0, (JSONObject) null);
        super.e(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void f(int i2) {
        e.a("onNativeInitCallBack() called with: ret = [" + i2 + "]");
        super.f(i2);
        com.ss.android.ugc.aweme.shortvideo.f.a.a();
        String str = "currentWidth:" + this.E + "    currentHeight:" + this.F + "      availableMem:";
        try {
            StringBuilder append = new StringBuilder().append(str).append(com.ss.android.ugc.aweme.utils.f.a(this.t)).append(" currentPIDMem:");
            Context applicationContext = this.t.getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            StringBuilder append2 = append.append(com.ss.android.ugc.aweme.utils.f.b(applicationContext)).append("hasUsedMem:");
            Context applicationContext2 = this.t.getApplication().getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                if (applicationContext2 == null) {
                    applicationContext2 = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
            }
            str = append2.append(com.ss.android.ugc.aweme.utils.f.c(applicationContext2)).toString();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        e.a((Throwable) new Exception("init failed detail: ".concat(String.valueOf(str))));
        com.ss.android.ugc.aweme.df.q.a("aweme_camera_preview_init_fail", 1, new ar().a("errorCode", Integer.valueOf(i2)).a("errorDesc", "").a("exception", str).a());
        gr.a("camera_error", "3", "native init failed , ve result = ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(long j2) {
        super.a(j2);
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_record_fetch_frames", new com.ss.android.ugc.tools.f.b().a("duration", j2).f149193a);
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final void b(int i2, int i3) {
        this.y.d(i2, i3);
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final void c(int i2, int i3) {
        this.y.c(i2, i3);
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final int a(int i2, VETrackParams vETrackParams) {
        this.y.K();
        return this.y.a(i2, vETrackParams);
    }

    @Override // com.bytedance.creativex.recorder.b.a.d, com.ss.android.ugc.aweme.shortvideo.record.k
    public final void c(boolean z, PrivacyCert privacyCert) {
        super.c(z, privacyCert);
        this.ag = true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void f(int i2, int i3) {
        if (!this.G) {
            com.ss.android.ugc.aweme.df.q.a("zoom_info_log", new ar().a("camera_preview_size", "w = " + i2 + "   h = " + i3).a());
        }
        super.f(i2, i3);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void b(float f2, float f3) {
        float a2;
        if (!ds.f118463a) {
            f2 += 100.0f;
        }
        aS();
        if (f2 >= 0.0f) {
            ao.a(this.t, f3);
            if (ds.f118463a) {
                androidx.appcompat.app.d dVar = this.t;
                l.d(dVar, "");
                a2 = ao.a(dVar, f3);
            } else {
                androidx.appcompat.app.d dVar2 = this.t;
                l.d(dVar2, "");
                f2 -= n.b(dVar2, 35.0f);
                a2 = ao.a(dVar2, f3);
            }
            float f4 = f2 / a2;
            if (!com.ss.android.ugc.aweme.property.ar.a() && f4 > 0.98f) {
                f4 = 1.0f;
            }
            c(f4);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void e(int i2, int i3) {
        e.a("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [" + i2 + "]");
        super.e(i2, i3);
        if (this.A.f124706a == 0) {
            com.ss.android.ugc.aweme.shortvideo.f.a.a(this.A.f124710e);
        }
        com.ss.android.ugc.aweme.port.in.g.a().e().setRecordUseSuccessRecordProfile(i3);
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final void a(int i2, int i3) {
        this.y.b(i2, i3);
        this.y.K();
    }

    @Override // com.bytedance.creativex.recorder.b.a.z
    public final void a(int i2, int i3, boolean z) {
        this.y.a(i2, i3, z);
    }

    public r(com.bytedance.o.f fVar, CameraComponentModel cameraComponentModel, String str) {
        this(fVar, cameraComponentModel, new ab(), str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final int a(com.ss.android.ugc.aweme.tools.g gVar, PrivacyCert privacyCert, String str) {
        b.a.f132249a.start("av_video_record_change_camera", "switchFrontRearCamera");
        return super.a(gVar, privacyCert, str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void b(int i2, int i3, String str) {
        super.b(i2, i3, str);
        com.ss.android.ugc.aweme.df.q.a("aweme_open_camera_error_rate", i3, new ar().a("useVERecoder", (Boolean) true).a("errorDesc", str).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, float f2, boolean z) {
        super.a(i2, f2, z);
        com.ss.android.ugc.aweme.df.q.a("zoom_info_log", new ar().a("camera_zoom_size", " size = ".concat(String.valueOf(f2))).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, int i3, double d2) {
        super.a(i2, i3, d2);
        e.a("initWavFile() called with: sampleRate = [" + i2 + "], channels = [" + i3 + "], speed = [" + d2 + "]");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, int i3, String str) {
        super.a(i2, i3, str);
        com.ss.android.ugc.aweme.df.q.a("aweme_open_camera_error_rate", i3, new ar().a("useVERecoder", (Boolean) true).a("errorDesc", str).a());
    }

    private r(com.bytedance.o.f fVar, CameraComponentModel cameraComponentModel, com.ss.android.ugc.aweme.shortvideo.record.ar arVar, String str) {
        super(fVar, cameraComponentModel, arVar, q.f131358a, p.f131352a, new s(fVar, cameraComponentModel), o.a());
        this.ac = true;
        this.ad = new com.bytedance.als.k<>();
        this.ag = false;
        this.ah = true;
        this.ae = new com.bytedance.als.k<>();
        this.af = str;
        this.aa = new m(ax(), this.y);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
        String str;
        super.a(i2, z, z2, f2, list);
        ar a2 = new ar().a("cameraType", Integer.valueOf(i2)).a("supportZoom", Boolean.valueOf(z)).a("supportSmooth", Boolean.valueOf(z2)).a("maxZoom", Float.valueOf(f2));
        if (h.b(list)) {
            str = new StringBuilder().append(list.get(0)).toString();
        } else {
            str = " ";
        }
        com.ss.android.ugc.aweme.df.q.a("zoom_info_log", a2.a("ratios", str).a());
    }
}
