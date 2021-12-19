package com.ss.android.ugc.aweme.story.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import h.f.b.l;

public final class b {
    static {
        Covode.recordClassIndex(90140);
    }

    public static final com.ss.android.ugc.tools.f.b a(AVETParameter aVETParameter) {
        String str;
        String str2;
        String str3;
        String str4;
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        if (aVETParameter == null || (str = aVETParameter.getCreationId()) == null) {
            str = "";
        }
        com.ss.android.ugc.tools.f.b a2 = bVar.a("creation_id", str);
        if (aVETParameter == null || (str2 = aVETParameter.getShootWay()) == null) {
            str2 = "";
        }
        com.ss.android.ugc.tools.f.b a3 = a2.a("shoot_way", str2);
        if (aVETParameter == null || (str3 = aVETParameter.getContentSource()) == null) {
            str3 = "";
        }
        com.ss.android.ugc.tools.f.b a4 = a3.a("content_source", str3);
        if (aVETParameter == null || (str4 = aVETParameter.getContentType()) == null) {
            str4 = "";
        }
        com.ss.android.ugc.tools.f.b a5 = a4.a("content_type", str4).a("placeholder_enter_from", "video_edit_page");
        l.b(a5, "");
        return a5;
    }
}
