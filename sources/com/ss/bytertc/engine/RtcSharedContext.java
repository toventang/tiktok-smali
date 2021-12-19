package com.ss.bytertc.engine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.base.utils.RtcContextUtils;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.utils.TextureHelper;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase$$CC;

public class RtcSharedContext {
    private static String mPackageName;
    private static EglBase mRootEglBase;
    private static VideoFrameConverter mVideoFrameConverter;
    private static RTCHttpClient nativeHttpClient;

    static {
        Covode.recordClassIndex(100813);
    }

    public static int com_ss_bytertc_engine_RtcSharedContext_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    public static EglBase getEGLContext() {
        return mRootEglBase;
    }

    public static VideoFrameConverter getVideoFrameConverter() {
        return mVideoFrameConverter;
    }

    public static Context getApplicationContext() {
        return RtcContextUtils.getApplicationContext();
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public static TextureHelper getTextureHelper() {
        return mVideoFrameConverter.getTextureHelper();
    }

    public static void releaseEglContext() {
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            mRootEglBase = null;
        }
    }

    public static long getNativeEGLContext() {
        TextureHelper textureHelper = getTextureHelper();
        if (textureHelper != null) {
            return textureHelper.getNativeEglContext();
        }
        EglBase eglBase = mRootEglBase;
        if (eglBase != null) {
            return eglBase.getEglBaseContext().getNativeEglContext();
        }
        return 0;
    }

    public static void initialize(Context context) {
        RtcContextUtils.initialize(context);
        mPackageName = context.getPackageName();
    }

    public static synchronized void setHttpClient(RTCHttpClient rTCHttpClient) {
        synchronized (RtcSharedContext.class) {
            MethodCollector.i(11637);
            nativeHttpClient = rTCHttpClient;
            MethodCollector.o(11637);
        }
    }

    public static synchronized void setRootEglBase(EglBase eglBase) {
        synchronized (RtcSharedContext.class) {
            MethodCollector.i(11638);
            mRootEglBase = eglBase;
            MethodCollector.o(11638);
        }
    }

    public static synchronized void setVideoFrameConverter(VideoFrameConverter videoFrameConverter) {
        synchronized (RtcSharedContext.class) {
            MethodCollector.i(11636);
            mVideoFrameConverter = videoFrameConverter;
            MethodCollector.o(11636);
        }
    }

    public static boolean initEglContext(Object obj) {
        if (obj == null) {
            mRootEglBase = EglBase$$CC.create$$STATIC$$();
            return false;
        } else if (obj instanceof EGLContext) {
            mRootEglBase = EglBase$$CC.createEgl10$$STATIC$$((EGLContext) obj, EglBase.CONFIG_PLAIN);
            return true;
        } else if (obj instanceof android.opengl.EGLContext) {
            mRootEglBase = EglBase$$CC.createEgl14$$STATIC$$((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
            return true;
        } else if (obj instanceof EglBase) {
            mRootEglBase = EglBase$$CC.create$$STATIC$$(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
            return true;
        } else {
            mRootEglBase = EglBase$$CC.create$$STATIC$$();
            return true;
        }
    }

    public static void httpGetAsync(String str, int i2, int i3, int i4) {
        if (nativeHttpClient == null) {
            com_ss_bytertc_engine_RtcSharedContext_com_ss_android_ugc_aweme_lancet_LogLancet_d("bytertc", "native http client has not been init!");
            return;
        }
        RTCEngineImpl.RtcHttpCallbackImpl rtcHttpCallbackImpl = new RTCEngineImpl.RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i3);
        rtcHttpCallbackImpl.setClientId(i4);
        nativeHttpClient.GetAsync(str, rtcHttpCallbackImpl, i2);
    }

    public static void httpPostAsync(String str, String str2, int i2, int i3, int i4) {
        if (nativeHttpClient == null) {
            com_ss_bytertc_engine_RtcSharedContext_com_ss_android_ugc_aweme_lancet_LogLancet_d("bytertc", "native http client has not been init!");
            return;
        }
        com_ss_bytertc_engine_RtcSharedContext_com_ss_android_ugc_aweme_lancet_LogLancet_d("bytertc", "http in java called, callback Id: ".concat(String.valueOf(i3)));
        RTCEngineImpl.RtcHttpCallbackImpl rtcHttpCallbackImpl = new RTCEngineImpl.RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i3);
        rtcHttpCallbackImpl.setClientId(i4);
        nativeHttpClient.PostAsync(str, str2, rtcHttpCallbackImpl, i2);
    }
}
