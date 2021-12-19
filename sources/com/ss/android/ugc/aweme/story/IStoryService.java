package com.ss.android.ugc.aweme.story;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ag;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.bi;
import com.ss.android.ugc.aweme.cd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.avatar.c;
import com.ss.android.ugc.aweme.story.f.a;
import com.ss.android.ugc.playerkit.videoview.k;
import f.a.t;
import h.f.a.b;

public interface IStoryService {
    static {
        Covode.recordClassIndex(89277);
    }

    bi a(ViewGroup viewGroup, k kVar, cd cdVar, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, b<? super String, ? extends View> bVar);

    IStoryViewerListViewModel a(e eVar, ag agVar);

    a a(String str, String str2);

    t<BaseResponse> a(String str, int i2);

    Object a(cd cdVar);

    void a(int i2);

    void a(e eVar);

    void a(e eVar, String str);

    void a(e eVar, String str, Aweme aweme);

    void a(String str, Aweme aweme);

    void a(int[] iArr);

    boolean a();

    boolean a(Aweme aweme);

    boolean a(String str);

    int b();

    b b(String str);

    b b(String str, String str2);

    Object b(cd cdVar);

    int c();

    Object c(cd cdVar);

    void c(String str);

    c d();

    com.ss.android.ugc.aweme.story.api.b e();

    com.ss.android.ugc.aweme.story.publish.a f();

    void g();

    int[] h();

    boolean i();

    void j();

    int k();
}
