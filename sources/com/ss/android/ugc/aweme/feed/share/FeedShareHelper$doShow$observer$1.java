package com.ss.android.ugc.aweme.feed.share;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import java.lang.ref.WeakReference;

public final class FeedShareHelper$doShow$observer$1 implements au {
    static {
        Covode.recordClassIndex(59719);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    FeedShareHelper$doShow$observer$1() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f93867a = new a();

        static {
            Covode.recordClassIndex(59720);
        }

        a() {
        }

        public final void run() {
            WeakReference<Object> weakReference;
            if (!f.f34637l && (weakReference = a.f93869b) != null) {
                weakReference.get();
            }
        }
    }

    @v(a = i.a.ON_STOP)
    public final void onStop() {
        new Handler(Looper.getMainLooper()).post(a.f93867a);
    }
}
