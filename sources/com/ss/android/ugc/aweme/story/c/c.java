package com.ss.android.ugc.aweme.story.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f136980a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final h f136981b = i.a((h.f.a.a) a.f136982a);

    public static boolean a() {
        return ((Boolean) f136981b.getValue()).booleanValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136982a = new a();

        static {
            Covode.recordClassIndex(89526);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "story_enter_detail_performance_optimize", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(89525);
    }
}
