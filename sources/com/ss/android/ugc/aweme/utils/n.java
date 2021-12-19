package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.google.gson.f;
import com.ss.android.ugc.aweme.lego.d;
import com.ss.android.ugc.aweme.model.AppWidgetStruct;
import h.f.b.m;
import h.h;
import h.i;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    static AppWidgetStruct f143137a;

    /* renamed from: b  reason: collision with root package name */
    public static final n f143138b = new n();

    /* renamed from: c  reason: collision with root package name */
    private static final h f143139c = i.a((h.f.a.a) a.f143140a);

    static Keva a() {
        return (Keva) f143139c.getValue();
    }

    private n() {
    }

    static final class a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143140a = new a();

        static {
            Covode.recordClassIndex(93698);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("keva_repo_app_widget");
        }
    }

    static {
        Covode.recordClassIndex(93697);
    }

    public final AppWidgetStruct b() {
        MethodCollector.i(12244);
        AppWidgetStruct appWidgetStruct = null;
        if (d.c()) {
            if (f143137a == null) {
                synchronized (this) {
                    try {
                        if (f143137a == null) {
                            try {
                                appWidgetStruct = (AppWidgetStruct) new f().a(a().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
                            } catch (Throwable unused) {
                            }
                            f143137a = appWidgetStruct;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(12244);
                        throw th;
                    }
                }
            }
            AppWidgetStruct appWidgetStruct2 = f143137a;
            MethodCollector.o(12244);
            return appWidgetStruct2;
        }
        try {
            appWidgetStruct = (AppWidgetStruct) new f().a(a().getString("keva_key_cache_data", ""), AppWidgetStruct.class);
        } catch (Throwable unused2) {
        }
        MethodCollector.o(12244);
        return appWidgetStruct;
    }
}
