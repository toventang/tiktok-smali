package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.c;
import java.util.ArrayList;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(84978);
    }

    int a(int i2, int i3);

    int a(MvImageChooseAdapter.MyMediaModel myMediaModel, boolean z, boolean z2);

    List<MvImageChooseAdapter.MyMediaModel> a();

    void a(int i2);

    void a(View view);

    void a(View view, String str);

    void a(c cVar);

    void a(boolean z);

    View b(int i2);

    CutSameVideoImageExtraData b();

    void b(int i2, int i3);

    View c();

    void d();

    ArrayList<MvImageChooseAdapter.MyMediaModel> e();

    View f();
}
