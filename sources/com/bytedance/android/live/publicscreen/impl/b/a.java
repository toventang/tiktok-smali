package com.bytedance.android.live.publicscreen.impl.b;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.model.j;
import com.bytedance.android.live.design.view.action.LiveActionButton;
import com.bytedance.android.live.publicscreen.impl.b.b;
import com.bytedance.android.live.s.e;
import com.bytedance.android.live.s.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.f;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;

public final class a extends com.bytedance.android.livesdk.g.b implements View.OnClickListener, b.a, com.bytedance.android.live.s.c, g {

    /* renamed from: a  reason: collision with root package name */
    public User f12214a;

    /* renamed from: b  reason: collision with root package name */
    public final Room f12215b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12216c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.android.livesdk.ac.b.a f12217d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bytedance.android.live.base.model.user.b f12218e;

    /* renamed from: i  reason: collision with root package name */
    private final b f12219i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12220j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f12221k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f12222l;

    /* renamed from: m  reason: collision with root package name */
    private View f12223m;
    private View n;
    private final Context o;
    private final String p;
    private final boolean q;
    private final String r;
    private final h.f.a.a<z> s;

    static {
        Covode.recordClassIndex(6730);
    }

    @Override // com.bytedance.android.live.s.c
    public final void a(com.bytedance.android.live.s.a.c cVar, Exception exc) {
    }

    @Override // com.bytedance.android.live.s.c
    public final void c() {
    }

    @Override // com.bytedance.android.live.s.c
    public final void k_() {
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12220j = true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.b.b.a
    public final void a() {
        if (this.f12220j) {
            this.f12221k = false;
            b(true);
        }
    }

    public final void onDetachedFromWindow() {
        this.f12220j = false;
        this.f12219i.b();
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.livesdk.g.b
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.clearFlags(1024);
            }
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setStatusBarColor(0);
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setNavigationBarColor(com.bytedance.android.live.design.b.a(getContext(), (int) R.attr.alc));
            }
            Window window5 = getWindow();
            if (window5 != null) {
                window5.setLayout(-1, -1);
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12226a;

        static {
            Covode.recordClassIndex(6732);
        }

        b(a aVar) {
            this.f12226a = aVar;
        }

        public final void onClick(View view) {
            this.f12226a.cancel();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12227a;

        static {
            Covode.recordClassIndex(6733);
        }

        c(a aVar) {
            this.f12227a = aVar;
        }

        public final void onClick(View view) {
            this.f12227a.dismiss();
        }
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(Exception exc) {
        if (this.f12220j) {
            f.a(this.o, exc, (int) R.string.gss);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.b.a$a  reason: collision with other inner class name */
    static final class C0256a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f12225b;

        static {
            Covode.recordClassIndex(6731);
        }

        C0256a(a aVar, e eVar) {
            this.f12224a = aVar;
            this.f12225b = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            j jVar = (j) obj;
            e eVar = this.f12225b;
            User user = this.f12224a.f12214a;
            long id = this.f12224a.f12215b.getId();
            l.b(jVar, "");
            eVar.muteUser(user, id, jVar, this.f12224a);
            this.f12224a.a("mute");
        }
    }

    @Override // com.bytedance.android.live.publicscreen.impl.b.b.a
    public final void a(com.bytedance.android.live.base.model.user.b bVar) {
        if (this.f12220j) {
            if (bVar == null || bVar.getId() <= 0) {
                new IllegalArgumentException("User is invalid");
                a();
                return;
            }
            User from = User.from(bVar);
            if (from != null) {
                this.f12214a = from;
                this.f12221k = true;
                b(false);
                return;
            }
            new IllegalArgumentException("User is invalid");
            a();
        }
    }

    public final void a(String str) {
        ((e) com.bytedance.android.live.t.a.a(e.class)).getMuteDuration().d(new d(this, str));
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f12228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12229b;

        static {
            Covode.recordClassIndex(6734);
        }

        d(a aVar, String str) {
            this.f12228a = aVar;
            this.f12229b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Boolean bool;
            String str;
            ba userAttr;
            String str2;
            long j2;
            j jVar = (j) obj;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_manage_negative_comment");
            i iVar = null;
            if (this.f12228a.f12216c) {
                str = "anchor";
            } else {
                com.bytedance.android.live.base.model.user.b bVar = this.f12228a.f12218e;
                if (bVar == null || (userAttr = bVar.getUserAttr()) == null) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(userAttr.f19030b);
                }
                if (p.a(bool)) {
                    str = "admin";
                } else {
                    str = "viewer";
                }
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.a("admin_type", str).a("to_user_id", this.f12228a.f12214a.getId());
            com.bytedance.android.livesdk.ac.b.a aVar = this.f12228a.f12217d;
            if (aVar instanceof i) {
                iVar = aVar;
            }
            i iVar2 = iVar;
            if (iVar2 == null || (str2 = iVar2.f19629f) == null) {
                str2 = "";
            }
            com.bytedance.android.livesdk.ab.b a4 = a3.a("live_message", str2).a("manage_action", this.f12229b);
            com.bytedance.android.live.base.model.user.b bVar2 = this.f12228a.f12218e;
            if (bVar2 != null) {
                j2 = bVar2.getId();
            } else {
                j2 = 0;
            }
            com.bytedance.android.livesdk.ab.b a5 = a4.a("user_id", j2).a("anchor_id", this.f12228a.f12215b.getOwnerUserId()).a("room_id", this.f12228a.f12215b.getId()).a("msg_id", this.f12228a.f12217d.getMessageId());
            if (l.a((Object) this.f12229b, (Object) "mute")) {
                a5.a("mute_duration", jVar.f7925a).a("default_mute_set", jVar.f7925a);
            }
            a5.b();
        }
    }

    @Override // com.bytedance.android.live.s.g
    public final void a(boolean z) {
        if (this.f12220j) {
            b(false);
        }
    }

    public final void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        String str = "";
        if (num != null && num.intValue() == R.id.dlm) {
            String a2 = com.bytedance.android.livesdk.ab.e.a();
            String d2 = com.bytedance.android.livesdk.ab.e.d();
            e eVar = (e) com.bytedance.android.live.t.a.a(e.class);
            Context context = this.o;
            long id = this.f12215b.getId();
            long ownerUserId = this.f12215b.getOwnerUserId();
            long id2 = this.f12214a.getId();
            String secUid = this.f12214a.getSecUid();
            long messageId = this.f12217d.getMessageId();
            com.bytedance.android.livesdk.ac.b.a aVar = this.f12217d;
            if (aVar instanceof i) {
                str = ((i) aVar).f19629f;
            }
            com.bytedance.android.livesdkapi.model.d dVar = new com.bytedance.android.livesdkapi.model.d(id, ownerUserId, id2, secUid, UGCMonitor.EVENT_COMMENT, messageId, str, this.f12215b.getRequestId(), a2, d2, this.p, "1");
            dVar.s = ((e) com.bytedance.android.live.t.a.a(e.class)).getReportScene();
            eVar.report(context, dVar);
            a("report");
        } else {
            boolean z = true;
            if (num != null && num.intValue() == R.id.dl0) {
                User user = this.f12214a;
                ap apVar = new ap(com.bytedance.android.livesdk.ac.g.a(user), str);
                apVar.f15109e = user;
                com.bytedance.android.livesdk.an.a.a().a(apVar);
                bf.a().a(true);
            } else {
                String str2 = "anchor";
                if (num != null) {
                    if (num.intValue() == R.id.crm) {
                        if (this.f12214a.getUserAttr() != null) {
                            ba userAttr = this.f12214a.getUserAttr();
                            l.b(userAttr, str);
                            if (userAttr.f19029a) {
                                z = false;
                            }
                        }
                        e eVar2 = (e) com.bytedance.android.live.t.a.a(e.class);
                        if (z) {
                            eVar2.getMuteDuration().d(new C0256a(this, eVar2));
                        } else {
                            eVar2.unmuteUser(this.f12214a, this.f12215b.getId(), this);
                            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_unmute_comment").a();
                            if (!this.f12216c) {
                                str2 = "admin";
                            }
                            a3.a("admin_type", str2).a("anchor_id", this.f12215b.getOwnerUserId()).a("room_id", this.f12215b.getId()).a("to_user_id", this.f12214a.getId()).b();
                        }
                        dismiss();
                        return;
                    } else if (num.intValue() == R.id.c3v) {
                        User user2 = this.f12214a;
                        Dialog ensureKickOutDialog = ((e) com.bytedance.android.live.t.a.a(e.class)).getEnsureKickOutDialog(this.o, this.f12215b.getId(), this.f12215b.getOwnerUserId(), user2.getId(), null);
                        if (ensureKickOutDialog != null) {
                            ensureKickOutDialog.show();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("anchor_id", String.valueOf(this.f12215b.getOwnerUserId()));
                        String idStr = this.f12215b.getIdStr();
                        l.b(idStr, str);
                        hashMap.put("room_id", idStr);
                        if (!this.f12216c) {
                            str2 = "admin";
                        }
                        hashMap.put("admin_type", str2);
                        hashMap.put("user_id", String.valueOf(user2.getId()));
                        b.a.a("blocked_list_click").a().a((Map<String, String>) hashMap).b("relation").c("click").b();
                        a("block");
                    } else if (num.intValue() == R.id.dmf) {
                        b(false);
                        return;
                    } else if (num.intValue() == R.id.eqg) {
                        h.f.a.a<z> aVar2 = this.s;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        dismiss();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        MethodCollector.i(7141);
        Drawable drawable = null;
        setContentView(getLayoutInflater().inflate(R.layout.b78, (ViewGroup) null));
        ((FrameLayout) findViewById(R.id.epv)).setOnClickListener(new b(this));
        Drawable a2 = androidx.core.content.b.a(getContext(), (int) R.drawable.bsq);
        if (a2 != null) {
            a2.mutate();
            androidx.core.graphics.drawable.a.a(a2, com.bytedance.android.live.design.b.a(getContext(), (int) R.attr.am3));
            drawable = a2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.csh);
        l.b(linearLayout, "");
        linearLayout.setDividerDrawable(drawable);
        View findViewById = findViewById(R.id.dmf);
        l.b(findViewById, "");
        this.f12223m = findViewById;
        View findViewById2 = findViewById(R.id.dby);
        l.b(findViewById2, "");
        this.n = findViewById2;
        View view = this.f12223m;
        if (view == null) {
            l.a("retry");
        }
        view.setOnClickListener(this);
        LiveActionButton liveActionButton = (LiveActionButton) findViewById(R.id.a1p);
        if (liveActionButton != null) {
            liveActionButton.setOnClickListener(new c(this));
        }
        LiveActionButton liveActionButton2 = (LiveActionButton) findViewById(R.id.dlm);
        if (liveActionButton2 != null) {
            liveActionButton2.setOnClickListener(this);
        }
        LiveActionButton liveActionButton3 = (LiveActionButton) findViewById(R.id.dl0);
        if (liveActionButton3 != null) {
            liveActionButton3.setOnClickListener(this);
        }
        LiveActionButton liveActionButton4 = (LiveActionButton) findViewById(R.id.crm);
        if (liveActionButton4 != null) {
            liveActionButton4.setOnClickListener(this);
        }
        LiveActionButton liveActionButton5 = (LiveActionButton) findViewById(R.id.c3v);
        if (liveActionButton5 != null) {
            liveActionButton5.setOnClickListener(this);
        }
        ((LiveActionButton) findViewById(R.id.eqg)).setOnClickListener(this);
        b(false);
        if (this.q) {
            LiveActionButton liveActionButton6 = (LiveActionButton) findViewById(R.id.eqg);
            l.b(liveActionButton6, "");
            liveActionButton6.setVisibility(0);
            ((LiveActionButton) findViewById(R.id.eqg)).setText(this.r);
            MethodCollector.o(7141);
            return;
        }
        LiveActionButton liveActionButton7 = (LiveActionButton) findViewById(R.id.eqg);
        l.b(liveActionButton7, "");
        liveActionButton7.setVisibility(8);
        MethodCollector.o(7141);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        if (com.bytedance.android.livesdk.utils.p.c(java.lang.Boolean.valueOf(r1)) != false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(boolean r10) {
        /*
        // Method dump skipped, instructions count: 533
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.publicscreen.impl.b.a.b(boolean):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, User user, Room room, boolean z, com.bytedance.android.livesdk.ac.b.a aVar, com.bytedance.android.live.base.model.user.b bVar, String str, boolean z2, String str2, h.f.a.a<z> aVar2) {
        super(context, true);
        long j2;
        l.d(context, "");
        l.d(user, "");
        l.d(room, "");
        l.d(aVar, "");
        l.d(str, "");
        l.d(str2, "");
        boolean z3 = true;
        this.o = context;
        this.f12214a = user;
        this.f12215b = room;
        this.f12216c = z;
        this.f12217d = aVar;
        this.f12218e = bVar;
        this.p = str;
        this.q = z2;
        this.r = str2;
        this.s = aVar2;
        b bVar2 = new b();
        bVar2.a(this);
        this.f12219i = bVar2;
        long id = this.f12214a.getId();
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 != null) {
            j2 = b2.c();
        } else {
            j2 = 0;
        }
        this.f12222l = id != j2 ? false : z3;
    }
}
