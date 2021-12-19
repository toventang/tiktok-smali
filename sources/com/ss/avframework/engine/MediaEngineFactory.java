package com.ss.avframework.engine;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import com.ss.avframework.effect.VideoEffectUtilsWrapper;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.EarlyAVLog;
import com.ss.avframework.utils.JniCommon;
import com.ss.avframework.utils.LibraryLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaEngineFactory {
    private static List<String> librarylist;
    private long mNativeObj;

    private static native int nativeCheckLicense(String str);

    private native long nativeCreateAudioTrack(long j2, AudioSource audioSource, String str);

    private native long nativeCreateMediaEncodeStream(long j2, VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport);

    private native long nativeCreateVideoTrack(long j2, VideoSource videoSource, String str);

    private static native long nativeGetMediaEngineFactory();

    private static native String nativeGetVersion();

    private static native void nativeSetupClassLoader();

    public static List<String> getLibrarylist() {
        return librarylist;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        super.finalize();
    }

    public static String getVersion() {
        MethodCollector.i(14639);
        String nativeGetVersion = nativeGetVersion();
        MethodCollector.o(14639);
        return nativeGetVersion;
    }

    public static void loadLibrary() {
        MethodCollector.i(14640);
        nativeSetupClassLoader();
        MethodCollector.o(14640);
    }

    public static MediaEngineFactory create() {
        MediaEngineFactory mediaEngineFactory;
        MethodCollector.i(14641);
        long nativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (nativeGetMediaEngineFactory != 0) {
            mediaEngineFactory = new MediaEngineFactory(nativeGetMediaEngineFactory);
        } else {
            mediaEngineFactory = null;
        }
        MethodCollector.o(14641);
        return mediaEngineFactory;
    }

    public synchronized void release() {
        MethodCollector.i(14647);
        long j2 = this.mNativeObj;
        if (j2 != 0) {
            JniCommon.nativeReleaseRef(j2);
            this.mNativeObj = 0;
        }
        MethodCollector.o(14647);
    }

    static {
        Covode.recordClassIndex(99819);
        List asList = Arrays.asList("c++_shared", "aaudio", "ttcrypto", "bytenn", "yuv", "fdk-aac", "bytevc0", "bytevc1enc", "iesapplogger", "ttboringssl", "lens", "ttffmpeg", "ttquic", "IESSaliency");
        ArrayList arrayList = new ArrayList();
        librarylist = arrayList;
        arrayList.addAll(asList);
        librarylist.add("audioeffect");
        librarylist.add("byteaudio");
        List<String> effectLibs = VideoEffectUtilsWrapper.getEffectLibs();
        if (effectLibs != null && !effectLibs.isEmpty()) {
            int size = effectLibs.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!librarylist.contains(effectLibs.get(i2))) {
                    librarylist.add(effectLibs.get(i2));
                }
            }
        }
        librarylist.add("avframework");
        for (String str : librarylist) {
            if (str.equals("byteaudio")) {
                try {
                    com_ss_avframework_engine_MediaEngineFactory_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("byteaudio");
                } catch (Throwable unused) {
                }
            }
            if (!loadLibrary(str)) {
                try {
                    com_ss_avframework_engine_MediaEngineFactory_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(str);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static void setLogLevel(int i2) {
        AVLog.setLevel(i2);
    }

    protected MediaEngineFactory(long j2) {
        this.mNativeObj = j2;
    }

    public AudioTrack createAudioTrack(AudioSource audioSource) {
        return createAudioTrack(audioSource, null);
    }

    public VideoTrack createVideoTrack(VideoSource videoSource) {
        return createVideoTrack(videoSource, null);
    }

    public static int checkLicense(String str) {
        MethodCollector.i(14636);
        int nativeCheckLicense = nativeCheckLicense(str);
        MethodCollector.o(14636);
        return nativeCheckLicense;
    }

    public static void com_ss_avframework_engine_MediaEngineFactory_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    private static boolean loadLibrary(String str) {
        try {
            boolean loadLibrary = LibraryLoader.loadLibrary(str);
            EarlyAVLog.println(5, "MediaEngineFactory", "Loading library lib" + str + ".so done (" + loadLibrary + ")", null);
            return loadLibrary;
        } catch (Throwable th) {
            EarlyAVLog.println(5, "MediaEngineFactory", "Loading library lib" + str + ".so error (" + th.getMessage() + ")", th);
            return false;
        }
    }

    public AudioTrack createAudioTrack(AudioSource audioSource, String str) {
        AudioTrack audioTrack;
        MethodCollector.i(14645);
        long nativeCreateAudioTrack = nativeCreateAudioTrack(this.mNativeObj, audioSource, str);
        if (nativeCreateAudioTrack != 0) {
            audioTrack = new AudioTrack(nativeCreateAudioTrack, audioSource);
        } else {
            audioTrack = null;
        }
        MethodCollector.o(14645);
        return audioTrack;
    }

    public VideoTrack createVideoTrack(VideoSource videoSource, String str) {
        VideoTrack videoTrack;
        MethodCollector.i(14643);
        long nativeCreateVideoTrack = nativeCreateVideoTrack(this.mNativeObj, videoSource, str);
        if (nativeCreateVideoTrack != 0) {
            videoTrack = new VideoTrack(nativeCreateVideoTrack, videoSource);
        } else {
            videoTrack = null;
        }
        MethodCollector.o(14643);
        return videoTrack;
    }

    public MediaEncodeStream createMediaEncodeStream(VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport) {
        MediaEncodeStream mediaEncodeStream;
        MethodCollector.i(14646);
        long nativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(this.mNativeObj, videoEncoderFactory, audioEncoderFactory, transport);
        if (nativeCreateMediaEncodeStream != 0) {
            mediaEncodeStream = new MediaEncodeStream(nativeCreateMediaEncodeStream, transport);
        } else {
            mediaEncodeStream = null;
        }
        if (!(transport == null || mediaEncodeStream == null)) {
            transport.setVysncModule(new VsyncModule(mediaEncodeStream.nativeGetVsyncModule(nativeCreateMediaEncodeStream)));
        }
        MethodCollector.o(14646);
        return mediaEncodeStream;
    }
}
