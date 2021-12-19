package com.bytedance.android.livesdk.dialogv2.c;

import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.az;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.model.v;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.a.a;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.android.livesdk.service.c.c.a;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public ImageView f16960a;

    /* renamed from: b  reason: collision with root package name */
    public LiveTextView f16961b;

    /* renamed from: c  reason: collision with root package name */
    public HSImageView f16962c;

    /* renamed from: d  reason: collision with root package name */
    public int f16963d = 1;

    /* renamed from: e  reason: collision with root package name */
    public View f16964e;

    /* renamed from: f  reason: collision with root package name */
    LiveNewSendGiftAnimationView f16965f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> f16966g;

    /* renamed from: h  reason: collision with root package name */
    public DataChannel f16967h;

    /* renamed from: i  reason: collision with root package name */
    public AbstractC0352a f16968i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16969j;

    /* renamed from: k  reason: collision with root package name */
    public final View f16970k;

    /* renamed from: l  reason: collision with root package name */
    private LiveTextView f16971l;

    /* renamed from: m  reason: collision with root package name */
    private LiveTextView f16972m;
    private LiveTextView n;
    private ImageView o;

    /* renamed from: com.bytedance.android.livesdk.dialogv2.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0352a {
        static {
            Covode.recordClassIndex(9428);
        }

        void a(a aVar);

        int b(Long l2);
    }

    static {
        Covode.recordClassIndex(9427);
    }

    public boolean e() {
        return false;
    }

    public void h() {
        DataChannel dataChannel = this.f16967h;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16978a;

        static {
            Covode.recordClassIndex(9434);
        }

        g(a aVar) {
            this.f16978a = aVar;
        }

        public final void run() {
            a aVar = this.f16978a;
            LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = aVar.f16965f;
            if (liveNewSendGiftAnimationView != null) {
                liveNewSendGiftAnimationView.setVisibility(8);
            }
            long j2 = a.C0355a.C0356a.f17017a.f17010f;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = aVar.f16966g;
            if (bVar != null && j2 == bVar.d() && a.C0355a.C0356a.f17017a.f17011g == aVar.f16963d) {
                aVar.g();
            }
        }
    }

    public final void c() {
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = this.f16965f;
        if (liveNewSendGiftAnimationView != null) {
            liveNewSendGiftAnimationView.setVisibility(8);
        }
        LiveNewSendGiftAnimationView liveNewSendGiftAnimationView2 = this.f16965f;
        if (liveNewSendGiftAnimationView2 != null) {
            liveNewSendGiftAnimationView2.a();
        }
        this.f16969j = false;
        long j2 = a.C0355a.C0356a.f17017a.f17010f;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        if (bVar != null && j2 == bVar.d() && a.C0355a.C0356a.f17017a.f17011g == this.f16963d) {
            g();
        }
    }

    public void f() {
        T t;
        v vVar;
        View view = this.f16964e;
        if (view != null) {
            view.setVisibility(4);
        }
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        u uVar = null;
        if (bVar != null) {
            t = bVar.f17864b;
        } else {
            t = null;
        }
        if (t instanceof u) {
            uVar = t;
        }
        u uVar2 = uVar;
        if (uVar2 == null || (vVar = uVar2.L) == null || !vVar.f19780b) {
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView2 = this.o;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        long j2;
        String str;
        ImageModel c2;
        List<String> list;
        ImageModel imageModel = null;
        boolean z = false;
        try {
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
            if (bVar == null || (c2 = bVar.c()) == null || (list = c2.mUrls) == null) {
                str = null;
            } else {
                str = list.get(0);
            }
            z = k.a(Uri.parse(str));
        } catch (Exception unused) {
        }
        com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
        if (bVar2 != null) {
            j2 = bVar2.d();
        } else {
            j2 = 0;
        }
        aVar.a(j2, z);
        HSImageView hSImageView = this.f16962c;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16966g;
        if (bVar3 != null) {
            imageModel = bVar3.c();
        }
        k.b(hSImageView, imageModel, new e(this));
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.f16960a = (ImageView) this.f16970k.findViewById(R.id.c9v);
        this.f16961b = (LiveTextView) this.f16970k.findViewById(R.id.cul);
        this.f16962c = (HSImageView) this.f16970k.findViewById(R.id.cuk);
        this.f16964e = this.f16970k.findViewById(R.id.es6);
        this.f16965f = (LiveNewSendGiftAnimationView) this.f16970k.findViewById(R.id.bb5);
        this.f16971l = (LiveTextView) this.f16970k.findViewById(R.id.bs3);
        this.f16972m = (LiveTextView) this.f16970k.findViewById(R.id.bsu);
        this.n = (LiveTextView) this.f16970k.findViewById(R.id.bsv);
        this.o = (ImageView) this.f16970k.findViewById(R.id.ee3);
        LiveTextView liveTextView = this.f16972m;
        if (liveTextView != null) {
            liveTextView.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33796b));
        }
        LiveTextView liveTextView2 = this.f16961b;
        if (liveTextView2 != null) {
            liveTextView2.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }
    }

    public final void b() {
        Integer num;
        GiftDialogViewModel.a aVar;
        long j2;
        boolean z;
        T t;
        T t2;
        T t3;
        String str;
        String str2;
        DataChannel dataChannel;
        Room room;
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        T t4 = null;
        if (bVar != null) {
            num = Integer.valueOf(bVar.f17863a);
        } else {
            num = null;
        }
        boolean z2 = true;
        if (num == null || num.intValue() == 1 || num.intValue() != 2) {
            aVar = GiftDialogViewModel.a.GIFT;
        } else {
            aVar = GiftDialogViewModel.a.PROP;
        }
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16966g;
        if (bVar2 != null) {
            j2 = bVar2.d();
        } else {
            j2 = 0;
        }
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16966g;
        if (bVar3 != null) {
            z = bVar3.g();
        } else {
            z = false;
        }
        com.bytedance.android.livesdk.service.b.d dVar = new com.bytedance.android.livesdk.service.b.d(aVar, j2, z);
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar4 = this.f16966g;
        if (bVar4 != null) {
            t = bVar4.f17864b;
        } else {
            t = null;
        }
        if (t instanceof u) {
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar5 = this.f16966g;
            if (bVar5 != null) {
                t2 = bVar5.f17864b;
            } else {
                t2 = null;
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            dVar.q = ((u) t2).J;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar6 = this.f16966g;
            if (bVar6 != null) {
                t3 = bVar6.f17864b;
            } else {
                t3 = null;
            }
            Objects.requireNonNull(t3, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            dVar.f21290f = ((u) t3).f19763f;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar7 = this.f16966g;
            if (bVar7 != null) {
                t4 = bVar7.f17864b;
            }
            Objects.requireNonNull(t4, "null cannot be cast to non-null type com.bytedance.android.livesdk.model.Gift");
            if (((u) t4).f19762e == 1) {
                z2 = false;
            }
            dVar.f21295k = z2;
            dVar.f21297m = this.f16963d;
            dVar.f21296l = GiftManager.inst().getTabName(this.f16963d);
            dVar.n = this.f16963d;
            if (a.C0445a.C0446a.f21161a.f21160a) {
                str = "call";
            } else {
                str = "click";
            }
            dVar.o = str;
            if (e()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            dVar.p = str2;
            dVar.f21294j = a.C0355a.C0356a.f17017a.f17009e;
            User user = a.C0355a.C0356a.f17017a.f17006b;
            if (user != null || ((dataChannel = this.f16967h) != null && (room = (Room) dataChannel.b(df.class)) != null && (user = room.getOwner()) != null)) {
                dVar.f21293i = user;
                dVar.r = com.bytedance.android.livesdk.utils.a.a.a();
            } else {
                return;
            }
        }
        DataChannel dataChannel2 = this.f16967h;
        if (dataChannel2 != null) {
            dataChannel2.c(az.class, dVar);
        }
    }

    public void g() {
        T t;
        v vVar;
        View view = this.f16964e;
        if (view != null) {
            view.setVisibility(0);
        }
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        com.bytedance.android.livesdk.z.c.a aVar = a.C0498a.f22936a;
        l.b(aVar, "");
        if (aVar.f22931a) {
            LiveTextView liveTextView = this.f16971l;
            if (liveTextView != null) {
                liveTextView.setVisibility(0);
            }
            LiveTextView liveTextView2 = this.f16972m;
            if (liveTextView2 != null) {
                liveTextView2.setVisibility(4);
            }
            LiveTextView liveTextView3 = this.n;
            if (liveTextView3 != null) {
                liveTextView3.setVisibility(4);
            }
            com.bytedance.android.livesdk.z.c.a aVar2 = a.C0498a.f22936a;
            l.b(aVar2, "");
            a(Long.valueOf(aVar2.f22933c));
            return;
        }
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16966g;
        u uVar = null;
        if (bVar != null) {
            t = bVar.f17864b;
        } else {
            t = null;
        }
        if (t instanceof u) {
            uVar = t;
        }
        u uVar2 = uVar;
        if (uVar2 == null || (vVar = uVar2.L) == null || !vVar.f19780b) {
            LiveTextView liveTextView4 = this.f16972m;
            if (liveTextView4 != null) {
                liveTextView4.setVisibility(0);
            }
            LiveTextView liveTextView5 = this.n;
            if (liveTextView5 != null) {
                liveTextView5.setVisibility(4);
            }
            LiveTextView liveTextView6 = this.f16971l;
            if (liveTextView6 != null) {
                liveTextView6.setVisibility(4);
                return;
            }
            return;
        }
        LiveTextView liveTextView7 = this.n;
        if (liveTextView7 != null) {
            liveTextView7.setVisibility(0);
        }
        LiveTextView liveTextView8 = this.f16972m;
        if (liveTextView8 != null) {
            liveTextView8.setVisibility(4);
        }
        LiveTextView liveTextView9 = this.f16971l;
        if (liveTextView9 != null) {
            liveTextView9.setVisibility(4);
        }
    }

    public static final class e implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16975a;

        /* renamed from: b  reason: collision with root package name */
        private long f16976b;

        static {
            Covode.recordClassIndex(9432);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(a aVar) {
            this.f16975a = aVar;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            long j2;
            l.d(imageModel, "");
            com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16975a.f16966g;
            if (bVar != null) {
                j2 = bVar.d();
            } else {
                j2 = 0;
            }
            aVar.a(j2);
            this.f16976b = SystemClock.elapsedRealtime();
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            long j2;
            l.d(imageModel, "");
            l.d(exc, "");
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16975a.f16966g;
            long j3 = 0;
            if (bVar != null && bVar.f17863a == 1) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16975a.f16966g;
                if (bVar2 != null) {
                    j2 = bVar2.d();
                } else {
                    j2 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j2, imageModel.getUri(), exc.getMessage());
            }
            try {
                com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16975a.f16966g;
                if (bVar3 != null) {
                    j3 = bVar3.d();
                }
                aVar.c(j3);
            } catch (Exception unused) {
            }
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            long j2;
            String str;
            long j3;
            l.d(imageModel, "");
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16975a.f16966g;
            long j4 = 0;
            if (bVar != null && bVar.f17863a == 1) {
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar2 = this.f16975a.f16966g;
                if (bVar2 != null) {
                    j3 = bVar2.d();
                } else {
                    j3 = 0;
                }
                com.bytedance.android.livesdk.service.c.g.a.a(j3, imageModel.getUri());
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f16976b;
            com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar3 = this.f16975a.f16966g;
            if (bVar3 != null) {
                j2 = bVar3.d();
            } else {
                j2 = 0;
            }
            if (imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
                str = "";
            } else {
                str = imageModel.getUrls().get(0);
            }
            l.b(str, "");
            com.bytedance.android.livesdk.service.c.c.c.a(elapsedRealtime, j2, str);
            try {
                com.bytedance.android.livesdk.service.c.c.a aVar = a.C0460a.C0461a.f21366a;
                com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar4 = this.f16975a.f16966g;
                if (bVar4 != null) {
                    j4 = bVar4.d();
                }
                aVar.b(j4);
            } catch (Exception unused) {
            }
        }
    }

    public static final class f implements p.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16977a;

        static {
            Covode.recordClassIndex(9433);
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel) {
            l.d(imageModel, "");
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, Exception exc) {
            l.d(imageModel, "");
            l.d(exc, "");
        }

        f(a aVar) {
            this.f16977a = aVar;
        }

        @Override // com.bytedance.android.live.core.f.p.a
        public final void a(ImageModel imageModel, int i2, int i3) {
            ViewGroup.LayoutParams layoutParams;
            l.d(imageModel, "");
            if (i2 != 0 && i3 != 0) {
                ImageView imageView = this.f16977a.f16960a;
                if (imageView != null) {
                    layoutParams = imageView.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = (i2 * y.a(13.0f)) / i3;
                    }
                } else {
                    layoutParams = null;
                }
                ImageView imageView2 = this.f16977a.f16960a;
                if (imageView2 != null) {
                    imageView2.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<z, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(9430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.c();
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        this.f16970k = view;
        a();
    }

    public final void a(Long l2) {
        String concat;
        String concat2;
        if (l2 != null && l2.longValue() > 0) {
            int longValue = (int) (l2.longValue() / 1000);
            int i2 = longValue / 60;
            int i3 = longValue % 60;
            if (i2 >= 10) {
                concat = String.valueOf(i2);
            } else {
                concat = "0".concat(String.valueOf(i2));
            }
            if (i3 >= 10) {
                concat2 = String.valueOf(i3);
            } else {
                concat2 = "0".concat(String.valueOf(i3));
            }
            String str = concat + " : " + concat2;
            LiveTextView liveTextView = this.f16971l;
            if (liveTextView != null) {
                liveTextView.setText(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16973a;

        static {
            Covode.recordClassIndex(9429);
        }

        b(a aVar) {
            this.f16973a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d8, code lost:
            if (r1 == null) goto L_0x01da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
            if (((com.bytedance.android.livesdk.model.u) r2).a() == false) goto L_0x00a3;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r23) {
            /*
            // Method dump skipped, instructions count: 681
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.c.a.b.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16974a;

        static {
            Covode.recordClassIndex(9431);
        }

        d(a aVar) {
            this.f16974a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            l.d(motionEvent, "");
            if (this.f16974a.f16969j) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                com.bytedance.android.livesdk.service.animation.a.a.a(view).start();
            } else if (1 == motionEvent.getAction()) {
                com.bytedance.android.livesdk.service.animation.a.a.b(view).start();
            } else if (3 == motionEvent.getAction()) {
                com.bytedance.android.livesdk.service.animation.a.a.b(view).start();
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00dc, code lost:
        if (r0 == null) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> r11, int r12, com.bytedance.ies.sdk.datachannel.DataChannel r13) {
        /*
        // Method dump skipped, instructions count: 453
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.c.a.a(com.bytedance.android.livesdk.gift.model.a.b, int, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
