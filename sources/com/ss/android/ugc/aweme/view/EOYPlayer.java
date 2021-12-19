package com.ss.android.ugc.aweme.view;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.m;
import com.lynx.tasm.behavior.o;
import com.lynx.tasm.behavior.p;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.view.e;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import org.greenrobot.eventbus.EventBus;

@o
public final class EOYPlayer extends UISimpleView<e> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144017a = new a((byte) 0);

    static {
        Covode.recordClassIndex(94233);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94236);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public EOYPlayer(j jVar) {
        super(jVar);
    }

    @m(a = "muted")
    public final void setMuted(boolean z) {
        ((e) this.mView).setMuted(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final /* synthetic */ View createView(Context context) {
        if (context == null) {
            l.b();
        }
        return new e(context, (byte) 0);
    }

    @m(a = "play")
    public final void switchPlay(boolean z) {
        if (z) {
            try {
                ((e) this.mView).a();
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
                return;
            }
        } else {
            ((e) this.mView).b();
        }
        q.m223constructorimpl(z.f158842a);
    }

    @m(a = "src")
    public final void setSrc(com.lynx.react.bridge.a aVar) {
        l.d(aVar, "");
        ReadableType h2 = aVar.h();
        if (h2 != null && d.f144197a[h2.ordinal()] == 1) {
            String e2 = aVar.e();
            l.b(e2, "");
            if (e2.length() > 0) {
                String e3 = aVar.e();
                l.b(e3, "");
                Aweme a2 = com.ss.android.ugc.aweme.util.j.a(e3);
                if (a2 != null) {
                    ((e) this.mView).setSrc(a2);
                    return;
                }
                return;
            }
            return;
        }
        aVar.h().name();
    }

    @p
    public final void click(ReadableMap readableMap, Callback callback) {
        e currentActivity$eoy_release;
        l.d(readableMap, "");
        l.d(callback, "");
        e eVar = (e) this.mView;
        String string = readableMap.getString("question_text");
        Aweme aweme = eVar.f144207b;
        if (aweme != null && (currentActivity$eoy_release = eVar.getCurrentActivity$eoy_release()) != null) {
            i iVar = eVar.getMPlayVideoHelper().f112580a;
            l.b(iVar, "");
            eVar.f144206a = iVar.o();
            h a2 = h.a();
            l.b(a2, "");
            a2.f93338a = eVar.getMPlayVideoHelper().f112580a;
            h a3 = h.a();
            l.b(a3, "");
            i iVar2 = eVar.getMPlayVideoHelper().f112580a;
            l.b(iVar2, "");
            a3.f93340c = iVar2.n();
            h a4 = h.a();
            l.b(a4, "");
            a4.f93344g = false;
            SmartRoute withParam = SmartRouter.buildRoute(currentActivity$eoy_release, "aweme://aweme/detail/").withParam("id", aweme.getAid());
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            SmartRoute withParam2 = withParam.withParam("userid", g2.getCurUserId()).withParam("enter_from", "eoy_hub").withParam("video_from", "eoy_detail");
            if (!(string == null || string.length() == 0)) {
                withParam2.withParam("question_content", string);
                withParam2.withParam("show_answer_question_button", 1);
            }
            SmartRoute withParam3 = withParam2.withParam("video_type", 28);
            if (!EventBus.a().a(eVar)) {
                EventBus.a(EventBus.a(), eVar);
            }
            withParam3.open(10086, new e.d(eVar));
        }
    }
}
