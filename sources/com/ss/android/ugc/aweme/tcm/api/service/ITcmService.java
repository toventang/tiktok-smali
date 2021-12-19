package com.ss.android.ugc.aweme.tcm.api.service;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.web.a.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import java.util.List;

public interface ITcmService {
    static {
        Covode.recordClassIndex(90651);
    }

    int a(Context context, Activity activity, boolean z, boolean z2, boolean z3, List<? extends AVTextExtraStruct> list);

    a a(ViewGroup viewGroup, Context context);

    b a(ViewStub viewStub);

    void a(Activity activity, boolean z);

    void a(Context context, a aVar, i iVar);

    void a(Context context, Aweme aweme);

    void a(ViewStub viewStub, ax.a aVar);

    void a(com.ss.android.ugc.aweme.tcm.api.a.a aVar);

    boolean a();

    boolean a(Activity activity, Context context, boolean z, List<? extends AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA);

    boolean a(Aweme aweme, String str);

    String b();

    void b(Context context, Aweme aweme);

    boolean b(Aweme aweme, String str);

    String c();

    String d();

    int e();

    BcAdModel f();

    boolean g();

    void h();

    TcmConfig i();
}
