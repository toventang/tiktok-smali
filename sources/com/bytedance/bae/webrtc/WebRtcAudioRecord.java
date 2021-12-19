package com.bytedance.bae.webrtc;

import android.media.AudioRecord;
import android.os.Build;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.bae.base.BaeLogging;
import com.bytedance.bae.base.ThreadUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class WebRtcAudioRecord {
    private static final int DEFAULT_AUDIO_SOURCE;
    public static WebRtcAudioRecordSamplesReadyCallback audioSamplesReadyCallback;
    private static int audioSource;
    private static WebRtcAudioRecordErrorCallback errorCallback;
    public static volatile boolean microphoneMute;
    private String apiResult = "";
    public AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    private WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;

    /* renamed from: com.bytedance.bae.webrtc.WebRtcAudioRecord$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(15408);
        }
    }

    public interface WebRtcAudioRecordErrorCallback {
        static {
            Covode.recordClassIndex(15412);
        }

        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public interface WebRtcAudioRecordSamplesReadyCallback {
        static {
            Covode.recordClassIndex(15413);
        }

        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    private int channelCountToConfiguration(int i2) {
        return i2 == 1 ? 16 : 12;
    }

    private static void com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_release(AudioRecord audioRecord2) {
        if (!((Boolean) a.a(audioRecord2, new Object[0], 100403, "void", false, null).first).booleanValue()) {
            a.a(null, audioRecord2, new Object[0], 100405, "com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
            audioRecord2.release();
            a.a(null, audioRecord2, new Object[0], 100403, "com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_release(Landroid/media/AudioRecord;)V");
        }
    }

    private static void com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_startRecording(AudioRecord audioRecord2) {
        if (!((Boolean) a.a(audioRecord2, new Object[0], 100400, "void", false, null).first).booleanValue()) {
            audioRecord2.startRecording();
            a.a(null, audioRecord2, new Object[0], 100400, "com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_startRecording(Landroid/media/AudioRecord;)V");
        }
    }

    private static int getDefaultAudioSource() {
        return 7;
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer2, long j2);

    public native void nativeDataIsRecorded(int i2, long j2);

    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final byte[] data;
        private final int sampleRate;

        static {
            Covode.recordClassIndex(15411);
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }

        private AudioSamples(AudioRecord audioRecord, byte[] bArr) {
            this.audioFormat = audioRecord.getAudioFormat();
            this.channelCount = audioRecord.getChannelCount();
            this.sampleRate = audioRecord.getSampleRate();
            this.data = bArr;
        }

        /* synthetic */ AudioSamples(AudioRecord audioRecord, byte[] bArr, AnonymousClass1 r3) {
            this(audioRecord, bArr);
        }
    }

    private String getApiResult() {
        return this.apiResult;
    }

    class AudioRecordThread extends Thread {
        private volatile boolean keepAlive = true;

        static {
            Covode.recordClassIndex(15410);
        }

        private static void com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_android_media_AudioRecord_stop(AudioRecord audioRecord) {
            if (!((Boolean) a.a(audioRecord, new Object[0], 100401, "void", false, null).first).booleanValue()) {
                a.a(null, audioRecord, new Object[0], 100404, "com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
                audioRecord.stop();
                a.a(null, audioRecord, new Object[0], 100401, "com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_android_media_AudioRecord_stop(Landroid/media/AudioRecord;)V");
            }
        }

        public void stopThread() {
            BaeLogging.i("WebRtcAudioRecord", "stopThread");
            this.keepAlive = false;
        }

        public void run() {
            boolean z;
            MethodCollector.i(4706);
            Process.setThreadPriority(-19);
            BaeLogging.i("WebRtcAudioRecord", "AudioRecordThread" + WebRtcAudioUtils.getThreadInfo());
            if (WebRtcAudioRecord.this.audioRecord.getRecordingState() == 3) {
                z = true;
            } else {
                z = false;
            }
            WebRtcAudioRecord.assertTrue(z);
            System.nanoTime();
            while (this.keepAlive) {
                int read = WebRtcAudioRecord.this.audioRecord.read(WebRtcAudioRecord.this.byteBuffer, WebRtcAudioRecord.this.byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord.this.byteBuffer.put(WebRtcAudioRecord.this.emptyBytes);
                    }
                    if (this.keepAlive) {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                    }
                    if (WebRtcAudioRecord.audioSamplesReadyCallback != null) {
                        WebRtcAudioRecord.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new AudioSamples(WebRtcAudioRecord.this.audioRecord, Arrays.copyOf(WebRtcAudioRecord.this.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.capacity()), null));
                    }
                } else {
                    String concat = "AudioRecord.read failed: ".concat(String.valueOf(read));
                    BaeLogging.e("WebRtcAudioRecord", concat);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(concat);
                    }
                }
            }
            try {
                if (WebRtcAudioRecord.this.audioRecord != null) {
                    com_bytedance_bae_webrtc_WebRtcAudioRecord$AudioRecordThread_android_media_AudioRecord_stop(WebRtcAudioRecord.this.audioRecord);
                }
                MethodCollector.o(4706);
            } catch (Exception e2) {
                BaeLogging.e("WebRtcAudioRecord", "AudioRecord.stop failed: " + e2.getMessage());
                MethodCollector.o(4706);
            }
        }

        public AudioRecordThread(String str) {
            super(str);
        }
    }

    static {
        Covode.recordClassIndex(15407);
        int defaultAudioSource = getDefaultAudioSource();
        DEFAULT_AUDIO_SOURCE = defaultAudioSource;
        audioSource = defaultAudioSource;
    }

    private int getAudioSource() {
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 == null) {
            return -1;
        }
        return audioRecord2.getAudioSource();
    }

    private void releaseAudioResources() {
        BaeLogging.i("WebRtcAudioRecord", "releaseAudioResources");
        AudioRecord audioRecord2 = this.audioRecord;
        if (audioRecord2 != null) {
            com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_release(audioRecord2);
            this.audioRecord = null;
        }
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH;

        static {
            Covode.recordClassIndex(15409);
        }
    }

    private void logMainParameters() {
        BaeLogging.i("WebRtcAudioRecord", "AudioRecord: session ID: " + this.audioRecord.getAudioSessionId() + ", channels: " + this.audioRecord.getChannelCount() + ", sample rate: " + this.audioRecord.getSampleRate());
    }

    private void logMainParametersExtended() {
        if (Build.VERSION.SDK_INT >= 23) {
            BaeLogging.i("WebRtcAudioRecord", "AudioRecord: buffer size in frames: " + this.audioRecord.getBufferSizeInFrames());
        }
    }

    private boolean stopRecording() {
        boolean z;
        this.apiResult = "StopRecording:";
        BaeLogging.i("WebRtcAudioRecord", "StopRecording:");
        if (this.audioThread != null) {
            z = true;
        } else {
            z = false;
        }
        assertTrue(z);
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, InteractFirstFrameTimeOutDurationSetting.DEFAULT)) {
            BaeLogging.e("WebRtcAudioRecord", "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
            this.apiResult += "Join of AudioRecordJavaThread timed out";
        }
        this.audioThread = null;
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }

    private boolean startRecording() {
        boolean z;
        boolean z2;
        this.apiResult = "StartRecording:";
        BaeLogging.i("WebRtcAudioRecord", "StartRecording:");
        if (this.audioRecord != null) {
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
        try {
            com_bytedance_bae_webrtc_WebRtcAudioRecord_android_media_AudioRecord_startRecording(this.audioRecord);
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState());
                this.apiResult += "AudioRecord.startRecording failed - incorrect state :" + this.audioRecord.getRecordingState();
                WebRtcAudioEffects webRtcAudioEffects = this.effects;
                if (webRtcAudioEffects != null) {
                    webRtcAudioEffects.release();
                }
                releaseAudioResources();
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("BaeRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            return true;
        } catch (IllegalStateException e2) {
            reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, "AudioRecord.startRecording failed: " + e2.getMessage());
            this.apiResult += "AudioRecord.startRecording failed: " + e2.getMessage();
            releaseAudioResources();
            return false;
        }
    }

    public static void setOnAudioSamplesReady(WebRtcAudioRecordSamplesReadyCallback webRtcAudioRecordSamplesReadyCallback) {
        audioSamplesReadyCallback = webRtcAudioRecordSamplesReadyCallback;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static void setErrorCallback(WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback) {
        BaeLogging.i("WebRtcAudioRecord", "Set error callback");
        errorCallback = webRtcAudioRecordErrorCallback;
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        BaeLogging.e("WebRtcAudioRecord", "Init recording error: ".concat(String.valueOf(str)));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    public static void setMicrophoneMute(boolean z) {
        BaeLogging.w("WebRtcAudioRecord", "setMicrophoneMute(" + z + ")");
        microphoneMute = z;
    }

    public void reportWebRtcAudioRecordError(String str) {
        BaeLogging.e("WebRtcAudioRecord", "Run-time recording error: ".concat(String.valueOf(str)));
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    WebRtcAudioRecord(long j2) {
        BaeLogging.i("WebRtcAudioRecord", "ctor" + WebRtcAudioUtils.getThreadInfo());
        this.nativeAudioRecord = j2;
        if (WebRtcAudioEffects.IsAudioEffectSupported()) {
            this.effects = WebRtcAudioEffects.create();
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        BaeLogging.i("WebRtcAudioRecord", "enableBuiltInAEC(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        BaeLogging.e("WebRtcAudioRecord", "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        BaeLogging.i("WebRtcAudioRecord", "enableBuiltInNS(" + z + ')');
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        BaeLogging.e("WebRtcAudioRecord", "Built-in NS is not supported on this platform");
        return false;
    }

    public static synchronized void setAudioSource(int i2) {
        synchronized (WebRtcAudioRecord.class) {
            MethodCollector.i(39);
            BaeLogging.w("WebRtcAudioRecord", "Audio source is changed from: " + audioSource + " to " + i2);
            audioSource = i2;
            MethodCollector.o(39);
        }
    }

    private void reportWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        BaeLogging.e("WebRtcAudioRecord", "Start recording error: " + audioRecordStartErrorCode + ". " + str);
        WebRtcAudioUtils.logAudioState("WebRtcAudioRecord");
        WebRtcAudioRecordErrorCallback webRtcAudioRecordErrorCallback = errorCallback;
        if (webRtcAudioRecordErrorCallback != null) {
            webRtcAudioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private int initRecording(int i2, int i3, boolean z) {
        AudioRecord audioRecord2;
        int i4;
        Object valueOf;
        MethodCollector.i(4892);
        String str = "InitRecording(sampleRate=" + i2 + ", channels=" + i3 + ", forbidVoip=" + z + "):";
        this.apiResult = str;
        BaeLogging.i("WebRtcAudioRecord", str);
        if (this.audioRecord != null) {
            reportWebRtcAudioRecordInitError("InitRecording called twice without StopRecording.");
            MethodCollector.o(4892);
            return -1;
        }
        int i5 = i2 / 100;
        this.byteBuffer = ByteBuffer.allocateDirect(i3 * 2 * i5);
        BaeLogging.i("WebRtcAudioRecord", "byteBuffer.capacity: " + this.byteBuffer.capacity());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
        int channelCountToConfiguration = channelCountToConfiguration(i3);
        int minBufferSize = AudioRecord.getMinBufferSize(i2, channelCountToConfiguration, 2);
        if (minBufferSize == -1 || minBufferSize == -2) {
            reportWebRtcAudioRecordInitError("AudioRecord.getMinBufferSize failed: ".concat(String.valueOf(minBufferSize)));
            this.apiResult += "AudioRecord.getMinBufferSize failed: " + minBufferSize;
            MethodCollector.o(4892);
            return -1;
        }
        BaeLogging.i("WebRtcAudioRecord", "AudioRecord.getMinBufferSize: ".concat(String.valueOf(minBufferSize)));
        int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
        BaeLogging.i("WebRtcAudioRecord", "bufferSizeInBytes: ".concat(String.valueOf(max)));
        try {
            synchronized (this) {
                try {
                    if (z) {
                        i4 = 0;
                    } else {
                        i4 = audioSource;
                    }
                    audioRecord2 = new AudioRecord(i4, i2, channelCountToConfiguration, 2, max);
                    this.audioRecord = audioRecord2;
                } catch (Throwable th) {
                    MethodCollector.o(4892);
                    throw th;
                }
            }
            if (audioRecord2.getState() != 1) {
                reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                releaseAudioResources();
                StringBuilder append = new StringBuilder().append(this.apiResult).append("Failed to create a new AudioRecord instance state:");
                AudioRecord audioRecord3 = this.audioRecord;
                if (audioRecord3 == null) {
                    valueOf = "null";
                } else {
                    valueOf = Integer.valueOf(audioRecord3.getState());
                }
                this.apiResult = append.append(valueOf).toString();
                MethodCollector.o(4892);
                return -1;
            }
            WebRtcAudioEffects webRtcAudioEffects = this.effects;
            if (webRtcAudioEffects != null) {
                webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId());
            }
            logMainParameters();
            logMainParametersExtended();
            MethodCollector.o(4892);
            return i5;
        } catch (IllegalArgumentException e2) {
            reportWebRtcAudioRecordInitError("AudioRecord ctor error: " + e2.getMessage());
            releaseAudioResources();
            this.apiResult += "AudioRecord ctor error: " + e2.getMessage();
            MethodCollector.o(4892);
            return -1;
        }
    }
}
