package com.ss.android.ugc.aweme.shortvideo.beauty;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.g.k;
import h.f.b.l;

public final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f125016a = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    private static final Keva f125017d;

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e, com.ss.android.ugc.aweme.tools.beauty.g.k
    public final float a(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.a aVar, String str, float f2) {
        l.d(composerBeauty, "");
        l.d(aVar, "");
        return f2;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e, com.ss.android.ugc.aweme.tools.beauty.g.k
    public final void b(ComposerBeauty composerBeauty, com.ss.android.ugc.aweme.tools.beauty.a aVar, String str, float f2) {
        l.d(composerBeauty, "");
        l.d(aVar, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82137);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(82136);
        Keva repo = Keva.getRepo("story_ulike_repo");
        l.b(repo, "");
        f125017d = repo;
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e, com.ss.android.ugc.aweme.tools.beauty.g.k
    public final boolean a() {
        return f125017d.getBoolean("key_disable_all_beauty", false);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.service.e, com.ss.android.ugc.aweme.tools.beauty.g.k
    public final void a(boolean z) {
        f125017d.storeBoolean("key_disable_all_beauty", z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super(str);
        l.d(str, "");
    }
}
