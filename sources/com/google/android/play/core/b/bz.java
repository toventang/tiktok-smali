package com.google.android.play.core.b;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public abstract class bz extends bs implements ca {
    static {
        Covode.recordClassIndex(32834);
    }

    public static ca a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof ca ? (ca) queryLocalInterface : new by(iBinder);
    }
}
