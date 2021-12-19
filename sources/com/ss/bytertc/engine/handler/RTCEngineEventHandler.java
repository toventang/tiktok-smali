package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.InternalAudioVolumeInfo;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.InternalSourceWantedData;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.SubscribeState;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RecordingInfo;
import com.ss.bytertc.engine.data.RecordingProgress;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

public class RTCEngineEventHandler {
    private long mJoinChannelTime;
    private String mRoom;
    private WeakReference<RTCEngineImpl> mRtcEngineImpl;
    private String mSession;
    private State mState = State.IDLE;
    private String mUser;

    static {
        Covode.recordClassIndex(100955);
    }

    enum State {
        IDLE,
        IN_ROOM;

        static {
            Covode.recordClassIndex(100956);
        }
    }

    public void onAudioMixingFinished() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioMixingFinished...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingFinished();
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onAudioMixingFinished callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLogout() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLogout");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLogout();
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onLogout callback catch exception.\n" + e2.getMessage());
        }
    }

    public void setJoinChannelTime(long j2) {
        this.mJoinChannelTime = j2;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2);
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcEngineEventHandler", "onLeaveChannel...");
    }

    public RTCEngineEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public void onActiveSpeaker(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onActiveSpeaker...uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onActiveSpeaker(str);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onActiveSpeaker callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onAudioEffectFinished(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioEffectFinished...soundId: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioEffectFinished(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onAudioEffectFinished callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onConnectionStateChanged(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.i("RtcEngineEventHandler", "onConnectionStateChanged, state: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionStateChanged(i2, -1);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onConnectionStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onError(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onError...errorNum: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onError(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onError callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onHttpProxyState(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.i("RtcEngineEventHandler", "onHttpProxyState, state: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpProxyState(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onHttpProxyState callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onHttpsProxyState(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.i("RtcEngineEventHandler", "onHttpsProxyState, state: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpsProxyState(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onHttpsProxyState callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalStreamStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalStreamStats(new IRTCEngineEventHandler.LocalStreamStats(internalLocalStreamStats));
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onLocalStreamStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onMirrorStateChanged(boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onMirrorStateChanged: ".concat(String.valueOf(z)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMirrorStateChanged(z);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onMirrorStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onNetworkTypeChanged(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.i("RtcEngineEventHandler", "onNetworkTypeChanged, type: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTypeChanged(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onNetworkTypeChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onResponse(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onResponse, res: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onResponse(str);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onResponse callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRtcStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomStats(new IRTCEngineEventHandler.RTCRoomStats(internalRTCStats));
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRtcStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onServerParamsSetResult(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onServerParamsSetResult: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onServerParamsSetResult(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onServerParamsSetResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamAdd...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamAdd(rTCStream);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onStreamAdd callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStartAudioCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserStartAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartAudioCapture(str);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserStartAudioCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStartVideoCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserStartVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartVideoCapture(str);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserStartVideoCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStopAudioCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserStopAudioCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopAudioCapture(str);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserStopAudioCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserStopVideoCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserStopVideoCapture... uid: ".concat(String.valueOf(str)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopVideoCapture(str);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserStopVideoCapture callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onWarning(int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onWarning, warnNum: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onWarning(i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onWarning callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioPlaybackDeviceChanged...device: " + audioPlaybackDevice.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onAudioPlaybackDeviceChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onFirstLocalAudioFrame...streamIndex: " + streamIndex.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onFirstLocalAudioFrame callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onFirstRemoteAudioFrame...uid: " + remoteStreamKey.getUserId() + ", roomid: " + remoteStreamKey.getRoomId() + ", streamIndex: " + remoteStreamKey.getStreamIndex().value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteAudioFrame(remoteStreamKey);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onFirstRemoteAudioFrame callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteStreamStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                int i2 = 0;
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
                rtcEngineHandler.onRemoteStreamStats(new IRTCEngineEventHandler.RemoteStreamStats(internalRemoteStreamStats));
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteStreamStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSysStats(SysStats sysStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.e("RtcEngineEventHandler", "onSysStats... " + sysStats.toString());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSysStats(sysStats);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onSysStats callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onSimulcastSubscribeFallback, uid: " + internalRemoteStreamSwitch.uid + ", isScreen: " + internalRemoteStreamSwitch.isScreen + ", before_video_index: " + internalRemoteStreamSwitch.before_video_index + ", after_video_index: " + internalRemoteStreamSwitch.after_video_index + ", before_enable: " + internalRemoteStreamSwitch.before_enable + ", after_enable: " + internalRemoteStreamSwitch.after_enable + ", reason: " + internalRemoteStreamSwitch.reason);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSimulcastSubscribeFallback(new IRTCEngineEventHandler.RemoteStreamSwitch(internalRemoteStreamSwitch));
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteStreamSwitch callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onLocalAudioStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRoomMessageReceived: ".concat(String.valueOf(str2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageReceived(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRoomMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamPublishSucceed...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamPublishSuccess(str, z);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onStreamPublishSucceed callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onAudioFramePlayStateChanged(InternalRTCUser internalRTCUser, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i2 == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i2 == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRTCUser internalRTCUser, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i2 == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i2 == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRTCEngineEventHandler.AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i3 = 0; i3 < internalAudioVolumeInfoArr.length; i3++) {
                audioVolumeInfoArr[i3] = new IRTCEngineEventHandler.AudioVolumeInfo(internalAudioVolumeInfoArr[i3]);
            }
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (!(rTCEngineImpl == null || (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) == null)) {
                rtcEngineHandler.onAudioVolumeIndication(audioVolumeInfoArr, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onAudioVolumeIndication callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onFirstLocalVideoFrame...width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onFirstLocalVideoFrame callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onFirstRemoteVideoFrameRendered...uid: " + remoteStreamKey.getUserId() + ", StreamIndex:" + remoteStreamKey.getStreamIndex() + ", width: " + videoFrameInfo.getWidth() + ", height: " + videoFrameInfo.getHeight());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onFirstRemoteVideoFrameRendered callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onGetPeerOnlineStatus(String str, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onGetPeerOnlineStatus: " + str + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onGetPeerOnlineStatus(str, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onGetPeerOnlineStatus callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLiveTranscodingResult(String str, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
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
        LogUtil.d("RtcEngineEventHandler", "OnTranscodingError error(" + i2 + ") url:" + str);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLiveTranscodingResult(str, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "OnTranscodingError callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalVideoSizeChanged... streamIndex: " + streamIndex + ", frameInfo: " + videoFrameInfo);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onLocalVideoSizeChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLogReport(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
                    if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                        rtcEngineHandler.onLogReport(str, jSONObject);
                    }
                } catch (JSONException e2) {
                    LogUtil.d("RtcEngineEventHandler", "onLogReport...parse json catch exception: " + e2.getMessage());
                }
            } else {
                LogUtil.i(str, str2);
            }
        } catch (Exception e3) {
            LogUtil.e("RtcEngineEventHandler", "onLogReport callback catch exception.\n" + e3.getMessage());
        }
    }

    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onMuteAllRemoteAudio... uid: " + str + ", muteState: " + muteState.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteAudio(str, muteState);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onMuteAllRemoteAudio callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onMuteAllRemoteVideo... uid: " + str + ", muteState: " + muteState);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteVideo(str, muteState);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onMuteAllRemoteVideo callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteUserAudioRecvModeChange(String str, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "remote user audio recv mode change: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioRecvModeChange(str, RTCEngine.RangeAudioMode.values()[i2]);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteUserAudioRecvModeChange callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteUserAudioSendModeChange(String str, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "remote user audio send mode change: ".concat(String.valueOf(i2)));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioSendModeChange(str, RTCEngine.RangeAudioMode.values()[i2]);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteUserAudioSendModeChange callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteVideoSizeChanged... RemoteStreamKey: " + remoteStreamKey + ", frameInfo: " + videoFrameInfo);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteVideoSizeChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRoomBinaryMessageReceived, length: " + byteBuffer.capacity());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRoomBinaryMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRoomMessageSendResult(long j2, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRoomMessageSendResult: " + j2 + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageSendResult(j2, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRoomMessageSendResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onScreenVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i2 == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i2 == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onScreenVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i2 == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i2 == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onServerMessageSendResult(long j2, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onServerMessageSendResult: " + j2 + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onServerMessageSendResult(j2, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onServerMessageSendResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamRemove...uid: " + rTCStream.userId);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamRemove(rTCStream, IRTCEngineEventHandler.StreamRemoveReason.values()[i2]);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onStreamRemove callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSubscribe(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSubscribe(str, z);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onSubsribe callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUnSubscribe, uesr_id: " + str + ", isReconnect: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUnSubscribe(str, z);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUnSubscribe callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserBinaryMessageReceived: " + str + byteBuffer.capacity());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserBinaryMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserBinaryMessageReceivedOutsideRoom: " + str + byteBuffer.capacity());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceivedOutsideRoom(str, byteBuffer);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserBinaryMessageReceivedOutsideRoom callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserEnableLocalAudio... uid: " + str + ", enabled: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserEnableLocalAudio(str, z);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserEnableLocalAudio callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserJoined(UserInfo userInfo, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserJoined... uid: " + userInfo.getUid() + ", extraInfo: " + userInfo.getExtraInfo() + ", elapsed: " + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserJoined(userInfo, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserJoined callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserLeave(String str, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserLeave... uid: " + str + ", reason: " + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserLeave(str, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserLeave callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserMessageReceived: " + str + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceived(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserMessageReceived callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserMessageReceivedOutsideRoom: " + str + str2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceivedOutsideRoom(str, str2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserMessageReceivedOutsideRoom callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMessageSendResult(long j2, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserMessageSendResult: " + j2 + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResult(j2, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserMessageSendResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMessageSendResultOutsideRoom(long j2, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserMessageSendResultOutsideRoom: " + j2 + i2);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResultOutsideRoom(j2, i2);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserMessageSendResultOutsideRoom callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onUserMuteAudio... uid: " + str + ", muteState: " + muteState.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteAudio(str, muteState);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserMuteAudio callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
        boolean z;
        IRTCEngineEventHandler rtcEngineHandler;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        LogUtil.d("RtcEngineEventHandler", "onUserMuteVideo... uid: " + str + ", muted: " + z);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteVideo(str, muteState);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onUserMuteVideo callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onVideoFramePlayStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFramePlayState firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i2 == 0) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        } else if (i2 == 1) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
        } else if (i2 == 2) {
            firstFramePlayState = IRTCEngineEventHandler.FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onVideoFrameSendStateChanged, user: " + internalRTCUser + ", state: " + i2);
        IRTCEngineEventHandler.FirstFrameSendState firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i2 == 0) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        } else if (i2 == 1) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
        } else if (i2 == 2) {
            firstFrameSendState = IRTCEngineEventHandler.FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(new IRTCEngineEventHandler.RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, IRTCEngineEventHandler.LocalVideoStreamState localVideoStreamState, IRTCEngineEventHandler.LocalVideoStreamError localVideoStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onLocalVideoStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteAudioStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, IRTCEngineEventHandler.RemoteVideoState remoteVideoState, IRTCEngineEventHandler.RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRemoteVideoStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onStreamSubscribed(int i2, String str, SubscribeConfig subscribeConfig) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamSubscribed...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSubscribed(SubscribeState.values()[i2], str, subscribeConfig);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onStreamSubscribed callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onAudioMixingStateChanged(int i2, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioMixingStateChanged... id: " + i2 + ", state: " + audioMixingState.value() + ", error: " + audioMixingError.value());
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingStateChanged(i2, audioMixingState, audioMixingError);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onAudioMixingStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onLoginResult(String str, int i2, int i3) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "OnLoginResult: " + str + i2 + i3);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLoginResult(str, i2, i3);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onLoginResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRecordingProgressUpdate, StreamIndex: " + streamIndex + ", progress.dur: " + recordingProgress.duration + ", progress.fileSize: " + recordingProgress.fileSize + ", info.filePath: " + recordingInfo.filePath);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRecordingProgressUpdate(streamIndex, recordingProgress, recordingInfo);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRecordingProgressUpdate callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onMediaDeviceStateChanged(String str, int i2, int i3, int i4) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onMediaDeviceStateChanged, MediaDeviceType: " + i2 + ", device_state: " + i3);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMediaDeviceStateChanged(str, i2, i3, i4);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onMediaDeviceStateChanged callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onPerformanceAlarms(int i2, String str, int i3, InternalSourceWantedData internalSourceWantedData) {
        IRTCEngineEventHandler.PerformanceAlarmReason performanceAlarmReason;
        IRTCEngineEventHandler.PerformanceAlarmMode performanceAlarmMode;
        LogUtil.d("RtcEngineEventHandler", "onPerformanceAlarms, level: " + i3 + ", data: " + internalSourceWantedData);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null) {
                if (i3 == 0) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_BANDWIDTH_FALLBACKED;
                } else if (i3 == 1) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_BANDWIDTH_RESUMED;
                } else if (i3 == 2) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_PERFORMANCE_FALLBACKED;
                } else if (i3 != 3) {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_PERFORMANCE_RESUMED;
                } else {
                    performanceAlarmReason = IRTCEngineEventHandler.PerformanceAlarmReason.PERFORMANCE_ALARM_REASON_PERFORMANCE_RESUMED;
                }
                IRTCEngineEventHandler rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler();
                if (rtcEngineHandler != null) {
                    if (i2 == 0) {
                        performanceAlarmMode = IRTCEngineEventHandler.PerformanceAlarmMode.PERFORMANCE_ALARM_MODE_NORMAL;
                    } else {
                        performanceAlarmMode = IRTCEngineEventHandler.PerformanceAlarmMode.PERFORMANCE_ALARM_MODE_SIMULCAST;
                    }
                    rtcEngineHandler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, new IRTCEngineEventHandler.SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onPerformanceAlarms callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, int i2, int i3, RecordingInfo recordingInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRecordingStateUpdate, StreamIndex: " + streamIndex + ", RecordingState: " + i2 + ", RecordingErrorCode: " + i3 + ", info.filePath: " + recordingInfo.filePath);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRecordingStateUpdate(streamIndex, IRTCEngineEventHandler.RecordingState.fromId(i2), IRTCEngineEventHandler.RecordingErrorCode.fromId(i3), recordingInfo);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onRecordingStateUpdate callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onJoinRoomResult(String str, String str2, int i2, int i3, int i4) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onJoinRoomResult...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onJoinRoomResult(str, str2, i2, i3, i4);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onJoinRoomResult callback catch exception.\n" + e2.getMessage());
        }
    }

    public void onSocks5ProxyState(int i2, String str, String str2, String str3, String str4) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.i("RtcEngineEventHandler", "onSocks5ProxyState, state: " + i2 + ", cmd: " + str + ", proxy_address: " + str2 + ", local_address: " + str3 + ", remote_address: " + str4);
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSocks5ProxyState(i2, str, str2, str3, str4);
            }
        } catch (Exception e2) {
            LogUtil.e("RtcEngineEventHandler", "onSocks5ProxyState callback catch exception.\n" + e2.getMessage());
        }
    }
}
