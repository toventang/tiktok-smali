package com.ss.android.ugc.aweme.feed.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;

final /* synthetic */ class cx implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final cv f94530a;

    static {
        Covode.recordClassIndex(60015);
    }

    cx(cv cvVar) {
        this.f94530a = cvVar;
    }

    public final void run() {
        cv cvVar = this.f94530a;
        if (cvVar.R instanceof e) {
            e eVar = (e) cvVar.R;
            cvVar.f94520j = CommentServiceImpl.e().b(eVar);
            cvVar.f94520j.a().observe(eVar, cvVar.f94522l);
        }
    }
}
