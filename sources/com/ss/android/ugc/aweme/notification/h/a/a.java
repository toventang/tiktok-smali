package com.ss.android.ugc.aweme.notification.h.a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.view.template.c;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public interface a {
    static {
        Covode.recordClassIndex(72975);
    }

    void a(User user, String str);

    void b(TextView textView, List<? extends User> list, Integer num, BaseNotice baseNotice, String str);

    void c(String str, String str2, String str3);

    void d(int i2);

    List<c> h();

    String i();

    String j();

    boolean k();

    int l();

    String m();

    void n();

    void o();

    View.OnLongClickListener p();

    String q();

    void r();
}
