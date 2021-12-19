package com.ss.android.ugc.aweme.story.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f136950a = i.a((h.f.a.a) C3581a.f136952a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f136951b = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.story.c.a$a  reason: collision with other inner class name */
    static final class C3581a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3581a f136952a = new C3581a();

        static {
            Covode.recordClassIndex(89509);
        }

        C3581a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "tt_story_keep_show_shoot_button_in_profile", 0) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(89508);
    }
}
