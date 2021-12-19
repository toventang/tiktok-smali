package com.ss.android.ugc.aweme.dsp.playerservice.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public enum c {
    SEQUENCE,
    LIST_LOOP,
    SINGLE_LOOP,
    SHUFFLE;

    static {
        Covode.recordClassIndex(52047);
    }

    public final List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> getRealPlayableList(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        int i2 = d.f83411a[ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            arrayList.addAll(list);
        } else if (i2 == 4) {
            arrayList.addAll(n.a((Iterable) list));
        }
        return arrayList;
    }

    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c getPre(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list, int i2) {
        l.d(list, "");
        int i3 = d.f83413c[ordinal()];
        if (i3 == 1) {
            return (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.b((List) list, i2 - 1);
        }
        if (i3 == 2 || i3 == 3) {
            int i4 = i2 - 1;
            if (i4 < 0) {
                i4 = n.a((List) list);
            }
            return (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.b((List) list, i4);
        } else if (i3 == 4) {
            return (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.b((List) list, i2);
        } else {
            throw new h.n();
        }
    }

    public final List<com.ss.android.ugc.aweme.dsp.playerservice.b.c> getFuturePlayableList(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list, int i2) {
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        int i3 = d.f83414d[ordinal()];
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            int i4 = i2 + 1;
            if (i4 < list.size()) {
                arrayList.addAll(list.subList(i4, list.size()));
            }
        } else if (i3 == 4) {
            int i5 = i2 + 1;
            if (i5 < list.size()) {
                arrayList.addAll(list.subList(i5, list.size()));
                arrayList.addAll(list.subList(0, i2));
            } else {
                arrayList.addAll(list.subList(0, i2));
            }
        }
        return arrayList;
    }

    public final com.ss.android.ugc.aweme.dsp.playerservice.b.c getNext(List<? extends com.ss.android.ugc.aweme.dsp.playerservice.b.c> list, int i2) {
        l.d(list, "");
        int i3 = -1;
        while (i2 != i3) {
            if (i3 == -1) {
                i3 = i2;
            }
            int i4 = d.f83412b[ordinal()];
            if (i4 == 1) {
                i3++;
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar = (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.b((List) list, i3);
                if (cVar == null) {
                    return null;
                }
                if (!b.a(cVar.a())) {
                    return cVar;
                }
            } else if (i4 == 2 || i4 == 3) {
                i3++;
                if (i3 > n.a((List) list)) {
                    i3 = 0;
                }
                com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar2 = (com.ss.android.ugc.aweme.dsp.playerservice.b.c) n.b((List) list, i3);
                if (cVar2 == null) {
                    return null;
                }
                if (!b.a(cVar2.a())) {
                    return cVar2;
                }
            } else if (i4 == 4) {
                n.b((List) list, i2);
            }
        }
        return null;
    }
}
