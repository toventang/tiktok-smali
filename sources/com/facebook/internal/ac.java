package com.facebook.internal;

import com.bytedance.covode.number.Covode;
import java.util.EnumSet;
import java.util.Iterator;

public enum ac {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    public static final EnumSet<ac> ALL = EnumSet.allOf(ac.class);
    private final long mValue;

    public final long getValue() {
        return this.mValue;
    }

    static {
        Covode.recordClassIndex(29265);
    }

    public static EnumSet<ac> parseOptions(long j2) {
        EnumSet<ac> noneOf = EnumSet.noneOf(ac.class);
        Iterator it = ALL.iterator();
        while (it.hasNext()) {
            ac acVar = (ac) it.next();
            if ((acVar.getValue() & j2) != 0) {
                noneOf.add(acVar);
            }
        }
        return noneOf;
    }

    private ac(long j2) {
        this.mValue = j2;
    }
}
