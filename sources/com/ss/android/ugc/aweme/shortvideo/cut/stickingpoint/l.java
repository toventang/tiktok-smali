package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.property.cj;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final class l {

    /* renamed from: g  reason: collision with root package name */
    public static final a f125972g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.asve.editor.g f125973a;

    /* renamed from: b  reason: collision with root package name */
    public int f125974b = -1;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f125975c;

    /* renamed from: d  reason: collision with root package name */
    public b f125976d;

    /* renamed from: e  reason: collision with root package name */
    public int f125977e;

    /* renamed from: f  reason: collision with root package name */
    public final b f125978f;

    /* renamed from: h  reason: collision with root package name */
    private final HashMap<String, List<com.ss.android.ugc.aweme.shortvideo.cut.model.e>> f125979h = new HashMap<>();

    public interface b {
        static {
            Covode.recordClassIndex(82764);
        }

        void a(int i2);

        void a(long j2);

        boolean a();

        List<VideoSegment> b();
    }

    static {
        Covode.recordClassIndex(82761);
    }

    public static boolean a(int i2) {
        return i2 == 6 || i2 == 7;
    }

    private static boolean d(int i2) {
        return i2 == 1 || i2 == 4 || i2 == 3;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82763);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar != null) {
            try {
                if (gVar.f() == x.j.STARTED) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void a(List<? extends VideoSegment> list, int i2, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        if (this.f125973a == null) {
            fVar.a();
        } else if (com.ss.android.ugc.tools.utils.k.a(list)) {
            fVar.a();
        } else {
            b.i.b(new c(this, i2, list), b.i.f4824a).a(new d(this, fVar, i2, list), b.i.f4826c, null);
        }
    }

    public final void a(boolean z, boolean z2, int i2, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        k();
        if (z2) {
            a((com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f) new e(this, fVar, i2, 4), true);
        } else if (z) {
            b bVar = this.f125976d;
            if (bVar == null) {
                h.f.b.l.b();
            }
            List<VideoSegment> b2 = bVar.b();
            if (!com.ss.android.ugc.tools.utils.k.a(b2)) {
                ArrayList arrayList = new ArrayList();
                for (T t : b2) {
                    if (t.n != null) {
                        arrayList.add(t.n.clone());
                    }
                }
                com.ss.android.ugc.aweme.shortvideo.c cVar = this.f125975c;
                if (cVar != null) {
                    HashMap<String, List<com.ss.android.ugc.aweme.shortvideo.cut.model.e>> hashMap = this.f125979h;
                    String musicId = cVar.getMusicId();
                    h.f.b.l.b(musicId, "");
                    hashMap.put(musicId, arrayList);
                }
            }
            b(this.f125975c, i2, 6, fVar);
        } else {
            b(this.f125975c, i2, 7, fVar);
        }
    }

    public static final class e implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f125988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f125989b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125990c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f125991d;

        static {
            Covode.recordClassIndex(82767);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f125989b;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            l lVar = this.f125988a;
            lVar.b(lVar.f125975c, this.f125990c, this.f125991d, this.f125989b);
        }

        e(l lVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar, int i2, int i3) {
            this.f125988a = lVar;
            this.f125989b = fVar;
            this.f125990c = i2;
            this.f125991d = i3;
        }
    }

    private final boolean i() {
        if (this.f125974b >= 0) {
            return true;
        }
        return false;
    }

    private final boolean j() {
        if (this.f125973a != null) {
            return true;
        }
        return false;
    }

    public final void b() {
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar != null) {
            gVar.u();
        }
    }

    public static final class h implements com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f125998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f125999b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f126000c;

        static {
            Covode.recordClassIndex(82770);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a() {
            this.f125998a.f125974b = -1;
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f125999b;
            if (fVar != null) {
                fVar.a();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f
        public final void a(int i2) {
            this.f125998a.f125974b = i2;
            if (!l.a(this.f126000c)) {
                this.f125998a.a(this.f126000c, -1);
            } else {
                if (this.f125998a.f125976d != null) {
                    b bVar = this.f125998a.f125976d;
                    if (bVar == null) {
                        h.f.b.l.b();
                    }
                    bVar.a(this.f126000c);
                }
                l lVar = this.f125998a;
                this.f125998a.a(lVar.b(lVar.f125977e));
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f125999b;
            if (fVar != null) {
                fVar.a(this.f125998a.f125974b);
            }
        }

        h(l lVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar, int i2) {
            this.f125998a = lVar;
            this.f125999b = fVar;
            this.f126000c = i2;
        }
    }

    private final void k() {
        if (this.f125976d == null) {
            throw new IllegalArgumentException("stickpoint listener not init");
        }
    }

    public final void c() {
        com.ss.android.ugc.asve.editor.g gVar;
        if (!a() && (gVar = this.f125973a) != null) {
            gVar.t();
        }
    }

    public final int e() {
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar == null) {
            return 0;
        }
        return gVar.k();
    }

    static final class m<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f126010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f126011b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VEAlgorithmPath f126012c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f126013d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f126014e;

        static {
            Covode.recordClassIndex(82775);
        }

        m(l lVar, String str, VEAlgorithmPath vEAlgorithmPath, int i2, int i3) {
            this.f126010a = lVar;
            this.f126011b = str;
            this.f126012c = vEAlgorithmPath;
            this.f126013d = i2;
            this.f126014e = i3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(this.f126010a.f125978f.a(this.f126011b, this.f126012c, this.f126013d, this.f126014e, null));
        }
    }

    public l() {
        b bVar = new b();
        this.f125978f = bVar;
        bVar.f125884a = new b.a(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l f125980a;

            static {
                Covode.recordClassIndex(82762);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f125980a = r1;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a
            public final int a(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath) {
                h.f.b.l.d(str, "");
                h.f.b.l.d(vEAlgorithmPath, "");
                if (this.f125980a.f125973a == null) {
                    return -1;
                }
                com.ss.android.ugc.asve.editor.g gVar = this.f125980a.f125973a;
                if (gVar == null) {
                    h.f.b.l.b();
                }
                int a2 = gVar.a(str, i2, i3, vEAlgorithmPath);
                com.ss.android.ugc.asve.editor.g gVar2 = this.f125980a.f125973a;
                if (gVar2 == null) {
                    h.f.b.l.b();
                }
                gVar2.a(0, 1, 0.5f);
                return a2;
            }
        };
    }

    private final List<VEClipAlgorithmParam> h() {
        if (this.f125973a == null || !i()) {
            return null;
        }
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar == null) {
            h.f.b.l.b();
        }
        return gVar.l();
    }

    public final boolean d() {
        Integer valueOf;
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar == null || (valueOf = Integer.valueOf(gVar.j(this.f125974b))) == null || valueOf.intValue() != 0) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f125973a != null && i()) {
            com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
            if (gVar == null) {
                h.f.b.l.b();
            }
            if (gVar.C() == 0) {
                a(5, -1);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class i<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f126001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f126002b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f126003c;

        static {
            Covode.recordClassIndex(82771);
        }

        i(l lVar, int i2, int i3) {
            this.f126001a = lVar;
            this.f126002b = i2;
            this.f126003c = i3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.asve.editor.g gVar = this.f126001a.f125973a;
            if (gVar == null) {
                h.f.b.l.b();
            }
            int e2 = gVar.e(this.f126002b, this.f126003c);
            if (e2 >= 0) {
                com.ss.android.ugc.asve.editor.g gVar2 = this.f126001a.f125973a;
                if (gVar2 == null) {
                    h.f.b.l.b();
                }
                e2 = gVar2.D();
                if (e2 >= 0) {
                    com.ss.android.ugc.asve.editor.g gVar3 = this.f126001a.f125973a;
                    if (gVar3 == null) {
                        h.f.b.l.b();
                    }
                    e2 = gVar3.B();
                }
            }
            return Integer.valueOf(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f126007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f126008b;

        static {
            Covode.recordClassIndex(82773);
        }

        k(l lVar, boolean z) {
            this.f126007a = lVar;
            this.f126008b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            if (this.f126007a.f125973a != null) {
                com.ss.android.ugc.asve.editor.g gVar = this.f126007a.f125973a;
                if (gVar == null) {
                    h.f.b.l.b();
                }
                i2 = gVar.D();
                if (this.f126008b && i2 >= 0) {
                    com.ss.android.ugc.asve.editor.g gVar2 = this.f126007a.f125973a;
                    if (gVar2 == null) {
                        h.f.b.l.b();
                    }
                    i2 = gVar2.B();
                }
            } else {
                i2 = -1;
            }
            return Integer.valueOf(i2);
        }
    }

    public final void g() {
        b bVar;
        List<VideoSegment> b2;
        if (!(!f.f125945d || (bVar = this.f125976d) == null || (b2 = bVar.b()) == null)) {
            for (T t : b2) {
                if (com.ss.android.ugc.tools.utils.h.a(t.a(false), true)) {
                    t.f125478b = 3000;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f125992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f125993b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VEAlgorithmPath f125994c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f125995d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f125996e;

        static {
            Covode.recordClassIndex(82768);
        }

        f(l lVar, String str, VEAlgorithmPath vEAlgorithmPath, int i2, int i3) {
            this.f125992a = lVar;
            this.f125993b = str;
            this.f125994c = vEAlgorithmPath;
            this.f125995d = i2;
            this.f125996e = i3;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            long j2;
            int i2;
            b bVar = this.f125992a.f125978f;
            String str = this.f125993b;
            VEAlgorithmPath vEAlgorithmPath = this.f125994c;
            int i3 = this.f125995d;
            int b2 = com.ss.android.ugc.aweme.port.in.l.f115658a.b().b(str);
            if (cj.a()) {
                j2 = com.ss.android.ugc.aweme.port.in.g.a().l().getMaxDurationResolver().getMaxShootingDuration();
            } else {
                j2 = 15000;
            }
            int i4 = (int) j2;
            if (b2 > 0) {
                i2 = bVar.a(str, vEAlgorithmPath, i3, Math.min(Math.min(i4, b2), i3 + 20000), Integer.valueOf(b2));
            } else {
                i2 = -1;
            }
            int i5 = this.f125996e;
            if ((i5 == 2 || i5 == 4) && i2 >= 0) {
                com.ss.android.ugc.asve.editor.g gVar = this.f125992a.f125973a;
                if (gVar == null) {
                    h.f.b.l.b();
                }
                i2 = gVar.B();
            }
            return Integer.valueOf(i2);
        }
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f125981a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f125982b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f125983c;

        static {
            Covode.recordClassIndex(82765);
        }

        c(l lVar, int i2, List list) {
            this.f125981a = lVar;
            this.f125982b = i2;
            this.f125983c = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2 = this.f125982b;
            List list = this.f125983c;
            if (list == null) {
                h.f.b.l.b();
            }
            int size = i2 - list.size();
            ArrayList<VEClipSourceParam> arrayList = new ArrayList<>();
            ArrayList<VEClipTimelineParam> arrayList2 = new ArrayList<>();
            for (VideoSegment videoSegment : this.f125983c) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = videoSegment.a(false).toString();
                vEClipSourceParam.clipWidth = videoSegment.f125482f;
                vEClipSourceParam.clipHeight = videoSegment.f125483g;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) com.ss.android.ugc.aweme.tools.i.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) videoSegment.f125478b;
                arrayList2.add(vEClipTimelineParam);
            }
            com.ss.android.ugc.asve.editor.g gVar = this.f125981a.f125973a;
            if (gVar == null) {
                h.f.b.l.b();
            }
            int a2 = gVar.a(size, arrayList, arrayList2);
            if (a2 >= 0) {
                com.ss.android.ugc.asve.editor.g gVar2 = this.f125981a.f125973a;
                if (gVar2 == null) {
                    h.f.b.l.b();
                }
                a2 = gVar2.D();
                if (a2 >= 0) {
                    com.ss.android.ugc.asve.editor.g gVar3 = this.f125981a.f125973a;
                    if (gVar3 == null) {
                        h.f.b.l.b();
                    }
                    a2 = gVar3.B();
                }
            }
            return Integer.valueOf(a2);
        }
    }

    public final void a(b bVar) {
        h.f.b.l.d(bVar, "");
        this.f125976d = bVar;
    }

    public final void c(int i2) {
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar != null) {
            gVar.c(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f125997a;

        static {
            Covode.recordClassIndex(82769);
        }

        g(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
            this.f125997a = fVar;
        }

        @Override // b.g
        public final Object then(b.i<Integer> iVar) {
            if (iVar == null || iVar.d() == null || iVar.d().intValue() < 0) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f125997a;
                if (fVar == null) {
                    return null;
                }
                fVar.a();
                return null;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar2 = this.f125997a;
            if (fVar2 == null) {
                return null;
            }
            Integer d2 = iVar.d();
            h.f.b.l.b(d2, "");
            fVar2.a(d2.intValue());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$l  reason: collision with other inner class name */
    public static final class C3280l<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f126009a;

        static {
            Covode.recordClassIndex(82774);
        }

        C3280l(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
            this.f126009a = fVar;
        }

        @Override // b.g
        public final Object then(b.i<Integer> iVar) {
            if (iVar == null || iVar.d() == null) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f126009a;
                if (fVar == null) {
                    return null;
                }
                fVar.a();
                return null;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar2 = this.f126009a;
            if (fVar2 == null) {
                return null;
            }
            Integer d2 = iVar.d();
            h.f.b.l.b(d2, "");
            fVar2.a(d2.intValue());
            return null;
        }
    }

    static final class n<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f126015a;

        static {
            Covode.recordClassIndex(82776);
        }

        n(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
            this.f126015a = fVar;
        }

        @Override // b.g
        public final Object then(b.i<Integer> iVar) {
            if (iVar == null || iVar.d() == null || iVar.d().intValue() < 0) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f126015a;
                if (fVar == null) {
                    return null;
                }
                fVar.a();
                return null;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar2 = this.f126015a;
            if (fVar2 == null) {
                return null;
            }
            Integer d2 = iVar.d();
            h.f.b.l.b(d2, "");
            fVar2.a(d2.intValue());
            return null;
        }
    }

    public final long b(int i2) {
        b bVar = this.f125976d;
        long j2 = 0;
        if (bVar != null) {
            List<VideoSegment> b2 = bVar.b();
            if (com.ss.android.ugc.tools.utils.k.a(b2)) {
                return 0;
            }
            if (i2 >= 0 && i2 < b2.size()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (!b2.get(i3).f125485i) {
                        j2 += b2.get(i3).e() - b2.get(i3).d();
                    }
                }
            }
        }
        return j2;
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f125984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f125985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f125986c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f125987d;

        static {
            Covode.recordClassIndex(82766);
        }

        d(l lVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar, int i2, List list) {
            this.f125984a = lVar;
            this.f125985b = fVar;
            this.f125986c = i2;
            this.f125987d = list;
        }

        @Override // b.g
        public final Object then(b.i<Integer> iVar) {
            if (iVar == null || iVar.d() == null) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f125985b;
                if (fVar == null) {
                    return null;
                }
                fVar.a();
                return null;
            } else if (iVar.d().intValue() == 0) {
                int i2 = this.f125986c;
                List list = this.f125987d;
                if (list == null) {
                    h.f.b.l.b();
                }
                this.f125984a.a(1, i2 - list.size());
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar2 = this.f125985b;
                if (fVar2 == null) {
                    return null;
                }
                fVar2.a(iVar.d().intValue());
                return null;
            } else {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar3 = this.f125985b;
                if (fVar3 == null) {
                    return null;
                }
                fVar3.a();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f126004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f f126005b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f126006c;

        static {
            Covode.recordClassIndex(82772);
        }

        j(l lVar, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar, int i2) {
            this.f126004a = lVar;
            this.f126005b = fVar;
            this.f126006c = i2;
        }

        @Override // b.g
        public final Object then(b.i<Integer> iVar) {
            if (iVar == null || iVar.d() == null) {
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar = this.f126005b;
                if (fVar == null) {
                    return null;
                }
                fVar.a();
                return null;
            }
            Integer d2 = iVar.d();
            if (d2 != null && d2.intValue() == 0) {
                this.f126004a.a(3, this.f126006c);
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar2 = this.f126005b;
                if (fVar2 == null) {
                    return null;
                }
                Integer d3 = iVar.d();
                h.f.b.l.b(d3, "");
                fVar2.a(d3.intValue());
                return null;
            }
            com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar3 = this.f126005b;
            if (fVar3 == null) {
                return null;
            }
            fVar3.a();
            return null;
        }
    }

    public final void a(long j2) {
        com.ss.android.ugc.asve.editor.g gVar = this.f125973a;
        if (gVar != null) {
            gVar.a((int) j2, x.f.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    private static void a(VEClipAlgorithmParam vEClipAlgorithmParam, VideoSegment videoSegment) {
        if (vEClipAlgorithmParam != null && videoSegment != null && f.f125945d && com.ss.android.ugc.tools.utils.h.a(videoSegment.a(false), false) && vEClipAlgorithmParam.range > 3000) {
            videoSegment.f125478b = (long) vEClipAlgorithmParam.range;
        }
    }

    public final void a(int i2, int i3) {
        long j2;
        boolean a2;
        if (i()) {
            k();
            b bVar = this.f125976d;
            if (bVar == null) {
                h.f.b.l.b();
            }
            List<VideoSegment> b2 = bVar.b();
            if (!com.ss.android.ugc.tools.utils.k.a(b2)) {
                List<VEClipAlgorithmParam> h2 = h();
                if (com.ss.android.ugc.tools.utils.k.a(h2)) {
                    a(0L);
                    return;
                }
                for (VideoSegment videoSegment : b2) {
                    if (h2 == null) {
                        h.f.b.l.b();
                    }
                    for (VEClipAlgorithmParam vEClipAlgorithmParam : h2) {
                        if (vEClipAlgorithmParam.index == videoSegment.f125477a) {
                            a(vEClipAlgorithmParam, videoSegment);
                            if (videoSegment.n == null) {
                                if (i2 == 5) {
                                    j2 = (long) vEClipAlgorithmParam.trimIn;
                                } else {
                                    j2 = 0;
                                }
                                videoSegment.n = new com.ss.android.ugc.aweme.shortvideo.cut.model.e(videoSegment.f125477a, j2, (long) vEClipAlgorithmParam.range, videoSegment.f125478b);
                                b bVar2 = this.f125976d;
                                if (bVar2 == null) {
                                    a2 = false;
                                } else {
                                    a2 = bVar2.a();
                                }
                                videoSegment.o = a2;
                            } else if (i2 == 5) {
                                videoSegment.n.resetVideoStartTime((long) vEClipAlgorithmParam.trimIn, (long) vEClipAlgorithmParam.range);
                            } else if (i2 == 2 || i2 == 6) {
                                HashMap<String, List<com.ss.android.ugc.aweme.shortvideo.cut.model.e>> hashMap = this.f125979h;
                                com.ss.android.ugc.aweme.shortvideo.c cVar = this.f125975c;
                                if (cVar == null) {
                                    h.f.b.l.b();
                                }
                                List<com.ss.android.ugc.aweme.shortvideo.cut.model.e> list = hashMap.get(cVar.getMusicId());
                                if (com.ss.android.ugc.tools.utils.k.a(list)) {
                                    videoSegment.n.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                                } else {
                                    com.ss.android.ugc.aweme.shortvideo.cut.model.e eVar = null;
                                    if (list == null) {
                                        h.f.b.l.b();
                                    }
                                    for (com.ss.android.ugc.aweme.shortvideo.cut.model.e eVar2 : list) {
                                        if (eVar2.getVideoIndex() == videoSegment.f125477a) {
                                            eVar = eVar2;
                                        }
                                    }
                                    if (eVar != null) {
                                        videoSegment.n.resetVideoStartTime(eVar.getVideoStart(), eVar.getVideoRange());
                                    } else {
                                        videoSegment.n.resetVideoStartTime(0, (long) vEClipAlgorithmParam.range);
                                    }
                                }
                            } else if (d(i2)) {
                                videoSegment.n.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                            }
                        }
                    }
                }
                b bVar3 = this.f125976d;
                if (bVar3 != null) {
                    bVar3.a(i2);
                    bVar3.a(b(i3));
                }
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar, boolean z) {
        b.i.b(new k(this, z), b.i.f4825b).a(new C3280l(fVar), b.i.f4826c, null);
    }

    public final void a(int i2, int i3, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        if (i2 == i3 && fVar != null) {
            fVar.a();
        } else if (this.f125973a != null && i()) {
            b.i.b(new i(this, i2, i3), b.i.f4824a).a(new j(this, fVar, i3), b.i.f4826c, null);
        }
    }

    public final void b(com.ss.android.ugc.aweme.shortvideo.c cVar, int i2, int i3, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        this.f125975c = cVar;
        this.f125978f.f125885b = cVar;
        if (j() && cVar != null && cVar.getStickPointMusicAlg() != null) {
            String c2 = f.c(cVar);
            Application application = null;
            try {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
                ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
                h.f.b.l.b(applicationService, "");
                application = applicationService.c();
            } catch (Exception unused) {
                q.d("ServiceManager fail, no context and local music load fail");
            }
            if (com.ss.android.ugc.aweme.video.e.b(c2) || com.ss.android.ugc.aweme.shortvideo.af.b.a(application, Uri.parse(c2))) {
                a(c2, i2, i3, b.a(cVar), new h(this, fVar, i3));
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.c cVar, int i2, int i3, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        String c2 = f.c(cVar);
        if (!com.ss.android.ugc.aweme.video.e.b(c2)) {
            fVar.a();
        }
        b.i.b(new m(this, c2, b.a(cVar), i2, i3), b.i.f4824a).a(new n(fVar), b.i.f4826c, null);
    }

    private final void a(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.f fVar) {
        b.i.b(new f(this, str, vEAlgorithmPath, i2, i3), b.i.f4824a).a(new g(fVar), b.i.f4826c, null);
    }
}
