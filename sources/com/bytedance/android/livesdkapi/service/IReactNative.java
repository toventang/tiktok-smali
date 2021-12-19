package com.bytedance.android.livesdkapi.service;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.d;
import com.bytedance.android.livesdkapi.service.IReactNativeHost;
import com.bytedance.covode.number.Covode;

public interface IReactNative {
    static {
        Covode.recordClassIndex(13849);
    }

    void createHalfScreenReactBoxDialog(String str, String str2, String str3, int i2, int i3, int i4, int i5, String str4, IReactNativeHost.Callback1<d> callback1);

    void goRN(Context context, Uri uri);

    void initReactNative(Application application);
}
