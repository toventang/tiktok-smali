package com.ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public enum RemoteAudioStateChangeReason {
    REMOTE_AUDIO_STATE_CHANGE_REASON_INTERNAL(0),
    REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_CONGESTION(1),
    REMOTE_AUDIO_STATE_CHANGE_REASON_NETWORK_RECOVERY(2),
    REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_MUTED(3),
    REMOTE_AUDIO_STATE_CHANGE_REASON_LOCAL_UNMUTED(4),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_MUTED(5),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_UNMUTED(6),
    REMOTE_AUDIO_STATE_CHANGE_REASON_REMOTE_OFFLINE(7);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason[ordinal()]) {
            case 1:
                return "kRemoteAudioReasonInternal";
            case 2:
                return "kRemoteAudioReasonNetworkCongestion";
            case 3:
                return "kRemoteAudioReasonNetworkRecovery";
            case 4:
                return "kRemoteAudioReasonLocalMuted";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return "kRemoteAudioReasonLocalUnmuted";
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return "kRemoteAudioReasonRemoteMuted";
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "kRemoteAudioReasonRemoteUnmuted";
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return "kRemoteAudioReasonRemoteOffline";
            default:
                return "";
        }
    }

    /* renamed from: com.ss.bytertc.engine.data.RemoteAudioStateChangeReason$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$RemoteAudioStateChangeReason;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:15|16|18)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
            // Method dump skipped, instructions count: 103
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.data.RemoteAudioStateChangeReason.AnonymousClass1.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100869);
    }

    public static RemoteAudioStateChangeReason fromId(int i2) {
        RemoteAudioStateChangeReason[] values = values();
        for (RemoteAudioStateChangeReason remoteAudioStateChangeReason : values) {
            if (remoteAudioStateChangeReason.value() == i2) {
                return remoteAudioStateChangeReason;
            }
        }
        return null;
    }

    private RemoteAudioStateChangeReason(int i2) {
        this.value = i2;
    }
}
