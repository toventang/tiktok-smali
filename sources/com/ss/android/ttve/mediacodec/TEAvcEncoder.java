package com.ss.android.ttve.mediacodec;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ttve.common.c;
import com.ss.android.ttve.common.d;
import com.ss.android.ttve.common.e;
import com.ss.android.ttve.common.h;
import com.ss.android.ttve.common.i;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.az;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TEAvcEncoder {
    private static int CODEC_TYPE_AVC = 0;
    private static int CODEC_TYPE_BYTEVC1 = 1;
    private static boolean DEBUG = false;
    private static int ENCODE_RESOLUTION_ALIGN = 16;
    private static int MAX_FRAME_RATE = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    private static long MAX_PRODUCT_OF_SIZE_AND_FPS = -1;
    private static int MIN_FRAME_RATE = 7;
    private static final String TAG = TEAvcEncoder.class.getSimpleName();
    private static int avcqueuesize = 25;
    private static int file_count = 0;
    public ArrayBlockingQueue<a> AVCQueue = new ArrayBlockingQueue<>(avcqueuesize);
    private final int ENCODE_COUNT_DEFAULT = 10;
    private String VIDEO_MIME_TYPE = "video/avc";
    public byte[] configByte = null;
    private int configWaitingFrameCounter = 0;
    private boolean isEnableHwEncoderOpt = false;
    private int mBufferIndex = -1;
    public ByteBuffer mByteBuf = null;
    int mEncodeBufferCount = 10;
    private boolean mEndOfStream = false;
    private boolean mFirstFrame = true;
    private long mFirstFrameTimestamp = Long.MIN_VALUE;
    private TEMediaCodecDecoder m_MediaCodecDecInstance = null;
    private Queue<Long> m_PTSQueue = new LinkedList();
    private double m_TransitionKeyframeRatio = 1.0d;
    private boolean m_bByteVC110BitHWDecoder = false;
    private int m_bColorRangeFull = 0;
    private boolean m_bEncodeOESTexture = false;
    private boolean m_bEncoderBanExtraDataLoop = false;
    private boolean m_bEncoderGLContextReuse = false;
    private boolean m_bNeedSingalEnd = false;
    private boolean m_bSignalEndOfStream = false;
    private boolean m_bSuccessInit = false;
    private int m_bitRate = 0;
    private MediaFormat m_codecFormat = null;
    private int m_codec_type = 0;
    private int m_colorFormat = 0;
    private int m_colorTrc = 0;
    private int m_colorspace = 0;
    private int m_configStatus = 0;
    private double m_dHpBitrateRatio = 0.75d;
    private c m_eglStateSaver;
    private long m_encodeStartTime = -1;
    private int m_frameRate = 0;
    private long m_getnerateIndex = 0;
    private int m_height = 0;
    private int m_height_align = 0;
    private int m_iFrameInternal = 0;
    private boolean m_isNeedReconfigure = false;
    private a m_lastCodecData = null;
    private int m_level = 0;
    private int m_maxBitRate = 0;
    private MediaCodec m_mediaCodec = null;
    private String m_mime_type = this.VIDEO_MIME_TYPE;
    private int m_profile = 0;
    private e m_sharedContext;
    private Surface m_surface = null;
    private h m_textureDrawer;
    private i m_textureOESDrawer = null;
    private boolean m_useInputSurface = true;
    private int m_width = 0;
    private int m_width_align = 0;
    private byte[] pps;
    private byte[] sps;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f61110a;

        /* renamed from: b  reason: collision with root package name */
        public long f61111b;

        /* renamed from: c  reason: collision with root package name */
        public long f61112c;

        /* renamed from: d  reason: collision with root package name */
        public int f61113d;

        static {
            Covode.recordClassIndex(37632);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public long f61114a;

        static {
            Covode.recordClassIndex(37633);
        }
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    public byte[] getExtraData() {
        byte[] bArr = this.configByte;
        if (bArr != null) {
            return bArr;
        }
        return new byte[0];
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            c cVar = new c();
            this.m_eglStateSaver = cVar;
            cVar.a();
        }
    }

    public void releaseTextureDrawer() {
        if (this.m_bEncodeOESTexture) {
            i iVar = this.m_textureOESDrawer;
            if (iVar != null) {
                iVar.a();
                this.m_textureOESDrawer = null;
                return;
            }
            return;
        }
        h hVar = this.m_textureDrawer;
        if (hVar != null) {
            hVar.b();
            this.m_textureDrawer = null;
        }
    }

    static {
        Covode.recordClassIndex(37631);
    }

    private int forceToPrepareKeyFrame() {
        this.m_mediaCodec.signalEndOfInputStream();
        int i2 = 30;
        while (!this.mEndOfStream) {
            int drainOutputBuffer = drainOutputBuffer(10000);
            if (drainOutputBuffer == 0) {
                if (this.mBufferIndex < 0) {
                    i2--;
                    if (i2 <= 0) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                an.d(TAG, "forceToPrepareKeyFrame failed ret: ".concat(String.valueOf(drainOutputBuffer)));
                return drainOutputBuffer;
            }
        }
        restartEncoder();
        return 0;
    }

    public ByteBuffer getFrameCacheBuf() {
        if (this.mByteBuf == null) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.m_width * this.m_height * 4);
            this.mByteBuf = allocateDirect;
            allocateDirect.order(ByteOrder.nativeOrder());
        }
        this.mByteBuf.position(0);
        return this.mByteBuf;
    }

    public int restartEncoder() {
        an.a(TAG, "restartEncoder...");
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int configEncode = configEncode();
        if (configEncode >= 0) {
            return startEncoder();
        }
        if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            c.b(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
        }
        return configEncode;
    }

    public void stopEncoder() {
        try {
            this.m_bByteVC110BitHWDecoder = false;
            e eVar = this.m_sharedContext;
            if (eVar != null) {
                eVar.b();
            }
            h hVar = this.m_textureDrawer;
            if (hVar != null) {
                hVar.b();
                this.m_textureDrawer = null;
            }
            i iVar = this.m_textureOESDrawer;
            if (iVar != null) {
                iVar.a();
                this.m_textureOESDrawer = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public boolean initTextureDrawer() {
        i iVar = null;
        if (this.m_bEncodeOESTexture) {
            i iVar2 = new i();
            iVar2.f61089e = i.a(i.f61085a);
            iVar2.f61090f = i.a(i.f61086b);
            iVar2.f61087c = new d();
            if (!iVar2.f61087c.a("attribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nuniform mat4 uMVPMatrix;\nvarying vec2 vTextureCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * aPosition;\n   vTextureCoord = aTextureCoord;\n}", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uTextureSampler;\nvarying vec2 vTextureCoord;\nvoid main() \n{\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n}")) {
                iVar2.f61087c.a();
                iVar2.f61087c = null;
                an.d("TETextureOESDrawer", "TETextureOESDrawer create failed!");
                iVar2.a();
            } else {
                GLES20.glUseProgram(iVar2.f61087c.f61060a);
                iVar2.f61091g = iVar2.f61087c.a("uMVPMatrix");
                iVar2.f61088d = new int[2];
                GLES20.glGenBuffers(2, iVar2.f61088d, 0);
                iVar2.f61087c.a("aPosition", 0);
                GLES20.glBindBuffer(34962, iVar2.f61088d[0]);
                iVar2.f61089e.position(0);
                GLES20.glBufferData(34962, 32, iVar2.f61089e, 35044);
                iVar2.f61087c.a("aTextureCoord", 1);
                GLES20.glBindBuffer(34962, iVar2.f61088d[1]);
                iVar2.f61090f.position(0);
                GLES20.glBufferData(34962, 32, iVar2.f61090f, 35048);
                iVar2.a(0, false, 0, 0, 0, 0);
                an.a("TETextureOESDrawer", "init: success.");
                iVar = iVar2;
            }
            this.m_textureOESDrawer = iVar;
            if (iVar == null) {
                return false;
            }
            return true;
        }
        h hVar = this.m_textureDrawer;
        if (hVar != null) {
            hVar.b();
            this.m_textureDrawer = null;
        }
        h a2 = h.a();
        this.m_textureDrawer = a2;
        if (a2 == null) {
            return false;
        }
        a2.c();
        this.m_textureDrawer.a(-1.0f);
        return true;
    }

    public void releaseEncoder() {
        long j2;
        boolean z;
        if (this.configByte == null) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        com.ss.android.ttve.monitor.h.a(0, "te_record_is_stop_before_extra_data", j2);
        String str = TAG;
        StringBuilder sb = new StringBuilder("TE_RECORD_IS_STOP_BEFORE_EXTRA_DATA: ");
        if (this.configByte == null) {
            z = true;
        } else {
            z = false;
        }
        an.a(str, sb.append(z).toString());
        stopEncoder();
        an.a("TEAvcEncoder", "releaseEncoder");
        e eVar = this.m_sharedContext;
        if (eVar != null) {
            if (!this.m_bEncoderGLContextReuse) {
                eVar.a();
            } else if (!(eVar.f61072g == null || eVar.f61073h == null)) {
                EGL14.eglDestroySurface(eVar.f61072g, eVar.f61073h);
            }
            this.m_sharedContext = null;
        }
        if (this.m_surface != null) {
            an.b("TEAvcEncoder", "release surface");
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            an.b("TEAvcEncoder", "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
            if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                c.b(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode());
            }
        }
    }

    private int configEncode() {
        try {
            Surface surface = this.m_surface;
            if (surface != null) {
                surface.release();
                this.m_surface = null;
            }
            MediaCodec mediaCodec = this.m_mediaCodec;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
                c.f61141a = true;
                if (!c.a(this.m_width_align * this.m_height_align * this.m_frameRate, hashCode())) {
                    an.c(TAG, "ERROR_HW_OVERLOAD, MaxCodecBlocksSize is: " + c.a() + ", UsedCodecBlocksSize is: " + c.b());
                    return -1;
                }
            }
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(this.m_mime_type);
            this.m_mediaCodec = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            String[] supportedTypes = codecInfo.getSupportedTypes();
            String str = TAG;
            an.b(str, "configEncode supports " + Arrays.toString(supportedTypes));
            an.a(str, "configEncode caps " + Arrays.toString(codecInfo.getCapabilitiesForType(supportedTypes[0]).colorFormats));
            if (codecInfo.getName().startsWith("OMX.google.")) {
                an.c(str, an.a(str, "TEAvcEncoder mediaCodecInfo Name() startsWith OMX.google.", new an.a[0]));
                return -2;
            } else if (reconfigureMediaFormat(codecInfo) != 0) {
                an.c(str, an.a(str, "TEAvcEncoder reconfigureMediaFormat failed", new an.a[0]));
                return -3;
            } else {
                this.m_mediaCodec.configure(this.m_codecFormat, (Surface) null, (MediaCrypto) null, 1);
                if (this.m_useInputSurface) {
                    an.d(str, "m_mediaCodec.createInputSurface()");
                    this.m_surface = this.m_mediaCodec.createInputSurface();
                }
                return 0;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            String str2 = TAG;
            an.c(str2, an.a(str2, "TEAvcEncoder configEncode Exception", new an.a[0]));
            return -4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01e9 A[Catch:{ Exception -> 0x0208 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int startEncoder() {
        /*
        // Method dump skipped, instructions count: 526
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.startEncoder():int");
    }

    private void setByteVC110BitHWDecoderFlag(boolean z) {
        this.m_bByteVC110BitHWDecoder = z;
    }

    public static void setEncodeResolutionAlign(int i2) {
        if (Build.VERSION.SDK_INT >= 24) {
            ENCODE_RESOLUTION_ALIGN = i2;
        }
    }

    private void setMediaCodecDecInstance(Object obj) {
        TEMediaCodecDecoder tEMediaCodecDecoder = (TEMediaCodecDecoder) obj;
        this.m_MediaCodecDecInstance = tEMediaCodecDecoder;
        if (tEMediaCodecDecoder == null) {
            an.d(TAG, "m_MediaCodecDecInstance is null");
        }
    }

    private void setProcessFlag(int i2) {
        boolean z = true;
        if ((i2 & 1) == 0) {
            z = false;
        }
        this.m_bEncodeOESTexture = z;
    }

    public byte[] getCodecData(int i2) {
        a aVar = this.m_lastCodecData;
        if (aVar != null) {
            return aVar.f61110a;
        }
        return null;
    }

    private ByteBuffer getInputBufferByIdx(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getInputBuffer(i2);
        }
        return this.m_mediaCodec.getInputBuffers()[i2];
    }

    private ByteBuffer getOutputBufferByIdx(int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getOutputBuffer(i2);
        }
        return this.m_mediaCodec.getOutputBuffers()[i2];
    }

    public static void setEncodeParams(b bVar) {
        an.a(TAG, "setEncodeParams " + bVar.f61114a);
        MAX_PRODUCT_OF_SIZE_AND_FPS = bVar.f61114a;
    }

    public static boolean com_ss_android_ttve_mediacodec_TEAvcEncoder_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
        MethodCollector.i(9128);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(9128);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9128);
        return delete;
    }

    private void setBitRateMode(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
            MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
            int i2 = 0;
            do {
                an.b(TAG, strArr[i2] + ": " + encoderCapabilities.isBitrateModeSupported(i2));
                i2++;
            } while (i2 < 3);
            this.m_codecFormat.setInteger("bitrate-mode", 1);
        }
    }

    private int drainOutputBuffer(long j2) {
        int i2;
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        String str = TAG;
        an.b(str, "drainOutputBuffer before dequeueOutputBuffer");
        this.mBufferIndex = -1;
        try {
            int dequeueOutputBuffer = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
            this.mBufferIndex = dequeueOutputBuffer;
            if (this.configByte == null && dequeueOutputBuffer == -1) {
                an.c(str, "configByte = null and mBufferIndex = MediaCodec.INFO_TRY_AGAIN_LATER, timeoutUs: ".concat(String.valueOf(j2)));
            }
            an.b(str, "drainOutputBuffer mBufferIndex " + this.mBufferIndex + " buffer-flag= " + bufferInfo.flags);
            while (true) {
                int i3 = this.mBufferIndex;
                if (i3 < 0) {
                    break;
                }
                ByteBuffer outputBufferByIdx = getOutputBufferByIdx(i3);
                int i4 = bufferInfo.size;
                byte[] bArr = new byte[i4];
                outputBufferByIdx.position(bufferInfo.offset);
                outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                outputBufferByIdx.get(bArr);
                if (bufferInfo.flags == 2) {
                    this.configByte = bArr;
                } else if (bufferInfo.flags == 1) {
                    byte[] bArr2 = this.configByte;
                    if (bArr2 == null) {
                        an.d(TAG, "I can't find configByte!!!! NEED extract from I frame!!!");
                    } else if (bArr[4] == bArr2[4] && (bArr[bArr2.length + 4] & 31) == 5) {
                        int length = i4 - bArr2.length;
                        byte[] bArr3 = new byte[length];
                        System.arraycopy(bArr, bArr2.length, bArr3, 0, length);
                        bArr = bArr3;
                    }
                    addOutputData(bArr, bufferInfo);
                } else if (bufferInfo.flags == 4) {
                    this.mEndOfStream = true;
                    an.a(TAG, "bufferInfo.flags contain BUFFER_FLAG_END_OF_STREAM");
                    break;
                } else {
                    addOutputData(bArr, bufferInfo);
                }
                try {
                    this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                    this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
                } catch (Exception e2) {
                    StringWriter stringWriter = new StringWriter();
                    e2.printStackTrace(new PrintWriter(stringWriter));
                    String str2 = TAG;
                    an.d(str2, an.a(str2, "drainOutputBuffer exception:" + stringWriter.toString(), new an.a[0]));
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                if (byteBuffer != null) {
                    byte[] bArr4 = (byte[]) byteBuffer.array().clone();
                    this.sps = bArr4;
                    i2 = bArr4.length + 0;
                } else {
                    i2 = 0;
                }
                if (byteBuffer2 != null) {
                    byte[] bArr5 = (byte[]) byteBuffer2.array().clone();
                    this.pps = bArr5;
                    i2 += bArr5.length;
                }
                byte[] bArr6 = new byte[i2];
                this.configByte = bArr6;
                if (byteBuffer != null) {
                    byte[] bArr7 = this.sps;
                    System.arraycopy(bArr7, 0, bArr6, 0, bArr7.length);
                }
                if (byteBuffer2 != null) {
                    byte[] bArr8 = this.pps;
                    System.arraycopy(bArr8, 0, this.configByte, this.sps.length, bArr8.length);
                }
            }
            return 0;
        } catch (Exception e3) {
            StringWriter stringWriter2 = new StringWriter();
            e3.printStackTrace(new PrintWriter(stringWriter2));
            String str3 = TAG;
            an.d(str3, an.a(str3, "drainOutputBuffer exception:" + stringWriter2.toString(), new an.a[0]));
            return -214;
        }
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        an.b(TAG, "CodecNames:");
        for (String str : supportedTypes) {
            an.b(TAG, "Codec: ".concat(String.valueOf(str)));
        }
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.m_mime_type, this.m_width_align, this.m_height_align);
        this.m_codecFormat = createVideoFormat;
        createVideoFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        int i2 = this.m_frameRate;
        long j2 = MAX_PRODUCT_OF_SIZE_AND_FPS;
        if (j2 > 0) {
            long j3 = j2 / ((long) (this.m_width_align * this.m_height_align));
            if (((long) i2) > j3) {
                i2 = (int) j3;
            }
        }
        this.m_codecFormat.setInteger("frame-rate", i2);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        String str2 = TAG;
        an.c(str2, " m_colorspace " + this.m_colorspace + " m_bColorRangeFull " + this.m_bColorRangeFull + " m_colorTrc " + this.m_colorTrc);
        u.d a2 = u.a().a("ve_color_space_for_2020");
        if ((a2 != null && a2.f151496b != null && (a2.f151496b instanceof Boolean) && ((Boolean) a2.f151496b).booleanValue()) || !this.m_useInputSurface) {
            this.m_codecFormat.setInteger("color-standard", this.m_colorspace);
            this.m_codecFormat.setInteger("color-range", this.m_bColorRangeFull);
            this.m_codecFormat.setInteger("color-transfer", this.m_colorTrc);
        }
        setProfile(mediaCodecInfo.getCapabilitiesForType(this.m_mime_type));
        an.c(str2, com.a.a("width:[%d] height:[%d] frameRate:[%d] iFrameInternal:[%d] bitRate:[%d] colorFormat:[%d] codec_type:[%d]", new Object[]{Integer.valueOf(this.m_width_align), Integer.valueOf(this.m_height_align), Integer.valueOf(this.m_frameRate), Integer.valueOf(this.m_iFrameInternal), Integer.valueOf(this.m_bitRate), Integer.valueOf(this.m_colorFormat), Integer.valueOf(this.m_codec_type)}));
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015d A[ADDED_TO_REGION, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setProfile(android.media.MediaCodecInfo.CodecCapabilities r20) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.mediacodec.TEAvcEncoder.setProfile(android.media.MediaCodecInfo$CodecCapabilities):void");
    }

    public int getInfoByFlag(long[] jArr, int i2) {
        if (i2 != 1) {
            return -1;
        }
        jArr[0] = this.m_lastCodecData.f61111b;
        jArr[1] = this.m_lastCodecData.f61112c;
        return 4;
    }

    private void addOutputData(byte[] bArr, MediaCodec.BufferInfo bufferInfo) {
        long j2;
        String str = TAG;
        an.b(str, "encode: pts queue size = " + this.m_PTSQueue.size() + " avc sdata size= " + this.AVCQueue.size());
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            an.c(str, "encode: no available pts!!! profile " + this.m_profile);
        } else if (this.m_PTSQueue.size() <= 0) {
            an.c(str, "encode: no available pts!!!");
        } else {
            long longValue = this.m_PTSQueue.poll().longValue();
            long j3 = 0;
            if (bufferInfo.presentationTimeUs > 0) {
                j3 = bufferInfo.presentationTimeUs;
            }
            if (this.m_profile >= 8) {
                j2 = longValue - 200000;
            } else {
                j2 = j3;
            }
            an.b(str, "dts = " + j2 + ", pts = " + j3 + " add codecdata-encode AVCQueue-size= " + this.AVCQueue.size());
            a aVar = new a();
            aVar.f61110a = bArr;
            aVar.f61111b = j3;
            aVar.f61112c = j2;
            aVar.f61113d = bufferInfo.flags;
            try {
                this.AVCQueue.add(aVar);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static Bitmap convertTexToBitmap(int i2, int i3, int i4) {
        MethodCollector.i(9123);
        ByteBuffer readTextureToByteBuffer = readTextureToByteBuffer(i2, i3, i4);
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(readTextureToByteBuffer);
        MethodCollector.o(9123);
        return createBitmap;
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

    public void encoderYUV420(byte[] bArr, int i2, long j2) {
        int i3 = i2;
        this.mEncodeBufferCount = 10;
        while (true) {
            try {
                if (this.mEncodeBufferCount <= 0) {
                    break;
                }
                int dequeueInputBuffer = this.m_mediaCodec.dequeueInputBuffer(-1);
                this.mEncodeBufferCount--;
                if (dequeueInputBuffer >= 0) {
                    ByteBuffer inputBufferByIdx = getInputBufferByIdx(dequeueInputBuffer);
                    inputBufferByIdx.clear();
                    an.b(TAG, "inputBuffer ".concat(String.valueOf(inputBufferByIdx)));
                    if (i3 > inputBufferByIdx.capacity()) {
                        i3 = inputBufferByIdx.capacity();
                    }
                    inputBufferByIdx.put(bArr, 4, i3);
                    this.m_mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i3, j2, 0);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        drainOutputBuffer(0);
    }

    public static boolean saveFrameToFile(int i2, int i3, int i4, long j2) {
        MethodCollector.i(9126);
        Bitmap convertTexToBitmap = convertTexToBitmap(i2, i3, i4);
        file_count++;
        File file = new File("sdcard/dump/" + file_count + "_" + j2 + ".jpg");
        if (file.exists()) {
            com_ss_android_ttve_mediacodec_TEAvcEncoder_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            convertTexToBitmap.compress(Bitmap.CompressFormat.JPEG, 20, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.o(9126);
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.o(9126);
            return false;
        } catch (Throwable th) {
            if (!convertTexToBitmap.isRecycled()) {
                convertTexToBitmap.recycle();
            }
            MethodCollector.o(9126);
            throw th;
        }
    }

    public int encodeVideoFromBuffer(int i2, long j2, boolean z, boolean z2) {
        if (!this.m_bSuccessInit) {
            return 0;
        }
        this.m_PTSQueue.offer(Long.valueOf(j2));
        if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
            if (this.m_mediaCodec == null || this.m_configStatus != 1) {
                restartEncoder();
            } else {
                int i3 = Build.VERSION.SDK_INT;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", this.m_bitRate);
                this.m_mediaCodec.setParameters(bundle);
                this.m_configStatus = 0;
            }
            this.m_isNeedReconfigure = false;
        }
        int i4 = Build.VERSION.SDK_INT;
        if (z2 && VERuntime.a.INSTANCE.veRuntime.f151401f) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("request-sync", 0);
            double d2 = (double) this.m_bitRate;
            double d3 = this.m_TransitionKeyframeRatio;
            Double.isNaN(d2);
            bundle2.putInt("video-bitrate", (int) (d2 * d3));
            this.m_mediaCodec.setParameters(bundle2);
        }
        if (this.m_encodeStartTime == -1) {
            this.m_encodeStartTime = System.nanoTime();
        }
        String str = TAG;
        an.b(str, "drainOutputBuffer 1111 ");
        long j3 = 0;
        int drainOutputBuffer = drainOutputBuffer(0);
        if (drainOutputBuffer != 0) {
            return drainOutputBuffer;
        }
        an.b(str, "drainOutputBuffer 1111 size= ".concat(String.valueOf(i2)));
        if (this.mByteBuf.capacity() > 0 && !this.m_bSignalEndOfStream) {
            encoderYUV420(this.mByteBuf.array(), i2, j2);
        } else if (this.m_mediaCodec != null && !this.m_bSignalEndOfStream && this.m_bNeedSingalEnd) {
            try {
                an.a(str, "m_mediaCodec.flush()");
                this.m_bSignalEndOfStream = true;
                this.mEndOfStream = false;
                this.m_mediaCodec.signalEndOfInputStream();
            } catch (Exception e2) {
                e2.printStackTrace();
                return -213;
            }
        }
        if (this.m_bSignalEndOfStream) {
            int i5 = 30;
            while (!this.mEndOfStream) {
                an.b(TAG, "drainOutputBuffer 44444 ");
                int drainOutputBuffer2 = drainOutputBuffer(10000);
                if (drainOutputBuffer2 == 0) {
                    if (this.mBufferIndex < 0) {
                        i5--;
                        if (i5 <= 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    return drainOutputBuffer2;
                }
            }
        } else {
            an.b(str, "drainOutputBuffer 55555 ");
            if (this.AVCQueue.size() <= 0) {
                j3 = 10000;
            }
            int drainOutputBuffer3 = drainOutputBuffer(j3);
            if (drainOutputBuffer3 != 0) {
                return drainOutputBuffer3;
            }
        }
        a poll = this.AVCQueue.poll();
        this.m_lastCodecData = poll;
        if (poll != null) {
            return poll.f61110a.length;
        }
        return 0;
    }

    public int encodeVideoFromTexture(int i2, long j2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i3;
        int i4;
        int i5;
        String str;
        boolean z5;
        TEMediaCodecDecoder tEMediaCodecDecoder;
        MethodCollector.i(9323);
        int i6 = 0;
        if (!this.m_bSuccessInit) {
            MethodCollector.o(9323);
            return 0;
        } else if (az.f151043g == az.a.VIDEO_ENC_ENCODING_FALLBACK.getValue()) {
            an.d(TAG, "TESTING! HW VIDEO ENC ENCODING FALLBACK");
            MethodCollector.o(9323);
            return -211;
        } else {
            if (Long.MIN_VALUE == this.mFirstFrameTimestamp) {
                this.mFirstFrameTimestamp = System.currentTimeMillis();
            }
            this.m_PTSQueue.offer(Long.valueOf(j2));
            if (this.m_eglStateSaver == null) {
                c cVar = new c();
                this.m_eglStateSaver = cVar;
                cVar.a();
            }
            if (this.m_isNeedReconfigure && this.isEnableHwEncoderOpt) {
                startEncoder();
            }
            if (this.m_isNeedReconfigure || (this.m_configStatus & 4) != 0) {
                if (this.m_mediaCodec != null && this.m_configStatus == 1) {
                    int i7 = Build.VERSION.SDK_INT;
                    Bundle bundle = new Bundle();
                    bundle.putInt("video-bitrate", this.m_bitRate);
                    this.m_mediaCodec.setParameters(bundle);
                    this.m_configStatus = 0;
                } else if (!this.m_bEncoderBanExtraDataLoop) {
                    restartEncoder();
                }
                this.m_isNeedReconfigure = false;
            }
            int drainOutputBuffer = drainOutputBuffer(0);
            if (drainOutputBuffer != 0) {
                MethodCollector.o(9323);
                return drainOutputBuffer;
            }
            u.d a2 = u.a().a("ve_smart_trans_detect");
            if (a2 == null || a2.f151496b == null) {
                z4 = false;
            } else {
                z4 = ((Boolean) a2.f151496b).booleanValue();
            }
            int i8 = Build.VERSION.SDK_INT;
            if (z2 && (VERuntime.a.INSTANCE.veRuntime.f151401f || z4)) {
                an.a(TAG, "encodeVideoFromTexture:: pts = " + j2 + " keyframe isKeyFrame= " + z2 + " bp_ratio " + this.m_TransitionKeyframeRatio);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("request-sync", 0);
                double d2 = (double) this.m_bitRate;
                double d3 = this.m_TransitionKeyframeRatio;
                Double.isNaN(d2);
                bundle2.putInt("video-bitrate", (int) (d2 * d3));
                this.m_mediaCodec.setParameters(bundle2);
            }
            if (z3) {
                an.a(TAG, "isForceIFrame pts = " + j2 + " keyframe isKeyFrame= " + z2 + " bp_ratio " + this.m_TransitionKeyframeRatio);
                forceToPrepareKeyFrame();
            }
            if (this.m_encodeStartTime == -1) {
                this.m_encodeStartTime = System.nanoTime();
            }
            int i9 = i2 & -1;
            if (i9 != 0) {
                try {
                    if (!(this.m_textureDrawer == null && this.m_textureOESDrawer == null)) {
                        if (!az.a() || !EGL14.eglGetCurrentContext().equals(this.m_sharedContext.f61070e)) {
                            this.m_sharedContext.b();
                        }
                        GLES20.glViewport(0, 0, this.m_width, this.m_height);
                        if (this.m_bEncodeOESTexture) {
                            this.m_textureOESDrawer.a(this.m_MediaCodecDecInstance.getRenderParam().f61128a);
                            this.m_textureOESDrawer.a(-this.m_MediaCodecDecInstance.getRenderParam().f61129b, true, this.m_MediaCodecDecInstance.getRenderParam().f61130c, this.m_MediaCodecDecInstance.getRenderParam().f61131d, this.m_width_align, this.m_height_align);
                            this.m_textureOESDrawer.a(i9);
                        } else {
                            this.m_textureDrawer.a(i9);
                        }
                        if (this.mFirstFrame) {
                            if (DEBUG) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(3686400);
                                allocateDirect.order(ByteOrder.nativeOrder());
                                allocateDirect.position(0);
                                GLES20.glReadPixels(0, 0, 1280, 720, 6408, 5121, allocateDirect);
                            }
                            this.mFirstFrame = false;
                        }
                        long j3 = j2 * 1000;
                        this.m_sharedContext.a(j3);
                        this.m_sharedContext.c();
                        this.m_bNeedSingalEnd = true;
                        if (!(this.configByte == null || (tEMediaCodecDecoder = this.m_MediaCodecDecInstance) == null)) {
                            tEMediaCodecDecoder.signalReEncodeOptCV();
                        }
                        int drainOutputBuffer2 = drainOutputBuffer(0);
                        if (drainOutputBuffer2 != 0) {
                            return drainOutputBuffer2;
                        }
                        boolean z6 = this.isEnableHwEncoderOpt;
                        if (z6 && this.configByte == null) {
                            int i10 = this.configWaitingFrameCounter + 1;
                            this.configWaitingFrameCounter = i10;
                            if (i10 >= 25) {
                                this.configWaitingFrameCounter = 0;
                                an.d(TAG, "get config fail, back to soft encode");
                                MethodCollector.o(9323);
                                return -211;
                            }
                        }
                        if (this.configByte == null && !this.m_bEncoderBanExtraDataLoop && !z6) {
                            int i11 = 0;
                            while (true) {
                                str = TAG;
                                an.b(str, "Encoder first frame, count = ".concat(String.valueOf(i11)));
                                GLES20.glViewport(i6, i6, this.m_width, this.m_height);
                                if (this.m_bEncodeOESTexture) {
                                    this.m_textureOESDrawer.a(this.m_MediaCodecDecInstance.getRenderParam().f61128a);
                                    this.m_textureOESDrawer.a(-this.m_MediaCodecDecInstance.getRenderParam().f61129b, true, this.m_MediaCodecDecInstance.getRenderParam().f61130c, this.m_MediaCodecDecInstance.getRenderParam().f61131d, this.m_width_align, this.m_height_align);
                                    this.m_textureOESDrawer.a(i9);
                                } else {
                                    this.m_textureDrawer.a(i9);
                                }
                                this.m_sharedContext.a(j3);
                                GLES20.glFinish();
                                this.m_sharedContext.c();
                                int drainOutputBuffer3 = drainOutputBuffer(0);
                                if (drainOutputBuffer3 == 0) {
                                    i11++;
                                    if (i11 > 30) {
                                        break;
                                    }
                                    Thread.sleep(10, 0);
                                    if (this.configByte != null) {
                                        break;
                                    }
                                    i6 = 0;
                                } else {
                                    MethodCollector.o(9323);
                                    return drainOutputBuffer3;
                                }
                            }
                            if (this.configByte == null) {
                                an.a[] aVarArr = new an.a[7];
                                aVarArr[0] = new an.a("AVCQueue count", Integer.valueOf(this.AVCQueue.size()), "");
                                aVarArr[1] = new an.a("textureID", Integer.valueOf(i9), "");
                                aVarArr[2] = new an.a("isTexture", Boolean.valueOf(GLES20.glIsTexture(i2)), "");
                                aVarArr[3] = new an.a("timestampUs", Long.valueOf(j2), "");
                                aVarArr[4] = new an.a("glCheckError", Integer.valueOf(GLES20.glGetError()), "");
                                aVarArr[5] = new an.a("m_bEncoderGLContextReuse", Boolean.valueOf(this.m_bEncoderGLContextReuse), "");
                                if (this.m_sharedContext.f61070e != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                aVarArr[6] = new an.a("currentContext", Boolean.valueOf(z5), "");
                                an.d(str, an.a(str, "TEAvcEncoder Generate configData failed!!!", aVarArr));
                                MethodCollector.o(9323);
                                return -211;
                            }
                            an.a(str, "Generate configData succeed!!!".concat(String.valueOf(i11)));
                            this.AVCQueue.clear();
                            restartEncoder();
                            this.m_getnerateIndex = 0;
                            this.m_sharedContext.b();
                            GLES20.glViewport(0, 0, this.m_width, this.m_height);
                            if (this.m_bEncodeOESTexture) {
                                this.m_textureOESDrawer.a(this.m_MediaCodecDecInstance.getRenderParam().f61128a);
                                this.m_textureOESDrawer.a(-this.m_MediaCodecDecInstance.getRenderParam().f61129b, true, this.m_MediaCodecDecInstance.getRenderParam().f61130c, this.m_MediaCodecDecInstance.getRenderParam().f61131d, this.m_width_align, this.m_height_align);
                                this.m_textureOESDrawer.a(i9);
                            } else {
                                this.m_textureDrawer.a(i9);
                            }
                            this.m_sharedContext.a(j3);
                            GLES20.glFinish();
                            this.m_sharedContext.c();
                            TEMediaCodecDecoder tEMediaCodecDecoder2 = this.m_MediaCodecDecInstance;
                            if (tEMediaCodecDecoder2 != null) {
                                tEMediaCodecDecoder2.signalReEncodeOptCV();
                            }
                            long j4 = this.mFirstFrameTimestamp;
                            if (j4 > 0 && j4 != Long.MAX_VALUE) {
                                long currentTimeMillis = System.currentTimeMillis() - this.mFirstFrameTimestamp;
                                this.mFirstFrameTimestamp = Long.MAX_VALUE;
                                com.ss.android.ttve.monitor.h.a(0, "te_record_generate_extra_data_cost", currentTimeMillis);
                                an.a(str, "TE_RECORD_GEN_EXTRA_DATA_COST: ".concat(String.valueOf(currentTimeMillis)));
                            }
                        }
                        if (((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) true)).booleanValue() && this.m_getnerateIndex == 0) {
                            c.f61141a = false;
                        }
                    }
                    this.m_getnerateIndex++;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return -211;
                } finally {
                    MethodCollector.o(9323);
                }
            } else if (this.m_mediaCodec != null && !this.m_bSignalEndOfStream && this.m_bNeedSingalEnd) {
                try {
                    an.a(TAG, "m_mediaCodec.flush()");
                    this.m_bSignalEndOfStream = true;
                    this.mEndOfStream = false;
                    this.m_mediaCodec.signalEndOfInputStream();
                } catch (Exception e3) {
                    e3.printStackTrace();
                    MethodCollector.o(9323);
                    return -213;
                }
            }
            if (!az.a()) {
                c cVar2 = this.m_eglStateSaver;
                EGL14.eglMakeCurrent(cVar2.f61059d, cVar2.f61057b, cVar2.f61058c, cVar2.f61056a);
            }
            if (this.m_bSignalEndOfStream) {
                int i12 = 30;
                while (!this.mEndOfStream) {
                    int drainOutputBuffer4 = drainOutputBuffer(10000);
                    if (drainOutputBuffer4 == 0) {
                        if (this.mBufferIndex < 0) {
                            i12--;
                            if (i12 <= 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        MethodCollector.o(9323);
                        return drainOutputBuffer4;
                    }
                }
            } else {
                u.d a3 = u.a().a("byteVC1_10bit_hardware_encoder_timeout");
                if (a3 == null || a3.f151496b == null || !this.m_bByteVC110BitHWDecoder || (i5 = ((Integer) a3.f151496b).intValue()) <= 0) {
                    i5 = 0;
                }
                int drainOutputBuffer5 = drainOutputBuffer((long) i5);
                if (drainOutputBuffer5 != 0) {
                    MethodCollector.o(9323);
                    return drainOutputBuffer5;
                } else if (this.m_bEncoderBanExtraDataLoop || this.isEnableHwEncoderOpt) {
                    if (this.configByte == null) {
                        an.b(TAG, "Skip extra data looper.");
                        MethodCollector.o(9323);
                        return 0;
                    }
                    long j5 = this.mFirstFrameTimestamp;
                    if (j5 > 0 && j5 != Long.MAX_VALUE) {
                        long currentTimeMillis2 = System.currentTimeMillis() - this.mFirstFrameTimestamp;
                        this.mFirstFrameTimestamp = Long.MAX_VALUE;
                        com.ss.android.ttve.monitor.h.a(0, "te_record_generate_extra_data_cost", currentTimeMillis2);
                        String str2 = TAG;
                        an.a(str2, "TE_RECORD_GEN_EXTRA_DATA_COST: ".concat(String.valueOf(currentTimeMillis2)));
                        int size = this.AVCQueue.size();
                        com.ss.android.ttve.monitor.h.a(0, "te_record_packet_count_before_extra_data", (long) size);
                        an.a(str2, "TE_RECORD_PACKET_COUNT_BEFORE_EXTRA_DATA: ".concat(String.valueOf(size)));
                    }
                }
            }
            a poll = this.AVCQueue.poll();
            this.m_lastCodecData = poll;
            if (poll != null) {
                i4 = poll.f61110a.length;
                i3 = 9323;
            } else {
                i3 = 9323;
                i4 = 0;
            }
            MethodCollector.o(i3);
            return i4;
        }
    }

    private void setEncoder(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d2, int i10, int i11, int i12) {
        this.m_configStatus = 0;
        this.m_codec_type = i2;
        if (i2 == CODEC_TYPE_BYTEVC1) {
            this.m_mime_type = "video/hevc";
        } else {
            this.m_mime_type = this.VIDEO_MIME_TYPE;
        }
        if (i3 > 0) {
            this.m_width = i3;
            this.m_width_align = i3;
        }
        if (i4 > 0) {
            this.m_height = i4;
            this.m_height_align = i4;
        }
        Math.min(this.m_width_align, this.m_height_align);
        if (this.m_useInputSurface) {
            int i13 = this.m_width_align;
            int i14 = ENCODE_RESOLUTION_ALIGN;
            if (i13 % i14 != 0) {
                this.m_width_align = ((i13 / i14) + 1) * i14;
            }
            int i15 = this.m_height_align;
            if (i15 % i14 != 0) {
                this.m_height_align = ((i15 / i14) + 1) * i14;
            }
            an.c(TAG, "Encoder set OutResolution align: " + ENCODE_RESOLUTION_ALIGN + ", dstResolution: " + this.m_width_align + "*" + this.m_height_align + ", srcResolution: " + this.m_width + "*" + this.m_height);
        }
        if (i5 > 0) {
            if (i5 < MIN_FRAME_RATE) {
                an.c(TAG, com.a.a(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", new Object[]{Integer.valueOf(i5), Integer.valueOf(MIN_FRAME_RATE)}));
                i5 = MIN_FRAME_RATE;
            } else if (i5 > MAX_FRAME_RATE) {
                an.c(TAG, com.a.a(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", new Object[]{Integer.valueOf(i5), Integer.valueOf(MAX_FRAME_RATE)}));
                i5 = MAX_FRAME_RATE;
            }
            if (this.m_frameRate != i5) {
                this.m_frameRate = i5;
                if (i5 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i5;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i6 > 0) {
            this.m_maxBitRate = i6;
            if (this.m_bitRate != i6) {
                this.m_bitRate = i6;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i7 >= 0) {
            this.m_iFrameInternal = i7;
        }
        if (i8 > 0) {
            this.m_colorFormat = i8;
        }
        if (this.m_codec_type == CODEC_TYPE_BYTEVC1) {
            this.m_profile = 1;
        } else {
            this.m_profile = androidx.core.b.a.a(i9, 1, 64);
        }
        this.m_dHpBitrateRatio = d2;
        this.m_colorspace = i10;
        this.m_bColorRangeFull = i11;
        this.m_colorTrc = i12;
    }

    public int initEncoder(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, double d2, boolean z, int i10, int i11, int i12, double d3, int i13, int i14, boolean z2, boolean z3) {
        TEAvcEncoder tEAvcEncoder;
        if (i14 > 0) {
            setEncodeResolutionAlign(i14);
        }
        String str = TAG;
        an.a(str, "m_mediaCodec initEncoder == enter transitionRatio ".concat(String.valueOf(d3)));
        if (z) {
            int i15 = Build.VERSION.SDK_INT;
        }
        this.isEnableHwEncoderOpt = ((Boolean) u.a().a("ve_enable_compile_hw_encoder_opt", (Object) false)).booleanValue();
        an.a(str, "isEnableHwEncoderOpt: " + this.isEnableHwEncoderOpt);
        this.m_useInputSurface = z;
        if (z) {
            this.m_colorFormat = 2130708361;
        } else {
            this.m_colorFormat = i6;
        }
        setEncoder(i2, i3, i4, i5, i8, i7, this.m_colorFormat, i9, d2, i10, i11, i12);
        if (d3 <= 0.0d || d3 >= 5.0d) {
            tEAvcEncoder = this;
        } else {
            tEAvcEncoder = this;
            tEAvcEncoder.m_TransitionKeyframeRatio = d3;
        }
        tEAvcEncoder.m_isNeedReconfigure = true;
        tEAvcEncoder.m_bSuccessInit = true;
        tEAvcEncoder.m_bSignalEndOfStream = false;
        tEAvcEncoder.m_bEncoderGLContextReuse = z2;
        tEAvcEncoder.m_bEncoderBanExtraDataLoop = z3;
        an.a(str, "avcencoder glcontext reuse: " + tEAvcEncoder.m_bEncoderGLContextReuse);
        if (i13 == 2) {
            tEAvcEncoder.VIDEO_MIME_TYPE = "video/mp4v-es";
        } else {
            tEAvcEncoder.VIDEO_MIME_TYPE = "video/avc";
        }
        int configEncode = configEncode();
        if (configEncode < 0 && ((Boolean) u.a().a("ve_mediacodec_resource_reasonable_distribute", (Object) false)).booleanValue()) {
            c.b(tEAvcEncoder.m_width_align * tEAvcEncoder.m_height_align * tEAvcEncoder.m_frameRate, hashCode());
        }
        if (tEAvcEncoder.m_bEncoderBanExtraDataLoop && (configEncode = startEncoder()) != 0) {
            an.d(str, "Start encoder failed on encodeVideoFromTexture: ".concat(String.valueOf(configEncode)));
        }
        if (az.f151043g != az.a.VIDEO_ENC_INIT_FALLBACK.getValue()) {
            return configEncode;
        }
        an.d(str, "TESTING! HW VIDEO ENC INIT FALLBACK");
        return -1;
    }
}
