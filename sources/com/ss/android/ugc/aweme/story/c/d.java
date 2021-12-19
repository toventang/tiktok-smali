package com.ss.android.ugc.aweme.story.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f136983a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final h f136984b = i.a((h.f.a.a) a.f136985a);

    public static int a() {
        return ((Number) f136984b.getValue()).intValue();
    }

    private d() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f136985a = new a();

        static {
            Covode.recordClassIndex(89528);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "tt_story_icon_display_strategy", 1));
        }
    }

    public static boolean b() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(89527);
    }
}
