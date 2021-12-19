package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public interface p {
    static {
        Covode.recordClassIndex(48974);
    }

    public static class a {
        static {
            Covode.recordClassIndex(48975);
        }

        public static List<String> a() {
            try {
                String[] strArr = (String[]) b.a().a(true, "webview_cache_urls");
                if (strArr != null) {
                    return Arrays.asList(strArr);
                }
            } catch (Throwable unused) {
            }
            return Collections.emptyList();
        }
    }
}
