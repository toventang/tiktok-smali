package com.ss.android.ugc.aweme.commercialize.depend;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.c;
import com.bytedance.ies.ugc.aweme.commercialize.splash.setting.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.d;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b;
import com.ss.android.ugc.aweme.commercialize.log.ai;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend;
import com.ss.android.ugc.aweme.commercialize.utils.bs;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.im.service.model.e;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

public final class AdTaskDependImpl implements IAdTaskDepend {
    static {
        Covode.recordClassIndex(45399);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Aweme aweme) {
        return b.B(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(AwemeRawAd awemeRawAd) {
        return bs.b(awemeRawAd) || bs.c(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(String str, Context context, AwemeRawAd awemeRawAd) {
        l.d(str, "");
        l.d(context, "");
        return com.ss.android.ugc.aweme.commercialize.utils.b.a.a.a(str, context, awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, String str, String str2, String str3, String str4) {
        String b2 = com.ss.android.ugc.aweme.commercialize.im.a.b(str2);
        a aVar = new a(str, context, new e(str3, str4), Looper.getMainLooper());
        com.ss.android.ugc.aweme.profile.api.e.a();
        com.ss.android.ugc.aweme.profile.api.e.a(aVar, b2);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(boolean z, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (!z || !TextUtils.equals(str, "app")) {
            return false;
        }
        c a2 = d.a();
        List arrayList = new ArrayList();
        if (!(a2 == null || a2.f34803a == null)) {
            arrayList = Arrays.asList(a2.f34803a);
        }
        return !arrayList.contains(str2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean b() {
        return com.ss.android.ugc.aweme.commercialize.abtest.c.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final String a() {
        SharePrefCache inst = SharePrefCache.inst();
        l.b(inst, "");
        aj<String> jsActlogUrl = inst.getJsActlogUrl();
        l.b(jsActlogUrl, "");
        return jsActlogUrl.c();
    }

    public static IAdTaskDepend c() {
        MethodCollector.i(2521);
        Object a2 = com.ss.android.ugc.b.a(IAdTaskDepend.class, false);
        if (a2 != null) {
            IAdTaskDepend iAdTaskDepend = (IAdTaskDepend) a2;
            MethodCollector.o(2521);
            return iAdTaskDepend;
        }
        if (com.ss.android.ugc.b.am == null) {
            synchronized (IAdTaskDepend.class) {
                try {
                    if (com.ss.android.ugc.b.am == null) {
                        com.ss.android.ugc.b.am = new AdTaskDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2521);
                    throw th;
                }
            }
        }
        AdTaskDependImpl adTaskDependImpl = (AdTaskDependImpl) com.ss.android.ugc.b.am;
        MethodCollector.o(2521);
        return adTaskDependImpl;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final Intent a(Context context) {
        l.d(context, "");
        return new Intent(context, CrossPlatformActivity.class);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void b(Context context) {
        l.d(context, "");
        com.ss.android.ugc.aweme.commercialize.utils.b.e.a(context, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean c(String str) {
        l.d(str, "");
        return com.ss.android.ugc.aweme.commercialize.im.a.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void d(String str) {
        l.d(str, "");
        ai.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean b(String str) {
        l.d(str, "");
        return t.a(t.a(), str);
    }

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f73775a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f73776b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f73777c;

        static {
            Covode.recordClassIndex(45400);
        }

        public final void handleMessage(Message message) {
            l.d(message, "");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                g gVar = new g();
                gVar.commerceScene = "video";
                gVar.objectId = this.f73775a;
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Context context = this.f73776b;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                createIIMServicebyMonsterPlugin.startChat(a.b.a(context, IMUser.fromUser((User) obj)).a(this.f73777c).a(gVar).f103883a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String str, Context context, e eVar, Looper looper) {
            super(looper);
            this.f73775a = str;
            this.f73776b = context;
            this.f73777c = eVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void a(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.commercialize.utils.b.e.a(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, int i2) {
        l.d(context, "");
        return n.a(context, i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        return com.ss.android.ugc.aweme.commercialize.utils.b.b.a(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, String str, String str2) {
        return d.a.a(context, str, (String) null, false);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final JSONObject a(Context context, Aweme aweme, String str) {
        l.d(context, "");
        l.d(aweme, "");
        l.d(str, "");
        return j.a(context, aweme, false, (Map<String, String>) null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void a(Context context, int i2, int i3) {
        l.d(context, "");
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    new com.bytedance.tux.g.b(activity).e(i2).b();
                    return;
                }
                return;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final void a(Context context, String str, String str2, Bundle bundle) {
        l.d(context, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.bullet.b.a(context, str, str2, bundle);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend
    public final boolean a(Context context, AwemeRawAd awemeRawAd, String str, String str2, String str3, int i2) {
        l.d(context, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return w.a(new b.a().a(context).a(awemeRawAd).a(str).b(str2).c(str3).b(i2));
    }
}
