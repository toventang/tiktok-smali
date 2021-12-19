package com.ss.android.ugc.aweme.common;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.io.File;
import java.util.Objects;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    static final Handler f76491a = new Handler();

    /* renamed from: b  reason: collision with root package name */
    public static final w f76492b = new w();

    private w() {
    }

    /* access modifiers changed from: package-private */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ File f76493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f76494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f76495c;

        static {
            Covode.recordClassIndex(47239);
        }

        a(File file, m mVar, int i2) {
            this.f76493a = file;
            this.f76494b = mVar;
            this.f76495c = i2;
        }

        public final void run() {
            w.a(this.f76493a, this.f76494b, this.f76495c + 1);
        }
    }

    static {
        Covode.recordClassIndex(47238);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements WeakHandler.IHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f76496a;

        static {
            Covode.recordClassIndex(47240);
        }

        b(m mVar) {
            this.f76496a = mVar;
        }

        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            w.f76491a.removeCallbacksAndMessages(null);
            if (message.obj instanceof AvatarUri) {
                m mVar = this.f76496a;
                Object obj = message.obj;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
                mVar.invoke(obj, false);
                return;
            }
            this.f76496a.invoke(null, true);
        }
    }

    public static void a(File file, m<? super AvatarUri, ? super Boolean, z> mVar, int i2) {
        l.d(file, "");
        l.d(mVar, "");
        if (i2 > 2) {
            mVar.invoke(null, true);
            return;
        }
        int length = (int) (((file.length() / 1024) + 1) * 1024);
        StringBuilder append = new StringBuilder().append(Api.f66570e.toString()).append("?uid=");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        String sb = append.append(g2.getCurUserId()).toString();
        b bVar = new b(mVar);
        f76491a.postDelayed(new a(file, mVar, i2), 7000);
        com.ss.android.ugc.aweme.account.b.g().uploadAvatar(new WeakHandler(bVar), sb, length, file.getPath(), null);
    }
}
