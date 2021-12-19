package com.bytedance.android.live.liveinteract.cohost.a.a;

import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class c {

    public static abstract class b extends d.b<a> {

        /* renamed from: d  reason: collision with root package name */
        private HashMap f10029d;

        static {
            Covode.recordClassIndex(5225);
        }

        public abstract void a();

        public abstract void a(Throwable th);

        public abstract void b();

        public abstract void b(Throwable th);

        public void c() {
            HashMap hashMap = this.f10029d;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
        public /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            c();
        }
    }

    static {
        Covode.recordClassIndex(5223);
    }

    public static abstract class a extends d.a<b> {
        static {
            Covode.recordClassIndex(5224);
        }

        public abstract void a(boolean z);

        public abstract void b(boolean z);

        public a(b bVar) {
            super(bVar);
        }
    }
}
