package com.ss.android.ugc.aweme.tools.beauty.g;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.b.d;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategoryExtra;
import com.ss.android.ugc.aweme.tools.beauty.service.BeautyFilterConfig;
import com.ss.android.ugc.aweme.tools.beauty.service.c;
import java.util.List;
import java.util.Map;

public interface m {

    public interface b {
        static {
            Covode.recordClassIndex(90919);
        }

        boolean a(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra);

        boolean a(BeautyFilterConfig beautyFilterConfig, List<BeautyCategory> list);

        boolean b(BeautyFilterConfig beautyFilterConfig, BeautyCategoryExtra beautyCategoryExtra);
    }

    public interface c {
        static {
            Covode.recordClassIndex(90920);
        }

        void a(List<BeautyComposerInfo> list);

        void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2);
    }

    static {
        Covode.recordClassIndex(90917);
    }

    float a(ComposerBeauty composerBeauty, String str, float f2);

    List<BeautyCategory> a();

    void a(ComposerBeauty composerBeauty);

    void a(ComposerBeauty composerBeauty, c cVar);

    void a(ComposerBeauty composerBeauty, boolean z);

    void a(com.ss.android.ugc.aweme.tools.beauty.b bVar);

    void a(b bVar);

    void a(String str);

    void a(String str, c.a aVar);

    void a(String str, boolean z);

    void a(boolean z);

    void a(boolean z, com.ss.android.ugc.aweme.tools.beauty.a aVar);

    boolean a(BeautyCategory beautyCategory);

    d<Boolean> b();

    List<BeautyComposerInfo> b(ComposerBeauty composerBeauty);

    void b(ComposerBeauty composerBeauty, String str, float f2);

    boolean b(String str);

    d<List<BeautyComposerInfo>> c();

    void c(ComposerBeauty composerBeauty);

    n<BeautyComposerInfo> d();

    Map<String, n<BeautyComposerInfo>> e();

    boolean e(ComposerBeauty composerBeauty);

    d<ComposerBeauty> f();

    void f(ComposerBeauty composerBeauty);

    b g();

    void g(ComposerBeauty composerBeauty);

    d<androidx.c.a<String, Integer>> h();

    String h(ComposerBeauty composerBeauty);

    d<o<ComposerBeauty>> i();

    com.ss.android.ugc.aweme.tools.beauty.a j();

    void k(ComposerBeauty composerBeauty);

    void l();

    void l(ComposerBeauty composerBeauty);

    void m(ComposerBeauty composerBeauty);

    d<List<BeautyComposerInfo>> n();

    com.ss.android.ugc.aweme.dependence.beauty.data.a o();

    ComposerBeautyBuriedInfoCopy p();

    boolean q();

    BeautyMetadata r();

    List<ComposerBeauty> s();

    void t();

    BeautyFilterConfig u();

    public static final class a {
        static {
            Covode.recordClassIndex(90918);
        }

        public static /* synthetic */ void a(m mVar, boolean z, com.ss.android.ugc.aweme.tools.beauty.a aVar, int i2) {
            if ((i2 & 1) != 0) {
                z = false;
            }
            if ((i2 & 2) != 0) {
                aVar = mVar.j();
            }
            mVar.a(z, aVar);
        }
    }
}
