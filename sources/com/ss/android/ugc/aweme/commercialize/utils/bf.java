package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Intent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.Set;

public final class bf {
    static {
        Covode.recordClassIndex(46668);
    }

    public static void a(Intent intent, Intent intent2) {
        if (intent != null) {
            Set<String> categories = intent.getCategories();
            if (!b.a((Collection) categories)) {
                for (String str : categories) {
                    intent2.addCategory(str);
                }
            }
        }
    }
}
