package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.nio.ByteBuffer;

public abstract class IRTCRoomEventHandler {
    static {
        Covode.recordClassIndex(100950);
    }

    public void onAudioFramePlayStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState) {
    }

    public abstract void onAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i2, int i3);

    public abstract void onFirstLocalAudioFrame(StreamIndex streamIndex);

    public abstract void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo);

    public abstract void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey);

    public abstract void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo);

    public abstract void onJoinRoomResult(String str, String str2, int i2, int i3, int i4);

    public abstract void onLeaveRoom(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats);

    public abstract void onLiveTranscodingResult(String str, int i2);

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    public abstract void onLocalStreamStats(IRTCEngineEventHandler.LocalStreamStats localStreamStats);

    public abstract void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo);

    public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    public abstract void onRemoteStreamStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats);

    public abstract void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo);

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    public abstract void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer);

    public abstract void onRoomError(int i2);

    public abstract void onRoomMessageReceived(String str, String str2);

    public abstract void onRoomMessageSendResult(long j2, int i2);

    public abstract void onRoomWarning(int i2);

    public abstract void onRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats);

    public void onScreenVideoFramePlayStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState) {
    }

    public void onSimulcastSubscribeFallback(IRTCEngineEventHandler.RemoteStreamSwitch remoteStreamSwitch) {
    }

    public abstract void onStreamAdd(RTCStream rTCStream);

    public abstract void onStreamPublishSuccess(String str, boolean z);

    public abstract void onStreamRemove(RTCStream rTCStream, IRTCEngineEventHandler.StreamRemoveReason streamRemoveReason);

    public abstract void onStreamSubscribed(int i2, String str, SubscribeConfig subscribeConfig);

    public void onSubscribe(String str, boolean z) {
    }

    public void onUnSubscribe(String str, boolean z) {
    }

    public abstract void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer);

    public abstract void onUserEnableLocalAudio(String str, boolean z);

    public abstract void onUserJoined(UserInfo userInfo, int i2);

    public abstract void onUserLeave(String str, int i2);

    public abstract void onUserMessageReceived(String str, String str2);

    public abstract void onUserMessageSendResult(long j2, int i2);

    public abstract void onUserMuteAudio(String str, MuteState muteState);

    public abstract void onUserMuteVideo(String str, MuteState muteState);

    public abstract void onUserStartAudioCapture(String str);

    public abstract void onUserStartVideoCapture(String str);

    public abstract void onUserStopAudioCapture(String str);

    public abstract void onUserStopVideoCapture(String str);

    public void onVideoFramePlayStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(IRTCEngineEventHandler.RtcUser rtcUser, IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState) {
    }
}
