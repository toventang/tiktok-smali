package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class AvatarUri {
    @c(a = "uri")
    public String uri;
    @c(a = "url_list")
    public List<String> urlList;

    static {
        Covode.recordClassIndex(75204);
    }
}
