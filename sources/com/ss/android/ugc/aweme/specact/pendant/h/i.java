package com.ss.android.ugc.aweme.specact.pendant.h;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import com.ss.android.ugc.aweme.specact.popup.api.ISpecApi;
import com.ss.android.ugc.aweme.specact.popup.c.a;
import f.a.t;
import f.a.v;
import f.a.w;
import h.f.b.l;
import h.h;
import h.m;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class i {

    /* renamed from: h  reason: collision with root package name */
    public static final h f134292h = h.i.a(m.SYNCHRONIZED, c.f134301a);

    /* renamed from: i  reason: collision with root package name */
    public static final b f134293i = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    int f134294a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f134295b;

    /* renamed from: c  reason: collision with root package name */
    public a f134296c;

    /* renamed from: d  reason: collision with root package name */
    public String f134297d = "coin2";

    /* renamed from: e  reason: collision with root package name */
    public Boolean f134298e = false;

    /* renamed from: f  reason: collision with root package name */
    public Integer f134299f = 5;

    /* renamed from: g  reason: collision with root package name */
    public List<k.i> f134300g;

    public interface a {
        static {
            Covode.recordClassIndex(87828);
        }

        void a();

        void a(int i2, String str, Boolean bool, Integer num);

        void a(List<k.i> list);

        void b();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(87829);
        }

        public static i a() {
            return (i) i.f134292h.getValue();
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f134301a = new c();

        static {
            Covode.recordClassIndex(87830);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return new i();
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134306a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f134307b;

        static {
            Covode.recordClassIndex(87834);
        }

        g(i iVar, Activity activity) {
            this.f134306a = iVar;
            this.f134307b = activity;
        }

        public final void run() {
            i iVar = this.f134306a;
            iVar.a(this.f134307b, iVar.f134296c);
        }
    }

    static {
        Covode.recordClassIndex(87827);
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134304a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f134305b;

        static {
            Covode.recordClassIndex(87833);
        }

        f(i iVar, Activity activity) {
            this.f134304a = iVar;
            this.f134305b = activity;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (TextUtils.equals("retry_error", ((Throwable) obj).getMessage())) {
                i iVar = this.f134304a;
                Activity activity = this.f134305b;
                a aVar = iVar.f134296c;
                iVar.f134294a++;
                if (iVar.f134294a < 3) {
                    new Handler(Looper.getMainLooper()).postDelayed(new g(iVar, activity), TimeUnit.SECONDS.toMillis(5));
                } else if (aVar != null) {
                    aVar.a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134303a;

        static {
            Covode.recordClassIndex(87832);
        }

        e(i iVar) {
            this.f134303a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar;
            Integer num = (Integer) obj;
            if (num.intValue() >= 0) {
                this.f134303a.f134294a = 0;
                a aVar2 = this.f134303a.f134296c;
                if (aVar2 != null) {
                    l.b(num, "");
                    aVar2.a(num.intValue(), this.f134303a.f134297d, this.f134303a.f134298e, this.f134303a.f134299f);
                }
            } else if (num.intValue() == -1) {
                a aVar3 = this.f134303a.f134296c;
                if (aVar3 != null) {
                    aVar3.a();
                }
            } else if (num.intValue() == -2) {
                a aVar4 = this.f134303a.f134296c;
                if (aVar4 != null) {
                    aVar4.b();
                }
            } else if (num.intValue() == -3 && (aVar = this.f134303a.f134296c) != null) {
                aVar.a(this.f134303a.f134300g);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f134302a;

        static {
            Covode.recordClassIndex(87831);
        }

        d(i iVar) {
            this.f134302a = iVar;
        }

        @Override // f.a.w
        public final void subscribe(v<Integer> vVar) {
            String str;
            List<com.ss.android.ugc.aweme.specact.popup.a.i> list;
            com.ss.android.ugc.aweme.specact.popup.a.i iVar;
            String str2;
            Integer num;
            String str3;
            k.j jVar;
            List<k.i> list2;
            Boolean bool;
            Integer num2;
            k.a aVar;
            k.a aVar2;
            l.d(vVar, "");
            Long l2 = null;
            try {
                k kVar = ISpecApi.a.a().getTaskInfo("[task_list]").get();
                if (kVar != null && kVar.status_code == 0) {
                    com.ss.android.ugc.aweme.specact.pendant.c.b.a(kVar.f134448a);
                    i iVar2 = this.f134302a;
                    k.c cVar = kVar.f134448a;
                    if (cVar != null) {
                        str = cVar.f134460h;
                    } else {
                        str = null;
                    }
                    iVar2.f134297d = str;
                    k.c cVar2 = kVar.f134448a;
                    if (!(cVar2 == null || (jVar = cVar2.f134453a) == null || (list2 = jVar.f134491a) == null)) {
                        Iterator<k.i> it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            k.i next = it.next();
                            if (next.f134486b == 1022 && l.a((Object) next.f134488d, (Object) false)) {
                                this.f134302a.f134295b = true;
                                i iVar3 = this.f134302a;
                                k.b bVar = next.f134490f;
                                if (bVar == null || (aVar2 = bVar.f134451a) == null) {
                                    bool = null;
                                } else {
                                    bool = aVar2.f134449a;
                                }
                                iVar3.f134298e = bool;
                                i iVar4 = this.f134302a;
                                k.b bVar2 = next.f134490f;
                                if (bVar2 == null || (aVar = bVar2.f134451a) == null) {
                                    num2 = null;
                                } else {
                                    num2 = Integer.valueOf(aVar.f134450b);
                                }
                                iVar4.f134299f = num2;
                                vVar.a(Integer.valueOf(next.a()));
                            }
                        }
                        this.f134302a.f134300g = list2;
                    }
                    if (!this.f134302a.f134295b) {
                        vVar.a((Integer) -1);
                    }
                    vVar.a((Integer) -3);
                    com.ss.android.ugc.aweme.specact.popup.c.a a2 = a.C3498a.a();
                    l.d(kVar, "");
                    k.c cVar3 = kVar.f134448a;
                    if (cVar3 != null) {
                        list = cVar3.f134454b;
                    } else {
                        list = null;
                    }
                    a2.f134586a = list;
                    k.c cVar4 = kVar.f134448a;
                    if (cVar4 != null) {
                        iVar = cVar4.f134455c;
                    } else {
                        iVar = null;
                    }
                    a2.f134588c = iVar;
                    if (a2.f134588c != null) {
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        com.ss.android.ugc.aweme.specact.popup.a.i iVar5 = a2.f134588c;
                        if (iVar5 != null) {
                            str2 = iVar5.f134433c;
                        } else {
                            str2 = null;
                        }
                        com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("pop_name", str2);
                        com.ss.android.ugc.aweme.specact.popup.a.i iVar6 = a2.f134588c;
                        if (iVar6 != null) {
                            num = Integer.valueOf(iVar6.s);
                        } else {
                            num = null;
                        }
                        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("round", num);
                        if (d.a()) {
                            str3 = "feed";
                        } else {
                            str3 = "others";
                        }
                        r.a("receive_pop_request", a4.a("position", str3).f66730a);
                    }
                    k.c cVar5 = kVar.f134448a;
                    if (cVar5 != null) {
                        l2 = Long.valueOf(cVar5.f134459g);
                    }
                    a2.f134590e = l2;
                    a2.a();
                    vVar.a((Integer) -2);
                    vVar.a();
                }
            } catch (InterruptedException e2) {
                LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
                l.b(localTestApi, "");
                localTestApi.getSpecActDebugService().a("SpecApi", "request task/page occur InterruptedException: " + e2.toString());
            } catch (ExecutionException e3) {
                LocalTestApi localTestApi2 = a.C2792a.f108997a.f108996a;
                l.b(localTestApi2, "");
                localTestApi2.getSpecActDebugService().a("SpecApi", "request task/page occur ExecutionException: " + e3.toString());
            }
            vVar.a(new Throwable("retry_error"));
            vVar.a();
        }
    }

    public final void a(Activity activity, a aVar) {
        l.d(activity, "");
        LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
        l.b(localTestApi, "");
        localTestApi.getSpecActDebugService().a("SpecApi", "request task/page actually");
        this.f134296c = aVar;
        t.a(new d(this)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this), new f(this, activity));
    }
}
