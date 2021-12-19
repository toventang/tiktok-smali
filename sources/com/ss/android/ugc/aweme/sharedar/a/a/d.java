package com.ss.android.ugc.aweme.sharedar.a.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.bytedance.tux.dialog.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.z;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f124456b = {new y(d.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f124457c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final h.h.d f124458d = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    static {
        Covode.recordClassIndex(81721);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final long a() {
        return 7;
    }

    public final e b() {
        return (e) this.f124458d.a(this, f124456b[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81722);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(81723);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.bytedance.tux.dialog.b.b bVar = new com.bytedance.tux.dialog.b.b(this.this$0.b());
            bVar.a(R.string.fv8, AnonymousClass1.f124459a);
            ((com.bytedance.tux.dialog.b) ((com.bytedance.tux.dialog.b) a.C1094a.a(this.this$0.b()).a(R.string.fv_).b(R.string.fv9)).a(bVar).a(true)).a().b().show();
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final void a(int i2, long j2, String str) {
        if (new JSONObject(str).optInt("state") == 2) {
            b(new b(this));
        }
    }
}
