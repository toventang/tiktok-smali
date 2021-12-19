package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.i;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import h.a.n;
import h.a.z;
import h.m.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class j extends i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f95447b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private int f95448c = -1;

    static {
        Covode.recordClassIndex(60459);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "publish_log";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60460);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        ArrayList arrayList;
        String str;
        if (this.f95448c <= 0) {
            this.f95448c = SettingsManager.a().a("publish_log_max_length", 500);
        }
        if (this.f95448c <= 0) {
            return "Null maxTextLength:" + this.f95448c;
        }
        i.d d2 = d();
        List<i.c> list = d2.f95442a;
        List d3 = n.d(n.d((Collection) d2.f95444c, (Iterable) d2.f95445d), 4);
        ArrayList<i.c> arrayList2 = new ArrayList(n.a((Iterable) d3, 10));
        int i2 = 0;
        for (Object obj : d3) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            i.c cVar = (i.c) obj;
            cVar.a(i2);
            arrayList2.add(cVar);
            i2 = i3;
        }
        ArrayList arrayList3 = new ArrayList();
        for (i.c cVar2 : arrayList2) {
            n.a((Collection) arrayList3, (Iterable) cVar2.f95430g);
        }
        List g2 = n.g((Collection) arrayList3);
        if (this.f95448c > 500) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                n.a((Collection) arrayList4, (Iterable) it.next().f95430g);
            }
            arrayList = arrayList4;
        } else {
            arrayList = z.INSTANCE;
        }
        g2.addAll(arrayList);
        List a2 = n.a((Iterable) g2, (Comparator) new b());
        ArrayList arrayList5 = new ArrayList(n.a((Iterable) a2, 10));
        Iterator it2 = a2.iterator();
        while (true) {
            str = "";
            if (!it2.hasNext()) {
                break;
            }
            PublishBehaviorModel publishBehaviorModel = (PublishBehaviorModel) it2.next();
            String str2 = p.a((CharSequence) publishBehaviorModel.code) ? str : " " + publishBehaviorModel.code;
            if (!p.a((CharSequence) publishBehaviorModel.info)) {
                str = " " + publishBehaviorModel.info;
            }
            arrayList5.add(publishBehaviorModel.getSimpleTime() + ' ' + publishBehaviorModel.idIndex + ' ' + publishBehaviorModel.stage + ' ' + publishBehaviorModel.type.getSimpleName() + str2 + str);
        }
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            str = str + '|' + ((String) it3.next());
        }
        return p.c(str, this.f95448c);
    }

    public static final class b<T> implements Comparator {
        static {
            Covode.recordClassIndex(60461);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Long.valueOf(t2.timeStamp), Long.valueOf(t.timeStamp));
        }
    }
}
