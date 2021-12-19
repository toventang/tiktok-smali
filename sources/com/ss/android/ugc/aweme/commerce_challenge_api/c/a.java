package com.ss.android.ugc.aweme.commerce_challenge_api.c;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(45248);
    }

    void a(float f2);

    void a(View view);

    void a(ViewStub viewStub);

    void a(FrameLayout frameLayout, com.ss.android.ugc.aweme.commerce_challenge_api.b.a aVar);

    void a(TextView textView);

    void a(Challenge challenge, String str, List<? extends Aweme> list);

    void a(CheckableImageView checkableImageView);

    void b(ViewStub viewStub);

    void c(ViewStub viewStub);

    void d(ViewStub viewStub);
}
