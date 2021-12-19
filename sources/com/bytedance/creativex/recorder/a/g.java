package com.bytedance.creativex.recorder.a;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.g.o;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: j  reason: collision with root package name */
    public static final a f28072j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f28073a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28074b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28075c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.c.a<String, Boolean> f28076d = new androidx.c.a<>();

    /* renamed from: e  reason: collision with root package name */
    long f28077e;

    /* renamed from: f  reason: collision with root package name */
    public final f.b f28078f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.b.a.d f28079g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.a.a.a f28080h;

    /* renamed from: i  reason: collision with root package name */
    public final h.f.a.b<Boolean, z> f28081i;

    static {
        Covode.recordClassIndex(16441);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(16442);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        com.ss.android.ugc.asve.f.g.a(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ g this$0;

        static {
            Covode.recordClassIndex(16443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(0);
            this.this$0 = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (!this.this$0.f28073a || !this.this$0.f28075c || this.this$0.f28074b) {
                this.this$0.f28081i.invoke(false);
            } else {
                this.this$0.f28081i.invoke(true);
            }
            return z.f158842a;
        }
    }

    public final void b() {
        boolean z;
        Iterator<Map.Entry<String, Boolean>> it = this.f28076d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Boolean value = it.next().getValue();
            l.b(value, "");
            if (value.booleanValue()) {
                z = true;
                break;
            }
        }
        if (this.f28073a != z) {
            this.f28073a = z;
            a();
        }
    }

    public static final class c implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f28082a;

        static {
            Covode.recordClassIndex(16444);
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.b
        public final void a(ComposerBeauty composerBeauty, List<String> list) {
            l.d(composerBeauty, "");
            l.d(list, "");
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.b
        public final void b(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.b
        public final void b(ComposerBeauty composerBeauty, List<String> list) {
            l.d(composerBeauty, "");
            l.d(list, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(g gVar) {
            this.f28082a = gVar;
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.b
        public final void a(ComposerBeauty composerBeauty) {
            l.d(composerBeauty, "");
            if (com.ss.android.ugc.aweme.tools.beauty.d.g(composerBeauty) && composerBeauty != null) {
                this.f28082a.f28076d.clear();
                this.f28082a.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.b
        public final void a(BeautyCategory beautyCategory) {
            Boolean bool;
            l.d(beautyCategory, "");
            g gVar = this.f28082a;
            BeautyCategoryExtra beautyCategoryExtra = beautyCategory.getBeautyCategoryExtra();
            if (beautyCategoryExtra != null) {
                bool = Boolean.valueOf(beautyCategoryExtra.getShowTips());
            } else {
                bool = null;
            }
            gVar.f28075c = bool.booleanValue();
            this.f28082a.a();
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.service.f.b
        public final void a(ComposerBeauty composerBeauty, int i2, List<String> list) {
            boolean z;
            l.d(composerBeauty, "");
            l.d(list, "");
            BeautyCategoryExtra categoryExtra = composerBeauty.getCategoryExtra();
            if (categoryExtra != null && categoryExtra.getShowTips()) {
                androidx.c.a<String, Boolean> aVar = this.f28082a.f28076d;
                String resourceId = composerBeauty.getEffect().getResourceId();
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.put(resourceId, Boolean.valueOf(z));
                this.f28082a.b();
            }
        }
    }

    public static final class e implements com.ss.android.ugc.asve.wrap.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f28084a;

        static {
            Covode.recordClassIndex(16446);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(g gVar) {
            this.f28084a = gVar;
        }

        @Override // com.ss.android.ugc.asve.wrap.b
        public final void a(com.ss.android.ugc.asve.wrap.a[] aVarArr) {
            boolean z;
            g gVar = this.f28084a;
            if (aVarArr == null || aVarArr.length == 0) {
                z = false;
            } else {
                z = true;
            }
            gVar.f28074b = z;
            g gVar2 = this.f28084a;
            if (System.currentTimeMillis() - gVar2.f28077e >= 1000) {
                gVar2.f28077e = System.currentTimeMillis();
                this.f28084a.a();
            }
        }
    }

    static final class d<T> implements u<o<ComposerBeauty>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f28083a;

        static {
            Covode.recordClassIndex(16445);
        }

        d(g gVar) {
            this.f28083a = gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(o<ComposerBeauty> oVar) {
            BeautyCategoryExtra categoryExtra;
            boolean z;
            o<ComposerBeauty> oVar2 = oVar;
            if (oVar2 != null) {
                for (ComposerBeauty composerBeauty : oVar2) {
                    if (!(composerBeauty == null || (categoryExtra = composerBeauty.getCategoryExtra()) == null || !categoryExtra.getShowTips())) {
                        androidx.c.a<String, Boolean> aVar = this.f28083a.f28076d;
                        String resourceId = composerBeauty.getEffect().getResourceId();
                        if (composerBeauty.getProgressValue() != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        aVar.put(resourceId, Boolean.valueOf(z));
                        this.f28083a.b();
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(com.bytedance.creativex.recorder.b.a.d dVar, com.bytedance.creativex.recorder.a.a.a aVar, h.f.a.b<? super Boolean, z> bVar) {
        l.d(dVar, "");
        l.d(aVar, "");
        l.d(bVar, "");
        this.f28079g = dVar;
        this.f28080h = aVar;
        this.f28081i = bVar;
    }
}
