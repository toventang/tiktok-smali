package com.bytedance.android.livesdk.wishlist.view;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.az;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.x;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import java.util.Locale;
import java.util.Objects;

public final class WishGiftView extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f22859c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public x.a f22860a;

    /* renamed from: b  reason: collision with root package name */
    public DataChannel f22861b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f22862d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f22863e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f22864f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f22865g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f22866h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f22867i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f22868j;

    /* renamed from: k  reason: collision with root package name */
    private final h.h f22869k;

    /* renamed from: l  reason: collision with root package name */
    private final h.h f22870l;

    static {
        Covode.recordClassIndex(13495);
    }

    public WishGiftView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final LiveTextView getMGiftDiamondCount() {
        return (LiveTextView) this.f22865g.getValue();
    }

    public final HSImageView getMGiftIcon() {
        return (HSImageView) this.f22862d.getValue();
    }

    public final ConstraintLayout getMGiftInfoLayout() {
        return (ConstraintLayout) this.f22864f.getValue();
    }

    public final LiveTextView getMGiftName() {
        return (LiveTextView) this.f22863e.getValue();
    }

    public final ProgressBar getMProgressBar() {
        return (ProgressBar) this.f22866h.getValue();
    }

    public final LiveTextView getMProgressText() {
        return (LiveTextView) this.f22867i.getValue();
    }

    public final LiveTextView getMSendGiftText() {
        return (LiveTextView) this.f22868j.getValue();
    }

    public final ImageView getMWishFinishIcon() {
        return (ImageView) this.f22869k.getValue();
    }

    /* access modifiers changed from: package-private */
    public final LiveNewSendGiftAnimationForWishListView getMWishGiftComboView() {
        return (LiveNewSendGiftAnimationForWishListView) this.f22870l.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13496);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WishGiftView f22873a;

        static {
            Covode.recordClassIndex(13498);
        }

        c(WishGiftView wishGiftView) {
            this.f22873a = wishGiftView;
        }

        public final void run() {
            this.f22873a.a();
        }
    }

    static final class d extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f_n);
        }
    }

    static final class e extends m implements h.f.a.a<HSImageView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13500);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ HSImageView invoke() {
            return this.this$0.findViewById(R.id.c32);
        }
    }

    static final class f extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.this$0.findViewById(R.id.bbb);
        }
    }

    static final class g extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f_p);
        }
    }

    static final class h extends m implements h.f.a.a<ProgressBar> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProgressBar invoke() {
            return this.this$0.findViewById(R.id.fn5);
        }
    }

    static final class i extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f_q);
        }
    }

    static final class j extends m implements h.f.a.a<LiveTextView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveTextView invoke() {
            return this.this$0.findViewById(R.id.f_r);
        }
    }

    static final class k extends m implements h.f.a.a<ImageView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ImageView invoke() {
            return this.this$0.findViewById(R.id.c31);
        }
    }

    static final class l extends m implements h.f.a.a<LiveNewSendGiftAnimationForWishListView> {
        final /* synthetic */ WishGiftView this$0;

        static {
            Covode.recordClassIndex(13507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(WishGiftView wishGiftView) {
            super(0);
            this.this$0 = wishGiftView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LiveNewSendGiftAnimationForWishListView invoke() {
            return this.this$0.findViewById(R.id.bb5);
        }
    }

    public final long getWishGiftId() {
        x.a aVar = this.f22860a;
        if (aVar == null) {
            h.f.b.l.a("mWishInfo");
        }
        return aVar.f17963a;
    }

    public final void a() {
        getMWishGiftComboView().setVisibility(8);
        getMSendGiftText().setVisibility(0);
        getMGiftInfoLayout().setVisibility(0);
    }

    public final void b() {
        x.a aVar = this.f22860a;
        if (aVar == null) {
            h.f.b.l.a("mWishInfo");
        }
        int i2 = aVar.f17965c;
        x.a aVar2 = this.f22860a;
        if (aVar2 == null) {
            h.f.b.l.a("mWishInfo");
        }
        if (i2 >= aVar2.f17966d) {
            getMWishFinishIcon().setVisibility(0);
        }
    }

    private final void b(int i2) {
        x.a aVar = this.f22860a;
        if (aVar == null) {
            h.f.b.l.a("mWishInfo");
        }
        a(i2, aVar.f17966d);
        x.a aVar2 = this.f22860a;
        if (aVar2 == null) {
            h.f.b.l.a("mWishInfo");
        }
        b(i2, aVar2.f17966d);
        b();
    }

    public final void a(int i2) {
        x.a aVar = this.f22860a;
        if (aVar == null) {
            h.f.b.l.a("mWishInfo");
        }
        aVar.f17965c += i2;
        x.a aVar2 = this.f22860a;
        if (aVar2 == null) {
            h.f.b.l.a("mWishInfo");
        }
        b(aVar2.f17965c);
    }

    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WishGiftView f22871a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ x.a.C0373a f22872b;

        static {
            Covode.recordClassIndex(13497);
        }

        public b(WishGiftView wishGiftView, x.a.C0373a aVar) {
            this.f22871a = wishGiftView;
            this.f22872b = aVar;
        }

        public final void onClick(View view) {
            User owner;
            boolean z;
            boolean z2;
            AnimatorSet animatorSet;
            WishGiftView wishGiftView = this.f22871a;
            x.a.C0373a aVar = this.f22872b;
            DataChannel dataChannel = wishGiftView.f22861b;
            if (dataChannel == null) {
                h.f.b.l.a("mDataChannel");
            }
            Room room = (Room) dataChannel.b(df.class);
            if (!(room == null || (owner = room.getOwner()) == null)) {
                com.bytedance.android.livesdk.service.c.a.e eVar = com.bytedance.android.livesdk.service.c.a.e.f21319i;
                x.a aVar2 = wishGiftView.f22860a;
                if (aVar2 == null) {
                    h.f.b.l.a("mWishInfo");
                }
                long j2 = aVar2.f17963a;
                if (aVar.f17971d != 1) {
                    z = true;
                } else {
                    z = false;
                }
                eVar.a(j2, z, "wishlist", "", (Integer) 0, (Integer) 0);
                GiftDialogViewModel.a aVar3 = GiftDialogViewModel.a.GIFT;
                x.a aVar4 = wishGiftView.f22860a;
                if (aVar4 == null) {
                    h.f.b.l.a("mWishInfo");
                }
                com.bytedance.android.livesdk.service.b.d dVar = new com.bytedance.android.livesdk.service.b.d(aVar3, aVar4.f17963a, false);
                dVar.f21290f = aVar.f17970c;
                if (aVar.f17971d != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dVar.f21295k = z2;
                dVar.f21293i = owner;
                dVar.f21294j = "wishlist";
                DataChannel dataChannel2 = wishGiftView.f22861b;
                if (dataChannel2 == null) {
                    h.f.b.l.a("mDataChannel");
                }
                dataChannel2.c(az.class, dVar);
                LiveNewSendGiftAnimationForWishListView mWishGiftComboView = wishGiftView.getMWishGiftComboView();
                c cVar = new c(wishGiftView);
                if (mWishGiftComboView.f21212f == null || !(mWishGiftComboView.f21212f.f17864b instanceof Prop) || ((Prop) mWishGiftComboView.f21212f.f17864b).count >= mWishGiftComboView.f21211e) {
                    mWishGiftComboView.f21211e++;
                    if (mWishGiftComboView.f21210d == 0) {
                        mWishGiftComboView.a();
                        mWishGiftComboView.f21209c = new AnimatorSet();
                        mWishGiftComboView.f21209c.playTogether(ObjectAnimator.ofFloat(mWishGiftComboView.f21207a, "scaleX", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(mWishGiftComboView.f21207a, "scaleY", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(mWishGiftComboView.f21208b, "scaleX", 1.0f, 1.1f, 1.0f), ObjectAnimator.ofFloat(mWishGiftComboView.f21208b, "scaleY", 1.0f, 1.1f, 1.0f));
                        mWishGiftComboView.f21209c.setDuration(300L);
                        if (Build.VERSION.SDK_INT >= 21) {
                            mWishGiftComboView.f21209c.setInterpolator(new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f));
                        }
                        mWishGiftComboView.f21209c.addListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x012c: INVOKE  
                              (wrap: android.animation.AnimatorSet : 0x0125: IGET  (r1v32 android.animation.AnimatorSet) = 
                              (r9v1 'mWishGiftComboView' com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView)
                             com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.c android.animation.AnimatorSet)
                              (wrap: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$1 : 0x0129: CONSTRUCTOR  (r0v75 com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$1) = 
                              (r9v1 'mWishGiftComboView' com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView)
                              (r12v1 'cVar' com.bytedance.android.livesdk.wishlist.view.WishGiftView$c)
                             call: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.1.<init>(com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView, java.lang.Runnable):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.animation.AnimatorSet.addListener(android.animation.Animator$AnimatorListener):void in method: com.bytedance.android.livesdk.wishlist.view.WishGiftView.b.onClick(android.view.View):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0129: CONSTRUCTOR  (r0v75 com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView$1) = 
                              (r9v1 'mWishGiftComboView' com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView)
                              (r12v1 'cVar' com.bytedance.android.livesdk.wishlist.view.WishGiftView$c)
                             call: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView.1.<init>(com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView, java.lang.Runnable):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.wishlist.view.WishGiftView.b.onClick(android.view.View):void, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 29 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationForWishListView, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 35 more
                            */
                        /*
                        // Method dump skipped, instructions count: 808
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.wishlist.view.WishGiftView.b.onClick(android.view.View):void");
                    }
                }

                public final void a(int i2, int i3) {
                    int i4;
                    getMProgressBar().setVisibility(0);
                    ProgressBar mProgressBar = getMProgressBar();
                    double d2 = (double) i2;
                    double d3 = (double) i3;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = (d2 / d3) * 100.0d;
                    if (d4 > 100.0d) {
                        i4 = 100;
                    } else {
                        i4 = (int) d4;
                    }
                    mProgressBar.setProgress(i4);
                }

                public final void b(int i2, int i3) {
                    SpannableString spannableString;
                    if (!y.g()) {
                        StringBuilder sb = new StringBuilder();
                        String valueOf = String.valueOf(i2);
                        Locale locale = Locale.ENGLISH;
                        h.f.b.l.b(locale, "");
                        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                        String upperCase = valueOf.toUpperCase(locale);
                        h.f.b.l.b(upperCase, "");
                        StringBuilder append = sb.append(upperCase).append('/');
                        String valueOf2 = String.valueOf(i3);
                        Locale locale2 = Locale.ENGLISH;
                        h.f.b.l.b(locale2, "");
                        Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type java.lang.String");
                        String upperCase2 = valueOf2.toUpperCase(locale2);
                        h.f.b.l.b(upperCase2, "");
                        spannableString = new SpannableString(append.append(upperCase2).toString());
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D662FF")), 0, String.valueOf(i2).length(), 33);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        String valueOf3 = String.valueOf(i3);
                        Locale locale3 = Locale.ENGLISH;
                        h.f.b.l.b(locale3, "");
                        Objects.requireNonNull(valueOf3, "null cannot be cast to non-null type java.lang.String");
                        String upperCase3 = valueOf3.toUpperCase(locale3);
                        h.f.b.l.b(upperCase3, "");
                        StringBuilder append2 = sb2.append(upperCase3).append('/');
                        String valueOf4 = String.valueOf(i2);
                        Locale locale4 = Locale.ENGLISH;
                        h.f.b.l.b(locale4, "");
                        Objects.requireNonNull(valueOf4, "null cannot be cast to non-null type java.lang.String");
                        String upperCase4 = valueOf4.toUpperCase(locale4);
                        h.f.b.l.b(upperCase4, "");
                        String sb3 = append2.append(upperCase4).toString();
                        spannableString = new SpannableString(sb3);
                        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#D662FF")), sb3.length() - String.valueOf(i2).length(), sb3.length(), 33);
                    }
                    getMProgressText().setVisibility(0);
                    getMProgressText().setText(spannableString);
                }

                private /* synthetic */ WishGiftView(Context context, AttributeSet attributeSet, byte b2) {
                    this(context, attributeSet, (char) 0);
                }

                private WishGiftView(Context context, AttributeSet attributeSet, char c2) {
                    super(context, attributeSet, 0);
                    MethodCollector.i(9008);
                    com.a.a(LayoutInflater.from(context), R.layout.bgg, this, true);
                    this.f22862d = h.i.a((h.f.a.a) new e(this));
                    this.f22863e = h.i.a((h.f.a.a) new g(this));
                    this.f22864f = h.i.a((h.f.a.a) new f(this));
                    this.f22865g = h.i.a((h.f.a.a) new d(this));
                    this.f22866h = h.i.a((h.f.a.a) new h(this));
                    this.f22867i = h.i.a((h.f.a.a) new i(this));
                    this.f22868j = h.i.a((h.f.a.a) new j(this));
                    this.f22869k = h.i.a((h.f.a.a) new k(this));
                    this.f22870l = h.i.a((h.f.a.a) new l(this));
                    MethodCollector.o(9008);
                }
            }
