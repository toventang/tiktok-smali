package com.bytedance.android.livesdk.wishlist.widget;

import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.gift.LiveWishlistAnchorpanelUrlSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdk.wishlist.a.a;
import com.bytedance.android.livesdk.wishlist.b.a;
import com.bytedance.android.livesdk.wishlist.d.a;
import com.bytedance.android.livesdk.wishlist.view.WishContributorView;
import com.bytedance.android.livesdk.wishlist.view.WishGiftView;
import com.bytedance.android.livesdk.wishlist.view.WishListInProgressView;
import com.bytedance.android.livesdk.wishlist.view.WishListNotSetView;
import com.bytedance.android.livesdk.wishlist.view.WishListServerErrorView;
import com.bytedance.android.livesdk.wishlist.view.WishListThanksView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.List;

public final class WishListWidget extends RoomRecycleWidget implements a.b, au {

    /* renamed from: c  reason: collision with root package name */
    public static final a f22889c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.android.livesdk.wishlist.b.a f22890a;

    /* renamed from: b  reason: collision with root package name */
    public final a.AbstractC0495a f22891b = new com.bytedance.android.livesdk.wishlist.d.a();

    /* renamed from: d  reason: collision with root package name */
    private final h f22892d = i.a((h.f.a.a) new d(this));

    /* renamed from: e  reason: collision with root package name */
    private final h f22893e = i.a((h.f.a.a) new c(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f22894f = i.a((h.f.a.a) new e(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f22895g = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(13522);
    }

    private final WishListNotSetView c() {
        return (WishListNotSetView) this.f22892d.getValue();
    }

    private final WishListInProgressView d() {
        return (WishListInProgressView) this.f22893e.getValue();
    }

    private final WishListThanksView e() {
        return (WishListThanksView) this.f22894f.getValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return ((Boolean) this.f22895g.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bht;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13523);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<WishListInProgressView> {
        final /* synthetic */ WishListWidget this$0;

        static {
            Covode.recordClassIndex(13525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(WishListWidget wishListWidget) {
            super(0);
            this.this$0 = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishListInProgressView invoke() {
            return this.this$0.findViewById(R.id.fn2);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<WishListNotSetView> {
        final /* synthetic */ WishListWidget this$0;

        static {
            Covode.recordClassIndex(13526);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(WishListWidget wishListWidget) {
            super(0);
            this.this$0 = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishListNotSetView invoke() {
            return this.this$0.findViewById(R.id.fn4);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<WishListThanksView> {
        final /* synthetic */ WishListWidget this$0;

        static {
            Covode.recordClassIndex(13527);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(WishListWidget wishListWidget) {
            super(0);
            this.this$0 = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WishListThanksView invoke() {
            return this.this$0.findViewById(R.id.fn7);
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<Boolean> {
        final /* synthetic */ WishListWidget this$0;

        static {
            Covode.recordClassIndex(13524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(WishListWidget wishListWidget) {
            super(0);
            this.this$0 = wishListWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Boolean bool;
            DataChannel dataChannel = this.this$0.dataChannel;
            if (dataChannel == null || (bool = (Boolean) dataChannel.b(ee.class)) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            return Boolean.valueOf(z);
        }
    }

    private final void f() {
        c().setVisibility(8);
        d().setVisibility(8);
        e().setVisibility(8);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        com.bytedance.android.livesdk.wishlist.b.a aVar;
        com.bytedance.android.livesdk.wishlist.b.a aVar2 = this.f22890a;
        if (!(aVar2 == null || !aVar2.n() || (aVar = this.f22890a) == null)) {
            aVar.dismiss();
        }
        this.f22891b.a();
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.b
    public final void a() {
        SpannableString spannableString;
        int i2;
        f();
        View view = getView();
        if (view != null) {
            view.setVisibility(0);
        }
        int i3 = a.f22897a[this.f22891b.b().ordinal()];
        if (i3 != 1) {
            ImageModel imageModel = null;
            if (i3 == 2) {
                d().setVisibility(0);
                WishListInProgressView d2 = d();
                List<x.a> c2 = this.f22891b.c();
                l.d(c2, "");
                if (!c2.isEmpty()) {
                    d2.f22874g = c2;
                }
                if (!d2.f22874g.isEmpty()) {
                    d2.f22875h = (d2.f22875h + 1) % d2.f22874g.size();
                    x.a aVar = (x.a) d2.f22874g.get(d2.f22875h);
                    HSImageView mGiftIcon = d2.getMGiftIcon();
                    x.a.C0373a aVar2 = aVar.f17967e;
                    if (aVar2 != null) {
                        imageModel = aVar2.f17969b;
                    }
                    g.a(mGiftIcon, imageModel);
                    int i4 = aVar.f17965c;
                    int i5 = aVar.f17966d;
                    if (!y.g()) {
                        spannableString = new SpannableString(new StringBuilder().append(i4).append('/').append(i5).toString());
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FACE15")), 0, String.valueOf(i4).length(), 33);
                    } else {
                        String sb = new StringBuilder().append(i5).append('/').append(i4).toString();
                        spannableString = new SpannableString(sb);
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FACE15")), sb.length() - String.valueOf(i4).length(), sb.length(), 33);
                    }
                    d2.getMWishesProgressText().setText(spannableString);
                    ProgressBar mWishListProgressView = d2.getMWishListProgressView();
                    double d3 = (double) i4;
                    double d4 = (double) i5;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    double d5 = (d3 / d4) * 100.0d;
                    if (d5 > 100.0d) {
                        i2 = 100;
                    } else {
                        i2 = (int) d5;
                    }
                    mWishListProgressView.setProgress(i2);
                }
            } else if (i3 == 3) {
                e().setVisibility(0);
                WishListThanksView e2 = e();
                if (!this.f22891b.d().isEmpty()) {
                    imageModel = this.f22891b.d().get(0).f17972a;
                }
                if (imageModel != null) {
                    ImageView mAvatarView = e2.getMAvatarView();
                    ImageView mAvatarView2 = e2.getMAvatarView();
                    l.b(mAvatarView2, "");
                    int width = mAvatarView2.getWidth();
                    ImageView mAvatarView3 = e2.getMAvatarView();
                    l.b(mAvatarView3, "");
                    g.a(mAvatarView, imageModel, width, mAvatarView3.getHeight(), 2131234424);
                } else {
                    ImageView mAvatarView4 = e2.getMAvatarView();
                    ImageView mAvatarView5 = e2.getMAvatarView();
                    l.b(mAvatarView5, "");
                    int width2 = mAvatarView5.getWidth();
                    ImageView mAvatarView6 = e2.getMAvatarView();
                    l.b(mAvatarView6, "");
                    p.a(mAvatarView4, 2131234424, width2, mAvatarView6.getHeight());
                }
                int i6 = com.bytedance.android.livesdk.wishlist.view.a.f22888a[e2.f22881g.ordinal()];
                if (i6 == 1) {
                    ConstraintLayout mFulfilledLayout = e2.getMFulfilledLayout();
                    l.b(mFulfilledLayout, "");
                    mFulfilledLayout.setVisibility(0);
                    ConstraintLayout mThanksLayout = e2.getMThanksLayout();
                    l.b(mThanksLayout, "");
                    mThanksLayout.setVisibility(8);
                    e2.f22881g = WishListThanksView.a.THANKS;
                } else if (i6 == 2) {
                    ConstraintLayout mFulfilledLayout2 = e2.getMFulfilledLayout();
                    l.b(mFulfilledLayout2, "");
                    mFulfilledLayout2.setVisibility(8);
                    ConstraintLayout mThanksLayout2 = e2.getMThanksLayout();
                    l.b(mThanksLayout2, "");
                    mThanksLayout2.setVisibility(0);
                    e2.f22881g = WishListThanksView.a.FULFILLED;
                }
            }
        } else if (b()) {
            c().setVisibility(0);
            c();
        } else {
            View view2 = getView();
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view = getView();
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.dataChannel != null) {
            f();
            a.AbstractC0495a aVar = this.f22891b;
            DataChannel dataChannel = this.dataChannel;
            l.b(dataChannel, "");
            aVar.a(dataChannel, this);
            View view2 = getView();
            if (view2 != null) {
                view2.setOnClickListener(new f(this));
            }
            if (b()) {
                com.bytedance.android.livesdk.wishlist.c.b.a();
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WishListWidget f22896a;

        static {
            Covode.recordClassIndex(13528);
        }

        f(WishListWidget wishListWidget) {
            this.f22896a = wishListWidget;
        }

        public final void onClick(View view) {
            Room room;
            User user;
            androidx.fragment.app.i iVar;
            com.bytedance.android.livesdk.wishlist.b.a aVar;
            WishListWidget wishListWidget = this.f22896a;
            if (wishListWidget.b()) {
                ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(wishListWidget.context, Uri.parse(LiveWishlistAnchorpanelUrlSetting.INSTANCE.getValue()));
            } else {
                DataChannel dataChannel = wishListWidget.dataChannel;
                if (dataChannel != null) {
                    room = (Room) dataChannel.b(df.class);
                    if (room != null) {
                        user = room.getOwner();
                    }
                    user = null;
                } else {
                    room = null;
                    user = null;
                }
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                l.b(b2, "");
                User from = User.from(b2.a());
                DataChannel dataChannel2 = wishListWidget.dataChannel;
                if (dataChannel2 != null) {
                    iVar = (androidx.fragment.app.i) dataChannel2.b(ao.class);
                } else {
                    iVar = null;
                }
                if (!(room == null || room.getOwnerUserId() <= 0 || room.getId() <= 0 || user == null || from == null || iVar == null)) {
                    a.C0496a aVar2 = new a.C0496a();
                    l.d(user, "");
                    aVar2.f22827b = user;
                    l.d(room, "");
                    aVar2.f22826a = room;
                    l.d(from, "");
                    aVar2.f22828c = from;
                    if (aVar2.f22826a == null || aVar2.f22827b == null || aVar2.f22828c == null) {
                        aVar = null;
                    } else {
                        aVar = new com.bytedance.android.livesdk.wishlist.b.a((byte) 0);
                        Room room2 = aVar2.f22826a;
                        if (room2 == null) {
                            l.b();
                        }
                        aVar.f22814a = room2;
                        User user2 = aVar2.f22827b;
                        if (user2 == null) {
                            l.b();
                        }
                        aVar.f22815b = user2;
                        User user3 = aVar2.f22828c;
                        if (user3 == null) {
                            l.b();
                        }
                        aVar.f22816c = user3;
                    }
                    wishListWidget.f22890a = aVar;
                    com.bytedance.android.livesdk.wishlist.b.a aVar3 = wishListWidget.f22890a;
                    if (aVar3 != null) {
                        aVar3.show(iVar, "WISH_LIST_WIDGET");
                    }
                }
            }
            this.f22896a.f22891b.a(true, (h.f.a.a<z>) null);
            b.a.a("livesdk_wishlist_entrance_click").a().a(com.bytedance.android.livesdk.wishlist.c.b.a(false)).b();
        }
    }

    @Override // com.bytedance.android.livesdk.wishlist.a.a.b
    public final void a(boolean z, a.c cVar) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        TextPaint textPaint;
        String str;
        com.bytedance.android.livesdk.wishlist.b.a aVar = this.f22890a;
        if (aVar != null && aVar.n()) {
            if (!z || cVar == null || cVar.f22844a.isEmpty()) {
                com.bytedance.android.livesdk.wishlist.b.a aVar2 = this.f22890a;
                if (aVar2 != null) {
                    LiveLoadingView f2 = aVar2.f();
                    if (f2 != null) {
                        f2.setVisibility(8);
                    }
                    WishListServerErrorView e2 = aVar2.e();
                    if (e2 != null) {
                        e2.setVisibility(0);
                    }
                    View d2 = aVar2.d();
                    if (d2 != null) {
                        d2.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            }
            com.bytedance.android.livesdk.wishlist.b.a aVar3 = this.f22890a;
            if (aVar3 != null) {
                l.d(cVar, "");
                LiveLoadingView f3 = aVar3.f();
                if (f3 != null) {
                    f3.setVisibility(8);
                }
                WishListServerErrorView e3 = aVar3.e();
                if (e3 != null) {
                    e3.setVisibility(8);
                }
                View d3 = aVar3.d();
                if (d3 != null) {
                    d3.setVisibility(0);
                }
                aVar3.f22817d = true;
                ImageView imageView = (ImageView) aVar3.f22818e.getValue();
                if (imageView != null) {
                    User user = aVar3.f22815b;
                    if (user == null) {
                        l.a("mAnchor");
                    }
                    g.a(imageView, user.getAvatarThumb(), imageView.getWidth(), imageView.getHeight(), 2131234619);
                }
                LiveTextView g2 = aVar3.g();
                if (g2 != null) {
                    int c2 = y.c() - y.a(97.0f);
                    Object[] objArr = new Object[1];
                    User user2 = aVar3.f22815b;
                    if (user2 == null) {
                        l.a("mAnchor");
                    }
                    objArr[0] = user2.displayId;
                    String a2 = y.a((int) R.string.eqj, objArr);
                    LiveTextView g3 = aVar3.g();
                    if (g3 != null) {
                        textPaint = g3.getPaint();
                    } else {
                        textPaint = null;
                    }
                    float f4 = (float) c2;
                    if (!(a2 == null || "".equals(a2) || textPaint == null)) {
                        Rect rect = new Rect();
                        textPaint.getTextBounds(a2, 0, a2.length(), rect);
                        if (f4 <= ((float) rect.width())) {
                            str = y.a((int) R.string.eqe);
                            l.b(str, "");
                            g2.setText(str);
                        }
                    }
                    Object[] objArr2 = new Object[1];
                    User user3 = aVar3.f22815b;
                    if (user3 == null) {
                        l.a("mAnchor");
                    }
                    objArr2[0] = user3.displayId;
                    str = y.a((int) R.string.eqj, objArr2);
                    l.b(str, "");
                    g2.setText(str);
                }
                LiveTextView liveTextView = (LiveTextView) aVar3.f22819f.getValue();
                if (liveTextView != null) {
                    Object[] objArr3 = new Object[1];
                    User user4 = aVar3.f22816c;
                    if (user4 == null) {
                        l.a("mSelf");
                    }
                    objArr3[0] = user4.displayId;
                    liveTextView.setText(y.a((int) R.string.eqi, objArr3));
                }
                LiveTextView liveTextView2 = (LiveTextView) aVar3.f22820g.getValue();
                if (liveTextView2 != null) {
                    liveTextView2.setText(cVar.f22846c);
                }
                aVar3.a(aVar3.h(), cVar.f22844a.get(0));
                if (cVar.f22844a.size() > 1) {
                    aVar3.a(aVar3.j(), cVar.f22844a.get(1));
                } else {
                    WishGiftView j2 = aVar3.j();
                    if (j2 != null) {
                        j2.setVisibility(8);
                    }
                }
                if (cVar.f22844a.size() > 2) {
                    aVar3.a(aVar3.k(), cVar.f22844a.get(2));
                } else {
                    WishGiftView k2 = aVar3.k();
                    if (k2 != null) {
                        k2.setVisibility(8);
                    }
                }
                int i2 = cVar.f22847d;
                if (i2 <= 0) {
                    View view = aVar3.getView();
                    if (!(view == null || (relativeLayout2 = (RelativeLayout) view.findViewById(R.id.c9e)) == null)) {
                        relativeLayout2.setVisibility(8);
                    }
                    ImageView p = aVar3.p();
                    if (p != null) {
                        p.setVisibility(0);
                    }
                    LiveTextView q = aVar3.q();
                    if (q != null) {
                        com.bytedance.android.livesdk.utils.p.a((View) q, y.a(6.0f));
                    }
                    LiveTextView q2 = aVar3.q();
                    if (q2 != null) {
                        q2.setText(y.a((int) R.string.eqh));
                    }
                } else if (!cVar.f22845b.isEmpty()) {
                    View view2 = aVar3.getView();
                    if (!(view2 == null || (relativeLayout = (RelativeLayout) view2.findViewById(R.id.c9e)) == null)) {
                        relativeLayout.setVisibility(0);
                    }
                    ImageView p2 = aVar3.p();
                    if (p2 != null) {
                        p2.setVisibility(8);
                    }
                    LiveTextView q3 = aVar3.q();
                    if (q3 != null) {
                        com.bytedance.android.livesdk.utils.p.a((View) q3, y.a(12.0f));
                    }
                    LiveTextView q4 = aVar3.q();
                    if (q4 != null) {
                        q4.setText(y.a(R.plurals.gq, i2, Integer.valueOf(i2)));
                    }
                    WishContributorView wishContributorView = (WishContributorView) aVar3.f22821h.getValue();
                    if (wishContributorView != null) {
                        ImageModel imageModel = cVar.f22845b.get(0).f17972a;
                        if (imageModel == null) {
                            imageModel = new ImageModel();
                        }
                        l.b(imageModel, "");
                        wishContributorView.a(new WishContributorView.a(imageModel, 1));
                    }
                    if (i2 > 1) {
                        WishContributorView l2 = aVar3.l();
                        if (l2 != null) {
                            l2.setVisibility(0);
                        }
                        WishContributorView l3 = aVar3.l();
                        if (l3 != null) {
                            ImageModel imageModel2 = cVar.f22845b.get(1).f17972a;
                            if (imageModel2 == null) {
                                imageModel2 = new ImageModel();
                            }
                            l.b(imageModel2, "");
                            l3.a(new WishContributorView.a(imageModel2, 2));
                        }
                    } else {
                        WishContributorView l4 = aVar3.l();
                        if (l4 != null) {
                            l4.setVisibility(8);
                        }
                    }
                    if (i2 > 2) {
                        WishContributorView m2 = aVar3.m();
                        if (m2 != null) {
                            m2.setVisibility(0);
                        }
                        WishContributorView m3 = aVar3.m();
                        if (m3 != null) {
                            ImageModel imageModel3 = cVar.f22845b.get(2).f17972a;
                            if (imageModel3 == null) {
                                imageModel3 = new ImageModel();
                            }
                            l.b(imageModel3, "");
                            m3.a(new WishContributorView.a(imageModel3, 3));
                        }
                    } else {
                        WishContributorView m4 = aVar3.m();
                        if (m4 != null) {
                            m4.setVisibility(8);
                        }
                    }
                    if (i2 > 3) {
                        ImageView o = aVar3.o();
                        if (o != null) {
                            o.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    ImageView o2 = aVar3.o();
                    if (o2 != null) {
                        o2.setVisibility(8);
                    }
                }
            }
        }
    }
}
