package com.ss.android.ugc.aweme.crossplatform.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.settings.ac;
import h.f.b.m;
import h.h;
import h.i;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final h f78754b = i.a((h.f.a.a) b.f78757a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f78755c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f78756a;

    public static final class a {
        static {
            Covode.recordClassIndex(48881);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f78757a = new b();

        static {
            Covode.recordClassIndex(48882);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d((byte) 0);
        }
    }

    static final class c extends m implements h.f.a.a<Map<String, String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f78758a = new c();

        static {
            Covode.recordClassIndex(48883);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, String> invoke() {
            return a();
        }

        private static Map<String, String> a() {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                ac[] acVarArr = (ac[]) SettingsManager.a().a("android_source_url", ac[].class);
                if (acVarArr != null) {
                    for (ac acVar : acVarArr) {
                        String str2 = acVar.f123083a;
                        if (!(str2 == null || (str = acVar.f123084b) == null)) {
                            linkedHashMap.put(str2, str);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            return linkedHashMap;
        }
    }

    private d() {
        this.f78756a = i.a((h.f.a.a) c.f78758a);
    }

    static {
        Covode.recordClassIndex(48880);
    }

    public /* synthetic */ d(byte b2) {
        this();
    }
}
