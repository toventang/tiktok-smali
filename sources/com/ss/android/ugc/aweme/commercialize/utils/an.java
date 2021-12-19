package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.e;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.IOException;
import java.util.concurrent.Callable;

public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f75581a = true;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f75582b;

    /* renamed from: c  reason: collision with root package name */
    public static final h f75583c = i.a((h.f.a.a) c.f75587a);

    /* renamed from: d  reason: collision with root package name */
    public static final an f75584d = new an();

    private an() {
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f75587a = new c();

        static {
            Covode.recordClassIndex(46628);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!com.ss.android.ugc.aweme.commercialize.utils.b.b.a(d.a()));
        }
    }

    static {
        Covode.recordClassIndex(46625);
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75585a = new a();

        static {
            Covode.recordClassIndex(46626);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(d.a());
                if (advertisingIdInfo != null) {
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                } else {
                    z = true;
                }
                an.f75581a = z;
            } catch (IOException unused) {
            } catch (com.google.android.gms.common.d unused2) {
            } catch (IllegalStateException unused3) {
            } catch (e unused4) {
            } finally {
                an.f75582b = true;
            }
            return z.f158842a;
        }
    }

    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f75586a = new b();

        static {
            Covode.recordClassIndex(46627);
        }

        b() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(d.a());
                if (advertisingIdInfo != null) {
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                } else {
                    z = true;
                }
                an.f75581a = z;
            } catch (IOException unused) {
            } catch (com.google.android.gms.common.d unused2) {
            } catch (IllegalStateException unused3) {
            } catch (e unused4) {
            } finally {
                an.f75582b = true;
            }
            return z.f158842a;
        }
    }
}
