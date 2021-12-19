package com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class o extends n {
    static {
        Covode.recordClassIndex(60473);
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String a() {
        return "abnor_read_record";
    }

    @Override // com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.a
    public final String c() {
        List<AwemeToolFeedbackInfo> d2 = d();
        ArrayList arrayList = new ArrayList(n.a((Iterable) d2, 10));
        for (T t : d2) {
            String str = "";
            if (!t.getECode().isEmpty()) {
                StringBuilder sb = new StringBuilder("(");
                List<AwemeToolFeedbackECode> eCode = t.getECode();
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) eCode, 10));
                for (T t2 : eCode) {
                    String stage = t2.getStage();
                    arrayList2.add(((stage == null || stage.length() == 0) ? str : t2.getStage() + ':') + t2.getCode());
                }
                Iterator it = arrayList2.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = ((String) next) + ';' + ((String) it.next());
                    }
                    str = sb.append((String) next).append(')').toString();
                } else {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
            }
            arrayList.add("[" + t.getName() + ':' + t.getCount() + ' ' + t.getSuccessCount() + "Success|" + t.getCancelCount() + "Cancel|" + t.getECode().size() + "Failed" + str + ']');
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next2 = it2.next();
            while (it2.hasNext()) {
                next2 = ((String) next2) + ((String) it2.next());
            }
            return (String) next2;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}
