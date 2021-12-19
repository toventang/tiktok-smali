package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.content.Context;
import android.view.ViewStub;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBADetagBA;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAHideLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAShowLoading;
import com.ss.android.ugc.aweme.shortvideo.model.CheckBAToPublish;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import java.util.List;

public interface ai extends s {

    public interface a {
        static {
            Covode.recordClassIndex(74521);
        }
    }

    static {
        Covode.recordClassIndex(74520);
    }

    int a(Context context, Activity activity, Boolean bool, Boolean bool2, Boolean bool3, List<AVTextExtraStruct> list);

    a a();

    Mission a(String str);

    Boolean a(Activity activity, Context context, Boolean bool, List<AVTextExtraStruct> list, CheckBAShowLoading checkBAShowLoading, CheckBAHideLoading checkBAHideLoading, CheckBAToPublish checkBAToPublish, CheckBADetagBA checkBADetagBA);

    String a(c cVar);

    String a(String str, Mission mission);

    String a(String str, String str2);

    String a(String str, boolean z);

    void a(Activity activity, boolean z);

    void a(ViewStub viewStub, ax.a aVar);

    Boolean b();

    BcAdModel c();

    String d();

    boolean e();

    void f();

    int g();

    String h();

    boolean j();
}
