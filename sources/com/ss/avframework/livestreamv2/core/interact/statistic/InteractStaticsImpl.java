package com.ss.avframework.livestreamv2.core.interact.statistic;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.statistic.LocalUserStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.ProcInfoStatistics;
import com.ss.avframework.livestreamv2.core.interact.statistic.RemoteUserStatistics;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.util.Map;

public class InteractStaticsImpl implements IInteractStatics {
    private final boolean mEnableInteractDurationCheck;
    private final boolean mEnableProcStatics;
    private final boolean mEnableRemoteUserStatics;
    private LocalUserStatistics mLocalUserStatistics = new LocalUserStatistics();
    private ProcInfoStatistics mProcInfoStatistics;
    private RemoteUserStatistics mRemoteUserStatistics;

    static {
        Covode.recordClassIndex(100291);
    }

    private LocalUserInteractConnectionStatisticInfo getInteractConnectionStatistic() {
        if (!this.mEnableInteractDurationCheck) {
            return null;
        }
        return this.mLocalUserStatistics.getInteractConnectionStatistic();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void calcDurationFromInteractToLive() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.calcDurationFromInteractToLive();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void calcDurationFromLiveToInteract() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.calcDurationFromLiveToInteract();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public ProcInfoStatistics.ProcInfo getProcInfo() {
        ProcInfoStatistics procInfoStatistics = this.mProcInfoStatistics;
        if (procInfoStatistics != null) {
            return procInfoStatistics.getProcInfo();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public Map<String, RemoteUserStatistics.RemoteUserInfo> getRemoteStatisticResult() {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            return remoteUserStatistics.getStatisticResult();
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void setInteractStartTime() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.setInteractStartTime();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void setInteractStopTime() {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            interactConnectionStatistic.setInteractStopTime();
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void addRemoteUser(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.addUser(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalAudioStats(IRTCEngineEventHandler.LocalAudioStats localAudioStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalAudioStats(localAudioStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalNetworkQuality(int i2) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalNetworkQuality(i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalRtcStats(IRTCEngineEventHandler.RTCRoomStats rTCRoomStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onRtcStats(rTCRoomStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalVideoStats(IRTCEngineEventHandler.LocalVideoStats localVideoStats) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onLocalVideoStats(localVideoStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteAudioStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteAudioStats(remoteStreamStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoRendered(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoRendered(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteVideoStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onRemoteVideoStats(remoteStreamStats);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void removeRemoteUser(String str) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.removeUser(str);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public LocalUserStatistics.LocalUserStatisticInfo getLocalStatisticResult(LiveCore liveCore) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            return localUserStatistics.getStatisticResult(liveCore);
        }
        return null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void getInteractConnectDurationInfo(long[] jArr) {
        LocalUserInteractConnectionStatisticInfo interactConnectionStatistic = getInteractConnectionStatistic();
        if (interactConnectionStatistic != null) {
            jArr[0] = interactConnectionStatistic.switchFromLiveToInteract;
            jArr[1] = interactConnectionStatistic.switchFromInteractToLive;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onRemoteAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i2) {
        RemoteUserStatistics remoteUserStatistics = this.mRemoteUserStatistics;
        if (remoteUserStatistics != null) {
            remoteUserStatistics.onAudioVolumeIndication(audioVolumeInfoArr, i2);
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.statistic.IInteractStatics
    public void onLocalVideoSourceFrame(int i2, int i3) {
        LocalUserStatistics localUserStatistics = this.mLocalUserStatistics;
        if (localUserStatistics != null) {
            localUserStatistics.onVideoSourceFrame(i2, i3, 0);
        }
    }

    public InteractStaticsImpl(Context context, LiveCore.InteractConfig interactConfig) {
        this.mEnableInteractDurationCheck = interactConfig.isEnableInteractConnectionStatics();
        boolean isEnableRemoteUserStatics = interactConfig.isEnableRemoteUserStatics();
        this.mEnableRemoteUserStatics = isEnableRemoteUserStatics;
        boolean isEnabelProcStatics = interactConfig.isEnabelProcStatics();
        this.mEnableProcStatics = isEnabelProcStatics;
        if (isEnableRemoteUserStatics) {
            this.mRemoteUserStatistics = new RemoteUserStatistics();
        }
        if (isEnabelProcStatics) {
            this.mProcInfoStatistics = new ProcInfoStatistics(context);
        }
    }
}
