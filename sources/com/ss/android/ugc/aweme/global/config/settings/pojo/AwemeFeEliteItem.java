package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class AwemeFeEliteItem {
    @c(a = "edit_contact_link")
    private String editContactLink;
    @c(a = "edit_service_center_link")
    private String editServiceCenterLink;

    static {
        Covode.recordClassIndex(63015);
    }

    public String getEditContactLink() {
        String str = this.editContactLink;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getEditServiceCenterLink() {
        String str = this.editServiceCenterLink;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
