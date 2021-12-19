package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.a.j;
import com.bytedance.keva.Keva;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.filter.repository.a.m;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.ag;
import h.f.b.l;
import h.v;
import h.z;
import java.util.List;
import java.util.Map;

public final class ah {

    /* renamed from: f  reason: collision with root package name */
    public static final a f131259f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Map<String, String> f131260a = ag.a(v.a("filtercomposer", "colorfilternew"), v.a("filtercomposerexperiment", "colorfilterexperiment"));

    /* renamed from: b  reason: collision with root package name */
    public final Keva f131261b = Keva.getRepo("Filter_Data_Migration");

    /* renamed from: c  reason: collision with root package name */
    public final m f131262c;

    /* renamed from: d  reason: collision with root package name */
    public final m f131263d;

    /* renamed from: e  reason: collision with root package name */
    public final j f131264e;

    static {
        Covode.recordClassIndex(85994);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85995);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f131267a;

        static {
            Covode.recordClassIndex(85999);
        }

        e(String str) {
            this.f131267a = str;
        }

        @Override // com.google.c.a.q
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f131267a;
        }
    }

    static final class d<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final d f131266a = new d();

        static {
            Covode.recordClassIndex(85998);
        }

        d() {
        }

        @Override // com.google.c.a.q
        public final /* synthetic */ Object b() {
            return g.a().r().e();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ExceptionResult, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f131265a = new c();

        static {
            Covode.recordClassIndex(85997);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ z invoke(ExceptionResult exceptionResult) {
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<List<? extends Effect>, z> {
        final /* synthetic */ String $cachedPanel;
        final /* synthetic */ int $oldDefaultFilterId;
        final /* synthetic */ h.f.a.b $onDefaultFilterChanged;
        final /* synthetic */ h.f.a.a $onSuccess;
        final /* synthetic */ ah this$0;

        static {
            Covode.recordClassIndex(85996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ah ahVar, int i2, h.f.a.b bVar, String str, h.f.a.a aVar) {
            super(1);
            this.this$0 = ahVar;
            this.$oldDefaultFilterId = i2;
            this.$onDefaultFilterChanged = bVar;
            this.$cachedPanel = str;
            this.$onSuccess = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends Effect> list) {
            List<? extends Effect> list2 = list;
            l.d(list2, "");
            for (T t : list2) {
                FilterBean filterBean = new FilterBean();
                filterBean.setId(Integer.parseInt(t.getEffectId()));
                filterBean.setFilterFolder(t.getUnzipPath());
                filterBean.setFilterFilePath(t.getUnzipPath());
                filterBean.setResId(t.getResourceId());
                filterBean.setExtra(t.getExtra());
                float a2 = this.this$0.f131262c.a(filterBean);
                float a3 = this.this$0.f131263d.a(filterBean);
                if (a3 == this.this$0.f131263d.b(filterBean) && a3 != a2) {
                    this.this$0.f131263d.a(filterBean, a2);
                }
                if (this.$oldDefaultFilterId == Integer.parseInt(t.getEffectId()) && (this.this$0.f131264e instanceof com.bytedance.creativex.recorder.filter.b.d)) {
                    if ((true ^ l.a((Object) t.getResourceId(), (Object) ((com.bytedance.creativex.recorder.filter.b.d) this.this$0.f131264e).b())) && !((com.bytedance.creativex.recorder.filter.b.d) this.this$0.f131264e).c()) {
                        ((com.bytedance.creativex.recorder.filter.b.d) this.this$0.f131264e).a(t.getResourceId());
                        this.$onDefaultFilterChanged.invoke(t.getResourceId());
                    }
                }
            }
            this.this$0.f131261b.storeBoolean("Filter_Data_Has_Migrated_" + this.$cachedPanel, true);
            this.$onSuccess.invoke();
            return z.f158842a;
        }
    }

    public ah(m mVar, m mVar2, j jVar) {
        l.d(mVar, "");
        l.d(mVar2, "");
        l.d(jVar, "");
        this.f131262c = mVar;
        this.f131263d = mVar2;
        this.f131264e = jVar;
    }
}
