package com.bytedance.im.core.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.utils.d;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class aq implements Serializable {
    private transient Comparator<ap> comparator = new Comparator<ap>() {
        /* class com.bytedance.im.core.d.aq.AnonymousClass1 */

        static {
            Covode.recordClassIndex(22717);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(ap apVar, ap apVar2) {
            ap apVar3 = apVar;
            ap apVar4 = apVar2;
            if (apVar3.start < apVar4.start) {
                return -1;
            }
            if (apVar3.start == apVar4.start) {
                return 0;
            }
            return 1;
        }
    };
    @c(a = "list")
    public List<ap> ranges;

    static {
        Covode.recordClassIndex(22716);
    }

    public aq() {
    }

    public synchronized boolean isRangeListNullOrEmpty() {
        boolean a2;
        MethodCollector.i(10405);
        a2 = d.a(this.ranges);
        MethodCollector.o(10405);
        return a2;
    }

    public final synchronized String toString() {
        MethodCollector.i(10719);
        List<ap> list = this.ranges;
        if (list != null) {
            String obj = list.toString();
            MethodCollector.o(10719);
            return obj;
        }
        MethodCollector.o(10719);
        return "[]";
    }

    public synchronized aq copy() {
        aq aqVar;
        MethodCollector.i(10244);
        aqVar = new aq(new ArrayList());
        List<ap> list = this.ranges;
        if (list != null) {
            for (ap apVar : list) {
                aqVar.ranges.add(apVar.copy());
            }
        }
        MethodCollector.o(10244);
        return aqVar;
    }

    public synchronized ap getMaxRange() {
        MethodCollector.i(10559);
        if (!d.a(this.ranges)) {
            List<ap> list = this.ranges;
            ap apVar = list.get(list.size() - 1);
            MethodCollector.o(10559);
            return apVar;
        }
        MethodCollector.o(10559);
        return null;
    }

    public aq(List<ap> list) {
        this.ranges = list;
    }

    public synchronized boolean check(long j2) {
        MethodCollector.i(10083);
        if (d.a(this.ranges)) {
            MethodCollector.o(10083);
            return false;
        }
        for (ap apVar : this.ranges) {
            if (apVar.start <= j2 && j2 <= apVar.end) {
                MethodCollector.o(10083);
                return true;
            }
        }
        MethodCollector.o(10083);
        return false;
    }

    public synchronized void merge(ap apVar) {
        MethodCollector.i(10243);
        if (!apVar.isValid()) {
            MethodCollector.o(10243);
        } else if (d.a(this.ranges)) {
            ArrayList arrayList = new ArrayList();
            this.ranges = arrayList;
            arrayList.add(apVar);
            MethodCollector.o(10243);
        } else {
            this.ranges.add(apVar);
            Collections.sort(this.ranges, this.comparator);
            LinkedList linkedList = new LinkedList();
            for (ap apVar2 : this.ranges) {
                if (linkedList.isEmpty() || ((ap) linkedList.getLast()).end + 1 < apVar2.start) {
                    linkedList.add(apVar2);
                } else {
                    ((ap) linkedList.getLast()).end = Math.max(((ap) linkedList.getLast()).end, apVar2.end);
                }
            }
            this.ranges = linkedList;
            MethodCollector.o(10243);
        }
    }
}
