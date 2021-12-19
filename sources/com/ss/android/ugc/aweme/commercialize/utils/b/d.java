package com.ss.android.ugc.aweme.commercialize.utils.b;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.ss.android.ugc.aweme.im.service.model.e;
import com.ss.android.ugc.aweme.im.service.model.g;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f75657a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(46660);
    }

    public static final class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f75658a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f75659b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f75660c;

        static {
            Covode.recordClassIndex(46661);
        }

        public final void handleMessage(Message message) {
            String str;
            l.d(message, "");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                g gVar = new g();
                gVar.commerceScene = "video";
                Aweme aweme = this.f75658a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                gVar.objectId = str;
                IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
                Context context = this.f75659b;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                createIIMServicebyMonsterPlugin.startChat(a.b.a(context, IMUser.fromUser((User) obj)).a(this.f75660c).a(gVar).f103883a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Aweme aweme, Context context, e eVar, Looper looper) {
            super(looper);
            this.f75658a = aweme;
            this.f75659b = context;
            this.f75660c = eVar;
        }
    }
}
