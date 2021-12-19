package com.ss.bytertc.engine;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.game.GameRTCEngineConfig;
import com.ss.bytertc.engine.game.GameRTCOrientationInfo;
import com.ss.bytertc.engine.game.GameRTCPositionInfo;
import com.ss.bytertc.engine.game.GameRTCReceiveRange;
import com.ss.bytertc.engine.game.GameRTCRoomConfig;
import com.ss.bytertc.engine.handler.IGameRTCEventHandler;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;

public abstract class GameRTCEngine {
    private static GameRTCEngineImpl mInstance;
    protected static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public abstract void DisableExternalAudioDevice();

    public abstract void EnableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2);

    public abstract int enableAudioReceive(String str, String str2, boolean z);

    public abstract int enableAudioSend(String str, boolean z);

    public abstract int enableMicrophone(String str, boolean z);

    public abstract int enableSpeakerphone(String str, boolean z);

    public abstract int joinRoom(String str, String str2, String str3, GameRTCRoomConfig gameRTCRoomConfig);

    public abstract int leaveRoom(String str);

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract void setAudioScenario(AudioScenarioType audioScenarioType);

    public abstract int setPlaybackVolume(int i2);

    public abstract int setRecordingVolume(int i2);

    public abstract int setRemoteAudioPlaybackVolume(String str, String str2, int i2);

    public abstract int updateOrientation(String str, GameRTCOrientationInfo gameRTCOrientationInfo);

    public abstract int updatePosition(String str, GameRTCPositionInfo gameRTCPositionInfo);

    public abstract int updateReceiveRange(String str, GameRTCReceiveRange gameRTCReceiveRange);

    public abstract int updateToken(String str, String str2);

    public enum AudioScenarioType {
        AUDIO_SCENARIO_MUSIC(0),
        AUDIO_SCENARIO_HIGH_QUALITY_COMMUNICATION(1),
        AUDIO_SCENARIO_COMMUNICATION(2),
        AUDIO_SCENARIO_MEDIA(3),
        AUDIO_SCENARIO_GAME_STREAMING(4);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100742);
        }

        private AudioScenarioType(int i2) {
            this.value = i2;
        }
    }

    public static String getSdkVersion() {
        return GameRTCEngineImpl.getSDKVersion();
    }

    static {
        Covode.recordClassIndex(100741);
    }

    public static synchronized void destroy() {
        synchronized (GameRTCEngine.class) {
            GameRTCEngineImpl gameRTCEngineImpl = mInstance;
            if (gameRTCEngineImpl != null) {
                gameRTCEngineImpl.doDestroy();
                mInstance = null;
                System.gc();
            }
        }
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        LogUtil.i("GameRTCEngine", "set rtc native library loader".concat(String.valueOf(rTCNativeLibraryLoader)));
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public static synchronized GameRTCEngine create(Context context, GameRTCEngineConfig gameRTCEngineConfig, IGameRTCEventHandler iGameRTCEventHandler, String str) {
        GameRTCEngineImpl gameRTCEngineImpl;
        synchronized (GameRTCEngine.class) {
            if (mInstance == null) {
                try {
                    mInstance = new GameRTCEngineImpl(context, gameRTCEngineConfig, iGameRTCEventHandler, str);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            gameRTCEngineImpl = mInstance;
        }
        return gameRTCEngineImpl;
    }
}
