package com.bytedance.android.livesdk.chatroom.backroom.d;

import com.bytedance.android.livesdk.livesetting.roomfunction.ReturnBackSettingsSetting;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static h f15024a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f15025b = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(8345);
    }

    public static boolean a() {
        return ReturnBackSettingsSetting.INSTANCE.getValue().a();
    }

    public static boolean b() {
        if (ReturnBackSettingsSetting.INSTANCE.getValue().b() || ReturnBackSettingsSetting.INSTANCE.getValue().d()) {
            return true;
        }
        return false;
    }

    public static boolean c() {
        if (ReturnBackSettingsSetting.INSTANCE.getValue().c() || ReturnBackSettingsSetting.INSTANCE.getValue().d()) {
            return true;
        }
        return false;
    }
}
