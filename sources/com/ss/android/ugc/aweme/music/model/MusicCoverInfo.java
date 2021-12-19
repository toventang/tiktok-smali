package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class MusicCoverInfo {
    @c(a = "url_list")
    public List<String> coverUrlList;
    @c(a = "partner_name")
    public String partnerName;

    static {
        Covode.recordClassIndex(71672);
    }
}
