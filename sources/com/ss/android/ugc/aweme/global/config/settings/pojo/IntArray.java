package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class IntArray {
    @c(a = "number")
    private List<Long> number = new ArrayList();

    static {
        Covode.recordClassIndex(63051);
    }

    public List<Long> getNumber() {
        return this.number;
    }
}
