package com.ss.android.ugc.aweme.setting.page.diskmanager;

import android.view.LayoutInflater;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public abstract class e extends com.ss.android.ugc.aweme.dc.c implements View.OnClickListener {

    /* renamed from: l  reason: collision with root package name */
    public static final a f122504l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Integer f122505a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f122506b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f122507c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f122508d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f122509e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f122510f;

    /* renamed from: g  reason: collision with root package name */
    public Integer f122511g;

    /* renamed from: h  reason: collision with root package name */
    public long f122512h;

    /* renamed from: i  reason: collision with root package name */
    public long f122513i;

    /* renamed from: j  reason: collision with root package name */
    public long f122514j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.setting.page.a f122515k;
    private final h.h o = h.i.a((h.f.a.a) new b(this));
    private final h.h p = h.i.a((h.f.a.a) new j(this));
    private final h.h q = h.i.a((h.f.a.a) new d(this));
    private final h.h r = h.i.a((h.f.a.a) new f(this));

    static {
        Covode.recordClassIndex(80354);
    }

    public abstract void a(View view);

    public abstract void f();

    /* access modifiers changed from: protected */
    public final androidx.fragment.app.e g() {
        return (androidx.fragment.app.e) this.o.getValue();
    }

    /* access modifiers changed from: protected */
    public final DiskViewModel h() {
        return (DiskViewModel) this.p.getValue();
    }

    /* access modifiers changed from: protected */
    public final View i() {
        return (View) this.q.getValue();
    }

    /* access modifiers changed from: protected */
    public final TuxTextView j() {
        return (TuxTextView) this.r.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80355);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<androidx.fragment.app.e> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80356);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.fragment.app.e invoke() {
            return this.this$0.f122515k.requireActivity();
        }
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80358);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return com.a.a(LayoutInflater.from(this.this$0.g()), R.layout.ayn, null, false);
        }
    }

    static final class f extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80360);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            androidx.fragment.app.e g2 = this.this$0.g();
            l.b(g2, "");
            return new TuxTextView(g2, null, 0, 6);
        }
    }

    static final class j extends m implements h.f.a.a<DiskViewModel> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80366);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DiskViewModel invoke() {
            ac a2 = ae.a(this.this$0.f122515k, (ad.b) null).a(DiskViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    public final void k() {
        int b2 = (int) n.b(g(), 18.0f);
        int b3 = (int) n.b(g(), 4.0f);
        j().setTextSize(12.0f);
        TuxTextView j2 = j();
        androidx.fragment.app.e g2 = g();
        l.b(g2, "");
        j2.setTextColor(g2.getResources().getColor(R.color.bx));
        j().setBackgroundResource(R.drawable.beu);
        j().setTuxFont(82);
        j().setPadding(b2, b3, b2, b3);
    }

    /* renamed from: e */
    public com.ss.android.ugc.aweme.be.d d() {
        if (com.ss.android.ugc.aweme.setting.page.diskmanager.a.a.f122488a) {
            this.f122505a = Integer.valueOf((int) R.string.fs3);
            this.f122506b = Integer.valueOf((int) R.string.a8g);
            this.f122507c = Integer.valueOf((int) R.string.fs5);
            this.f122508d = Integer.valueOf((int) R.string.a8k);
            this.f122509e = Integer.valueOf((int) R.string.fs6);
            this.f122510f = Integer.valueOf((int) R.string.a8f);
            this.f122511g = Integer.valueOf((int) R.string.a8j);
        } else {
            this.f122505a = Integer.valueOf((int) R.string.fq0);
            this.f122506b = Integer.valueOf((int) R.string.fpz);
            this.f122507c = Integer.valueOf((int) R.string.fph);
            this.f122508d = Integer.valueOf((int) R.string.fpf);
            this.f122509e = Integer.valueOf((int) R.string.fpg);
            this.f122510f = Integer.valueOf((int) R.string.fpd);
            this.f122511g = Integer.valueOf((int) R.string.fpc);
        }
        com.ss.android.ugc.aweme.be.d dVar = (com.ss.android.ugc.aweme.be.d) super.d();
        t<Boolean> tVar = h().f122484a;
        if (tVar != null) {
            tVar.observe(this.f122515k, new C3177e(this));
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f122519a;

        static {
            Covode.recordClassIndex(80362);
        }

        h(e eVar) {
            this.f122519a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final String str = (String) obj;
            this.f122519a.a(new h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d>() {
                /* class com.ss.android.ugc.aweme.setting.page.diskmanager.e.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(80363);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
                    com.ss.android.ugc.aweme.be.d dVar2 = dVar;
                    String str = "";
                    l.d(dVar2, str);
                    String str2 = str;
                    if (str2 != null) {
                        str = str2;
                    }
                    return com.ss.android.ugc.aweme.be.d.a(dVar2, str, null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 122878);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f122520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f122521b;

        static {
            Covode.recordClassIndex(80364);
        }

        i(e eVar, String str) {
            this.f122520a = eVar;
            this.f122521b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f122520a.a(new h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d>(this) {
                /* class com.ss.android.ugc.aweme.setting.page.diskmanager.e.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(80365);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
                    com.ss.android.ugc.aweme.be.d dVar2 = dVar;
                    String str = "";
                    l.d(dVar2, str);
                    String b2 = this.this$0.f122520a.b(this.this$0.f122521b);
                    if (b2 != null) {
                        str = b2;
                    }
                    return com.ss.android.ugc.aweme.be.d.a(dVar2, str, null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 122878);
                }
            });
        }
    }

    public final void a(int i2) {
        a(new c(this, i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.e$e  reason: collision with other inner class name */
    public static final class C3177e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f122516a;

        static {
            Covode.recordClassIndex(80359);
        }

        C3177e(e eVar) {
            this.f122516a = eVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            l.b(bool, "");
            if (bool.booleanValue()) {
                this.f122516a.f();
            }
        }
    }

    public void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        if (!((com.ss.android.ugc.aweme.be.d) l()).f68567h) {
            a(view);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d> {
        final /* synthetic */ int $default;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(80357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, int i2) {
            super(1);
            this.this$0 = eVar;
            this.$default = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
            com.ss.android.ugc.aweme.be.d dVar2 = dVar;
            l.d(dVar2, "");
            return com.ss.android.ugc.aweme.be.d.a(dVar2, this.this$0.a(this.$default, new Object[0]), null, null, null, false, null, null, null, false, null, false, null, false, true, null, false, 0, 122878);
        }
    }

    public e(com.ss.android.ugc.aweme.setting.page.a aVar) {
        l.d(aVar, "");
        this.f122515k = aVar;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        l.d(str, "");
        f.a.t.b(this).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new g(this, str)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this), new i(this, str));
    }

    public final String b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 63879010) {
            if (hashCode != 65307009) {
                if (hashCode == 67692361 && str.equals("GECKO")) {
                    return a(R.string.a8w, Float.valueOf(0.0f));
                }
            } else if (str.equals("DRAFT")) {
                return a(R.string.fpk, Float.valueOf(0.0f));
            }
        } else if (str.equals("CACHE")) {
            Integer num = this.f122506b;
            if (num == null) {
                l.b();
            }
            return a(num.intValue(), Float.valueOf(0.0f));
        }
        Integer num2 = this.f122508d;
        if (num2 == null) {
            l.b();
        }
        return a(num2.intValue(), Float.valueOf(0.0f));
    }

    /* access modifiers changed from: package-private */
    public static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f122517a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f122518b;

        static {
            Covode.recordClassIndex(80361);
        }

        g(e eVar, String str) {
            this.f122517a = eVar;
            this.f122518b = str;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            List<com.bytedance.u.a> b2 = com.bytedance.u.d.b();
            if (b2 != null) {
                ArrayList arrayList = new ArrayList();
                for (T t : b2) {
                    T t2 = t;
                    if (l.a((Object) this.f122518b, (Object) (t2 != null ? t2.a() : null))) {
                        arrayList.add(t);
                    }
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                for (T t3 : arrayList2) {
                    l.b(t3, "");
                    long e2 = t3.e();
                    double d2 = (double) e2;
                    Double.isNaN(d2);
                    StringBuilder append = new StringBuilder("module: ").append(this.f122518b).append(", name = ").append(t3.getClass().getSimpleName()).append(", size = ").append(d2 / 1048576.0d).append("M, workspace: ");
                    File c2 = t3.c();
                    com.ss.android.ugc.aweme.framework.a.a.b("disk-manager", append.append(c2 != null ? c2.getAbsolutePath() : null).toString());
                    arrayList3.add(Long.valueOf(e2));
                }
                Long valueOf = Long.valueOf(h.a.n.v(arrayList3));
                if (valueOf != null) {
                    String str = this.f122518b;
                    int hashCode = str.hashCode();
                    if (hashCode != 63879010) {
                        if (hashCode != 67692361) {
                            if (hashCode == 441562126 && str.equals("RESOURCE")) {
                                this.f122517a.f122513i = valueOf.longValue();
                            }
                        } else if (str.equals("GECKO")) {
                            this.f122517a.f122514j = valueOf.longValue();
                        }
                    } else if (str.equals("CACHE")) {
                        this.f122517a.f122512h = valueOf.longValue();
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("module", this.f122518b);
                    jSONObject.put("size", valueOf.longValue());
                    o.a("disk_manager_module_size", jSONObject);
                    return this.f122517a.a(this.f122518b, (double) valueOf.longValue());
                }
            }
            return this.f122517a.b(this.f122518b);
        }
    }

    /* access modifiers changed from: protected */
    public final String a(int i2, Object... objArr) {
        l.d(objArr, "");
        String string = g().getString(i2, Arrays.copyOf(objArr, objArr.length));
        l.b(string, "");
        return string;
    }

    public final String a(String str, double d2) {
        int hashCode = str.hashCode();
        if (hashCode != 65307009) {
            if (hashCode != 67692361) {
                if (hashCode == 441562126 && str.equals("RESOURCE")) {
                    double d3 = d2 / 1.073741824E9d;
                    if (d3 > 1.0d) {
                        Integer num = this.f122509e;
                        if (num == null) {
                            l.b();
                        }
                        return a(num.intValue(), Double.valueOf(d3));
                    }
                    Integer num2 = this.f122508d;
                    if (num2 == null) {
                        l.b();
                    }
                    return a(num2.intValue(), Double.valueOf(d2 / 1048576.0d));
                }
            } else if (str.equals("GECKO")) {
                double d4 = d2 / 1.073741824E9d;
                if (d4 > 1.0d) {
                    return a(R.string.fs7, Double.valueOf(d4));
                }
                return a(R.string.a8w, Double.valueOf(d2 / 1048576.0d));
            }
        } else if (str.equals("DRAFT")) {
            double d5 = d2 / 1.073741824E9d;
            if (d5 > 1.0d) {
                return a(R.string.fpl, Double.valueOf(d5));
            }
            return a(R.string.fpk, Double.valueOf(d2 / 1048576.0d));
        }
        double d6 = d2 / 1048576.0d;
        if (d6 < 30.0d) {
            Integer num3 = this.f122506b;
            if (num3 == null) {
                l.b();
            }
            return a(num3.intValue(), Float.valueOf(0.0f));
        }
        Integer num4 = this.f122506b;
        if (num4 == null) {
            l.b();
        }
        return a(num4.intValue(), Double.valueOf(d6));
    }
}
