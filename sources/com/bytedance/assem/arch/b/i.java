package com.bytedance.assem.arch.b;

import com.bytedance.covode.number.Covode;
import java.util.List;

public interface i<ITEM> {
    static {
        Covode.recordClassIndex(14782);
    }

    void a();

    void a(ITEM item);

    void a(ITEM item, List<? extends Object> list);

    void b(ITEM item);

    boolean c(ITEM item);
}
