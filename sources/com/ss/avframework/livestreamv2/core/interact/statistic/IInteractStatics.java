package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.util.Map;

public interface IInteractStatics {
    static {
        Covode.recordClassIndex(100258);
    }

    void addRemoteUser(String str);

    void calcDurationFromInteractToLive();

    void calcDurationFromLiveToInteract();

    void getInteractConnectDurationInfo(long[] jArr);

    LocalUserStatistics.LocalUserStatisticInfo getLocalStatisticResult(LiveCore liveCore);

    ProcInfoStatistics.ProcInfo getProcInfo();

    Map<String, RemoteUserStatistics.RemoteUserInfo> getRemoteStatisticResult();

    void onLocalAudioStats(IRTCEngineEventHandler.LocalAudioStats localAudioStats);

    void onLocalNetworkQuality(int i2);

    void onLocalRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats);

    void onLocalVideoSourceFrame(int i2, int i3);

    void onLocalVideoStats(IRTCEngineEventHandler.LocalVideoStats localVideoStats);

    void onRemoteAudioStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats);

    void onRemoteAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i2);

    void onRemoteVideoRendered(String str);

    void onRemoteVideoStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats);

    void removeRemoteUser(String str);

    void setInteractStartTime();

    void setInteractStopTime();
}
