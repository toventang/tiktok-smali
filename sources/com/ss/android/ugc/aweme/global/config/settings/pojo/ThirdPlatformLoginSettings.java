package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class ThirdPlatformLoginSettings {
    @c(a = "login_jump")
    private List<LoginJumpStruct> loginJump = new ArrayList();
    @c(a = "other_bind_window")
    private List<BindWindowsStruct> otherBindWindow = new ArrayList();
    @c(a = "profile_bind_window")
    private List<BindWindowsStruct> profileBindWindow = new ArrayList();

    static {
        Covode.recordClassIndex(63086);
    }

    public List<LoginJumpStruct> getLoginJump() {
        return this.loginJump;
    }

    public List<BindWindowsStruct> getOtherBindWindow() {
        return this.otherBindWindow;
    }

    public List<BindWindowsStruct> getProfileBindWindow() {
        return this.profileBindWindow;
    }
}
