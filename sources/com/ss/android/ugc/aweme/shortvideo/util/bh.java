package com.ss.android.ugc.aweme.shortvideo.util;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.shortvideo.ae;
import com.ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.ss.android.ugc.aweme.utils.ig;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.am;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public final class bh {

    /* renamed from: a  reason: collision with root package name */
    public static final bh f132260a = new bh();

    private bh() {
    }

    static {
        Covode.recordClassIndex(86621);
    }

    public static final String a(Object obj) {
        if (l.a(obj, (Object) ae.f124883a)) {
            return "video_15";
        }
        if (l.a(obj, (Object) ae.f124884b)) {
            return "video_60";
        }
        if (l.a(obj, (Object) ae.f124885c)) {
            return "video_180";
        }
        if (l.a(obj, (Object) "by_default")) {
            return "by_default";
        }
        return "-1";
    }

    public static final Set<String> a(int i2) {
        String a2 = ig.a(R.string.f_2);
        String a3 = ig.a(R.string.f_4);
        String a4 = ig.a(R.string.f_3);
        if (i2 == 10) {
            return am.a((Object[]) new String[]{a2, a3, a4});
        } else if (i2 == 11) {
            return am.a((Object[]) new String[]{a3, a4});
        } else if (i2 != 14) {
            return null;
        } else {
            return am.a(a4);
        }
    }

    public static final View a(ScrollableLinearLayout scrollableLinearLayout, Set<String> set) {
        String str;
        l.d(scrollableLinearLayout, "");
        l.d(set, "");
        if (set.contains(ae.f124885c)) {
            str = ae.f124885c;
        } else {
            if (set.contains(ae.f124884b)) {
                str = ae.f124884b;
            }
            return null;
        }
        if (str != null) {
            int childCount = scrollableLinearLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = scrollableLinearLayout.getChildAt(i2);
                l.b(childAt, "");
                Object tag = childAt.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                if (l.a(tag, (Object) str)) {
                    return childAt;
                }
            }
            return null;
        }
        return null;
    }

    private static void a(Map<Integer, View> map, Set<Integer> set) {
        Iterator<Map.Entry<Integer, View>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (set.contains(it.next().getKey())) {
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(TabHost tabHost, Set<String> set, Map<Integer, View> map) {
        l.d(tabHost, "");
        l.d(set, "");
        l.d(map, "");
        SortedMap a2 = ag.a(map);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : a2.entrySet()) {
            Integer num = (Integer) entry.getKey();
            View view = (View) entry.getValue();
            l.b(view, "");
            Object tag = view.getTag();
            if ((tag instanceof String) && tag != null && !set.contains(tag)) {
                l.b(num, "");
                tabHost.a(view, num.intValue());
                set.add(tag);
                linkedHashSet.add(num);
            }
        }
        a(map, linkedHashSet);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r20v0, resolved type: java.util.Set<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(Set<String> set, TabHost tabHost, ScrollableLinearLayout scrollableLinearLayout, Set<String> set2, Map<Integer, View> map) {
        View childAt;
        MethodCollector.i(10850);
        l.d(tabHost, "");
        l.d(scrollableLinearLayout, "");
        l.d(set2, "");
        l.d(map, "");
        if (set == null) {
            MethodCollector.o(10850);
        } else if (set.size() != set2.size() || !set2.containsAll(set)) {
            int childCount = scrollableLinearLayout.getChildCount();
            for (Map.Entry entry : ag.a(map).entrySet()) {
                View view = (View) entry.getValue();
                l.b(view, "");
                Object tag = view.getTag();
                if ((tag instanceof String) && tag != null && set.contains(tag)) {
                    childCount++;
                }
            }
            int childCount2 = scrollableLinearLayout.getChildCount();
            while (true) {
                childCount2--;
                if (childCount2 < 0) {
                    break;
                }
                View childAt2 = scrollableLinearLayout.getChildAt(childCount2);
                l.b(childAt2, "");
                Object tag2 = childAt2.getTag();
                if ((tag2 instanceof String) && tag2 != null && !set.contains(tag2)) {
                    childCount--;
                }
            }
            if (childCount <= 0) {
                tabHost.setVisibility(8);
                MethodCollector.o(10850);
                return;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry entry2 : ag.a(map).entrySet()) {
                Integer num = (Integer) entry2.getKey();
                View view2 = (View) entry2.getValue();
                l.b(view2, "");
                Object tag3 = view2.getTag();
                if ((tag3 instanceof String) && tag3 != null && set.contains(tag3)) {
                    l.b(num, "");
                    tabHost.a(view2, num.intValue());
                    set2.add(tag3);
                    linkedHashSet.add(num);
                }
            }
            a(map, linkedHashSet);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (int childCount3 = scrollableLinearLayout.getChildCount() - 1; childCount3 >= 0; childCount3--) {
                View childAt3 = scrollableLinearLayout.getChildAt(childCount3);
                l.b(childAt3, "");
                Object tag4 = childAt3.getTag();
                if ((tag4 instanceof String) && tag4 != null && !set.contains(tag4)) {
                    e.a("remove tab the index is " + tabHost.f132861b + " index: " + childCount3);
                    if (!(tabHost.f132866g == null || (childAt = tabHost.f132866g.getChildAt(childCount3)) == null)) {
                        Object b2 = tabHost.b(tabHost.f132861b);
                        tabHost.f132866g.removeView(childAt);
                        if (tabHost.f132861b >= tabHost.f132866g.getChildCount()) {
                            tabHost.f132861b = Math.max(tabHost.f132866g.getChildCount() - 1, 0);
                            Object b3 = tabHost.b(tabHost.f132861b);
                            e.a("remove tab the current index is " + tabHost.f132861b);
                            if (!b2.equals(b3) && tabHost.f132867h != null) {
                                tabHost.f132867h.a(b2, tabHost.f132861b, 0, false, true);
                            }
                        }
                        tabHost.f132869j = Math.min(Math.max(tabHost.f132866g.getChildCount() - 1, 0), tabHost.f132869j);
                        tabHost.requestLayout();
                    }
                    linkedHashSet2.add(tag4);
                    map.put(Integer.valueOf(childCount3), childAt3);
                }
            }
            set2.removeAll(linkedHashSet2);
            MethodCollector.o(10850);
        } else {
            MethodCollector.o(10850);
        }
    }
}
