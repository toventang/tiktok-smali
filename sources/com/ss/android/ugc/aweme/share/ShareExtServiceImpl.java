package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.tux.c.e;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.setting.bi;
import com.ss.android.ugc.aweme.setting.cf;
import com.ss.android.ugc.aweme.share.b.a;
import com.ss.android.ugc.aweme.share.i.a;
import com.ss.android.ugc.aweme.share.improve.a;
import com.ss.android.ugc.aweme.share.improve.a.aw;
import com.ss.android.ugc.aweme.share.improve.a.j;
import com.ss.android.ugc.aweme.share.improve.a.k;
import com.ss.android.ugc.aweme.sharer.ui.h;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class ShareExtServiceImpl extends j {
    static {
        Covode.recordClassIndex(80960);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        if (r5 != null) goto L_0x0039;
     */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.shortvideo.j.f r21, android.app.Activity r22) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareExtServiceImpl.a(com.ss.android.ugc.aweme.shortvideo.j.f, android.app.Activity):boolean");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final bi a() {
        return new cf();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String c() {
        String a2 = d.c().a("last_share_way", "outside_channel");
        l.b(a2, "");
        return a2;
    }

    public static ShareExtService e() {
        MethodCollector.i(12407);
        Object a2 = b.a(ShareExtService.class, false);
        if (a2 != null) {
            ShareExtService shareExtService = (ShareExtService) a2;
            MethodCollector.o(12407);
            return shareExtService;
        }
        if (b.dU == null) {
            synchronized (ShareExtService.class) {
                try {
                    if (b.dU == null) {
                        b.dU = new ShareExtServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12407);
                    throw th;
                }
            }
        }
        j jVar = (j) b.dU;
        MethodCollector.o(12407);
        return jVar;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String d() {
        String[] a2;
        a a3 = a.a();
        if (a3.c() == 0 || (a2 = a3.a(a3.d(), 100)) == null || a2.length <= 0) {
            return null;
        }
        for (String str : a2) {
            com.ss.android.ugc.aweme.sharer.b bVar = a.C3201a.a(str, f.j());
            if (bVar != null && bVar.b(com.bytedance.ies.ugc.appcontext.d.a())) {
                return str;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String[] b() {
        String[] strArr;
        l.b(com.ss.android.ugc.aweme.share.i.a.a(), "");
        if (com.ss.android.ugc.aweme.share.gif.a.f123501a == null || com.ss.android.ugc.aweme.share.gif.a.f123501a.isEmpty()) {
            strArr = new String[0];
        } else {
            ArrayList arrayList = new ArrayList();
            for (ag agVar : com.ss.android.ugc.aweme.share.gif.a.f123501a) {
                arrayList.add(agVar.f123339a);
            }
            if (!IMAdapterServiceImpl.d().a()) {
                arrayList.remove("chat_merge");
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        }
        l.b(strArr, "");
        return strArr;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void a(String str) {
        l.d(str, "");
        l.d(str, "");
        com.bytedance.apm.b.a("save_video_success_rate", 4, new c().a("errorDesc", "url is illegal").a("url", str).a());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String b(Activity activity) {
        com.ss.android.ugc.aweme.sharer.b a2;
        l.d(activity, "");
        com.ss.android.ugc.aweme.share.i.a.a();
        String c2 = ai.c();
        String str = "download";
        if (!TextUtils.equals(c2, str)) {
            if ("more".equalsIgnoreCase(c2)) {
                c2 = "";
            }
            com.ss.android.ugc.aweme.sharer.b a3 = a.C3201a.a(c2, activity);
            if (a3 == null || !a3.b(activity)) {
                List asList = Arrays.asList(com.ss.android.ugc.aweme.share.i.a.a().b());
                if (!com.bytedance.common.utility.collection.b.a((Collection) asList)) {
                    Iterator it = asList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str2 = (String) it.next();
                        if (!TextUtils.equals(str2, "chat_merge") && (a2 = a.C3201a.a(str2, activity)) != null && a2.b(activity)) {
                            str = a2.a();
                            break;
                        }
                    }
                }
                str = "more";
            } else {
                str = c2;
            }
        }
        l.b(str, "");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable a(Activity activity) {
        Drawable a2;
        com.ss.android.ugc.aweme.sharer.b a3;
        l.d(activity, "");
        com.ss.android.ugc.aweme.share.i.a.a();
        String c2 = ai.c();
        if (TextUtils.equals(c2, "download")) {
            com.bytedance.tux.c.b bVar = new com.bytedance.tux.c.b(activity, R.raw.icon_2pt_arrow_to_bottom);
            bVar.a(activity, R.attr.bc);
            int b2 = com.bytedance.tux.h.f.b(32);
            bVar.a(b2);
            bVar.b(b2);
            e eVar = new e();
            int b3 = com.bytedance.tux.h.f.b(48);
            eVar.f44782h = b3;
            eVar.f44781g = b3;
            eVar.f44777c = Float.valueOf(((float) b3) / 2.0f);
            eVar.f44780f = Integer.valueOf((int) R.attr.bc);
            eVar.f44778d = Integer.valueOf(com.bytedance.tux.h.f.b(1));
            eVar.f44776b = Integer.valueOf((int) R.attr.f159902m);
            a2 = new LayerDrawable(new Drawable[]{eVar.a(activity), bVar});
        } else {
            if ("more".equalsIgnoreCase(c2)) {
                c2 = "";
            }
            com.ss.android.ugc.aweme.sharer.b a4 = a.C3201a.a(c2, activity);
            if (a4 == null || !a4.b(activity)) {
                List asList = Arrays.asList(com.ss.android.ugc.aweme.share.i.a.a().b());
                if (!com.bytedance.common.utility.collection.b.a((Collection) asList)) {
                    Iterator it = asList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str = (String) it.next();
                        if (!TextUtils.equals(str, "chat_merge") && (a3 = a.C3201a.a(str, activity)) != null && a3.b(activity)) {
                            a2 = a3.a(activity);
                            break;
                        }
                    }
                }
                com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
                aVar.f44749a = R.raw.icon_color_ellipsis_circle;
                a2 = aVar.a(activity);
            } else {
                a2 = a4.a(activity);
            }
        }
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable a(Activity activity, String str) {
        l.d(activity, "");
        com.ss.android.ugc.aweme.sharer.b a2 = a.C3201a.a(str, activity);
        if (a2 != null) {
            return a2.a(activity);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void a(String str, int i2) {
        l.d(str, "");
        com.ss.android.ugc.aweme.share.i.a.a().a(str, i2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean a(Aweme aweme, Context context) {
        l.d(context, "");
        return aw.a(aweme, context);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final h a(Aweme aweme, String str, String str2) {
        l.d(aweme, "");
        if (str == null) {
            str = "";
        }
        return new j(aweme, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void a(String str, Aweme aweme, Bundle bundle) {
        l.d(str, "");
        a.C3194a.a(str, aweme, bundle);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final h a(Activity activity, Aweme aweme, String str, String str2) {
        String str3 = str;
        String str4 = "";
        l.d(activity, str4);
        l.d(aweme, str4);
        if (str3 == null) {
            str3 = str4;
        }
        if (str2 != null) {
            str4 = str2;
        }
        return new k(activity, aweme, str3, str4, "");
    }
}
