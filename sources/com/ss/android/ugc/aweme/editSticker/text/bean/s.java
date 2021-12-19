package com.ss.android.ugc.aweme.editSticker.text.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

public class s {

    /* renamed from: c  reason: collision with root package name */
    private static s f88451c;

    /* renamed from: a  reason: collision with root package name */
    public List<r> f88452a;

    /* renamed from: b  reason: collision with root package name */
    public int f88453b;

    static {
        Covode.recordClassIndex(55671);
    }

    public final r b() {
        if (this.f88453b == this.f88452a.size()) {
            this.f88453b = 0;
        }
        return this.f88452a.get(this.f88453b);
    }

    public static s a() {
        MethodCollector.i(5605);
        if (f88451c == null) {
            synchronized (s.class) {
                try {
                    if (f88451c == null) {
                        f88451c = new s();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5605);
                    throw th;
                }
            }
        }
        s sVar = f88451c;
        MethodCollector.o(5605);
        return sVar;
    }

    private s() {
        ArrayList arrayList = new ArrayList();
        this.f88452a = arrayList;
        arrayList.add(new r(new int[]{-16716612, -16745761}, -1, -1056964609));
        this.f88452a.add(new r(new int[]{-20071, -55717}, -1, -1056964609));
        this.f88452a.add(new r(new int[]{-14625300, -5938690, -119723}, -1, -1056964609));
        this.f88452a.add(new r(new int[]{-468142, -42147}, -1, -1056964609));
        this.f88452a.add(new r(new int[]{-16352892, -15726275}, -1, -1056964609));
        this.f88452a.add(new r(new int[]{-1773591, -7100977}, -16777216, 1442840576));
        this.f88452a.add(new r(new int[]{-12369085, -16777216}, -1, -1056964609));
    }
}
