package com.bytedance.bae.webrtc;

import android.content.ClipboardManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.base.ContextUtils;
import com.bytedance.bae.base.ExceptionUtils;
import com.bytedance.bae.base.ThreadUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;

public class WebRtcAudioTrack {
    private static final int DEFAULT_USAGE;
    private static ErrorCallback errorCallback;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld;
    private static boolean sForbidVoip;
    public static volatile boolean speakerMute;
    private static int usageAttribute;
    private String apiResult = "";
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public byte[] emptyBytes;
    public final long nativeAudioTrack;
    private final ThreadUtils.ThreadChecker threadChecker;

    public interface ErrorCallback {
        static {
            Covode.recordClassIndex(15417);
        }

        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public interface WebRtcAudioTrackErrorCallback {
        static {
            Covode.recordClassIndex(15418);
        }

        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    private int channelCountToConfiguration(int i2) {
        return i2 == 1 ? 4 : 12;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j2);

    public native void nativeGetPlayoutData(int i2, long j2);

    private String getApiResult() {
        this.threadChecker.checkIsOnValidThread();
        return this.apiResult;
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive = true;

        static {
            Covode.recordClassIndex(15416);
        }

        public void stopThread() {
            BaeLogging.i("WebRtcAudioTrack", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            boolean z2;
            MethodCollector.i(218);
            Process.setThreadPriority(-19);
            BaeLogging.i("WebRtcAudioTrack", "AudioTrackThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioTrack.this.audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioTrack.assertTrue(z);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                if (capacity <= WebRtcAudioTrack.this.byteBuffer.remaining()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                WebRtcAudioTrack.assertTrue(z2);
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    BaeLogging.e("WebRtcAudioTrack", "AudioTrack.write played invalid number of bytes: ".concat(String.valueOf(writeBytes)));
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError("AudioTrack.write failed: ".concat(String.valueOf(writeBytes)));
                    }
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                BaeLogging.i("WebRtcAudioTrack", "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    BaeLogging.i("WebRtcAudioTrack", "AudioTrack.stop is done.");
                    MethodCollector.o(218);
                    return;
                } catch (Exception e2) {
                    BaeLogging.e("WebRtcAudioTrack", "AudioTrack.stop failed: " + e2.getMessage());
                }
            }
            MethodCollector.o(218);
        }

        public AudioTrackThread(String str) {
            super(str);
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
            if (audioTrack == null) {
                return -1;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return audioTrack.write(byteBuffer, i2, 0);
            }
            return audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), i2);
        }
    }

    static {
        Covode.recordClassIndex(15414);
        int defaultUsageAttribute = getDefaultUsageAttribute();
        DEFAULT_USAGE = defaultUsageAttribute;
        usageAttribute = defaultUsageAttribute;
    }

    private static int getDefaultUsageAttribute() {
        if (Build.VERSION.SDK_INT >= 21) {
            return 2;
        }
        return 0;
    }

    private int getStreamType() {
        this.threadChecker.checkIsOnValidThread();
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 == null) {
            return -1;
        }
        return audioTrack2.getStreamType();
    }

    private boolean isVolumeFixed() {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return this.audioManager.isVolumeFixed();
    }

    private int getStreamMaxVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        BaeLogging.i("WebRtcAudioTrack", "getStreamMaxVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        BaeLogging.i("WebRtcAudioTrack", "getStreamVolume");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        return this.audioManager.getStreamVolume(0);
    }

    private void releaseAudioResources() {
        BaeLogging.i("WebRtcAudioTrack", "releaseAudioResources");
        AudioTrack audioTrack2 = this.audioTrack;
        if (audioTrack2 != null) {
            audioTrack2.release();
            this.audioTrack = null;
        }
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH;

        static {
            Covode.recordClassIndex(15415);
        }
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            BaeLogging.i("WebRtcAudioTrack", "AudioTrack: buffer capacity in frames: " + this.audioTrack.getBufferCapacityInFrames());
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            BaeLogging.i("WebRtcAudioTrack", "AudioTrack: buffer size in frames: " + this.audioTrack.getBufferSizeInFrames());
        }
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            BaeLogging.i("WebRtcAudioTrack", "underrun count: " + this.audioTrack.getUnderrunCount());
        }
    }

    private void logMainParameters() {
        BaeLogging.i("WebRtcAudioTrack", "AudioTrack: session ID: " + this.audioTrack.getAudioSessionId() + ", channels: " + this.audioTrack.getChannelCount() + ", sample rate: " + this.audioTrack.getSampleRate() + ", max gain: " + AudioTrack.getMaxVolume());
    }

    private boolean stopPlayout() {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        BaeLogging.i("WebRtcAudioTrack", "stopPlayout");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.apiResult = "StopPlayout:";
        logUnderrunCount();
        this.audioThread.stopThread();
        BaeLogging.i("WebRtcAudioTrack", "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, InteractFirstFrameTimeOutDurationSetting.DEFAULT)) {
            BaeLogging.e("WebRtcAudioTrack", "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
            this.apiResult += "Join of AudioTrackThread timed out.";
        }
        BaeLogging.i("WebRtcAudioTrack", "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    private boolean startPlayout() {
        boolean z;
        boolean z2;
        this.threadChecker.checkIsOnValidThread();
        BaeLogging.i("WebRtcAudioTrack", "startPlayout");
        if (this.audioTrack != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (this.audioThread == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        assertTrue(z2);
        this.apiResult = "StartPlayout:";
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState());
                this.apiResult += "AudioTrack.play failed - incorrect state :" + this.audioTrack.getPlayState();
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("BaeTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e2) {
            reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, "AudioTrack.play failed: " + e2.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioTrack.play failed: " + e2.getMessage();
            return false;
        }
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        BaeLogging.i("WebRtcAudioTrack", "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        BaeLogging.i("WebRtcAudioTrack", "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }

    public static void setSpeakerMute(boolean z) {
        BaeLogging.w("WebRtcAudioTrack", "setSpeakerMute(" + z + ")");
        speakerMute = z;
    }

    WebRtcAudioTrack(long j2) {
        ThreadUtils.ThreadChecker threadChecker2 = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker2;
        threadChecker2.checkIsOnValidThread();
        BaeLogging.i("WebRtcAudioTrack", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioTrack = j2;
        this.audioManager = (AudioManager) com_bytedance_bae_webrtc_WebRtcAudioTrack_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(ContextUtils.getApplicationContext(), DataType.AUDIO);
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        BaeLogging.e("WebRtcAudioTrack", "Init playout error: ".concat(String.valueOf(str)));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i2) {
        synchronized (WebRtcAudioTrack.class) {
            MethodCollector.i(67);
            BaeLogging.w("WebRtcAudioTrack", "Default usage attribute is changed from: " + DEFAULT_USAGE + " to " + i2);
            usageAttribute = i2;
            MethodCollector.o(67);
        }
    }

    private boolean setStreamVolume(int i2) {
        boolean z;
        this.threadChecker.checkIsOnValidThread();
        BaeLogging.i("WebRtcAudioTrack", "setStreamVolume(" + i2 + ")");
        if (this.audioManager != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        if (isVolumeFixed()) {
            BaeLogging.e("WebRtcAudioTrack", "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i2, 0);
        return true;
    }

    public void reportWebRtcAudioTrackError(String str) {
        BaeLogging.e("WebRtcAudioTrack", "Run-time playback error: ".concat(String.valueOf(str)));
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        BaeLogging.e("WebRtcAudioTrack", "Start playout error: " + audioTrackStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioTrack");
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static Object com_bytedance_bae_webrtc_WebRtcAudioTrack_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String str) {
        Object obj;
        MethodCollector.i(72);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(72);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i2, int i3, int i4) {
        if (sForbidVoip) {
            return new AudioTrack(3, i2, i3, 2, i4, 1);
        }
        return new AudioTrack(0, i2, i3, 2, i4, 1);
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i2, int i3, int i4) {
        int i5;
        BaeLogging.i("WebRtcAudioTrack", "createAudioTrackOnLollipopOrHigher");
        if (sForbidVoip) {
            i5 = 3;
        } else {
            i5 = 0;
        }
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(i5);
        BaeLogging.i("WebRtcAudioTrack", "nativeOutputSampleRate: ".concat(String.valueOf(nativeOutputSampleRate)));
        if (i2 != nativeOutputSampleRate) {
            BaeLogging.w("WebRtcAudioTrack", "Unable to use fast mode since requested sample rate is not native");
        }
        if (sForbidVoip) {
            usageAttribute = 1;
        } else {
            usageAttribute = DEFAULT_USAGE;
        }
        if (usageAttribute != DEFAULT_USAGE) {
            BaeLogging.w("WebRtcAudioTrack", "A non default usage attribute is used: " + usageAttribute);
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i2).setChannelMask(i3).build(), i4, 1, 0);
    }

    private boolean initPlayout(int i2, int i3, boolean z) {
        MethodCollector.i(186);
        this.apiResult = "InitPlayout(sampleRate=" + i2 + ", channels=" + i3 + ", forbidVoip=" + z + "):";
        sForbidVoip = z;
        try {
            this.threadChecker.checkIsOnValidThread();
            BaeLogging.i("WebRtcAudioTrack", "initPlayout(sampleRate=" + i2 + ", channels=" + i3 + ")");
            this.byteBuffer = ByteBuffer.allocateDirect(i3 * 2 * (i2 / 100));
            BaeLogging.i("WebRtcAudioTrack", "byteBuffer.capacity: " + this.byteBuffer.capacity());
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
            int channelCountToConfiguration = channelCountToConfiguration(i3);
            int minBufferSize = AudioTrack.getMinBufferSize(i2, channelCountToConfiguration, 2);
            BaeLogging.i("WebRtcAudioTrack", "AudioTrack.getMinBufferSize: ".concat(String.valueOf(minBufferSize)));
            if (minBufferSize < this.byteBuffer.capacity()) {
                reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
                this.apiResult += "AudioTrack.getMinBufferSize returns an invalid value.";
                MethodCollector.o(186);
                return false;
            } else if (this.audioTrack != null) {
                reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
                this.apiResult += "Conflict with existing AudioTrack.";
                MethodCollector.o(186);
                return false;
            } else {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.audioTrack = createAudioTrackOnLollipopOrHigher(i2, channelCountToConfiguration, minBufferSize);
                    } else {
                        this.audioTrack = createAudioTrackOnLowerThanLollipop(i2, channelCountToConfiguration, minBufferSize);
                    }
                    AudioTrack audioTrack2 = this.audioTrack;
                    if (audioTrack2 == null || audioTrack2.getState() != 1) {
                        reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                        releaseAudioResources();
                        this.apiResult += "Initialization of audio track failed.";
                        MethodCollector.o(186);
                        return false;
                    }
                    logMainParameters();
                    logMainParametersExtended();
                    MethodCollector.o(186);
                    return true;
                } catch (IllegalArgumentException e2) {
                    reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e2) + e2.getMessage());
                    releaseAudioResources();
                    MethodCollector.o(186);
                    return false;
                }
            }
        } catch (Exception e3) {
            BaeLogging.w("WebRtcAudioTrack", "initPlayout exception", e3);
            reportWebRtcAudioTrackInitError(ExceptionUtils.stackTrace(e3));
            this.apiResult += "initPlayout exception";
            MethodCollector.o(186);
            return false;
        }
    }
}
