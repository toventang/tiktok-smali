package com.bytedance.android.live.liveinteract.multiguest.g.a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.multiguest.a.d.a;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import com.bytedance.android.livesdk.b.a.g;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.HashMap;

public final class i extends v {

    /* renamed from: d  reason: collision with root package name */
    public static final a f11214d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f11215a;

    /* renamed from: b  reason: collision with root package name */
    public LiveButton f11216b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11217c;

    /* renamed from: e  reason: collision with root package name */
    private LiveCheckBox f11218e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f11219f;

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f11230a = new h();

        static {
            Covode.recordClassIndex(6037);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.a.i$i  reason: collision with other inner class name */
    static final class C0217i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final C0217i f11231a = new C0217i();

        static {
            Covode.recordClassIndex(6038);
        }

        C0217i() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(6026);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f11219f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f11219f == null) {
            this.f11219f = new HashMap();
        }
        View view = (View) this.f11219f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f11219f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.v
    public final boolean i() {
        return true;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6027);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private i() {
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ View $view;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(6032);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, View view) {
            super(0);
            this.this$0 = iVar;
            this.$view = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a();
            return z.f158842a;
        }

        public final void a() {
            try {
                if (this.this$0.getContext() != null) {
                    Context context = this.this$0.getContext();
                    if (context == null) {
                        l.b();
                    }
                    l.b(context, "");
                    Activity a2 = i.a(context);
                    if (a2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                        Context context2 = this.this$0.getContext();
                        if (context2 == null) {
                            l.b();
                        }
                        LiveAppBundleUtils.ensurePluginAvailable(context2, com.bytedance.android.livesdk.utils.b.LINK_MIC);
                        throw new IllegalStateException("Check failed.".toString());
                    } else if (b.a.a().a() != 2) {
                        ao.a(y.e(), (int) R.string.e9h);
                        this.this$0.dismiss();
                    } else if (com.bytedance.android.livesdk.b.a.d.a().u >= com.bytedance.android.livesdk.b.a.d.a().x) {
                        ao.a(y.e(), (int) R.string.e_g);
                        this.this$0.dismiss();
                    } else {
                        com.bytedance.android.livesdk.ah.f.a(a2).a(new com.bytedance.android.livesdk.ah.b.d(this) {
                            /* class com.bytedance.android.live.liveinteract.multiguest.g.a.i.d.AnonymousClass1 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ d f11229a;

                            static {
                                Covode.recordClassIndex(6033);
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f11229a = r1;
                            }

                            @Override // com.bytedance.android.livesdk.ah.b.d
                            public final void a(String... strArr) {
                                l.d(strArr, "");
                                com.bytedance.android.livesdk.ab.i.b();
                                com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "onPermissionGrant");
                                DataChannel dataChannel = this.f11229a.this$0.p;
                                if (dataChannel != null) {
                                    q qVar = new q(1);
                                    qVar.f15141b = a.EnumC0216a.GO_LIVE;
                                    dataChannel.c(com.bytedance.android.live.liveinteract.api.l.class, qVar);
                                }
                                this.f11229a.this$0.dismiss();
                            }

                            @Override // com.bytedance.android.livesdk.ah.b.d
                            public final void b(String... strArr) {
                                l.d(strArr, "");
                                ao.a(this.f11229a.this$0.getContext(), (int) R.string.grv);
                                if (((LiveButton) this.f11229a.$view.findViewById(R.id.f5n)).performClick()) {
                                    this.f11229a.this$0.dismiss();
                                }
                            }
                        }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } catch (IllegalStateException unused) {
                this.this$0.dismiss();
            }
        }
    }

    static final class f extends m implements h.f.a.a<z> {
        final /* synthetic */ d $replyAnchorWithAgree$5;

        static {
            Covode.recordClassIndex(6035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.$replyAnchorWithAgree$5 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$replyAnchorWithAgree$5.a();
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(6036);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b6t);
        bVar.f22375b = R.style.a36;
        bVar.f22382i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.live.liveinteract.api.y.class, (Object) false);
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void dismiss() {
        super.dismiss();
        LiveCheckBox liveCheckBox = this.f11218e;
        if (liveCheckBox != null && liveCheckBox.isChecked()) {
            try {
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room != null) {
                    long id = room.getId();
                    if (id != 0) {
                        ((MultiLiveApi) com.bytedance.android.live.network.e.a().a(MultiLiveApi.class)).turnOffInvitation(id).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(h.f11230a, C0217i.f11231a);
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            } catch (Exception unused) {
            }
        }
        f.a.b.b bVar = this.f11215a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    public /* synthetic */ i(byte b2) {
        this();
    }

    public static Activity a(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return (Activity) context;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.live.liveinteract.multiguest.a.d.a f11220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C0211a f11221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f11222c;

        static {
            Covode.recordClassIndex(6028);
        }

        b(com.bytedance.android.live.liveinteract.multiguest.a.d.a aVar, a.C0211a aVar2, d dVar) {
            this.f11220a = aVar;
            this.f11221b = aVar2;
            this.f11222c = dVar;
        }

        public final void onClick(View view) {
            if (!this.f11220a.a(this.f11221b)) {
                com.bytedance.android.livesdk.ab.i.b();
                com.bytedance.android.livesdk.ab.i.b("invite_issue_check", "replyAnchorWithAgree");
                this.f11222c.a();
            }
        }
    }

    static final class e extends m implements h.f.a.b<z, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(6034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(i iVar) {
            super(1);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            LiveButton liveButton = this.this$0.f11216b;
            if (liveButton != null) {
                liveButton.setEnabled(true);
            }
            return z.f158842a;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f11223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.d f11224b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.d f11225c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f11226d;

        static {
            Covode.recordClassIndex(6029);
        }

        c(i iVar, z.d dVar, z.d dVar2, String str) {
            this.f11223a = iVar;
            this.f11224b = dVar;
            this.f11225c = dVar2;
            this.f11226d = str;
        }

        public final void onClick(View view) {
            if (!this.f11223a.f11217c) {
                com.bytedance.android.live.liveinteract.platform.common.g.i.a(2L, this.f11224b.element, g.a.f14199a.a(this.f11224b.element));
                this.f11223a.f11217c = true;
                boolean value = MultiLiveServerAutoJoinChannel.INSTANCE.getValue();
                this.f11223a.f11215a = ((LinkApi) com.bytedance.android.live.network.e.a().a(LinkApi.class)).linkInRoomGuestReplyAnchor(this.f11225c.element, 2, this.f11225c.element, this.f11224b.element, com.bytedance.android.live.liveinteract.api.a.c.a().f9959k, this.f11226d, value).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                    /* class com.bytedance.android.live.liveinteract.multiguest.g.a.i.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f11227a;

                    static {
                        Covode.recordClassIndex(6030);
                    }

                    {
                        this.f11227a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        DataChannel dataChannel;
                        Room room;
                        this.f11227a.f11223a.dismiss();
                        com.bytedance.android.live.liveinteract.platform.common.g.i.b(2, this.f11227a.f11224b.element, g.a.f14199a.a(this.f11227a.f11224b.element));
                        this.f11227a.f11223a.f11217c = false;
                        if (com.bytedance.android.live.liveinteract.multilive.a.c() && (dataChannel = this.f11227a.f11223a.p) != null) {
                            DataChannel dataChannel2 = this.f11227a.f11223a.p;
                            if (dataChannel2 != null) {
                                room = (Room) dataChannel2.b(df.class);
                            } else {
                                room = null;
                            }
                            com.bytedance.android.live.liveinteract.multilive.a.a(room, dataChannel, false);
                        }
                    }
                }, new f.a.d.f(this) {
                    /* class com.bytedance.android.live.liveinteract.multiguest.g.a.i.c.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f11228a;

                    static {
                        Covode.recordClassIndex(6031);
                    }

                    {
                        this.f11228a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f11228a.f11223a.dismiss();
                        com.bytedance.android.live.liveinteract.platform.common.g.i.a((Throwable) obj, 2, this.f11228a.f11224b.element, g.a.f14199a.a(this.f11228a.f11224b.element));
                        this.f11228a.f11223a.f11217c = false;
                    }
                });
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0045, code lost:
        if (r9 != null) goto L_0x0048;
     */
    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.g.a.i.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
