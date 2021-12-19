package com.snapchat.kit.sdk;

import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.snapchat.kit.sdk.core.a.d;
import com.snapchat.kit.sdk.core.a.e;
import com.snapchat.kit.sdk.core.config.ServerSampleRateCallback;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.DailySessionBucket;
import com.snapchat.kit.sdk.core.metrics.model.LoginRoute;
import com.snapchat.kit.sdk.core.metrics.model.SkateEvent;
import com.snapchat.kit.sdk.core.metrics.skate.c;
import com.ss.android.ugc.aweme.au;
import java.util.Calendar;
import java.util.Date;

public class SnapKitAppLifecycleObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    private c f57049a;

    static {
        Covode.recordClassIndex(35543);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            onEnterForeground();
        }
    }

    @v(a = i.a.ON_START)
    public void onEnterForeground() {
        d dVar;
        Date date = new Date();
        c cVar = this.f57049a;
        d a2 = cVar.f57225b.a();
        Calendar instance = Calendar.getInstance(cVar.f57227d.f57078a);
        instance.setTime(date);
        long j2 = (long) instance.get(5);
        Calendar instance2 = Calendar.getInstance(cVar.f57227d.f57078a);
        instance2.setTime(date);
        long j3 = (long) (instance2.get(2) + 1);
        Calendar instance3 = Calendar.getInstance(cVar.f57227d.f57078a);
        instance3.setTime(date);
        e eVar = new e(j2, j3, (long) instance3.get(1));
        if (a2 != null) {
            e eVar2 = a2.f57085a;
            if (eVar.f57087a == eVar2.f57087a && eVar.a(eVar2)) {
                a2.f57086b++;
                dVar = a2;
                cVar.f57225b.f57235a.edit().putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateDay", dVar.f57085a.f57087a).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateMonth", dVar.f57085a.f57088b).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateYear", dVar.f57085a.f57089c).putInt("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateCount", dVar.f57086b).apply();
                cVar.f57224a.a(new ServerSampleRateCallback(a2, dVar) {
                    /* class com.snapchat.kit.sdk.core.metrics.skate.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f57232a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ d f57233b;

                    static {
                        Covode.recordClassIndex(35777);
                    }

                    @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
                    public final void onServerSampleRateFailure() {
                    }

                    @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
                    public final void onServerSampleRateAvailable(double d2) {
                        boolean z;
                        DailySessionBucket dailySessionBucket;
                        if (d2 > c.this.f57225b.b()) {
                            MetricQueue<SkateEvent> metricQueue = c.this.f57226c;
                            c cVar = c.this;
                            d dVar = this.f57232a;
                            d dVar2 = this.f57233b;
                            e eVar = dVar2.f57085a;
                            if (dVar == null || !dVar.f57085a.a(eVar)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            SkateEvent.Builder builder = new SkateEvent.Builder();
                            switch (dVar2.f57086b) {
                                case 1:
                                    dailySessionBucket = DailySessionBucket.ONE_SESSION;
                                    break;
                                case 2:
                                    dailySessionBucket = DailySessionBucket.TWO_SESSION;
                                    break;
                                case 3:
                                    dailySessionBucket = DailySessionBucket.THREE_SESSION;
                                    break;
                                case 4:
                                    dailySessionBucket = DailySessionBucket.FOUR_SESSION;
                                    break;
                                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                                    dailySessionBucket = DailySessionBucket.FIVE_SESSION;
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                                    dailySessionBucket = DailySessionBucket.SIX_SESSION;
                                    break;
                                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                                    dailySessionBucket = DailySessionBucket.SEVEN_SESSION;
                                    break;
                                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                                    dailySessionBucket = DailySessionBucket.EIGHT_SESSION;
                                    break;
                                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                                    dailySessionBucket = DailySessionBucket.NINE_SESSION;
                                    break;
                                default:
                                    dailySessionBucket = DailySessionBucket.TEN_OR_MORE_SESSION;
                                    break;
                            }
                            SkateEvent.Builder core_version = builder.daily_session_bucket(dailySessionBucket).day(Long.valueOf(eVar.f57087a)).month(Long.valueOf(eVar.f57088b)).year(Long.valueOf(eVar.f57089c)).is_first_within_month(Boolean.valueOf(z)).sample_rate(Double.valueOf(d2)).snap_kit_init_type(cVar.f57229f).kit_plugin_type(cVar.f57230g).is_from_react_native_plugin(Boolean.valueOf(cVar.f57231h)).core_version("1.12.0");
                            String string = cVar.f57225b.f57235a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVariants", null);
                            if (!TextUtils.isEmpty(string)) {
                                core_version.kit_variants_string_list(string);
                            }
                            String string2 = cVar.f57225b.f57235a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVersions", null);
                            if (!TextUtils.isEmpty(string2)) {
                                core_version.kit_version_string_list(string2);
                            }
                            if (cVar.f57228e.isUserLoggedIn()) {
                                core_version.login_route(LoginRoute.LOGIN_ROUTE);
                            }
                            metricQueue.push(core_version.build());
                        }
                    }

                    {
                        this.f57232a = r2;
                        this.f57233b = r3;
                    }
                });
            }
        }
        dVar = new d(eVar, 1);
        cVar.f57225b.f57235a.edit().putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateDay", dVar.f57085a.f57087a).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateMonth", dVar.f57085a.f57088b).putLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateYear", dVar.f57085a.f57089c).putInt("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateCount", dVar.f57086b).apply();
        cVar.f57224a.a(new ServerSampleRateCallback(a2, dVar) {
            /* class com.snapchat.kit.sdk.core.metrics.skate.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f57232a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f57233b;

            static {
                Covode.recordClassIndex(35777);
            }

            @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
            public final void onServerSampleRateFailure() {
            }

            @Override // com.snapchat.kit.sdk.core.config.ServerSampleRateCallback
            public final void onServerSampleRateAvailable(double d2) {
                boolean z;
                DailySessionBucket dailySessionBucket;
                if (d2 > c.this.f57225b.b()) {
                    MetricQueue<SkateEvent> metricQueue = c.this.f57226c;
                    c cVar = c.this;
                    d dVar = this.f57232a;
                    d dVar2 = this.f57233b;
                    e eVar = dVar2.f57085a;
                    if (dVar == null || !dVar.f57085a.a(eVar)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    SkateEvent.Builder builder = new SkateEvent.Builder();
                    switch (dVar2.f57086b) {
                        case 1:
                            dailySessionBucket = DailySessionBucket.ONE_SESSION;
                            break;
                        case 2:
                            dailySessionBucket = DailySessionBucket.TWO_SESSION;
                            break;
                        case 3:
                            dailySessionBucket = DailySessionBucket.THREE_SESSION;
                            break;
                        case 4:
                            dailySessionBucket = DailySessionBucket.FOUR_SESSION;
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            dailySessionBucket = DailySessionBucket.FIVE_SESSION;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            dailySessionBucket = DailySessionBucket.SIX_SESSION;
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            dailySessionBucket = DailySessionBucket.SEVEN_SESSION;
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            dailySessionBucket = DailySessionBucket.EIGHT_SESSION;
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            dailySessionBucket = DailySessionBucket.NINE_SESSION;
                            break;
                        default:
                            dailySessionBucket = DailySessionBucket.TEN_OR_MORE_SESSION;
                            break;
                    }
                    SkateEvent.Builder core_version = builder.daily_session_bucket(dailySessionBucket).day(Long.valueOf(eVar.f57087a)).month(Long.valueOf(eVar.f57088b)).year(Long.valueOf(eVar.f57089c)).is_first_within_month(Boolean.valueOf(z)).sample_rate(Double.valueOf(d2)).snap_kit_init_type(cVar.f57229f).kit_plugin_type(cVar.f57230g).is_from_react_native_plugin(Boolean.valueOf(cVar.f57231h)).core_version("1.12.0");
                    String string = cVar.f57225b.f57235a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVariants", null);
                    if (!TextUtils.isEmpty(string)) {
                        core_version.kit_variants_string_list(string);
                    }
                    String string2 = cVar.f57225b.f57235a.getString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVersions", null);
                    if (!TextUtils.isEmpty(string2)) {
                        core_version.kit_version_string_list(string2);
                    }
                    if (cVar.f57228e.isUserLoggedIn()) {
                        core_version.login_route(LoginRoute.LOGIN_ROUTE);
                    }
                    metricQueue.push(core_version.build());
                }
            }

            {
                this.f57232a = r2;
                this.f57233b = r3;
            }
        });
    }

    SnapKitAppLifecycleObserver(c cVar) {
        this.f57049a = cVar;
    }
}
