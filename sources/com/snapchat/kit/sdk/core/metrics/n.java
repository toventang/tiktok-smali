package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Debug;
import com.bytedance.covode.number.Covode;
import com.snap.kit.common.model.DeviceEnvironmentInfo;
import com.snap.kit.common.model.OsType;
import com.snap.kit.common.model.Types;
import com.snap.kit.sdk.model.SnapKitStorySnapView;
import com.snap.kit.sdk.model.SnapKitStorySnapViews;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.b.a;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import l.b;
import l.d;
import l.l;

public final class n implements MetricPublisher<SnapKitStorySnapView> {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f57202a;

    /* renamed from: b  reason: collision with root package name */
    private final MetricsClient f57203b;

    /* renamed from: c  reason: collision with root package name */
    private final a f57204c;

    /* renamed from: d  reason: collision with root package name */
    private final String f57205d;

    static {
        Covode.recordClassIndex(35769);
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final List<d<SnapKitStorySnapView>> getPersistedEvents() {
        return this.f57204c.a(SnapKitStorySnapView.ADAPTER, this.f57202a.getString("unsent_snap_view_events", null));
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void persistMetrics(List<d<SnapKitStorySnapView>> list) {
        this.f57202a.edit().putString("unsent_snap_view_events", this.f57204c.a(list)).apply();
    }

    @Override // com.snapchat.kit.sdk.core.metrics.MetricPublisher
    public final void publishMetrics(List<SnapKitStorySnapView> list, final MetricPublisher.PublishCallback publishCallback) {
        String str;
        Types.Trilean trilean;
        MetricsClient metricsClient = this.f57203b;
        SnapKitStorySnapViews.Builder views = new SnapKitStorySnapViews.Builder().views(list);
        DeviceEnvironmentInfo.Builder os_type = new DeviceEnvironmentInfo.Builder().os_type(OsType.Enum.ANDROID);
        String str2 = "";
        if (Build.VERSION.RELEASE == null) {
            str = str2;
        } else {
            str = Build.VERSION.RELEASE;
        }
        DeviceEnvironmentInfo.Builder target_architecture = os_type.os_version(str).model(Build.MODEL).target_architecture(System.getProperty("os.arch"));
        Locale locale = Locale.getDefault();
        if (locale != null) {
            str2 = locale.toString();
        }
        DeviceEnvironmentInfo.Builder locale2 = target_architecture.locale(str2);
        if (Debug.isDebuggerConnected()) {
            trilean = Types.Trilean.TRUE;
        } else {
            trilean = Types.Trilean.FALSE;
        }
        metricsClient.postViewEvents(views.device_environment_info(locale2.running_with_debugger_attached(trilean).running_in_tests(Types.Trilean.NONE).running_in_simulator(Types.Trilean.NONE).is_app_prerelease(Types.Trilean.NONE).build()).client_id(this.f57205d).build()).a(new d<Void>() {
            /* class com.snapchat.kit.sdk.core.metrics.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35770);
            }

            @Override // l.d
            public final void a(b<Void> bVar, Throwable th) {
                if (th instanceof IOException) {
                    publishCallback.onNetworkError();
                } else {
                    publishCallback.onServerError(new Error(th));
                }
            }

            @Override // l.d
            public final void a(b<Void> bVar, l<Void> lVar) {
                if (lVar.f159305a.isSuccessful()) {
                    publishCallback.onSuccess();
                    return;
                }
                try {
                    publishCallback.onServerError(new Error(lVar.f159307c.string()));
                } catch (IOException | NullPointerException unused) {
                    publishCallback.onServerError(new Error("response unsuccessful"));
                }
            }
        });
    }

    n(SharedPreferences sharedPreferences, MetricsClient metricsClient, a aVar, String str) {
        this.f57202a = sharedPreferences;
        this.f57203b = metricsClient;
        this.f57204c = aVar;
        this.f57205d = str;
    }
}
