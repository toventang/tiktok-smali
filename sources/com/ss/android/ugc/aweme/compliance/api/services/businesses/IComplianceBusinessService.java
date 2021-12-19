package com.ss.android.ugc.aweme.compliance.api.services.businesses;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.compliance.api.c.c;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.z;
import java.util.List;

public interface IComplianceBusinessService {

    public static final class a {
        static {
            Covode.recordClassIndex(47380);
        }
    }

    static {
        Covode.recordClassIndex(47379);
    }

    View a(Context context, ViewGroup viewGroup);

    c a(Activity activity);

    o a(int i2, String str);

    Object a();

    void a(int i2, h.f.a.a<z> aVar);

    void a(Activity activity, Aweme aweme, Comment comment);

    List<String> b();

    boolean c();

    String d();

    String e();

    String f();

    boolean g();

    int h();

    int i();

    Object j();
}
