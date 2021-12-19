package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.l;

public final class a extends l.a {
    static {
        Covode.recordClassIndex(31364);
    }

    @Override // com.google.android.gms.common.internal.l
    public final Account a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }

    public static Account a(l lVar) {
        if (lVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return lVar.a();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
