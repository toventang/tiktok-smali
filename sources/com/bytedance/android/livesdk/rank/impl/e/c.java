package com.bytedance.android.livesdk.rank.impl.e;

import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.db;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.bb;
import com.bytedance.android.livesdk.model.message.av;
import com.bytedance.android.livesdk.model.message.bt;
import com.bytedance.android.livesdk.rank.api.c;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Map;

public final class c implements com.bytedance.android.livesdk.rank.api.c, OnMessageListener {

    /* renamed from: b  reason: collision with root package name */
    private final h f20695b = i.a((h.f.a.a) a.f20697a);

    /* renamed from: c  reason: collision with root package name */
    private androidx.fragment.app.i f20696c;

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f20701a = new e();

        static {
            Covode.recordClassIndex(12238);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12233);
    }

    private final IMessageManager e() {
        return (IMessageManager) this.f20695b.getValue();
    }

    static final class a extends m implements h.f.a.a<IMessageManager> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20697a = new a();

        static {
            Covode.recordClassIndex(12234);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IMessageManager invoke() {
            return ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.c
    public final void b() {
        IMessageManager e2 = e();
        if (e2 != null) {
            e2.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.RANK_TOAST_MESSAGE.getIntType(), this);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.c
    public final boolean d() {
        Long l2 = (Long) DataChannelGlobal.f34575d.b(db.class);
        if (l2 == null || l2.longValue() <= com.bytedance.android.livesdk.rank.api.i.RANKINGS_SWITCH_STATUS_HIDE.getValue()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.rank.api.c
    public final void c() {
        ((UserApi) com.bytedance.android.live.network.e.a().a(UserApi.class)).getUserAttr("6").a(new com.bytedance.android.livesdk.util.rxutils.f()).a(d.f20700a, e.f20701a);
    }

    @Override // com.bytedance.android.livesdk.rank.api.c
    public final void a() {
        IMessageManager e2 = e();
        if (e2 != null) {
            e2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.RANK_TOAST_MESSAGE.getIntType(), this);
        }
        IMessageManager e3 = e();
        if (e3 != null) {
            e3.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LOCAL_LIVE_PLAY_ORIENTATION_CHANGED_MESSAGE.getIntType(), this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.rank.impl.e.c$c  reason: collision with other inner class name */
    public static final class C0419c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.b f20699a;

        static {
            Covode.recordClassIndex(12236);
        }

        C0419c(c.b bVar) {
            this.f20699a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f20699a.b();
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.c
    public final void a(androidx.fragment.app.i iVar) {
        l.d(iVar, "");
        this.f20696c = iVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.b f20698a;

        static {
            Covode.recordClassIndex(12235);
        }

        b(c.b bVar) {
            this.f20698a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (((com.bytedance.android.live.network.response.d) obj).statusCode == 0) {
                this.f20698a.a();
            } else {
                this.f20698a.b();
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f20700a = new d();

        static {
            Covode.recordClassIndex(12237);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long value;
            Map<Long, Long> map;
            Long l2;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            if (dVar.statusCode == 0) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
                bb bbVar = (bb) dVar.data;
                if (bbVar == null || (map = bbVar.f19033a) == null || (l2 = map.get(6L)) == null) {
                    value = com.bytedance.android.livesdk.rank.api.i.RANKINGS_SWITCH_STATUS_ON.getValue();
                } else {
                    value = l2.longValue();
                }
                dataChannelGlobal.a(db.class, Long.valueOf(value));
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        androidx.fragment.app.i iVar;
        Boolean bool;
        androidx.fragment.app.i iVar2;
        if (iMessage instanceof bt) {
            bt.a aVar = ((bt) iMessage).f19363a;
            if (aVar != null) {
                bool = Boolean.valueOf(aVar.f19365b);
            } else {
                bool = null;
            }
            if (p.a(bool) && (iVar2 = this.f20696c) != null) {
                if (y.f()) {
                    com.bytedance.android.livesdk.rank.impl.b bVar = new com.bytedance.android.livesdk.rank.impl.b();
                    String str = com.bytedance.android.livesdk.rank.impl.b.f20650a;
                    l.b(str, "");
                    bVar.show(iVar2, str);
                    return;
                }
                c.a.f20585a = true;
            }
        } else if ((iMessage instanceof av) && ((av) iMessage).f19213a && c.a.f20585a && (iVar = this.f20696c) != null) {
            com.bytedance.android.livesdk.rank.impl.b bVar2 = new com.bytedance.android.livesdk.rank.impl.b();
            String str2 = com.bytedance.android.livesdk.rank.impl.b.f20650a;
            l.b(str2, "");
            bVar2.show(iVar, str2);
            c.a.f20585a = false;
        }
    }

    static final class g implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20708a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.b f20709b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DataChannel f20710c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f20711d;

        static {
            Covode.recordClassIndex(12240);
        }

        g(c cVar, c.b bVar, DataChannel dataChannel, String str) {
            this.f20708a = cVar;
            this.f20709b = bVar;
            this.f20710c = dataChannel;
            this.f20711d = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            c.a("livesdk_turn_on_ranking_popup_click", this.f20710c, this.f20711d).a("button_click_type", "cancel").b();
        }
    }

    static final class f implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f20702a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f20703b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f20704c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c.b f20705d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ DataChannel f20706e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f20707f;

        static {
            Covode.recordClassIndex(12239);
        }

        f(c cVar, long j2, long j3, c.b bVar, DataChannel dataChannel, String str) {
            this.f20702a = cVar;
            this.f20703b = j2;
            this.f20704c = j3;
            this.f20705d = bVar;
            this.f20706e = dataChannel;
            this.f20707f = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
            c.a(this.f20703b, this.f20704c, this.f20705d);
            c.a("livesdk_turn_on_ranking_popup_click", this.f20706e, this.f20707f).a("button_click_type", "turn_on").b();
        }
    }

    public static com.bytedance.android.livesdk.ab.b a(String str, DataChannel dataChannel, String str2) {
        return b.a.a(str).a(dataChannel).a("enter_from", "live_page").a("user_type", str2);
    }

    public static void a(long j2, long j3, c.b bVar) {
        ((UserApi) com.bytedance.android.live.network.e.a().a(UserApi.class)).updateSwitch(j2, j3).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new b(bVar), new C0419c(bVar));
    }

    @Override // com.bytedance.android.livesdk.rank.api.c
    public final void a(Context context, long j2, long j3, DataChannel dataChannel, String str, c.b bVar) {
        l.d(str, "");
        l.d(bVar, "");
        if (context != null) {
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            com.bytedance.android.live.base.model.user.b a2 = b2.a();
            l.b(a2, "");
            if (a2.getSecret() == 1 && j3 == com.bytedance.android.livesdk.rank.api.i.RANKINGS_SWITCH_STATUS_ON.getValue()) {
                b.a b3 = new b.a(context).a(R.string.e78).b(R.string.e7a).a(R.string.eca, (DialogInterface.OnClickListener) new f(this, j2, j3, bVar, dataChannel, str), false).b(R.string.e7_, (DialogInterface.OnClickListener) new g(this, bVar, dataChannel, str), false);
                b3.f18296m = false;
                b3.a().show();
                a("livesdk_turn_on_ranking_popup_show", dataChannel, str).b();
                return;
            }
        }
        a(j2, j3, bVar);
    }
}
