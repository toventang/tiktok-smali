package com.bytedance.android.live.liveinteract.multiguest.g.b;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.api.as;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.api.b.o;
import com.bytedance.android.live.liveinteract.multiguest.a.b.b;
import com.bytedance.android.live.liveinteract.multiguest.g.b.a;
import com.bytedance.android.live.liveinteract.multilive.c.r;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import java.util.HashMap;

public final class b extends a {

    /* renamed from: m  reason: collision with root package name */
    public User f11254m;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a n;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_USER_INFO_CENTER")
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d o;
    n p;
    private boolean q;
    private View r;
    private HashMap s;

    static {
        Covode.recordClassIndex(6050);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a, com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a
    public final View b(int i2) {
        if (this.s == null) {
            this.s = new HashMap();
        }
        View view = (View) this.s.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.s.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a
    public final int getWindowLayoutId() {
        return R.layout.bfi;
    }

    public final n getMType() {
        return this.p;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a getMDataHolder() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.n;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        return aVar;
    }

    public final com.bytedance.android.live.liveinteract.multiguest.a.c.d getMInfoCenter() {
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.o;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            mDataChannel.b(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        ((ConstraintLayout) b(R.id.c6p)).post(new l(this));
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        ((HSImageView) b(R.id.cz3)).post(new k(this));
    }

    /* access modifiers changed from: package-private */
    public final String getAnchorName() {
        Room room;
        User owner;
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel == null || (room = (Room) mDataChannel.b(df.class)) == null || (owner = room.getOwner()) == null) {
            return null;
        }
        return owner.getNickName();
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        long j2;
        Room room;
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel == null || (room = (Room) mDataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getOwnerUserId();
        }
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        h.f.b.l.b(b2, "");
        if (j2 == b2.c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11261a;

        static {
            Covode.recordClassIndex(6061);
        }

        k(b bVar) {
            this.f11261a = bVar;
        }

        public final void run() {
            ConstraintLayout.a aVar = new ConstraintLayout.a(y.a(60.0f), y.a(60.0f));
            if (this.f11261a.getMType() == n.GRID_FIX || this.f11261a.getMType() == n.GRID) {
                HSImageView hSImageView = (HSImageView) this.f11261a.b(R.id.cz3);
                h.f.b.l.b(hSImageView, "");
                if (!com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(hSImageView)) {
                    aVar.f2051h = R.id.cyy;
                    aVar.topMargin = y.a(78.0f);
                    aVar.f2047d = R.id.cyy;
                    aVar.f2050g = R.id.cyy;
                    HSImageView hSImageView2 = (HSImageView) this.f11261a.b(R.id.cz3);
                    h.f.b.l.b(hSImageView2, "");
                    hSImageView2.setLayoutParams(aVar);
                }
            }
            aVar.f2051h = R.id.cyy;
            aVar.f2054k = R.id.cyy;
            aVar.f2047d = R.id.cyy;
            aVar.f2050g = R.id.cyy;
            HSImageView hSImageView22 = (HSImageView) this.f11261a.b(R.id.cz3);
            h.f.b.l.b(hSImageView22, "");
            hSImageView22.setLayoutParams(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11262a;

        static {
            Covode.recordClassIndex(6062);
        }

        l(b bVar) {
            this.f11262a = bVar;
        }

        public final void run() {
            ConstraintLayout.a aVar = new ConstraintLayout.a(-2, -2);
            aVar.f2047d = R.id.cyy;
            aVar.q = R.id.cyy;
            aVar.leftMargin = y.a(8.0f);
            aVar.setMarginStart(y.a(8.0f));
            aVar.rightMargin = y.a(8.0f);
            aVar.setMarginEnd(y.a(8.0f));
            if (this.f11262a.getMType() == n.GRID_FIX || this.f11262a.getMType() == n.GRID) {
                aVar.f2049f = R.id.cz5;
                aVar.r = R.id.cz5;
                aVar.f2051h = R.id.cyy;
                aVar.topMargin = y.a(8.0f);
            } else {
                aVar.f2050g = R.id.cyy;
                aVar.s = R.id.cyy;
                aVar.f2054k = R.id.cyy;
                aVar.bottomMargin = y.a(8.0f);
            }
            aVar.T = true;
            aVar.z = 0.0f;
            aVar.G = 0;
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f11262a.b(R.id.c6p);
            h.f.b.l.b(constraintLayout, "");
            constraintLayout.setLayoutParams(aVar);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f11262a.b(R.id.c6p);
            h.f.b.l.b(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
        }
    }

    private final void h() {
        ImageModel imageModel;
        User user = this.f11254m;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        HSImageView hSImageView = (HSImageView) b(R.id.cz3);
        h.f.b.l.b(hSImageView, "");
        int width = hSImageView.getWidth();
        HSImageView hSImageView2 = (HSImageView) b(R.id.cz3);
        h.f.b.l.b(hSImageView2, "");
        com.bytedance.android.livesdk.chatroom.g.g.a((ImageView) b(R.id.cz3), imageModel, width, hSImageView2.getHeight(), 2131234424);
        z zVar = new z(5, 0.0f);
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(com.facebook.common.k.g.a(2131234424));
            a2.f48454k = zVar;
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47315c = (REQUEST) a2.a();
            com.facebook.drawee.view.c cVar = (com.facebook.drawee.view.c) b(R.id.cz6);
            h.f.b.l.b(cVar, "");
            b2.f47325m = cVar.getController();
            com.facebook.drawee.c.a c2 = b2.e();
            com.facebook.drawee.view.c cVar2 = (com.facebook.drawee.view.c) b(R.id.cz6);
            h.f.b.l.b(cVar2, "");
            cVar2.setController(c2);
            return;
        }
        com.bytedance.android.live.core.f.k.a((HSImageView) b(R.id.cz6), imageModel, zVar);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a
    public final void a() {
        super.a();
        if (g()) {
            getMAvatarBackground().setVisibility(0);
        } else {
            getMAvatarBackground().setVisibility(8);
        }
        if (g() || (!getMCurrentUserIsLinkedGuest() && getMPresenter().d())) {
            View findViewById = findViewById(R.id.cz4);
            h.f.b.l.b(findViewById, "");
            this.r = findViewById;
            if (findViewById == null) {
                h.f.b.l.a("mOnlinePlayerClose");
            }
            findViewById.setVisibility(0);
            View view = this.r;
            if (view == null) {
                h.f.b.l.a("mOnlinePlayerClose");
            }
            view.setOnClickListener(new e(this));
        }
        e();
        f();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DataChannel mDataChannel = getMDataChannel();
        if (mDataChannel != null) {
            if (getMPresenter().d()) {
                mDataChannel.a(this, com.bytedance.android.live.liveinteract.multilive.c.i.class, new f(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.j.class, new g(this));
            } else {
                mDataChannel.a(this, com.bytedance.android.live.liveinteract.multilive.c.k.class, new h(this)).a(this, com.bytedance.android.live.liveinteract.multilive.c.l.class, new i(this));
            }
            mDataChannel.a(this, as.class, new j(this));
        }
        c(!a(getInteractId()));
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.n;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        Boolean bool = aVar.b().get(getInteractId());
        if (bool == null) {
            bool = false;
        }
        h.f.b.l.b(bool, "");
        b(!bool.booleanValue());
    }

    public final void setMType(n nVar) {
        this.p = nVar;
    }

    public final void setMDataHolder(com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar) {
        h.f.b.l.d(aVar, "");
        this.n = aVar;
    }

    public final void setMInfoCenter(com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar) {
        h.f.b.l.d(dVar, "");
        this.o = dVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.g.b.b$b  reason: collision with other inner class name */
    static final class C0219b implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0219b f11257a = new C0219b();

        static {
            Covode.recordClassIndex(6052);
        }

        C0219b() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class d implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11259a = new d();

        static {
            Covode.recordClassIndex(6054);
        }

        d() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(0);
            dialogInterface.dismiss();
        }
    }

    static final class j extends m implements h.f.a.b<o, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6060);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(o oVar) {
            o oVar2 = oVar;
            h.f.b.l.d(oVar2, "");
            b bVar = this.this$0;
            bVar.p = oVar2.f10003a;
            bVar.e();
            bVar.f();
            return h.z.f158842a;
        }
    }

    public final void b(boolean z) {
        int i2;
        ImageView imageView = (ImageView) b(R.id.cz5);
        if (imageView != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
        e();
    }

    static final class c implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11258a;

        static {
            Covode.recordClassIndex(6053);
        }

        c(b bVar) {
            this.f11258a = bVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            this.f11258a.a(3);
            DataChannel mDataChannel = this.f11258a.getMDataChannel();
            if (mDataChannel != null) {
                mDataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.j.class);
            }
            com.bytedance.android.live.liveinteract.platform.common.g.i.b(1);
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.platform.common.g.g.a("guest_over_quickly", this.f11258a.getMDataHolder().q);
        }
    }

    static final class f extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.this$0.b(booleanValue);
            this.this$0.getMDataHolder().b().put(this.this$0.getInteractId(), Boolean.valueOf(!booleanValue));
            return h.z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            this.this$0.c(booleanValue);
            this.this$0.getMDataHolder().a().put(this.this$0.getInteractId(), Boolean.valueOf(!booleanValue));
            return h.z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.android.live.liveinteract.multilive.c.d, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6058);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.multilive.c.d dVar) {
            com.bytedance.android.live.liveinteract.multilive.c.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            b bVar = this.this$0;
            if (h.f.b.l.a((Object) dVar2.f11758a, (Object) bVar.getMPresenter().c())) {
                bVar.b(!dVar2.f11759b);
            }
            return h.z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.b<r, h.z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6059);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(r rVar) {
            r rVar2 = rVar;
            h.f.b.l.d(rVar2, "");
            b bVar = this.this$0;
            if (h.f.b.l.a((Object) rVar2.f11773a, (Object) bVar.getMPresenter().c())) {
                bVar.c(!rVar2.f11774b);
            }
            return h.z.f158842a;
        }
    }

    static final class a implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11255a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f11256b;

        static {
            Covode.recordClassIndex(6051);
        }

        a(b bVar, String str) {
            this.f11255a = bVar;
            this.f11256b = str;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            long j2;
            h.f.b.l.d(dialogInterface, "");
            this.f11255a.a(3);
            DataChannel mDataChannel = this.f11255a.getMDataChannel();
            if (mDataChannel != null) {
                mDataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.a.class, this.f11256b);
            }
            dialogInterface.dismiss();
            User user = this.f11255a.f11254m;
            if (user != null) {
                j2 = user.getId();
            } else {
                j2 = 0;
            }
            n nVar = this.f11255a.getMDataHolder().q;
            String remove = com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.remove(Long.valueOf(j2));
            if (remove != null && com.bytedance.android.live.liveinteract.platform.common.g.f.f11959b.size() == 0) {
                com.bytedance.android.live.liveinteract.platform.common.g.f.a("connection_end_quickly", j2, 0, nVar, remove, 4);
            }
        }
    }

    private final boolean a(String str) {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.n;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        Boolean bool = aVar.a().get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.o;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        if (dVar.a(str) == 2) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.n;
            if (aVar2 == null) {
                h.f.b.l.a("mDataHolder");
            }
            aVar2.a().put(str, true);
            return true;
        } else if (!getMPresenter().d()) {
            return false;
        } else {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.n;
            if (aVar3 == null) {
                h.f.b.l.a("mDataHolder");
            }
            if (!aVar3.f11294d) {
                return true;
            }
            return false;
        }
    }

    public final void c(boolean z) {
        if (z) {
            HSImageView hSImageView = (HSImageView) b(R.id.cz3);
            h.f.b.l.b(hSImageView, "");
            hSImageView.setVisibility(8);
            HSImageView hSImageView2 = (HSImageView) b(R.id.cz6);
            h.f.b.l.b(hSImageView2, "");
            hSImageView2.setVisibility(8);
            return;
        }
        HSImageView hSImageView3 = (HSImageView) b(R.id.cz3);
        h.f.b.l.b(hSImageView3, "");
        hSImageView3.setVisibility(0);
        HSImageView hSImageView4 = (HSImageView) b(R.id.cz6);
        h.f.b.l.b(hSImageView4, "");
        hSImageView4.setVisibility(0);
        if (!this.q) {
            this.q = true;
            h();
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11260a;

        static {
            Covode.recordClassIndex(6055);
        }

        e(b bVar) {
            this.f11260a = bVar;
        }

        public final void onClick(View view) {
            String secUid;
            b bVar = this.f11260a;
            if (bVar.g()) {
                Object[] objArr = new Object[1];
                User user = bVar.f11254m;
                String str = null;
                if (user != null) {
                    str = user.displayId;
                }
                objArr[0] = str;
                String a2 = y.a((int) R.string.e0e, objArr);
                User user2 = bVar.f11254m;
                if (user2 != null && (secUid = user2.getSecUid()) != null) {
                    LiveDialog.a aVar = new LiveDialog.a(bVar.getContext());
                    aVar.f9375c = a2;
                    aVar.b(R.string.e0f).a(R.string.e07, new a(bVar, secUid)).b(R.string.ei0, C0219b.f11257a).a().show();
                    return;
                }
                return;
            }
            String a3 = y.a((int) R.string.e0e, bVar.getAnchorName());
            String str2 = LinkApi.d.WINDOW.value;
            h.f.b.l.b(str2, "");
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(str2);
            LiveDialog.a aVar2 = new LiveDialog.a(bVar.getContext());
            aVar2.f9375c = a3;
            aVar2.b(R.string.e6n).a(R.string.ei8, new c(bVar)).b(R.string.eid, d.f11259a).a().show();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a
    public final void a(int i2) {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.n;
        if (aVar == null) {
            h.f.b.l.a("mDataHolder");
        }
        setMultiLiveEnable(aVar.f11298h);
        super.a(i2);
        if ((i2 == 0 || i2 == 1) && !a(getInteractId())) {
            getMPrepareAvatar().setVisibility(8);
        }
        getMPrepareHint().setVisibility(8);
        if (!g()) {
            getMAvatarBackground().setVisibility(8);
        }
        getMWaveEffectView().setVisibility(8);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.g.b.a, com.bytedance.android.live.liveinteract.multiguest.a.b.b.AbstractC0207b
    public final void a(User user) {
        ImageModel imageModel;
        if (user != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        com.bytedance.android.livesdk.chatroom.g.g.a(getMPrepareAvatar(), imageModel, getMPrepareAvatar().getWidth(), getMPrepareAvatar().getHeight(), 2131234424);
        z zVar = new z(5, 0.0f);
        if (g()) {
            if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(com.facebook.common.k.g.a(2131234424));
                a2.f48454k = zVar;
                com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47315c = (REQUEST) a2.a();
                b2.f47325m = getMAvatarBackground().getController();
                getMAvatarBackground().setController(b2.e());
            } else {
                com.bytedance.android.live.core.f.k.a(getMAvatarBackground(), imageModel, zVar);
            }
        }
        getMOnlineName().setText(com.bytedance.android.livesdk.ac.g.a(user));
        this.f11254m = user;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, b.a aVar, a.AbstractC0218a aVar2, DataChannel dataChannel, n nVar) {
        super(context, str, aVar, aVar2, dataChannel);
        h.f.b.l.d(context, "");
        h.f.b.l.d(str, "");
        h.f.b.l.d(aVar, "");
        this.p = nVar;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }
}
