package com.ss.android.ugc.aweme.tools.draft.ftc.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.SurfaceView;
import c.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.df.j;
import com.ss.android.ugc.aweme.property.bl;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting;
import com.ss.android.vesdk.VEListener;
import com.zhiliaoapp.musically.R;
import dmt.av.services.VEEncodingImpl;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f139654c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f139655d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f139656e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f139657a;

    /* renamed from: b  reason: collision with root package name */
    public d f139658b = new d();

    static {
        Covode.recordClassIndex(91306);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91307);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c$c  reason: collision with other inner class name */
    public static final class C3688c implements VEListener.q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f139661a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f139662b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoPublishEditModel f139663c;

        static {
            Covode.recordClassIndex(91309);
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.util.c$c$a */
        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ C3688c this$0;

            static {
                Covode.recordClassIndex(91310);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C3688c cVar) {
                super(0);
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                j jVar = j.f80052a;
                jVar.f80053b.postDelayed(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.tools.draft.ftc.util.c.C3688c.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f139664a;

                    static {
                        Covode.recordClassIndex(91311);
                    }

                    {
                        this.f139664a = r1;
                    }

                    public final void run() {
                        MethodCollector.i(178);
                        c cVar = this.f139664a.this$0.f139661a;
                        Activity activity = this.f139664a.this$0.f139662b;
                        VideoPublishEditModel videoPublishEditModel = this.f139664a.this$0.f139663c;
                        String outputFile = videoPublishEditModel.getOutputFile();
                        long length = new File(outputFile).length();
                        try {
                            Uri b2 = e.b(activity, new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()), "video/mp4");
                            if (b2 != null) {
                                cVar.a(activity, videoPublishEditModel, new FileInputStream(outputFile), activity.getContentResolver().openOutputStream(b2, "w"), length);
                                MethodCollector.o(178);
                                return;
                            }
                        } catch (Exception unused) {
                            d.b(videoPublishEditModel);
                        }
                        MethodCollector.o(178);
                    }
                }, 50);
                return z.f158842a;
            }
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileDone() {
            Activity activity = this.f139662b;
            a aVar = new a(this);
            if (com.ss.android.ugc.aweme.utils.permission.e.c(activity) == 0) {
                aVar.invoke();
            } else {
                com.ss.android.ugc.aweme.ce.b.a(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b(aVar, activity));
            }
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileProgress(float f2) {
            if (!this.f139661a.f139657a) {
                this.f139661a.f139658b.a(this.f139662b, this.f139663c, f2 * 80.0f);
            }
        }

        C3688c(c cVar, Activity activity, VideoPublishEditModel videoPublishEditModel) {
            this.f139661a = cVar;
            this.f139662b = activity;
            this.f139663c = videoPublishEditModel;
        }

        @Override // com.ss.android.vesdk.VEListener.q
        public final void onCompileError(int i2, int i3, float f2, String str) {
            d.b(this.f139663c);
        }
    }

    private static boolean a(Context context) {
        if (f139654c) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(context.getString(R.string.ct6)).a();
            return false;
        } else if (!b(context)) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean b(Context context) {
        if (!com.ss.android.ugc.aweme.video.e.e()) {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(R.string.fhb).a();
            return false;
        } else if (com.ss.android.ugc.aweme.video.e.f() < 20971520) {
            return false;
        } else {
            return true;
        }
    }

    static final class b implements b.AbstractC1579b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f139659a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f139660b;

        static {
            Covode.recordClassIndex(91308);
        }

        b(h.f.a.a aVar, Activity activity) {
            this.f139659a = aVar;
            this.f139660b = activity;
        }

        @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
        public final void a(String[] strArr, int[] iArr) {
            if (iArr != null && iArr.length != 0) {
                if (iArr[0] == 0) {
                    h.f.a.a aVar = this.f139659a;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                    return;
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f139660b).a(this.f139660b.getString(R.string.dhz)).a();
            }
        }
    }

    public final void a(Activity activity, VideoPublishEditModel videoPublishEditModel, androidx.lifecycle.m mVar, SurfaceView surfaceView) {
        l.d(mVar, "");
        l.d(surfaceView, "");
        if (activity != null && videoPublishEditModel != null && a(activity)) {
            dmt.av.video.z zVar = new dmt.av.video.z(videoPublishEditModel.videoEditorType, "DraftDownloadHelper");
            g.a(activity, mVar, surfaceView, zVar, videoPublishEditModel);
            SynthetiseResult synthetiseResult = new SynthetiseResult();
            synthetiseResult.draftHardEncode = videoPublishEditModel.mHardEncode;
            synthetiseResult.outputFile = videoPublishEditModel.getOutputFile().toString();
            synthetiseResult.needRecode = false;
            synthetiseResult.flags |= 1;
            synthetiseResult.isEnableFpsSet = bl.a();
            synthetiseResult.editPreviewInfo = videoPublishEditModel.getPreviewInfo();
            synthetiseResult.videoWidth = videoPublishEditModel.videoWidth();
            synthetiseResult.videoHeight = videoPublishEditModel.videoHeight();
            synthetiseResult.texts = videoPublishEditModel.texts;
            synthetiseResult.isFastImport = videoPublishEditModel.isFastImport;
            synthetiseResult.isFastImportForLog = es.p(videoPublishEditModel);
            synthetiseResult.segmentCount = videoPublishEditModel.segmentCounts();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("com.bytedance.info", new JSONObject(ag.a(v.a("is_km_video", 1))));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            g gVar = zVar.w;
            String jSONObject2 = jSONObject.toString();
            l.b(jSONObject2, "");
            gVar.a("com.android.information", jSONObject2);
            d.a(videoPublishEditModel);
            g gVar2 = zVar.w;
            String outputFile = videoPublishEditModel.getOutputFile();
            IVEEncodingSetting a2 = VEEncodingImpl.a();
            g gVar3 = zVar.w;
            l.b(gVar3, "");
            gVar2.a(outputFile, (String) null, a2.a(videoPublishEditModel, synthetiseResult, gVar3, ""), new C3688c(this, activity, videoPublishEditModel));
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.ss.android.ugc.aweme.tools.draft.ftc.util.d.b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        c.d.b.a(r11);
        c.d.b.a(r12);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(422);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.app.Activity r9, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, java.io.InputStream r11, java.io.OutputStream r12, long r13) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.draft.ftc.util.c.a(android.app.Activity, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, java.io.InputStream, java.io.OutputStream, long):void");
    }
}
