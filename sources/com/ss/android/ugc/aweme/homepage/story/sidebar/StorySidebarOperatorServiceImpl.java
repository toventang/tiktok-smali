package com.ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IDetailPageShareVMService;
import com.ss.android.ugc.aweme.detail.operators.ae;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.param.b;
import h.f.b.l;
import h.p;
import h.v;
import java.util.HashMap;

public final class StorySidebarOperatorServiceImpl implements IDetailPageShareVMService {
    static {
        Covode.recordClassIndex(63400);
    }

    public static final class a implements ae {
        static {
            Covode.recordClassIndex(63401);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.detail.operators.ae
        public final p<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> a(b bVar) {
            l.d(bVar, "");
            return v.a("story_sidebar_list", StorySidebarListVM.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.IDetailPageShareVMService
    public final HashMap<String, ae> a() {
        HashMap<String, ae> hashMap = new HashMap<>();
        hashMap.put("STORY_ENTRANCE_SIDE_BAR", new a());
        return hashMap;
    }
}
