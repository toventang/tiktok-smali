package androidx.fragment.app;

import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import androidx.c.f;
import androidx.core.app.p;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f2991a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final q f2992b;

    /* renamed from: c  reason: collision with root package name */
    private static final q f2993c = a();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f3022a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3023b;

        /* renamed from: c  reason: collision with root package name */
        public c f3024c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f3025d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3026e;

        /* renamed from: f  reason: collision with root package name */
        public c f3027f;

        static {
            Covode.recordClassIndex(1075);
        }

        a() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0094, code lost:
        r11 = a((r14 = r13.f3025d), (r0 = r13.f3022a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0203, code lost:
        r0 = r13.f3022a;
        r6 = a((r14 = r13.f3025d), r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0104 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(androidx.fragment.app.j r42, java.util.ArrayList<androidx.fragment.app.c> r43, java.util.ArrayList<java.lang.Boolean> r44, int r45, int r46, boolean r47) {
        /*
        // Method dump skipped, instructions count: 814
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.a(androidx.fragment.app.j, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    private static boolean a(q qVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!qVar.a(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static void a(ArrayList<View> arrayList, androidx.c.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c2 = aVar.c(size);
            if (collection.contains(v.l(c2))) {
                arrayList.add(c2);
            }
        }
    }

    private static String a(androidx.c.a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equals(aVar.c(i2))) {
                return aVar.b(i2);
            }
        }
        return null;
    }

    private static void a(q qVar, Object obj, Object obj2, androidx.c.a<String, View> aVar, boolean z, c cVar) {
        String str;
        if (cVar.r != null && !cVar.r.isEmpty()) {
            if (z) {
                str = cVar.s.get(0);
            } else {
                str = cVar.r.get(0);
            }
            View view = aVar.get(str);
            qVar.a(obj, view);
            if (obj2 != null) {
                qVar.a(obj2, view);
            }
        }
    }

    static void a(Fragment fragment, Fragment fragment2, boolean z, androidx.c.a<String, View> aVar) {
        p enterTransitionCallback;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar != null) {
                int size = aVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(aVar.b(i2));
                    arrayList.add(aVar.c(i2));
                }
            }
        }
    }

    static ArrayList<View> a(q qVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            qVar.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        qVar.a(obj, arrayList2);
        return arrayList2;
    }

    static void a(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    private static Object a(q qVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean allowEnterTransitionOverlap;
        if (!(obj == null || obj2 == null || fragment == null)) {
            if (z) {
                allowEnterTransitionOverlap = fragment.getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = fragment.getAllowEnterTransitionOverlap();
            }
            if (!allowEnterTransitionOverlap) {
                return qVar.b(obj2, obj, obj3);
            }
        }
        return qVar.a(obj2, obj, obj3);
    }

    private static void a(c cVar, SparseArray<a> sparseArray, boolean z) {
        int size = cVar.f2904b.size();
        for (int i2 = 0; i2 < size; i2++) {
            a(cVar, cVar.f2904b.get(i2), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0086, code lost:
        if (r3.mAdded != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00bd, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00da, code lost:
        if (r3.mHidden == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00dc, code lost:
        r4 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(androidx.fragment.app.c r8, androidx.fragment.app.c.a r9, android.util.SparseArray<androidx.fragment.app.o.a> r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.a(androidx.fragment.app.c, androidx.fragment.app.c$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(androidx.fragment.app.j r13, androidx.fragment.app.Fragment r14) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o.a(androidx.fragment.app.j, androidx.fragment.app.Fragment):void");
    }

    private static q a() {
        try {
            return (q) Class.forName("androidx.k.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        p pVar;
        Covode.recordClassIndex(1070);
        if (Build.VERSION.SDK_INT >= 21) {
            pVar = new p();
        } else {
            pVar = null;
        }
        f2992b = pVar;
    }

    private static q a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        q qVar = f2992b;
        if (qVar != null && a(qVar, arrayList)) {
            return qVar;
        }
        q qVar2 = f2993c;
        if (qVar2 != null && a(qVar2, arrayList)) {
            return qVar2;
        }
        if (qVar == null && qVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    private static a a(a aVar, SparseArray<a> sparseArray, int i2) {
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        sparseArray.put(i2, aVar2);
        return aVar2;
    }

    private static Object b(q qVar, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return qVar.b(exitTransition);
    }

    private static void b(c cVar, SparseArray<a> sparseArray, boolean z) {
        if (cVar.f2903a.n.a()) {
            for (int size = cVar.f2904b.size() - 1; size >= 0; size--) {
                a(cVar, cVar.f2904b.get(size), sparseArray, true, z);
            }
        }
    }

    private static Object a(q qVar, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return qVar.b(enterTransition);
    }

    static View a(androidx.c.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        String str;
        c cVar = aVar2.f3024c;
        if (obj == null || aVar == null || cVar.r == null || cVar.r.isEmpty()) {
            return null;
        }
        if (z) {
            str = cVar.r.get(0);
        } else {
            str = cVar.s.get(0);
        }
        return aVar.get(str);
    }

    private static androidx.c.a<String, View> b(q qVar, androidx.c.a<String, String> aVar, Object obj, a aVar2) {
        p exitTransitionCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = aVar2.f3025d;
        androidx.c.a<String, View> aVar3 = new androidx.c.a<>();
        qVar.a((Map<String, View>) aVar3, fragment.getView());
        c cVar = aVar2.f3027f;
        if (aVar2.f3026e) {
            exitTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = cVar.s;
        } else {
            exitTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = cVar.r;
        }
        f.a((Map) aVar3, (Collection<?>) arrayList);
        if (exitTransitionCallback != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(v.l(view))) {
                    aVar.put(v.l(view), aVar.remove(str));
                }
            }
        } else {
            f.a((Map) aVar, (Collection<?>) aVar3.keySet());
        }
        return aVar3;
    }

    static androidx.c.a<String, View> a(q qVar, androidx.c.a<String, String> aVar, Object obj, a aVar2) {
        p enterTransitionCallback;
        ArrayList<String> arrayList;
        String a2;
        Fragment fragment = aVar2.f3022a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        androidx.c.a<String, View> aVar3 = new androidx.c.a<>();
        qVar.a((Map<String, View>) aVar3, view);
        c cVar = aVar2.f3024c;
        if (aVar2.f3023b) {
            enterTransitionCallback = fragment.getExitTransitionCallback();
            arrayList = cVar.r;
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
            arrayList = cVar.s;
        }
        if (arrayList != null) {
            f.a((Map) aVar3, (Collection<?>) arrayList);
            f.a((Map) aVar3, (Collection<?>) aVar.values());
        }
        if (enterTransitionCallback != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar3.get(str);
                if (view2 == null) {
                    String a3 = a(aVar, str);
                    if (a3 != null) {
                        aVar.remove(a3);
                    }
                } else if (!str.equals(v.l(view2)) && (a2 = a(aVar, str)) != null) {
                    aVar.put(a2, v.l(view2));
                }
            }
        } else {
            for (int size2 = aVar.size() - 1; size2 >= 0; size2--) {
                if (!aVar3.containsKey(aVar.c(size2))) {
                    aVar.d(size2);
                }
            }
        }
        return aVar3;
    }

    private static Object a(q qVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
        } else {
            sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
        }
        return qVar.c(qVar.b(sharedElementEnterTransition));
    }

    private static androidx.c.a<String, String> a(int i2, ArrayList<c> arrayList, ArrayList<Boolean> arrayList2, int i3, int i4) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        androidx.c.a<String, String> aVar = new androidx.c.a<>();
        for (int i5 = i4 - 1; i5 >= i3; i5--) {
            c cVar = arrayList.get(i5);
            if (cVar.b(i2)) {
                boolean booleanValue = arrayList2.get(i5).booleanValue();
                if (cVar.r != null) {
                    int size = cVar.r.size();
                    if (booleanValue) {
                        arrayList4 = cVar.r;
                        arrayList3 = cVar.s;
                    } else {
                        arrayList3 = cVar.r;
                        arrayList4 = cVar.s;
                    }
                    for (int i6 = 0; i6 < size; i6++) {
                        String str = arrayList3.get(i6);
                        String str2 = arrayList4.get(i6);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }
}
