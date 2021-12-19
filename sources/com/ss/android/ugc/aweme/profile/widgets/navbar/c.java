package com.ss.android.ugc.aweme.profile.widgets.navbar;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.d;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.e;
import com.ss.android.ugc.aweme.profile.widgets.navbar.a.j;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.f;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.i;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class c extends e {
    static {
        Covode.recordClassIndex(76587);
    }

    static final class a extends m implements h.f.a.b<d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118029a = new a();

        static {
            Covode.recordClassIndex(76588);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> dVar) {
            d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.d.Back, ab.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.a.class));
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f118030a = new b();

        static {
            Covode.recordClassIndex(76589);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a> dVar) {
            d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.a> dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.a.Nickname, ab.a(i.class));
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.c$c  reason: collision with other inner class name */
    static final class C3015c extends m implements h.f.a.b<d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3015c f118031a = new C3015c();

        static {
            Covode.recordClassIndex(76590);
        }

        C3015c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> dVar) {
            d<com.ss.android.ugc.aweme.profile.widgets.navbar.b.b> dVar2 = dVar;
            l.d(dVar2, "");
            dVar2.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.Bell, ab.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.b.class));
            dVar2.a(com.ss.android.ugc.aweme.profile.widgets.navbar.b.b.More, ab.a(f.class));
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.navbar.a.e, com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        super.b(view);
        j.a(this, a.f118029a);
        j.b(this, b.f118030a);
        j.c(this, C3015c.f118031a);
    }
}
