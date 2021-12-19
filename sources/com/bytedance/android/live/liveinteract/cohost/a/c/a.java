package com.bytedance.android.live.liveinteract.cohost.a.c;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.ak;
import com.bytedance.android.live.liveinteract.api.al;
import com.bytedance.android.live.liveinteract.api.am;
import com.bytedance.android.live.liveinteract.api.an;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.livesdk.chatroom.interact.model.g;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.ck;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.model.message.aj;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.ab;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public final class a implements OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    static DataChannel f10044a;

    /* renamed from: b  reason: collision with root package name */
    static long f10045b;

    /* renamed from: c  reason: collision with root package name */
    public static long f10046c;

    /* renamed from: d  reason: collision with root package name */
    static final f.a.b.a f10047d = new f.a.b.a();

    /* renamed from: e  reason: collision with root package name */
    static f.a.b.b f10048e;

    /* renamed from: f  reason: collision with root package name */
    static f.a.b.b f10049f;

    /* renamed from: g  reason: collision with root package name */
    static f.a.b.b f10050g;

    /* renamed from: h  reason: collision with root package name */
    static f f10051h = f.IDLE;

    /* renamed from: i  reason: collision with root package name */
    static List<AbstractC0160a> f10052i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    static com.bytedance.android.live.liveinteract.cohost.ui.b.f f10053j;

    /* renamed from: k  reason: collision with root package name */
    static com.bytedance.android.live.liveinteract.cohost.ui.b.e f10054k;

    /* renamed from: l  reason: collision with root package name */
    public static long f10055l;

    /* renamed from: m  reason: collision with root package name */
    static boolean f10056m;
    public static List<? extends ImageModel> n;
    public static g.a o;
    public static String p = "";
    public static d q = d.RANDOM_MATCH;
    public static final a r = new a();
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINKER_MANAGER")
    private static com.bytedance.android.live.liveinteract.platform.a.c s;

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.a.c.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0160a {
        static {
            Covode.recordClassIndex(5254);
        }

        public void a() {
        }

        public void a(h.p<? extends g, Long> pVar) {
            h.f.b.l.d(pVar, "");
        }

        public void b() {
        }
    }

    public enum b {
        CHANGE_PAIRING,
        DISCONNECT,
        EXIT;

        static {
            Covode.recordClassIndex(5256);
        }
    }

    public enum c {
        PREVIEW_DIALOG,
        CANCEL_DIALOG;

        static {
            Covode.recordClassIndex(5257);
        }
    }

    public enum e {
        TYPE_INVITEE_LIST_DIALOG,
        TYPE_PUBLIC_SCREEN,
        TYPE_AUTO_START_WHEN_END;

        static {
            Covode.recordClassIndex(5259);
        }
    }

    public enum f {
        IDLE,
        WAITING,
        INVITING,
        LINKING,
        LINKING_SUCCESS;

        static {
            Covode.recordClassIndex(5260);
        }
    }

    public enum g {
        COUNTDOWN_WAITING,
        TIMEOUT_WAITING;

        static {
            Covode.recordClassIndex(5261);
        }
    }

    public enum d {
        RANDOM_MATCH("random_match"),
        CHANGE_PAIRING_MATCH("change_pairing"),
        SYSTEM_REMATCH("system_rematching");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(5258);
        }

        private d(String str) {
            this.type = str;
        }
    }

    private a() {
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f10064a = new h();

        static {
            Covode.recordClassIndex(5262);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a.g();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f10065a = new i();

        static {
            Covode.recordClassIndex(5263);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a.g();
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f10084a = new y();

        static {
            Covode.recordClassIndex(5281);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public static void a() {
            for (AbstractC0160a aVar : a.f10052i) {
                aVar.a(a.i());
            }
            if (a.f10045b >= 0) {
                a.f10045b--;
            }
            a.f10046c++;
        }
    }

    public static final boolean a() {
        if (f10051h.compareTo((Enum) f.IDLE) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean b() {
        if (f10051h == f.WAITING) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        if (f10051h == f.INVITING) {
            return true;
        }
        return false;
    }

    public static final boolean d() {
        if (f10051h == f.LINKING) {
            return true;
        }
        return false;
    }

    public static final boolean e() {
        if (f10051h == f.WAITING || f10051h == f.INVITING) {
            return true;
        }
        return false;
    }

    public static final boolean f() {
        if (f10051h == f.LINKING_SUCCESS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f10066a = new j();

        static {
            Covode.recordClassIndex(5264);
        }

        j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            DataChannel dataChannel = a.f10044a;
            if (dataChannel != null) {
                dataChannel.c(ak.class, false);
            }
            a.g();
            b.a.a().e("Random_Link_Waiting");
            return h.z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(5253);
    }

    public static h.p<g, Long> i() {
        if (f10045b >= 0) {
            return new h.p<>(g.COUNTDOWN_WAITING, Long.valueOf(f10045b));
        }
        return new h.p<>(g.TIMEOUT_WAITING, Long.valueOf(f10046c));
    }

    public static final void g() {
        IMessageManager iMessageManager;
        DataChannel dataChannel = f10044a;
        if (dataChannel != null) {
            dataChannel.b(r);
        }
        f10047d.a();
        DataChannel dataChannel2 = f10044a;
        if (!(dataChannel2 == null || (iMessageManager = (IMessageManager) dataChannel2.b(cg.class)) == null)) {
            iMessageManager.removeMessageListener(r);
        }
        com.bytedance.android.live.liveinteract.cohost.ui.b.f fVar = f10053j;
        if (fVar != null && fVar.n()) {
            fVar.dismiss();
        }
        com.bytedance.android.live.liveinteract.cohost.ui.b.e eVar = f10054k;
        if (eVar != null && eVar.n()) {
            eVar.dismiss();
        }
        f10051h = f.IDLE;
        f10045b = 0;
        f10046c = 0;
        f10055l = 0;
        n = null;
        f.a.b.b bVar = f10048e;
        if (bVar != null) {
            bVar.dispose();
        }
        f10048e = null;
        f10044a = null;
        f10053j = null;
        f10054k = null;
        o = null;
    }

    public static void h() {
        try {
            if (f10051h.compareTo((Enum) f.IDLE) > 0) {
                int i2 = b.f10089d[f10051h.ordinal()];
                if (i2 == 1) {
                    j jVar = j.f10066a;
                    a(jVar, jVar);
                } else if (i2 == 2 || i2 == 3) {
                    DataChannel dataChannel = f10044a;
                    if (dataChannel != null) {
                        dataChannel.c(ak.class, false);
                    }
                    a(b.EXIT);
                } else if (i2 == 4) {
                    com.bytedance.android.live.liveinteract.cohost.a.e.d.c();
                    DataChannel dataChannel2 = f10044a;
                    if (dataChannel2 != null) {
                        dataChannel2.c(ak.class, false);
                    }
                    g();
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    static final class aa<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f10057a = new aa();

        static {
            Covode.recordClassIndex(5255);
        }

        aa() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            y.a();
        }
    }

    static final class z<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final z f10085a = new z();

        static {
            Covode.recordClassIndex(5282);
        }

        z() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            y.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10067a;

        static {
            Covode.recordClassIndex(5265);
        }

        k(h.f.a.a aVar) {
            this.f10067a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f10067a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10068a;

        static {
            Covode.recordClassIndex(5266);
        }

        l(h.f.a.a aVar) {
            this.f10068a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f10068a.invoke();
        }
    }

    public static final void a(d dVar) {
        h.f.b.l.d(dVar, "");
        q = dVar;
    }

    static final class o extends h.f.b.m implements h.f.a.b<String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f10073a = new o();

        static {
            Covode.recordClassIndex(5271);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            a.h();
            return h.z.f158842a;
        }
    }

    static final class r<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final r f10076a = new r();

        static {
            Covode.recordClassIndex(5274);
        }

        r() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            b.a.a().b(com.bytedance.android.live.liveinteract.api.k.MATCH);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f10074a = new p();

        static {
            Covode.recordClassIndex(5272);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            f.a.b.b bVar = a.f10050g;
            if (bVar != null) {
                bVar.dispose();
            }
            b.a.a().b(com.bytedance.android.live.liveinteract.api.k.MATCH);
            a.f10051h = f.WAITING;
            return h.z.f158842a;
        }
    }

    static final class s<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final s f10077a = new s();

        static {
            Covode.recordClassIndex(5275);
        }

        s() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel = a.f10044a;
            if (dataChannel != null) {
                dataChannel.c(am.class, "");
            }
            a.a(b.EXIT);
            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.dzb);
        }
    }

    static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final t f10078a = new t();

        static {
            Covode.recordClassIndex(5276);
        }

        t() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel = a.f10044a;
            if (dataChannel != null) {
                dataChannel.c(am.class, "");
            }
            a.a(b.EXIT);
            ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.dzb);
        }
    }

    static final class u<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final u f10079a = new u();

        static {
            Covode.recordClassIndex(5277);
        }

        u() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (a.f10051h == f.WAITING) {
                ao.a(com.bytedance.android.live.core.f.y.e(), com.bytedance.android.live.core.f.y.a((int) R.string.du9), 0);
                a.h();
                com.bytedance.android.live.liveinteract.platform.common.g.w.a();
            }
        }
    }

    static final class v<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final v f10080a = new v();

        static {
            Covode.recordClassIndex(5278);
        }

        v() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (a.f10051h == f.WAITING) {
                ao.a(com.bytedance.android.live.core.f.y.e(), com.bytedance.android.live.core.f.y.a((int) R.string.du9), 0);
                a.h();
                com.bytedance.android.live.liveinteract.platform.common.g.w.a();
            }
        }
    }

    public static final boolean a(AbstractC0160a aVar) {
        h.f.b.l.d(aVar, "");
        return f10052i.add(aVar);
    }

    public static final boolean b(AbstractC0160a aVar) {
        h.f.b.l.d(aVar, "");
        return f10052i.remove(aVar);
    }

    static final class n extends h.f.b.m implements h.f.a.b<String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f10070a = new n();

        static {
            Covode.recordClassIndex(5268);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            a.a(AnonymousClass1.f10071a, AnonymousClass2.f10072a);
            a.f10051h = f.LINKING;
            f.a.b.b bVar = a.f10050g;
            if (bVar != null) {
                bVar.dispose();
            }
            f.a.b.b bVar2 = a.f10049f;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            for (AbstractC0160a aVar : a.f10052i) {
                aVar.a();
            }
            return h.z.f158842a;
        }
    }

    static final class q<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final q f10075a = new q();

        static {
            Covode.recordClassIndex(5273);
        }

        q() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a.f10051h = f.INVITING;
            f.a.b.b a2 = com.bytedance.android.livesdk.utils.b.b.b((long) MtCoHostInviteTimeOutSetting.INSTANCE.getValue(), TimeUnit.SECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(s.f10077a, t.f10078a);
            f.a.b.b bVar = a.f10050g;
            if (bVar != null) {
                bVar.dispose();
            }
            a.f10050g = a2;
            a.f10047d.a(a2);
        }
    }

    static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataChannel f10082a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f10083b;

        static {
            Covode.recordClassIndex(5280);
        }

        x(DataChannel dataChannel, e eVar) {
            this.f10082a = dataChannel;
            this.f10083b = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            DataChannel dataChannel;
            Throwable th = (Throwable) obj;
            DataChannel dataChannel2 = this.f10082a;
            if (dataChannel2 != null) {
                dataChannel2.c(com.bytedance.android.live.liveinteract.api.t.class, new com.bytedance.android.livesdk.chatroom.c.p(1));
            }
            com.bytedance.android.livesdk.utils.f.a(com.bytedance.android.live.core.f.y.e(), th);
            a.g();
            a.f10056m = false;
            if (this.f10083b == e.TYPE_PUBLIC_SCREEN && (dataChannel = this.f10082a) != null) {
                dataChannel.c(ck.class, "anchor_host_notice");
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<String, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f10069a = new m();

        static {
            Covode.recordClassIndex(5267);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            if (a.f10051h == f.WAITING || a.f10051h == f.INVITING || a.f10051h == f.LINKING) {
                f.a.b.b bVar = a.f10048e;
                if (bVar != null) {
                    bVar.dispose();
                }
                f.a.b.b bVar2 = a.f10050g;
                if (bVar2 != null) {
                    bVar2.dispose();
                }
                a.f10055l = System.currentTimeMillis() / 1000;
                com.bytedance.android.live.liveinteract.cohost.ui.b.f fVar = a.f10053j;
                if (fVar != null && fVar.n()) {
                    fVar.dismiss();
                }
                com.bytedance.android.live.liveinteract.cohost.ui.b.e eVar = a.f10054k;
                if (eVar != null && eVar.n()) {
                    eVar.dismiss();
                }
                a.f10051h = f.LINKING_SUCCESS;
                for (AbstractC0160a aVar : a.f10052i) {
                    aVar.b();
                }
                a.o = null;
                a.n = null;
            }
            return h.z.f158842a;
        }
    }

    public static final void a(b bVar) {
        h.f.b.l.d(bVar, "");
        int i2 = b.f10086a[bVar.ordinal()];
        if (i2 == 1) {
            h();
        } else if (i2 != 2) {
            if (i2 == 3) {
                a(h.f10064a, i.f10065a);
            }
        } else if (f10051h == f.LINKING_SUCCESS) {
            com.bytedance.android.live.liveinteract.cohost.a.e.d.c();
            DataChannel dataChannel = f10044a;
            if (dataChannel != null) {
                dataChannel.c(ak.class, true);
            }
            DataChannel dataChannel2 = f10044a;
            if (dataChannel2 != null) {
                String a2 = com.bytedance.android.live.core.f.y.a((int) R.string.du7);
                h.f.b.l.b(a2, "");
                dataChannel2.c(al.class, a2);
            }
            g();
            q = d.CHANGE_PAIRING_MATCH;
            com.bytedance.android.live.liveinteract.platform.common.g.h.a((Room) null, com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE, "");
        }
    }

    public static final void a(c cVar) {
        androidx.fragment.app.i iVar;
        List<? extends ImageModel> list;
        h.f.b.l.d(cVar, "");
        try {
            int i2 = b.f10087b[cVar.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (f10051h == f.LINKING_SUCCESS) {
                        com.bytedance.android.live.liveinteract.cohost.ui.b.e eVar = f10054k;
                        if (eVar != null && eVar.n()) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            } else if (e() || d()) {
                com.bytedance.android.live.liveinteract.cohost.ui.b.f fVar = f10053j;
                if (fVar != null && fVar.n()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
            DataChannel dataChannel = f10044a;
            if (dataChannel == null || (iVar = (androidx.fragment.app.i) dataChannel.b(com.bytedance.android.livesdk.j.ao.class)) == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            int i3 = b.f10088c[cVar.ordinal()];
            if (i3 == 1) {
                List<? extends ImageModel> list2 = n;
                h.p<g, Long> i4 = i();
                com.bytedance.android.live.liveinteract.cohost.ui.b.f fVar2 = new com.bytedance.android.live.liveinteract.cohost.ui.b.f();
                if (list2 == null || (list = h.a.n.a((Iterable) list2)) == null) {
                    list = h.a.z.INSTANCE;
                }
                fVar2.f10283b = list;
                fVar2.f10285d = i4;
                f10053j = fVar2;
                String name = fVar2.getClass().getName();
                h.f.b.l.b(name, "");
                fVar2.show(iVar, name);
            } else if (i3 == 2) {
                boolean a2 = com.bytedance.android.live.liveinteract.cohost.a.e.d.a();
                com.bytedance.android.live.liveinteract.cohost.ui.b.e eVar2 = new com.bytedance.android.live.liveinteract.cohost.ui.b.e();
                eVar2.f10276b = a2;
                f10054k = eVar2;
                String name2 = eVar2.getClass().getName();
                h.f.b.l.b(name2, "");
                eVar2.show(iVar, name2);
            }
        } catch (IllegalStateException unused) {
        }
    }

    static final class w<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10081a;

        static {
            Covode.recordClassIndex(5279);
        }

        w(e eVar) {
            this.f10081a = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<ImageModel> list;
            g.a aVar;
            long j2;
            int i2;
            g.a a2;
            IMessageManager iMessageManager;
            g.a a3;
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            com.bytedance.android.livesdk.ap.b<Integer> bVar = com.bytedance.android.livesdk.ap.a.bZ;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar, Integer.valueOf(bVar.a().intValue() + 1));
            com.bytedance.android.livesdk.chatroom.interact.model.g gVar = (com.bytedance.android.livesdk.chatroom.interact.model.g) dVar.data;
            if (gVar != null) {
                list = gVar.f15608a;
            } else {
                list = null;
            }
            a.n = list;
            com.bytedance.android.livesdk.chatroom.interact.model.g gVar2 = (com.bytedance.android.livesdk.chatroom.interact.model.g) dVar.data;
            if (gVar2 != null) {
                aVar = gVar2.a();
            } else {
                aVar = null;
            }
            a.o = aVar;
            b.a.a().b(com.bytedance.android.live.liveinteract.api.k.MATCH);
            a.f10051h = f.WAITING;
            com.bytedance.android.livesdk.chatroom.interact.model.g gVar3 = (com.bytedance.android.livesdk.chatroom.interact.model.g) dVar.data;
            if (gVar3 == null || (a3 = gVar3.a()) == null) {
                j2 = 16;
            } else {
                j2 = (long) a3.f15610a;
            }
            a.f10045b = j2;
            f.a.b.b a4 = f.a.t.a(0, 1000, TimeUnit.MILLISECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(z.f10085a, aa.f10057a);
            a.f10047d.a(a4);
            a.f10048e = a4;
            DataChannel dataChannel = a.f10044a;
            if (!(dataChannel == null || (iMessageManager = (IMessageManager) dataChannel.b(cg.class)) == null)) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MESSAGE.getIntType(), a.r);
            }
            a aVar2 = a.r;
            DataChannel dataChannel2 = a.f10044a;
            if (dataChannel2 != null) {
                dataChannel2.a(aVar2, com.bytedance.android.live.liveinteract.api.q.class, m.f10069a).a(aVar2, com.bytedance.android.live.liveinteract.api.s.class, n.f10070a).a(aVar2, an.class, o.f10073a).a(aVar2, com.bytedance.android.live.liveinteract.api.r.class, p.f10074a);
            }
            com.bytedance.android.livesdk.chatroom.interact.model.g gVar4 = (com.bytedance.android.livesdk.chatroom.interact.model.g) dVar.data;
            if (gVar4 == null || (a2 = gVar4.a()) == null) {
                i2 = 60;
            } else {
                i2 = a2.f15611b;
            }
            f.a.b.b a5 = f.a.t.b((long) i2, TimeUnit.SECONDS).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(u.f10079a, v.f10080a);
            a.f10047d.a(a5);
            a.f10049f = a5;
            if (this.f10081a != e.TYPE_AUTO_START_WHEN_END) {
                a.a(d.RANDOM_MATCH);
                com.bytedance.android.live.liveinteract.platform.common.g.h.a((Room) null, com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE, "");
            }
            a.f10056m = false;
            if (this.f10081a == e.TYPE_PUBLIC_SCREEN) {
                a.a(c.PREVIEW_DIALOG);
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        boolean z2;
        long j2;
        String str;
        long j3;
        ab<com.bytedance.android.live.liveinteract.platform.a.c.a> a2;
        ab<R> a3;
        try {
            if (!(iMessage instanceof aj)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            } else if (((aj) iMessage).f19139a == 16) {
                com.bytedance.android.livesdk.model.message.d.j.a aVar = ((aj) iMessage).p;
                if (aVar == null || aVar.f19570c == 0) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                User user = aVar.f19569b;
                if (user != null) {
                    user.getId();
                }
                if (f10051h == f.WAITING) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("Check failed.".toString());
                } else if (!b.a.a().f9948m) {
                    String str2 = aVar.f19568a;
                    h.f.b.l.b(str2, "");
                    p = str2;
                    com.bytedance.android.live.liveinteract.api.a.b a4 = b.a.a();
                    long j4 = aVar.f19570c;
                    User user2 = aVar.f19569b;
                    if (user2 != null) {
                        j2 = user2.getId();
                    } else {
                        j2 = 0;
                    }
                    User user3 = aVar.f19569b;
                    if (user3 == null || (str = user3.getSecUid()) == null) {
                        str = "";
                    }
                    Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                    if (room != null) {
                        j3 = room.getId();
                    } else {
                        j3 = 0;
                    }
                    try {
                        if (a4.f9940e != 0) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!(!a4.af)) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (f10044a == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else if (j4 == 0) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (j2 == 0) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (!(!TextUtils.isEmpty(str))) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        } else if (j3 != 0) {
                            com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
                            com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(new com.bytedance.android.live.liveinteract.cohost.c.a(), null);
                            com.bytedance.android.live.liveinteract.platform.a.a.b bVar = new com.bytedance.android.live.liveinteract.platform.a.a.b();
                            bVar.f11858b = true;
                            bVar.f11859c = true;
                            com.bytedance.android.live.liveinteract.platform.a.c cVar = s;
                            if (cVar == null) {
                                h.f.b.l.a("mLinkerManager");
                            }
                            com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
                            h.f.b.l.b(b2, "");
                            cVar.a(b2.c(), a.EnumC0247a.COHOST, f10044a, bVar);
                            a4.af = true;
                            a4.q = true;
                            a4.f9937b = true;
                            a4.f9941f = j2;
                            a4.f9942g = str;
                            a4.f9944i = j4;
                            a4.f9943h = j3;
                            a4.p = com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE;
                            a4.b(com.bytedance.android.live.liveinteract.api.k.INVITING);
                            com.bytedance.android.live.liveinteract.platform.common.g.h.a((Room) null, com.bytedance.android.live.liveinteract.api.m.RANDOM_LINK_MIC_INVITE, "");
                            HashMap hashMap = new HashMap();
                            com.bytedance.android.live.liveinteract.platform.a.c cVar2 = s;
                            if (cVar2 == null) {
                                h.f.b.l.a("mLinkerManager");
                            }
                            com.bytedance.android.live.liveinteract.platform.a.b a5 = cVar2.a();
                            if (a5 != null && (a2 = a5.a(hashMap)) != null && (a3 = a2.a(new com.bytedance.android.livesdk.util.rxutils.f())) != null) {
                                a3.a(q.f10075a, r.f10076a);
                            }
                        } else {
                            try {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Exception unused2) {
                    }
                } else {
                    try {
                        throw new IllegalStateException("Check failed.".toString());
                    } catch (IllegalArgumentException unused3) {
                    } catch (IllegalStateException unused4) {
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } catch (IllegalArgumentException unused5) {
        } catch (IllegalStateException unused6) {
        }
    }

    public static final void a(DataChannel dataChannel, e eVar) {
        long j2;
        long j3;
        String str;
        User user;
        User user2;
        Room room;
        h.f.b.l.d(eVar, "");
        f10044a = dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getId();
        }
        DataChannel dataChannel2 = f10044a;
        if (dataChannel2 == null || (user2 = (User) dataChannel2.b(dn.class)) == null) {
            j3 = 0;
        } else {
            j3 = user2.getId();
        }
        DataChannel dataChannel3 = f10044a;
        if (dataChannel3 == null || (user = (User) dataChannel3.b(dn.class)) == null || (str = user.getSecUid()) == null) {
            str = "";
        }
        if (j2 == 0 || j3 == 0 || TextUtils.isEmpty(str)) {
            g();
        } else if (!f10056m) {
            f10056m = true;
            Calendar instance = Calendar.getInstance();
            h.f.b.l.b(instance, "");
            TimeZone timeZone = instance.getTimeZone();
            h.f.b.l.b(timeZone, "");
            String id = timeZone.getID();
            Calendar instance2 = Calendar.getInstance();
            h.f.b.l.b(instance2, "");
            f10047d.a(((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).randomLinkMicAutoMatch(j2, j3, str, id, instance2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new w(eVar), new x(dataChannel, eVar)));
        }
    }

    public static void a(h.f.a.a<h.z> aVar, h.f.a.a<h.z> aVar2) {
        long j2;
        String str;
        User user;
        User user2;
        Room room;
        DataChannel dataChannel = f10044a;
        long j3 = 0;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getId();
        }
        DataChannel dataChannel2 = f10044a;
        if (!(dataChannel2 == null || (user2 = (User) dataChannel2.b(dn.class)) == null)) {
            j3 = user2.getId();
        }
        DataChannel dataChannel3 = f10044a;
        if (dataChannel3 == null || (user = (User) dataChannel3.b(dn.class)) == null || (str = user.getSecUid()) == null) {
            str = "";
        }
        f10047d.a(((CoHostApi) com.bytedance.android.live.network.e.a().a(CoHostApi.class)).randomLinkMicCancelMatch(j2, j3, str).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new k(aVar), new l(aVar2)));
    }
}
