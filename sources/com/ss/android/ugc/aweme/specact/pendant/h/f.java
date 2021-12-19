package com.ss.android.ugc.aweme.specact.pendant.h;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f134289a = new f();

    private f() {
    }

    static {
        Covode.recordClassIndex(87823);
    }

    public static final class a<T> implements Comparator {
        static {
            Covode.recordClassIndex(87824);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(t.getTime(), t2.getTime());
        }
    }

    private static boolean a(UgActivityTasks ugActivityTasks, List<k.i> list) {
        if (list == null) {
            return false;
        }
        for (k.i iVar : list) {
            if (l.a((Object) ugActivityTasks.getTaskId(), (Object) iVar.f134487c)) {
                return true;
            }
        }
        return false;
    }

    private static void b(UgActivityTasks ugActivityTasks, List<k.i> list) {
        if (list != null) {
            for (k.i iVar : list) {
                if (l.a((Object) iVar.f134487c, (Object) ugActivityTasks.getTaskId())) {
                    k.b bVar = iVar.f134490f;
                    if (bVar != null && bVar.f134452b > 0) {
                        ugActivityTasks.setTime(Integer.valueOf(bVar.f134452b));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static List<UgActivityTasks> a(List<? extends UgActivityTasks> list, List<k.i> list2) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (UgActivityTasks ugActivityTasks : list) {
                    Integer taskType = ugActivityTasks.getTaskType();
                    if (taskType != null) {
                        if (taskType.intValue() == 1 && l.a((Object) ugActivityTasks.getShow(), (Object) false) && ugActivityTasks.getTime() != null) {
                            String taskId = ugActivityTasks.getTaskId();
                            l.b(taskId, "");
                            if (!p.e((CharSequence) taskId, (CharSequence) "daily_watch")) {
                                if (l.a((Object) ugActivityTasks.getTaskId(), (Object) "tribute_trigger")) {
                                    b(ugActivityTasks, list2);
                                }
                                arrayList.add(ugActivityTasks);
                            } else if (a(ugActivityTasks, list2)) {
                                arrayList.add(ugActivityTasks);
                            }
                        }
                    }
                }
                if (arrayList.size() > 1) {
                    n.a((List) arrayList, (Comparator) new a());
                }
            } catch (com.bytedance.ies.a unused) {
            }
        }
        return arrayList;
    }
}
