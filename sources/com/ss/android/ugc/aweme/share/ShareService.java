package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LiveEvent;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.profile.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.bar.ShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.ss.android.ugc.aweme.sharer.ui.f;
import com.ss.android.ugc.aweme.sharer.ui.g;
import com.ss.android.ugc.aweme.sharer.ui.i;
import java.util.List;

public interface ShareService {

    public static final class a {
        static {
            Covode.recordClassIndex(80969);
        }
    }

    static {
        Covode.recordClassIndex(80968);
    }

    Dialog a(Activity activity, Fragment fragment, Aweme aweme, boolean z, s<ag> sVar, Bundle bundle);

    Dialog a(Activity activity, c cVar, b bVar);

    com.ss.android.ugc.aweme.share.c.b a(Activity activity, Aweme aweme);

    com.ss.android.ugc.aweme.share.c.b a(Activity activity, Aweme aweme, int i2);

    o a(User user, Activity activity, e eVar);

    SharePackage a(Context context, Aweme aweme, String str, String str2);

    ShareChannelBar a(Activity activity);

    i a(Activity activity, Fragment fragment, Aweme aweme, s<ag> sVar, Bundle bundle);

    void a(Activity activity, ShareInfo shareInfo, String str, String str2, g gVar);

    void a(Activity activity, Challenge challenge, List<? extends Aweme> list, String str, boolean z, String str2, String str3, String str4);

    void a(Activity activity, LiveEvent liveEvent, f fVar, com.bytedance.ies.web.a.a aVar);

    void a(Activity activity, Music music, g gVar, List<? extends Aweme> list, String str);

    void a(Activity activity, com.ss.android.ugc.aweme.qna.model.b bVar, g gVar, String str);

    void a(Activity activity, com.ss.android.ugc.aweme.sticker.model.g gVar, String str, List<? extends Aweme> list, String str2);

    void a(Context context);

    void a(Context context, boolean z);

    void a(Handler handler, Activity activity, User user, List<? extends Aweme> list);

    void a(e.b bVar, Activity activity, boolean z);

    boolean a();

    boolean a(Aweme aweme);

    boolean a(com.ss.android.ugc.aweme.shortvideo.c cVar, String str);

    boolean a(String str, String str2, Context context);

    Dialog b(Activity activity, Fragment fragment, Aweme aweme, s<ag> sVar, Bundle bundle);

    Dialog b(Activity activity, c cVar, b bVar);

    bg b();

    void b(Activity activity);

    com.ss.android.ugc.aweme.share.d.f c();

    SharePackage c(Activity activity, c cVar, b bVar);
}
