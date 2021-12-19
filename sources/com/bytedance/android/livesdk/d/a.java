package com.bytedance.android.livesdk.d;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.j;
import com.bytedance.covode.number.Covode;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static AbstractC0347a f16900a;

    /* renamed from: com.bytedance.android.livesdk.d.a$a  reason: collision with other inner class name */
    public interface AbstractC0347a {
        static {
            Covode.recordClassIndex(9390);
        }

        boolean filter(j jVar);
    }

    static {
        Covode.recordClassIndex(9389);
    }

    public static ImageModel b(User user) {
        j a2 = a(user);
        if (a2 != null) {
            return a2.f19085a;
        }
        return null;
    }

    public static j a(User user) {
        if (user == null) {
            return null;
        }
        if (user.getBorders() == null || user.getBorders().isEmpty()) {
            if (!(f16900a == null || user.getBorder() == null || !f16900a.filter(user.getBorder()))) {
                return user.getBorder();
            }
        } else if (f16900a == null) {
            return user.getBorders().get(0);
        } else {
            for (j jVar : user.getBorders()) {
                if (jVar != null && f16900a.filter(jVar)) {
                    return jVar;
                }
            }
        }
        return null;
    }
}
