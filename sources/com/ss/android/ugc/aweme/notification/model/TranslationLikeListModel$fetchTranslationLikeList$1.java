package com.ss.android.ugc.aweme.notification.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.bean.s;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class TranslationLikeListModel$fetchTranslationLikeList$1<TTaskResult, TContinuationResult> implements g {
    final /* synthetic */ TranslationLikeListModel this$0;

    static {
        Covode.recordClassIndex(73169);
    }

    TranslationLikeListModel$fetchTranslationLikeList$1(TranslationLikeListModel translationLikeListModel) {
        this.this$0 = translationLikeListModel;
    }

    @Override // b.g
    public final void then(i<s> iVar) {
        l.b(iVar, "");
        j.a(iVar.d());
        if (!iVar.c()) {
            this.this$0.handleData(iVar.d());
            if (this.this$0.mNotifyListeners != null) {
                for (o oVar : this.this$0.mNotifyListeners) {
                    oVar.c();
                }
            }
        } else if (this.this$0.mNotifyListeners != null) {
            for (o oVar2 : this.this$0.mNotifyListeners) {
                oVar2.a_(iVar.e());
            }
        }
    }
}
