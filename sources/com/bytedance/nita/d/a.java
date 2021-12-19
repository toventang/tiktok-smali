package com.bytedance.nita.d;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.api.c;
import com.bytedance.nita.api.f;
import com.bytedance.nita.api.g;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a implements Handler.Callback, d {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f41633a = new Handler(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, ArrayList<h.f.a.a<z>>> f41634b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<String> f41635c = new ArrayList<>();

    static {
        Covode.recordClassIndex(25473);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.nita.d.a$a  reason: collision with other inner class name */
    public static final class C1017a extends m implements h.f.a.a<z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ h.f.a.a $inflate;
        final /* synthetic */ c $nitaView;

        static {
            Covode.recordClassIndex(25474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1017a(Context context, c cVar, h.f.a.a aVar) {
            super(0);
            this.$context = context;
            this.$nitaView = cVar;
            this.$inflate = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            if (com.bytedance.nita.e.b.a(this.$context)) {
                if (this.$nitaView.g() != f.MUTIPLE || (Build.VERSION.SDK_INT >= 24 && Build.VERSION.SDK_INT <= 27)) {
                    com.bytedance.nita.e.a.a(com.bytedance.nita.e.a.f41650b).post(new Runnable(this) {
                        /* class com.bytedance.nita.d.a.C1017a.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ C1017a f41637a;

                        static {
                            Covode.recordClassIndex(25476);
                        }

                        {
                            this.f41637a = r1;
                        }

                        public final void run() {
                            this.f41637a.$inflate.invoke();
                            Thread currentThread = Thread.currentThread();
                            l.a((Object) currentThread, "");
                            com.bytedance.nita.e.a.a(currentThread).a(this.f41637a.$context);
                        }
                    });
                } else {
                    com.bytedance.nita.e.a.f41650b.a().execute(new Runnable(this) {
                        /* class com.bytedance.nita.d.a.C1017a.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ C1017a f41636a;

                        static {
                            Covode.recordClassIndex(25475);
                        }

                        {
                            this.f41636a = r1;
                        }

                        public final void run() {
                            this.f41636a.$inflate.invoke();
                            Thread currentThread = Thread.currentThread();
                            l.a((Object) currentThread, "");
                            com.bytedance.nita.e.a.a(currentThread).a(this.f41636a.$context);
                        }
                    });
                }
            }
            return z.f158842a;
        }
    }

    public final void a() {
        Message obtainMessage = this.f41633a.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = null;
        this.f41633a.removeMessages(1);
        this.f41633a.sendMessageDelayed(obtainMessage, 5000);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        synchronized (this.f41634b) {
            if (this.f41635c.size() > 0) {
                String remove = this.f41635c.remove(0);
                l.a((Object) remove, "");
                String str = remove;
                ArrayList<h.f.a.a<z>> arrayList = this.f41634b.get(str);
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        h.f.a.a<z> remove2 = arrayList.remove(0);
                        l.a((Object) remove2, "");
                        remove2.invoke();
                    } else {
                        this.f41634b.remove(str);
                    }
                }
                if (this.f41634b.size() > 0 && !this.f41633a.hasMessages(1)) {
                    a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $count;
        final /* synthetic */ c $nitaView;

        static {
            Covode.recordClassIndex(25477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2, c cVar, Context context) {
            super(0);
            this.$count = i2;
            this.$nitaView = cVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(6468);
            int i2 = this.$count;
            int i3 = 0;
            loop0:
            while (true) {
                if (i3 < i2) {
                    int length = this.$nitaView.d().length;
                    for (int i4 = 0; i4 < length; i4++) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!com.bytedance.nita.e.b.a(this.$context)) {
                            break loop0;
                        }
                        try {
                            View a2 = this.$nitaView.b().a(this.$context, this.$nitaView.b(this.$context), this.$nitaView.d()[i4]);
                            com.bytedance.nita.c.a aVar = com.bytedance.nita.c.a.f41627f;
                            c cVar = this.$nitaView;
                            aVar.a(a2, cVar, cVar.d()[i4]);
                        } catch (Exception e2) {
                            com.bytedance.nita.api.b bVar = com.bytedance.nita.a.f41605b;
                            if (bVar != null) {
                                this.$nitaView.d();
                                bVar.a(e2);
                            }
                        }
                        com.bytedance.nita.api.b bVar2 = com.bytedance.nita.a.f41605b;
                        if (bVar2 != null) {
                            c cVar2 = this.$nitaView;
                            cVar2.d();
                            bVar2.a(System.currentTimeMillis() - currentTimeMillis, cVar2);
                        }
                        if (i3 == 0) {
                            com.bytedance.nita.c.a aVar2 = com.bytedance.nita.c.a.f41627f;
                            c cVar3 = this.$nitaView;
                            Context context = this.$context;
                            int i5 = cVar3.d()[i4];
                            l.c(cVar3, "");
                            l.c(context, "");
                            String a3 = cVar3.a();
                            if (cVar3.f() != g.ACTIVITY_DESTORY) {
                                com.bytedance.nita.c.a.a(context, cVar3);
                                Message obtain = Message.obtain(aVar2);
                                obtain.obj = a3;
                                obtain.what = i5;
                                obtain.arg1 = aVar2.a(a3, context, false);
                                l.a((Object) obtain, "");
                                int i6 = com.bytedance.nita.c.b.f41632a[cVar3.f().ordinal()];
                                if (i6 == 1) {
                                    aVar2.sendMessageDelayed(obtain, g.LONG.getDelay());
                                } else if (i6 == 2) {
                                    aVar2.sendMessageDelayed(obtain, g.SHORT.getDelay());
                                }
                            } else if (context instanceof Activity) {
                                com.bytedance.nita.c.a.a(context, cVar3);
                            } else {
                                com.bytedance.nita.b.b bVar3 = new com.bytedance.nita.b.b("NitaView with non activity context, can not be cleared with TtlType.ACTIVITY_DESTORY");
                                MethodCollector.o(6468);
                                throw bVar3;
                            }
                            if (com.bytedance.nita.c.a.f41623b.size() > com.bytedance.nita.c.a.f41622a) {
                                com.bytedance.nita.c.a.a();
                            }
                        }
                    }
                    i3++;
                } else {
                    String a4 = this.$nitaView.a();
                    l.c(a4, "");
                    synchronized (com.bytedance.nita.c.a.f41626e) {
                        try {
                            if (com.bytedance.nita.c.a.f41625d.size() == 5) {
                                com.bytedance.nita.c.a.f41625d.remove(0);
                            }
                            com.bytedance.nita.c.a.f41625d.add(a4);
                        } catch (Throwable th) {
                            MethodCollector.o(6468);
                            throw th;
                        }
                    }
                }
            }
            z zVar = z.f158842a;
            MethodCollector.o(6468);
            return zVar;
        }
    }

    public static h.f.a.a<z> a(c cVar, int i2, Context context) {
        l.c(cVar, "");
        l.c(context, "");
        return new C1017a(context, cVar, new b(i2, cVar, context));
    }

    @Override // com.bytedance.nita.d.d
    public void a(c cVar, Context context, int i2) {
        l.c(cVar, "");
        l.c(context, "");
        synchronized (this.f41634b) {
            if (this.f41634b.get(cVar.a()) == null) {
                this.f41634b.put(cVar.a(), new ArrayList<>());
            }
            ArrayList<h.f.a.a<z>> arrayList = this.f41634b.get(cVar.a());
            if (arrayList == null) {
                l.a();
            }
            arrayList.add(a(cVar, i2, context));
            this.f41635c.add(cVar.a());
        }
    }
}
