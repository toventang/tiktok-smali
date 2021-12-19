package com.ss.android.ugc.aweme.specact.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.specact.pendant.b.a;
import com.ss.android.ugc.aweme.specact.popup.api.ISpecApi;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;
import h.f.b.l;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134059a = new a((byte) 0);

    static {
        Covode.recordClassIndex(87693);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87694);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.b.c$c  reason: collision with other inner class name */
    public static final class C3476c implements z<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f134064a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f134065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f134066c;

        static {
            Covode.recordClassIndex(87696);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            h.f.a.b bVar = this.f134065b;
            if (bVar != null) {
                bVar.invoke(new a(100000, "Report final failed"));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            if (aVar2.f134053a == 0) {
                h.f.a.b bVar = this.f134064a;
                if (bVar != null) {
                    bVar.invoke(aVar2);
                    return;
                }
                return;
            }
            h.f.a.b bVar2 = this.f134065b;
            if (bVar2 != null) {
                bVar2.invoke(aVar2);
            }
        }

        C3476c(h.f.a.b bVar, h.f.a.b bVar2, String str) {
            this.f134064a = bVar;
            this.f134065b = bVar2;
            this.f134066c = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f134060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f134061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f134062c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f134063d;

        static {
            Covode.recordClassIndex(87695);
        }

        b(String str, int i2, String str2, boolean z) {
            this.f134060a = str;
            this.f134061b = i2;
            this.f134062c = str2;
            this.f134063d = z;
        }

        @Override // f.a.w
        public final void subscribe(v<a> vVar) {
            Integer num;
            Boolean bool;
            Integer num2;
            Integer num3;
            String str;
            int i2;
            l.d(vVar, "");
            Boolean bool2 = null;
            try {
                com.ss.android.ugc.aweme.specact.pendant.b.a aVar = ISpecApi.a.a().getTaskAwardByTaskId(this.f134060a, this.f134061b).get();
                if (aVar != null && aVar.status_code == 0) {
                    if (aVar.f134098a == 0) {
                        a.C3478a aVar2 = aVar.f134099b;
                        if (aVar2 != null) {
                            num = Integer.valueOf(aVar2.f134103d);
                        } else {
                            num = null;
                        }
                        String valueOf = String.valueOf(num);
                        a.C3478a aVar3 = aVar.f134099b;
                        if (aVar3 != null) {
                            bool = Boolean.valueOf(aVar3.f134104e);
                        } else {
                            bool = null;
                        }
                        a.C3478a aVar4 = aVar.f134099b;
                        if (aVar4 != null) {
                            num2 = Integer.valueOf(aVar4.f134105f);
                        } else {
                            num2 = null;
                        }
                        a.C3478a aVar5 = aVar.f134099b;
                        if (aVar5 != null) {
                            num3 = Integer.valueOf(aVar5.f134106g);
                        } else {
                            num3 = null;
                        }
                        a.C3478a aVar6 = aVar.f134099b;
                        if (aVar6 != null) {
                            str = aVar6.f134107h;
                        } else {
                            str = null;
                        }
                        a.C3478a aVar7 = aVar.f134099b;
                        if (aVar7 != null) {
                            bool2 = Boolean.valueOf(aVar7.f134108i);
                        }
                        a.C3478a aVar8 = aVar.f134099b;
                        if (aVar8 != null) {
                            i2 = aVar8.f134109j;
                        } else {
                            i2 = 0;
                        }
                        vVar.a(new a(0, new JSONObject().put("cold_down", valueOf).put("is_last_round", bool).put("display_amount", num2).put("display_cash_amount", num3).put("display_cash_amount_i18n", str).put("show_points", bool2).put("canival_ratio", i2).toString()));
                        com.ss.android.ugc.aweme.specact.pendant.h.b.a(0, this.f134060a);
                        return;
                    }
                    int i3 = aVar.f134098a;
                    String str2 = aVar.message;
                    if (!this.f134063d) {
                        vVar.a(new a(i3, str2));
                        com.ss.android.ugc.aweme.specact.pendant.h.b.a(i3, this.f134060a);
                    } else if (i3 == 10006 || i3 == 10009) {
                        vVar.a(new a(i3, str2));
                        com.ss.android.ugc.aweme.specact.pendant.h.b.a(i3, this.f134060a);
                    } else {
                        vVar.b(new Throwable("report Failed"));
                        com.ss.android.ugc.aweme.specact.pendant.h.b.a(i3, this.f134060a);
                    }
                }
            } catch (ExecutionException e2) {
                e2.printStackTrace();
                vVar.a(new a(100000, e2.toString()));
            } catch (InterruptedException e3) {
                e3.printStackTrace();
                vVar.a(new a(100000, e3.toString()));
            }
        }
    }

    public static void a(String str, int i2, boolean z, h.f.a.b<? super a, h.z> bVar, h.f.a.b<? super a, h.z> bVar2) {
        l.d(str, "");
        t.a(new b(str, i2, "SpecActPendant", z)).g(new b()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new C3476c(bVar, bVar2, "SpecActPendant"));
    }
}
