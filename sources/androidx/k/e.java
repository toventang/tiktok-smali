package androidx.k;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.q;
import androidx.k.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class e extends q {
    static {
        Covode.recordClassIndex(1202);
    }

    @Override // androidx.fragment.app.q
    public final boolean a(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.q
    public final Object b(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.q
    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.a((m) obj);
        return qVar;
    }

    private static boolean a(m mVar) {
        if (!a((List) mVar.f3325f) || !a((List) mVar.f3327h) || !a((List) mVar.f3328i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.q
    public final void a(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.q
    public final void b(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.q
    public final void c(Object obj, View view) {
        if (obj != null) {
            ((m) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, final Rect rect) {
        if (obj != null) {
            ((m) obj).a(new m.b() {
                /* class androidx.k.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(1206);
                }

                @Override // androidx.k.m.b
                public final Rect a() {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            a(view, rect);
            ((m) obj).a(new m.b() {
                /* class androidx.k.e.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(1203);
                }

                @Override // androidx.k.m.b
                public final Rect a() {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar != null) {
            int i2 = 0;
            if (mVar instanceof q) {
                q qVar = (q) mVar;
                int size = qVar.f3348a.size();
                while (i2 < size) {
                    a(qVar.c(i2), arrayList);
                    i2++;
                }
            } else if (!a(mVar) && a((List) mVar.f3326g)) {
                int size2 = arrayList.size();
                while (i2 < size2) {
                    mVar.b(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public final void b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((m) obj).a(new m.c() {
            /* class androidx.k.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1204);
            }

            @Override // androidx.k.m.c
            public final void b(m mVar) {
            }

            @Override // androidx.k.m.c
            public final void c(m mVar) {
            }

            @Override // androidx.k.m.c
            public final void d(m mVar) {
            }

            @Override // androidx.k.m.c
            public final void a(m mVar) {
                mVar.b(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList.get(i2)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.q
    public final Object a(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.a((m) obj);
        }
        if (obj2 != null) {
            qVar.a((m) obj2);
        }
        if (obj3 != null) {
            qVar.a((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        m mVar2 = (m) obj2;
        m mVar3 = (m) obj3;
        if (mVar != null) {
            if (mVar2 != null) {
                mVar = new q().a(mVar).a(mVar2).a(1);
            }
        } else if (mVar2 != null) {
            mVar = mVar2;
        } else {
            mVar = null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        q qVar = new q();
        if (mVar != null) {
            qVar.a(mVar);
        }
        qVar.a(mVar3);
        return qVar;
    }

    @Override // androidx.fragment.app.q
    public final void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i2 = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int size = qVar.f3348a.size();
            while (i2 < size) {
                b((Object) qVar.c(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!a(mVar)) {
            ArrayList<View> arrayList3 = mVar.f3326g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i2 < size2) {
                        mVar.b(arrayList2.get(i2));
                        i2++;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    mVar.c(arrayList.get(size3));
                }
            }
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, View view, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        ArrayList<View> arrayList2 = mVar.f3326g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((List<View>) arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        a(mVar, arrayList);
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.f3326g.clear();
            mVar.f3326g.addAll(arrayList2);
            b((Object) mVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.q
    public final void a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((m) obj).a(new m.c() {
            /* class androidx.k.e.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1205);
            }

            @Override // androidx.k.m.c
            public final void a(m mVar) {
            }

            @Override // androidx.k.m.c
            public final void b(m mVar) {
            }

            @Override // androidx.k.m.c
            public final void c(m mVar) {
            }

            @Override // androidx.k.m.c
            public final void d(m mVar) {
                Object obj = obj2;
                if (obj != null) {
                    e.this.b(obj, arrayList, (ArrayList<View>) null);
                }
                Object obj2 = obj3;
                if (obj2 != null) {
                    e.this.b(obj2, arrayList2, (ArrayList<View>) null);
                }
                Object obj3 = obj4;
                if (obj3 != null) {
                    e.this.b(obj3, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }
}
