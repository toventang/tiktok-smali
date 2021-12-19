package com.ss.android.ugc.aweme.sharedar;

import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.recorder.view.ASCameraView;
import com.ss.android.ugc.aweme.sharedar.a.a.c;
import com.ss.android.ugc.aweme.sharedar.a.a.e;
import com.ss.android.ugc.aweme.sharedar.a.a.g;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final a f124490d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f124491a = i.a((h.f.a.a) new b(this));

    /* renamed from: b  reason: collision with root package name */
    public final f f124492b;

    /* renamed from: c  reason: collision with root package name */
    final h.f.a.a<Boolean> f124493c;

    /* renamed from: e  reason: collision with root package name */
    private final com.bytedance.creativex.recorder.b.a.d f124494e;

    static {
        Covode.recordClassIndex(81753);
    }

    static boolean a(long j2, long j3) {
        return j2 == -1 || j2 == j3;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81754);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<List<? extends com.ss.android.ugc.aweme.sharedar.a.a.a>> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(81755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends com.ss.android.ugc.aweme.sharedar.a.a.a> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.ss.android.ugc.aweme.sharedar.a.a.f(this.this$0.f124492b));
            arrayList.add(new g(this.this$0.f124492b));
            arrayList.add(new c(this.this$0.f124492b));
            arrayList.add(new e(this.this$0.f124492b));
            arrayList.add(new com.ss.android.ugc.aweme.sharedar.a.a.b(this.this$0.f124492b));
            arrayList.add(new com.ss.android.ugc.aweme.sharedar.a.a.d(this.this$0.f124492b));
            return n.k(arrayList);
        }
    }

    public d(f fVar, com.bytedance.creativex.recorder.b.a.d dVar, h.f.a.a<Boolean> aVar) {
        l.d(fVar, "");
        l.d(dVar, "");
        l.d(aVar, "");
        this.f124492b = fVar;
        this.f124494e = dVar;
        this.f124493c = aVar;
    }

    public final void a(int i2, long j2, long j3, String str) {
        String str2 = str;
        q.a("SharedAR", "[Client --> Effect]: msgID(" + i2 + "), arg1(" + j2 + "), arg2(" + j3 + "), arg3(" + str2 + ')');
        ASCameraView D = this.f124494e.D();
        if (str2 == null) {
            str2 = "empty_message";
        }
        D.a(i2, j2, j3, str2);
    }
}
