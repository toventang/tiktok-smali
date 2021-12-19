package com.google.vr.dynamite.client;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public interface INativeLibraryLoader extends IInterface {
    static {
        Covode.recordClassIndex(34125);
    }

    int checkVersion(String str);

    long initializeAndLoadNativeLibrary(String str);
}
