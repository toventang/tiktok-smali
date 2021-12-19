package com.ss.avframework.livestreamv2.filter;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.capture.video.ExternalVideoCapturer;
import com.ss.avframework.capture.video.VideoCapturer;
import com.ss.avframework.codec.DefaultAudioEncoderFactory;
import com.ss.avframework.codec.DefaultVideoEncoderFactory;
import com.ss.avframework.engine.AudioEncoderFactory;
import com.ss.avframework.engine.MediaEncodeStream;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.engine.Transport;
import com.ss.avframework.engine.VideoEncoderFactory;
import com.ss.avframework.engine.VideoTrack;
import com.ss.avframework.opengl.RendererCommon;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.SafeHandlerThread;
import com.ss.avframework.utils.SafeHandlerThreadPoolExecutor;
import com.ss.avframework.utils.TEBundle;
import com.ss.avframework.utils.TimeUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class VideoCatcher implements VideoCapturer.VideoCapturerObserver, MediaEncodeStream.Observer {
    private AudioEncoderFactory mAudioEncoderFactory;
    private String[] mAvailableVideoEncoders;
    public VideoCatcherCallback mCallback;
    private TEBundle mEncodeStreamOpt;
    private int mFps;
    private H264Dumper mH264Dumper;
    public Handler mHandler;
    private int mHeight;
    private MediaEncodeStream mMediaEncodeStream;
    private int mMode;
    public PngShotter mPngShotter;
    private AtomicBoolean mStarted = new AtomicBoolean(false);
    private boolean mUseHardwareEncoder = true;
    private ExternalVideoCapturer mVideoCapturer;
    private VideoEncoderFactory mVideoEncoderFactory;
    private VideoTrack mVideoTrack;
    private int mWidth;

    /* access modifiers changed from: package-private */
    public interface VideoCatcherCallback {
        static {
            Covode.recordClassIndex(100407);
        }

        void onCatchedBuffer(VideoCatcher videoCatcher);

        void onError(int i2, String str);
    }

    static {
        Covode.recordClassIndex(100398);
    }

    private String getSoftEncoderCodec() {
        return "video/x264";
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getMode() {
        return this.mMode;
    }

    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStarted() {
        AVLog.iod("VideoCatcher", "onVideoCapturerStarted");
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerStoped() {
        AVLog.iod("VideoCatcher", "onVideoCapturerStoped");
    }

    public ByteBuffer getPixelBuffer() {
        PngShotter pngShotter = this.mPngShotter;
        if (pngShotter == null) {
            return null;
        }
        return pngShotter.copyBuffer();
    }

    /* access modifiers changed from: package-private */
    public class PngShotter {
        public Bitmap mBitmap;
        private ByteBuffer mBuffer;
        public int mCount;
        public Object mFence;
        public String mPngSaveDir;
        private SafeHandlerThread mShotThread;
        private ByteBuffer mTempBuffer;

        static {
            Covode.recordClassIndex(100403);
        }

        /* access modifiers changed from: package-private */
        public ByteBuffer copyBuffer() {
            this.mBuffer.position(0);
            this.mTempBuffer.rewind();
            this.mTempBuffer.limit(this.mBuffer.capacity());
            this.mTempBuffer.put(this.mBuffer);
            this.mTempBuffer.rewind();
            return this.mTempBuffer;
        }

        public void post(Runnable runnable) {
            SafeHandlerThread safeHandlerThread = this.mShotThread;
            if (safeHandlerThread != null) {
                safeHandlerThread.post(runnable);
            }
        }

        private PngShotter() {
            this.mPngSaveDir = "";
            this.mFence = new Object();
        }

        public void stop(final int i2) {
            Handler handler = VideoCatcher.this.mHandler;
            if (handler != null) {
                handler.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.filter.VideoCatcher.PngShotter.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(100405);
                    }

                    public void run() {
                        if (!(i2 == 0 || TextUtils.isEmpty(PngShotter.this.mPngSaveDir))) {
                            File file = new File(PngShotter.this.mPngSaveDir);
                            if (file.exists() && file.isDirectory()) {
                                for (int i2 = 1; i2 <= PngShotter.this.mCount; i2++) {
                                    try {
                                        File file2 = new File(PngShotter.this.mPngSaveDir + "/" + i2 + ".png");
                                        if (file2.exists() && file2.isFile()) {
                                            com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$2_com_ss_android_ugc_aweme_storage_FileLancet_delete(file2);
                                        }
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                    }
                                }
                            }
                        }
                    }

                    public static boolean com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$2_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
                        MethodCollector.i(8973);
                        try {
                            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                            if (e.a(file.getAbsolutePath(), cVar)) {
                                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                            }
                            if (e.c(file.getAbsolutePath(), cVar)) {
                                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                                MethodCollector.o(8973);
                                return false;
                            }
                        } catch (Throwable unused) {
                        }
                        boolean delete = file.delete();
                        MethodCollector.o(8973);
                        return delete;
                    }
                });
                SafeHandlerThread safeHandlerThread = this.mShotThread;
                if (safeHandlerThread != null) {
                    SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
                    this.mShotThread = null;
                }
                Bitmap bitmap = this.mBitmap;
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        this.mBitmap.recycle();
                        System.gc();
                    }
                    this.mBitmap = null;
                }
                if (this.mBuffer != null) {
                    this.mBuffer = null;
                }
            }
        }

        public void initBitmapBuffer(int i2, int i3) {
            MethodCollector.i(14195);
            Bitmap bitmap = this.mBitmap;
            if (!(bitmap != null && bitmap.getWidth() == i2 && this.mBitmap.getHeight() == i3)) {
                this.mBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            }
            ByteBuffer byteBuffer = this.mBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < i2 * i3 * 4) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
                this.mBuffer = allocateDirect;
                this.mTempBuffer = ByteBuffer.allocateDirect(allocateDirect.capacity());
            }
            ByteBuffer byteBuffer2 = this.mBuffer;
            if (byteBuffer2 != null) {
                byteBuffer2.clear();
            }
            MethodCollector.o(14195);
        }

        /* access modifiers changed from: package-private */
        public boolean readPixels(int i2, int i3) {
            boolean z;
            MethodCollector.i(14256);
            try {
                synchronized (this.mBuffer) {
                    try {
                        VideoCatcher.this.mPngShotter.initBitmapBuffer(i2, i3);
                        GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, this.mBuffer);
                    } catch (Throwable th) {
                        MethodCollector.o(14256);
                        throw th;
                    }
                }
                z = true;
            } catch (Exception e2) {
                e2.printStackTrace();
                int glGetError = GLES20.glGetError();
                if (glGetError != 0) {
                    AVLog.logToIODevice2(6, "VideoCatcher", "glReadPixels error ".concat(String.valueOf(glGetError)), null, "VideoCatcher.PngShotter:onFrame", 10000);
                }
                z = false;
            }
            try {
                synchronized (this.mFence) {
                    try {
                        this.mBitmap.copyPixelsFromBuffer(this.mBuffer);
                    } catch (Throwable th2) {
                        MethodCollector.o(14256);
                        throw th2;
                    }
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            if (TextUtils.isEmpty(this.mPngSaveDir)) {
                MethodCollector.o(14256);
                return z;
            }
            this.mShotThread.post(new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.VideoCatcher.PngShotter.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(100406);
                }

                public void run() {
                    MethodCollector.i(12051);
                    StringBuilder append = new StringBuilder().append(PngShotter.this.mPngSaveDir).append("/");
                    PngShotter pngShotter = PngShotter.this;
                    int i2 = pngShotter.mCount + 1;
                    pngShotter.mCount = i2;
                    try {
                        File file = new File(append.append(i2).append(".png").toString());
                        if (file.exists()) {
                            com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$3_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        synchronized (PngShotter.this.mFence) {
                            try {
                                PngShotter.this.mBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            } catch (Throwable th) {
                                MethodCollector.o(12051);
                                throw th;
                            }
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        MethodCollector.o(12051);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        MethodCollector.o(12051);
                    }
                }

                public static boolean com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$3_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
                    MethodCollector.i(12211);
                    try {
                        e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                        if (e.a(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                        }
                        if (e.c(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                            MethodCollector.o(12211);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.o(12211);
                    return delete;
                }
            });
            MethodCollector.o(14256);
            return z;
        }

        public void start(int i2, int i3, String str) {
            initBitmapBuffer(i2, i3);
            this.mPngSaveDir = str;
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("PngShotThread_".concat(String.valueOf(this)));
            this.mShotThread = lockThread;
            lockThread.start();
            if (!TextUtils.isEmpty(this.mPngSaveDir)) {
                this.mShotThread.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.filter.VideoCatcher.PngShotter.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(100404);
                    }

                    public void run() {
                        try {
                            File file = new File(PngShotter.this.mPngSaveDir);
                            if (file.exists() && file.isFile()) {
                                com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                            }
                            if (!file.exists()) {
                                file.mkdirs();
                            }
                            if (!file.exists()) {
                                throw new Exception(file + " doesn't exist.");
                            } else if (!file.canWrite()) {
                                throw new Exception(file + " is forbidden to write.");
                            }
                        } catch (Exception e2) {
                            if (VideoCatcher.this.mCallback != null) {
                                VideoCatcher.this.mCallback.onError(-5, e2.toString());
                            }
                        }
                    }

                    public static boolean com_ss_avframework_livestreamv2_filter_VideoCatcher$PngShotter$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
                        MethodCollector.i(9176);
                        try {
                            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                            if (e.a(file.getAbsolutePath(), cVar)) {
                                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                            }
                            if (e.c(file.getAbsolutePath(), cVar)) {
                                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                                MethodCollector.o(9176);
                                return false;
                            }
                        } catch (Throwable unused) {
                        }
                        boolean delete = file.delete();
                        MethodCollector.o(9176);
                        return delete;
                    }
                });
            }
        }
    }

    private String chooseVideoEncode() {
        if (this.mAvailableVideoEncoders == null) {
            String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid video encoder");
            }
        }
        String str = null;
        if (this.mUseHardwareEncoder) {
            String[] strArr = this.mAvailableVideoEncoders;
            for (String str2 : strArr) {
                if (str2.contains("video_enable_accelera=true") && str2.contains("video_type=video/avc")) {
                    str = "video/avc";
                }
            }
            if (str != null) {
                return str;
            }
        }
        String softEncoderCodec = getSoftEncoderCodec();
        AVLog.iow("VideoCatcher", a.a("Hardware video encoder not found, use %s instead.", new Object[]{softEncoderCodec}));
        this.mUseHardwareEncoder = false;
        return softEncoderCodec;
    }

    private void setupParameter() {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (this.mEncodeStreamOpt == null) {
                this.mEncodeStreamOpt = mediaEncodeStream.getParameter();
            }
            this.mEncodeStreamOpt.setString("video_type", chooseVideoEncode());
            this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
            this.mEncodeStreamOpt.setInt("video_width", this.mWidth);
            this.mEncodeStreamOpt.setInt("video_height", this.mHeight);
            this.mEncodeStreamOpt.setInt("video_profileLevel", 3);
            this.mEncodeStreamOpt.setInt("video_fps", this.mFps);
            this.mEncodeStreamOpt.setInt("video_gop", this.mFps * 2);
            this.mEncodeStreamOpt.setInt("video_is_cbr", 1);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setBool("video_lossless_encode", true);
            AVLog.iod("VideoCatcher", "Dump all encodeStream config:" + this.mEncodeStreamOpt.toString());
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
    }

    public void onCreateEncoderError() {
        String string = this.mEncodeStreamOpt.getString("video_type");
        if (this.mMediaEncodeStream != null) {
            String string2 = this.mEncodeStreamOpt.getString("video_type");
            int i2 = this.mEncodeStreamOpt.getInt("video_profileLevel");
            if (this.mUseHardwareEncoder) {
                int i3 = 1;
                if (i2 == 1) {
                    this.mUseHardwareEncoder = false;
                    string2 = getSoftEncoderCodec();
                    i3 = 3;
                }
                AVLog.iow("VideoCatcher", "Video encoder switch to " + string2 + ", hardware " + this.mUseHardwareEncoder + ", profile " + i3);
                this.mEncodeStreamOpt.setString("video_type", string2);
                this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mUseHardwareEncoder);
                this.mEncodeStreamOpt.setInt("video_profileLevel", i3);
                this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                return;
            }
            String str = "Video encoder(" + string + ") created failed";
            AVLog.ioe("VideoCatcher", str);
            VideoCatcherCallback videoCatcherCallback = this.mCallback;
            if (videoCatcherCallback != null) {
                videoCatcherCallback.onError(-4, str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class H264Dumper extends Transport {
        public int codeOnQuit;
        public Object mDumpFence;
        private Thread mDumpThread;
        public ConcurrentLinkedQueue<Transport.MediaPacket> mPacketQueue;
        public boolean mRunning;

        static {
            Covode.recordClassIndex(100401);
        }

        @Override // com.ss.avframework.engine.Transport
        public void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        @Override // com.ss.avframework.engine.Transport
        public void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        }

        private H264Dumper() {
            this.mPacketQueue = new ConcurrentLinkedQueue<>();
            this.mDumpFence = new Object();
            this.codeOnQuit = 0;
        }

        @Override // com.ss.avframework.engine.Transport
        public void sendPacket(Transport.MediaPacket mediaPacket) {
            MethodCollector.i(13988);
            this.mPacketQueue.offer(mediaPacket);
            synchronized (this.mDumpFence) {
                try {
                    this.mDumpFence.notify();
                } finally {
                    MethodCollector.o(13988);
                }
            }
        }

        @Override // com.ss.avframework.engine.Transport
        public boolean setupUrl(final String str) {
            Thread thread = new Thread(new Runnable() {
                /* class com.ss.avframework.livestreamv2.filter.VideoCatcher.H264Dumper.AnonymousClass1 */
                private String mH264OutputPath;
                private FileOutputStream mH264OutputStream;

                static {
                    Covode.recordClassIndex(100402);
                }

                private void onQuit() {
                    if (this.mH264OutputStream != null) {
                        while (!H264Dumper.this.mPacketQueue.isEmpty()) {
                            Transport.MediaPacket poll = H264Dumper.this.mPacketQueue.poll();
                            if (poll != null) {
                                try {
                                    this.mH264OutputStream.getChannel().write(poll.buffer);
                                } catch (Exception e2) {
                                    if (VideoCatcher.this.mCallback != null) {
                                        VideoCatcher.this.mCallback.onError(-5, e2.toString());
                                    }
                                }
                            }
                        }
                        try {
                            this.mH264OutputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        this.mH264OutputStream = null;
                    }
                    if (H264Dumper.this.codeOnQuit != 0) {
                        try {
                            File file = new File(this.mH264OutputPath);
                            if (file.exists() && file.isFile()) {
                                com_ss_avframework_livestreamv2_filter_VideoCatcher$H264Dumper$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                            }
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                }

                private boolean onStart() {
                    MethodCollector.i(12001);
                    try {
                        File file = new File(this.mH264OutputPath);
                        String parent = file.getParent();
                        File file2 = new File(parent);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        if (!file2.exists()) {
                            Exception exc = new Exception(parent + " doesn't exist.");
                            MethodCollector.o(12001);
                            throw exc;
                        } else if (file2.canWrite()) {
                            if (file.exists() && file.isFile()) {
                                com_ss_avframework_livestreamv2_filter_VideoCatcher$H264Dumper$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(file);
                            }
                            this.mH264OutputStream = new FileOutputStream(file, false);
                            MethodCollector.o(12001);
                            return true;
                        } else {
                            Exception exc2 = new Exception(parent + " is forbidden to write.");
                            MethodCollector.o(12001);
                            throw exc2;
                        }
                    } catch (Exception e2) {
                        FileOutputStream fileOutputStream = this.mH264OutputStream;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            this.mH264OutputStream = null;
                        }
                        if (VideoCatcher.this.mCallback != null) {
                            VideoCatcher.this.mCallback.onError(-5, e2.toString());
                        }
                        MethodCollector.o(12001);
                        return false;
                    }
                }

                public void run() {
                    FileOutputStream fileOutputStream;
                    MethodCollector.i(11843);
                    this.mH264OutputPath = str;
                    H264Dumper.this.mRunning = onStart();
                    while (H264Dumper.this.mRunning) {
                        if (H264Dumper.this.mPacketQueue.isEmpty()) {
                            try {
                                synchronized (H264Dumper.this.mDumpFence) {
                                    try {
                                        H264Dumper.this.mDumpFence.wait();
                                    } catch (Throwable th) {
                                        MethodCollector.o(11843);
                                        throw th;
                                    }
                                }
                            } catch (Exception e2) {
                                if (VideoCatcher.this.mCallback != null) {
                                    VideoCatcher.this.mCallback.onError(-5, e2.toString());
                                }
                            }
                        }
                        Transport.MediaPacket poll = H264Dumper.this.mPacketQueue.poll();
                        if (!(poll == null || (fileOutputStream = this.mH264OutputStream) == null)) {
                            try {
                                fileOutputStream.getChannel().write(poll.buffer);
                            } catch (Exception e3) {
                                if (VideoCatcher.this.mCallback != null) {
                                    VideoCatcher.this.mCallback.onError(-5, e3.toString());
                                }
                            }
                        }
                    }
                    onQuit();
                    MethodCollector.o(11843);
                }

                public static boolean com_ss_avframework_livestreamv2_filter_VideoCatcher$H264Dumper$1_com_ss_android_ugc_aweme_storage_FileLancet_delete(File file) {
                    MethodCollector.i(12286);
                    try {
                        e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                        if (e.a(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                        }
                        if (e.c(file.getAbsolutePath(), cVar)) {
                            e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                            MethodCollector.o(12286);
                            return false;
                        }
                    } catch (Throwable unused) {
                    }
                    boolean delete = file.delete();
                    MethodCollector.o(12286);
                    return delete;
                }
            });
            this.mDumpThread = thread;
            thread.setName("DumpH264Thread_" + this.mDumpThread);
            this.mDumpThread.start();
            return true;
        }

        public void stop(int i2) {
            MethodCollector.i(13987);
            this.mRunning = false;
            this.codeOnQuit = i2;
            synchronized (this.mDumpFence) {
                try {
                    this.mDumpFence.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.o(13987);
                    throw th;
                }
            }
            try {
                this.mDumpThread.join(5000);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.mDumpThread = null;
            MethodCollector.o(13987);
        }
    }

    /* access modifiers changed from: package-private */
    public void stop(int i2) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (!(mediaEncodeStream2 == null || (videoTrack = this.mVideoTrack) == null)) {
            mediaEncodeStream2.removeTrack(videoTrack);
        }
        H264Dumper h264Dumper = this.mH264Dumper;
        if (h264Dumper != null) {
            h264Dumper.stop(i2);
            this.mH264Dumper = null;
        }
        TEBundle tEBundle = this.mEncodeStreamOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mEncodeStreamOpt = null;
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (mediaEncodeStream3 != null) {
            mediaEncodeStream3.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        VideoEncoderFactory videoEncoderFactory = this.mVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            videoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        AudioEncoderFactory audioEncoderFactory = this.mAudioEncoderFactory;
        if (audioEncoderFactory != null) {
            audioEncoderFactory.release();
            this.mAudioEncoderFactory = null;
        }
        ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
        if (externalVideoCapturer != null) {
            externalVideoCapturer.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            videoTrack2.release();
            this.mVideoTrack = null;
        }
        PngShotter pngShotter = this.mPngShotter;
        if (pngShotter != null) {
            pngShotter.stop(i2);
            this.mPngShotter = null;
        }
        this.mStarted.set(false);
    }

    /* access modifiers changed from: package-private */
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        if (this.mMode == 0) {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof VideoFrame.TextureBuffer)) {
                VideoCatcherCallback videoCatcherCallback = this.mCallback;
                if (videoCatcherCallback != null) {
                    videoCatcherCallback.onError(-4, "Video frame type not supported.");
                    return;
                }
                return;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (width != this.mWidth || height != this.mHeight) {
                VideoCatcherCallback videoCatcherCallback2 = this.mCallback;
                if (videoCatcherCallback2 != null) {
                    videoCatcherCallback2.onError(-4, "Video frame size (" + width + ", " + height + ") does not match the init size (" + this.mWidth + ", " + this.mHeight + ")");
                }
            } else if (this.mVideoCapturer != null) {
                VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                VideoFrame.TextureBuffer.Type type = textureBuffer.getType();
                float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(textureBuffer.getTransformMatrix());
                ExternalVideoCapturer externalVideoCapturer = this.mVideoCapturer;
                int textureId = textureBuffer.getTextureId();
                if (type == VideoFrame.TextureBuffer.Type.OES) {
                    z = true;
                } else {
                    z = false;
                }
                externalVideoCapturer.pushVideoFrame(textureId, z, width, height, 0, convertMatrixFromAndroidGraphicsMatrix, videoFrame.getTimestampNs() / 1000, null, TimeUtils.currentTimeMs());
            }
        }
    }

    @Override // com.ss.avframework.capture.video.VideoCapturer.VideoCapturerObserver
    public void onVideoCapturerError(int i2, Exception exc) {
        VideoCatcherCallback videoCatcherCallback = this.mCallback;
        if (videoCatcherCallback != null) {
            videoCatcherCallback.onError(-3, "onVideoCapturerError: " + i2 + ", " + exc.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public void readPixels(int i2, int i3) {
        PngShotter pngShotter;
        if (this.mMode == 1 && (pngShotter = this.mPngShotter) != null) {
            this.mWidth = i2;
            this.mHeight = i3;
            if (pngShotter.readPixels(i2, i3) && this.mCallback != null) {
                this.mPngShotter.post(new Runnable() {
                    /* class com.ss.avframework.livestreamv2.filter.VideoCatcher.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(100399);
                    }

                    public void run() {
                        VideoCatcher.this.mCallback.onCatchedBuffer(VideoCatcher.this);
                    }
                });
            }
        }
    }

    public byte[] getCompressedStream(int i2, int i3, float f2) {
        MethodCollector.i(14602);
        ByteBuffer pixelBuffer = getPixelBuffer();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2 * i3 * 4);
        Bitmap createBitmap = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(pixelBuffer);
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i2) / ((float) this.mWidth), ((float) i3) / ((float) this.mHeight));
        Bitmap.createBitmap(createBitmap, 0, 0, this.mWidth, this.mHeight, matrix, true).compress(Bitmap.CompressFormat.JPEG, (int) (100.0f * f2), byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            MethodCollector.o(14602);
            return byteArray;
        } catch (IOException unused) {
            MethodCollector.o(14602);
            return null;
        }
    }

    @Override // com.ss.avframework.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(final int i2, final int i3, final long j2, final String str) {
        this.mHandler.post(new Runnable() {
            /* class com.ss.avframework.livestreamv2.filter.VideoCatcher.AnonymousClass2 */

            static {
                Covode.recordClassIndex(100400);
            }

            public void run() {
                int i2 = i2;
                if (i2 == 1) {
                    AVLog.iod("VideoCatcher", "Video encoder created");
                } else if (i2 == 2) {
                    VideoCatcher.this.onCreateEncoderError();
                } else if (i2 == 5) {
                    AVLog.iow("VideoCatcher", "Video encoder format changed: code1 " + i2 + ", code2 " + i3 + ", code3 " + j2 + ", msg \"" + str + "\"");
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void start(int i2, int i3, VideoCatcherCallback videoCatcherCallback, Handler handler) {
        start(1, i2, i3, 0, false, null, videoCatcherCallback, null, handler);
    }

    /* access modifiers changed from: package-private */
    public void start(int i2, int i3, int i4, int i5, boolean z, String str, VideoCatcherCallback videoCatcherCallback, MediaEngineFactory mediaEngineFactory, Handler handler) {
        if (!this.mStarted.get()) {
            this.mStarted.set(true);
            if (i3 > 0 && i4 > 0 && handler != null) {
                this.mMode = i2;
                this.mWidth = i3;
                this.mHeight = i4;
                this.mFps = i5;
                this.mCallback = videoCatcherCallback;
                this.mHandler = handler;
                if (i2 != 0) {
                    PngShotter pngShotter = new PngShotter();
                    this.mPngShotter = pngShotter;
                    pngShotter.start(this.mWidth, this.mHeight, str);
                } else if (i5 > 0 && !TextUtils.isEmpty(str) && mediaEngineFactory != null) {
                    ExternalVideoCapturer externalVideoCapturer = new ExternalVideoCapturer(this, handler);
                    this.mVideoCapturer = externalVideoCapturer;
                    this.mVideoTrack = mediaEngineFactory.createVideoTrack(externalVideoCapturer);
                    this.mUseHardwareEncoder = z;
                    this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
                    this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
                    H264Dumper h264Dumper = new H264Dumper();
                    this.mH264Dumper = h264Dumper;
                    MediaEncodeStream createMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, h264Dumper);
                    this.mMediaEncodeStream = createMediaEncodeStream;
                    createMediaEncodeStream.registerObserver(this);
                    this.mMediaEncodeStream.start();
                    setupParameter();
                    this.mH264Dumper.setupUrl(str);
                    this.mMediaEncodeStream.addTrack(this.mVideoTrack);
                    this.mVideoCapturer.start(this.mWidth, this.mHeight, this.mFps);
                } else if (videoCatcherCallback != null) {
                    videoCatcherCallback.onError(-1, "Param error: mode " + i2 + ",fps " + i5 + ", outputPath " + str + ", MediaEngineFactory " + mediaEngineFactory);
                }
            } else if (videoCatcherCallback != null) {
                videoCatcherCallback.onError(-1, "Param error: mode " + i2 + ", width " + i3 + ", height " + i4 + ", handler " + handler);
            }
        } else if (videoCatcherCallback != null) {
            videoCatcherCallback.onError(-2, "Video catching already started.");
        }
    }
}
