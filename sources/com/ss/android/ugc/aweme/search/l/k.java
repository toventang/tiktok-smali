package com.ss.android.ugc.aweme.search.l;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import com.ss.android.ugc.aweme.discover.jedi.b;
import com.ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.j;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public enum k {
    INSTANCE;
    
    private final LinkedList<Future> asyncTasks = new LinkedList<>();
    public final ExecutorService executorService = g.a(l.a(o.SERIAL).a());
    public final Map<Class, Object> objectMap = new HashMap();

    public interface a<T, R> {
        static {
            Covode.recordClassIndex(79111);
        }

        R a();
    }

    static {
        Covode.recordClassIndex(79107);
    }

    public final void await() {
        if (m.f121434a) {
            Iterator<Future> it = this.asyncTasks.iterator();
            while (it.hasNext()) {
                try {
                    it.next().get();
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
            this.asyncTasks.clear();
        }
    }

    public final void async(Runnable runnable) {
        if (m.f121434a) {
            this.asyncTasks.add(this.executorService.submit(runnable));
        } else {
            runnable.run();
        }
    }

    private k(String str) {
    }

    public final void prepare(Fragment fragment) {
        if (m.f121434a) {
            j.INSTANCE.setContext(new MutableContextWrapper(fragment.getContext()));
            j.INSTANCE.preInflate(R.layout.auk, null).g();
            j.INSTANCE.preInflate(R.layout.ax4, null).g();
            j.INSTANCE.preInflate(R.layout.av2, null).d(new f<View>() {
                /* class com.ss.android.ugc.aweme.search.l.k.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79108);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(View view) {
                    DmtTabLayout dmtTabLayout = (DmtTabLayout) view.findViewById(R.id.ehe);
                    dmtTabLayout.setCustomTabViewResId(R.layout.aw3);
                    int a2 = com.ss.android.ugc.aweme.search.j.a();
                    for (int i2 = 0; i2 < a2; i2++) {
                        DmtTabLayout.f fVar = new DmtTabLayout.f();
                        fVar.f33755h = dmtTabLayout;
                        fVar.f33756i = dmtTabLayout.b();
                        fVar.f33756i.a(fVar);
                        fVar.a(R.layout.aw3);
                        DmtTabLayout.f33712b.release(fVar);
                    }
                }
            });
            j.INSTANCE.preInflate(R.layout.av1, null).d(new f<View>() {
                /* class com.ss.android.ugc.aweme.search.l.k.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(79109);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.d.f
                public final /* synthetic */ void accept(View view) {
                    b bVar = new b();
                    bVar.a(view);
                    bVar.I();
                    bVar.m();
                    k.this.objectMap.put(b.class, bVar);
                }
            });
            i.b(new Callable<Object>() {
                /* class com.ss.android.ugc.aweme.search.l.k.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(79110);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        new SearchResultActivity();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    try {
                        AVExternalServiceImpl.a().classnameService();
                        new SearchState();
                        new com.ss.android.ugc.aweme.discover.alading.a.b(null, null);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return null;
                }
            }, i.f4824a);
        }
    }

    public final <T> T computeIfAbsent(Class<T> cls, a<Class<T>, T> aVar) {
        T t = (T) this.objectMap.get(cls);
        if (t == null) {
            return aVar.a();
        }
        this.objectMap.remove(cls);
        return t;
    }

    public final View getView(Context context, int i2, ViewGroup viewGroup) {
        return j.INSTANCE.inflate(context, i2, viewGroup);
    }

    public final View getView(LayoutInflater layoutInflater, Context context, int i2, ViewGroup viewGroup) {
        return j.INSTANCE.inflate(layoutInflater, context, i2, viewGroup);
    }
}
