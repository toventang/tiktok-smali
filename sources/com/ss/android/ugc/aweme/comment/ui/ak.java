package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.CommentViewModelImpl;
import com.ss.android.ugc.aweme.comment.n;
import com.ss.android.ugc.aweme.feed.i.d;
import com.ss.android.ugc.d.a.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ak implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final k f72517a;

    static {
        Covode.recordClassIndex(44690);
    }

    ak(k kVar) {
        this.f72517a = kVar;
    }

    public final void run() {
        k kVar = this.f72517a;
        e activity = kVar.getActivity();
        if (activity != null) {
            d dVar = new d(0);
            dVar.f93467b = kVar.O;
            dVar.f93469d = activity.hashCode();
            dVar.f93468c = kVar.f72763b.getAid();
            c.a(dVar);
            n nVar = ((CommentViewModelImpl) ae.a(k.a((Context) activity), (ad.b) null).a(CommentViewModelImpl.class)).f71253a;
            nVar.f72114b--;
            if (nVar.f72114b <= 0) {
                nVar.f72113a.setValue(false);
            }
        }
    }
}
