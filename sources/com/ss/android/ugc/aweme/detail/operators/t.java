package com.ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.param.b;

public final class t extends c {
    static {
        Covode.recordClassIndex(49669);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.c, com.ss.android.ugc.aweme.detail.operators.ac
    public final aa a(String str, b bVar, a aVar, JediViewModel jediViewModel) {
        str.hashCode();
        if (!str.equals("from_music_detail")) {
            return super.a(str, bVar, aVar, jediViewModel);
        }
        return new b((CommonListViewModel) jediViewModel);
    }
}
