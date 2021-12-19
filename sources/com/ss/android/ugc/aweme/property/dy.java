package com.ss.android.ugc.aweme.property;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;

public class dy {
    @c(a = "package_url")
    public final String packageUrl;
    @c(a = "scene")
    public final String scene;
    @c(a = StringSet.type)
    public final int type;

    static {
        Covode.recordClassIndex(76952);
    }

    public dy() {
        this(null, 0, null, 7, null);
    }

    public dy(String str, int i2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.scene = str;
        this.type = i2;
        this.packageUrl = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy(String str, int i2, String str2, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str2);
    }
}
