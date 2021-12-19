package com.ss.android.vesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLContext;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VEModelDownload;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.vesdk.runtime.e f150996a;

    /* renamed from: b  reason: collision with root package name */
    protected g f150997b;

    /* renamed from: c  reason: collision with root package name */
    public VEModelDownload.a f150998c;

    /* renamed from: d  reason: collision with root package name */
    private VERuntime f150999d;

    /* renamed from: e  reason: collision with root package name */
    private int f151000e;

    public interface a {
        static {
            Covode.recordClassIndex(99315);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(99316);
        }

        void a(int i2);
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f151029a;

        /* renamed from: b  reason: collision with root package name */
        public String f151030b;

        static {
            Covode.recordClassIndex(99317);
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(99318);
        }

        void a(Bitmap bitmap, int i2);
    }

    public interface e {
        static {
            Covode.recordClassIndex(99319);
        }

        void a(int i2);
    }

    public interface f {
        static {
            Covode.recordClassIndex(99320);
        }
    }

    public interface g {
        static {
            Covode.recordClassIndex(99321);
        }

        BefTextLayoutResult a(String str, BefTextLayout befTextLayout);
    }

    public interface h {
        static {
            Covode.recordClassIndex(99322);
        }

        void a(int i2);

        void a(String[] strArr);
    }

    public interface i {

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f151031a;

            /* renamed from: b  reason: collision with root package name */
            public VEFrame.a f151032b = VEFrame.a.TEPixFmt_OpenGL_RGBA8;

            static {
                Covode.recordClassIndex(99324);
            }
        }

        static {
            Covode.recordClassIndex(99323);
        }

        a a();

        void a(VEFrame vEFrame);
    }

    public interface j {
        static {
            Covode.recordClassIndex(99325);
        }

        void a(EGLContext eGLContext, int i2, int i3, int i4, int i5, long j2, long j3);
    }

    public interface k {
        static {
            Covode.recordClassIndex(99326);
        }

        void a(int i2, float f2, boolean z);

        void a(int i2, boolean z, boolean z2, float f2, List<Integer> list);

        boolean a();
    }

    public interface l {
        static {
            Covode.recordClassIndex(99327);
        }

        void a(String[] strArr, double[] dArr, boolean[] zArr);
    }

    public interface m {
        static {
            Covode.recordClassIndex(99328);
        }
    }

    public interface n {
        static {
            Covode.recordClassIndex(99329);
        }

        void a(com.ss.android.vesdk.faceinfo.b bVar, com.ss.android.vesdk.faceinfo.d dVar);
    }

    public interface o {
        static {
            Covode.recordClassIndex(99330);
        }
    }

    public interface p {
        static {
            Covode.recordClassIndex(99331);
        }
    }

    public interface q {
        static {
            Covode.recordClassIndex(99332);
        }

        void a(int i2, float f2, int i3);
    }

    public interface r {
        static {
            Covode.recordClassIndex(99333);
        }
    }

    public interface s {
        static {
            Covode.recordClassIndex(99334);
        }

        void a(com.ss.android.vesdk.faceinfo.e eVar);
    }

    static {
        Covode.recordClassIndex(99306);
    }

    public final void a(VEListener.ai aiVar) {
        this.f150997b.W = aiVar;
    }

    public final int a(VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, at atVar, boolean z) {
        bi.a("VERecorder-init");
        try {
            int a2 = this.f150997b.a(null, vEVideoEncodeSettings, vEAudioEncodeSettings, atVar, this.f150996a.a(), this.f150999d.f151399d.a(), z);
            bi.b();
            return a2;
        } catch (NullPointerException e2) {
            throw new z(-1, "init failed: VESDK need to be init: " + Log.getStackTraceString(e2));
        } catch (Throwable th) {
            bi.b();
            throw th;
        }
    }

    public final int a(com.ss.android.vesdk.runtime.e eVar) {
        int a2 = this.f150997b.a(eVar);
        if (a2 == 0) {
            this.f150996a = eVar;
        }
        return a2;
    }

    public final void a(VECameraSettings vECameraSettings) {
        this.f150997b.as = vECameraSettings;
    }

    public final void a(boolean z) {
        this.f150997b.aw = z;
    }

    public final void a(w wVar) {
        g gVar = this.f150997b;
        gVar.ax = wVar;
        gVar.az = aw.DUET;
        try {
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_init_duet", new JSONObject(wVar.toString()), "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public final void a() {
        this.f150997b.d();
    }

    public final void a(av avVar) {
        g gVar = this.f150997b;
        gVar.ay = avVar;
        gVar.az = aw.REACTION;
    }

    public final void a(int i2) {
        this.f150997b.b(i2);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        this.f150997b.a(i2, i3, i4, i5);
    }

    public final int[] b() {
        return this.f150997b.e();
    }

    public final int[] a(int i2, int i3, int i4, int i5, float f2) {
        return this.f150997b.a(i2, i3, i4, i5, f2);
    }

    public final boolean a(int i2, int i3) {
        return this.f150997b.b(i2, i3);
    }

    public final void a(double d2) {
        this.f150997b.a(d2);
    }

    public final void a(String str, String str2, String str3) {
        this.f150997b.a(str, str2, str3);
    }

    public final void a(String str, String str2) {
        this.f150997b.a(str, str2);
    }

    public final int a(String str, int i2, int i3) {
        return this.f150997b.a(str, (long) i2, -1, i3);
    }

    public final void b(boolean z) {
        this.f150997b.b(z);
    }

    public final void a(List<bf> list, String str, int i2, VEListener.j jVar) {
        this.f150997b.a(list, str, i2, jVar);
    }

    public final void a(final float f2, final VEListener.j jVar) {
        this.f150997b.a(f2, new VEListener.j() {
            /* class com.ss.android.vesdk.ax.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99310);
            }

            @Override // com.ss.android.vesdk.VEListener.j
            public final void a(int i2) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("speed", (double) f2);
                    jSONObject.put("resultCode", i2);
                    com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_start_record_async", jSONObject, "behavior");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(i2);
                }
            }
        });
    }

    public final void a(final VEListener.j jVar) {
        this.f150997b.b(new VEListener.j() {
            /* class com.ss.android.vesdk.ax.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99311);
            }

            @Override // com.ss.android.vesdk.VEListener.j
            public final void a(int i2) {
                int i3;
                JSONObject jSONObject = new JSONObject();
                if (i2 > 0) {
                    i3 = 0;
                } else {
                    i3 = -1;
                }
                try {
                    jSONObject.put("resultCode", i3);
                    com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_record_finish", jSONObject, "behavior");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(i2);
                }
            }
        });
    }

    public final void b(VEListener.j jVar) {
        this.f150997b.c(jVar);
    }

    public final void a(boolean z, PrivacyCert privacyCert) {
        this.f150997b.a(z, privacyCert);
    }

    public final void a(PrivacyCert privacyCert) {
        this.f150997b.a(privacyCert);
    }

    public final void b(PrivacyCert privacyCert) {
        this.f150997b.b(privacyCert);
    }

    public final void a(long j2) {
        this.f150997b.a(j2);
    }

    public final void a(String str, final int i2, final int i3, Bitmap.CompressFormat compressFormat, final e eVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        this.f150997b.a(str, i2, i3, compressFormat, new e() {
            /* class com.ss.android.vesdk.ax.AnonymousClass7 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f151019a = false;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f151021c;

            static {
                Covode.recordClassIndex(99313);
            }

            @Override // com.ss.android.vesdk.ax.e
            public final void a(int i2) {
                String str;
                if (this.f151019a) {
                    com.ss.android.ttve.monitor.h.a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                }
                if (this.f151021c) {
                    str = "te_record_shot_screen_with_effect_ret";
                } else {
                    str = "te_record_shot_screen_without_effect_ret";
                }
                com.ss.android.ttve.monitor.h.a(0, str, (long) i2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("width", i2);
                    jSONObject.put("height", i3);
                    if (this.f151019a) {
                        jSONObject.put("tag", "takePicture");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_take_picture", jSONObject, "behavior");
                    } else {
                        jSONObject.put("tag", "shotScreen");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                eVar.a(i2);
            }

            {
                this.f151021c = true;
            }
        });
    }

    public final void a(int i2, int i3, d dVar) {
        new com.ss.android.vesdk.g.a();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", i2);
            jSONObject.put("height", i3);
            jSONObject.put("tag", "shotScreen");
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.f150997b.a(i2, i3, dVar);
    }

    public final void a(final be beVar) {
        final long currentTimeMillis = System.currentTimeMillis();
        com.ss.android.ttve.editorInfo.a.a("ve_use_camera", 1);
        new e() {
            /* class com.ss.android.vesdk.ax.AnonymousClass8 */

            static {
                Covode.recordClassIndex(99314);
            }

            @Override // com.ss.android.vesdk.ax.e
            public final void a(int i2) {
                String str;
                if (beVar.f151077h) {
                    com.ss.android.ttve.monitor.h.a(0, "te_record_shot_screen_time", System.currentTimeMillis() - currentTimeMillis);
                }
                if (beVar.f151071b) {
                    str = "te_record_shot_screen_with_effect_ret";
                } else {
                    str = "te_record_shot_screen_without_effect_ret";
                }
                com.ss.android.ttve.monitor.h.a(0, str, (long) i2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (beVar.f151070a != null) {
                        jSONObject.put("width", beVar.f151070a.width);
                    }
                    jSONObject.put("height", beVar.f151070a.height);
                    if (beVar.f151077h) {
                        jSONObject.put("tag", "takePicture");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_take_picture", jSONObject, "behavior");
                    } else {
                        jSONObject.put("tag", "shotScreen");
                        com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_shot_screen", jSONObject, "behavior");
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                if (beVar.f151080k != null) {
                    beVar.f151080k.a(i2);
                }
            }
        };
        this.f150997b.a(beVar);
    }

    public final void a(com.ss.android.vesdk.b.b bVar) {
        this.f150997b.a(bVar);
    }

    public final void a(Surface surface, final VEListener.j jVar) {
        this.f150997b.a(surface, new VEListener.j() {
            /* class com.ss.android.vesdk.ax.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99307);
            }

            @Override // com.ss.android.vesdk.VEListener.j
            public final void a(int i2) {
                VEListener.j jVar = jVar;
                if (jVar != null) {
                    jVar.a(i2);
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("resultCode", i2);
                    com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_start_preview_async", jSONObject, "behavior");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    public final void a(VEListener.j jVar, boolean z) {
        this.f150997b.a(jVar, z);
    }

    public final void a(Surface surface) {
        this.f150997b.a(surface);
    }

    public final void a(VEVolumeParam vEVolumeParam) {
        this.f150997b.a(vEVolumeParam);
    }

    public final VEFrame a(c cVar) {
        return this.f150997b.a(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r8, float r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ax.a(java.lang.String, float):int");
    }

    public final int a(String str) {
        return e(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r12, java.lang.String r13, float r14, float r15, float r16) {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.ax.a(java.lang.String, java.lang.String, float, float, float):void");
    }

    public final int a(String str, float f2, float f3) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_verecorder_set_bigeyes_smallface_level", f2).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_set_bigeyes_smallface", 1, aVar);
        this.f150997b.a(str, f2, f3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fEyeIntensity", String.valueOf(f2));
            jSONObject.put("fCheekIntensity", String.valueOf(f3));
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_face_reshape", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public final int a(String str, int i2, int i3, String str2) {
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = str;
        vEEffectFilterParam.stickerId = i2;
        vEEffectFilterParam.reqId = i3;
        vEEffectFilterParam.stickerTag = str2;
        return a(vEEffectFilterParam);
    }

    public final int a(VEEffectFilterParam vEEffectFilterParam) {
        return this.f150997b.b(vEEffectFilterParam);
    }

    public final void a(float f2) {
        this.f150997b.b(f2);
    }

    public final void a(n nVar) {
        this.f150997b.a(nVar);
    }

    public final void b(n nVar) {
        this.f150997b.b(nVar);
    }

    public final void a(l lVar) {
        this.f150997b.a(lVar);
    }

    public final void a(VECherEffectParam vECherEffectParam) {
        this.f150997b.a(vECherEffectParam);
    }

    public final void a(s sVar) {
        this.f150997b.a(sVar);
    }

    public final void a(int i2, long j2, long j3, String str) {
        this.f150997b.a(i2, j2, j3, str);
    }

    public final void a(MessageCenter.Listener listener) {
        this.f150997b.a(listener);
    }

    public final void a(float[] fArr, double d2) {
        this.f150997b.a(fArr, d2);
    }

    public final void a(Runnable runnable) {
        this.f150997b.a(runnable);
    }

    public final void a(float f2, float f3, float f4) {
        this.f150997b.a(f2, f3, f4);
    }

    public final int a(boolean z, boolean z2, boolean z3, boolean z4) {
        return this.f150997b.a(z, z2, z3, z4);
    }

    public final int a(double[] dArr, double d2) {
        return this.f150997b.a(dArr, d2);
    }

    public final int a(h hVar) {
        return this.f150997b.a(hVar);
    }

    public final int a(g gVar) {
        return this.f150997b.a(gVar);
    }

    public final void a(al alVar) {
        this.f150997b.a(alVar);
    }

    public final void b(al alVar) {
        this.f150997b.b(alVar);
    }

    public final void a(b bVar, int i2) {
        g gVar = this.f150997b;
        if (gVar != null) {
            gVar.a(bVar, i2);
        }
    }

    public final void b(int i2) {
        this.f150997b.f(i2);
    }

    public final void b(String str, String str2) {
        this.f150997b.b(str, str2);
    }

    public final int a(String[] strArr) {
        return this.f150997b.a(strArr);
    }

    public final int a(String str, String str2, float f2) {
        int a2 = this.f150997b.a(str, str2, f2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("nodeTag", str2);
            jSONObject.put("nodeValue", String.valueOf(f2));
            jSONObject.put("resultCode", String.valueOf(a2));
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_composer", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return a2;
    }

    public final int a(String[] strArr, String[] strArr2, float[] fArr) {
        return this.f150997b.a(strArr, strArr2, fArr);
    }

    public final int a(String[] strArr, int i2) {
        return this.f150997b.a(strArr, i2);
    }

    public final int a(String[] strArr, int i2, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_SET_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        an.c("VERecorder", "setComposerNodesWithTag...");
        if (vEEffectParams.stringArrayOne.size() == i2 && vEEffectParams.stringArrayTwo.size() == i2) {
            int a2 = this.f150997b.a(vEEffectParams);
            try {
                JSONObject jSONObject = new JSONObject();
                String str = null;
                jSONObject.put("path", strArr != null ? Arrays.toString(strArr) : null);
                if (strArr2 != null) {
                    str = Arrays.toString(strArr2);
                }
                jSONObject.put("nodeTag", str);
                jSONObject.put("nodeValue", String.valueOf(i2));
                jSONObject.put("resultCode", String.valueOf(a2));
                com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_composer", jSONObject, "behavior");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return a2;
        }
        an.d("VERecorder", "Nodes size=" + vEEffectParams.stringArrayOne.size() + ", tags size=" + vEEffectParams.stringArrayTwo.size() + ", but nodeNum=" + i2);
        return -100;
    }

    public final int a(String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_REPLACE_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i2;
        vEEffectParams.intValueTwo = i3;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        vEEffectParams.stringArrayThree = new ArrayList<>(Arrays.asList(strArr3));
        an.c("VERecorder", "replaceComposerNodes...");
        return this.f150997b.a(vEEffectParams);
    }

    public final void a(float f2, float f3, float f4, float f5) {
        this.f150997b.a(f2, f3, f4, f5);
    }

    public final void a(boolean z, long j2) {
        this.f150997b.a(z, j2);
    }

    public final boolean a(bh bhVar, int i2) {
        if (bhVar.f151097b == null || i2 < 0) {
            return false;
        }
        return this.f150997b.a(bhVar, i2);
    }

    public final int a(boolean z, String str) {
        return this.f150997b.a(z, str);
    }

    public final void a(r rVar) {
        this.f150997b.a(rVar);
    }

    public final int a(VEPrePlayParams vEPrePlayParams) {
        return this.f150997b.a(vEPrePlayParams);
    }

    public final void a(VEBaseRecorderLensParams vEBaseRecorderLensParams, final q qVar) {
        int i2 = vEBaseRecorderLensParams.algorithmFlag;
        if (i2 != 15) {
            if (i2 == 21) {
                final VETaintSceneDetectParams vETaintSceneDetectParams = (VETaintSceneDetectParams) vEBaseRecorderLensParams;
                VEModelDownload.a aVar = this.f150998c;
                if (aVar != null) {
                    aVar.a("lens_taint_scene_detect", "TaintSceneDetectModel", new VEModelDownload.b() {
                        /* class com.ss.android.vesdk.ax.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(99309);
                        }

                        @Override // com.ss.android.vesdk.lens.VEModelDownload.b
                        public final void a() {
                            an.d("VERecorder", "get model path failure!");
                        }

                        @Override // com.ss.android.vesdk.lens.VEModelDownload.b
                        public final void a(String str) {
                            vETaintSceneDetectParams.modelPath = str;
                            ax.this.f150997b.a(vETaintSceneDetectParams, qVar);
                        }
                    });
                    return;
                }
                return;
            } else if (i2 == 24) {
                u.d a2 = u.a().a("ve_asf_amount");
                if (!(a2 == null || a2.f151496b == null || !(a2.f151496b instanceof Float))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).amount = ((Float) a2.f151496b).floatValue();
                }
                u.d a3 = u.a().a("ve_asf_over_ratio");
                if (!(a3 == null || a3.f151496b == null || !(a3.f151496b instanceof Float))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).overRatio = ((Float) a3.f151496b).floatValue();
                }
                u.d a4 = u.a().a("ve_asf_gpu_power_level");
                if (!(a4 == null || a4.f151496b == null || !(a4.f151496b instanceof Integer))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).powerLevelPara = ((Integer) a4.f151496b).intValue();
                    an.a("VERecorder", "powerLevelPara: " + a4.f151496b);
                }
                u.d a5 = u.a().a("ve_asf_init_delay_frame_cnt");
                if (!(a5 == null || a5.f151496b == null || !(a5.f151496b instanceof Integer))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).initDelayFrameCnt = ((Integer) a5.f151496b).intValue();
                    an.a("VERecorder", "initDelayFrameCnt: " + a5.f151496b);
                }
                u.d a6 = u.a().a("ve_asf_process_delay_frame_cnt");
                if (!(a6 == null || a6.f151496b == null || !(a6.f151496b instanceof Integer))) {
                    ((VEAdaptiveSharpenParams) vEBaseRecorderLensParams).processDelayFrameCnt = ((Integer) a6.f151496b).intValue();
                }
                this.f150997b.a(vEBaseRecorderLensParams, qVar);
                return;
            } else if (i2 != 27) {
                if (i2 == 28) {
                    this.f150997b.a(vEBaseRecorderLensParams, qVar);
                    return;
                }
                return;
            }
        }
        this.f150997b.a(vEBaseRecorderLensParams, qVar);
    }

    public final void a(int i2, VESafeAreaParams[] vESafeAreaParamsArr) {
        this.f150997b.a(i2, vESafeAreaParamsArr);
    }

    public final void a(VEListener.o oVar) {
        b("", "", oVar);
    }

    public final void a(final j jVar) {
        AnonymousClass2 r0;
        if (jVar == null) {
            r0 = null;
        } else {
            r0 = new i() {
                /* class com.ss.android.vesdk.ax.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(99308);
                }

                @Override // com.ss.android.vesdk.ax.i
                public final i.a a() {
                    boolean z;
                    i.a aVar = new i.a();
                    aVar.f151032b = VEFrame.a.TEPixFmt_OpenGL_RGBA8;
                    if (jVar != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.f151031a = z;
                    return aVar;
                }

                @Override // com.ss.android.vesdk.ax.i
                public final void a(VEFrame vEFrame) {
                    long j2;
                    if (jVar != null) {
                        if (vEFrame == null || vEFrame.getFormat() != VEFrame.a.TEPixFmt_OpenGL_RGBA8) {
                            jVar.a(null, 0, 10, 0, 0, 0, 0);
                            return;
                        }
                        VEFrame.TextureFrame textureFrame = (VEFrame.TextureFrame) vEFrame.getFrame();
                        j jVar = jVar;
                        EGLContext eGLContext = textureFrame.f61147a;
                        int i2 = textureFrame.f61148b;
                        int width = vEFrame.getWidth();
                        int height = vEFrame.getHeight();
                        long timeStamp = vEFrame.getTimeStamp();
                        if (ax.this.f150997b != null) {
                            j2 = ax.this.f150997b.l();
                        } else {
                            j2 = 0;
                        }
                        jVar.a(eGLContext, i2, 10, width, height, timeStamp, j2);
                    }
                }
            };
        }
        this.f150997b.a(r0);
    }

    public final int A() {
        return this.f150997b.bj;
    }

    public final float B() {
        return this.f150997b.bk;
    }

    public final double C() {
        return this.f150997b.bm;
    }

    public final double D() {
        return this.f150997b.bn;
    }

    public final double E() {
        return this.f150997b.bo;
    }

    public final double F() {
        return this.f150997b.bp;
    }

    public final float[] G() {
        return this.f150997b.p();
    }

    public final com.ss.android.medialib.presenter.d H() {
        return this.f150997b.z();
    }

    public final com.ss.android.vesdk.c.a I() {
        return this.f150997b.c();
    }

    public final void J() {
        this.f150997b.A();
    }

    public final int K() {
        return this.f150997b.q();
    }

    public final float d() {
        return this.f150997b.g();
    }

    public final int e() {
        return this.f150997b.h();
    }

    public final long h() {
        return this.f150997b.m();
    }

    public final int i() {
        return this.f150997b.n();
    }

    public final void k() {
        this.f150997b.t();
    }

    public final void l() {
        this.f150997b.i();
    }

    public final long m() {
        return this.f150997b.v();
    }

    public final void p() {
        this.f150997b.u();
    }

    public final EnigmaResult q() {
        return this.f150997b.y();
    }

    public final l r() {
        return this.f150997b.U;
    }

    public final int s() {
        return this.f150997b.ba;
    }

    public final int t() {
        return this.f150997b.bb;
    }

    public final int u() {
        return this.f150997b.bc;
    }

    public final float v() {
        return this.f150997b.bd;
    }

    public final int w() {
        return this.f150997b.bf;
    }

    public final float x() {
        return this.f150997b.bg;
    }

    public final int y() {
        return this.f150997b.bh;
    }

    public final int z() {
        return this.f150997b.bi;
    }

    public static int g() {
        an.a("VERecorder", "startRecord in mp4 mode...");
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public final long j() {
        return this.f150997b.l();
    }

    public final VEMapBufferInfo n() {
        an.a("VERecorder", "get intermediate path from effect");
        return this.f150997b.w();
    }

    public final String[] f() {
        return this.f150997b.j();
    }

    public final void o() {
        an.c("VERecorder", "onDestroy...");
        g gVar = this.f150997b;
        if (gVar != null) {
            gVar.o();
        }
        com.ss.android.vesdk.runtime.e eVar = this.f150996a;
        if (eVar != null) {
            if (eVar.f151450b != null) {
                eVar.f151450b.clear();
                eVar.f151450b = null;
            }
            if (eVar.f151451c != null) {
                eVar.f151451c.clear();
                eVar.f151451c = null;
            }
        }
    }

    public final int[] c() {
        return this.f150997b.f();
    }

    public final void g(boolean z) {
        this.f150997b.a(z);
    }

    public final int j(boolean z) {
        return this.f150997b.i(z);
    }

    public final void n(boolean z) {
        this.f150997b.m(z);
    }

    public final void o(boolean z) {
        this.f150997b.p(z);
    }

    public final float b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1.0f;
        }
        return this.f150997b.a(str);
    }

    public final void f(boolean z) {
        g gVar = this.f150997b;
        gVar.bu = z;
        if (gVar.bu) {
            an.a("TERecorderBase", "attach VEAudioCapture from other");
        }
    }

    public final void h(boolean z) {
        this.f150997b.d(z);
    }

    public final void i(boolean z) {
        this.f150997b.h(z);
    }

    public final void k(boolean z) {
        this.f150997b.j(z);
    }

    public final void l(boolean z) {
        this.f150997b.k(z);
    }

    public final void m(boolean z) {
        this.f150997b.l(z);
    }

    public final void p(boolean z) {
        this.f150997b.n(z);
    }

    public final int d(int i2) {
        return this.f150997b.e(i2);
    }

    public final void e(VEListener.j jVar) {
        this.f150997b.e(jVar);
    }

    public final void q(boolean z) {
        long j2;
        if (z) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        com.ss.android.ttve.editorInfo.a.a("te_lens_adaptive_sharpen", j2);
        this.f150997b.q(z);
    }

    public final int c(String str) {
        return this.f150997b.b(str);
    }

    public final void e(boolean z) {
        this.f150997b.f(z);
    }

    private int e(String str) {
        String str2;
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(File.separator);
            if (split.length > 0) {
                str2 = split[split.length - 1];
                float min = Math.min(1.0f, Math.max(0.0f, 0.0f));
                aVar.a("iesve_verecorder_set_filter_click_idfilter_id", str2).a("old", 1);
                com.ss.android.ttve.monitor.e.a("iesve_verecorder_set_filter_click", 1, aVar);
                this.f150997b.b(str, min);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("filterId", str2);
                jSONObject.put("intensity", String.valueOf(min));
                jSONObject.put("tag", "setFilter");
                jSONObject.put("resultCode", 0);
                com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_single_filter", jSONObject, "behavior");
                return 0;
            }
        }
        str2 = "";
        float min2 = Math.min(1.0f, Math.max(0.0f, 0.0f));
        aVar.a("iesve_verecorder_set_filter_click_idfilter_id", str2).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_set_filter_click", 1, aVar);
        this.f150997b.b(str, min2);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("filterId", str2);
            jSONObject2.put("intensity", String.valueOf(min2));
            jSONObject2.put("tag", "setFilter");
            jSONObject2.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_single_filter", jSONObject2, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public final void c(int i2) {
        this.f150997b.d(i2);
    }

    public final int d(VEListener.j jVar) {
        return this.f150997b.d(jVar);
    }

    public final int b(h hVar) {
        return this.f150997b.b(hVar);
    }

    public final void c(VEListener.j jVar) {
        this.f150997b.a(jVar);
    }

    public final void c(boolean z) {
        this.f150997b.g(z);
    }

    public final void d(String str) {
        this.f150997b.c(str);
    }

    public final boolean d(boolean z) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_verecorder_use_sharedtexture", String.valueOf(z)).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_use_sharedtexture", 1, aVar);
        return this.f150997b.e(z);
    }

    public final int a(Bitmap bitmap) {
        return this.f150997b.a(bitmap);
    }

    public ax(com.ss.android.vesdk.runtime.e eVar, Context context) {
        this(eVar, context, (byte) 0);
    }

    public final int b(float f2, float f3) {
        return this.f150997b.b(f2, f3);
    }

    public final int c(float f2, float f3) {
        return b(f2, f3);
    }

    public final int f(float f2, float f3) {
        return this.f150997b.e(f2, f3);
    }

    public final int d(float f2, float f3) {
        return this.f150997b.c(f2, f3);
    }

    public final int e(float f2, float f3) {
        return this.f150997b.d(f2, f3);
    }

    public final int c(int i2, int i3) {
        return this.f150997b.d(i2, i3);
    }

    public final int b(int i2, int i3) {
        return this.f150997b.c(i2, i3);
    }

    public final int d(int i2, int i3) {
        return this.f150997b.a(i2, i3, 0L);
    }

    public final int a(float f2, float f3) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_verecorder_set_beauty_level", f2).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_set_beauty_level", 1, aVar);
        this.f150997b.a(f2, f3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fSmoothIntensity", String.valueOf(f2));
            jSONObject.put("fBrightenIntensity", String.valueOf(f2));
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_beauty_face_intensity", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public final int a(int i2, float f2) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_verecorder_" + o.a(i2) + "_level", f2).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_" + o.a(i2) + "_level", 1, aVar);
        return this.f150997b.a(i2, f2);
    }

    public final int d(String str, String str2) {
        if (str2 != null) {
            return this.f150997b.d(str, str2);
        }
        an.d("VERecorder", "Illegal argument. imagePath can't be null. Consider using empty string to cancel.");
        return -100;
    }

    public final int a(int i2, VETrackParams vETrackParams) {
        return this.f150997b.a(i2, vETrackParams);
    }

    public final int a(int i2, String str) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_verecorder_set_beauty_algorithm", i2).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_set_beauty_algorithm", 1, aVar);
        this.f150997b.a(i2, str);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beautyFaceType", String.valueOf(i2));
            jSONObject.put("strBeautyFaceRes", str);
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_beauty_face", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public final int b(String[] strArr, int i2) {
        return this.f150997b.b(strArr, i2);
    }

    public final int[] c(String str, String str2) {
        if (str == null || str2 == null) {
            return new int[]{-1, 0};
        }
        return this.f150997b.c(str, str2);
    }

    public final void a(String str, String str2, VEListener.o oVar) {
        b(str, str2, oVar);
    }

    private ax(com.ss.android.vesdk.runtime.e eVar, Context context, byte b2) {
        this.f151000e = -1;
        this.f150996a = eVar;
        this.f150999d = VERuntime.a.INSTANCE.veRuntime;
        this.f150997b = new d(context, this.f150996a);
    }

    public final int a(int i2, int i3, boolean z) {
        return this.f150997b.a(i2, i3, z);
    }

    private void b(String str, String str2, final VEListener.o oVar) {
        try {
            this.f150996a.d();
            this.f150996a.e();
            final String b2 = this.f150996a.b();
            final String c2 = this.f150996a.c();
            final String str3 = b2 + ".tmp";
            final String str4 = c2 + ".tmp";
            aa.a(str3);
            aa.a(str4);
            aa.a(b2, str3);
            aa.a(c2, str4);
            this.f150997b.a(b2, c2, 0, str, str2, new VEListener.j() {
                /* class com.ss.android.vesdk.ax.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(99312);
                }

                @Override // com.ss.android.vesdk.VEListener.j
                public final void a(int i2) {
                    if (!aa.b(b2) && aa.b(str3)) {
                        aa.a(str3, b2);
                        if (!aa.b(c2) && aa.b(str4)) {
                            aa.a(str4, c2);
                        }
                        com.ss.android.ttvecamera.o.a("VERecorder", "Concat failed. Restore concat file.");
                    }
                    VEListener.o oVar = oVar;
                    if (oVar != null) {
                        oVar.a(i2, b2, c2);
                    }
                }
            });
        } catch (z e2) {
            com.ss.android.ttvecamera.o.d("VERecorder", "No need to concat because: " + e2.getMsgDes());
            if (oVar != null) {
                oVar.a(-108, "", "");
            }
        }
    }

    public final int b(String str, float f2, float f3) {
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        aVar.a("iesve_verecorder_set_lipstick_and_blusher_level", f2).a("old", 1);
        com.ss.android.ttve.monitor.e.a("iesve_verecorder_set_lipstick_and_blusher_level", 1, aVar);
        this.f150997b.b(str, f2, f3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("strResPath", str);
            jSONObject.put("fLipstickIntensity", String.valueOf(f2));
            jSONObject.put("fBlusherIntensity", String.valueOf(f2));
            jSONObject.put("resultCode", 0);
            com.ss.android.ttve.monitor.b.a("vesdk_event_recorder_face_make_up_intensity", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public final int a(VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, at atVar) {
        return a(vEVideoEncodeSettings, vEAudioEncodeSettings, atVar, false);
    }

    public final int b(String[] strArr, int i2, String[] strArr2) {
        VEEffectParams vEEffectParams = new VEEffectParams();
        vEEffectParams.TYPE = VEEffectParams.EFFECT_TYPE_APPEND_COMPOSER_WITH_TAG;
        vEEffectParams.intValueOne = i2;
        vEEffectParams.stringArrayOne = new ArrayList<>(Arrays.asList(strArr));
        vEEffectParams.stringArrayTwo = new ArrayList<>(Arrays.asList(strArr2));
        an.c("VERecorder", "appendComposerNodes...");
        if (vEEffectParams.stringArrayOne.size() == i2 && vEEffectParams.stringArrayTwo.size() == i2) {
            return this.f150997b.a(vEEffectParams);
        }
        an.d("VERecorder", "Nodes size=" + vEEffectParams.stringArrayOne.size() + ", tags size=" + vEEffectParams.stringArrayTwo.size() + ", but nodeNum=" + i2);
        return -100;
    }

    public final int a(int i2, float f2, float f3, int i3) {
        return this.f150997b.a(i2, f2, f3, i3);
    }

    public final int a(double d2, double d3, double d4, double d5) {
        return this.f150997b.a(d2, d3, d4, d5);
    }

    public final int c(double d2, double d3, double d4, double d5) {
        return this.f150997b.c(d2, d3, d4, d5);
    }

    public final int b(double d2, double d3, double d4, double d5) {
        return this.f150997b.b(d2, d3, d4, d5);
    }

    public final int b(String str, int i2, int i3, String str2) {
        return this.f150997b.a(str, i2, i3, str2);
    }

    public final int a(float f2, float f3, float f4, float f5, float f6) {
        return this.f150997b.a(f2, f3, f4, f5, f6);
    }
}
