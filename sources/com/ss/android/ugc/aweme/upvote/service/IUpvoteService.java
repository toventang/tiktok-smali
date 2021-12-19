package com.ss.android.ugc.aweme.upvote.service;

import android.widget.FrameLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.upvote.a.a;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.g;
import h.z;
import java.util.List;

public interface IUpvoteService {
    static {
        Covode.recordClassIndex(93079);
    }

    int a();

    AssemViewModel<g> a(e eVar);

    a a(FrameLayout frameLayout, m mVar);

    List<h> a(String str);

    void a(com.bytedance.assem.arch.viewModel.h hVar, com.ss.android.ugc.aweme.upvote.publish.a aVar);

    void a(String str, int i2);

    void a(String str, UpvotePublishMobParam upvotePublishMobParam);

    void a(String str, boolean z, UpvotePublishMobParam upvotePublishMobParam, h.f.a.a<z> aVar);

    void a(List<? extends Aweme> list);

    Integer b(String str);

    void b();

    com.ss.android.ugc.aweme.upvote.event.a c(String str);

    void c();
}
