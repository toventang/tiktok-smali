package com.bytedance.android.live.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.base.a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public interface IActionHandlerService extends a {
    static {
        Covode.recordClassIndex(3519);
    }

    boolean canHandle(Uri uri);

    boolean handle(Context context, Uri uri);

    boolean handle(Context context, String str);

    boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map);

    boolean handleWithoutHost(Context context, String str);

    void postReportReason(long j2, long j3, long j4, String str);

    boolean showUserProfile(long j2);

    boolean showUserProfile(long j2, String str, Map<String, String> map);
}
