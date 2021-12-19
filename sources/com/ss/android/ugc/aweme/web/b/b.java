package com.ss.android.ugc.aweme.web.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public final class b extends a {
    static {
        Covode.recordClassIndex(94736);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.web.b.a
    public final String a() {
        return "(.*)/ies_fonts/(.+).ttf$";
    }

    public b() {
        super(false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.web.b.a
    public final InputStream b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return d(str.substring(str.lastIndexOf("/") + 1));
    }

    private static InputStream d(String str) {
        MethodCollector.i(11508);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(11508);
            return null;
        }
        Context context = c.a().f144889b;
        Map<String, String> map = c.a().f144888a;
        if (map == null || map.size() == 0) {
            MethodCollector.o(11508);
            return null;
        }
        String str2 = map.get(str);
        if (TextUtils.isEmpty(str2)) {
            MethodCollector.o(11508);
            return null;
        }
        try {
            InputStream open = context.getAssets().open(str2);
            MethodCollector.o(11508);
            return open;
        } catch (IOException e2) {
            e2.printStackTrace();
            MethodCollector.o(11508);
            return null;
        }
    }
}
