package com.ss.android.ugc.aweme.publish.a.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.publish.n;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118608a = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.a.a.a$a  reason: collision with other inner class name */
    public static final class C3021a implements com.ss.android.ugc.aweme.publish.f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f118609a;

        static {
            Covode.recordClassIndex(77027);
        }

        @Override // com.ss.android.ugc.aweme.publish.f.a
        public final boolean a() {
            n nVar = this.f118609a;
            if (nVar == null || !nVar.a()) {
                return false;
            }
            return true;
        }

        @Override // com.ss.android.ugc.aweme.publish.f.a
        public final boolean b() {
            n nVar = this.f118609a;
            if (nVar == null || !nVar.n) {
                return false;
            }
            return true;
        }

        C3021a(n nVar) {
            this.f118609a = nVar;
        }
    }

    static {
        Covode.recordClassIndex(77026);
    }

    public static final com.ss.android.ugc.aweme.publish.f.a a(n nVar) {
        return new C3021a(nVar);
    }
}
