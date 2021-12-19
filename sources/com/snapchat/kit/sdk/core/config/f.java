package com.snapchat.kit.sdk.core.config;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l.b;
import l.d;
import l.l;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f57100a;

    /* renamed from: b  reason: collision with root package name */
    private int f57101b = a.f57106a;

    /* renamed from: c  reason: collision with root package name */
    private ConfigClient f57102c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<ServerSampleRateCallback> f57103d = new ArrayList<>();

    static {
        Covode.recordClassIndex(35579);
    }

    public static boolean b(double d2) {
        return d2 >= 0.0d && d2 <= 1.0d;
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* access modifiers changed from: protected */
    public static final class a extends Enum<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final int f57106a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f57107b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f57108c = 3;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ int[] f57109d = {1, 2, 3};

        static {
            Covode.recordClassIndex(35582);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        MethodCollector.i(6614);
        this.f57101b = a.f57106a;
        Iterator<ServerSampleRateCallback> it = this.f57103d.iterator();
        while (it.hasNext()) {
            it.next().onServerSampleRateFailure();
        }
        this.f57103d.clear();
        MethodCollector.o(6614);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(double d2) {
        MethodCollector.i(6620);
        this.f57100a.edit().putFloat("com.snapchat.kit.sdk.core.config.skateSampleRate", (float) d2).apply();
        this.f57101b = a.f57108c;
        Iterator<ServerSampleRateCallback> it = this.f57103d.iterator();
        while (it.hasNext()) {
            it.next().onServerSampleRateAvailable(d2);
        }
        this.f57103d.clear();
        MethodCollector.o(6620);
    }

    public final synchronized void a(ServerSampleRateCallback serverSampleRateCallback) {
        MethodCollector.i(6543);
        if (this.f57101b == a.f57108c) {
            try {
                serverSampleRateCallback.onServerSampleRateAvailable((double) this.f57100a.getFloat("com.snapchat.kit.sdk.core.config.skateSampleRate", 0.0f));
                MethodCollector.o(6543);
            } catch (ClassCastException unused) {
                serverSampleRateCallback.onServerSampleRateFailure();
                MethodCollector.o(6543);
            }
        } else {
            this.f57103d.add(serverSampleRateCallback);
            if (this.f57101b == a.f57107b) {
                MethodCollector.o(6543);
                return;
            }
            this.f57101b = a.f57107b;
            this.f57102c.fetchConfig(new a("query($kitVersion: String!) {config(kitVersion: $kitVersion) {skateConfig{sampleRate}}}", new HashMap<String, Object>() {
                /* class com.snapchat.kit.sdk.core.config.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(35580);
                }

                {
                    put("kitVersion", "1.12.0");
                }
            })).a(new d<d<b>>() {
                /* class com.snapchat.kit.sdk.core.config.f.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35581);
                }

                @Override // l.d
                public final void a(b<d<b>> bVar, Throwable th) {
                    f.this.a();
                }

                @Override // l.d
                public final void a(b<d<b>> bVar, l<d<b>> lVar) {
                    if (lVar == null) {
                        f.this.a();
                    } else if (!lVar.f159305a.isSuccessful()) {
                        f.this.a();
                    } else {
                        T t = lVar.f159306b;
                        if (t == null) {
                            f.this.a();
                            return;
                        }
                        if (!(t.f57098a == null || t.f57098a.f57096a == null || t.f57098a.f57096a.f57097a == null || t.f57098a.f57096a.f57097a.f57099a == null)) {
                            Double d2 = t.f57098a.f57096a.f57097a.f57099a;
                            if (f.b(d2.doubleValue())) {
                                f.this.a(d2.doubleValue());
                                return;
                            }
                        }
                        f.this.a();
                    }
                }
            });
            MethodCollector.o(6543);
        }
    }

    public f(ConfigClient configClient, SharedPreferences sharedPreferences) {
        this.f57102c = configClient;
        this.f57100a = sharedPreferences;
    }
}
