package com.ss.android.ugc.aweme.recommend.users;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.recommend.a;
import com.ss.android.ugc.aweme.recommend.b;
import com.ss.android.ugc.aweme.recommend.d;
import java.util.HashMap;

public interface RecommendUserService {
    static {
        Covode.recordClassIndex(78075);
    }

    View a(Context context, HashMap<String, Boolean> hashMap);

    Fragment a();

    InboxAdapterWidget a(Fragment fragment, LiveData<InboxAdapterWidget.b> liveData);

    a a(Context context, int i2);

    b a(Context context);

    d b(Context context);
}
