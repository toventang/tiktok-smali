package com.ss.android.ugc.aweme.story.record.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.opengl.EGLContext;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.port.in.br;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.j;
import com.ss.android.ugc.aweme.property.ae;
import com.ss.android.ugc.aweme.property.bn;
import com.ss.android.ugc.aweme.property.ds;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.record.k;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.task.f;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.bl;
import com.ss.android.ugc.aweme.shortvideo.util.performance.CameraFirstFramePerformanceMonitor;
import com.ss.android.ugc.aweme.story.record.g.d;
import com.ss.android.ugc.aweme.story.record.h;
import com.ss.android.ugc.aweme.utils.gf;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.vesdk.runtime.VERuntime;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends k<a> implements a {
    protected h aa;
    boolean ab;
    final com.bytedance.als.k<z> ac;
    public m<String, String, String> ad;
    private String ae;
    private boolean af;

    static {
        Covode.recordClassIndex(90362);
    }

    public final h an() {
        return this.aa;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void at() {
        super.at();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(boolean z, int i2, String str) {
        gr.a("camera_error", "3", "onCameraOpenFailed : errorCode," + i2 + "msg :" + str + " permission : " + d.a(this.t));
        if (z) {
            com.ss.android.ugc.aweme.story.record.b.b.f138173a.b(this.t);
            return;
        }
        androidx.appcompat.app.d dVar = this.t;
        d dVar2 = new d(this);
        e eVar = new e(this);
        l.d(dVar, "");
        l.d(dVar2, "");
        l.d(eVar, "");
        if (d.f138300a == null) {
            a.C0731a a2 = new a.C0731a(dVar).b(R.string.v_).b(R.string.va, (DialogInterface.OnClickListener) new d.a(dVar2), false).a(R.string.asi, (DialogInterface.OnClickListener) new d.b(dVar, eVar), false);
            a2.M = false;
            Dialog b2 = a2.a().b();
            b2.setOnDismissListener(d.c.f138305a);
            d.f138300a = b2;
        }
        Dialog dialog = d.f138300a;
        if (dialog != null && (dVar instanceof Activity) && !dVar.isFinishing() && !dialog.isShowing()) {
            try {
                dialog.show();
                eu.a(dialog);
            } catch (Exception e2) {
                e.a(e2.toString());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(String[] strArr, double[] dArr, boolean[] zArr) {
        super.a(strArr, dArr, zArr);
        com.ss.android.ugc.aweme.shortvideo.f.a.a(this.A.n);
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
        a2.a("is_story", (Integer) 1);
        JSONObject a3 = a2.a();
        q.a("aweme_draft_edit_error", a3);
        com.ss.android.ugc.tools.utils.q.a(a3.toString() + " RestoreType: " + this.A.f124706a);
        super.a(file, i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final boolean aK() {
        return bn.a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z ao() {
        this.t.finish();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z ap() {
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
    public final void aO() {
        super.aO();
        if (this.ad != null) {
            this.B.a(this.ad);
        }
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

    private static JSONObject aq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(DataType.AUDIO, false);
            jSONObject.put("is_story", 1);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aA() {
        super.aA();
        e.a("lackPermission() called");
        q.a("checkPermission", 1, aq());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aL() {
        super.aL();
        if (this.A.b()) {
            e.a("initDuet() called");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onCreate() {
        super.onCreate();
        this.x.c().a(new f(this));
        f.a(com.ss.android.ugc.aweme.shortvideo.ui.task.d.RECORD_ON_CREATE);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onDestroy() {
        super.onDestroy();
        f.a(com.ss.android.ugc.aweme.shortvideo.ui.task.d.RECORD_ON_DESTROY);
        if (bn.a()) {
            VERuntime.a.INSTANCE.veRuntime.f151404i = false;
            VERuntime.a.INSTANCE.veRuntime.f151405j = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aw() {
        super.aw();
        com.ss.android.ugc.tools.utils.q.a("StoryCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f130121b + " isOpenCameraSuccess: " + this.f130122c);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u, com.bytedance.als.j
    public void onResume() {
        super.onResume();
        f.a(com.ss.android.ugc.aweme.shortvideo.ui.task.d.RECORD_ON_RESUME);
        if (bn.a() && !this.af) {
            this.x.c().o.h();
        }
        if (this.af) {
            this.af = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void aJ() {
        e.a("initDuetAndReaction() called");
        File e2 = this.A.f124713h.e();
        if (!e2.exists() || (e2.exists() && e2.isDirectory() && (e2.listFiles() == null || e2.listFiles().length == 0))) {
            for (int i2 = 0; i2 < this.A.d().size(); i2++) {
                this.w.a((h.f.a.b<? super Integer, z>) null, (h.f.a.a<z>) null);
            }
            this.A.d().clear();
            this.A.a(0);
        }
        super.aJ();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(long j2) {
        super.a(j2);
        com.ss.android.ugc.aweme.utils.d.a("tool_performance_record_fetch_frames", new com.ss.android.ugc.tools.f.b().a("duration", j2).a("is_story", 1).f149193a);
    }

    static final /* synthetic */ z a(com.bytedance.o.f fVar) {
        br.a(((androidx.appcompat.app.d) fVar.a(androidx.appcompat.app.d.class, (String) null)).getApplication(), com.ss.android.ugc.aweme.port.in.m.f115659a, new j().a(), g.a().q()).a(com.ss.android.ugc.aweme.port.in.m.f115659a.a());
        VERuntime.a(ae.a());
        return z.f158842a;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void c(int i2) {
        b.a.f132249a.step("av_video_record_init", "camera open success");
        super.c(i2);
        q.a("aweme_open_camera_error_rate", 0, new ar().a("useVERecoder", (Boolean) true).a("is_story", (Integer) 1).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void d(int i2) {
        super.d(i2);
        q.a("aweme_open_camera_error_rate", 0, new ar().a("useVERecoder", (Boolean) true).a("is_story", (Integer) 1).a());
        b.a.f132249a.step("av_video_record_change_camera", "changeCamera#onOpenSuccess");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void e(int i2) {
        this.aa.f138315a.b("CreationID", this.ae);
        e.a("onNativeInitCallBack() called with: ret = [" + i2 + "]");
        q.a("aweme_camera_preview_init_fail", 0, new ar().a("is_story", (Integer) 1).a());
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
        q.a("aweme_camera_preview_init_fail", 1, new ar().a("errorCode", Integer.valueOf(i2)).a("errorDesc", "").a("exception", str).a("is_story", (Integer) 1).a());
        gr.a("camera_error", "3", "native init failed , ve result = ".concat(String.valueOf(i2)));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(SurfaceHolder surfaceHolder) {
        com.ss.android.ugc.tools.utils.q.a("StoryCameraCoreComponent => surfaceCreated isFirstSurfaceCreated: " + this.f130121b + " isOpenCameraSuccess: " + this.f130122c);
        q.a("zoom_info_log", new ar().a("camera_surface_view_size", "w = " + this.u.getWidth() + "   h = " + this.u.getHeight()).a());
        super.a(surfaceHolder);
    }

    @Override // com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final void b(float f2, float f3) {
        if (!ds.f118463a) {
            f2 += 100.0f;
        }
        aS();
        if (f2 >= 0.0f) {
            com.ss.android.ugc.aweme.story.record.j.b.a(this.t, f3);
            androidx.appcompat.app.d dVar = this.t;
            l.d(dVar, "");
            float b2 = (f2 - n.b(dVar, 35.0f)) / com.ss.android.ugc.aweme.story.record.j.b.a(dVar, f3);
            if (b2 > 0.98f) {
                b2 = 1.0f;
            }
            c(b2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void e(int i2, int i3) {
        e.a("onNativeInitHardEncoderRetCallback() called with: isCPUEncode = [" + i2 + "]");
        super.e(i2, i3);
        if (this.A.f124706a == 0) {
            com.ss.android.ugc.aweme.shortvideo.f.a.a(this.A.f124710e);
        }
        g.a().e().setRecordUseSuccessRecordProfile(i3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void f(int i2, int i3) {
        if (!this.G) {
            q.a("zoom_info_log", new ar().a("is_story", (Integer) 1).a("camera_preview_size", "w = " + i2 + "   h = " + i3).a());
        }
        super.f(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.k, com.bytedance.creativex.recorder.b.a.f, com.ss.android.ugc.aweme.shortvideo.record.u
    public final int a(com.ss.android.ugc.aweme.tools.g gVar, PrivacyCert privacyCert, String str) {
        b.a.f132249a.start("av_video_record_change_camera", "switchFrontRearCamera");
        return super.a(gVar, privacyCert, str);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, float f2, boolean z) {
        super.a(i2, f2, z);
        q.a("zoom_info_log", new ar().a("camera_zoom_size", " size = ".concat(String.valueOf(f2))).a("is_story", (Integer) 1).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void b(int i2, int i3, String str) {
        super.b(i2, i3, str);
        q.a("aweme_open_camera_error_rate", i3, new ar().a("useVERecoder", (Boolean) true).a("is_story", (Integer) 1).a("errorDesc", str).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, int i3, double d2) {
        super.a(i2, i3, d2);
        e.a("initWavFile() called with: sampleRate = [" + i2 + "], channels = [" + i3 + "], speed = [" + d2 + "]");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, int i3, String str) {
        super.a(i2, i3, str);
        q.a("aweme_open_camera_error_rate", i3, new ar().a("useVERecoder", (Boolean) true).a("errorDesc", str).a("is_story", (Integer) 1).a());
    }

    public b(ViewGroup viewGroup, com.bytedance.o.f fVar, CameraComponentModel cameraComponentModel, String str) {
        this(viewGroup, fVar, cameraComponentModel, new com.ss.android.ugc.aweme.story.record.b.d(), str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private b(android.view.ViewGroup r11, com.bytedance.o.f r12, com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r13, com.ss.android.ugc.aweme.shortvideo.record.ar r14, java.lang.String r15) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.story.record.b.c r6 = com.ss.android.ugc.aweme.story.record.b.c.f138179a
            com.ss.android.ugc.aweme.story.record.b.b r7 = com.ss.android.ugc.aweme.story.record.b.b.f138173a
            com.ss.android.ugc.aweme.story.record.a.c r8 = new com.ss.android.ugc.aweme.story.record.a.c
            r3 = r12
            r8.<init>(r3)
            com.ss.android.ugc.aweme.port.in.u r0 = com.ss.android.ugc.aweme.port.in.g.a()
            com.ss.android.ugc.aweme.record.d r2 = r0.l()
            com.ss.android.vesdk.k r1 = com.ss.android.ugc.aweme.shortvideo.eq.a()
            java.lang.String r0 = ""
            h.f.b.l.b(r1, r0)
            r2.initVESDK(r1)
            com.ss.android.ugc.aweme.story.record.b.a r9 = new com.ss.android.ugc.aweme.story.record.b.a
            r9.<init>()
            r2 = r10
            r4 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r2 = 3358(0xd1e, float:4.706E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r2)
            r0 = 1
            r10.af = r0
            r10.ab = r0
            com.bytedance.als.k r0 = new com.bytedance.als.k
            r0.<init>()
            r10.ac = r0
            r0 = 0
            r10.ad = r0
            r10.ae = r15
            com.ss.android.ugc.aweme.shortvideo.x.a r1 = r10.ax()
            com.ss.android.ugc.aweme.story.record.h r0 = new com.ss.android.ugc.aweme.story.record.h
            r0.<init>(r1)
            r10.aa = r0
            com.ss.android.ugc.asve.recorder.view.ASCameraView r0 = r10.w
            r11.addView(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.a.b.<init>(android.view.ViewGroup, com.bytedance.o.f, com.ss.android.ugc.aweme.shortvideo.CameraComponentModel, com.ss.android.ugc.aweme.shortvideo.record.ar, java.lang.String):void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(int i2, boolean z, boolean z2, float f2, List<Integer> list) {
        String str;
        super.a(i2, z, z2, f2, list);
        ar a2 = new ar().a("is_story", (Integer) 1).a("cameraType", Integer.valueOf(i2)).a("supportZoom", Boolean.valueOf(z)).a("supportSmooth", Boolean.valueOf(z2)).a("maxZoom", Float.valueOf(f2));
        if (com.bytedance.common.utility.h.b(list)) {
            str = new StringBuilder().append(list.get(0)).toString();
        } else {
            str = " ";
        }
        q.a("zoom_info_log", a2.a("ratios", str).a());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.record.u
    public final void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2) {
        gf.b();
        f.a(com.ss.android.ugc.aweme.shortvideo.ui.task.d.RECORD_ON_FIRST_FRAME);
        b.a.f132249a.end(CameraFirstFramePerformanceMonitor.f132343a, "camera frame available");
        super.a(eGLContext, i2, i3, i4, i5, j2);
    }
}
