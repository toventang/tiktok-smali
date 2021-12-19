package com.bytedance.android.livesdk.gifttray.d;

import com.bytedance.android.livesdk.gifttray.a.a;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSelfTrayDisplayStrategySetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayExpSetting;
import com.bytedance.covode.number.Covode;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f18078a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(10025);
    }

    public static boolean a(a aVar) {
        boolean z;
        boolean z2;
        if (aVar == null) {
            return true;
        }
        if ((aVar.f17999f || LiveGiftTrayExpSetting.INSTANCE.getValue() <= 0) && LiveGiftTrayExpSetting.INSTANCE.getValue() != 3) {
            z = false;
        } else {
            z = true;
        }
        if (LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 0 || LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 2 || ((LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 1 || LiveGiftSelfTrayDisplayStrategySetting.INSTANCE.getValue() == 3) && !aVar.f18000g)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((!aVar.A || !z2) && (aVar.A || !z)) {
            return false;
        }
        return true;
    }
}
