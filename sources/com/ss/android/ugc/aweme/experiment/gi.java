package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class gi {

    /* renamed from: a  reason: collision with root package name */
    static final h f90143a = i.a((h.f.a.a) a.f90146a);

    /* renamed from: b  reason: collision with root package name */
    public static final gi f90144b = new gi();

    /* renamed from: c  reason: collision with root package name */
    private static final h f90145c = i.a((h.f.a.a) b.f90147a);

    public static final boolean a() {
        return ((Boolean) f90145c.getValue()).booleanValue();
    }

    private gi() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f90146a = new a();

        static {
            Covode.recordClassIndex(56551);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(Keva.getRepo("ab_repo_cold_boot").getInt("settings_manager_notify_settings_experiment", 0));
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90147a = new b();

        static {
            Covode.recordClassIndex(56552);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (((Number) gi.f90143a.getValue()).intValue() != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(56550);
    }
}
