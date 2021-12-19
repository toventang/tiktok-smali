package com.ss.android.ugc.aweme.recommend;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.widget.b;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public interface d {
    static {
        Covode.recordClassIndex(78039);
    }

    void a(b bVar);

    void a(List<? extends User> list, int i2);

    void setEnterFrom(String str);

    void setOutClickListener(View.OnClickListener onClickListener);
}
