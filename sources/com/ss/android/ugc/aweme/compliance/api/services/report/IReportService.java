package com.ss.android.ugc.aweme.compliance.api.services.report;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public interface IReportService {
    static {
        Covode.recordClassIndex(47405);
    }

    String a(Aweme aweme);

    String a(String str);

    void a(Activity activity, Uri.Builder builder);

    void a(Activity activity, Uri.Builder builder, Bundle bundle);

    void a(Activity activity, Aweme aweme);

    void a(String str, String str2, String str3, String str4, String str5, String str6, String str7);

    void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Aweme aweme);

    void a(Map<String, String> map);

    void b(Activity activity, Uri.Builder builder);
}
