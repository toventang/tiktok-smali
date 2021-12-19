package com.ss.android.ugc.aweme.tools.draft.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import h.f.b.l;
import java.util.ArrayList;

public abstract class a<Element> {

    /* renamed from: a  reason: collision with root package name */
    public Element f139773a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<c> f139774b;

    static {
        Covode.recordClassIndex(91363);
    }

    public abstract boolean b(c cVar);

    public final void a(c cVar) {
        if (cVar != null) {
            ArrayList<c> arrayList = this.f139774b;
            if (arrayList == null) {
                ArrayList<c> arrayList2 = new ArrayList<>();
                this.f139774b = arrayList2;
                arrayList2.add(cVar);
                return;
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                long j2 = cVar.I;
                ArrayList<c> arrayList3 = this.f139774b;
                if (arrayList3 == null) {
                    l.b();
                }
                c cVar2 = arrayList3.get(i2);
                if (cVar2 == null) {
                    l.b();
                }
                l.b(cVar2, "");
                if (j2 > cVar2.I) {
                    ArrayList<c> arrayList4 = this.f139774b;
                    if (arrayList4 == null) {
                        l.b();
                    }
                    arrayList4.add(i2, cVar);
                    return;
                }
            }
        }
    }
}
