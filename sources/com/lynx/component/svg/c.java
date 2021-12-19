package com.lynx.component.svg;

import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.a;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxUI;

public final class c {
    static {
        Covode.recordClassIndex(34702);
    }

    public static a a() {
        return new a("svg") {
            /* class com.lynx.component.svg.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(34703);
            }

            @Override // com.lynx.tasm.behavior.a
            public final LynxUI a(j jVar) {
                return new UISvg(jVar);
            }
        };
    }
}
