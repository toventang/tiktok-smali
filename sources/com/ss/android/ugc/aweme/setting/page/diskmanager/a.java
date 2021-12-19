package com.ss.android.ugc.aweme.setting.page.diskmanager;

import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.be.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.g;
import h.f.a.b;
import h.f.b.l;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class a extends e {
    static {
        Covode.recordClassIndex(80328);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ d b() {
        return b();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ d d() {
        return d();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final d e() {
        d e2 = super.d();
        j().setText(a(R.string.fpb, new Object[0]));
        k();
        return e2;
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void f() {
        Integer num = ((e) this).f122505a;
        if (num == null) {
            l.b();
        }
        a(num.intValue());
        a("CACHE");
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final d a() {
        View i2 = i();
        TuxTextView j2 = j();
        Integer num = ((e) this).f122505a;
        if (num == null) {
            l.b();
        }
        return new d(a(num.intValue(), new Object[0]), null, this, null, false, j2, i2, false, null, false, a(R.string.fpr, new Object[0]), false, null, 127898);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a  reason: collision with other inner class name */
    public static final class C3172a implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f122487a;

        static {
            Covode.recordClassIndex(80329);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3172a(a aVar) {
            this.f122487a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a$b */
        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3172a f122492a;

            static {
                Covode.recordClassIndex(80331);
            }

            b(C3172a aVar) {
                this.f122492a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<Integer> tVar;
                DiskViewModel h2 = this.f122492a.f122487a.h();
                if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                    tVar.setValue(0);
                }
                this.f122492a.f122487a.a(new h.f.a.b<d, d>(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.diskmanager.a.C3172a.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(80332);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        l.d(dVar2, "");
                        a aVar = this.this$0.f122492a.f122487a;
                        Integer num = this.this$0.f122492a.f122487a.f122506b;
                        if (num == null) {
                            l.b();
                        }
                        return d.a(dVar2, aVar.a(num.intValue(), Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a$c */
        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3172a f122493a;

            static {
                Covode.recordClassIndex(80333);
            }

            c(C3172a aVar) {
                this.f122493a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<Integer> tVar;
                DiskViewModel h2 = this.f122493a.f122487a.h();
                if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                    tVar.setValue(0);
                }
                this.f122493a.f122487a.a(new h.f.a.b<d, d>(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.diskmanager.a.C3172a.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(80334);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ d invoke(d dVar) {
                        d dVar2 = dVar;
                        l.d(dVar2, "");
                        a aVar = this.this$0.f122493a.f122487a;
                        Integer num = this.this$0.f122493a.f122487a.f122506b;
                        if (num == null) {
                            l.b();
                        }
                        return d.a(dVar2, aVar.a(num.intValue(), Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.a$a$a  reason: collision with other inner class name */
        static final class C3173a<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final C3173a f122491a = new C3173a();

            static {
                Covode.recordClassIndex(80330);
            }

            C3173a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                String str;
                l.d(obj, "");
                com.ss.android.ugc.aweme.framework.a.a.b("clear-cache", "start clear temp cache with disk manager");
                List<com.bytedance.u.a> b2 = com.bytedance.u.d.b();
                if (b2 != null) {
                    ArrayList<T> arrayList = new ArrayList();
                    for (T t : b2) {
                        T t2 = t;
                        if (t2 != null) {
                            str = t2.a();
                        } else {
                            str = null;
                        }
                        if (l.a((Object) "CACHE", (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    for (T t3 : arrayList) {
                        t3.b();
                    }
                }
                com.ss.android.ugc.aweme.framework.a.a.b("clear-cache", "finish clear temp cache with disk manager");
                return "";
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            t<Integer> tVar;
            l.d(aVar, "");
            DiskViewModel h2 = this.f122487a.h();
            if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                tVar.setValue(1);
            }
            f.a.t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).d(C3173a.f122491a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(com.ss.android.ugc.aweme.setting.page.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void a(View view) {
        t<p<Integer, b<com.bytedance.tux.dialog.b.a, z>>> tVar;
        l.d(view, "");
        DiskViewModel h2 = h();
        if (!(h2 == null || (tVar = h2.f122486c) == null)) {
            Integer num = this.f122510f;
            if (num == null) {
                l.b();
            }
            tVar.setValue(v.a(num, new C3172a(this)));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", "CACHE");
        jSONObject.put("size", this.f122512h);
        r.a("clean_temp_file", jSONObject);
    }
}
