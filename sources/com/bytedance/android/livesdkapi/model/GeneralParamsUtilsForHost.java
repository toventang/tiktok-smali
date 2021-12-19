package com.bytedance.android.livesdkapi.model;

import android.content.Context;
import com.bytedance.android.livesdkapi.m.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public class GeneralParamsUtilsForHost {
    static {
        Covode.recordClassIndex(13836);
    }

    public static Map<String, String> getGeneralParams(Context context) {
        return a.a(context);
    }
}
