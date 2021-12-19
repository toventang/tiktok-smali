package com.ss.android.ugc.aweme.story.base.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f136879a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final h f136880b = i.a((h.f.a.a) C3576a.f136881a);

    public static Keva a() {
        return (Keva) f136880b.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.b.a$a  reason: collision with other inner class name */
    static final class C3576a extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3576a f136881a = new C3576a();

        static {
            Covode.recordClassIndex(89455);
        }

        C3576a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("studio_story_cache");
        }
    }

    static {
        Covode.recordClassIndex(89454);
    }
}
