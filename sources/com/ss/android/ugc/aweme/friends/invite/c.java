package com.ss.android.ugc.aweme.friends.invite;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.inbox.widget.b;

public interface c {
    static {
        Covode.recordClassIndex(61491);
    }

    void a();

    void a(View.OnClickListener onClickListener);

    void a(DmtStatusView dmtStatusView, RemoteImageView remoteImageView, TextView textView, TextView textView2, TuxButton tuxButton);

    void a(b bVar);

    void a(String str);

    String b();

    LiveData<Boolean> c();
}
