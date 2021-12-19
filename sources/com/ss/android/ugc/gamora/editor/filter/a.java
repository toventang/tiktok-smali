package com.ss.android.ugc.gamora.editor.filter;

import com.bytedance.covode.number.Covode;
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

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final C3888a f145848e = new C3888a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f145849a = ag.a(v.a("filtercomposer", "colorfilternew"), v.a("filtercomposerexperiment", "colorfilterexperiment"));

    /* renamed from: b  reason: collision with root package name */
    public final Keva f145850b = Keva.getRepo("Edit_Filter_Data_Migration");

    /* renamed from: c  reason: collision with root package name */
    public final m f145851c;

    /* renamed from: d  reason: collision with root package name */
    public final m f145852d;

    static {
        Covode.recordClassIndex(95837);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.filter.a$a  reason: collision with other inner class name */
    public static final class C3888a {
        static {
            Covode.recordClassIndex(95838);
        }

        private C3888a() {
        }

        public /* synthetic */ C3888a(byte b2) {
            this();
        }
    }

    public static final class e<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f145855a;

        static {
            Covode.recordClassIndex(95842);
        }

        public e(String str) {
            this.f145855a = str;
        }

        @Override // com.google.c.a.q
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f145855a;
        }
    }

    public static final class d<T> implements q {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145854a = new d();

        static {
            Covode.recordClassIndex(95841);
        }

        d() {
        }

        @Override // com.google.c.a.q
        public final /* synthetic */ Object b() {
            return g.a().r().e();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ExceptionResult, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145853a = new c();

        static {
            Covode.recordClassIndex(95840);
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

    public static final class b extends h.f.b.m implements h.f.a.b<List<? extends Effect>, z> {
        final /* synthetic */ String $cachedPanel;
        final /* synthetic */ h.f.a.a $onSuccess;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(95839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, String str, h.f.a.a aVar2) {
            super(1);
            this.this$0 = aVar;
            this.$cachedPanel = str;
            this.$onSuccess = aVar2;
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
                float a2 = this.this$0.f145851c.a(filterBean);
                float a3 = this.this$0.f145852d.a(filterBean);
                if (a3 == this.this$0.f145852d.b(filterBean) && a3 != a2) {
                    this.this$0.f145852d.a(filterBean, a2);
                }
            }
            this.this$0.f145850b.storeBoolean("Edit_Filter_Data_Has_Migrated_" + this.$cachedPanel, true);
            this.$onSuccess.invoke();
            return z.f158842a;
        }
    }

    public a(m mVar, m mVar2) {
        l.d(mVar, "");
        l.d(mVar2, "");
        this.f145851c = mVar;
        this.f145852d = mVar2;
    }
}
