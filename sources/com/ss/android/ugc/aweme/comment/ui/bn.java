package com.ss.android.ugc.aweme.comment.ui;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.f.f;
import h.f.a.b;
import java.util.Collection;

final /* synthetic */ class bn implements b {

    /* renamed from: a  reason: collision with root package name */
    private final bj f72592a;

    static {
        Covode.recordClassIndex(44724);
    }

    bn(bj bjVar) {
        this.f72592a = bjVar;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        bj bjVar = this.f72592a;
        Boolean bool = (Boolean) obj;
        if (com.bytedance.common.utility.collection.b.a((Collection) bjVar.f72580b)) {
            return null;
        }
        for (Fragment fragment : bjVar.f72580b) {
            if (fragment instanceof f) {
                ((f) fragment).b(bool.booleanValue());
            }
        }
        return null;
    }
}
