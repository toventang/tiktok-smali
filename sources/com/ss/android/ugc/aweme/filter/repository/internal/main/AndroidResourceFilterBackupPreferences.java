package com.ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.a;
import com.bytedance.cukaie.closet.a.b;
import com.bytedance.cukaie.closet.a.c;

@a(a = "VideoRecord")
public interface AndroidResourceFilterBackupPreferences {
    static {
        Covode.recordClassIndex(60608);
    }

    @c(a = "resources_version")
    int getResourcesVersion();

    @b(a = "resources_version")
    void setResourcesVersion(int i2);
}
