package com.bytedance.scene.navigation;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;

public final class e {
    static {
        Covode.recordClassIndex(26348);
    }

    public static d a(j jVar) {
        com.bytedance.scene.d.j.a();
        return c(jVar);
    }

    private static d c(j jVar) {
        while (jVar != null) {
            jVar = jVar.o;
            if (jVar instanceof d) {
                return (d) jVar;
            }
        }
        return null;
    }

    public static d b(j jVar) {
        com.bytedance.scene.d.j.a();
        com.bytedance.scene.d.j.a();
        d c2 = c(jVar);
        if (c2 != null) {
            return c2;
        }
        if (jVar.q() == null) {
            throw new IllegalStateException("Scene " + jVar + " is not attached to any Scene");
        } else if (jVar instanceof d) {
            throw new IllegalStateException("Scene " + jVar + " is root Scene");
        } else {
            throw new IllegalStateException("The root of the Scene hierarchy is not NavigationScene");
        }
    }
}
