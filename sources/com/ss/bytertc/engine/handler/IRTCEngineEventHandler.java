package com.ss.bytertc.engine.handler;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.bytertc.engine.InternalAudioVolumeInfo;
import com.ss.bytertc.engine.InternalLocalAudioStats;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalLocalVideoStats;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteAudioStats;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.InternalRemoteVideoStats;
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
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import org.json.JSONObject;

public abstract class IRTCEngineEventHandler {

    public static class MediaDeviceError {
        static {
            Covode.recordClassIndex(100925);
        }
    }

    public static class RtcErrorCodeDescription {
        static {
            Covode.recordClassIndex(100941);
        }
    }

    public static class WarningCode {
        static {
            Covode.recordClassIndex(100948);
        }
    }

    static {
        Covode.recordClassIndex(100912);
    }

    public void onActiveSpeaker(String str) {
    }

    public void onAudioEffectFinished(int i2) {
    }

    public void onAudioFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioMixingStateChanged(int i2, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i2) {
    }

    public void onConnectionStateChanged(int i2, int i3) {
    }

    public void onError(int i2) {
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onGetPeerOnlineStatus(String str, int i2) {
    }

    public void onHttpProxyState(int i2) {
    }

    public void onHttpsProxyState(int i2) {
    }

    public void onJoinRoomResult(String str, String str2, int i2, int i3, int i4) {
    }

    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onLiveTranscodingResult(String str, int i2) {
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
    }

    public void onLoginResult(String str, int i2, int i3) {
    }

    public void onLogout() {
    }

    public void onMediaDeviceStateChanged(String str, int i2, int i3, int i4) {
    }

    public void onMirrorStateChanged(boolean z) {
    }

    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
    }

    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
    }

    public void onNetworkTypeChanged(int i2) {
    }

    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, RecordingState recordingState, RecordingErrorCode recordingErrorCode, RecordingInfo recordingInfo) {
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    public void onRemoteUserAudioRecvModeChange(String str, RTCEngine.RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteUserAudioSendModeChange(String str, RTCEngine.RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    public void onResponse(String str) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onRoomMessageSendResult(long j2, int i2) {
    }

    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    public void onScreenVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onServerMessageSendResult(long j2, int i2) {
    }

    public void onServerParamsSetResult(int i2) {
    }

    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onSocks5ProxyState(int i2, String str, String str2, String str3, String str4) {
    }

    public void onStreamAdd(RTCStream rTCStream) {
    }

    public void onStreamPublishSuccess(String str, boolean z) {
    }

    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
    }

    public void onSubscribe(String str, boolean z) {
    }

    public void onSysStats(SysStats sysStats) {
    }

    public void onUnSubscribe(String str, boolean z) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
    }

    public void onUserJoined(UserInfo userInfo, int i2) {
    }

    public void onUserLeave(String str, int i2) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
    }

    public void onUserMessageSendResult(long j2, int i2) {
    }

    public void onUserMessageSendResultOutsideRoom(long j2, int i2) {
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
    }

    public void onUserStartAudioCapture(String str) {
    }

    public void onUserStartVideoCapture(String str) {
    }

    public void onUserStopAudioCapture(String str) {
    }

    public void onUserStopVideoCapture(String str) {
    }

    public void onVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onWarning(int i2) {
    }

    public enum ConnectionState {
        CONNECTION_STATE_DISCONNECTED(1),
        CONNECTION_STATE_CONNECTING(2),
        CONNECTION_STATE_CONNECTED(3),
        CONNECTION_STATE_RECONNECTING(4),
        CONNECTION_STATE_RECONNECTED(5),
        CONNECTION_STATE_LOST(6);
        
        private int value;

        public final int getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100914);
        }

        public static ConnectionState fromInt(int i2) {
            if (i2 <= 0 || i2 > 6) {
                return null;
            }
            return values()[i2 - 1];
        }

        private ConnectionState(int i2) {
            this.value = i2;
        }
    }

    public enum FallbackOrRecoverReason {
        FALLBACK_OR_RECOVER_REASON_UNKNOWN(-1),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH(0),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE(1),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH(2),
        FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE(3),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH(4),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE(5),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH(6),
        FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE(7);
        
        int value = -1;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100916);
        }

        private FallbackOrRecoverReason(int i2) {
            this.value = i2;
        }
    }

    public enum FirstFramePlayState {
        FIRST_FRAME_PLAY_STATE_PLAYING(0),
        FIRST_FRAME_PLAY_STATE_PLAYED(1),
        FIRST_FRAME_PLAY_STATE_END(2);
        
        private int state;

        public final int value() {
            return this.state;
        }

        static {
            Covode.recordClassIndex(100917);
        }

        private FirstFramePlayState(int i2) {
            this.state = i2;
        }
    }

    public enum FirstFrameSendState {
        FIRST_FRAME_SEND_STATE_SENDING(0),
        FIRST_FRAME_SEND_STATE_SENT(1),
        FIRST_FRAME_SEND_STAT_END(2);
        
        private int state;

        public final int value() {
            return this.state;
        }

        static {
            Covode.recordClassIndex(100918);
        }

        private FirstFrameSendState(int i2) {
            this.state = i2;
        }
    }

    public static class LocalAudioStats {
        public float audioLossRate;
        public int numChannels;
        public int recordSampleRate;
        public int rtt;
        public float sendKBitrate;
        public int sentSampleRate;
        public int statsInterval;

        static {
            Covode.recordClassIndex(100919);
        }

        public LocalAudioStats() {
        }

        public String toString() {
            return "LocalAudioStats{audioLossRate='" + this.audioLossRate + '\'' + ", sendKBitrate='" + this.sendKBitrate + '\'' + ", recordSampleRate='" + this.recordSampleRate + '\'' + ", rtt='" + this.rtt + '\'' + ", numChannels='" + this.numChannels + '\'' + ", sentSampleRate='" + this.sentSampleRate + '\'' + '}';
        }

        public LocalAudioStats(InternalLocalAudioStats internalLocalAudioStats) {
            this.audioLossRate = internalLocalAudioStats.audioLossRate;
            this.sendKBitrate = (float) internalLocalAudioStats.sendKBitrate;
            this.recordSampleRate = internalLocalAudioStats.recordSampleRate;
            this.statsInterval = internalLocalAudioStats.statsInterval;
            this.rtt = internalLocalAudioStats.rtt;
            this.numChannels = internalLocalAudioStats.numChannels;
            this.sentSampleRate = internalLocalAudioStats.sentSampleRate;
        }
    }

    public static class LocalStreamStats {
        public LocalAudioStats audioStats;
        public boolean isScreen;
        public int rxQuality;
        public int txQuality;
        public LocalVideoStats videoStats;

        static {
            Covode.recordClassIndex(100920);
        }

        public LocalStreamStats() {
        }

        public String toString() {
            return "LocalStreamStats{audioStats=" + this.audioStats + ", videoStats=" + this.videoStats + ", isScreen=" + this.isScreen + ", txQuality=" + this.txQuality + ", rxQuality=" + this.rxQuality + '}';
        }

        public LocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
            LocalAudioStats localAudioStats = new LocalAudioStats(internalLocalStreamStats.audioStats);
            LocalVideoStats localVideoStats = new LocalVideoStats(internalLocalStreamStats.videoStats);
            this.audioStats = localAudioStats;
            this.videoStats = localVideoStats;
            this.isScreen = internalLocalStreamStats.isScreen;
            this.txQuality = internalLocalStreamStats.txQuality;
            this.rxQuality = internalLocalStreamStats.rxQuality;
        }
    }

    public static class LocalVideoStats {
        public int codecType;
        public int encodedBitrate;
        public int encodedFrameCount;
        public int encodedFrameHeight;
        public int encodedFrameWidth;
        public int encoderOutputFrameRate;
        public int inputFrameRate;
        public boolean isScreen;
        public int rendererOutputFrameRate;
        public int rtt;
        public int sentFrameRate;
        public float sentKBitrate;
        public int statsInterval;
        public int targetFrameRate;
        public int targetKBitrate;
        public float videoLossRate;

        static {
            Covode.recordClassIndex(100921);
        }

        public LocalVideoStats() {
        }

        public String toString() {
            return "LocalVideoStats{sentKBitrate='" + this.sentKBitrate + '\'' + ", inputFrameRate='" + this.inputFrameRate + '\'' + ", sentFrameRate='" + this.sentFrameRate + '\'' + ", encoderOutputFrameRate='" + this.encoderOutputFrameRate + '\'' + ", rendererOutputFrameRate='" + this.rendererOutputFrameRate + '\'' + ", targetKBitrate='" + this.targetKBitrate + '\'' + ", targetFrameRate='" + this.targetFrameRate + '\'' + ", videoLossRate='" + this.videoLossRate + '\'' + ", rtt='" + this.rtt + '\'' + ", encodedBitrate='" + this.encodedBitrate + '\'' + ", encodedFrameWidth='" + this.encodedFrameWidth + '\'' + ", encodedFrameHeight='" + this.encodedFrameHeight + '\'' + ", encodedFrameCount='" + this.encodedFrameCount + '\'' + ", codecType='" + this.codecType + '\'' + ", isScreen='" + this.isScreen + '\'' + '}';
        }

        public LocalVideoStats(InternalLocalVideoStats internalLocalVideoStats) {
            this.sentKBitrate = internalLocalVideoStats.sentKBitrate;
            this.inputFrameRate = internalLocalVideoStats.inputFrameRate;
            this.sentFrameRate = internalLocalVideoStats.sentFrameRate;
            this.encoderOutputFrameRate = internalLocalVideoStats.encoderOutputFrameRate;
            this.rendererOutputFrameRate = internalLocalVideoStats.rendererOutputFrameRate;
            this.targetKBitrate = internalLocalVideoStats.targetKBitrate;
            this.targetFrameRate = internalLocalVideoStats.targetFrameRate;
            this.statsInterval = internalLocalVideoStats.statsInterval;
            this.videoLossRate = internalLocalVideoStats.videoLossRate;
            this.rtt = internalLocalVideoStats.rtt;
            this.encodedBitrate = internalLocalVideoStats.encodedBitrate;
            this.encodedFrameWidth = internalLocalVideoStats.encodedFrameWidth;
            this.encodedFrameHeight = internalLocalVideoStats.encodedFrameHeight;
            this.encodedFrameCount = internalLocalVideoStats.encodedFrameCount;
            this.codecType = internalLocalVideoStats.codecType;
            this.isScreen = internalLocalVideoStats.isScreen;
        }
    }

    public enum LocalVideoStreamError {
        LOCAL_VIDEO_STREAM_ERROR_OK(0),
        LOCAL_VIDEO_STREAM_ERROR_FAILURE(1),
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_NO_PERMISSION(2),
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_BUSY(3),
        LOCAL_VIDEO_STREAM_ERROR_DEVICE_NOT_FOUND(4),
        LOCAL_VIDEO_STREAM_ERROR_CAPTURE_FAILURE(5),
        LOCAL_VIDEO_STREAM_ERROR_ENCODE_FAILURE(6);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100922);
        }

        public static LocalVideoStreamError fromId(int i2) {
            LocalVideoStreamError[] values = values();
            for (LocalVideoStreamError localVideoStreamError : values) {
                if (localVideoStreamError.value() == i2) {
                    return localVideoStreamError;
                }
            }
            return null;
        }

        private LocalVideoStreamError(int i2) {
            this.value = i2;
        }
    }

    public enum LocalVideoStreamState {
        LOCAL_VIDEO_STREAM_STATE_STOPPED(0),
        LOCAL_VIDEO_STREAM_STATE_RECORDING(1),
        LOCAL_VIDEO_STREAM_STATE_ENCODING(2),
        LOCAL_VIDEO_STREAM_STATE_FAILED(3);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100923);
        }

        public static LocalVideoStreamState fromId(int i2) {
            LocalVideoStreamState[] values = values();
            for (LocalVideoStreamState localVideoStreamState : values) {
                if (localVideoStreamState.value() == i2) {
                    return localVideoStreamState;
                }
            }
            return null;
        }

        private LocalVideoStreamState(int i2) {
            this.value = i2;
        }
    }

    public static class MediaDeviceState {
        static {
            Covode.recordClassIndex(100926);
        }

        MediaDeviceState() {
        }
    }

    public static class MediaDeviceType {
        static {
            Covode.recordClassIndex(100927);
        }

        MediaDeviceType() {
        }
    }

    public static class RTCRoomStats {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int rtt;
        public int rxAudioKBitRate;
        public long rxBytes;
        public int rxKBitRate;
        public double rxLostrate;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioKBitRate;
        public long txBytes;
        public int txKBitRate;
        public double txLostrate;
        public int txVideoKBitRate;
        public int users;

        static {
            Covode.recordClassIndex(100932);
        }

        public RTCRoomStats() {
        }

        public void reset() {
            this.totalDuration = 0;
            this.txBytes = 0;
            this.rxBytes = 0;
            this.txKBitRate = 0;
            this.rxKBitRate = 0;
            this.txAudioKBitRate = 0;
            this.rxAudioKBitRate = 0;
            this.txVideoKBitRate = 0;
            this.rxVideoKBitRate = 0;
            this.users = 0;
            this.cpuTotalUsage = 0.0d;
            this.cpuAppUsage = 0.0d;
        }

        public String toString() {
            return "RtcStats{totalDuration=" + this.totalDuration + ", txBytes=" + this.txBytes + ", rxBytes=" + this.rxBytes + ", txKBitRate=" + this.txKBitRate + ", rxKBitRate=" + this.rxKBitRate + ", txAudioKBitRate=" + this.txAudioKBitRate + ", rxAudioKBitRate=" + this.rxAudioKBitRate + ", txVideoKBitRate=" + this.txVideoKBitRate + ", rxVideoKBitRate=" + this.rxVideoKBitRate + ", users=" + this.users + ", cpuTotalUsage=" + this.cpuTotalUsage + ", cpuAppUsage=" + this.cpuAppUsage + '}';
        }

        public RTCRoomStats(InternalRTCStats internalRTCStats) {
            this.totalDuration = internalRTCStats.totalDuration;
            this.txBytes = (long) internalRTCStats.txBytes;
            this.rxBytes = (long) internalRTCStats.rxBytes;
            this.txKBitRate = internalRTCStats.txKBitRate;
            this.rxKBitRate = internalRTCStats.rxKBitRate;
            this.txAudioKBitRate = internalRTCStats.txAudioKBitRate;
            this.rxAudioKBitRate = internalRTCStats.rxAudioKBitRate;
            this.txVideoKBitRate = internalRTCStats.txVideoKBitRate;
            this.rxVideoKBitRate = internalRTCStats.rxVideoKBitRate;
            this.users = internalRTCStats.users;
            this.cpuTotalUsage = internalRTCStats.cpuTotalUsage;
            this.cpuAppUsage = internalRTCStats.cpuAppUsage;
            this.txLostrate = internalRTCStats.txLostrate;
            this.rxLostrate = internalRTCStats.rxLostrate;
            this.rtt = internalRTCStats.rtt;
        }
    }

    public enum RecordingErrorCode {
        RECORDING_ERROR_CODE_OK(0),
        RECORDING_ERROR_CODE_NO_PERMISSION(-1),
        RECORDING_ERROR_CODE_NOT_SUPPORT(-2),
        RECORDING_ERROR_CODE_NO_OTHER(-3);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100933);
        }

        public static RecordingErrorCode fromId(int i2) {
            RecordingErrorCode[] values = values();
            for (RecordingErrorCode recordingErrorCode : values) {
                if (recordingErrorCode.value() == i2) {
                    return recordingErrorCode;
                }
            }
            return null;
        }

        private RecordingErrorCode(int i2) {
            this.value = i2;
        }
    }

    public enum RecordingState {
        RECORDING_STATE_ERROE(0),
        RECORDING_STATE_PROCESSING(1),
        RECORDING_STATE_SUCCESS(2);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100934);
        }

        public static RecordingState fromId(int i2) {
            RecordingState[] values = values();
            for (RecordingState recordingState : values) {
                if (recordingState.value() == i2) {
                    return recordingState;
                }
            }
            return null;
        }

        private RecordingState(int i2) {
            this.value = i2;
        }
    }

    public static class RemoteAudioStats {
        public float audioLossRate;
        public int concealedSamples;
        public int concealmentEvent;
        public int decDuration;
        public int decSampleRate;
        public long e2eDelay;
        public int frozenRate;
        public int jitterBufferDelay;
        public int numChannels;
        public int playoutSampleRate;
        public int quality;
        public float receivedKBitrate;
        public int receivedSampleRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public int total_rtt;

        static {
            Covode.recordClassIndex(100935);
        }

        public RemoteAudioStats() {
        }

        public String toString() {
            return "RemoteAudioStats{audioLossRate='" + this.audioLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", playoutSampleRate='" + this.playoutSampleRate + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + ", rtt='" + this.rtt + '\'' + ", quality='" + this.quality + '\'' + ", jitterBufferDelay='" + this.jitterBufferDelay + '\'' + ", numChannels='" + this.numChannels + '\'' + ", receivedSampleRate='" + this.receivedSampleRate + '\'' + ", frozenRate='" + this.frozenRate + '\'' + ", concealedSamples='" + this.concealedSamples + '\'' + ", concealmentEvent='" + this.concealmentEvent + '\'' + ", decSampleRate='" + this.decSampleRate + '\'' + ", decDuration='" + this.decDuration + '\'' + ", total_rtt='" + this.total_rtt + '\'' + '}';
        }

        public RemoteAudioStats(InternalRemoteAudioStats internalRemoteAudioStats) {
            this.audioLossRate = internalRemoteAudioStats.audioLossRate;
            this.receivedKBitrate = (float) internalRemoteAudioStats.receivedKBitrate;
            this.stallCount = internalRemoteAudioStats.stallCount;
            this.stallDuration = internalRemoteAudioStats.stallDuration;
            this.e2eDelay = internalRemoteAudioStats.e2eDelay;
            this.playoutSampleRate = internalRemoteAudioStats.playoutSampleRate;
            this.statsInterval = internalRemoteAudioStats.statsInterval;
            this.rtt = internalRemoteAudioStats.rtt;
            this.total_rtt = internalRemoteAudioStats.total_rtt;
            this.quality = internalRemoteAudioStats.quality;
            this.jitterBufferDelay = internalRemoteAudioStats.jitterBufferDelay;
            this.numChannels = internalRemoteAudioStats.numChannels;
            this.receivedSampleRate = internalRemoteAudioStats.receivedSampleRate;
            this.frozenRate = internalRemoteAudioStats.frozenRate;
            this.concealedSamples = internalRemoteAudioStats.concealedSamples;
            this.concealmentEvent = internalRemoteAudioStats.concealmentEvent;
            this.decSampleRate = internalRemoteAudioStats.decSampleRate;
            this.decDuration = internalRemoteAudioStats.decDuration;
        }
    }

    public static class RemoteStreamStats {
        public RemoteAudioStats audioStats;
        public boolean isScreen;
        public int rxQuality;
        public int txQuality;
        public String uid;
        public RemoteVideoStats videoStats;

        static {
            Covode.recordClassIndex(100936);
        }

        public RemoteStreamStats() {
        }

        public String toString() {
            return "RemoteStreamStats{uid='" + this.uid + '\'' + ", audioStats=" + this.audioStats + ", videoStats=" + this.videoStats + ", isScreen=" + this.isScreen + ", txQuality=" + this.txQuality + ", rxQuality=" + this.rxQuality + '}';
        }

        public RemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
            RemoteAudioStats remoteAudioStats = new RemoteAudioStats(internalRemoteStreamStats.audioStats);
            RemoteVideoStats remoteVideoStats = new RemoteVideoStats(internalRemoteStreamStats.videoStats);
            this.audioStats = remoteAudioStats;
            this.videoStats = remoteVideoStats;
            this.uid = internalRemoteStreamStats.uid;
            this.isScreen = internalRemoteStreamStats.isScreen;
            this.rxQuality = internalRemoteStreamStats.rxQuality;
            this.txQuality = internalRemoteStreamStats.txQuality;
        }
    }

    public static class RemoteStreamSwitch {
        public boolean after_enable;
        public int after_video_index;
        public boolean before_enable;
        public int before_video_index;
        public boolean isScreen;
        public FallbackOrRecoverReason reason;
        public String uid;

        static {
            Covode.recordClassIndex(100937);
        }

        public RemoteStreamSwitch() {
        }

        public String toString() {
            return "RemoteStreamSwitch{uid='" + this.uid + '\'' + ", isScreen='" + this.isScreen + '\'' + ", before_video_index='" + this.before_video_index + '\'' + ", after_video_index='" + this.after_video_index + '\'' + ", before_enable='" + this.before_enable + '\'' + ", after_enable='" + this.after_enable + '\'' + ", reason='" + this.reason + '\'' + '}';
        }

        public RemoteStreamSwitch(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
            this.uid = internalRemoteStreamSwitch.uid;
            this.before_video_index = internalRemoteStreamSwitch.before_video_index;
            this.after_video_index = internalRemoteStreamSwitch.after_video_index;
            this.before_enable = internalRemoteStreamSwitch.before_enable;
            this.after_enable = internalRemoteStreamSwitch.after_enable;
            this.reason = getFallbackOrRecoverReason(internalRemoteStreamSwitch.reason);
        }

        private FallbackOrRecoverReason getFallbackOrRecoverReason(int i2) {
            switch (i2) {
                case 0:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_BANDWIDTH;
                case 1:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_FALLBACK_BY_PERFORMANCE;
                case 2:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_BANDWIDTH;
                case 3:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_SUBSCRIBE_RECOVER_BY_PERFORMANCE;
                case 4:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_BANDWIDTH;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_FALLBACK_BY_PERFORMANCE;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_BANDWIDTH;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_PUBLISH_RECOVER_BY_PERFORMANCE;
                default:
                    return FallbackOrRecoverReason.FALLBACK_OR_RECOVER_REASON_UNKNOWN;
            }
        }
    }

    public enum RemoteVideoState {
        REMOTE_VIDEO_STATE_STOPPED(0),
        REMOTE_VIDEO_STATE_STARTING(1),
        REMOTE_VIDEO_STATE_DECODING(2),
        REMOTE_VIDEO_STATE_FROZEN(3),
        REMOTE_VIDEO_STATE_FAILED(4);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100938);
        }

        public static RemoteVideoState fromId(int i2) {
            RemoteVideoState[] values = values();
            for (RemoteVideoState remoteVideoState : values) {
                if (remoteVideoState.value() == i2) {
                    return remoteVideoState;
                }
            }
            return null;
        }

        private RemoteVideoState(int i2) {
            this.value = i2;
        }
    }

    public enum RemoteVideoStateChangeReason {
        REMOTE_VIDEO_STATE_CHANGE_REASON_INTERNAL(0),
        REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
        REMOTE_VIDEO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
        REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
        REMOTE_VIDEO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
        REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
        REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
        REMOTE_VIDEO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100939);
        }

        public static RemoteVideoStateChangeReason fromId(int i2) {
            RemoteVideoStateChangeReason[] values = values();
            for (RemoteVideoStateChangeReason remoteVideoStateChangeReason : values) {
                if (remoteVideoStateChangeReason.value() == i2) {
                    return remoteVideoStateChangeReason;
                }
            }
            return null;
        }

        private RemoteVideoStateChangeReason(int i2) {
            this.value = i2;
        }
    }

    public static class RemoteVideoStats {
        public int decoderOutputFrameRate;
        public long e2eDelay;
        public int frozenRate;
        public int height;
        public boolean isScreen;
        public float receivedKBitrate;
        public int rendererOutputFrameRate;
        public int rtt;
        public int stallCount;
        public int stallDuration;
        public int statsInterval;
        public int videoIndex;
        public float videoLossRate;
        public int width;

        static {
            Covode.recordClassIndex(100940);
        }

        public RemoteVideoStats() {
        }

        public String toString() {
            return "RemoteVideoStats{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", videoLossRate='" + this.videoLossRate + '\'' + ", receivedKBitrate='" + this.receivedKBitrate + '\'' + ", decoderOutputFrameRate='" + this.decoderOutputFrameRate + '\'' + ", rendererOutputFrameRate='" + this.rendererOutputFrameRate + '\'' + ", stallCount='" + this.stallCount + '\'' + ", stallDuration='" + this.stallDuration + '\'' + ", e2eDelay='" + this.e2eDelay + '\'' + ", isScreen='" + this.isScreen + '\'' + ", rtt='" + this.rtt + '\'' + ", frozenRate='" + this.frozenRate + '\'' + ", videoIndex='" + this.videoIndex + '\'' + '}';
        }

        public RemoteVideoStats(InternalRemoteVideoStats internalRemoteVideoStats) {
            this.width = internalRemoteVideoStats.width;
            this.height = internalRemoteVideoStats.height;
            this.videoLossRate = internalRemoteVideoStats.videoLossRate;
            this.receivedKBitrate = internalRemoteVideoStats.receivedKBitrate;
            this.decoderOutputFrameRate = internalRemoteVideoStats.decoderOutputFrameRate;
            this.rendererOutputFrameRate = internalRemoteVideoStats.rendererOutputFrameRate;
            this.stallCount = internalRemoteVideoStats.stallCount;
            this.e2eDelay = internalRemoteVideoStats.e2eDelay;
            this.isScreen = internalRemoteVideoStats.isScreen;
            this.statsInterval = internalRemoteVideoStats.statsInterval;
            this.rtt = internalRemoteVideoStats.rtt;
            this.frozenRate = internalRemoteVideoStats.frozenRate;
            this.videoIndex = internalRemoteVideoStats.videoIndex;
        }
    }

    public static class SourceWantedData {
        public int frameRate;
        public int height;
        public int width;

        static {
            Covode.recordClassIndex(100943);
        }

        public SourceWantedData() {
        }

        public String toString() {
            return "SourceWantedData{width='" + this.width + '\'' + ", height='" + this.height + '\'' + ", frameRate='" + this.frameRate + '\'' + '}';
        }

        public SourceWantedData(InternalSourceWantedData internalSourceWantedData) {
            this.width = internalSourceWantedData.width;
            this.height = internalSourceWantedData.height;
            this.frameRate = internalSourceWantedData.frameRate;
        }
    }

    public enum PerformanceAlarmMode {
        PERFORMANCE_ALARM_MODE_NORMAL,
        PERFORMANCE_ALARM_MODE_SIMULCAST;

        static {
            Covode.recordClassIndex(100929);
        }
    }

    public enum PerformanceAlarmReason {
        PERFORMANCE_ALARM_REASON_BANDWIDTH_FALLBACKED,
        PERFORMANCE_ALARM_REASON_BANDWIDTH_RESUMED,
        PERFORMANCE_ALARM_REASON_PERFORMANCE_FALLBACKED,
        PERFORMANCE_ALARM_REASON_PERFORMANCE_RESUMED;

        static {
            Covode.recordClassIndex(100930);
        }
    }

    public static class RtcUser {
        public String metaData;
        public String userId;

        static {
            Covode.recordClassIndex(100942);
        }

        public String toString() {
            return "RtcUser{uid='" + this.userId + '\'' + ", metaData='" + this.metaData + '\'' + '}';
        }

        public RtcUser(InternalRTCUser internalRTCUser) {
            this.userId = internalRTCUser.userId;
            this.metaData = internalRTCUser.metaData;
        }
    }

    public enum StreamRemoveReason {
        STREAM_REMOVE_REASON_UNPUBLISH,
        STREAM_REMOVE_REASON_PUBLISH_FAILED,
        STREAM_REMOVE_REASON_KEEP_LIVE_FAILED,
        STREAM_REMOVE_REASON_CLIENT_DISCONNECTED,
        STREAM_REMOVE_REASON_REPUBLISH,
        STREAM_REMOVE_REASON_OTHER;

        static {
            Covode.recordClassIndex(100944);
        }
    }

    public class ErrorCode {
        static {
            Covode.recordClassIndex(100915);
        }

        ErrorCode() {
        }
    }

    public class LoginErrorCode {
        static {
            Covode.recordClassIndex(100924);
        }

        public LoginErrorCode() {
        }
    }

    public class NetworkQuality {
        static {
            Covode.recordClassIndex(100928);
        }

        NetworkQuality() {
        }
    }

    public class ProviderEvent {
        static {
            Covode.recordClassIndex(100931);
        }

        ProviderEvent() {
        }
    }

    public class TranscodingError {
        static {
            Covode.recordClassIndex(100945);
        }

        TranscodingError() {
        }
    }

    public class USER_ONLINE_STATUS {
        static {
            Covode.recordClassIndex(100946);
        }

        public USER_ONLINE_STATUS() {
        }
    }

    public class UserMessageSendResult {
        static {
            Covode.recordClassIndex(100947);
        }

        public UserMessageSendResult() {
        }
    }

    public static class AudioVolumeInfo {
        public String uid;
        public int volume;

        static {
            Covode.recordClassIndex(100913);
        }

        public AudioVolumeInfo(InternalAudioVolumeInfo internalAudioVolumeInfo) {
            this.uid = internalAudioVolumeInfo.uid;
            this.volume = internalAudioVolumeInfo.volume;
        }

        public AudioVolumeInfo(String str, int i2) {
            this.uid = str;
            this.volume = i2;
        }
    }
}
