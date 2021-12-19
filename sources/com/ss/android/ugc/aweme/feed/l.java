package com.ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.experiment.er;
import com.ss.android.ugc.aweme.feed.k;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.utils.cm;
import java.util.concurrent.Callable;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static final Runnable f93555a = new l();

    static {
        Covode.recordClassIndex(59263);
    }

    private l() {
    }

    public final void run() {
        if (k.f93529c != null && k.f93529c.booleanValue()) {
            k.f93530d = true;
            if (k.f93527a == null) {
                k.a("no_request", "");
                k.b("no_request", "");
            } else if (k.b()) {
                k.a("no_repsonse", "");
                n.a().a(new k.c(), new Callable() {
                    /* class com.ss.android.ugc.aweme.feed.k.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(59256);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Runnable runnable;
                        FeedItemList c2 = k.c();
                        if (er.a() && (runnable = q.f93690a) != null) {
                            try {
                                runnable.run();
                            } catch (Exception e2) {
                                cm.a(e2, "executeMethodSafely", "ExceptionHelper", "executeMethodSafely");
                            }
                        }
                        return c2;
                    }
                }, 0);
            } else if (!k.f93527a.booleanValue()) {
                k.a("valid_response", "");
            } else {
                k.a("exception", "");
            }
        }
    }
}
