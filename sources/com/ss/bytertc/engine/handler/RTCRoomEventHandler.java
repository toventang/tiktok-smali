package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.InternalAudioVolumeInfo;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.RTCRoom;
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
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

public class RTCRoomEventHandler {
    private RTCRoom mRtcRoom;

    static {
        Covode.recordClassIndex(100960);
    }

    public RTCRoomEventHandler(RTCRoom rTCRoom) {
        this.mRtcRoom = rTCRoom;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2);
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        LogUtil.d("RtcRoomEventHandler", "onFirstLocalAudioFrame...streamIndex: " + streamIndex.value());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalAudioFrame(streamIndex);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcRoomEventHandler", "onLeaveRoom...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLeaveRoom(new IRTCEngineEventHandler.RTCRoomStats(internalRTCStats));
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onLeaveRoom callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LogUtil.d("RtcRoomEventHandler", "onLocalStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalStreamStats(new IRTCEngineEventHandler.LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onLocalStreamStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomError(int i2) {
        LogUtil.d("RtcRoomEventHandler", "onRoomError...errorNum: ".concat(String.valueOf(i2)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomError(i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRoomError callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcRoomEventHandler", "onRtcStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRtcStats(new IRTCEngineEventHandler.RTCRoomStats(internalRTCStats));
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRtcStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomWarning(int i2) {
        LogUtil.d("RtcRoomEventHandler", "onRoomWarning, warnNum: ".concat(String.valueOf(i2)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomWarning(i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRoomWarning callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        LogUtil.d("RtcRoomEventHandler", "onStreamAdd...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamAdd(rTCStream);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onStreamAdd callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStartAudioCapture(String str) {
        LogUtil.d("RtcRoomEventHandler", "onUserStartAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStartAudioCapture(str);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserStartAudioCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStartVideoCapture(String str) {
        LogUtil.d("RtcRoomEventHandler", "onUserStartVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStartVideoCapture(str);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserStartVideoCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStopAudioCapture(String str) {
        LogUtil.d("RtcRoomEventHandler", "onUserStopAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStopAudioCapture(str);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserStopAudioCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStopVideoCapture(String str) {
        LogUtil.d("RtcRoomEventHandler", "onUserStopVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserStopVideoCapture(str);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserStopVideoCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        LogUtil.d("RtcRoomEventHandler", "onFirstRemoteAudioFrame...uid: " + remoteStreamKey.getUserId() + ", roomid: " + remoteStreamKey.getRoomId() + ", streamIndex: " + remoteStreamKey.getStreamIndex().value());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteAudioFrame(remoteStreamKey);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        LogUtil.d("RtcRoomEventHandler", "onRemoteStreamStats...");
        int i2 = 0;
        try {
            int i3 = internalRemoteStreamStats.audioStats.quality;
            if (i3 == -1) {
                i2 = 6;
            } else if (i3 == 0) {
                i2 = 5;
            } else if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                i2 = 3;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 1;
            }
            internalRemoteStreamStats.audioStats.quality = i2;
            this.mRtcRoom.getRtcRoomHandler().onRemoteStreamStats(new IRTCEngineEventHandler.RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRemoteStreamStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        LogUtil.d("RtcRoomEventHandler", "onSimulcastSubscribeFallback, uid: " + internalRemoteStreamSwitch.uid + ", before_video_index: " + internalRemoteStreamSwitch.before_video_index + ", after_video_index: " + internalRemoteStreamSwitch.after_video_index + ", before_enable: " + internalRemoteStreamSwitch.before_enable + ", after_enable: " + internalRemoteStreamSwitch.after_enable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSimulcastSubscribeFallback(new IRTCEngineEventHandler.RemoteStreamSwitch(internalRemoteStreamSwitch));
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRemoteStreamSwitch callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        LogUtil.d("RtcRoomEventHandler", "onLocalAudioStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        LogUtil.d("RtcRoomEventHandler", "onLocalVideoSizeChanged... streamIndex: " + streamIndex + ", frameInfo: " + videoFrameInfo);
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onLocalVideoSizeChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        LogUtil.d("RtcRoomEventHandler", "onRemoteVideoSizeChanged... RemoteStreamKey: " + remoteStreamKey + ", frameInfo: " + videoFrameInfo);
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRemoteVideoSizeChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.d("RtcRoomEventHandler", "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRoomBinaryMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        LogUtil.d("RtcRoomEventHandler", "onRoomMessageReceived: ".concat(String.valueOf(str2)));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(str, str2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRoomMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomMessageSendResult(long j2, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onRoomMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageSendResult(j2, i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRoomMessageSendResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        LogUtil.d("RtcRoomEventHandler", "onStreamPublishSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublishSuccess(str, z);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onStreamPublishSuccess callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onStreamRemove...uid: " + rTCStream.userId);
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamRemove(rTCStream, IRTCEngineEventHandler.StreamRemoveReason.values()[i2]);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onStreamRemove callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSubscribe(String str, boolean z) {
        LogUtil.d("RtcRoomEventHandler", "onSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubscribe(str, z);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onSubscribe callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        LogUtil.d("RtcRoomEventHandler", "onUnSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUnSubscribe(str, z);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUnSubscribe callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        LogUtil.d("RtcRoomEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserEnableLocalAudio(str, z);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserLeave(String str, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onUserLeave... uid: " + str + ", reason: " + i2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserLeave(str, i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserLeave callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        LogUtil.d("RtcRoomEventHandler", "onUserMessageReceived: uid:" + str + "message" + str2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(str, str2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMessageSendResult(long j2, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onUserMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageSendResult(j2, i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserMessageSendResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onAudioFramePlayStateChanged(InternalRTCUser internalRTCUser, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onAudioFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i2 == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i2 == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.d("RtcRoomEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRTCUser internalRTCUser, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onAudioFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i2 == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i2 == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.d("RtcRoomEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        LogUtil.d("RtcRoomEventHandler", "onFirstLocalVideoFrameCaptured...width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        LogUtil.d("RtcRoomEventHandler", "onFirstRemoteVideoFrameRendered...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            this.mRtcRoom.getRtcRoomHandler().onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onFirstRemoteVideoFrameRendered callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLiveTranscodingResult(String str, int i2) {
        if (i2 == 0) {
            i2 = 0;
        } else if (i2 == 1) {
            i2 = 1;
        } else if (i2 == 2) {
            i2 = 2;
        } else if (i2 == 3) {
            i2 = 3;
        } else if (i2 == 4) {
            i2 = 4;
        }
        LogUtil.d("RtcRoomEventHandler", "onTranscodingError error(" + i2 + ") url:" + str);
        try {
            this.mRtcRoom.getRtcRoomHandler().onLiveTranscodingResult(str, i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onTranscodingError callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onScreenVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i2 == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i2 == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onScreenVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.d("RtcRoomEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onScreenVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i2 == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i2 == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onScreenVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.d("RtcRoomEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        LogUtil.d("RtcRoomEventHandler", "onUserBinaryMessageReceived: uid:" + str + "binary message length" + byteBuffer.capacity());
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserJoined(UserInfo userInfo, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo() + ", elapsed: " + i2);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserJoined(userInfo, i2);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserJoined callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
        LogUtil.d("RtcRoomEventHandler", "onUserMuteAudio... uid: " + str + ", muteState: " + muteState.value());
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMuteAudio(str, muteState);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserMuteAudio callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
        boolean z;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.d("RtcRoomEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMuteVideo(str, muteState);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onUserMuteVideo callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i2 == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i2 == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
        } catch (Exception unused) {
            LogUtil.d("RtcRoomEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i2) {
        LogUtil.d("RtcRoomEventHandler", "onVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i2 == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i2 == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
        } catch (Exception unused) {
            LogUtil.d("RtcRoomEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i2, int i3) {
        try {
            IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRTCEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i4 = 0; i4 < internalAudioVolumeInfoArr.length; i4++) {
                audioVolumeInfoArr[i4] = new IRTCEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i4]);
            }
            this.mRtcRoom.getRtcRoomHandler().onAudioVolumeIndication(audioVolumeInfoArr, i2, i3);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
        LogUtil.d("RtcRoomEventHandler", "onLocalVideoStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        LogUtil.d("RtcRoomEventHandler", "onRemoteAudioStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRemoteAudioStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        LogUtil.d("RtcRoomEventHandler", "onRemoteVideoStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onRemoteVideoStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamSubscribed(int i2, String str, SubscribeConfig subscribeConfig) {
        LogUtil.d("RtcRoomEventHandler", "onStreamSubscribed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamSubscribed(i2, str, subscribeConfig);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onStreamSubscribed callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onJoinRoomResult(String str, String str2, int i2, int i3, int i4) {
        LogUtil.d("RtcRoomEventHandler", "onJoinRoomResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onJoinRoomResult(str, str2, i2, i3, i4);
        } catch (Exception e2) {
            LogUtil.d("RtcRoomEventHandler", "onJoinRoomResult callback catch exception.\n" + e2.getMessage());
        }
    }
}
