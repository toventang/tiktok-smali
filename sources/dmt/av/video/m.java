package dmt.av.video;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.property.ao;
import com.ss.android.ugc.aweme.property.ap;
import com.ss.android.ugc.aweme.property.bz;
import com.ss.android.ugc.aweme.property.cy;
import com.ss.android.ugc.aweme.property.ei;
import com.ss.android.ugc.aweme.property.ej;
import com.ss.android.ugc.aweme.property.ek;
import com.ss.android.ugc.aweme.property.el;
import com.ss.android.ugc.aweme.property.em;
import com.ss.android.ugc.aweme.property.ey;
import com.ss.android.ugc.aweme.property.fj;
import com.ss.android.ugc.aweme.property.x;
import com.ss.android.ugc.aweme.publish.t;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult;
import com.ss.android.ugc.aweme.shortvideo.edit.OptBitrateFromVE;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bm;
import com.ss.android.ugc.aweme.shortvideo.edit.bq;
import com.ss.android.ugc.aweme.shortvideo.edit.br;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult;
import com.ss.android.ugc.aweme.shortvideo.publish.ae;
import com.ss.android.ugc.aweme.shortvideo.record.av;
import com.ss.android.ugc.aweme.shortvideo.upload.ab;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import h.a.n;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class m {
    static {
        Covode.recordClassIndex(104231);
    }

    private static final void a(VEVideoEncodeSettings vEVideoEncodeSettings, VEWatermarkParam vEWatermarkParam, Integer num, SynthetiseResult synthetiseResult, String str, boolean z, Float f2) {
        List<ae> list;
        List<ae> list2;
        vEVideoEncodeSettings.setWatermark(vEWatermarkParam);
        if ((str == null || ((list2 = synthetiseResult.smartCompileSettings) != null && !list2.isEmpty())) && num != null) {
            a("modifySettings preCompileCrf: ".concat(String.valueOf(num)));
            vEVideoEncodeSettings.setVideoSWOptCrf(num.intValue());
        }
        if (f2 != null) {
            bj.a("HardcodeAdaptive -> modifySettings, use hardcoded adaptive strategies");
            return;
        }
        bj.a("HardcodeAdaptive -> modifySettings, use hardcoded strategies");
        if (!(num == null && str == null) && (((list = synthetiseResult.smartCompileSettings) == null || list.isEmpty()) && com.ss.android.ugc.aweme.settings.g.a())) {
            vEVideoEncodeSettings.setVideoHwEnc(false);
            a("modifySettings sw");
        } else if (vEVideoEncodeSettings.isSupportHwEnc() && z) {
            vEVideoEncodeSettings.setVideoHwEnc(true);
            a("modifySettings hw");
        }
    }

    private static final void a(VEVideoEncodeSettings vEVideoEncodeSettings, VideoPublishEditModel videoPublishEditModel, HardcodeAdaptiveResult hardcodeAdaptiveResult) {
        CompileProbeResult.ResultData data;
        CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
        if (!hardcodeAdaptiveResult.getNeedSetHwOptBitrate() || compileProbeResult == null || ((data = compileProbeResult.getData()) != null && data.getVersion() == 1)) {
            bj.a("HardcodeAdaptive -> SynthesisSettingResolver: isHardcodeAdaptiveV2() = " + bz.a() + " and needSetHwOptBitrate = " + hardcodeAdaptiveResult.getNeedSetHwOptBitrate());
            videoPublishEditModel.hardcodeAdaptiveResult = null;
            return;
        }
        boolean a2 = a((Object) videoPublishEditModel);
        CompileProbeResult.ResultData data2 = compileProbeResult.getData();
        if (data2 != null) {
            OptBitrateFromVE optBitrateFromVE = data2.getOptBitrateFromVE();
            float optBitrateHD = a2 ? optBitrateFromVE.getOptBitrateHD() : optBitrateFromVE.getOptBitrate();
            float videoHWoptBitrate = vEVideoEncodeSettings.setVideoHWoptBitrate(Math.min(data2.getEncodeWidth(), data2.getEncodeHeight()), optBitrateHD, a2);
            hardcodeAdaptiveResult.setHwOptBitrate(optBitrateHD);
            hardcodeAdaptiveResult.setPreBitrateStatus(videoHWoptBitrate);
            videoPublishEditModel.hardcodeAdaptiveResult = hardcodeAdaptiveResult;
            bj.a("HardcodeAdaptive -> SynthesisSettingResolver: setVideoHWoptBitrate(" + optBitrateHD + "); preBitrateStatus = " + videoHWoptBitrate);
        }
    }

    public static final boolean a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return false;
        }
        if (videoPublishEditModel.isPhotoMvMode && cy.a.a().f118429a) {
            return true;
        }
        bq a2 = br.a(videoPublishEditModel);
        int b2 = a2.b(false);
        int a3 = a2.a(false);
        Math.max(b2, a3);
        int min = Math.min(b2, a3);
        int i2 = 720;
        int[] a4 = com.ss.android.ugc.aweme.property.b.a(x.a());
        if (a4 != null) {
            Math.max(a4[0], a4[1]);
            i2 = Math.min(a4[0], a4[1]);
        }
        return min > i2 || aj.c(videoPublishEditModel.videoPath()) > com.ss.android.ugc.aweme.property.g.a();
    }

    public static final boolean a(Object obj) {
        boolean z;
        boolean a2 = SettingsManager.a().a("enable_high_quality_video", false);
        boolean a3 = t.a();
        if (obj instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if ((d(videoPublishEditModel) && ao.a()) || (e(videoPublishEditModel) && ap.a())) {
                z = true;
                if (a2 || !a3 || !z) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (a2) {
        }
        return false;
    }

    public static final boolean b(VideoPublishEditModel videoPublishEditModel) {
        if (!a(videoPublishEditModel) || !a((Object) videoPublishEditModel)) {
            return false;
        }
        return true;
    }

    private static boolean d(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        return videoPublishEditModel.isUploadVideo();
    }

    private static boolean e(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (videoPublishEditModel.mOrigin == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<CompileProbeResult, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f156903a = new b();

        static {
            Covode.recordClassIndex(104233);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(CompileProbeResult compileProbeResult) {
            return a(compileProbeResult);
        }

        public static Integer a(CompileProbeResult compileProbeResult) {
            CompileProbeResult.ResultData data;
            if (compileProbeResult == null || compileProbeResult.getStatus().getState() != CompileProbeResult.State.SUCCESS || (data = compileProbeResult.getData()) == null) {
                return null;
            }
            return Integer.valueOf(data.getCrf());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<HardcodeAdaptiveResult, Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f156904a = new c();

        static {
            Covode.recordClassIndex(104234);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Float invoke(HardcodeAdaptiveResult hardcodeAdaptiveResult) {
            return a(hardcodeAdaptiveResult);
        }

        public static Float a(HardcodeAdaptiveResult hardcodeAdaptiveResult) {
            if (hardcodeAdaptiveResult == null || hardcodeAdaptiveResult.getPreBitrateStatus() == -1.0f) {
                return null;
            }
            return Float.valueOf(hardcodeAdaptiveResult.getPreBitrateStatus());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends h.f.b.m implements h.f.a.b<VEVideoEncodeSettings.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f156907a = new f();

        static {
            Covode.recordClassIndex(104237);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(VEVideoEncodeSettings.a aVar) {
            a(aVar);
            return z.f158842a;
        }

        public static void a(VEVideoEncodeSettings.a aVar) {
            l.d(aVar, "");
            VEVideoEncodeSettings.ENCODE_PRESET a2 = c.a(el.a());
            if (a2 != null) {
                aVar.a(a2);
            }
        }
    }

    private static final void a(String str) {
        bj.d("SynthesisSettingsResolver" + ' ' + str);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<VideoPublishEditModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f156902a = new a();

        static {
            Covode.recordClassIndex(104232);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(VideoPublishEditModel videoPublishEditModel) {
            a(videoPublishEditModel);
            return z.f158842a;
        }

        public static void a(VideoPublishEditModel videoPublishEditModel) {
            l.d(videoPublishEditModel, "");
            if (videoPublishEditModel.compileProbeResult != null) {
                CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
                if (compileProbeResult == null) {
                    l.b();
                }
                if (compileProbeResult.getStatus().getState() == CompileProbeResult.State.SUCCESS) {
                    return;
                }
            }
            ab.a(videoPublishEditModel.uploadSpeedInfo);
        }
    }

    public static final boolean c(VideoPublishEditModel videoPublishEditModel) {
        List<StickerItemModel> list;
        if (videoPublishEditModel.hasInfoStickers()) {
            l.d(videoPublishEditModel, "");
            InfoStickerModel infoStickerModel = videoPublishEditModel.infoStickerModel;
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        l.b(next, "");
                        if (!next.isTextSticker()) {
                            break;
                        }
                    }
                }
            }
            return true;
        }
        if (!com.bytedance.common.utility.h.a(videoPublishEditModel.mEffectList)) {
            return true;
        }
        return false;
    }

    private static final void a(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings vEVideoEncodeSettings) {
        videoPublishEditModel.isSyntheticHardEncode = vEVideoEncodeSettings.getVideoCompileEncodeSetting().useHWEncoder;
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.tools.f.b bVar) {
        l.d(videoPublishEditModel, "");
        l.d(bVar, "");
        if (videoPublishEditModel.uploadSpeedInfo != null) {
            a.a(videoPublishEditModel);
            bVar.a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed()).a("used_compiler_setting_group", videoPublishEditModel.uploadSpeedInfo.getUsedCompilerSettingGroup());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.m<VideoPublishEditModel, VEVideoEncodeSettings.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f156906a = new e();

        static {
            Covode.recordClassIndex(104236);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.a aVar) {
            a(videoPublishEditModel, aVar);
            return z.f158842a;
        }

        public static void a(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.a aVar) {
            l.d(videoPublishEditModel, "");
            l.d(aVar, "");
            if (!com.ss.android.ugc.aweme.property.b.b() || com.ss.android.ugc.aweme.property.b.f118355a) {
                aVar.b(false).a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, em.a());
            } else {
                com.ss.android.ugc.aweme.property.a aVar2 = com.ss.android.ugc.aweme.port.in.c.J;
                l.b(aVar2, "");
                float f2 = aVar2.f118318a;
                if (f2 <= 0.0f) {
                    f2 = ei.a();
                }
                aVar.b(true).a(VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, c.a(f2));
                aVar.a(av.b());
            }
            aVar.a(ek.a());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.m<VideoPublishEditModel, VEVideoEncodeSettings.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f156908a = new g();

        static {
            Covode.recordClassIndex(104238);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.a aVar) {
            a(videoPublishEditModel, aVar);
            return z.f158842a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2, com.ss.android.vesdk.VEVideoEncodeSettings.a r3) {
            /*
            // Method dump skipped, instructions count: 135
            */
            throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.m.g.a(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.vesdk.VEVideoEncodeSettings$a):void");
        }
    }

    public static final void b(VideoPublishEditModel videoPublishEditModel, com.ss.android.ugc.tools.f.b bVar) {
        l.d(videoPublishEditModel, "");
        l.d(bVar, "");
        CompileProbeResult compileProbeResult = videoPublishEditModel.compileProbeResult;
        if (compileProbeResult != null) {
            bVar.a("pre_code", compileProbeResult.getStatus().getVeCode()).a("pre_tools_code", compileProbeResult.getStatus().getToolsCode());
            CompileProbeResult.ResultData data = compileProbeResult.getData();
            if (data != null) {
                bVar.a("pre_crf", data.getCrf()).a("pre_bitrate", Float.valueOf(data.getVideoBitrate())).a("pre_duration", data.getDurationMs()).a("min_optBitrate", Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrate())).a("optBitrate", Float.valueOf(data.getOptBitrateFromVE().getOptBitrate())).a("min_optBitrate_HD", Float.valueOf(data.getOptBitrateFromVE().getMinOptBitrateHD())).a("optBitrate_HD", Float.valueOf(data.getOptBitrateFromVE().getOptBitrateHD()));
            }
        }
    }

    public static final void a(VideoPublishEditModel videoPublishEditModel, Integer[] numArr) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        l.d(videoPublishEditModel, "");
        l.d(numArr, "");
        if (videoPublishEditModel.mWatermarkVideoWidth <= 0 || videoPublishEditModel.mWatermarkVideoHeight <= 0) {
            videoPublishEditModel.mWatermarkVideoWidth = numArr[0].intValue();
            boolean z2 = true;
            videoPublishEditModel.mWatermarkVideoHeight = numArr[1].intValue();
            long j2 = -1;
            String a2 = fj.a();
            if (a2 == null || a2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Object obj = null;
            if (!z) {
                try {
                    obj = com.ss.android.ugc.aweme.port.in.c.f115623b.a(a2, WatermarkResSetting.class);
                } catch (Exception unused) {
                    q.b("Json AB ConfigError， Config:".concat(String.valueOf(a2)));
                }
            }
            WatermarkResSetting watermarkResSetting = (WatermarkResSetting) obj;
            int i6 = -1;
            if (watermarkResSetting != null) {
                j2 = com.ss.android.ugc.aweme.video.e.f();
                if (j2 >= ((long) watermarkResSetting.getMinAllowDiskMB()) * 1024 * 1024) {
                    bq a3 = br.a(videoPublishEditModel);
                    i6 = a3.b(false);
                    i5 = a3.a(false);
                    int max = Math.max(i6, i5);
                    int min = Math.min(i6, i5);
                    i4 = watermarkResSetting.getHeight();
                    i3 = watermarkResSetting.getWidth();
                    int max2 = Math.max(i4, i3);
                    int min2 = Math.min(i4, i3);
                    if (max < max2 || min < min2) {
                        z2 = false;
                    } else if (videoPublishEditModel.mWatermarkVideoWidth >= videoPublishEditModel.mWatermarkVideoHeight) {
                        videoPublishEditModel.mWatermarkVideoWidth = max2;
                        videoPublishEditModel.mWatermarkVideoHeight = min2;
                    } else {
                        videoPublishEditModel.mWatermarkVideoWidth = min2;
                        videoPublishEditModel.mWatermarkVideoHeight = max2;
                    }
                } else {
                    i5 = -1;
                    z2 = false;
                    i3 = -1;
                    i4 = -1;
                }
                i2 = i6;
                i6 = i5;
            } else {
                i2 = -1;
                z2 = false;
                i3 = -1;
                i4 = -1;
            }
            bj.a("CalculateWatermarkSize useWatermarkSetting:" + z2 + ' ' + "sourceWidth:" + i6 + " sourceHeight:" + i2 + ' ' + "targetWidth:" + i3 + " targetHeight:" + i4 + ' ' + "width:" + videoPublishEditModel.mWatermarkVideoWidth + " height:" + videoPublishEditModel.mWatermarkVideoHeight + ' ' + "sdAvailableSize:" + j2);
            return;
        }
        bj.a("CalculateWatermarkSize exist width:" + videoPublishEditModel.mWatermarkVideoWidth + " height:" + videoPublishEditModel.mWatermarkVideoHeight + ' ');
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.q<VideoPublishEditModel, VEVideoEncodeSettings.a, Integer[], z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f156909a = new h();

        static {
            Covode.recordClassIndex(104239);
        }

        h() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.a aVar, Integer[] numArr) {
            a(videoPublishEditModel, aVar, numArr);
            return z.f158842a;
        }

        public static void a(VideoPublishEditModel videoPublishEditModel, VEVideoEncodeSettings.a aVar, Integer[] numArr) {
            l.d(videoPublishEditModel, "");
            l.d(aVar, "");
            l.d(numArr, "");
            m.a(videoPublishEditModel, numArr);
            aVar.b(videoPublishEditModel.mWatermarkVideoWidth, videoPublishEditModel.mWatermarkVideoHeight);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.q<VideoPublishEditModel, int[], VEVideoEncodeSettings.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f156905a = new d();

        static {
            Covode.recordClassIndex(104235);
        }

        d() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(VideoPublishEditModel videoPublishEditModel, int[] iArr, VEVideoEncodeSettings.a aVar) {
            a(videoPublishEditModel, iArr, aVar);
            return z.f158842a;
        }

        public static void a(VideoPublishEditModel videoPublishEditModel, int[] iArr, VEVideoEncodeSettings.a aVar) {
            l.d(videoPublishEditModel, "");
            l.d(iArr, "");
            l.d(aVar, "");
            if (es.o(videoPublishEditModel) || (bm.a(videoPublishEditModel) && (iArr[0] > videoPublishEditModel.videoWidth() || iArr[1] > videoPublishEditModel.videoHeight()))) {
                aVar.f(3).a().b();
            } else if (videoPublishEditModel.isFastImport || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode()) {
                aVar.f(1);
            }
            if (videoPublishEditModel.canvasVideoData != null) {
                aVar.f(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.q<VideoPublishEditModel, String, VEVideoEncodeSettings.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f156910a = new i();

        static {
            Covode.recordClassIndex(104240);
        }

        i() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(VideoPublishEditModel videoPublishEditModel, String str, VEVideoEncodeSettings.a aVar) {
            a(videoPublishEditModel, str, aVar);
            return z.f158842a;
        }

        public static void a(VideoPublishEditModel videoPublishEditModel, String str, VEVideoEncodeSettings.a aVar) {
            l.d(videoPublishEditModel, "");
            l.d(str, "");
            l.d(aVar, "");
            if (videoPublishEditModel.mOrigin == 1) {
                if (es.o(videoPublishEditModel)) {
                    aVar.a(false);
                    return;
                }
                File file = new File(str);
                if (!file.exists() || !file.isDirectory()) {
                    file.mkdirs();
                }
                aVar.a(true);
            } else if (videoPublishEditModel.isUseMultiEdit()) {
                aVar.a(false, ey.a());
            }
        }
    }

    public static final VEVideoEncodeSettings a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam, com.ss.android.ugc.asve.editor.g gVar, String str) {
        l.d(videoPublishEditModel, "");
        l.d(synthetiseResult, "");
        l.d(gVar, "");
        l.d(str, "");
        boolean A = gVar.A();
        String str2 = gVar.a().f151426a;
        l.b(str2, "");
        VEVideoEncodeSettings a2 = a(videoPublishEditModel, synthetiseResult, vEWatermarkParam, str2, A);
        List<ae> list = synthetiseResult.smartCompileSettings;
        if (list != null && !list.isEmpty() && (n.g((List) list) instanceof ae.b) && !gVar.a(a2) && list.size() >= 2) {
            List<ae> list2 = synthetiseResult.smartCompileSettings;
            if (list2 != null) {
                list2.remove(0);
            }
            a("resetExternalSettings");
            String str3 = gVar.a().f151426a;
            l.b(str3, "");
            a2 = a(videoPublishEditModel, synthetiseResult, vEWatermarkParam, str3, A);
        }
        List<ae> list3 = synthetiseResult.smartCompileSettings;
        if (list3 != null && !list3.isEmpty()) {
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("publish_id", str);
            List<ae> list4 = synthetiseResult.smartCompileSettings;
            if (list4 == null) {
                l.b();
            }
            r.a("smart_compile_result", a3.a("compile_label", list4.get(0).f129701a).f149193a);
        }
        return a2;
    }

    private static final VEVideoEncodeSettings a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, VEWatermarkParam vEWatermarkParam, String str, boolean z) {
        Integer a2 = b.a(videoPublishEditModel.compileProbeResult);
        String a3 = ab.a(videoPublishEditModel.uploadSpeedInfo);
        HardcodeAdaptiveResult hardcodeAdaptiveResult = new HardcodeAdaptiveResult(0.0f, 0.0f, false, 7, null);
        VEVideoEncodeSettings d2 = a(videoPublishEditModel, synthetiseResult, a2, a3, str, hardcodeAdaptiveResult).d();
        l.b(d2, "");
        a(d2, videoPublishEditModel, hardcodeAdaptiveResult);
        a(d2, vEWatermarkParam, a2, synthetiseResult, a3, z, c.a(videoPublishEditModel.hardcodeAdaptiveResult));
        a(videoPublishEditModel, d2);
        return d2;
    }

    private static final VEVideoEncodeSettings.a a(VideoPublishEditModel videoPublishEditModel, SynthetiseResult synthetiseResult, Integer num, String str, String str2, HardcodeAdaptiveResult hardcodeAdaptiveResult) {
        int[] b2 = f.b(videoPublishEditModel);
        VEVideoEncodeSettings.a aVar = new VEVideoEncodeSettings.a(2);
        aVar.g(ej.a());
        aVar.a(b2[0], b2[1]);
        d.a(videoPublishEditModel, b2, aVar);
        e.a(videoPublishEditModel, aVar);
        f.a(aVar);
        g.a(videoPublishEditModel, aVar);
        h.a(videoPublishEditModel, aVar, new Integer[]{Integer.valueOf(b2[0]), Integer.valueOf(b2[1])});
        a(aVar, synthetiseResult, num, str, videoPublishEditModel, hardcodeAdaptiveResult);
        i.a(videoPublishEditModel, str2, aVar);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void a(com.ss.android.vesdk.VEVideoEncodeSettings.a r8, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r9, java.lang.Integer r10, java.lang.String r11, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult r13) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.m.a(com.ss.android.vesdk.VEVideoEncodeSettings$a, com.ss.android.ugc.aweme.shortvideo.SynthetiseResult, java.lang.Integer, java.lang.String, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.shortvideo.publish.HardcodeAdaptiveResult):void");
    }
}
