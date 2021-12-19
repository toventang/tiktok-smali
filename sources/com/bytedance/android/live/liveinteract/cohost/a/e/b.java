package com.bytedance.android.live.liveinteract.cohost.a.e;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.af;
import com.bytedance.android.live.liveinteract.api.c.e;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.cohost.a.b.i;
import com.bytedance.android.live.liveinteract.cohost.ui.b.d;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import f.a.d.f;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class b {
    static {
        Covode.recordClassIndex(5340);
    }

    public static final class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f10165a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.platform.a.c f10166b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.api.b.c f10167c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f10168d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ m f10169e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f10170f;

        static {
            Covode.recordClassIndex(5343);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void a() {
            this.f10165a.c(com.bytedance.android.live.liveinteract.cohost.a.b.b.class);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.ui.b.d.a
        public final void b() {
            b.a(this.f10166b, this.f10165a, this.f10167c, this.f10168d, this.f10169e, this.f10170f);
        }

        public c(DataChannel dataChannel, com.bytedance.android.live.liveinteract.platform.a.c cVar, com.bytedance.android.live.liveinteract.api.b.c cVar2, long j2, m mVar, d dVar) {
            this.f10165a = dataChannel;
            this.f10166b = cVar;
            this.f10167c = cVar2;
            this.f10168d = j2;
            this.f10169e = mVar;
            this.f10170f = dVar;
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f10171a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f10172b;

        static {
            Covode.recordClassIndex(5344);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.e.a
        public final void a() {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.b(true, 200, "Success"));
            this.f10171a.c(af.class);
        }

        @Override // com.bytedance.android.live.liveinteract.cohost.a.e.a
        public final void a(Throwable th) {
            int i2;
            String str;
            Context context = (Context) this.f10172b.get();
            if (th instanceof com.bytedance.android.live.a.a.a) {
                i2 = ((com.bytedance.android.live.a.a.a) th).getErrorCode();
            } else {
                i2 = 0;
            }
            String str2 = "";
            if (context != null) {
                if (th != null) {
                    if (th instanceof com.bytedance.android.live.a.a.b.a) {
                        com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
                        str = aVar.getAlert();
                        String prompt = aVar.getPrompt();
                        if (TextUtils.isEmpty(str)) {
                            if (!TextUtils.isEmpty(prompt)) {
                                str = prompt;
                            }
                        }
                    } else {
                        str = context.getString(R.string.gme);
                    }
                    l.b(str, str2);
                    str2 = str;
                }
                str = str2;
                l.b(str, str2);
                str2 = str;
            }
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.live.liveinteract.api.b.b(false, i2, str2));
        }

        public d(DataChannel dataChannel, WeakReference weakReference) {
            this.f10171a = dataChannel;
            this.f10172b = weakReference;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.e.b$b  reason: collision with other inner class name */
    public static final class C0164b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10164a;

        static {
            Covode.recordClassIndex(5342);
        }

        C0164b(a aVar) {
            this.f10164a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f10164a.a((Throwable) obj);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10163a;

        static {
            Covode.recordClassIndex(5341);
        }

        a(a aVar) {
            this.f10163a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.platform.a.c.a aVar = (com.bytedance.android.live.liveinteract.platform.a.c.a) obj;
            this.f10163a.a();
            if (aVar.f11883a instanceof com.bytedance.android.live.network.response.d) {
                Object obj2 = aVar.f11883a;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.live.network.response.Response<com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult>");
                com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj2;
                if (dVar != null) {
                    Object obj3 = dVar.data;
                }
            }
        }
    }

    public static final void a(com.bytedance.android.live.liveinteract.platform.a.c cVar, DataChannel dataChannel, com.bytedance.android.live.liveinteract.api.b.c cVar2, long j2, m mVar, a aVar) {
        ab<com.bytedance.android.live.liveinteract.platform.a.c.a> a2;
        ac acVar;
        l.d(cVar, "");
        l.d(dataChannel, "");
        l.d(cVar2, "");
        l.d(mVar, "");
        l.d(aVar, "");
        e.f10014a.a(new com.bytedance.android.live.liveinteract.cohost.c.a(), null);
        com.bytedance.android.live.liveinteract.platform.a.a.b bVar = new com.bytedance.android.live.liveinteract.platform.a.a.b();
        bVar.f11858b = true;
        bVar.f11859c = true;
        com.bytedance.android.live.liveinteract.api.a.b a3 = b.a.a();
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        cVar.a(b2.c(), a.EnumC0247a.COHOST, dataChannel, bVar);
        a3.af = true;
        a3.q = true;
        a3.f9937b = true;
        a3.f9941f = Long.parseLong(cVar2.f9968a);
        a3.f9942g = cVar2.f9969b;
        User user = new User();
        user.displayId = cVar2.f9971d;
        List<String> list = cVar2.f9973f;
        if (list != null && !list.isEmpty()) {
            ImageModel imageModel = new ImageModel();
            imageModel.mUrls = cVar2.f9973f;
            user.setAvatarThumb(imageModel);
        }
        a3.T = user;
        a3.f9944i = Long.parseLong(cVar2.f9970c);
        a3.f9943h = j2;
        a3.b(k.INVITING);
        dataChannel.c(i.class);
        a3.p = cVar2.f9972e;
        HashMap hashMap = new HashMap();
        Room room = new Room();
        User user2 = new User();
        user2.setIdStr(cVar2.f9968a);
        room.setOwner(user2);
        room.setIdStr(cVar2.f9970c);
        h.a(room, b.a.a().p, b.a.a().x);
        b.a.a().S = System.currentTimeMillis();
        com.bytedance.android.live.liveinteract.platform.a.b a4 = cVar.a();
        if (a4 != null && (a2 = a4.a(hashMap)) != null && (acVar = (ac) a2.a(com.bytedance.android.livesdk.util.rxutils.autodispose.e.a(mVar))) != null) {
            acVar.a(new a(aVar), new C0164b(aVar));
        }
    }
}
