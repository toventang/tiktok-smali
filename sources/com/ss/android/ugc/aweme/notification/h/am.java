package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.ss.android.ugc.aweme.notification.bean.RoomInfo;
import com.ss.android.ugc.aweme.notification.bean.f;
import com.ss.android.ugc.aweme.notification.utils.e;
import com.ss.android.ugc.aweme.notification.utils.g;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.em;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class am extends p implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final int f113543a = 14;

    /* renamed from: b  reason: collision with root package name */
    private final View f113544b;

    /* renamed from: c  reason: collision with root package name */
    private final AvatarImageWithVerify f113545c;

    /* renamed from: d  reason: collision with root package name */
    private final TextView f113546d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f113547e;

    /* renamed from: f  reason: collision with root package name */
    private final Button f113548f;
    private f q;
    private long[] r;
    private int s;

    static {
        Covode.recordClassIndex(72996);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        return false;
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k
    public final void f() {
        super.g();
        com.ss.android.ugc.aweme.notification.bean.f fVar = this.q;
        if (fVar != null) {
            this.f113487h.a(fVar, new a(this, fVar));
        }
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.notification.bean.f $notice;
        final /* synthetic */ am this$0;

        static {
            Covode.recordClassIndex(72997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(am amVar, com.ss.android.ugc.aweme.notification.bean.f fVar) {
            super(0);
            this.this$0 = amVar;
            this.$notice = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = this.this$0.f113649k;
            String str = this.this$0.f113650l;
            l.b(str, "");
            e.a("live", i2, str, this.this$0.f113487h.a(), this.$notice.templateId);
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public am(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.cxx);
        l.b(findViewById, "");
        this.f113544b = findViewById;
        View findViewById2 = view.findViewById(R.id.cx6);
        l.b(findViewById2, "");
        AvatarImageWithVerify avatarImageWithVerify = (AvatarImageWithVerify) findViewById2;
        this.f113545c = avatarImageWithVerify;
        View findViewById3 = view.findViewById(R.id.cxm);
        l.b(findViewById3, "");
        this.f113546d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cwx);
        l.b(findViewById4, "");
        this.f113547e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.cww);
        l.b(findViewById5, "");
        Button button = (Button) findViewById5;
        this.f113548f = button;
        this.s = -1;
        g.a(findViewById);
        com.ss.android.ugc.aweme.notification.g.a.a(avatarImageWithVerify);
        com.ss.android.ugc.aweme.notification.g.a.a(button);
        button.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageWithVerify.setOnClickListener(this);
        avatarImageWithVerify.setRequestImgSize(em.a(101));
    }

    @Override // com.ss.android.ugc.aweme.notification.h.a
    public final void onClick(View view) {
        User user;
        Integer valueOf;
        boolean z;
        long j2;
        RoomInfo roomInfo;
        Long l2;
        long j3;
        RoomInfo roomInfo2;
        Long l3;
        RoomInfo roomInfo3;
        Boolean bool;
        ClickAgent.onClick(view);
        d.a();
        if (!j.f107229h || !j.b() || j.c()) {
            j.f107229h = c();
        }
        if (!j.f107229h) {
            View view2 = this.itemView;
            l.b(view2, "");
            new b(view2).e(R.string.de8).b();
            return;
        }
        com.ss.android.ugc.aweme.notification.bean.f fVar = this.q;
        if (fVar != null && (user = fVar.f113246a) != null && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.cxx || valueOf.intValue() == R.id.cww) {
                a("live", getLayoutPosition());
                LogHelper a2 = LogHelperImpl.a();
                Context context = this.f113647i;
                l.b(context, "");
                String requestId = user.getRequestId();
                String uid = user.getUid();
                l.b(uid, "");
                a2.a(context, requestId, uid, user.roomId);
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                com.ss.android.ugc.aweme.notification.bean.f fVar2 = this.q;
                if (fVar2 == null || (roomInfo3 = fVar2.f113248c) == null || (bool = roomInfo3.liveTypeScreenshot) == null) {
                    z = false;
                } else {
                    z = bool.booleanValue();
                }
                roomsData.aq = z;
                if (com.bytedance.ies.abmock.b.a().a(true, "enable_inbox_live_slide", false)) {
                    ILiveOuterService s2 = LiveOuterService.s();
                    l.b(s2, "");
                    com.ss.android.ugc.aweme.r.a i2 = s2.i();
                    Context context2 = this.f113647i;
                    long[] jArr = this.r;
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    com.ss.android.ugc.aweme.notification.bean.f fVar3 = this.q;
                    if (fVar3 == null || (roomInfo2 = fVar3.f113248c) == null || (l3 = roomInfo2.ownerUserId) == null) {
                        j3 = 0;
                    } else {
                        j3 = l3.longValue();
                    }
                    i2.a(context2, enterRoomConfig, user, jArr, j3, this.s);
                    return;
                }
                ILiveOuterService s3 = LiveOuterService.s();
                l.b(s3, "");
                com.ss.android.ugc.aweme.r.a i3 = s3.i();
                Context context3 = this.f113647i;
                long[] jArr2 = new long[0];
                com.ss.android.ugc.aweme.notification.bean.f fVar4 = this.q;
                if (fVar4 == null || (roomInfo = fVar4.f113248c) == null || (l2 = roomInfo.ownerUserId) == null) {
                    j2 = 0;
                } else {
                    j2 = l2.longValue();
                }
                i3.a(context3, enterRoomConfig, user, jArr2, j2, this.s);
            } else if (valueOf.intValue() == R.id.cx6) {
                k.b(user.getUid(), user.getSecUid(), "message");
                k.a(user.getUid(), "notification_page", "click_head");
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public final void a(com.ss.android.ugc.aweme.notification.bean.f r7, long[] r8, int r9) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.am.a(com.ss.android.ugc.aweme.notification.bean.f, long[], int):void");
    }
}
