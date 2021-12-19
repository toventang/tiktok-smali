package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;
import com.ss.bytertc.engine.RTCEngine;

public class MultiRoomConfig {
    public boolean isAutoSubscribeAudio;
    public boolean isAutoSubscribeVideo;
    public RTCEngine.ChannelProfile profile;

    static {
        Covode.recordClassIndex(100774);
    }

    public boolean isAutoSubscribeAudio() {
        return this.isAutoSubscribeAudio;
    }

    public boolean isAutoSubscribeVideo() {
        return this.isAutoSubscribeVideo;
    }

    public int getProfile() {
        int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile[this.profile.ordinal()];
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 3) {
            return 3;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 != 5) {
            return 0;
        }
        return 4;
    }

    /* renamed from: com.ss.bytertc.engine.MultiRoomConfig$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100775(0x189a7, float:1.41216E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.RTCEngine$ChannelProfile[] r0 = com.ss.bytertc.engine.RTCEngine.ChannelProfile.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.bytertc.engine.MultiRoomConfig.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile = r2
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_COMMUNICATION     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.bytertc.engine.MultiRoomConfig.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.bytertc.engine.MultiRoomConfig.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.bytertc.engine.MultiRoomConfig.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_GAME     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.bytertc.engine.MultiRoomConfig.AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$ChannelProfile     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.engine.RTCEngine$ChannelProfile r0 = com.ss.bytertc.engine.RTCEngine.ChannelProfile.CHANNEL_PROFILE_LOW_LATENCY     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.bytertc.engine.MultiRoomConfig.AnonymousClass1.<clinit>():void");
        }
    }

    public MultiRoomConfig(RTCEngine.ChannelProfile channelProfile, boolean z, boolean z2) {
        this.profile = channelProfile;
        this.isAutoSubscribeAudio = z;
        this.isAutoSubscribeVideo = z2;
    }
}
