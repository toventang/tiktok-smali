package com.ss.android.ugc.aweme.setting.page.diskmanager;

import android.view.View;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.be.d;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.d.g;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class b extends e {
    static {
        Covode.recordClassIndex(80336);
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

    @Override // com.ss.android.ugc.aweme.dc.c
    public final d a() {
        Integer num = this.f122507c;
        if (num == null) {
            l.b();
        }
        return new d(a(num.intValue(), new Object[0]), null, this, null, false, j(), i(), false, null, true, a(R.string.fps, new Object[0]), false, null, 127898);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void f() {
        String str;
        Integer num = this.f122507c;
        if (num == null) {
            l.b();
        }
        a(num.intValue());
        a("RESOURCE");
        ArrayList<com.bytedance.u.a> arrayList = new ArrayList(com.bytedance.u.d.b());
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            for (com.bytedance.u.a aVar : arrayList) {
                if (aVar != null) {
                    str = aVar.a();
                } else {
                    str = null;
                }
                if (l.a((Object) str, (Object) "RESOURCE") && (i2 = i2 + 1) < 0) {
                    n.b();
                }
            }
        }
        a(new a(i2));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b  reason: collision with other inner class name */
    public static final class C3174b implements h.f.a.b<com.bytedance.tux.dialog.b.a, z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f122494a;

        static {
            Covode.recordClassIndex(80338);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3174b(b bVar) {
            this.f122494a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b$b  reason: collision with other inner class name */
        static final class C3175b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3174b f122496a;

            static {
                Covode.recordClassIndex(80340);
            }

            C3175b(C3174b bVar) {
                this.f122496a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<Integer> tVar;
                DiskViewModel h2 = this.f122496a.f122494a.h();
                if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                    tVar.setValue(0);
                }
                this.f122496a.f122494a.a(new h.f.a.b<d, d>(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.diskmanager.b.C3174b.C3175b.AnonymousClass1 */
                    final /* synthetic */ C3175b this$0;

                    static {
                        Covode.recordClassIndex(80341);
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
                        b bVar = this.this$0.f122496a.f122494a;
                        Integer num = this.this$0.f122496a.f122494a.f122508d;
                        if (num == null) {
                            l.b();
                        }
                        return d.a(dVar2, bVar.a(num.intValue(), Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b$c */
        static final class c<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3174b f122497a;

            static {
                Covode.recordClassIndex(80342);
            }

            c(C3174b bVar) {
                this.f122497a = bVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                t<Integer> tVar;
                DiskViewModel h2 = this.f122497a.f122494a.h();
                if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                    tVar.setValue(0);
                }
                this.f122497a.f122494a.a(new h.f.a.b<d, d>(this) {
                    /* class com.ss.android.ugc.aweme.setting.page.diskmanager.b.C3174b.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(80343);
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
                        b bVar = this.this$0.f122497a.f122494a;
                        Integer num = this.this$0.f122497a.f122494a.f122508d;
                        if (num == null) {
                            l.b();
                        }
                        return d.a(dVar2, bVar.a(num.intValue(), Float.valueOf(0.0f)), null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 131070);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.page.diskmanager.b$b$a */
        static final class a<T, R> implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f122495a = new a();

            static {
                Covode.recordClassIndex(80339);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                String str;
                l.d(obj, "");
                com.ss.android.ugc.aweme.framework.a.a.b("clear-cache", "start clear resource cache with disk manager");
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
                        if (l.a((Object) "RESOURCE", (Object) str)) {
                            arrayList.add(t);
                        }
                    }
                    for (T t3 : arrayList) {
                        t3.b();
                    }
                }
                com.ss.android.ugc.aweme.framework.a.a.b("clear-cache", "finish clear resource cache with disk manager");
                return "";
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
            t<Integer> tVar;
            l.d(aVar, "");
            DiskViewModel h2 = this.f122494a.h();
            if (!(h2 == null || (tVar = h2.f122485b) == null)) {
                tVar.setValue(1);
            }
            f.a.t.b("").b(f.a.h.a.b(f.a.k.a.f158006c)).d(a.f122495a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new C3175b(this), new c(this));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(com.ss.android.ugc.aweme.setting.page.a aVar) {
        super(aVar);
        l.d(aVar, "");
    }

    static final class a extends m implements h.f.a.b<d, d> {
        final /* synthetic */ int $resStorageCount;

        static {
            Covode.recordClassIndex(80337);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$resStorageCount = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ d invoke(d dVar) {
            boolean z;
            d dVar2 = dVar;
            l.d(dVar2, "");
            if (this.$resStorageCount > 0) {
                z = true;
            } else {
                z = false;
            }
            return d.a(dVar2, null, null, null, null, z, null, null, null, false, null, false, null, false, false, null, false, 0, 131055);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.diskmanager.e
    public final void a(View view) {
        t<p<Integer, h.f.a.b<com.bytedance.tux.dialog.b.a, z>>> tVar;
        l.d(view, "");
        DiskViewModel h2 = h();
        if (!(h2 == null || (tVar = h2.f122486c) == null)) {
            Integer num = this.f122511g;
            if (num == null) {
                l.b();
            }
            tVar.setValue(v.a(num, new C3174b(this)));
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", "RESOURCE");
        jSONObject.put("size", this.f122513i);
        r.a("clean_resource_file", jSONObject);
    }
}
