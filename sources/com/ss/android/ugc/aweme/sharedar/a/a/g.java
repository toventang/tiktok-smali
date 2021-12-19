package com.ss.android.ugc.aweme.sharedar.a.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;
import org.json.JSONObject;

public final class g extends a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f124468b = {new y(g.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f124469c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final d f124470d = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    static {
        Covode.recordClassIndex(81734);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final long a() {
        return 5;
    }

    public final e b() {
        return (e) this.f124470d.a(this, f124468b[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81735);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ String $message;
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(81736);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, String str) {
            super(0);
            this.this$0 = gVar;
            this.$message = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.tools.view.widget.d.b(this.this$0.b(), this.$message, 0).b();
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final void a(int i2, long j2, String str) {
        String string;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            int i3 = -1;
            if (jSONObject.has("state")) {
                i3 = jSONObject.optInt("state", -1);
            }
            if (i3 == 0) {
                string = b().getString(R.string.fvf);
            } else if (i3 == 1) {
                string = b().getString(R.string.fvg);
            } else if (i3 == 2) {
                string = b().getString(R.string.fuv);
            } else if (i3 == 3) {
                string = b().getString(R.string.fvh);
            } else if (i3 != 4) {
                string = "";
            } else {
                string = b().getString(R.string.fvi);
            }
            l.b(string, "");
            if (string.length() > 0) {
                b(new b(this, string));
            }
        }
    }
}
