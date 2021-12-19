package com.ss.android.ugc.aweme.choosemusic;

import androidx.lifecycle.ac;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.model.aj;
import h.f.b.m;
import h.h;
import h.i;

public final class MusicSearchStateViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public static final a f70258a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f70259b = i.a((h.f.a.a) f.f70268a);

    /* renamed from: c  reason: collision with root package name */
    private final h f70260c = i.a((h.f.a.a) e.f70267a);

    /* renamed from: d  reason: collision with root package name */
    private final h f70261d = i.a((h.f.a.a) d.f70266a);

    /* renamed from: e  reason: collision with root package name */
    private final h f70262e = i.a((h.f.a.a) b.f70264a);

    /* renamed from: f  reason: collision with root package name */
    private final h f70263f = i.a((h.f.a.a) c.f70265a);

    static {
        Covode.recordClassIndex(43345);
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> a() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f70259b.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<String> b() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f70260c.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<aj> c() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f70261d.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> d() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f70262e.getValue();
    }

    public final com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> e() {
        return (com.ss.android.ugc.aweme.arch.widgets.base.c) this.f70263f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43346);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f70264a = new b();

        static {
            Covode.recordClassIndex(43347);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class c extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f70265a = new c();

        static {
            Covode.recordClassIndex(43348);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Boolean> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<aj>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f70266a = new d();

        static {
            Covode.recordClassIndex(43349);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<aj> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f70267a = new e();

        static {
            Covode.recordClassIndex(43350);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<String> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    static final class f extends m implements h.f.a.a<com.ss.android.ugc.aweme.arch.widgets.base.c<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f70268a = new f();

        static {
            Covode.recordClassIndex(43351);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> invoke() {
            return new com.ss.android.ugc.aweme.arch.widgets.base.c();
        }
    }

    public final int f() {
        Integer value = a().getValue();
        if (value != null) {
            return value.intValue();
        }
        return 1;
    }
}
