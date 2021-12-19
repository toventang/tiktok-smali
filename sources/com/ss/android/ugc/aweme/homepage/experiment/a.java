package com.ss.android.ugc.aweme.homepage.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f99174a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f99175b = i.a((h.f.a.a) C2424a.f99176a);

    public static int a() {
        return ((Number) f99175b.getValue()).intValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.experiment.a$a  reason: collision with other inner class name */
    static final class C2424a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2424a f99176a = new C2424a();

        static {
            Covode.recordClassIndex(63189);
        }

        C2424a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "story_replace_create_button", 1));
        }
    }

    public static boolean b() {
        if (a() == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(63188);
    }
}
