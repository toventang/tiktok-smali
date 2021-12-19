package com.google.android.play.core.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class cd extends bs implements ce {
    static {
        Covode.recordClassIndex(32839);
    }

    public cd() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionService");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.b.bs
    public final boolean a(int i2, Parcel parcel) {
        cg cgVar = null;
        if (i2 == 2) {
            Bundle bundle = (Bundle) bt.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                cgVar = queryLocalInterface instanceof cg ? (cg) queryLocalInterface : new cf(readStrongBinder);
            }
            a(bundle, cgVar);
            return true;
        } else if (i2 != 3) {
            return false;
        } else {
            bt.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
                cgVar = queryLocalInterface2 instanceof cg ? (cg) queryLocalInterface2 : new cf(readStrongBinder2);
            }
            a(cgVar);
            return true;
        }
    }
}
