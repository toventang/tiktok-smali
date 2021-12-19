package com.ss.android.ugc.aweme.aj;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.EffectSdkExtra;
import com.ss.android.vesdk.VEImageDetectUtils;
import h.f.a.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;

public final class b implements com.ss.android.ugc.aweme.sticker.c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66345a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f66346b = i.a((h.f.a.a) C1484b.f66347a);

    static {
        Covode.recordClassIndex(40766);
    }

    public final a a() {
        return (a) this.f66346b.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40767);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.aj.b$b  reason: collision with other inner class name */
    static final class C1484b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1484b f66347a = new C1484b();

        static {
            Covode.recordClassIndex(40768);
        }

        C1484b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.c.a
    public final void b() {
        a().a();
    }

    static final class c implements VEImageDetectUtils.IDetectImageResultWithNumListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f66348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f66349b;

        static {
            Covode.recordClassIndex(40769);
        }

        c(b bVar, r rVar) {
            this.f66348a = bVar;
            this.f66349b = rVar;
        }

        @Override // com.ss.android.vesdk.VEImageDetectUtils.IDetectImageResultWithNumListener
        public final void onDetectResult(String str, String str2, String str3, int i2) {
            r rVar = this.f66349b;
            l.b(str, "");
            l.b(str2, "");
            l.b(str3, "");
            rVar.a(str, str2, str3, Integer.valueOf(i2));
            this.f66348a.a().a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.c.a
    public final void a(String str, List<String> list, EffectSdkExtra effectSdkExtra, r<? super String, ? super String, ? super String, ? super Integer, z> rVar) {
        l.d(str, "");
        l.d(list, "");
        l.d(effectSdkExtra, "");
        l.d(rVar, "");
        if (effectSdkExtra.getPl().getAlg().size() != 0) {
            a().a(str, list, effectSdkExtra.getPl().getAlg(), new c(this, rVar));
        }
    }
}
