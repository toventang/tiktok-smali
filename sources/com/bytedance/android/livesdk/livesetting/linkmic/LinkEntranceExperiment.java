package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.covode.number.Covode;
import h.f.b.m;
import h.h;
import h.i;

public final class LinkEntranceExperiment {
    @Group(isDefault = true, value = "default")
    private static final boolean DEFAULT = false;
    public static final LinkEntranceExperiment INSTANCE = new LinkEntranceExperiment();
    private static final h settingValue$delegate = i.a((h.f.a.a) a.f18726a);

    private final boolean getSettingValue() {
        return ((Boolean) settingValue$delegate.getValue()).booleanValue();
    }

    private LinkEntranceExperiment() {
    }

    public final boolean getValue() {
        return getSettingValue();
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18726a = new a();

        static {
            Covode.recordClassIndex(10724);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LinkEntranceExperiment.class));
        }
    }

    static {
        Covode.recordClassIndex(10723);
    }
}
