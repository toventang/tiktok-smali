package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.google.gson.g;
import com.ss.android.ugc.aweme.discover.b;
import com.ss.android.ugc.aweme.net.BaseResponseObjectTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.CollectionTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.ModelCheckerTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.ss.android.ugc.aweme.net.UserTypeAdapterFactory;
import com.ss.android.ugc.aweme.search.h;
import com.ss.android.ugc.aweme.sticker.model.a;
import com.ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;
import java.lang.reflect.Type;

public class GsonHolder implements GsonProvider {

    /* renamed from: a  reason: collision with root package name */
    private final f f142564a;

    /* renamed from: b  reason: collision with root package name */
    private final f f142565b;

    static {
        Covode.recordClassIndex(93241);
    }

    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
    public final f b() {
        return this.f142564a;
    }

    public GsonHolder() {
        g a2 = a();
        h.f121133a.a(a2);
        b.f80832a.a(a2);
        f b2 = a2.b();
        this.f142564a = b2;
        this.f142565b = b2;
    }

    public static g a() {
        g a2 = dw.a();
        a2.a(new ModelCheckerTypeAdapterFactory());
        a2.a(new CollectionTypeAdapterFactory());
        a2.a(new MusicTypeAdapterFactory());
        a2.a(new UserTypeAdapterFactory());
        a2.a((Type) a.class, (Object) new BackgroundVideoDeserializer());
        a2.a(new BaseResponseObjectTypeAdapterFactory());
        return a2;
    }

    public static GsonProvider c() {
        MethodCollector.i(6048);
        Object a2 = com.ss.android.ugc.b.a(GsonProvider.class, false);
        if (a2 != null) {
            GsonProvider gsonProvider = (GsonProvider) a2;
            MethodCollector.o(6048);
            return gsonProvider;
        }
        if (com.ss.android.ugc.b.ex == null) {
            synchronized (GsonProvider.class) {
                try {
                    if (com.ss.android.ugc.b.ex == null) {
                        com.ss.android.ugc.b.ex = new GsonHolder();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6048);
                    throw th;
                }
            }
        }
        GsonHolder gsonHolder = (GsonHolder) com.ss.android.ugc.b.ex;
        MethodCollector.o(6048);
        return gsonHolder;
    }

    @Override // com.ss.android.ugc.aweme.utils.GsonProvider
    public final void a(Type type) {
        this.f142564a.a((com.google.gson.b.a) com.google.gson.b.a.get(type));
    }
}
