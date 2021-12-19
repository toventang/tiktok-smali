package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.aj;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class LiveBeautyParamSetting {
    @Group(isDefault = true, value = "default group")
    private static final aj DEFAULT = new aj();
    public static final LiveBeautyParamSetting INSTANCE = new LiveBeautyParamSetting();
    private static final h settingValue$delegate = i.a((h.f.a.a) a.f18705a);

    private final aj getSettingValue() {
        return (aj) settingValue$delegate.getValue();
    }

    private LiveBeautyParamSetting() {
    }

    public final aj getValue() {
        return getSettingValue();
    }

    static final class a extends m implements h.f.a.a<aj> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18705a = new a();

        static {
            Covode.recordClassIndex(10522);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ aj invoke() {
            Object valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveBeautyParamSetting.class);
            if (valueSafely != null) {
                return valueSafely;
            }
            LiveBeautyParamSetting liveBeautyParamSetting = LiveBeautyParamSetting.INSTANCE;
            return LiveBeautyParamSetting.DEFAULT;
        }
    }

    static {
        Covode.recordClassIndex(10521);
    }

    public final float getBeautyParam() {
        return getSettingValue().f18944b.f18948a * getSettingValue().f18944b.f18949b;
    }

    public final float getBigEyesParam() {
        return getSettingValue().f18945c.f18948a * getSettingValue().f18945c.f18949b;
    }

    public final float getBrighteningParam() {
        return getSettingValue().f18943a.f18948a * getSettingValue().f18943a.f18949b;
    }

    public final float getLiftParam() {
        return getSettingValue().f18946d.f18948a * getSettingValue().f18946d.f18949b;
    }

    public final float getSharpParam() {
        return getSettingValue().f18947e.f18948a * getSettingValue().f18947e.f18949b;
    }
}
