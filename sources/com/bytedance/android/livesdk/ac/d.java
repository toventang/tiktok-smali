package com.bytedance.android.livesdk.ac;

import android.content.Context;
import android.content.DialogInterface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.n.u;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.browser.c.e;
import com.bytedance.android.livesdk.j.cf;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.message.bv;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.m.p;
import h.z;
import java.util.Objects;

public final class d implements com.bytedance.android.message.a {

    /* renamed from: a  reason: collision with root package name */
    public final com.bytedance.android.livesdk.ui.a f13614a;

    /* renamed from: b  reason: collision with root package name */
    final DataChannel f13615b;

    /* renamed from: c  reason: collision with root package name */
    final u f13616c;

    /* renamed from: d  reason: collision with root package name */
    final View f13617d;

    /* renamed from: e  reason: collision with root package name */
    final h.f.a.b<Boolean, z> f13618e;

    /* renamed from: f  reason: collision with root package name */
    final h.f.a.b<bv, z> f13619f;

    /* renamed from: g  reason: collision with root package name */
    final h.f.a.a<Boolean> f13620g;

    /* renamed from: h  reason: collision with root package name */
    final h.f.a.a<z> f13621h;

    /* renamed from: i  reason: collision with root package name */
    private final h f13622i = com.bytedance.android.livesdkapi.m.d.a(a.f13623a);

    final /* synthetic */ class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f13624a;

        static {
            Covode.recordClassIndex(7540);
        }

        b(h.f.a.b bVar) {
            this.f13624a = bVar;
        }

        @Override // com.bytedance.android.livesdk.ac.c
        public final /* synthetic */ void a(com.bytedance.android.livesdk.ac.b.a aVar) {
            l.b(this.f13624a.invoke(aVar), "");
        }
    }

    static {
        Covode.recordClassIndex(7537);
    }

    private final f c() {
        return (f) this.f13622i.getValue();
    }

    static final class a extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f13623a = new a();

        static {
            Covode.recordClassIndex(7539);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f();
        }
    }

    /* access modifiers changed from: package-private */
    public final Room a() {
        return (Room) this.f13615b.b(df.class);
    }

    @Override // com.bytedance.android.message.a
    public final void b() {
        f c2 = c();
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(c2);
        }
        c2.f13629a = null;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13625a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bv f13626b;

        static {
            Covode.recordClassIndex(7541);
        }

        c(d dVar, bv bvVar) {
            this.f13625a = dVar;
            this.f13626b = bvVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
            Context context = this.f13625a.f13614a.getContext();
            d.a b2 = e.b(this.f13626b.f19374l);
            b2.f14292c = true;
            webViewManager.a(context, b2);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ac.d$d  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC0286d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f13627a;

        static {
            Covode.recordClassIndex(7542);
        }

        DialogInterface$OnClickListenerC0286d(d dVar) {
            this.f13627a = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            k.a(this.f13627a.f13614a.getActivity());
            dialogInterface.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.Boolean, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super com.bytedance.android.livesdk.model.message.bv, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public d(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, u uVar, View view, h.f.a.b<? super Boolean, z> bVar, h.f.a.b<? super bv, z> bVar2, h.f.a.a<Boolean> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(view, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        this.f13614a = aVar;
        this.f13615b = dataChannel;
        this.f13616c = uVar;
        this.f13617d = view;
        this.f13618e = bVar;
        this.f13619f = bVar2;
        this.f13620g = aVar2;
        this.f13621h = aVar3;
        f c2 = c();
        c2.f13629a = new b(new h.f.a.b<com.bytedance.android.livesdk.ac.b.a, z>(this) {
            /* class com.bytedance.android.livesdk.ac.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(7538);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(com.bytedance.android.livesdk.ac.b.a aVar) {
                com.bytedance.android.livesdk.model.message.a.a aVar2;
                long j2;
                h.f.a.b<bv, z> bVar;
                com.bytedance.android.livesdk.ac.b.a aVar3 = aVar;
                d dVar = (d) this.receiver;
                if (!(!dVar.f13614a.isViewValid() || aVar3 == null || (aVar2 = aVar3.L) == null)) {
                    boolean z = true;
                    switch (e.f13628a[aVar2.ordinal()]) {
                        case 1:
                            Room a2 = dVar.a();
                            if (a2 != null) {
                                j2 = a2.getId();
                            } else {
                                j2 = 0;
                            }
                            if (aVar3.a(j2)) {
                                DataChannel dataChannel = dVar.f13615b;
                                Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.MemberMessage");
                                dataChannel.b(cf.class, aVar3);
                                break;
                            }
                            break;
                        case 2:
                            Objects.requireNonNull(aVar3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.message.RemindMessage");
                            bv bvVar = (bv) aVar3;
                            int i2 = bvVar.f19368f;
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if ((i2 == 6 || i2 == 7) && (bVar = dVar.f13619f) != null) {
                                            bVar.invoke(bvVar);
                                            break;
                                        }
                                    } else {
                                        Spannable spannable = com.bytedance.android.livesdk.chatroom.f.c.f15496a;
                                        if (bvVar.a()) {
                                            spannable = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.O.f23218j, "");
                                        }
                                        if (spannable == com.bytedance.android.livesdk.chatroom.f.c.f15496a && !TextUtils.isEmpty(bvVar.f19367a)) {
                                            spannable = new SpannableString(bvVar.f19367a);
                                        }
                                        CharSequence a3 = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.f19370h, "");
                                        CharSequence a4 = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.f19371i, "");
                                        l.b(a4, "");
                                        Spannable a5 = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.f19372j, "");
                                        l.b(a5, "");
                                        Spannable a6 = com.bytedance.android.livesdk.chatroom.f.c.a(bvVar.f19373k, "");
                                        l.b(a6, "");
                                        if (TextUtils.isEmpty(a3)) {
                                            a4 = spannable;
                                        } else if (!TextUtils.isEmpty(a4) && !TextUtils.isEmpty(a5)) {
                                            a4 = p.b("\n                            " + a4 + "\n                            " + ((CharSequence) a5) + "\n                            ");
                                        } else if (TextUtils.isEmpty(a4)) {
                                            if (!TextUtils.isEmpty(a5)) {
                                                a4 = a5;
                                            } else {
                                                a4 = "";
                                            }
                                        }
                                        if (!TextUtils.isEmpty(a4)) {
                                            if (TextUtils.isEmpty(a3)) {
                                                a3 = y.a((int) R.string.ect);
                                            }
                                            if (TextUtils.isEmpty(a6) || TextUtils.isEmpty(bvVar.f19374l)) {
                                                z = false;
                                            }
                                            b.a aVar4 = new b.a(dVar.f13614a.getActivity());
                                            aVar4.f18296m = false;
                                            aVar4.f18284a = a3;
                                            aVar4.f18286c = a4;
                                            b.a a7 = aVar4.a(R.string.e5f, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC0286d(dVar), false);
                                            l.b(a7, "");
                                            if (z) {
                                                a7.a(a6, new c(dVar, bvVar));
                                                a7.f18288e = 2131234545;
                                            }
                                            a7.a().show();
                                            k.a(dVar.f13614a.getActivity());
                                            break;
                                        }
                                    }
                                } else {
                                    if (!dVar.f13620g.invoke().booleanValue()) {
                                        dVar.f13617d.setVisibility(8);
                                    }
                                    h.f.a.b<Boolean, z> bVar2 = dVar.f13618e;
                                    if (bVar2 != null) {
                                        bVar2.invoke(false);
                                    }
                                    Room a8 = dVar.a();
                                    if (a8 != null) {
                                        a8.setMosaicStatus(0);
                                    }
                                    u uVar = dVar.f13616c;
                                    if (uVar != null) {
                                        uVar.a(bvVar);
                                        break;
                                    }
                                }
                            } else {
                                Object b2 = dVar.f13615b.b(ee.class);
                                if (b2 == null) {
                                    l.b();
                                }
                                if (!((Boolean) b2).booleanValue()) {
                                    dVar.f13617d.setVisibility(0);
                                }
                                h.f.a.b<Boolean, z> bVar3 = dVar.f13618e;
                                if (bVar3 != null) {
                                    bVar3.invoke(true);
                                }
                                Room a9 = dVar.a();
                                if (a9 != null) {
                                    a9.setMosaicStatus(1);
                                }
                                u uVar2 = dVar.f13616c;
                                if (uVar2 != null) {
                                    uVar2.a(bvVar);
                                }
                                dVar.f13615b.c(com.bytedance.android.livesdkapi.e.c.class, true);
                                break;
                            }
                            break;
                        case 3:
                            Room a10 = dVar.a();
                            if (a10 == null || !a10.isOfficial()) {
                                dVar.f13621h.invoke();
                                com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.addFollowGuideMessage(dVar.a(), aVar3);
                                break;
                            }
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                            Room a11 = dVar.a();
                            if (a11 == null || !a11.isOfficial()) {
                                com.bytedance.android.livesdk.chatroom.b.c.INSTANCE.add(aVar3);
                                break;
                            }
                    }
                }
                return z.f158842a;
            }
        });
        IMessageManager iMessageManager = ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.MEMBER.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.ROOM_NOTIFY.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.REMIND.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.COMMON_TOAST.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.FOLLOW_GUIDE.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.GUIDE_MESSAGE.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.COMMON_GUIDE.getIntType(), c2);
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.CEREMONY_MESSAGE.getIntType(), c2);
        }
    }
}
