package com.ss.android.newmedia.redbadge.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(37105);
    }

    public static boolean a(Context context, Intent intent) {
        PackageManager packageManager;
        List<ResolveInfo> queryBroadcastReceivers;
        if (context == null || (packageManager = context.getPackageManager()) == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0)) == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }
}
