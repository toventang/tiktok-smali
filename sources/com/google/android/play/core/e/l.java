package com.google.android.play.core.e;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.ap;
import com.google.android.play.core.b.aq;
import com.google.android.play.core.b.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class l implements h {

    /* renamed from: a  reason: collision with root package name */
    static final h f53329a = new l();

    static {
        Covode.recordClassIndex(32940);
    }

    private l() {
    }

    @Override // com.google.android.play.core.b.h
    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof aq ? queryLocalInterface : new ap(iBinder);
    }
}
