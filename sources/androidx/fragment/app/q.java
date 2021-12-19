package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class q {
    static {
        Covode.recordClassIndex(1081);
    }

    public abstract Object a(Object obj, Object obj2, Object obj3);

    public abstract void a(ViewGroup viewGroup, Object obj);

    public abstract void a(Object obj, Rect rect);

    public abstract void a(Object obj, View view);

    public abstract void a(Object obj, View view, ArrayList<View> arrayList);

    public abstract void a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void a(Object obj, ArrayList<View> arrayList);

    public abstract void a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract boolean a(Object obj);

    public abstract Object b(Object obj);

    public abstract Object b(Object obj, Object obj2, Object obj3);

    public abstract void b(Object obj, View view);

    public abstract void b(Object obj, View view, ArrayList<View> arrayList);

    public abstract void b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object c(Object obj);

    public abstract void c(Object obj, View view);

    /* access modifiers changed from: package-private */
    public final void a(ArrayList<View> arrayList, View view) {
        Boolean bool;
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT < 21 ? ((bool = (Boolean) viewGroup.getTag(R.id.ei6)) == null || !bool.booleanValue()) && viewGroup.getBackground() == null && v.l(viewGroup) == null : !viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    a(arrayList, viewGroup.getChildAt(i2));
                }
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String l2 = v.l(view);
            if (l2 != null) {
                map.put(l2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    a(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static boolean a(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    static ArrayList<String> a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            arrayList2.add(v.l(view));
            v.a(view, (String) null);
        }
        return arrayList2;
    }

    protected static void a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    protected static void a(List<View> list, View view) {
        int size = list.size();
        if (!a(list, view, size)) {
            list.add(view);
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    private static boolean a(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            String l2 = v.l(view2);
            arrayList4.add(l2);
            if (l2 != null) {
                v.a(view2, (String) null);
                String str = map.get(l2);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        v.a(arrayList2.get(i3), l2);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        r.a(view, new Runnable() {
            /* class androidx.fragment.app.q.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1082);
            }

            public final void run() {
                for (int i2 = 0; i2 < size; i2++) {
                    v.a((View) arrayList2.get(i2), (String) arrayList3.get(i2));
                    v.a((View) arrayList.get(i2), (String) arrayList4.get(i2));
                }
            }
        });
    }
}
