package com.ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.vesdk.ac;
import h.f.b.l;
import h.p;
import h.v;
import java.lang.ref.WeakReference;

public final class i implements ac.a {

    /* renamed from: a  reason: collision with root package name */
    public final k<p<Integer, Integer>> f130114a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<SafeHandler> f130115b;

    static {
        Covode.recordClassIndex(85365);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f130116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f130117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f130118c;

        static {
            Covode.recordClassIndex(85366);
        }

        a(i iVar, int i2, int i3) {
            this.f130116a = iVar;
            this.f130117b = i2;
            this.f130118c = i3;
        }

        public final void run() {
            this.f130116a.f130114a.a(v.a(Integer.valueOf(this.f130117b), Integer.valueOf(this.f130118c)));
        }
    }

    public i(WeakReference<SafeHandler> weakReference, k<p<Integer, Integer>> kVar) {
        l.d(weakReference, "");
        l.d(kVar, "");
        this.f130115b = weakReference;
        this.f130114a = kVar;
    }

    @Override // com.ss.android.vesdk.ac.a
    public final void a(int i2, int i3) {
        SafeHandler safeHandler = this.f130115b.get();
        if (safeHandler != null) {
            safeHandler.post(new a(this, i2, i3));
        }
    }
}
