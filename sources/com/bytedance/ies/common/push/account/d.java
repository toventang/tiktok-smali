package com.bytedance.ies.common.push.account;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class d extends AbstractThreadedSyncAdapter {
    static {
        Covode.recordClassIndex(19808);
    }

    public d(Context context) {
        super(context, true);
    }

    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        if (getContext() != null) {
            c cVar = c.f33148a;
            Context context = getContext();
            if (cVar.f33149b != null) {
                cVar.f33149b.a(context);
            }
        }
    }
}
