package com.bytedance.android.livesdkapi.d;

import com.bytedance.android.livesdk.livesetting.hybrid.LiveGurdPatternsSetting;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class c {
    static {
        Covode.recordClassIndex(13573);
    }

    public static List<Pattern> a() {
        ArrayList arrayList = new ArrayList();
        for (String str : LiveGurdPatternsSetting.INSTANCE.getValue()) {
            arrayList.add(Pattern.compile(str));
        }
        return arrayList;
    }
}
