package com.ss.android.ttve.mediacodec;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Range;
import android.view.Surface;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.common.c;
import com.ss.android.ttve.common.e;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.ao;
import com.ss.android.vesdk.u;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class TEMediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener, ImageReader.OnImageAvailableListener {
    private static int file_count;
    private static Object mCodecListLock = new Object();
    private static boolean mIsByteVC1Blocklist = false;
    private static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    private static boolean m_useCreateDecoderByName = true;
    private static volatile boolean sDequeueHWDecodeInputBufferOpt = true;
    private static int sDequeueOutputTimeoutUs = 10000;
    private static boolean sHWDecodeSupportRtAndOr = false;
    private static int sPendingInputBufferThreshold = 5;
    private final int MAX_DELAY_COUNT = 10;
    private final long MAX_SLEEP_MS = 0;
    private String VIDEO_MIME_TYPE = "video/avc";
    private VEFrame mConvertFrame = null;
    private Image mImage = null;
    private ImageReader mImageReader = null;
    private int mMinCompressionRatio = 1;
    private HandlerThread mReaderHandlerThread = null;
    private VEFrame mScaleFrame = null;
    private Handler m_MediaCodechandler;
    private ConditionVariable m_ReEncodeOptCV = new ConditionVariable(true);
    private volatile boolean m_awaitNewImageSuccess = false;
    private boolean m_bHWOverload = false;
    private boolean m_bNeedConfigure;
    private volatile boolean m_bReEnableOpt = false;
    private boolean m_bUseImageReader;
    private MediaCodec.BufferInfo m_bufferInfo = new MediaCodec.BufferInfo();
    private ByteBuffer m_codecSpecificData;
    private MediaCodec m_decoder = null;
    private volatile boolean m_decoderStarted = false;
    private c m_eglStateSaver = null;
    private ByteBuffer m_extraDataBuf;
    private MediaFormat m_format;
    private boolean m_frameAvailable = false;
    private final Object m_frameSyncObject = new Object();
    private HandlerThread m_handleThread = new HandlerThread("mediacodec_callback");
    private int m_iCodecID = 28;
    private int m_iCurCount = 0;
    private int m_iFps;
    private int m_iHeight;
    private int m_iOutputHeight;
    private int m_iOutputWidth;
    private int m_iRotateDegree;
    private int m_iWidth;
    private int m_indexOfOutputBuffer = -1;
    private volatile boolean m_inputBufferQueued = false;
    private long m_nativeHandler;
    private boolean m_needSendPacketAgain = false;
    private volatile int m_pendingInputFrameCount = 0;
    private b m_renderParam = new b();
    private volatile boolean m_sawInputEOS = false;
    private volatile boolean m_sawOutputEOS = false;
    private e m_sharedContext = null;
    private Surface m_surface;
    private int[] m_surfaceTexID = new int[1];
    private SurfaceTexture m_surfaceTexture;
    private a m_textureRender = null;
    private volatile long m_timestampOfCurTexFrame = Long.MIN_VALUE;
    private volatile long m_timestampOfLastDecodedFrame = Long.MIN_VALUE;

    public static int com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    public static int com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w(String str, String str2) {
        return 0;
    }

    private static Object com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    private native boolean nativeOnFrameAvailable(long j2, ByteBuffer byteBuffer, int i2);

    private static void setHWDecodeBoolConfigFromNative(String str, boolean z) {
    }

    private static void setHWDecodeIntConfigFromNative(String str, int i2) {
    }

    private boolean isNeedSendPacketAgain() {
        return this.m_needSendPacketAgain;
    }

    public b getRenderParam() {
        return this.m_renderParam;
    }

    private boolean IsValid() {
        if (this.m_decoder != null) {
            return true;
        }
        return false;
    }

    private int restartDecoder() {
        stopDecoder();
        return startDecoder();
    }

    public int getOESTexture() {
        return this.m_surfaceTexID[0];
    }

    private void deleteTexture() {
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] != 0) {
            GLES20.glDeleteTextures(1, iArr, 0);
            this.m_surfaceTexID[0] = 0;
        }
    }

    public static boolean isSupportByteVC10bit() {
        return isSupportFormat("video/hevc", 2, 16384);
    }

    public int closeDecoder() {
        an.c("TEMediaCodecDecoder", "TEMediaCodecDecoder closeDecoder");
        stopDecoder();
        deleteTexture();
        return 0;
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public RectF f61128a;

        /* renamed from: b  reason: collision with root package name */
        public int f61129b;

        /* renamed from: c  reason: collision with root package name */
        public int f61130c;

        /* renamed from: d  reason: collision with root package name */
        public int f61131d;

        static {
            Covode.recordClassIndex(37636);
        }

        public String toString() {
            return "cropRect: " + this.f61128a + ", rotate: " + this.f61129b;
        }

        public b() {
        }
    }

    public void signalReEncodeOptCV() {
        if (this.m_bReEnableOpt) {
            this.m_ReEncodeOptCV.open();
            an.b("TEMediaCodecDecoder", "signalReEncodeOptCV...");
        }
    }

    static {
        Covode.recordClassIndex(37634);
    }

    private int createTexture() {
        GLES20.glGenTextures(1, this.m_surfaceTexID, 0);
        int[] iArr = this.m_surfaceTexID;
        if (iArr[0] <= 0) {
            an.d("TEMediaCodecDecoder", "createTexture failed");
            return 0;
        }
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return this.m_surfaceTexID[0];
    }

    public static int getMaxMediaCodecVideoDecoderCount() {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21("video/avc");
        if (mediaCodecInfo21 == null) {
            an.d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return -2;
        }
        int maxSupportedInstances = mediaCodecInfo21.getCapabilitiesForType("video/avc").getMaxSupportedInstances();
        an.a("TEMediaCodecDecoder", "getMaxMediaCodecVideoDecoderCount ".concat(String.valueOf(maxSupportedInstances)));
        return maxSupportedInstances;
    }

    private boolean isMtkByteVC1BlockList() {
        String lowerCase = Build.HARDWARE.toLowerCase(Locale.US);
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    private boolean isHisiByteVC1BlockList() {
        String property = getProperty("ro.board.platform", null);
        if (Build.VERSION.SDK_INT == 26 && property != null && (property.startsWith("kirin960") || property.startsWith("hi3660"))) {
            try {
                if (Double.parseDouble(getProperty("ro.config.hw_codec_support", "0.0")) < 0.18041d) {
                    return true;
                }
            } catch (NumberFormatException unused) {
                com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w("TEMediaCodecDecoder", "vendor property abnormal");
                return true;
            }
        }
        return false;
    }

    private int stopDecoder() {
        cleanupDecoder();
        this.m_handleThread.quit();
        HandlerThread handlerThread = this.mReaderHandlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mReaderHandlerThread = null;
        }
        a aVar = this.m_textureRender;
        if (aVar != null) {
            if (aVar.f61115a != 0) {
                GLES20.glDeleteProgram(aVar.f61115a);
                aVar.f61115a = 0;
            }
            if (aVar.f61120f[0] != 0) {
                GLES20.glDeleteFramebuffers(1, aVar.f61120f, 0);
            }
            this.m_textureRender = null;
        }
        Surface surface = this.m_surface;
        if (surface != null) {
            surface.release();
            this.m_surface = null;
        }
        SurfaceTexture surfaceTexture = this.m_surfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.m_surfaceTexture.release();
            this.m_surfaceTexture = null;
        }
        return 0;
    }

    public void cleanupDecoder() {
        an.a("TEMediaCodecDecoder", "cleanupDecoder");
        if (this.m_decoder != null) {
            if (this.m_decoderStarted) {
                try {
                    if (this.m_inputBufferQueued) {
                        this.m_decoder.flush();
                        this.m_inputBufferQueued = false;
                    }
                    this.m_decoder.stop();
                } catch (Exception e2) {
                    an.d("TEMediaCodecDecoder", e2.getMessage());
                    e2.printStackTrace();
                }
                this.m_decoderStarted = false;
            }
            this.m_decoder.release();
            this.m_decoder = null;
            this.m_iRotateDegree = 0;
        }
        if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            c.b(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
        }
        this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
        this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
        this.m_pendingInputFrameCount = 0;
        this.m_sawInputEOS = false;
        this.m_sawOutputEOS = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMaxBlocksSizePerSecond() {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.getMaxBlocksSizePerSecond():int");
    }

    private int configureMediaFormat() {
        MediaCodecInfo mediaCodecInfo;
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                mediaCodecInfo = getMediaCodecInfo21(this.VIDEO_MIME_TYPE);
            } else {
                mediaCodecInfo = getMediaCodecInfo(this.VIDEO_MIME_TYPE);
            }
            if (mediaCodecInfo == null) {
                an.d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
                return -2;
            }
            if (this.m_iCodecID == 28) {
                an.a("TEMediaCodecDecoder", "mediacodec supports adaptive playback: ".concat(String.valueOf(mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).isFeatureSupported("adaptive-playback"))));
            }
            an.b("TEMediaCodecDecoder", "configureMediaFormat , size: " + this.m_iWidth + " x " + this.m_iHeight);
            int i2 = this.m_iCodecID;
            if (i2 == 28 || i2 == 174 || mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().isSizeSupported(this.m_iWidth, this.m_iHeight)) {
                this.m_format = MediaFormat.createVideoFormat(this.VIDEO_MIME_TYPE, this.m_iWidth, this.m_iHeight);
                an.a("TEMediaCodecDecoder", "isSupport10bit = ".concat(String.valueOf(isSupportByteVC10bit())));
                ByteBuffer byteBuffer = this.m_codecSpecificData;
                if (byteBuffer != null) {
                    this.m_format.setByteBuffer("csd-0", byteBuffer);
                }
                if (this.m_bUseImageReader) {
                    this.m_format.setInteger("color-format", 2135033992);
                }
                if (Build.VERSION.SDK_INT == 16) {
                    this.m_format.setInteger("max-input-size", 0);
                } else {
                    int i3 = Build.VERSION.SDK_INT;
                    if (174 == this.m_iCodecID) {
                        this.m_format.setInteger("max-input-size", this.m_iWidth * this.m_iHeight);
                    } else {
                        int i4 = Build.VERSION.SDK_INT;
                        if (28 == this.m_iCodecID) {
                            this.m_format.setInteger("max-input-size", ao.a(this.m_iWidth) * ao.a(this.m_iHeight) * 16 * 16);
                        }
                    }
                }
                boolean booleanValue = ((Boolean) u.a().a("ve_hwdecode_support_rt_and_or", (Object) false)).booleanValue();
                sHWDecodeSupportRtAndOr = booleanValue;
                if (booleanValue) {
                    this.m_format.setInteger("priority", 0);
                    an.a("TEMediaCodecDecoder", "set real-time and operating-rate");
                }
                if (174 != this.m_iCodecID || isSupportSize(mediaCodecInfo)) {
                    return 0;
                }
                an.d("TEMediaCodecDecoder", "configureMediaFormat, failed, case VIDEO_MIME_TYPE = " + this.VIDEO_MIME_TYPE + ", size = " + this.m_iWidth + " x " + this.m_iHeight + " is not supported.");
                return -5;
            }
            an.d("TEMediaCodecDecoder", "is not size support! width: " + this.m_iWidth + " height: " + this.m_iHeight);
            return -3;
        } catch (Exception e2) {
            an.d("TEMediaCodecDecoder", "reconfigureMediaFormat: " + e2.getMessage());
            e2.printStackTrace();
            return -4;
        }
    }

    private void onImageFrameAvailable() {
        VEFrame createYUVPlanFrame;
        MethodCollector.i(7253);
        if (this.mImage.getFormat() == 35) {
            int width = this.mImage.getWidth();
            int height = this.mImage.getHeight();
            if (this.mImage.getPlanes() == null || this.mImage.getPlanes()[1].getPixelStride() <= 1) {
                createYUVPlanFrame = VEFrame.createYUVPlanFrame(new com.ss.android.ttve.model.e(this.mImage.getPlanes()), width, height, 0, 0, VEFrame.a.TEPixFmt_YUV420P);
            } else {
                VEFrame createYUVPlanFrame2 = VEFrame.createYUVPlanFrame(new com.ss.android.ttve.model.e(this.mImage.getPlanes()), width, height, 0, 0, VEFrame.a.TEPixFmt_NV12);
                if (this.mConvertFrame == null) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((width * height) * 3) / 2);
                    allocateDirect.clear();
                    this.mConvertFrame = VEFrame.createByteBufferFrame(allocateDirect, width, height, 0, 0, VEFrame.a.TEPixFmt_YUV420P);
                }
                TEImageUtils.a(createYUVPlanFrame2, this.mConvertFrame, VEFrame.b.OP_CONVERT);
                createYUVPlanFrame = this.mConvertFrame;
            }
            if (width == this.m_iOutputWidth && height == this.m_iOutputHeight && (createYUVPlanFrame.getFrame() instanceof VEFrame.ByteBufferFrame)) {
                ByteBuffer byteBuffer = ((VEFrame.ByteBufferFrame) createYUVPlanFrame.getFrame()).getByteBuffer();
                nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer, byteBuffer.remaining());
                MethodCollector.o(7253);
                return;
            }
            if (this.mScaleFrame == null) {
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((this.m_iOutputWidth * this.m_iOutputHeight) * 3) / 2);
                allocateDirect2.clear();
                this.mScaleFrame = VEFrame.createByteBufferFrame(allocateDirect2, this.m_iOutputWidth, this.m_iOutputHeight, 0, 0, VEFrame.a.TEPixFmt_YUV420P);
            }
            if (this.m_iWidth == this.m_iOutputWidth && this.m_iHeight == this.m_iOutputHeight) {
                TEImageUtils.a(createYUVPlanFrame, this.mScaleFrame, VEFrame.b.OP_COPY);
            } else {
                TEImageUtils.a(createYUVPlanFrame, this.mScaleFrame, VEFrame.b.OP_SCALE);
            }
            ByteBuffer byteBuffer2 = ((VEFrame.ByteBufferFrame) this.mScaleFrame.getFrame()).getByteBuffer();
            nativeOnFrameAvailable(this.m_nativeHandler, byteBuffer2, byteBuffer2.remaining());
            MethodCollector.o(7253);
            return;
        }
        an.b("TEMediaCodecDecoder", "image format: " + this.mImage.getFormat());
        MethodCollector.o(7253);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int startDecoder() {
        /*
        // Method dump skipped, instructions count: 446
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.startDecoder():int");
    }

    private void setRenderParam(int i2) {
        this.m_renderParam.f61129b = i2;
    }

    private void setProcessFlag(int i2) {
        boolean z = true;
        if ((i2 & 1) == 0) {
            z = false;
        }
        this.m_bReEnableOpt = z;
    }

    private ByteBuffer getInputBufferByIdx(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_decoder.getInputBuffer(i2);
        }
        return this.m_decoder.getInputBuffers()[i2];
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (Build.VERSION.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 19 || !Build.MODEL.startsWith("SM-G800")) {
            return false;
        }
        if ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)) {
            return true;
        }
        return false;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        MethodCollector.i(7225);
        synchronized (this.m_frameSyncObject) {
            try {
                if (this.m_frameAvailable) {
                    an.b("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
                }
                this.m_frameAvailable = true;
                this.m_frameSyncObject.notifyAll();
            } finally {
                MethodCollector.o(7225);
            }
        }
    }

    public void onImageAvailable(ImageReader imageReader) {
        MethodCollector.i(7256);
        synchronized (this.m_frameSyncObject) {
            try {
                if (this.m_frameAvailable) {
                    an.b("TEMediaCodecDecoder", "m_frameAvailable already set, frame could be dropped!");
                }
                Image acquireNextImage = imageReader.acquireNextImage();
                Image image = this.mImage;
                if (image != null) {
                    image.close();
                }
                this.mImage = acquireNextImage;
                this.m_frameAvailable = true;
                this.m_frameSyncObject.notifyAll();
            } finally {
                MethodCollector.o(7256);
            }
        }
    }

    public int releaseOutBuffer(boolean z) {
        try {
            this.m_pendingInputFrameCount--;
            this.m_decoder.releaseOutputBuffer(this.m_indexOfOutputBuffer, z);
        } catch (Exception e2) {
            e2.printStackTrace();
            an.d("TEMediaCodecDecoder", e2.getMessage());
        }
        if (!z) {
            return 0;
        }
        if (!AwaitNewImage(500)) {
            an.d("TEMediaCodecDecoder", "release output buffer to surface texture failed!");
            return -103;
        }
        this.m_awaitNewImageSuccess = true;
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f61115a;

        /* renamed from: b  reason: collision with root package name */
        int f61116b;

        /* renamed from: c  reason: collision with root package name */
        int f61117c;

        /* renamed from: d  reason: collision with root package name */
        int f61118d;

        /* renamed from: e  reason: collision with root package name */
        int f61119e;

        /* renamed from: f  reason: collision with root package name */
        int[] f61120f = new int[1];

        /* renamed from: g  reason: collision with root package name */
        private final float[] f61121g;

        /* renamed from: h  reason: collision with root package name */
        private FloatBuffer f61122h;

        /* renamed from: i  reason: collision with root package name */
        private float[] f61123i = new float[16];

        /* renamed from: j  reason: collision with root package name */
        private float[] f61124j = new float[16];

        /* renamed from: k  reason: collision with root package name */
        private int f61125k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f61126l;

        /* renamed from: m  reason: collision with root package name */
        private int f61127m;
        private int n;
        private int o;
        private int p;

        static {
            Covode.recordClassIndex(37635);
        }

        public a(SurfaceTexture surfaceTexture) {
            float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
            this.f61121g = fArr;
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f61122h = asFloatBuffer;
            asFloatBuffer.put(fArr).position(0);
            if (surfaceTexture != null) {
                surfaceTexture.getTransformMatrix(this.f61124j);
            } else {
                Matrix.setIdentityM(this.f61124j, 0);
            }
        }

        static int a(int i2, String str) {
            int glCreateShader = GLES20.glCreateShader(i2);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }

        private void a(int i2, int i3, int i4, int i5, int i6) {
            float f2;
            float f3;
            if (i3 <= 0 || i4 <= 0 || i5 <= 0 || i6 <= 0) {
                Matrix.setIdentityM(this.f61123i, 0);
            } else if (this.f61125k != i2 || this.f61126l || this.f61127m != i3 || this.n != i4 || this.o != i5 || this.p != i6) {
                this.f61125k = i2;
                float[] fArr = new float[16];
                Matrix.setIdentityM(fArr, 0);
                Matrix.rotateM(fArr, 0, (float) i2, 0.0f, 0.0f, 1.0f);
                if (Math.abs(i2) == 90 || Math.abs(i2) == 270) {
                    f2 = (float) i4;
                } else {
                    f2 = (float) i3;
                }
                if (Math.abs(i2) == 90 || Math.abs(i2) == 270) {
                    f3 = (float) i3;
                } else {
                    f3 = (float) i4;
                }
                float f4 = (float) i5;
                float f5 = f4 / f2;
                float f6 = (float) i6;
                float f7 = f6 / f3;
                if (f5 <= f7) {
                    f5 = f7;
                }
                Matrix.scaleM(fArr, 0, (((float) i3) / 2.0f) * f5, (((float) i4) / 2.0f) * f5, 1.0f);
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, 0);
                Matrix.setLookAtM(fArr2, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                float[] fArr3 = new float[16];
                Matrix.setIdentityM(fArr3, 0);
                Matrix.orthoM(fArr3, 0, ((float) (-i5)) / 2.0f, f4 / 2.0f, ((float) (-i6)) / 2.0f, f6 / 2.0f, -2.0f, 2.0f);
                float[] fArr4 = new float[16];
                Matrix.setIdentityM(fArr4, 0);
                Matrix.multiplyMM(fArr4, 0, fArr2, 0, fArr, 0);
                Matrix.setIdentityM(this.f61123i, 0);
                Matrix.multiplyMM(this.f61123i, 0, fArr3, 0, fArr4, 0);
            }
        }

        public final void a(int i2, int i3, int i4, int i5, int i6, int i7) {
            if (i2 > 0 && i3 > 0 && i5 >= i4 && i7 >= i6 && i7 <= i2 && i5 <= i3) {
                float[] fArr = this.f61121g;
                float f2 = (float) i2;
                float f3 = (((float) i6) * 1.0f) / f2;
                fArr[3] = f3;
                float f4 = (float) i3;
                float f5 = (((float) i4) * 1.0f) / f4;
                fArr[4] = f5;
                float f6 = (((float) i7) * 1.0f) / f2;
                fArr[8] = f6;
                fArr[9] = f5;
                fArr[13] = f3;
                float f7 = (((float) i5) * 1.0f) / f4;
                fArr[14] = f7;
                fArr[18] = f6;
                fArr[19] = f7;
                this.f61122h.clear();
                this.f61122h.put(this.f61121g).position(0);
            }
        }

        public final void a(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            GLES20.glViewport(0, 0, i4, i5);
            GLES20.glBindFramebuffer(36160, this.f61120f[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i7, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16640);
            GLES20.glUseProgram(this.f61115a);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i6);
            this.f61122h.position(0);
            GLES20.glVertexAttribPointer(this.f61118d, 3, 5126, false, 20, (Buffer) this.f61122h);
            GLES20.glEnableVertexAttribArray(this.f61118d);
            this.f61122h.position(3);
            GLES20.glVertexAttribPointer(this.f61119e, 2, 5126, false, 20, (Buffer) this.f61122h);
            GLES20.glEnableVertexAttribArray(this.f61119e);
            if (((Boolean) u.a().a("ve_enable_hw_decoder_support_rotate", (Object) false)).booleanValue()) {
                a(i8, i2, i3, i4, i5);
            } else {
                Matrix.setIdentityM(this.f61123i, 0);
            }
            GLES20.glUniformMatrix4fv(this.f61116b, 1, false, this.f61123i, 0);
            GLES20.glUniformMatrix4fv(this.f61117c, 1, false, this.f61124j, 0);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f61118d);
            GLES20.glDisableVertexAttribArray(this.f61119e);
            GLES20.glBindTexture(36197, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glFinish();
        }
    }

    private boolean AwaitNewImage(int i2) {
        MethodCollector.i(7407);
        synchronized (this.m_frameSyncObject) {
            do {
                try {
                    if (!this.m_frameAvailable) {
                        try {
                            this.m_frameSyncObject.wait((long) i2);
                        } catch (InterruptedException e2) {
                            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_e("TEMediaCodecDecoder", e2.getMessage());
                            e2.printStackTrace();
                            MethodCollector.o(7407);
                            return false;
                        }
                    } else {
                        this.m_frameAvailable = false;
                        MethodCollector.o(7407);
                        return true;
                    }
                } finally {
                    MethodCollector.o(7407);
                }
            } while (this.m_frameAvailable);
            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_e("TEMediaCodecDecoder", "Frame wait timed out!");
            return false;
        }
    }

    public static boolean com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(7771);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(7771);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(7771);
        return delete;
    }

    private static MediaCodecInfo getMediaCodecInfo(String str) {
        String[] supportedTypes;
        int codecCount = MediaCodecList.getCodecCount();
        for (int i2 = 0; i2 < codecCount; i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    for (String str2 : codecInfoAt.getSupportedTypes()) {
                        if (str2.equalsIgnoreCase(str)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    private static MediaCodecInfo getMediaCodecInfo21(String str) {
        String[] supportedTypes;
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (!(codecInfos == null || codecInfos.length == 0)) {
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                    String name = mediaCodecInfo.getName();
                    if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                        for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                            if (str2.equalsIgnoreCase(str)) {
                                return mediaCodecInfo;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int flushDecoder(boolean z) {
        if (this.m_decoder != null) {
            if (z) {
                try {
                    if (this.m_sawInputEOS || this.m_sawOutputEOS) {
                        cleanupDecoder();
                        if (!setupDecoder(this.VIDEO_MIME_TYPE)) {
                            return -2;
                        }
                        an.c("TEMediaCodecDecoder", "Decoder has been recreated.");
                        return 0;
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (this.m_inputBufferQueued) {
                if (!z) {
                    this.m_timestampOfLastDecodedFrame = Long.MIN_VALUE;
                    this.m_timestampOfCurTexFrame = Long.MIN_VALUE;
                    this.m_pendingInputFrameCount = 0;
                    this.m_sawInputEOS = false;
                    this.m_sawOutputEOS = false;
                }
                this.m_decoder.flush();
                this.m_inputBufferQueued = false;
                this.m_pendingInputFrameCount = 0;
                if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                    c.b(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode());
                }
                an.b("TEMediaCodecDecoder", "Video decoder has been flushed.");
                return 0;
            }
        }
        return -3;
    }

    private boolean isSupportSize(MediaCodecInfo mediaCodecInfo) {
        Range<Integer> range;
        Range<Integer> range2;
        int i2;
        boolean z = false;
        if (mediaCodecInfo == null) {
            return false;
        }
        Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedWidths();
        Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(this.VIDEO_MIME_TYPE).getVideoCapabilities().getSupportedHeights();
        if (supportedWidths.getUpper().intValue() < supportedHeights.getUpper().intValue()) {
            range = supportedWidths;
        } else {
            range = supportedHeights;
        }
        if (supportedWidths.getUpper().intValue() > supportedHeights.getUpper().intValue()) {
            range2 = supportedWidths;
        } else {
            range2 = supportedHeights;
        }
        int i3 = this.m_iWidth;
        int i4 = this.m_iHeight;
        if (i3 < i4) {
            i2 = i3;
        } else {
            i2 = i4;
        }
        if (i3 <= i4) {
            i3 = i4;
        }
        if (range.contains(Integer.valueOf(i2)) && range2.contains(Integer.valueOf(i3))) {
            z = true;
        }
        com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_i("TEMediaCodecDecoder", "isSupportSize, m_iWidth = " + this.m_iWidth + ", m_iHeight  = " + this.m_iHeight + ", widthRange = [" + supportedWidths.getLower() + ", " + supportedWidths.getUpper() + "], heightRange = [" + supportedHeights.getLower() + ", " + supportedHeights.getUpper() + "], bSupportSize = " + z);
        return z;
    }

    private boolean setupDecoder(String str) {
        boolean z = true;
        if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !c.a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            an.c("TEMediaCodecDecoder", an.a("TEMediaCodecDecoder", "setupDecoder ERROR_HW_OVERLOAD", new an.a("MaxCodecBlocksSize is", Integer.valueOf(c.a()), ""), new an.a("UsedCodecBlocksSize is", Integer.valueOf(c.b()), "")));
            if (c.f61141a) {
                an.a("TEMediaCodecDecoder", "guarantee HWEncoder strategy");
                return false;
            }
        }
        try {
            if (!m_useCreateDecoderByName) {
                this.m_decoder = MediaCodec.createDecoderByType(str);
            } else {
                String bestCodecName = getBestCodecName(str);
                this.m_decoder = MediaCodec.createByCodecName(bestCodecName);
                an.a("TEMediaCodecDecoder", "setupDecoder, codecName = ".concat(String.valueOf(bestCodecName)));
            }
            an.a("TEMediaCodecDecoder", "setupDecoder, m_useCreateDecoderByName = " + m_useCreateDecoderByName);
            Surface surface = this.m_surface;
            if (surface != null) {
                this.m_decoder.configure(this.m_format, surface, (MediaCrypto) null, 0);
            } else {
                this.m_decoder.configure(this.m_format, this.mImageReader.getSurface(), (MediaCrypto) null, 0);
            }
            this.m_decoder.start();
            this.m_decoderStarted = true;
            return true;
        } catch (Exception e2) {
            an.d("TEMediaCodecDecoder", e2.getMessage());
            if (e2.getMessage() == null || !e2.getMessage().contains("0xffffec77")) {
                z = false;
            }
            this.m_bHWOverload = z;
            e2.printStackTrace();
            cleanupDecoder();
            return false;
        }
    }

    public String getBestCodecName(String str) {
        int i2;
        MediaCodecInfo mediaCodecInfo;
        String[] supportedTypes;
        a a2;
        MethodCollector.i(7379);
        int i3 = Build.VERSION.SDK_INT;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7379);
            return null;
        } else if (!str.equals("video/hevc") || !mIsByteVC1Blocklist) {
            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_i("TEMediaCodecDecoder", "detect hardware codec by codecType = ".concat(String.valueOf(str)));
            ArrayList arrayList = new ArrayList();
            synchronized (mCodecListLock) {
                try {
                    boolean z = !mVideoHWDecoderCodecs.isEmpty();
                    if (z) {
                        try {
                            i2 = mVideoHWDecoderCodecs.size();
                        } catch (Exception unused) {
                            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w("TEMediaCodecDecoder", "mediaserver died");
                            MethodCollector.o(7379);
                            return null;
                        }
                    } else {
                        i2 = MediaCodecList.getCodecCount();
                    }
                    for (int i4 = 0; i4 < i2 && (!z || arrayList.isEmpty()); i4++) {
                        if (z) {
                            mediaCodecInfo = mVideoHWDecoderCodecs.get(i4);
                        } else {
                            mediaCodecInfo = MediaCodecList.getCodecInfoAt(i4);
                        }
                        String name = mediaCodecInfo.getName();
                        com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_d("TEMediaCodecDecoder", "found codec name : ".concat(String.valueOf(name)));
                        if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = mediaCodecInfo.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z && str2.startsWith("video/")) {
                                        mVideoHWDecoderCodecs.add(mediaCodecInfo);
                                    }
                                    if (str2.equalsIgnoreCase(str)) {
                                        com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_d("TEMediaCodecDecoder", "codec types : ".concat(String.valueOf(str2)));
                                        if ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure")) {
                                            if (name.startsWith("OMX.MTK.")) {
                                                int i5 = Build.VERSION.SDK_INT;
                                            }
                                            if (!codecNeedsFlushWorkaround(name) && (a2 = a.a(mediaCodecInfo, str)) != null) {
                                                com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_i("TEMediaCodecDecoder", "codec : " + a2.f61134a.getName() + ",  rank : " + a2.f61135b);
                                                if (a2.f61135b == 40 && Build.VERSION.SDK_INT < 21) {
                                                    com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w("TEMediaCodecDecoder", "skip vendor mediacodec api impl ambiguous");
                                                } else if (a2.f61135b == 20) {
                                                    com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w("TEMediaCodecDecoder", "skip vendor software codec");
                                                } else {
                                                    arrayList.add(a2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    a aVar = (a) arrayList.get(0);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a aVar2 = (a) it.next();
                        if (aVar2.f61135b > aVar.f61135b) {
                            aVar = aVar2;
                        }
                    }
                    String name2 = aVar.f61134a.getName();
                    MethodCollector.o(7379);
                    return name2;
                } finally {
                    MethodCollector.o(7379);
                }
            }
        } else {
            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_w("TEMediaCodecDecoder", "the device is hw decoder blocklist," + Build.HARDWARE);
            MethodCollector.o(7379);
            return null;
        }
    }

    public int getInfoByFlag(long[] jArr, int i2) {
        if (i2 == 1) {
            jArr[0] = this.m_timestampOfLastDecodedFrame;
        } else if (i2 == 2) {
            jArr[0] = this.m_timestampOfCurTexFrame;
        }
        return 0;
    }

    public static String getProperty(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return str2;
    }

    public static boolean checkHDVideoCanFastImport(int i2, int i3, int i4) {
        if (!((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            return false;
        }
        return c.a(i2, i3, i4);
    }

    public static Bitmap convertTexToBitmap(int i2, int i3, int i4) {
        MethodCollector.i(7656);
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i2, i3, i4);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        MethodCollector.o(7656);
        return createBitmap;
    }

    private static boolean isSupportFormat(String str, int i2, int i3) {
        MediaCodecInfo mediaCodecInfo21 = getMediaCodecInfo21(str);
        if (mediaCodecInfo21 == null) {
            an.d("TEMediaCodecDecoder", "MediaCodecInfo is null!");
            return false;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = mediaCodecInfo21.getCapabilitiesForType(str).profileLevels;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
            if (codecProfileLevel.profile == i2 && codecProfileLevel.level >= i3) {
                return true;
            }
        }
        return false;
    }

    public static ByteBuffer readTextureToByteBuffer(int i2, int i3, int i4) {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(36006, iArr2, 0);
        GLES20.glGenFramebuffers(1, iArr, 0);
        GLES20.glBindFramebuffer(36160, iArr[0]);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        ByteBuffer allocate = ByteBuffer.allocate(i3 * i4 * 4);
        GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, allocate);
        GLES20.glFinish();
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        return allocate;
    }

    public static boolean saveFrameToFile(int i2, int i3, int i4) {
        MethodCollector.i(7756);
        Bitmap convertTexToBitmap = convertTexToBitmap(i2, i3, i4);
        file_count++;
        File file = new File("sdcard/dump/" + file_count + ".jpg");
        if (file.exists()) {
            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            convertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.o(7756);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.o(7756);
            return false;
        } catch (Throwable th) {
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.o(7756);
            throw th;
        }
    }

    public int decodeFrameWithoutDraw(byte[] bArr, int i2, long j2) {
        int i3 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !c.a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            an.b("TEMediaCodecDecoder", an.a("TEMediaCodecDecoder", "decodeFrameWithoutDraw ERROR_HW_OVERLOAD", new an.a("MaxCodecBlocksSize is", Integer.valueOf(c.a()), ""), new an.a("UsedCodecBlocksSize is", Integer.valueOf(c.b()), "")));
        }
        try {
            i3 = decodeFrameWithInputOutput(bArr, i2, j2);
            return i3;
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
            return i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r0 >= 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r10 = getInputBufferByIdx(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r22 != 0) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r20.m_decoder.queueInputBuffer(r0, 0, 0, 0, 4);
        r20.m_sawInputEOS = true;
        com.ss.android.vesdk.an.b("TEMediaCodecDecoder", "RenderInput EOS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0166, code lost:
        r10.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016d, code lost:
        if (r10.capacity() >= r22) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        com.ss.android.vesdk.an.d("TEMediaCodecDecoder", "inputBuf.capacity(): " + r10.capacity() + " < inputSize: " + r22 + ", m_pendingInputFrameCount" + r20.m_pendingInputFrameCount + ", width * height: " + r20.m_iWidth + "*" + r20.m_iHeight);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7544);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b6, code lost:
        return -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b7, code lost:
        r10.put(r21, 0, r22);
        r20.m_decoder.queueInputBuffer(r0, 0, r22, r23, 0);
        r20.m_inputBufferQueued = true;
        r20.m_pendingInputFrameCount++;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int decodeFrame2Surface(byte[] r21, int r22, long r23) {
        /*
        // Method dump skipped, instructions count: 738
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrame2Surface(byte[], int, long):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r1 >= 0) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r9 = getInputBufferByIdx(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r23 != 0) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        r21.m_decoder.queueInputBuffer(r1, 0, 0, 0, 4);
        r21.m_sawInputEOS = true;
        com.ss.android.vesdk.an.a("TEMediaCodecDecoder", "RenderInput EOS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0166, code lost:
        r9.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016f, code lost:
        if (r9.capacity() >= r23) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        com.ss.android.vesdk.an.d("TEMediaCodecDecoder", "inputBuf.capacity(): " + r9.capacity() + " < inputSize: " + r23 + ", m_pendingInputFrameCount" + r21.m_pendingInputFrameCount + ", width * height: " + r21.m_iWidth + "*" + r21.m_iHeight);
        com.bytedance.frameworks.apm.trace.MethodCollector.o(7641);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ba, code lost:
        return -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01bb, code lost:
        r9.put(r22, 0, r23);
        r5 = 1;
        r21.m_decoder.queueInputBuffer(r1, 0, r23, r24, 0);
        r21.m_inputBufferQueued = true;
        r21.m_pendingInputFrameCount++;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0154 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int decodeFrameWithInputOutput(byte[] r22, int r23, long r24) {
        /*
        // Method dump skipped, instructions count: 681
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEMediaCodecDecoder.decodeFrameWithInputOutput(byte[], int, long):int");
    }

    public void updateAndRenderOES(int i2, int i3, int i4, int i5) {
        this.m_iOutputWidth = i3;
        this.m_iOutputHeight = i4;
        this.m_iRotateDegree = i5;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            c cVar = new c();
            this.m_eglStateSaver = cVar;
            cVar.a();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f61056a)) {
            an.c("TEMediaCodecDecoder", "eglGetCurrentContext = " + EGL14.eglGetCurrentContext() + " getSavedEGLContext = " + this.m_eglStateSaver.f61056a);
        }
        if (!this.m_sawOutputEOS) {
            an.b("TEMediaCodecDecoder", "Rendering decoded frame to surface texture.");
            if (this.m_awaitNewImageSuccess) {
                this.m_timestampOfCurTexFrame = this.m_bufferInfo.presentationTimeUs;
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    this.m_awaitNewImageSuccess = false;
                    return;
                }
                a aVar = this.m_textureRender;
                if (aVar != null && i2 > 0) {
                    aVar.a(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i2, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
                this.m_awaitNewImageSuccess = false;
                return;
            }
            an.d("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_awaitNewImageSuccess is false!");
            return;
        }
        an.b("TEMediaCodecDecoder", "Render OES to 2D texture failed: m_sawOutputEOS");
    }

    public int decodeFrame(byte[] bArr, int i2, long j2, int i3, int i4, int i5, int i6) {
        this.m_iOutputWidth = i4;
        this.m_iOutputHeight = i5;
        this.m_iRotateDegree = i6;
        if (!this.m_bUseImageReader && this.m_eglStateSaver == null) {
            c cVar = new c();
            this.m_eglStateSaver = cVar;
            cVar.a();
        }
        if (!this.m_bUseImageReader && !EGL14.eglGetCurrentContext().equals(this.m_eglStateSaver.f61056a)) {
            com_ss_android_ttve_mediacodec_TEMediaCodecDecoder_com_ss_android_ugc_aweme_lancet_LogLancet_e("TEMediaCodecDecoder", "eglGetCurrentContext = " + EGL14.eglGetCurrentContext() + " getSavedEGLContext = " + this.m_eglStateSaver.f61056a);
            this.m_bNeedConfigure = true;
        }
        if (this.m_bNeedConfigure) {
            restartDecoder();
            this.m_bNeedConfigure = false;
            if (!this.m_bUseImageReader) {
                this.m_eglStateSaver.a();
            }
        }
        int i7 = -2;
        if (this.m_decoder == null) {
            return -2;
        }
        if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue() && !c.a(this.m_iWidth * this.m_iHeight * this.m_iFps, hashCode())) {
            an.b("TEMediaCodecDecoder", an.a("TEMediaCodecDecoder", "decodeFrame ERROR_HW_OVERLOAD", new an.a("MaxCodecBlocksSize is", Integer.valueOf(c.a()), ""), new an.a("UsedCodecBlocksSize is", Integer.valueOf(c.b()), "")));
        }
        try {
            i7 = decodeFrame2Surface(bArr, i2, j2);
            if (i7 == 0) {
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.block();
                }
                SurfaceTexture surfaceTexture = this.m_surfaceTexture;
                if (surfaceTexture != null) {
                    surfaceTexture.updateTexImage();
                }
                if (this.m_bReEnableOpt) {
                    this.m_ReEncodeOptCV.close();
                    return i7;
                }
                a aVar = this.m_textureRender;
                if (aVar != null && i3 > 0) {
                    aVar.a(this.m_iWidth, this.m_iHeight, this.m_iOutputWidth, this.m_iOutputHeight, this.m_surfaceTexID[0], i3, this.m_iRotateDegree);
                }
                if (this.m_bUseImageReader) {
                    onImageFrameAvailable();
                }
            }
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
        return i7;
    }

    public int setDecoderParams(int i2, int i3, int i4, byte[] bArr, int i5, int i6, int i7, int i8) {
        this.m_iWidth = i2;
        this.m_iHeight = i3;
        this.m_iFps = i4;
        this.m_iOutputWidth = i6;
        this.m_iOutputHeight = i7;
        this.m_codecSpecificData = null;
        this.m_iCodecID = i8;
        if (i8 == 2) {
            this.VIDEO_MIME_TYPE = "video/mpeg2";
        } else if (i8 == 13) {
            this.VIDEO_MIME_TYPE = "video/mp4v-es";
        } else if (i8 == 28) {
            this.VIDEO_MIME_TYPE = "video/avc";
            this.mMinCompressionRatio = 2;
        } else if (i8 == 140) {
            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp8";
        } else if (i8 == 168) {
            this.VIDEO_MIME_TYPE = "video/x-vnd.on2.vp9";
        } else if (i8 == 174) {
            this.VIDEO_MIME_TYPE = "video/hevc";
            this.mMinCompressionRatio = 4;
        }
        if (i5 > 0) {
            this.m_codecSpecificData = ByteBuffer.wrap(bArr, 0, i5);
        }
        this.m_bNeedConfigure = true;
        return 0;
    }

    public int initDecoder(long j2, int i2, int i3, int i4, byte[] bArr, int i5, int i6, int i7, int i8, boolean z, boolean z2) {
        this.m_nativeHandler = j2;
        this.m_bUseImageReader = z2;
        if (Build.VERSION.SDK_INT < 21) {
            an.c("TEMediaCodecDecoder", "VERSION less then 21, disable HWDecoder");
            return -1;
        }
        m_useCreateDecoderByName = z;
        if (174 == i8 && (isHisiByteVC1BlockList() || isMtkByteVC1BlockList())) {
            mIsByteVC1Blocklist = true;
        }
        int decoderParams = setDecoderParams(i2, i3, i4, bArr, i5, i6, i7, i8);
        if (this.m_bNeedConfigure) {
            decoderParams = configureMediaFormat();
        }
        if (decoderParams != 0) {
            return decoderParams;
        }
        if (this.m_eglStateSaver == null && !this.m_bUseImageReader) {
            c cVar = new c();
            this.m_eglStateSaver = cVar;
            cVar.a();
        }
        if (this.m_bNeedConfigure && (decoderParams = restartDecoder()) == 0) {
            this.m_bNeedConfigure = false;
        }
        an.c("TEMediaCodecDecoder", "TEMediaCodecDecoder initDecoder width =" + i2 + " height = " + i3 + " ret=" + decoderParams);
        return decoderParams;
    }
}
