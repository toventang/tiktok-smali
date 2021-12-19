package com.google.android.play.core.a;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bu;
import com.google.android.play.core.b.bv;
import com.google.android.play.core.b.h;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements h {

    /* renamed from: a  reason: collision with root package name */
    static final h f52714a = new m();

    static {
        Covode.recordClassIndex(32647);
    }

    private m() {
    }

    @Override // com.google.android.play.core.b.h
    public final Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof bv ? queryLocalInterface : new bu(iBinder);
    }
}
