package com.ss.android.ugc.aweme.tools.beauty.service;

import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;

public interface f {

    public interface a {
        static {
            Covode.recordClassIndex(91009);
        }

        void a();

        void a(String str, String str2, float f2);

        void a(List<BeautyComposerInfo> list, int i2);

        void a(List<BeautyComposerInfo> list, List<BeautyComposerInfo> list2, int i2);

        void a(boolean z);

        int[] a(String str, String str2);

        void b();
    }

    public interface b {
        static {
            Covode.recordClassIndex(91010);
        }

        void a(ComposerBeauty composerBeauty);

        void a(ComposerBeauty composerBeauty, int i2, List<String> list);

        void a(ComposerBeauty composerBeauty, List<String> list);

        void a(BeautyCategory beautyCategory);

        void b(ComposerBeauty composerBeauty);

        void b(ComposerBeauty composerBeauty, List<String> list);
    }

    static {
        Covode.recordClassIndex(91008);
    }

    void b();

    void c();

    void setContainer(ViewGroup viewGroup);
}
