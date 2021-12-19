package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class Extra {
    @c(a = "fatal_item_ids")
    public List<String> fatalItemIds;
    public long now;

    static {
        Covode.recordClassIndex(59377);
    }
}
