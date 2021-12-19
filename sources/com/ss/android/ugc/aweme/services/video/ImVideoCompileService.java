package com.ss.android.ugc.aweme.services.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.property.b;
import com.ss.android.ugc.aweme.property.ei;
import com.ss.android.ugc.aweme.property.em;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.ugc.aweme.shortvideo.bn;
import com.ss.android.ugc.aweme.shortvideo.record.av;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.x;
import dmt.av.video.aj;
import f.a.t;
import h.f.a.a;
import h.f.b.g;
import h.f.b.l;
import h.h;
import h.i;
import h.p;
import h.v;
import java.io.File;
import java.io.InputStream;

public final class ImVideoCompileService {
    public static final Companion Companion = new Companion(null);
    public static final h instance$delegate = i.a((a) ImVideoCompileService$Companion$instance$2.INSTANCE);
    private static final String sDir = (e.c(e.f143371a) + "/im/video/");
    public boolean isHardCodeFallback;

    public static int com_ss_android_ugc_aweme_services_video_ImVideoCompileService_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static final ImVideoCompileService getInstance() {
        return Companion.getInstance();
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoBitrate(float f2) {
        return (int) (f2 * 4.0f * 1000.0f * 1000.0f);
    }

    private final int toVESDKVideoBitrateFromSyntheticVideoQuality(int i2) {
        return i2;
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(79855);
        }

        public static /* synthetic */ void getInstance$annotations() {
        }

        public final ImVideoCompileService getInstance() {
            return (ImVideoCompileService) ImVideoCompileService.instance$delegate.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    private final VEVideoEncodeSettings.ENCODE_PROFILE getEncodeProfile() {
        VEVideoEncodeSettings.ENCODE_PROFILE b2 = av.b();
        l.b(b2, "");
        return b2;
    }

    private final p<Integer, Integer> getDefaultOutputVideoSize() {
        return v.a(720, 1280);
    }

    private final p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> getSoftEncodeBitrateConfig() {
        return new p<>(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoQuality(em.a())));
    }

    private final boolean getUseHardwareEncode() {
        if (!b.b() || b.f118355a || this.isHardCodeFallback) {
            return false;
        }
        return true;
    }

    public final x createVEEditor() {
        x xVar = new x(getCompileWorkSpace());
        xVar.a(false);
        xVar.d(0);
        xVar.e(true);
        return xVar;
    }

    public final String getOutputVideoFilePath() {
        String str = sDir;
        e.a(str, false);
        return str + System.currentTimeMillis();
    }

    static {
        Covode.recordClassIndex(79854);
    }

    private final String getCompileWorkSpace() {
        File a2 = e.a(sDir + "compile/", false);
        l.b(a2, "");
        String absolutePath = a2.getAbsolutePath();
        l.b(absolutePath, "");
        return absolutePath;
    }

    private final p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> getHardEncodeBitrateConfig() {
        com.ss.android.ugc.aweme.property.a aVar = c.J;
        l.b(aVar, "");
        float f2 = aVar.f118318a;
        if (f2 <= 0.0f) {
            f2 = ei.a();
        }
        return new p<>(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, Integer.valueOf(toVESDKVideoBitrateFromSyntheticVideoBitrate(f2)));
    }

    private final t<Boolean> getVideoWidthHeight(IAVProcessService.CompileParam compileParam) {
        t<Boolean> a2 = t.a(new ImVideoCompileService$getVideoWidthHeight$1(this, compileParam));
        l.b(a2, "");
        return a2;
    }

    private final <T> void safeOnComplete(f.a.v<T> vVar) {
        if (!vVar.isDisposed()) {
            vVar.a();
        }
    }

    private final boolean enableRemux(IAVProcessService.CompileParam compileParam) {
        if (aj.c(compileParam.getRawVideoPath()) * 1000 > com.ss.android.ugc.aweme.property.g.a()) {
            return true;
        }
        return false;
    }

    public final t<IAVProcessService.CompileResult> compileImVideo(IAVProcessService.CompileParam compileParam) {
        l.d(compileParam, "");
        t<IAVProcessService.CompileResult> a2 = t.a(new ImVideoCompileService$compileImVideo$1(this, new IAVProcessService.CompileResult()));
        l.b(a2, "");
        return a2;
    }

    private final String getVideoFileMD5(String str) {
        File file = new File(str);
        com_ss_android_ugc_aweme_services_video_ImVideoCompileService_com_ss_android_ugc_aweme_lancet_LogLancet_d("ImVideoCompileService", "getVideoFileMD5: fileExist=" + file.exists());
        if (file.length() > 524288) {
            return bn.a(com.ss.android.ugc.aweme.story.h.b.a.a((InputStream) com.ss.android.ugc.aweme.story.h.b.a.a(new File(str))));
        }
        return bn.a(file);
    }

    public static boolean com_ss_android_ugc_aweme_services_video_ImVideoCompileService_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(9388);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(9388);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9388);
        return delete;
    }

    public final VEVideoEncodeSettings createEncodeSettings(IAVProcessService.CompileParam compileParam) {
        VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(2);
        boolean useHardwareEncode = getUseHardwareEncode();
        aVar.b(useHardwareEncode);
        if (useHardwareEncode) {
            aVar.a(getEncodeProfile());
            p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> hardEncodeBitrateConfig = getHardEncodeBitrateConfig();
            aVar.a(hardEncodeBitrateConfig.getFirst(), hardEncodeBitrateConfig.getSecond().intValue());
        } else {
            p<VEVideoEncodeSettings.ENCODE_BITRATE_MODE, Integer> softEncodeBitrateConfig = getSoftEncodeBitrateConfig();
            aVar.a(softEncodeBitrateConfig.getFirst(), softEncodeBitrateConfig.getSecond().intValue());
        }
        p<Integer, Integer> outputVideoSize = outputVideoSize(compileParam);
        aVar.a(outputVideoSize.getFirst().intValue(), outputVideoSize.getSecond().intValue());
        aVar.a(enableRemux(compileParam), true);
        VEVideoEncodeSettings d2 = aVar.d();
        l.b(d2, "");
        return d2;
    }

    public final p<Integer, Integer> outputVideoSize(IAVProcessService.CompileParam compileParam) {
        if (compileParam.getVideoWidth() < 0 || compileParam.getVideoHeight() < 0) {
            com.ss.android.ugc.aweme.df.e.a("ImVideoCompileService outputVideoSize use default");
            return getDefaultOutputVideoSize();
        }
        int videoWidth = compileParam.getVideoWidth();
        int videoHeight = compileParam.getVideoHeight();
        if (compileParam.getVideoWidth() > 720) {
            videoHeight = (int) ((((float) compileParam.getVideoHeight()) * 720.0f) / ((float) compileParam.getVideoWidth()));
            videoWidth = 720;
        } else if (compileParam.getVideoHeight() > 1280) {
            videoWidth = (int) ((((float) compileParam.getVideoWidth()) * 1280.0f) / ((float) compileParam.getVideoHeight()));
            videoHeight = 1280;
        }
        return v.a(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
    }

    public final <T> void safeOnSingleNext(f.a.v<T> vVar, T t) {
        safeOnNext(vVar, t);
        safeOnComplete(vVar);
    }

    private final t<Boolean> compileVideo(IAVProcessService.CompileParam compileParam, IAVProcessService.CompileResult compileResult) {
        t<Boolean> a2 = t.a(new ImVideoCompileService$compileVideo$1(this, compileParam, compileResult));
        l.b(a2, "");
        return a2;
    }

    private final <T> void safeOnNext(f.a.v<T> vVar, T t) {
        if (!vVar.isDisposed()) {
            vVar.a((Object) t);
        }
    }

    public final <T> void safeOnError(f.a.v<T> vVar, Throwable th) {
        if (!vVar.isDisposed()) {
            vVar.a(th);
        }
    }

    public final int initVEEditor(x xVar, String str) {
        an.a("VEEditor", "setEnableEffectTransition: false");
        TEInterface.setEnableEffectTransition(false);
        return xVar.a(new String[]{str}, (String[]) null, (String[]) null, x.l.VIDEO_OUT_RATIO_ORIGINAL);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r3 == null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void saveBitmapToLocal(android.graphics.Bitmap r6, java.lang.String r7) {
        /*
            r5 = this;
            r4 = 9185(0x23e1, float:1.2871E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0013
            com_ss_android_ugc_aweme_services_video_ImVideoCompileService_com_ss_android_ugc_aweme_storage_FileLancet_delete(r1)
        L_0x0013:
            r3 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0030 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0030 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r0 = 80
            r6.compress(r1, r0, r2)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r2.flush()     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r2.close()     // Catch:{ Exception -> 0x003d }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x002a:
            r1 = move-exception
            r3 = r2
            goto L_0x004c
        L_0x002d:
            r0 = move-exception
            r3 = r2
            goto L_0x0031
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            com.ss.android.ugc.aweme.df.e.a(r0)     // Catch:{ all -> 0x0049 }
            if (r3 == 0) goto L_0x0045
            r3.close()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x003d:
            r0 = move-exception
            r0.printStackTrace()
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x0049:
            r1 = move-exception
            if (r3 == 0) goto L_0x0054
        L_0x004c:
            r3.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0054:
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.video.ImVideoCompileService.saveBitmapToLocal(android.graphics.Bitmap, java.lang.String):void");
    }

    private final t<String> getVideoCover(String str, int i2, int i3) {
        t<String> a2 = t.a(new ImVideoCompileService$getVideoCover$1(this, str, i2, i3));
        l.b(a2, "");
        return a2;
    }

    public final Bitmap scaleBitmap(Bitmap bitmap, int i2, int i3) {
        float f2;
        float height;
        MethodCollector.i(9559);
        if (i2 <= 0 || i3 <= 0 || bitmap.getWidth() < i2 || bitmap.getHeight() < i3) {
            MethodCollector.o(9559);
            return bitmap;
        }
        if (bitmap.getWidth() < bitmap.getHeight()) {
            height = (float) i2;
            f2 = (height / ((float) bitmap.getWidth())) * ((float) bitmap.getHeight());
        } else {
            f2 = (float) i3;
            height = (f2 / ((float) bitmap.getHeight())) * ((float) bitmap.getWidth());
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) height, (int) f2, true);
        l.b(createScaledBitmap, "");
        MethodCollector.o(9559);
        return createScaledBitmap;
    }

    static /* synthetic */ t getVideoCover$default(ImVideoCompileService imVideoCompileService, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = -1;
        }
        if ((i4 & 4) != 0) {
            i3 = -1;
        }
        return imVideoCompileService.getVideoCover(str, i2, i3);
    }
}
