package com.ss.android.ugc.aweme.setting.page.diskmanager;

import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.g;
import h.f.b.l;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class d extends e {
    static {
        Covode.recordClassIndex(80347);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.dc.c, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.d b() {
        return b();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e, com.ss.android.ugc.aweme.dc.a
    public final /* synthetic */ com.ss.android.ugc.aweme.be.d d() {
        return d();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void f() {
        a(R.string.fs8);
        a("GECKO");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final com.ss.android.ugc.aweme.be.d e() {
        com.ss.android.ugc.aweme.be.d e2 = super.d();
        j().setText(a(R.string.fpb, new Object[0]));
        k();
        return e2;
    }

    @Override // com.ss.android.ugc.aweme.dc.c
    public final com.ss.android.ugc.aweme.be.d a() {
        View i2 = i();
        return new com.ss.android.ugc.aweme.be.d(a(R.string.fs8, new Object[0]), null, this, null, false, j(), i2, false, null, false, a(R.string.a8u, new Object[0]), false, null, 127898);
    }

    public static final class a implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f122500a;

        static {
            Covode.recordClassIndex(80348);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(d dVar) {
            this.f122500a = dVar;
        }

        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f122502a;

            static {
                Covode.recordClassIndex(80350);
            }

            b(a aVar) {
                this.f122502a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<Integer> tVar;
                DiskViewModel h2 = this.f122502a.f122500a.h();
                if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                    tVar.setValue(0);
                }
                this.f122502a.f122500a.a(new h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d>(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.diskmanager.d.a.b.AnonymousClass1 */
                    final /* synthetic */ b this$0;

                    static {
                        Covode.recordClassIndex(80351);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
                        com.ss.android.ugc.aweme.be.d dVar2 = dVar;
                        l.d(dVar2, "");
                        return com.ss.android.ugc.aweme.be.d.a(dVar2, this.this$0.f122502a.f122500a.a(R.string.a8w, Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f122503a;

            static {
                Covode.recordClassIndex(80352);
            }

            c(a aVar) {
                this.f122503a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<Integer> tVar;
                DiskViewModel h2 = this.f122503a.f122500a.h();
                if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                    tVar.setValue(0);
                }
                this.f122503a.f122500a.a(new h.f.a.b<com.ss.android.ugc.aweme.be.d, com.ss.android.ugc.aweme.be.d>(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.diskmanager.d.a.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(80353);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ com.ss.android.ugc.aweme.be.d invoke(com.ss.android.ugc.aweme.be.d dVar) {
                        com.ss.android.ugc.aweme.be.d dVar2 = dVar;
                        l.d(dVar2, "");
                        return com.ss.android.ugc.aweme.be.d.a(dVar2, this.this$0.f122503a.f122500a.a(R.string.a8w, Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.d$a$a  reason: collision with other inner class name */
        static final class C3176a<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final C3176a f122501a = new C3176a();

            static {
                Covode.recordClassIndex(80349);
            }

            C3176a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                String str;
                l.d(obj, "");
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
                        if (l.a((Object) "GECKO", (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    for (T t3 : arrayList) {
                        t3.b();
                    }
                }
                return "";
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            l.d(aVar, "");
            this.f122500a.h().f122485b.setValue(1);
            f.a.t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).d(C3176a.f122501a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), new c(this));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(com.ss.android.ugc.aweme.setting.page.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void a(View view) {
        l.d(view, "");
        h().f122486c.setValue(v.a(Integer.valueOf((int) R.string.a8v), new a(this)));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", "GECKO");
        jSONObject.put("size", this.f122514j);
        r.a("clean_gecko_file", jSONObject);
    }
}
