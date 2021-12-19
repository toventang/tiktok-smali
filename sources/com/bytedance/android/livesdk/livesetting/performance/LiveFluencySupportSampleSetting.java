package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;

public final class LiveFluencySupportSampleSetting {
    @Group(isDefault = true, value = "default group")
    private static final a DEFAULT;
    public static final LiveFluencySupportSampleSetting INSTANCE = new LiveFluencySupportSampleSetting();
    private static a liveFluencySupportSample;

    private LiveFluencySupportSampleSetting() {
    }

    public final boolean isAudienceLinkPeriodEnable() {
        return liveFluencySupportSample.f18742i;
    }

    public final boolean isBroadcastEnterEnable() {
        return liveFluencySupportSample.f18737d;
    }

    public final boolean isBroadcastLinkPeriodEnable() {
        return liveFluencySupportSample.f18741h;
    }

    public final boolean isBroadcastPeriodEnable() {
        return liveFluencySupportSample.f18741h;
    }

    public final boolean isGiftPlayEnable() {
        return liveFluencySupportSample.f18744k;
    }

    public final boolean isPanelBeautySlideEnable() {
        return liveFluencySupportSample.p;
    }

    public final boolean isPanelBroadcastLinkSlideEnable() {
        return liveFluencySupportSample.n;
    }

    public final boolean isPanelFilterSlideEnable() {
        return liveFluencySupportSample.q;
    }

    public final boolean isPanelGiftSlideEnable() {
        return liveFluencySupportSample.f18745l;
    }

    public final boolean isPanelHourlyRankSlideEnable() {
        return liveFluencySupportSample.f18746m;
    }

    public final boolean isPanelPublicScreenSlideEnable() {
        return liveFluencySupportSample.o;
    }

    public final boolean isPanelStickerSlideEnable() {
        return liveFluencySupportSample.r;
    }

    public final boolean isPkPeriodEnable() {
        return liveFluencySupportSample.f18743j;
    }

    public final boolean isPreviewEnterEnable() {
        return liveFluencySupportSample.f18739f;
    }

    public final boolean isPreviewPeriodEnable() {
        return liveFluencySupportSample.f18740g;
    }

    public final boolean isWatchEnterEnable() {
        return liveFluencySupportSample.f18734a;
    }

    public final boolean isWatchPeriodEnable() {
        return liveFluencySupportSample.f18736c;
    }

    public final boolean isWatchSlideEnable() {
        return liveFluencySupportSample.f18735b;
    }

    static {
        Covode.recordClassIndex(10894);
        a aVar = new a((byte) 0);
        DEFAULT = aVar;
        a aVar2 = (a) SettingsManager.INSTANCE.getValueSafely(LiveFluencySupportSampleSetting.class);
        if (aVar2 != null) {
            aVar = aVar2;
        }
        liveFluencySupportSample = aVar;
    }
}
