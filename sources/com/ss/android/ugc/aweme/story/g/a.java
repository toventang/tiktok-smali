package com.ss.android.ugc.aweme.story.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f137759a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f137760b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f137761c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static final h f137762d;

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.g.a$a  reason: collision with other inner class name */
    static final class C3621a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3621a f137763a = new C3621a();

        static {
            Covode.recordClassIndex(90133);
        }

        C3621a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(SettingsManager.a().a("enable_story_avatar_entrance", 1));
        }
    }

    static {
        Covode.recordClassIndex(90132);
        boolean z = true;
        h a2 = i.a((h.f.a.a) C3621a.f137763a);
        f137762d = a2;
        if (((Number) a2.getValue()).intValue() != 1) {
            z = false;
        }
        f137760b = z;
    }
}
