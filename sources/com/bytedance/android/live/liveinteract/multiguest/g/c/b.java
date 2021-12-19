package com.bytedance.android.live.liveinteract.multiguest.g.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.a.c;
import com.bytedance.android.live.liveinteract.api.b.k;
import com.bytedance.android.live.liveinteract.api.l;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.c.f;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multiguest.g.b.a;
import com.bytedance.android.live.liveinteract.platform.common.d.a;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.g.o;
import com.bytedance.android.live.liveinteract.platform.common.g.v;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.livesetting.linkmic.ShouldSyncClearLinkInRoomWindowSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class b extends a implements f.a, a.AbstractC0218a, a.AbstractC0250a {

    /* renamed from: a  reason: collision with root package name */
    public Context f11263a;

    /* renamed from: b  reason: collision with root package name */
    FrameLayout f11264b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f11265c;

    /* renamed from: d  reason: collision with root package name */
    public List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> f11266d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public d f11267e;

    /* renamed from: f  reason: collision with root package name */
    public int f11268f;

    /* renamed from: g  reason: collision with root package name */
    int f11269g;

    /* renamed from: h  reason: collision with root package name */
    public Room f11270h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11271i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11272j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11273k = true;

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.platform.common.e.a.a f11274l;

    /* renamed from: m  reason: collision with root package name */
    public DataChannel f11275m;
    public boolean n = false;
    View.OnClickListener o = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.g.c.b.AnonymousClass3 */

        static {
            Covode.recordClassIndex(6067);
        }

        public final void onClick(View view) {
            b.this.g();
            if (b.this.f() && b.this.f11275m != null) {
                o.a("connection_request");
                b.this.f11275m.c(l.class, new q(0));
            }
        }
    };
    View.OnClickListener p = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.g.c.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(6068);
        }

        public final void onClick(View view) {
            b.this.g();
            com.bytedance.android.live.liveinteract.platform.common.g.b.a("connection_request", b.this.f11270h.getOwner().getFollowInfo().getFollowStatus());
            if (!b.this.f() || b.this.f11272j || c.a().n.intValue() != 0) {
                return;
            }
            if (!LiveAppBundleUtils.isPluginAvailable(com.bytedance.android.livesdk.utils.b.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(b.this.f11263a, com.bytedance.android.livesdk.utils.b.LINK_MIC);
            } else {
                com.bytedance.android.livesdk.ah.f.a(p.a(b.this.f11263a)).a(new com.bytedance.android.livesdk.ah.b.d() {
                    /* class com.bytedance.android.live.liveinteract.multiguest.g.c.b.AnonymousClass4.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(6069);
                    }

                    @Override // com.bytedance.android.livesdk.ah.b.d
                    public final void b(String... strArr) {
                        ao.a(b.this.f11263a, (int) R.string.grv);
                    }

                    @Override // com.bytedance.android.livesdk.ah.b.d
                    public final void a(String... strArr) {
                        if (b.this.f11275m != null) {
                            q qVar = new q(1);
                            qVar.f15141b = a.EnumC0216a.SEND_REQUEST;
                            b.this.f11275m.c(l.class, qVar);
                        }
                    }
                }, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
            }
        }
    };
    private FrameLayout q;
    private com.bytedance.android.live.liveinteract.multiguest.g.b.a r;
    private int s;
    private int t;
    private int u;
    private f v;
    private com.bytedance.android.live.liveinteract.platform.common.d.a w;
    private boolean x = false;
    private final d.a y = new d.a() {
        /* class com.bytedance.android.live.liveinteract.multiguest.g.c.b.AnonymousClass1 */

        static {
            Covode.recordClassIndex(6065);
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a() {
            if (!b.this.f11273k) {
                List<e> list = b.this.f11267e.f11074b;
                ArrayList<e> arrayList = new ArrayList();
                for (e eVar : list) {
                    if (eVar.f15724e == 2) {
                        arrayList.add(eVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (e eVar2 : arrayList) {
                    Iterator<com.bytedance.android.live.liveinteract.multiguest.g.b.a> it = b.this.f11266d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bytedance.android.live.liveinteract.multiguest.g.b.a next = it.next();
                        if (TextUtils.equals(eVar2.a(), next.getPresenter().c())) {
                            arrayList2.add(next);
                            b.this.f11266d.remove(next);
                            break;
                        }
                    }
                }
                arrayList2.addAll(b.this.f11266d);
                b.this.f11266d = arrayList2;
                b.this.j();
                b.this.k();
            } else if (!TextUtils.isEmpty(com.bytedance.android.livesdk.b.a.d.a().f14184e)) {
                b.this.n = false;
                if (b.this.f11274l != null) {
                    b bVar = b.this;
                    bVar.a(bVar.f11274l);
                }
            }
        }

        @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.d.a
        public final void a(long j2, String str) {
            com.bytedance.android.live.liveinteract.multiguest.g.b.a a2;
            if (!b.this.f11273k && b.this.f11271i && (a2 = b.this.a(j2, str)) != null) {
                a2.c();
                long id = b.this.f11270h.getOwner().getId();
                if (a2.getPresenter() != null && a2.getPresenter().f() != null && a2.getPresenter().b() != id && u.a().b().c() != b.this.f11270h.getOwnerUserId()) {
                    ao.a(b.this.f11263a, b.this.f11263a.getString(R.string.grh, a2.getPresenter().f().f15722c.getNickName()), 0);
                }
            }
        }
    };
    private View.OnLayoutChangeListener z = new View.OnLayoutChangeListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.g.c.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(6066);
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            com.bytedance.android.live.core.c.a.a(4, com.bytedance.android.live.liveinteract.api.o.f10017a, "onLayoutChange");
            if (i5 != i9 && b.this.f11274l != null) {
                b bVar = b.this;
                bVar.a(bVar.f11274l);
            }
        }
    };

    static {
        Covode.recordClassIndex(6064);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.c.f.a
    public final void a() {
        k();
    }

    public final void g() {
        if (!this.f11272j) {
            h.b("connection_request");
            h.f11965b = "connection_request";
        }
    }

    public final void k() {
        this.f11264b.post(new g(this));
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        com.bytedance.android.livesdk.util.rxutils.a.a.a(this.f11265c).g(1, TimeUnit.SECONDS).d(new c(this));
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        com.bytedance.android.livesdk.util.rxutils.a.a.a(this.f11265c).g(1, TimeUnit.SECONDS).d(new d(this));
    }

    private void l() {
        MethodCollector.i(8493);
        for (com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar : this.f11266d) {
            if (ShouldSyncClearLinkInRoomWindowSetting.INSTANCE.getValue()) {
                this.f11264b.removeView(aVar);
            } else {
                this.f11264b.post(new f(this, aVar));
            }
        }
        this.f11266d.clear();
        MethodCollector.o(8493);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b() {
        MethodCollector.i(8177);
        this.f11271i = false;
        this.f11264b.removeOnLayoutChangeListener(this.z);
        this.v.b();
        this.f11264b.removeAllViews();
        com.bytedance.android.livesdk.an.a.a().a(new k(false));
        this.f11275m.b(com.bytedance.android.live.liveinteract.api.h.class, new k(false));
        MethodCollector.o(8177);
    }

    public final void j() {
        int size = this.f11266d.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar = this.f11266d.get(i2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) aVar.getLayoutParams();
            layoutParams.gravity = 85;
            layoutParams.bottomMargin = ((this.f11268f + this.t) * i2) + this.f11269g;
            layoutParams.rightMargin = this.u;
            layoutParams.width = this.s;
            layoutParams.height = this.t;
            aVar.setLayoutParams(layoutParams);
        }
    }

    public final boolean f() {
        if (this.f11272j) {
            return true;
        }
        if (!u.a().b().e()) {
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            Context context = this.f11263a;
            j.a a2 = j.a();
            a2.f14158a = y.a((int) R.string.grm);
            a2.f14161d = "interact";
            a2.f14160c = 0;
            b2.a(context, a2.a()).b(new g());
            return false;
        } else if (u.a().b().a(com.bytedance.android.livesdk.at.h.INTERACT)) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(DataChannel dataChannel) {
        this.f11275m = dataChannel;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b(String str) {
        this.y.a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void d(String str) {
        this.y.a(0, str);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(String str) {
        if (this.f11273k && this.f11271i) {
            this.w.b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final boolean b(int i2) {
        if (!this.f11273k || i2 != 1) {
            return false;
        }
        return true;
    }

    private void b(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar) {
        MethodCollector.i(8486);
        this.f11264b.addView(aVar);
        this.f11266d.add(aVar);
        MethodCollector.o(8486);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void c(boolean z2) {
        MethodCollector.i(8230);
        if (z2 == this.f11273k) {
            MethodCollector.o(8230);
            return;
        }
        this.f11273k = z2;
        l();
        FrameLayout frameLayout = this.q;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            com.bytedance.android.livesdk.b.a.d.a().s = null;
        }
        if (this.x) {
            if (this.f11273k) {
                this.f11264b.setVisibility(4);
                MethodCollector.o(8230);
                return;
            }
            this.f11264b.setVisibility(0);
        }
        MethodCollector.o(8230);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a.AbstractC0218a
    public final void a(com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar) {
        if (aVar == this.r) {
            this.r = null;
        }
        this.f11264b.post(new e(this, aVar));
        this.f11266d.remove(aVar);
        j();
        k();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void b(boolean z2) {
        if (this.f11273k) {
            if (z2) {
                this.x = true;
                this.f11264b.setVisibility(4);
                return;
            }
            this.x = false;
            this.f11264b.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final com.bytedance.android.live.liveinteract.multiguest.g.b.a c(String str) {
        if (this.f11273k || !this.f11271i || TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a2 = a(0, str);
        boolean z2 = false;
        if (a2 != null) {
            a(a2);
            z2 = true;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a3 = a(str, true);
        if (a3 == null) {
            return null;
        }
        if (this.f11272j) {
            if (!z2) {
                a3.f11243i = true;
            }
        } else if (TextUtils.equals(str, com.bytedance.android.livesdk.b.a.d.a().f14185f)) {
            if (!z2) {
                a3.f11243i = true;
            }
            this.r = a3;
        }
        b(a3);
        this.y.a();
        return a3;
    }

    @Override // com.bytedance.android.live.liveinteract.platform.common.d.a.AbstractC0250a
    public final void a(com.bytedance.android.live.liveinteract.platform.common.e.a.a aVar) {
        int i2;
        int i3;
        com.bytedance.android.live.liveinteract.multiguest.g.b.a a2;
        if (this.f11273k && this.f11271i) {
            this.f11274l = aVar;
            v.a(2, e.a.f9628b.b(aVar));
            l();
            List<com.bytedance.android.live.liveinteract.platform.common.e.a.c> list = aVar.f11923e;
            com.bytedance.android.live.core.c.a.a(4, "onSeiUpdatedTAG", "getLinkedGuestCountWithOutAnchor = " + this.f11267e.h());
            if (list == null || list.size() <= 0 || this.f11267e.h() <= 0) {
                k();
                return;
            }
            int width = this.f11264b.getWidth();
            int height = this.f11264b.getHeight();
            if (aVar.f11924f != null) {
                i2 = aVar.f11924f.f11927c;
            } else {
                i2 = 0;
            }
            if (aVar.f11924f != null) {
                i3 = aVar.f11924f.f11926b;
            } else {
                i3 = 0;
            }
            String str = com.bytedance.android.livesdk.b.a.d.a().f14184e;
            if (TextUtils.isEmpty(str)) {
                this.n = true;
                return;
            }
            for (com.bytedance.android.live.liveinteract.platform.common.e.a.c cVar : list) {
                if (!(cVar == null || TextUtils.equals(cVar.a(), str) || (a2 = a(cVar.a(), false)) == null)) {
                    a2.setLayoutParams(com.bytedance.android.live.liveinteract.platform.common.d.a.a(width, height, i2, i3, cVar));
                    b(a2);
                }
            }
            k();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(boolean z2) {
        MethodCollector.i(8111);
        com.bytedance.android.livesdk.an.a.a().a(new k(true));
        this.f11275m.b(com.bytedance.android.live.liveinteract.api.h.class, new k(true));
        this.f11273k = z2;
        this.f11271i = true;
        TextView textView = (TextView) com.a.a(LayoutInflater.from(this.f11264b.getContext()), R.layout.bf2, this.f11264b, false);
        this.f11265c = textView;
        textView.setVisibility(4);
        this.f11264b.addView(this.f11265c);
        this.f11267e.a(this.y);
        this.v.a();
        h.a("connection_request");
        k();
        this.f11264b.addOnLayoutChangeListener(this.z);
        MethodCollector.o(8111);
    }

    private com.bytedance.android.live.liveinteract.multiguest.g.b.a a(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.b.a aVar = new com.bytedance.android.live.liveinteract.multiguest.g.b.a(this.f11263a, str, this.v.a(str), this, this.f11275m);
        aVar.setCurrentUserIsLinkedGuest(!z2);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.android.live.liveinteract.multiguest.g.b.a a(long r6, java.lang.String r8) {
        /*
            r5 = this;
            java.util.List<com.bytedance.android.live.liveinteract.multiguest.g.b.a> r0 = r5.f11266d
            java.util.Iterator r4 = r0.iterator()
        L_0x0006:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r3 = r4.next()
            com.bytedance.android.live.liveinteract.multiguest.g.b.a r3 = (com.bytedance.android.live.liveinteract.multiguest.g.b.a) r3
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0025
            com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r0 = r3.getPresenter()
            long r1 = r0.b()
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0025
            return r3
        L_0x0025:
            com.bytedance.android.live.liveinteract.multiguest.a.b.b$a r0 = r3.getPresenter()
            java.lang.String r0 = r0.c()
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 == 0) goto L_0x0006
            return r3
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.g.c.b.a(long, java.lang.String):com.bytedance.android.live.liveinteract.multiguest.g.b.a");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.c.a
    public final void a(String str, SurfaceView surfaceView) {
        MethodCollector.i(8476);
        if (this.f11273k || !this.f11271i) {
            MethodCollector.o(8476);
        } else if (TextUtils.equals(str, com.bytedance.android.livesdk.b.a.d.a().f14184e)) {
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.q.removeAllViews();
            this.q.addView(surfaceView);
            this.q.setVisibility(0);
            com.bytedance.android.livesdk.b.a.d.a().s = surfaceView;
            MethodCollector.o(8476);
        } else {
            com.bytedance.android.live.liveinteract.multiguest.g.b.a a2 = a(0, str);
            if (a2 == null && (a2 = c(str)) == null) {
                MethodCollector.o(8476);
                return;
            }
            if (TextUtils.equals(new StringBuilder().append(this.f11270h.getOwnerUserId()).toString(), new StringBuilder().append(a2.getPresenter().b()).toString())) {
                com.bytedance.android.live.core.d.c.a(new Throwable(), "Anchor attach to window exception, cur interactId:" + str + " anchorLinkMicId:" + com.bytedance.android.livesdk.b.a.d.a().f14184e);
            }
            surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.s, this.t));
            surfaceView.setZOrderMediaOverlay(true);
            a2.a(surfaceView);
            MethodCollector.o(8476);
        }
    }

    public b(Room room, boolean z2, FrameLayout frameLayout, FrameLayout frameLayout2, d dVar) {
        this.f11263a = frameLayout2.getContext();
        this.f11270h = room;
        this.f11272j = z2;
        this.f11264b = frameLayout2;
        this.q = frameLayout;
        this.f11267e = dVar;
        this.w = new com.bytedance.android.live.liveinteract.platform.common.d.a(this);
        this.v = new f(room, dVar, this);
        Resources resources = this.f11263a.getResources();
        this.s = resources.getDimensionPixelSize(R.dimen.wg);
        this.t = resources.getDimensionPixelSize(R.dimen.wf);
        this.f11268f = (int) n.b(this.f11263a, 4.0f);
        this.f11269g = (int) n.b(this.f11263a, 52.0f);
        this.u = (int) n.b(this.f11263a, 12.0f);
    }
}
