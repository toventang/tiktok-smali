package com.ss.android.ugc.aweme.story.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f137770a = new b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final c f137771b = new c();

    /* renamed from: c  reason: collision with root package name */
    private static final h f137772c = i.a((h.f.a.a) a.f137773a);

    public static b a() {
        return (b) f137772c.getValue();
    }

    private c() {
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137773a = new a();

        static {
            Covode.recordClassIndex(90136);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            Object a2 = SettingsManager.a().a("tt_story_config", b.class, c.f137770a);
            if (a2 == null) {
                a2 = c.f137770a;
            }
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(90135);
    }
}
