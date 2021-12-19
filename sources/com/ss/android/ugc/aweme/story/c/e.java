package com.ss.android.ugc.aweme.story.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f136986a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final h f136987b = i.a((h.f.a.a) a.f136988a);

    public static boolean a() {
        return ((Boolean) f136987b.getValue()).booleanValue();
    }

    private e() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136988a = new a();

        static {
            Covode.recordClassIndex(89530);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "tt_story_performance_opt_experiment", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(89529);
    }
}
