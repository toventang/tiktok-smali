package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.nativePort.TEAudioUtilsCallback;
import com.ss.android.ttve.nativePort.TEEffectUtils;
import com.ss.android.ttve.nativePort.TEImageFactory;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.utils.BitmapLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class VEUtils {
    static h dumpInfoCallback;

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public int f150818a;

        /* renamed from: b  reason: collision with root package name */
        public int f150819b;

        /* renamed from: c  reason: collision with root package name */
        public j f150820c = new j();

        /* renamed from: d  reason: collision with root package name */
        public int f150821d;

        /* renamed from: e  reason: collision with root package name */
        public g[] f150822e = new g[4];

        /* renamed from: f  reason: collision with root package name */
        public int f150823f;

        /* renamed from: g  reason: collision with root package name */
        public int f150824g;

        static {
            Covode.recordClassIndex(99224);
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f150830a;

        /* renamed from: b  reason: collision with root package name */
        public int f150831b;

        /* renamed from: c  reason: collision with root package name */
        public int f150832c;

        /* renamed from: d  reason: collision with root package name */
        public int f150833d;

        /* renamed from: e  reason: collision with root package name */
        public int f150834e;

        static {
            Covode.recordClassIndex(99226);
        }
    }

    public interface h {
        static {
            Covode.recordClassIndex(99227);
        }
    }

    public interface i {
        static {
            Covode.recordClassIndex(99228);
        }

        void a(int i2);
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public int f150835a;

        /* renamed from: b  reason: collision with root package name */
        public int f150836b;

        /* renamed from: c  reason: collision with root package name */
        public int f150837c;

        /* renamed from: d  reason: collision with root package name */
        public int f150838d;

        /* renamed from: e  reason: collision with root package name */
        public float f150839e;

        /* renamed from: f  reason: collision with root package name */
        public float f150840f;

        /* renamed from: g  reason: collision with root package name */
        public int f150841g;

        /* renamed from: h  reason: collision with root package name */
        public int f150842h;

        /* renamed from: i  reason: collision with root package name */
        public int f150843i;

        static {
            Covode.recordClassIndex(99229);
        }
    }

    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        public String f150844a;

        /* renamed from: b  reason: collision with root package name */
        public String f150845b;

        /* renamed from: c  reason: collision with root package name */
        public String f150846c;

        /* renamed from: d  reason: collision with root package name */
        public String f150847d;

        /* renamed from: e  reason: collision with root package name */
        public int f150848e = -1;

        /* renamed from: f  reason: collision with root package name */
        public float f150849f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        public int f150850g = 8;

        /* renamed from: h  reason: collision with root package name */
        public int f150851h = LiveFeedRefreshTimeSetting.DEFAULT;

        /* renamed from: i  reason: collision with root package name */
        public int f150852i;

        /* renamed from: j  reason: collision with root package name */
        public int f150853j;

        /* renamed from: k  reason: collision with root package name */
        public int f150854k;

        /* renamed from: l  reason: collision with root package name */
        public int f150855l;

        /* renamed from: m  reason: collision with root package name */
        public int f150856m;

        static {
            Covode.recordClassIndex(99230);
        }
    }

    static {
        Covode.recordClassIndex(99213);
    }

    public static String getVideoEncodeTypeByID(int i2) {
        return i2 != 2 ? i2 != 5 ? i2 != 13 ? i2 != 28 ? i2 != 140 ? i2 != 168 ? i2 != 174 ? "unknown" : "bytevc1" : "vp9" : "vp8" : "h264" : "mpeg4" : "h263" : "mpeg2";
    }

    public enum a {
        type_Unknown(-1),
        type_AudioVideo(0),
        type_Video(1),
        type_Audio(2),
        type_Image(3),
        type_Camera(4),
        type_Color(5),
        type_ImageVideo(6);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(99220);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    public static boolean isSupportGLES3() {
        return TEVideoUtils.isSupportGLES3();
    }

    public static int releaseGetFramesReader() {
        return TEVideoUtils.releaseGetFramesReader();
    }

    public enum b {
        Legacy,
        Skip_invalid,
        Fill_silence;

        static {
            Covode.recordClassIndex(99221);
        }
    }

    public enum c {
        Img_png,
        Img_jpeg;

        static {
            Covode.recordClassIndex(99222);
        }
    }

    public enum d {
        RES_RANDOM,
        RES_720P,
        RES_1080P,
        RES_4K;

        static {
            Covode.recordClassIndex(99223);
        }
    }

    public static class VEVideoFileInfo {
        public boolean bHDR;
        public int bitDepth;
        public int bitrate;
        public int codec;
        public int duration;
        public String formatName;
        public int fps;
        public int height;
        public int isSupportImport = -1;
        public int keyFrameCount;
        public int maxDuration;
        public int rotation;
        public int width;

        static {
            Covode.recordClassIndex(99219);
        }

        public String toString() {
            return "width = " + this.width + ", height = " + this.height + ", rotation = " + this.rotation + ", duration = " + this.duration + ", bitrate = " + this.bitrate + ", fps = " + this.fps + ", codec = " + this.codec + ", keyFrameCount = " + this.keyFrameCount + ", maxDuration = " + this.maxDuration + ", formatName = " + this.formatName;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public int f150825a;

        /* renamed from: b  reason: collision with root package name */
        public int f150826b;

        /* renamed from: c  reason: collision with root package name */
        public int f150827c;

        /* renamed from: d  reason: collision with root package name */
        public int f150828d;

        /* renamed from: e  reason: collision with root package name */
        public int f150829e;

        static {
            Covode.recordClassIndex(99225);
        }

        public String toString() {
            return "VEAudioFileInfo{sampleRate=" + this.f150825a + ", channelSize=" + this.f150826b + ", sampleFormat=" + this.f150827c + ", duration=" + this.f150828d + ", bitRate=" + this.f150829e + '}';
        }
    }

    public static boolean isSupportHDRCapability() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == EGL14.EGL_NO_DISPLAY) {
            an.c("VEUtils", "eglGetDisplay() returned error 0x" + EGL14.eglGetError());
            return false;
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            EGL14.eglTerminate(eglGetDisplay);
            String[] strArr = {"EGL_KHR_gl_colorspace", "EGL_EXT_gl_colorspace_bt2020_pq"};
            int i2 = 0;
            while (eglQueryString.contains(strArr[i2])) {
                i2++;
                if (i2 >= 2) {
                    an.a("VEUtils", "This device supports the HDR capability");
                    return true;
                }
            }
            return false;
        }
        an.c("VEUtils", "eglInitialize() returned error 0x" + EGL14.eglGetError());
        throw new RuntimeException("eglInitialize failed");
    }

    public static void setVEExecFFmpegAndDumpInfoCommandCallback(h hVar) {
        dumpInfoCallback = hVar;
    }

    public static int checkAudioFile(String str) {
        return TEVideoUtils.checkAudioFile(str);
    }

    public static int checkMVResourceIntegrity(String str) {
        return TEVideoUtils.checkMVResourceIntegrity(str);
    }

    public static int checkMp3File(String str) {
        return TEVideoUtils.checkMp3File(str);
    }

    public static String findBestRemuxSuffix(String str) {
        return TEVideoUtils.findBestRemuxSuffix(str);
    }

    public static int getFileType(String str) {
        return TEVideoUtils.getFileType(str);
    }

    public static String getInfostickerConvertTotemplate(String str) {
        return TEVideoUtils.getInfostickerConvertTotemplate(str);
    }

    public static HashMap<String, String> getMetaData(String str) {
        return TEVideoUtils.getMetaData(str);
    }

    public static int isCanImport(String str) {
        com.ss.android.ttve.monitor.e.a("iesve_veutils_if_video_support_import", 1, (com.ss.android.vesdk.g.a) null);
        return TEVideoUtils.isCanImport(str);
    }

    public static VEVideoFileInfo getVEVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVEVideoFileInfo(str);
        if (vEVideoFileInfo != null) {
            return vEVideoFileInfo;
        }
        an.d("VEUtils", "getVideoFileInfo error!!!");
        return null;
    }

    public static VEVideoFileInfo getVideoFileInfo(String str) {
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVideoFileInfo(str, null);
        if (vEVideoFileInfo != null) {
            return vEVideoFileInfo;
        }
        an.d("VEUtils", "getVideoFileInfo error!!!");
        return null;
    }

    public static long getVideoReverseSize(String str) {
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(str);
        if (videoFileInfo == null) {
            return -1;
        }
        return (((long) (videoFileInfo.duration / 1000)) * 5000) / 1024;
    }

    public static f getAudioFileInfo(String str) {
        int[] iArr = new int[16];
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (audioFileInfo == 0) {
            f fVar = new f();
            fVar.f150825a = iArr[0];
            fVar.f150826b = iArr[1];
            fVar.f150827c = iArr[2];
            fVar.f150828d = iArr[3];
            fVar.f150829e = iArr[4];
            return fVar;
        }
        an.d("VEUtils", "getAudioFileInfo error with code=".concat(String.valueOf(audioFileInfo)));
        return null;
    }

    public static boolean com_ss_android_vesdk_VEUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(12874);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(12874);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12874);
        return delete;
    }

    public static List<f> getAudioFileInfoForAllTracks(String str) {
        int[][] iArr = (int[][]) Array.newInstance(int.class, 32, 4);
        int audioFileInfoForAllTracks = TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
        if (audioFileInfoForAllTracks >= 0) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < audioFileInfoForAllTracks; i2++) {
                f fVar = new f();
                fVar.f150825a = iArr[i2][0];
                fVar.f150826b = iArr[i2][1];
                fVar.f150827c = iArr[i2][2];
                fVar.f150828d = iArr[i2][3];
                arrayList.add(fVar);
            }
            return arrayList;
        }
        an.d("VEUtils", "getAudioFileInfoForAllTracks error with code=".concat(String.valueOf(audioFileInfoForAllTracks)));
        return new ArrayList(0);
    }

    public static int isByteVC110Bit(String str) {
        try {
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(str);
            for (int i2 = 0; i2 < mediaExtractor.getTrackCount(); i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                if (TextUtils.equals(trackFormat.getString("mime"), "video/hevc") && trackFormat.containsKey("csd-0")) {
                    ByteBuffer byteBuffer = trackFormat.getByteBuffer("csd-0");
                    byte[] bArr = new byte[byteBuffer.capacity()];
                    byteBuffer.get(bArr);
                    mediaExtractor.release();
                    return TEVideoUtils.isByteVC110Bit(bArr);
                }
            }
            mediaExtractor.release();
            return -200;
        } catch (Exception e2) {
            e2.printStackTrace();
            return -200;
        }
    }

    private static String ms2TimeFormat(int i2) {
        long j2 = (long) i2;
        return com.a.a(Locale.ENGLISH, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j2)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j2) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(j2))), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j2) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(j2))), Long.valueOf(j2 - TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(j2)))});
    }

    public static e getAVFileInfoFromXml(String str) {
        int[] iArr = new int[36];
        int aVFileInfoFromXml = TEVideoUtils.getAVFileInfoFromXml(str, iArr);
        if (aVFileInfoFromXml == 0) {
            e eVar = new e();
            int i2 = 0;
            eVar.f150818a = iArr[0];
            eVar.f150819b = iArr[1];
            eVar.f150820c.f150835a = iArr[2];
            eVar.f150820c.f150836b = iArr[3];
            eVar.f150820c.f150837c = iArr[4];
            eVar.f150820c.f150838d = iArr[5];
            eVar.f150820c.f150839e = ((float) iArr[6]) / ((float) iArr[7]);
            eVar.f150820c.f150840f = ((float) iArr[8]) / ((float) iArr[9]);
            eVar.f150820c.f150841g = iArr[10];
            eVar.f150820c.f150842h = iArr[11];
            eVar.f150820c.f150843i = iArr[12];
            int i3 = 14;
            eVar.f150821d = iArr[13];
            do {
                eVar.f150822e[i2] = new g();
                int i4 = i3 + 1;
                eVar.f150822e[i2].f150830a = iArr[i3];
                int i5 = i4 + 1;
                eVar.f150822e[i2].f150831b = iArr[i4];
                int i6 = i5 + 1;
                eVar.f150822e[i2].f150832c = iArr[i5];
                int i7 = i6 + 1;
                eVar.f150822e[i2].f150833d = iArr[i6];
                i3 = i7 + 1;
                eVar.f150822e[i2].f150834e = iArr[i7];
                i2++;
            } while (i2 < 4);
            eVar.f150823f = iArr[34];
            eVar.f150824g = iArr[35];
            return eVar;
        }
        an.d("VEUtils", "getAVFileInfoFromXml error with code=".concat(String.valueOf(aVFileInfoFromXml)));
        return null;
    }

    public static int ConvertBitmapToRGBA(Bitmap bitmap, String str) {
        return TEVideoUtils.ConverBitmapToRGBA(bitmap, str);
    }

    public static int concatVideo(String[] strArr, String str) {
        return TEVideoUtils.concat(strArr, str);
    }

    public static int getAudioFileInfoForAllTracks(String str, int[][] iArr) {
        return TEVideoUtils.getAudioFileInfoForAllTracks(str, iArr);
    }

    public static int execFFmpegCommand(String str, final i iVar) {
        h hVar = dumpInfoCallback;
        if (hVar == null) {
            return TEVideoUtils.executeFFmpegCommand(str, new TEVideoUtils.ExecuteCommandListener() {
                /* class com.ss.android.vesdk.VEUtils.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(99214);
                }

                @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
                public final void onProgressChanged(int i2) {
                    i iVar = iVar;
                    if (iVar != null) {
                        iVar.a(i2);
                    }
                }
            });
        }
        int execFFmpegCommandAndDumpInfo = execFFmpegCommandAndDumpInfo(str, iVar, hVar);
        dumpInfoCallback = null;
        return execFFmpegCommandAndDumpInfo;
    }

    public static VEMVAlgorithmConfig getMVAlgorithmConfigs(String str, List<String> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return null;
        }
        return (VEMVAlgorithmConfig) TEVideoUtils.getMVAlgorithmConfigs(str, list);
    }

    public static int getQREncodedData(String str, final VEListener.x xVar) {
        return TEEffectUtils.getQREncodedData(str, null, new TEEffectUtils.ImageListener() {
            /* class com.ss.android.vesdk.VEUtils.AnonymousClass4 */

            static {
                Covode.recordClassIndex(99217);
            }

            @Override // com.ss.android.ttve.nativePort.TEEffectUtils.ImageListener
            public final void onData(int[] iArr, int i2, int i3, int i4) {
            }
        });
    }

    public static int extractVideo(String str, String str2) {
        an.a("VEUtils", "extractVideo... inFile:" + str + ", outFile:" + str2);
        int isCanImport = isCanImport(str);
        if (isCanImport == 0) {
            return TEVideoUtils.extractVideo(str, str2);
        }
        an.c("VEUtils", "input file is not supported!");
        return isCanImport;
    }

    public static String getFileBestStreamAudio(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int fileAudio = TEVideoUtils.getFileAudio(str, str2, arrayList, true);
        if (fileAudio != 0) {
            an.d("VEUtils", "getFileBestStreamAudio error ".concat(String.valueOf(fileAudio)));
            return null;
        } else if (arrayList.size() > 0) {
            if (arrayList.size() > 1) {
                an.c("VEUtils", "getFileBestStreamAudio, find more than one stream");
            }
            return (String) arrayList.get(0);
        } else {
            an.d("VEUtils", "getFileBestStreamAudio error, outFiles.size == 0 ");
            return null;
        }
    }

    public static int getMusicDefaultAlgorithm(String str, String str2) {
        if (str == null || str2 == null) {
            an.d("VEUtils", "getMusicDefaultAlgorithm failed path is wrong");
            return -100;
        }
        an.a("VEUtils", "getMusicDefaultAlgorithm musicPath: " + str + " algorithmPath: " + str2);
        return TEVideoUtils.getMusicDefaultAlgorithm(str, str2);
    }

    public static int reverseAudio(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        return execFFmpegCommand("ffmpeg -i " + str + " -af areverse " + str2, null);
    }

    public static int extractVideoByCommand(String str, String str2) {
        an.a("VEUtils", "extractVideoByCommand... inFile:" + str + ", outFile:" + str2);
        int isCanImport = isCanImport(str);
        if (isCanImport != 0) {
            an.c("VEUtils", "input file is not supported!");
            return isCanImport;
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        return execFFmpegCommand("ffmpeg -i " + str + " -vcodec copy -an " + str2, null);
    }

    public static int getAudioFileInfo(String str, int[] iArr) {
        com.ss.android.ttve.monitor.e.a("iesve_veutils_get_audio_info", 1, (com.ss.android.vesdk.g.a) null);
        int audioFileInfo = TEVideoUtils.getAudioFileInfo(str, iArr);
        if (str.endsWith(".aac")) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(12);
            if (extractMetadata != null && extractMetadata.startsWith("audio/aac")) {
                an.c("VEUtils", "getAudioFileInfo use Android sys to get aac duration because ffmpeg is not accurate");
                iArr[3] = Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
            }
            mediaMetadataRetriever.release();
        }
        return audioFileInfo;
    }

    public static int getVideoFileInfo(String str, int[] iArr) {
        com.ss.android.ttve.monitor.e.a("iesve_veutils_get_video_info", 1, (com.ss.android.vesdk.g.a) null);
        VEVideoFileInfo vEVideoFileInfo = (VEVideoFileInfo) TEVideoUtils.getVideoFileInfo(str, null);
        if (vEVideoFileInfo == null) {
            an.d("VEUtils", "getVideoFileInfo2 error!!!");
            return -1;
        }
        switch (Math.min(iArr.length, 12)) {
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                iArr[11] = vEVideoFileInfo.bitDepth;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                iArr[10] = vEVideoFileInfo.maxDuration;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                iArr[9] = vEVideoFileInfo.keyFrameCount;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                iArr[8] = vEVideoFileInfo.codec;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                iArr[7] = vEVideoFileInfo.fps;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                iArr[6] = vEVideoFileInfo.bitrate;
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                iArr[3] = vEVideoFileInfo.duration;
            case 3:
                iArr[2] = vEVideoFileInfo.rotation;
            case 2:
                iArr[1] = vEVideoFileInfo.height;
            case 1:
                iArr[0] = vEVideoFileInfo.width;
                break;
        }
        return 0;
    }

    public static int reverseAudioSafe(String str, String str2) {
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        String str3 = str + ".wav";
        int execFFmpegCommand = execFFmpegCommand("ffmpeg -i " + str + " " + str3, null);
        if (execFFmpegCommand == 0) {
            return execFFmpegCommand("ffmpeg -i " + str3 + " -af areverse " + str2, null);
        }
        return execFFmpegCommand;
    }

    public static int convertVideo2Webp(k kVar, i iVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (kVar.f150855l > 0 || kVar.f150856m > 0) {
            sb.append(" -accurate_seek");
            sb.append(" -ss ").append(ms2TimeFormat(kVar.f150855l));
            sb.append(" -t ").append(ms2TimeFormat(kVar.f150856m));
        }
        if (kVar.f150844a.contains(" ")) {
            kVar.f150844a = kVar.f150844a.replace(" ", "\\ ");
        }
        sb.append(" -y -i ").append(kVar.f150844a);
        sb.append(" -vf scale=").append(kVar.f150851h).append(":").append(kVar.f150852i);
        sb.append(" -r ").append(kVar.f150850g).append(" -loop 0 ");
        sb.append(kVar.f150845b);
        return execFFmpegCommand(sb.toString(), iVar);
    }

    public static int convertVideo2Gif(k kVar, i iVar) {
        int i2;
        String a2;
        if (kVar.f150844a.contains(" ")) {
            kVar.f150844a = kVar.f150844a.replace(" ", "\\ ");
        }
        int execFFmpegCommand = execFFmpegCommand(com.a.a(Locale.US, "ffmpeg -y -i %s -vf fps=%d,scale=%d:-1:flags=lanczos,palettegen %s", new Object[]{kVar.f150844a, Integer.valueOf(kVar.f150850g), Integer.valueOf(kVar.f150851h), kVar.f150846c}), null);
        if (execFFmpegCommand != 0) {
            return execFFmpegCommand;
        }
        VEVideoFileInfo videoFileInfo = getVideoFileInfo(kVar.f150844a);
        if (videoFileInfo == null) {
            return -1;
        }
        int i3 = videoFileInfo.width;
        if (kVar.f150848e < 0) {
            TEImageFactory.ImageInfo imageInfo = TEImageFactory.getImageInfo(null, kVar.f150847d);
            int i4 = 278;
            float f2 = ((float) i3) / 540.0f;
            if (imageInfo != null && imageInfo.getWidth() > 0) {
                i4 = imageInfo.getWidth();
            }
            i2 = (int) (((float) i4) * f2);
        } else {
            i2 = kVar.f150848e;
        }
        if (TextUtils.isEmpty(kVar.f150847d)) {
            a2 = com.a.a(Locale.US, "ffmpeg -y -i %s -i %s -filter_complex setpts=%f*PTS,fps=%d,scale=%d:-1:flags=lanczos[x];[x][1:v]paletteuse %s", new Object[]{kVar.f150844a, kVar.f150846c, Float.valueOf(kVar.f150849f), Integer.valueOf(kVar.f150850g), Integer.valueOf(kVar.f150851h), kVar.f150845b});
        } else {
            a2 = com.a.a(Locale.US, "ffmpeg -y -i %s -i %s -i %s -filter_complex [1:v]scale=%d:-1[o1];[0:v]setpts=%f*PTS,fps=%d[o0];[o0][o1]overlay=x=%d:y=H-h-%d,scale=%d:-1:flags=lanczos[x];[x][2:v]paletteuse %s", new Object[]{kVar.f150844a, kVar.f150847d, kVar.f150846c, Integer.valueOf(i2), Float.valueOf(kVar.f150849f), Integer.valueOf(kVar.f150850g), Integer.valueOf(kVar.f150853j), Integer.valueOf(kVar.f150854k), Integer.valueOf(kVar.f150851h), kVar.f150845b});
        }
        int execFFmpegCommand2 = execFFmpegCommand(a2, iVar);
        com_ss_android_vesdk_VEUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete(new File(kVar.f150846c));
        return execFFmpegCommand2;
    }

    public static int ConvertRGBAToPNG(String str, String str2, d dVar) {
        return ConvertRGBAToIMG(str, str2, dVar, c.Img_png);
    }

    public static int getFileAudio(String str, String str2, ArrayList<String> arrayList) {
        return TEVideoUtils.getFileAudio(str, str2, arrayList, false);
    }

    public static void saveBitmapToPath(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        saveBitmapToPath(bitmap, str, compressFormat, 100);
    }

    public static int execFFmpegCommandAndDumpInfo(String str, final i iVar, final h hVar) {
        return TEVideoUtils.executeFFmpegCommandAndDumpInfo(str, new TEVideoUtils.ExecuteCommandListener() {
            /* class com.ss.android.vesdk.VEUtils.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99215);
            }

            @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandListener
            public final void onProgressChanged(int i2) {
                i iVar = iVar;
                if (iVar != null) {
                    iVar.a(i2);
                }
            }
        }, new TEVideoUtils.ExecuteCommandAndDumpInfoListener() {
            /* class com.ss.android.vesdk.VEUtils.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99216);
            }

            @Override // com.ss.android.ttve.nativePort.TEVideoUtils.ExecuteCommandAndDumpInfoListener
            public final void updateFFmpegInfo(String str) {
            }
        });
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i2, int i3) {
        return getMusicWaveData(str, i2, i3, 10, 0, 0);
    }

    public static VEMusicWaveBean getResampleMusicWaveData(float[] fArr, int i2, int i3) {
        if (fArr.length == 0) {
            return null;
        }
        return TEVideoUtils.getResampleMusicWaveData(fArr, i2, i3);
    }

    public static int isCanTransCode(String str, int i2, int i3) {
        int isCanTransCode = TEVideoUtils.isCanTransCode(str, i2, i3);
        if (isCanTransCode != 0) {
            an.c("VEUtils", "isCanTransCode not supported!  path=".concat(String.valueOf(str)));
        }
        return isCanTransCode;
    }

    public static int mixAudio(ArrayList<String> arrayList, String str, aq aqVar) {
        MethodCollector.i(12752);
        TEAudioUtilsCallback tEAudioUtilsCallback = new TEAudioUtilsCallback();
        tEAudioUtilsCallback.setListener(aqVar);
        int mixAudio = TEVideoUtils.mixAudio(arrayList, str, tEAudioUtilsCallback);
        com.ss.android.ttve.monitor.h.a(4, "te_composition_audio_ret", (long) mixAudio);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.o(12752);
        return mixAudio;
    }

    public static int getVideoFrames(String str, int[] iArr, ad adVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(adVar);
        com.ss.android.ttve.monitor.e.a("iesve_veutils_extract_video_frames", 1, (com.ss.android.vesdk.g.a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, 0, 0, false, tEVideoUtilsCallback, ROTATE_DEGREE.ROTATE_NONE.ordinal());
    }

    public static int mux(String str, String str2, String str3) {
        String str4;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return -100;
        }
        com.ss.android.ttve.monitor.e.a("iesve_veutils_combine_audio_and_video_start", 1, (com.ss.android.vesdk.g.a) null);
        int mux = TEVideoUtils.mux(str, str2, str3);
        com.ss.android.vesdk.g.a aVar = new com.ss.android.vesdk.g.a();
        if (mux == 0) {
            str4 = "succ";
        } else {
            str4 = "fail";
        }
        aVar.a("iesve_veutils_combine_audio_and_video_finish_result", str4);
        aVar.a("iesve_veutils_combine_audio_and_video_finish_reason", "");
        com.ss.android.ttve.monitor.e.a("iesve_veutils_combine_audio_and_video_finish", 1, aVar);
        return mux;
    }

    private static int concatRecordData(VERecordData vERecordData, String str, String str2) {
        int size = vERecordData.f150790b.size();
        if (size <= 0) {
            an.d("VEUtils", "frag count is 0");
            return -100;
        }
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        float[] fArr = new float[size];
        int i2 = 0;
        do {
            strArr[i2] = vERecordData.f150790b.get(i2).f150794a;
            jArr2[i2] = vERecordData.f150790b.get(i2).f150796c;
            strArr2[i2] = vERecordData.f150790b.get(i2).f150795b;
            jArr[i2] = vERecordData.f150790b.get(i2).f150797d;
            fArr[i2] = vERecordData.f150790b.get(i2).f150798e;
            i2++;
        } while (i2 < size);
        vERecordData.f150792d = str;
        vERecordData.f150793e = str2;
        return TEVideoUtils.concatRecordFrag(strArr, jArr2, strArr2, jArr, vERecordData.f150791c, 0, null, null, vERecordData.f150792d, vERecordData.f150793e);
    }

    public static int splitVideo(String str, String[] strArr, int[] iArr, boolean z) {
        return TEVideoUtils.splitVideo(str, strArr, iArr, z);
    }

    public static int trimToDraft(String str, int[] iArr, String str2, int[] iArr2) {
        return TEVideoUtils.trimVideoFile(str, iArr, str2, iArr2);
    }

    public static int ConvertRGBAToIMG(String str, String str2, d dVar, c cVar) {
        return TEVideoUtils.ConverRGBAToIMG(str, str2, dVar.ordinal(), cVar.ordinal());
    }

    public static int getQREncodedData(String str, int i2, int i3, final VEListener.af afVar) {
        return TEEffectUtils.getQREncodedData(str, i2, i3, null, new TEEffectUtils.QrImageListener() {
            /* class com.ss.android.vesdk.VEUtils.AnonymousClass5 */

            static {
                Covode.recordClassIndex(99218);
            }

            @Override // com.ss.android.ttve.nativePort.TEEffectUtils.QrImageListener
            public final void onData(int[] iArr, int i2, int i3, int i4) {
            }
        });
    }

    public static int transCodeAudio(String str, String str2, int i2, int i3) {
        return TEVideoUtils.transCodeAudioFile(str, 0, -1, str2, i2, i3, -1);
    }

    public static int convertJpegToMp4(String str, String str2, int i2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -100;
        }
        return TEVideoUtils.convertJpegToMp4(str, str2, i2, z);
    }

    public static int isCanTransCodeWithResult(String str, int i2, int i3, String[] strArr) {
        int isCanTransCodeWithResult = TEVideoUtils.isCanTransCodeWithResult(str, i2, i3, strArr);
        if (isCanTransCodeWithResult != 0) {
            an.c("VEUtils", "isCanTransCodeWithResult not supported!  path=".concat(String.valueOf(str)));
        }
        return isCanTransCodeWithResult;
    }

    public static int cropAudio(String str, String str2, long j2, long j3) {
        StringBuilder sb = new StringBuilder();
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append("ffmpeg -i ").append(str).append(" -ss ").append(j2 / 1000).append(" -t ").append(j3 / 1000).append(" -c copy ").append(str2);
        an.a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int cutVideo(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ").append(str);
        sb.append(" -ss ").append(str3);
        sb.append(" -t ").append(str4);
        sb.append(" -acodec copy -vcodec copy ");
        sb.append(str2);
        return execFFmpegCommand(sb.toString(), null);
    }

    public static void dumpNV21(String str, int i2, int i3, byte[] bArr) {
        MethodCollector.i(12977);
        YuvImage yuvImage = new YuvImage(bArr, 17, i2, i3, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(byteArray);
            fileOutputStream.flush();
            fileOutputStream.close();
            byteArrayOutputStream.close();
            MethodCollector.o(12977);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            MethodCollector.o(12977);
        } catch (IOException e3) {
            e3.printStackTrace();
            MethodCollector.o(12977);
        }
    }

    public static VESize calcTargetRes(int[] iArr, int[] iArr2, ROTATE_DEGREE[] rotate_degreeArr, int i2) {
        int length;
        int min;
        int i3;
        VESize vESize = new VESize(-1, -1);
        if (iArr2 == null || iArr == null || rotate_degreeArr == null || (length = iArr.length) <= 0) {
            return vESize;
        }
        float f2 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        do {
            int i7 = iArr2[i4];
            int i8 = iArr[i4];
            if (rotate_degreeArr[i4] == ROTATE_DEGREE.ROTATE_90 || rotate_degreeArr[i4] == ROTATE_DEGREE.ROTATE_270) {
                i8 = iArr2[i4];
                i7 = iArr[i4];
            }
            f2 = Math.max(f2, ((float) i7) / ((float) i8));
            i5 = Math.max(i5, i8);
            i6 = Math.max(i6, i7);
            i4++;
        } while (i4 < length);
        if (length != 1) {
            f2 = Math.min(f2, 1.7777778f);
        }
        if (f2 >= 1.0f) {
            i3 = Math.min(i5, i2);
            min = (int) (((float) i3) * f2);
        } else {
            min = Math.min(i6, i2);
            i3 = (int) (((float) min) / f2);
        }
        int i9 = 16;
        if (((Boolean) u.a().a("ve_enable_render_encode_resolution_align4", (Object) false)).booleanValue()) {
            i9 = 4;
        }
        int i10 = -i9;
        vESize.width = ((i3 + i9) - 1) & i10;
        vESize.height = ((min + i9) - 1) & i10;
        return vESize;
    }

    public static int curVideo(String str, ArrayList<String> arrayList, ArrayList<String> arrayList2, ArrayList<String> arrayList3) {
        if (!(arrayList.size() == arrayList2.size() && arrayList.size() == arrayList3.size() && arrayList2.size() == arrayList3.size())) {
            return -100;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ").append(str);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(" -ss ").append(arrayList2.get(i2));
            sb.append(" -t ").append(arrayList3.get(i2));
            sb.append(" -acodec copy -vcodec copy ");
            sb.append(arrayList.get(i2));
        }
        return execFFmpegCommand(sb.toString(), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r4 == null) goto L_0x0093;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006e A[SYNTHETIC, Splitter:B:28:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC, Splitter:B:33:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveBitmapToPath(android.graphics.Bitmap r7, java.lang.String r8, android.graphics.Bitmap.CompressFormat r9, int r10) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEUtils.saveBitmapToPath(android.graphics.Bitmap, java.lang.String, android.graphics.Bitmap$CompressFormat, int):void");
    }

    public static au createRTAudioWaveformMgr(int i2, int i3, int i4, float f2, int i5) {
        return new au(i2, i3, i4, f2, i5);
    }

    public static int findAudioSegmentStartTimeInOrigin(String str, int i2, String str2, int i3, int i4) {
        return TEVideoUtils.findAudioSegmentStartTimeInOrigin(str, i2, str2, i3, i4);
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i2, int i3, int i4) {
        return getAudioFromRecordData(str, vERecordData, i2, i3, i4, b.Legacy);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i2, int i3, int i4, int i5) {
        return getMusicWaveData(str, i2, i3, 10, i4, i5);
    }

    public static int concatJpegWithMp4(String str, String str2, String str3, int i2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || i2 < 33) {
            return -100;
        }
        int convertJpegToMp4 = convertJpegToMp4(str, str3, i2, z);
        if (convertJpegToMp4 != 0) {
            an.d("VEUtils", "concatJpegWithMp4 error, convert failed ".concat(String.valueOf(convertJpegToMp4)));
            return convertJpegToMp4;
        }
        int concatVideo = concatVideo(new String[]{str3, str2}, str3);
        if (concatVideo != 0) {
            an.d("VEUtils", "concatJpegWithMp4 error, concatVideo failed ".concat(String.valueOf(concatVideo)));
        }
        return concatVideo;
    }

    public static VEMVAudioAlgorithmResult getAudioBeatAlgorithmResult(String str, String str2, int i2, int i3, int i4) {
        an.d("VEUtils", "getAudioBeatAlgorithmResult trimIn " + i2 + ", trimOut " + i3 + ", mvTime " + i4);
        VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult = (VEMVAudioAlgorithmResult) TEVideoUtils.getAudioAlgorithmResult(str, str2, i2, i3);
        vEMVAudioAlgorithmResult.resizeBeatTrackingNum(i3 - i2, i4);
        an.b("VEUtils", "getAudioBeatAlgorithmResult time = " + Arrays.toString(vEMVAudioAlgorithmResult.bitsTime));
        an.b("VEUtils", "getAudioBeatAlgorithmResult value = " + Arrays.toString(vEMVAudioAlgorithmResult.bitsValue));
        return vEMVAudioAlgorithmResult;
    }

    public static int saveCompressedImage(String str, String str2, int i2, int i3, int i4) {
        boolean z;
        String str3;
        Bitmap.CompressFormat compressFormat;
        if (i2 <= 0 || i3 <= 0) {
            z = true;
        } else {
            z = false;
        }
        Bitmap loadBitmap = BitmapLoader.loadBitmap(str, i2, i3, BitmapLoader.a.INVALID, true, true, z);
        if (loadBitmap != null) {
            if (i4 == 0) {
                str3 = str2 + "0.png";
                compressFormat = Bitmap.CompressFormat.PNG;
            } else if (i4 == 1) {
                str3 = str2 + "0.jpeg";
                compressFormat = Bitmap.CompressFormat.JPEG;
            } else {
                an.d("VEUtils", "Target format is wrongly configured, generate compressed image failed!");
                return 1;
            }
            saveBitmapToPath(loadBitmap, str3, compressFormat);
            return 0;
        }
        an.d("VEUtils", "Bitmap is empty, generate compressed image failed!");
        return 1;
    }

    public static int transCodeAudio(String str, String str2, int i2, int i3, int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("ffmpeg");
        if (str.contains(" ")) {
            str = str.replace(" ", "\\ ");
        }
        sb.append(" -i ").append(str);
        if (i2 != -1) {
            sb.append(" -ac ").append(i2);
        }
        if (i3 != -1) {
            sb.append(" -ab ").append(i3);
        }
        if (i4 != -1) {
            sb.append(" -ar ").append(i4);
        }
        sb.append(" ".concat(String.valueOf(str2)));
        an.a("VEUtils", sb.toString());
        return execFFmpegCommand(sb.toString(), null);
    }

    public static int getVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, ad adVar) {
        return getVideoFrames(str, iArr, i2, i3, z, adVar, ROTATE_DEGREE.ROTATE_NONE);
    }

    public static int getVideoFrames2(String str, int[] iArr, int i2, int i3, boolean z, ad adVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(adVar);
        com.ss.android.ttve.monitor.e.a("iesve_veutils_extract_video_frames", 1, (com.ss.android.vesdk.g.a) null);
        return TEVideoUtils.getVideoFrames2(str, iArr, i2, i3, z, tEVideoUtilsCallback);
    }

    public static int getVideoFrames3(String str, int[] iArr, int i2, int i3, boolean z, ad adVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(adVar);
        com.ss.android.ttve.monitor.e.a("iesve_veutils_extract_video_frames", 1, (com.ss.android.vesdk.g.a) null);
        return TEVideoUtils.getVideoFrames3(str, iArr, i2, i3, z, tEVideoUtilsCallback);
    }

    public static VEMusicWaveBean getMusicWaveData(String str, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 0) {
            i2 = com.ss.android.ttve.model.h.f61190f;
        }
        VEMusicWaveBean audioWaveData = TEVideoUtils.getAudioWaveData(str, i2, i3, i4, i5, i6);
        if (audioWaveData == null || audioWaveData.getWaveBean().length == 0) {
            return null;
        }
        return audioWaveData;
    }

    public static int transCodeAudio(String str, int i2, int i3, String str2, int i4, int i5) {
        MethodCollector.i(12748);
        int transCodeAudioFile = TEVideoUtils.transCodeAudioFile(str, i2, i3, str2, i4, i5, -1);
        com.ss.android.ttve.monitor.h.a(4, "te_edit_get_audio_frame_ret", (long) transCodeAudioFile);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.o(12748);
        return transCodeAudioFile;
    }

    public static int getVideoThumb(VERecordData vERecordData, int i2, int i3, int i4, boolean z, ad adVar) {
        ROTATE_DEGREE rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
        String str = "";
        int i5 = 0;
        int i6 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f150790b) {
            if (vERecordSegmentData.f150803j) {
                str = vERecordSegmentData.f150794a;
                rotate_degree = vERecordSegmentData.f150800g;
                int i7 = (int) ((vERecordSegmentData.f150805l - vERecordSegmentData.f150804k) / 1000);
                i6 = Math.min(i7, ((int) (vERecordSegmentData.f150804k / 1000)) + (i2 - i5));
                if (i2 >= i5 && i2 <= i5 + i7) {
                    break;
                }
                i5 += i7;
            }
        }
        if (TextUtils.isEmpty(str) || i6 < 0) {
            an.d("VEUtils", "Timestamp is not in the valid time range!");
            return -100;
        }
        return getVideoFrames(str, new int[]{i6}, i3, i4, z, adVar, rotate_degree);
    }

    public static int transCodeAudio(String str, String str2, float f2, int i2, int i3, int i4) {
        MethodCollector.i(12622);
        int detachAudioFromVideos = TEVideoUtils.detachAudioFromVideos(str, new String[]{str2}, new long[]{-1}, new long[]{-1}, -1, -1, new float[]{f2}, i2, i3, i4);
        com.ss.android.ttve.monitor.h.a(4, "te_edit_get_audio_frame_ret", (long) detachAudioFromVideos);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.o(12622);
        return detachAudioFromVideos;
    }

    public static int getAudioFromRecordData(String str, VERecordData vERecordData, int i2, int i3, int i4, b bVar) {
        if (vERecordData == null || vERecordData.f150790b.size() <= 0) {
            an.d("VEUtils", "Get AudioFromRecordData parameter error!");
            return -100;
        }
        int size = vERecordData.f150790b.size();
        String[] strArr = new String[size];
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        long[] jArr4 = new long[size];
        float[] fArr = new float[size];
        int i5 = 0;
        long j2 = 0;
        for (VERecordData.VERecordSegmentData vERecordSegmentData : vERecordData.f150790b) {
            if (vERecordSegmentData.f150803j) {
                strArr[i5] = vERecordSegmentData.f150795b;
                jArr[i5] = (long) ((int) (vERecordSegmentData.f150804k / 1000));
                jArr2[i5] = (long) ((int) (vERecordSegmentData.f150805l / 1000));
                fArr[i5] = vERecordSegmentData.f150798e;
                jArr3[i5] = (long) ((int) (((float) jArr[i5]) * fArr[i5]));
                jArr4[i5] = (long) ((int) (((float) jArr2[i5]) * fArr[i5]));
                j2 += jArr4[i5] - jArr3[i5];
                i5++;
            }
        }
        if (i5 != 0) {
            return detachAudioFromVideos(str, (String[]) Arrays.copyOf(strArr, i5), Arrays.copyOf(jArr3, i5), Arrays.copyOf(jArr4, i5), 0, j2, Arrays.copyOf(fArr, i5), i2, i3, i4, bVar);
        }
        an.d("VEUtils", "getAudioFromRecordData There are no valid clips!");
        return -100;
    }

    public static int processAudioTuning(String[] strArr, int[] iArr, int[] iArr2, float f2, float f3, String str, String str2) {
        return TEVideoUtils.processAudioTuning(strArr, iArr, iArr2, f2, f3, str, str2);
    }

    public static int getVideoFrameData(String str, int i2, int i3, int i4, int i5, TEVideoUtils.a aVar, ae aeVar) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setFrameDataListener(aeVar);
        return TEVideoUtils.getVideoFrameData(str, i2, i3, i4, i5, aVar, tEVideoUtilsCallback);
    }

    public static int getVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, ad adVar, ROTATE_DEGREE rotate_degree) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(adVar);
        com.ss.android.ttve.monitor.e.a("iesve_veutils_extract_video_frames", 1, (com.ss.android.vesdk.g.a) null);
        return TEVideoUtils.getVideoFrames(str, iArr, i2, i3, z, tEVideoUtilsCallback, rotate_degree.ordinal());
    }

    public static int concatRecordFrag(String[] strArr, String[] strArr2, boolean z, int i2, String str, String str2, String str3, String str4) {
        long[] jArr = new long[strArr.length];
        Arrays.fill(jArr, -1L);
        long[] jArr2 = new long[strArr2.length];
        Arrays.fill(jArr2, -1L);
        return concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i2, str, str2, str3, str4);
    }

    public static int getVideoThumb(String str, int i2, ad adVar, boolean z, int i3, int i4, long j2, int i5) {
        TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
        tEVideoUtilsCallback.setListener(adVar);
        com.ss.android.ttve.monitor.e.a("iesve_veutils_extract_video_thumb", 1, (com.ss.android.vesdk.g.a) null);
        return TEVideoUtils.getVideoThumb(str, i2, tEVideoUtilsCallback, z, i3, i4, j2, i5);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, String str2, String str3, int i4) {
        MethodCollector.i(12513);
        int saveVideoFrames = TEVideoUtils.saveVideoFrames(str, iArr, i2, i3, z, str2 + str3, i4, 70);
        com.ss.android.ttve.monitor.h.a(4, "te_edit_save_frame_without_effect_ret", (long) saveVideoFrames);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.o(12513);
        return saveVideoFrames;
    }

    public static int getVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, boolean z2, int i4, boolean z3, ad adVar) {
        return TEVideoUtils.getVideoFramesMore(str, iArr, i2, i3, z, z2, i4, z3, adVar);
    }

    public static int saveVideoFrames(String str, int[] iArr, int i2, int i3, boolean z, String str2, String str3, int i4, int i5) {
        MethodCollector.i(12373);
        int saveVideoFrames = TEVideoUtils.saveVideoFrames(str, iArr, i2, i3, z, str2 + str3, i4, i5);
        if (saveVideoFrames != 0 && getFileType(str) == a.type_Image.getValue()) {
            saveVideoFrames = saveCompressedImage(str, str2 + str3, i2, i3, i4);
        }
        com.ss.android.ttve.monitor.h.a(4, "te_edit_save_frame_without_effect_ret", (long) saveVideoFrames);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.o(12373);
        return saveVideoFrames;
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j2, long j3, float[] fArr, int i2, int i3, int i4) {
        return detachAudioFromVideos(str, strArr, jArr, jArr2, j2, j3, fArr, i2, i3, i4, b.Legacy);
    }

    public static int concatRecordFrag(String[] strArr, long[] jArr, String[] strArr2, long[] jArr2, boolean z, int i2, String str, String str2, String str3, String str4) {
        for (String str5 : strArr) {
            if (!new File(str5).exists()) {
                return -114;
            }
        }
        for (String str6 : strArr2) {
            if (!new File(str6).exists()) {
                return -114;
            }
        }
        return TEVideoUtils.concatRecordFrag(strArr, jArr, strArr2, jArr2, z, i2, str, str2, str3, str4);
    }

    public static int detachAudioFromVideos(String str, String[] strArr, long[] jArr, long[] jArr2, long j2, long j3, float[] fArr, int i2, int i3, int i4, b bVar) {
        MethodCollector.i(12517);
        int detachAudioFromVideos = TEVideoUtils.detachAudioFromVideos(str, strArr, jArr, jArr2, j2, j3, fArr, i2, i3, i4, bVar.ordinal());
        com.ss.android.ttve.monitor.h.a(4, "te_edit_get_audio_frame_ret", (long) detachAudioFromVideos);
        TEMonitorInvoker.nativeMonitorPerfWithType(4);
        MethodCollector.o(12517);
        return detachAudioFromVideos;
    }
}
