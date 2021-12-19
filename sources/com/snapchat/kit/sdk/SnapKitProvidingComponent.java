package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.snap.kit.sdk.model.SnapKitStorySnapView;
import com.snapchat.kit.sdk.core.controller.FirebaseStateController;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.FirebaseTokenManager;
import com.snapchat.kit.sdk.core.networking.a;

public interface SnapKitProvidingComponent {
    static {
        Covode.recordClassIndex(35546);
    }

    MetricQueue<ServerEvent> analyticsEventQueue();

    a apiFactory();

    AuthTokenManager authTokenManager();

    String clientId();

    Context context();

    FirebaseStateController firebaseStateController();

    FirebaseTokenManager firebaseTokenManager();

    f gson();

    com.snapchat.kit.sdk.core.metrics.c.a kitEventBaseFactory();

    KitPluginType kitPluginType();

    LoginStateController loginStateController();

    MetricQueue<OpMetric> operationalMetricsQueue();

    String redirectUrl();

    boolean sdkIsFromReactNativePlugin();

    SharedPreferences sharedPreferences();

    SnapKitAppLifecycleObserver snapKitAppLifecycleObserver();

    MetricQueue<SnapKitStorySnapView> snapViewEventQueue();
}
