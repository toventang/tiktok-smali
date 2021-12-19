package com.google.vr.dynamite.client;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;

public interface ILoadedInstanceCreator extends IInterface {
    static {
        Covode.recordClassIndex(34124);
    }

    INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2);
}
