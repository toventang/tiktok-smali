package com.ss.android.ugc.aweme.sharedar.a.a;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f124452b = {new y(c.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new y(c.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f124453c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private final d f124454d = com.bytedance.o.b.a.a(getDiContainer(), e.class);

    /* renamed from: e  reason: collision with root package name */
    private final d f124455e = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.sharedar.c.class);

    static {
        Covode.recordClassIndex(81717);
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final long a() {
        return 9;
    }

    public final e b() {
        return (e) this.f124454d.a(this, f124452b[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81718);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ String $message;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(81719);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, String str) {
            super(0);
            this.this$0 = cVar;
            this.$message = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.tools.view.widget.d.b(this.this$0.b(), this.$message, 0).b();
            return z.f158842a;
        }
    }

    public final ShortVideoContext c() {
        ac a2 = ae.a(b(), (ad.b) null).a(ShortVideoContextViewModel.class);
        l.b(a2, "");
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a2).f124769a;
        l.b(shortVideoContext, "");
        return shortVideoContext;
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.a.a.c$c  reason: collision with other inner class name */
    static final class C3250c extends m implements h.f.a.a<z> {
        final /* synthetic */ String $secUid;
        final /* synthetic */ int $status;
        final /* synthetic */ String $username;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(81720);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3250c(c cVar, int i2, String str, String str2) {
            super(0);
            this.this$0 = cVar;
            this.$status = i2;
            this.$username = str;
            this.$secUid = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (this.$status == 1) {
                SharedARModel sharedARModel = this.this$0.c().S;
                if (sharedARModel != null) {
                    sharedARModel.setSharedARMultiPlayerUserName(this.$username);
                }
                SharedARModel sharedARModel2 = this.this$0.c().S;
                if (sharedARModel2 != null) {
                    sharedARModel2.setSharedARMultiPlayerUserId(this.$secUid);
                }
            }
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(f fVar) {
        super(fVar);
        l.d(fVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sharedar.a.a.a
    public final void a(int i2, long j2, String str) {
        String string;
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("username", "");
            String optString2 = jSONObject.optString("sec_uid", "");
            int optInt = jSONObject.optInt("status", -1);
            if (optInt == 0) {
                string = b().getString(R.string.fuv, new Object[]{optString});
            } else if (optInt != 1) {
                string = "";
            } else {
                string = b().getString(R.string.fvg, new Object[]{optString});
            }
            l.b(string, "");
            if (string.length() > 0) {
                b(new b(this, string));
            }
            b(new C3250c(this, optInt, optString, optString2));
        }
    }
}
