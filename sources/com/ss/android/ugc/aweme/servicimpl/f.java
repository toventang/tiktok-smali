package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f121875a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private ShortVideoContext f121876b;

    /* renamed from: c  reason: collision with root package name */
    private final int f121877c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final int f121878d = 2;

    /* renamed from: e  reason: collision with root package name */
    private final int f121879e = 4;

    /* renamed from: f  reason: collision with root package name */
    private final int f121880f = 8;

    static {
        Covode.recordClassIndex(79915);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79916);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(79917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.this$0.a());
        }
    }

    private final boolean d() {
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return shortVideoContext.c();
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(79918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            f fVar = this.this$0;
            if (com.ss.android.ugc.aweme.port.in.c.s.a()) {
                fVar.a("shoot_way");
            } else {
                fVar.a("settings");
            }
            return z.f158842a;
        }
    }

    private final boolean g() {
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a(shortVideoContext)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121876b;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.n != null) {
            return true;
        }
        return false;
    }

    private final boolean b() {
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) "comment_reply", (Object) shortVideoContext.r)) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f121876b;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (l.a((Object) shortVideoContext2.r, (Object) "question_and_answer")) {
            return true;
        }
        return false;
    }

    private final boolean c() {
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.f124757b.b()) {
            return true;
        }
        ShortVideoContext shortVideoContext2 = this.f121876b;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.f124757b.c()) {
            return true;
        }
        return false;
    }

    private final boolean f() {
        if (a()) {
            ShortVideoContext shortVideoContext = this.f121876b;
            if (shortVideoContext == null) {
                l.a("shortVideoContext");
            }
            if (shortVideoContext.aj) {
                return true;
            }
        }
        if (!e() || !g()) {
            return false;
        }
        return true;
    }

    private final boolean h() {
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (!l.a((Object) "push", (Object) shortVideoContext.r)) {
            return false;
        }
        ShortVideoContext shortVideoContext2 = this.f121876b;
        if (shortVideoContext2 == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext2.aj) {
            return true;
        }
        return false;
    }

    private final boolean e() {
        if (d()) {
            bj.a("BottomTabService:stitchMode not support mv.");
            return false;
        }
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        if (shortVideoContext.ap != 0) {
            ShortVideoContext shortVideoContext2 = this.f121876b;
            if (shortVideoContext2 == null) {
                l.a("shortVideoContext");
            }
            int i2 = shortVideoContext2.ap;
            int i3 = this.f121879e;
            if ((i2 & i3) != i3) {
                StringBuilder sb = new StringBuilder("BottomTabService:tabs not right.tab:");
                ShortVideoContext shortVideoContext3 = this.f121876b;
                if (shortVideoContext3 == null) {
                    l.a("shortVideoContext");
                }
                StringBuilder append = sb.append(shortVideoContext3.ap).append(",mask:");
                ShortVideoContext shortVideoContext4 = this.f121876b;
                if (shortVideoContext4 == null) {
                    l.a("shortVideoContext");
                }
                bj.a(append.append(shortVideoContext4.ap & this.f121879e).toString());
                return false;
            }
        }
        if (!com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a()) {
            bj.a("BottomTabService:ab not support mv.");
            return false;
        }
        ShortVideoContext shortVideoContext5 = this.f121876b;
        if (shortVideoContext5 == null) {
            l.a("shortVideoContext");
        }
        if (!shortVideoContext5.f124757b.b()) {
            ShortVideoContext shortVideoContext6 = this.f121876b;
            if (shortVideoContext6 == null) {
                l.a("shortVideoContext");
            }
            if (!shortVideoContext6.f124757b.c()) {
                ShortVideoContext shortVideoContext7 = this.f121876b;
                if (shortVideoContext7 == null) {
                    l.a("shortVideoContext");
                }
                if (shortVideoContext7.ab == null) {
                    return true;
                }
                bj.a("BottomTabService:shoutOut not support mv.");
                return false;
            }
        }
        bj.a("BottomTabService:duet/react mode not support mv.");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (h() == false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.servicimpl.f.a():boolean");
    }

    static final class e extends m implements h.f.a.b<Integer, Integer> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(79920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Integer invoke(Integer num) {
            return Integer.valueOf(num.intValue());
        }
    }

    static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(79919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            f fVar = this.this$0;
            if (!booleanValue) {
                fVar.a("api");
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        } else {
            com.ss.android.ugc.aweme.shortvideo.n.e.a(shortVideoContext.r, shortVideoContext.q, str);
        }
    }

    private final boolean b(String str) {
        if (f()) {
            return false;
        }
        com.ss.android.ugc.aweme.record.d l2 = g.a().l();
        ShortVideoContext shortVideoContext = this.f121876b;
        if (shortVideoContext == null) {
            l.a("shortVideoContext");
        }
        return l.a((Object) str, (Object) l2.getDefaultShootTabTag(shortVideoContext));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027b, code lost:
        if (b(com.ss.android.ugc.aweme.utils.ig.a(com.ss.android.ugc.aweme.servicimpl.ad.RECORD_COMBINE_180.getTagResId())) == false) goto L_0x027f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fa, code lost:
        if (r2.Z == 14) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018d, code lost:
        if ((r3 & r2) == r2) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e5, code lost:
        if ((r3 & r2) == r2) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x021e  */
    @Override // com.ss.android.ugc.aweme.servicimpl.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.ugc.gamora.recorder.b.a> a(com.bytedance.o.f r18) {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.servicimpl.f.a(com.bytedance.o.f):java.util.List");
    }
}
