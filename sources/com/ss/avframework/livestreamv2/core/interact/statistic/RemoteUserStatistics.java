package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import java.util.HashMap;
import java.util.Map;

public class RemoteUserStatistics extends HashMap<String, RemoteUserInfo> {
    static {
        Covode.recordClassIndex(100298);
    }

    public class RemoteUserInfo {
        public int audioBitrate;
        public int audioDelay;
        public int audioLossRate;
        public int audioVoiceVolume;
        public long lastStatTimestamp;
        public int videoBitrate;
        public int videoDecodeFps;
        public int videoLossRate;
        public int videoRenderFps;
        public int videoRenderFrameCount;

        static {
            Covode.recordClassIndex(100299);
        }

        /* access modifiers changed from: protected */
        public RemoteUserInfo clone() {
            RemoteUserInfo remoteUserInfo = new RemoteUserInfo();
            remoteUserInfo.videoBitrate = this.videoBitrate;
            remoteUserInfo.videoDecodeFps = this.videoDecodeFps;
            remoteUserInfo.videoRenderFps = this.videoRenderFps;
            remoteUserInfo.videoLossRate = this.videoLossRate;
            remoteUserInfo.audioBitrate = this.audioBitrate;
            remoteUserInfo.audioDelay = this.audioDelay;
            remoteUserInfo.audioLossRate = this.audioLossRate;
            remoteUserInfo.audioVoiceVolume = this.audioVoiceVolume;
            remoteUserInfo.lastStatTimestamp = this.lastStatTimestamp;
            remoteUserInfo.videoRenderFrameCount = this.videoRenderFrameCount;
            return remoteUserInfo;
        }

        public RemoteUserInfo() {
        }
    }

    public synchronized Map<String, RemoteUserInfo> getStatisticResult() {
        HashMap hashMap;
        long j2;
        int i2;
        MethodCollector.i(11736);
        hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        for (Map.Entry entry : entrySet()) {
            String str = (String) entry.getKey();
            RemoteUserInfo remoteUserInfo = (RemoteUserInfo) entry.getValue();
            if (remoteUserInfo.lastStatTimestamp == 0 || currentTimeMillis <= remoteUserInfo.lastStatTimestamp) {
                j2 = 0;
            } else {
                j2 = currentTimeMillis - remoteUserInfo.lastStatTimestamp;
            }
            if (j2 > 0) {
                double d2 = (double) remoteUserInfo.videoRenderFrameCount;
                Double.isNaN(d2);
                double d3 = (double) j2;
                Double.isNaN(d3);
                i2 = (int) ((d2 * 1000.0d) / d3);
            } else {
                i2 = 0;
            }
            remoteUserInfo.videoRenderFps = i2;
            hashMap.put(str, remoteUserInfo.clone());
            remoteUserInfo.videoBitrate = 0;
            remoteUserInfo.videoDecodeFps = 0;
            remoteUserInfo.videoRenderFps = 0;
            remoteUserInfo.videoLossRate = 0;
            remoteUserInfo.audioBitrate = 0;
            remoteUserInfo.audioDelay = 0;
            remoteUserInfo.audioLossRate = 0;
            remoteUserInfo.audioVoiceVolume = 0;
            remoteUserInfo.lastStatTimestamp = currentTimeMillis;
            remoteUserInfo.videoRenderFrameCount = 0;
        }
        MethodCollector.o(11736);
        return hashMap;
    }

    public synchronized void addUser(String str) {
        MethodCollector.i(10597);
        super.put(str, new RemoteUserInfo());
        MethodCollector.o(10597);
    }

    public synchronized void onRemoteVideoRendered(String str) {
        MethodCollector.i(11399);
        RemoteUserInfo remoteUserInfo = (RemoteUserInfo) get(str);
        if (remoteUserInfo != null) {
            remoteUserInfo.videoRenderFrameCount++;
        }
        MethodCollector.o(11399);
    }

    public synchronized void removeUser(String str) {
        MethodCollector.i(10749);
        super.remove(str);
        MethodCollector.o(10749);
    }

    public synchronized void onRemoteAudioStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserInfo remoteUserInfo;
        MethodCollector.i(11078);
        if (!(remoteStreamStats == null || (remoteUserInfo = (RemoteUserInfo) get(remoteStreamStats.uid)) == null)) {
            remoteUserInfo.audioBitrate = (int) remoteStreamStats.audioStats.receivedKBitrate;
            remoteUserInfo.audioDelay = (int) remoteStreamStats.audioStats.e2eDelay;
            remoteUserInfo.audioLossRate = (int) (remoteStreamStats.audioStats.audioLossRate * 100.0f);
        }
        MethodCollector.o(11078);
    }

    public synchronized void onRemoteVideoStats(IRTCEngineEventHandler.RemoteStreamStats remoteStreamStats) {
        RemoteUserInfo remoteUserInfo;
        MethodCollector.i(10918);
        if (!(remoteStreamStats == null || (remoteUserInfo = (RemoteUserInfo) get(remoteStreamStats.uid)) == null)) {
            remoteUserInfo.videoBitrate = (int) remoteStreamStats.videoStats.receivedKBitrate;
            remoteUserInfo.videoDecodeFps = remoteStreamStats.videoStats.decoderOutputFrameRate;
            remoteUserInfo.videoLossRate = (int) (remoteStreamStats.videoStats.videoLossRate * 100.0f);
        }
        MethodCollector.o(10918);
    }

    public synchronized void onAudioVolumeIndication(IRTCEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i2) {
        MethodCollector.i(11398);
        if (audioVolumeInfoArr != null) {
            for (IRTCEngineEventHandler.AudioVolumeInfo audioVolumeInfo : audioVolumeInfoArr) {
                RemoteUserInfo remoteUserInfo = (RemoteUserInfo) get(audioVolumeInfo.uid);
                if (remoteUserInfo != null) {
                    remoteUserInfo.audioVoiceVolume = audioVolumeInfo.volume;
                }
            }
        }
        MethodCollector.o(11398);
    }

    public synchronized void onRemoteAudioTransportStats(String str, int i2, int i3, int i4) {
        MethodCollector.i(11237);
        MethodCollector.o(11237);
    }

    public synchronized void onRemoteVideoTransportStats(String str, int i2, int i3, int i4) {
        MethodCollector.i(11238);
        MethodCollector.o(11238);
    }
}
