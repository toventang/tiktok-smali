package com.ss.avframework.livestreamv2.core;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.IDualGameEngine;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import com.ss.bytertc.engine.IRTCRoom;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.livertc.LiveRTCEngine;
import java.nio.ByteBuffer;
import java.util.List;
import org.json.JSONObject;

public interface Client {

    public interface IAudioFrameObserver {
        static {
            Covode.recordClassIndex(100034);
        }

        void onMixedAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

        void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

        void onRecordAudioFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, long j2);

        boolean wantMixedAudioFrame();

        boolean wantPlaybackAudioFrame();

        boolean wantRecordAudioFrame();
    }

    public interface ICatchedVideoFrameCallback {
        static {
            Covode.recordClassIndex(100035);
        }

        void onCatchedVideoFrameCallback(String str, ByteBuffer byteBuffer, int i2, int i3);
    }

    public interface InteractEventListener {
        static {
            Covode.recordClassIndex(100036);
        }

        void notifyLiveStreamAdjustResolution(Client client, boolean z, int i2, int i3);

        void onInteractInfoReport(Client client, String str, int i2, long j2, Object... objArr);

        void onInteractStart(Client client);

        void onInteractStop(Client client);
    }

    public interface Listener {
        static {
            Covode.recordClassIndex(100037);
        }

        void onError(Client client, int i2, long j2, Exception exc);

        void onInfo(Client client, int i2, long j2, Object... objArr);
    }

    public interface StreamMixer {
        static {
            Covode.recordClassIndex(100038);
        }

        String mixStream(int i2, int i3, List<Region> list);
    }

    static {
        Covode.recordClassIndex(100032);
    }

    IRTCRoom createRtcRoom();

    void disableRtcPhoneListener();

    void dispose();

    void enableAllRemoteRender(boolean z);

    void enableAllRemoteRender(boolean z, boolean z2);

    void enableRtcPhoneListener();

    String getBusinessId();

    Config getConfig();

    boolean getLocalAudioStreamMuteState();

    LiveRTCEngine getRtcEngine();

    void initDualGameEngine(IDualGameEngine iDualGameEngine);

    void invalidateSei();

    boolean isDualStream();

    boolean isGuest();

    boolean isMultiRoomClient();

    void joinChannel();

    void muteAllRemoteAudioStreams(boolean z);

    void muteAllRemoteVideoStreams(boolean z);

    void muteLocalAudio(boolean z);

    void muteLocalVideo(boolean z);

    void muteRemoteAudioStream(String str, boolean z);

    void muteRemoteVideoStream(String str, boolean z);

    void pause();

    void resume();

    long sendRoomMessage(String str);

    void sendSdkControlMsg(String str);

    long sendUserMessage(String str, String str2);

    void setAudioFrameObserver(int i2, int i3, IAudioFrameObserver iAudioFrameObserver);

    void setAudioScenario(int i2);

    void setBusinessId(String str);

    void setCatchedVideoFrameCallback(String str, ICatchedVideoFrameCallback iCatchedVideoFrameCallback);

    void setDirectRtcEventCallback(IRTCEngineEventHandler iRTCEngineEventHandler);

    void setFitMode(String str, boolean z);

    void setInteractEventListener(InteractEventListener interactEventListener);

    void setListener(Listener listener);

    void setOnlyConsumeAllRemoteSei(boolean z);

    void setOnlyConsumeRemoteSei(String str, boolean z);

    void setRemoteAudioPlaybackVolume(String str, float f2);

    void setSingleViewMode(boolean z);

    void start();

    void start(Object obj);

    void startInteract();

    void startInteract(Object obj);

    void startPushData();

    void stop();

    void stop(Object obj);

    void switchAudio(boolean z);

    void switchInteractMode(Config.InteractMode interactMode);

    void switchMixType(boolean z);

    void updateAuthInfo(JSONObject jSONObject, FrameType frameType);

    void updateRtcExtInfo(String str);

    void updateSdkParams(String str);

    public enum FrameType {
        DEFAULT_OCCUPY,
        METADATA,
        SEI,
        METADATA_SEI;

        static {
            Covode.recordClassIndex(100033);
        }
    }
}
