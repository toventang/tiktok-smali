package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.content.Context;
import android.os.Build;
import android.widget.TextView;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.lego.f.b;
import com.ss.android.ugc.aweme.lego.p;
import h.f.b.l;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f93157a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f93158b;

    static {
        Covode.recordClassIndex(59096);
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f93159a;

        static {
            Covode.recordClassIndex(59097);
        }

        a(r rVar) {
            this.f93159a = rVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f93159a.f93158b.run();
            return z.f158842a;
        }
    }

    public final void run() {
        MethodCollector.i(8686);
        if (this.f93157a) {
            this.f93158b.run();
            b bVar = p.f107615b;
            Context a2 = d.a();
            if (Build.VERSION.SDK_INT > 23 || bVar.f107551b) {
                MethodCollector.o(8686);
            } else if (bVar.f107550a == null || bVar.f107550a.size() <= 0) {
                if (!bVar.f107552c && bVar.f107550a == null) {
                    try {
                        new TextView(a2).post(new Runnable() {
                            /* class com.ss.android.ugc.aweme.lego.f.b.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(68816);
                            }

                            public final void run() {
                            }
                        });
                        try {
                            Thread currentThread = Thread.currentThread();
                            Field declaredField = Thread.class.getDeclaredField("localValues");
                            declaredField.setAccessible(true);
                            Object obj = declaredField.get(currentThread);
                            Field declaredField2 = Class.forName("java.lang.ThreadLocal$Values").getDeclaredField("table");
                            declaredField2.setAccessible(true);
                            Object[] objArr = (Object[]) declaredField2.get(obj);
                            for (Object obj2 : objArr) {
                                if (obj2 != null && obj2.getClass().getName().equals("android.view.ViewRootImpl$RunQueue")) {
                                    Field declaredField3 = Class.forName("android.view.ViewRootImpl$RunQueue").getDeclaredField("mActions");
                                    declaredField3.setAccessible(true);
                                    declaredField3.get(obj2);
                                    com.bytedance.common.utility.collection.b.a(declaredField3.get(obj2));
                                    declaredField3.get(obj2);
                                    bVar.f107550a = (ArrayList) declaredField3.get(obj2);
                                    bVar.f107552c = true;
                                    MethodCollector.o(8686);
                                    return;
                                }
                            }
                            MethodCollector.o(8686);
                            return;
                        } catch (Exception unused) {
                            bVar.f107551b = true;
                        }
                    } catch (Exception unused2) {
                        MethodCollector.o(8686);
                        return;
                    }
                }
                MethodCollector.o(8686);
            } else {
                com.bytedance.common.utility.collection.b.a((Object) bVar.f107550a);
                MethodCollector.o(8686);
            }
        } else {
            i.b(new a(this), i.f4826c);
            MethodCollector.o(8686);
        }
    }

    public r(boolean z, Runnable runnable) {
        l.d(runnable, "");
        this.f93157a = z;
        this.f93158b = runnable;
    }
}
