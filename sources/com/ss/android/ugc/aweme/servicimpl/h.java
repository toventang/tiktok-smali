package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.n.e;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public ShortVideoContext f121883a;

    /* renamed from: b  reason: collision with root package name */
    private final int f121884b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final int f121885c = 2;

    /* renamed from: d  reason: collision with root package name */
    private final int f121886d = 4;

    /* renamed from: e  reason: collision with root package name */
    private final int f121887e = 8;

    /* renamed from: f  reason: collision with root package name */
    private final com.ss.android.ugc.gamora.recorder.h.b f121888f = new com.ss.android.ugc.gamora.recorder.h.b();

    static {
        Covode.recordClassIndex(79922);
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(79923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.a());
        }
    }

    private final boolean f() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return shortVideoContext.c();
    }

    private final boolean k() {
        if (m() || l()) {
            return true;
        }
        return false;
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(79924);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            h hVar = this.this$0;
            if (com.ss.android.ugc.aweme.port.in.c.s.a()) {
                hVar.a("shoot_way");
            } else {
                hVar.a("settings");
            }
            return z.f158842a;
        }
    }

    private final boolean i() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(shortVideoContext)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.n != null) {
            return true;
        }
        return false;
    }

    private final boolean m() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!shortVideoContext.O) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.aN) {
            return true;
        }
        return false;
    }

    private final boolean d() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) "comment_reply", (Object) shortVideoContext.r)) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext2.r, (Object) "question_and_answer")) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.f124757b.b()) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.f124757b.c()) {
            return true;
        }
        return false;
    }

    private final boolean h() {
        if (a()) {
            ShortVideoContext shortVideoContext = this.f121883a;
            if (shortVideoContext == null) {
                l.a("shortVideoContext");
            }
            if (shortVideoContext.aj) {
                return true;
            }
        }
        if (!g() || !i()) {
            return false;
        }
        return true;
    }

    private final boolean j() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!l.a((Object) "push", (Object) shortVideoContext.r)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.aj) {
            return true;
        }
        return false;
    }

    private final boolean l() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!shortVideoContext.O) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.Z != 15) {
            return false;
        }
        ShortVideoContext shortVideoContext3 = this.f121883a;
        if (shortVideoContext3 == null) {
            l.a("shortVideoContext");
        }
        if (!shortVideoContext3.aN) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (e() || f()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.i() || k()) {
            return false;
        }
        return true;
    }

    private final boolean g() {
        if (f()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.ap != 0) {
            ShortVideoContext shortVideoContext2 = this.f121883a;
            if (shortVideoContext2 == null) {
                l.a("shortVideoContext");
            }
            int i2 = shortVideoContext2.ap;
            int i3 = this.f121886d;
            if ((i2 & i3) != i3) {
                return false;
            }
        }
        if (!com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a()) {
            return false;
        }
        ShortVideoContext shortVideoContext3 = this.f121883a;
        if (shortVideoContext3 == null) {
            l.a("shortVideoContext");
        }
        if (!shortVideoContext3.f124757b.b()) {
            ShortVideoContext shortVideoContext4 = this.f121883a;
            if (shortVideoContext4 == null) {
                l.a("shortVideoContext");
            }
            if (!shortVideoContext4.f124757b.c()) {
                ShortVideoContext shortVideoContext5 = this.f121883a;
                if (shortVideoContext5 == null) {
                    l.a("shortVideoContext");
                }
                if (shortVideoContext5.ab != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private final boolean o() {
        int i2;
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!shortVideoContext.O) {
            ShortVideoContext shortVideoContext2 = this.f121883a;
            if (shortVideoContext2 == null) {
                l.a("shortVideoContext");
            }
            if (shortVideoContext2.f124757b.f124706a != 2) {
                return false;
            }
        }
        ShortVideoContext shortVideoContext3 = this.f121883a;
        if (shortVideoContext3 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext3.O) {
            ShortVideoContext shortVideoContext4 = this.f121883a;
            if (shortVideoContext4 == null) {
                l.a("shortVideoContext");
            }
            i2 = shortVideoContext4.Z;
        } else {
            i2 = com.ss.android.ugc.aweme.shortvideo.f.a.b().shootMode;
        }
        if (i2 == 10 || i2 == 11 || i2 == 14) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (e() || f()) {
            return false;
        }
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.i() || k()) {
            return false;
        }
        return true;
    }

    private final boolean n() {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext.r, (Object) "single_song")) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f121883a;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext2.r, (Object) "collection_music")) {
            return true;
        }
        ShortVideoContext shortVideoContext3 = this.f121883a;
        if (shortVideoContext3 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext3.r, (Object) "draft_again")) {
            return true;
        }
        ShortVideoContext shortVideoContext4 = this.f121883a;
        if (shortVideoContext4 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext4.r, (Object) "prop_page")) {
            return true;
        }
        ShortVideoContext shortVideoContext5 = this.f121883a;
        if (shortVideoContext5 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext5.r, (Object) "anchor_combine_prop")) {
            return true;
        }
        ShortVideoContext shortVideoContext6 = this.f121883a;
        if (shortVideoContext6 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext6.r, (Object) "challenge")) {
            return true;
        }
        ShortVideoContext shortVideoContext7 = this.f121883a;
        if (shortVideoContext7 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext7.r, (Object) "comment_reply")) {
            return true;
        }
        ShortVideoContext shortVideoContext8 = this.f121883a;
        if (shortVideoContext8 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext8.r, (Object) "question_and_answer")) {
            return true;
        }
        ShortVideoContext shortVideoContext9 = this.f121883a;
        if (shortVideoContext9 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext9.r, (Object) "prop_reuse")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007a, code lost:
        if (j() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00dc, code lost:
        if (j() == false) goto L_0x00e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.servicimpl.h.a():boolean");
    }

    static final class d extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(79926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(79925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            h hVar = this.this$0;
            if (!booleanValue) {
                hVar.a("api");
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        } else {
            e.a(shortVideoContext.r, shortVideoContext.q, str);
        }
    }

    private final boolean b(String str) {
        if (h()) {
            return false;
        }
        com.ss.android.ugc.aweme.record.d l2 = g.a().l();
        ShortVideoContext shortVideoContext = this.f121883a;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return l.a((Object) str, (Object) l2.getDefaultShootTabTag(shortVideoContext));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ae, code lost:
        if (b(com.ss.android.ugc.aweme.utils.ig.a(com.ss.android.ugc.aweme.servicimpl.ad.RECORD_COMBINE_180.getTagResId())) == false) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01f1, code lost:
        if (b(com.ss.android.ugc.aweme.utils.ig.a(com.ss.android.ugc.aweme.servicimpl.ad.RECORD_COMBINE_180.getTagResId())) != false) goto L_0x0091;
     */
    @Override // com.ss.android.ugc.aweme.servicimpl.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.gamora.recorder.b.a> a(com.bytedance.o.f r14) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.servicimpl.h.a(com.bytedance.o.f):java.util.List");
    }
}
