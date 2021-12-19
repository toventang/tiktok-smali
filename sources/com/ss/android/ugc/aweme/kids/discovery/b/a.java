package com.ss.android.ugc.aweme.kids.discovery.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<List<Aweme>> f106425a;

    /* renamed from: b  reason: collision with root package name */
    public static final C2713a f106426b = new C2713a((byte) 0);

    static {
        Covode.recordClassIndex(68011);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.b.a$a  reason: collision with other inner class name */
    public static final class C2713a {
        static {
            Covode.recordClassIndex(68012);
        }

        private C2713a() {
        }

        public static List<Aweme> a() {
            WeakReference<List<Aweme>> weakReference = a.f106425a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public /* synthetic */ C2713a(byte b2) {
            this();
        }
    }
}
