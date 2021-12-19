package com.ss.android.ugc.gamora.recorder.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ac;
import com.bytedance.jedi.arch.ae;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ak;
import com.bytedance.jedi.arch.al;
import com.bytedance.jedi.arch.am;
import com.bytedance.jedi.arch.an;
import com.bytedance.jedi.arch.b;
import com.bytedance.jedi.arch.v;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyBuriedInfo;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.dependence.beauty.data.ComposerBeautyBuriedInfoCopy;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.property.az;
import com.ss.android.ugc.aweme.property.dd;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.db;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.local.UploadButton;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ClosingChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.ui.task.FirstPhotoViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout;
import com.ss.android.ugc.aweme.specialplus.e;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.widgetcompat.RemoteImageView;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import com.ss.android.vesdk.VEListener;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Callable;

public class d extends com.bytedance.scene.group.b implements com.bytedance.jedi.arch.b, com.bytedance.o.a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147702b = {new y(d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new y(d.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new y(d.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new y(d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new y(d.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0)};
    public static final a v = new a((byte) 0);
    private final h.h.d A = com.bytedance.o.b.a.b(getDiContainer(), com.bytedance.creativex.recorder.gesture.api.b.class);
    private boolean B;
    private final com.bytedance.o.f C;
    private final com.bytedance.als.h<Integer> D;
    private final com.bytedance.als.h<Integer> E;
    private final com.bytedance.als.g<z> F;
    private final com.bytedance.als.h<Boolean> G;
    private final c H;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.als.k<z> f147703c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.als.g<z> f147704d;

    /* renamed from: e  reason: collision with root package name */
    public TouchSensitiveRelativeLayout f147705e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f147706f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.recorder.h.e f147707g = new com.ss.android.ugc.gamora.recorder.h.e();

    /* renamed from: h  reason: collision with root package name */
    View f147708h;

    /* renamed from: i  reason: collision with root package name */
    public View f147709i;

    /* renamed from: j  reason: collision with root package name */
    public UploadButton f147710j;

    /* renamed from: k  reason: collision with root package name */
    public int f147711k = en.a(40.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);

    /* renamed from: l  reason: collision with root package name */
    public com.bytedance.tux.tooltip.a f147712l;
    public com.bytedance.tux.tooltip.a t;
    public long u = -1;
    private final h.h.d w = com.bytedance.o.b.a.a(getDiContainer(), ShortVideoContext.class);
    private final h.h.d x = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.d.class);
    private final h.h.d y = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.gamora.recorder.sticker.c.j.class);
    private final h.h.d z = com.bytedance.o.b.a.a(getDiContainer(), com.bytedance.creativex.recorder.b.a.m.class);

    static {
        Covode.recordClassIndex(97356);
    }

    public final ShortVideoContext E() {
        return (ShortVideoContext) this.w.a(this, f147702b[0]);
    }

    public final com.bytedance.creativex.recorder.b.a.d F() {
        return (com.bytedance.creativex.recorder.b.a.d) this.x.a(this, f147702b[1]);
    }

    public final com.ss.android.ugc.gamora.recorder.sticker.c.j G() {
        return (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.y.a(this, f147702b[2]);
    }

    public final com.bytedance.creativex.recorder.b.a.m H() {
        return (com.bytedance.creativex.recorder.b.a.m) this.z.a(this, f147702b[3]);
    }

    public final com.bytedance.creativex.recorder.gesture.api.b I() {
        return (com.bytedance.creativex.recorder.gesture.api.b) this.A.a(this, f147702b[4]);
    }

    @Override // com.bytedance.jedi.arch.h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(97357);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$a$a  reason: collision with other inner class name */
        public static final class C3973a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ com.bytedance.o.f $diContainer;
            final /* synthetic */ ShortVideoContext $shortVideoContext;

            static {
                Covode.recordClassIndex(97358);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3973a(ShortVideoContext shortVideoContext, Activity activity, com.bytedance.o.f fVar) {
                super(0);
                this.$shortVideoContext = shortVideoContext;
                this.$activity = activity;
                this.$diContainer = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                a();
                return z.f158842a;
            }

            public final void a() {
                Integer num;
                com.ss.android.ugc.aweme.common.r.a("upload_click", "shoot_page", "0", 0, new com.ss.android.ugc.aweme.df.k().a("enter_from", this.$shortVideoContext.r).a());
                if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                    a.a();
                } else {
                    a.b(this.$shortVideoContext);
                }
                ShortVideoContext shortVideoContext = this.$shortVideoContext;
                com.ss.android.ugc.asve.recorder.c.a mediaController = ((com.bytedance.creativex.recorder.b.a.d) this.$diContainer.a((Type) com.bytedance.creativex.recorder.b.a.d.class, (String) null)).D().getMediaController();
                FaceStickerBean i2 = ((com.ss.android.ugc.gamora.recorder.sticker.c.j) this.$diContainer.a((Type) com.ss.android.ugc.gamora.recorder.sticker.c.j.class, (String) null)).i();
                T value = ((com.bytedance.creativex.recorder.filter.a.a) this.$diContainer.a((Type) com.bytedance.creativex.recorder.filter.a.a.class, (String) null)).getCurSelectedFilter().f6468a.getValue();
                if (value != null) {
                    num = Integer.valueOf(value.getId());
                } else {
                    num = null;
                }
                com.ss.android.ugc.aweme.shortvideo.eventtrack.a.a(shortVideoContext, mediaController, i2, num, a.a(((com.bytedance.creativex.recorder.a.a.a) this.$diContainer.a((Type) com.bytedance.creativex.recorder.a.a.a.class, (String) null)).i().p()), a.a(((com.bytedance.creativex.recorder.a.a.a) this.$diContainer.a((Type) com.bytedance.creativex.recorder.a.a.a.class, (String) null)).i().o()), "click_upload", AnonymousClass1.f147713a);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<V> implements Callable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3973a f147714a;

            static {
                Covode.recordClassIndex(97360);
            }

            b(C3973a aVar) {
                this.f147714a = aVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f147714a.a();
                return z.f158842a;
            }
        }

        public static void a() {
            com.ss.android.ugc.aweme.utils.d.a("click_upload_entrance", new com.ss.android.ugc.tools.f.b().a("content_type", "video/photo").f149193a);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static boolean a(ShortVideoContext shortVideoContext) {
            if (!shortVideoContext.aN || !shortVideoContext.O) {
                return false;
            }
            return true;
        }

        public static ComposerBeautyBuriedInfo a(ComposerBeautyBuriedInfoCopy composerBeautyBuriedInfoCopy) {
            Object a2 = com.ss.android.ugc.aweme.df.h.a(com.ss.android.ugc.aweme.df.h.a().b(composerBeautyBuriedInfoCopy), ComposerBeautyBuriedInfo.class);
            h.f.b.l.b(a2, "");
            return (ComposerBeautyBuriedInfo) a2;
        }

        public static com.ss.android.ugc.aweme.beauty.g a(com.ss.android.ugc.aweme.dependence.beauty.data.a aVar) {
            Object a2 = com.ss.android.ugc.aweme.df.h.a(com.ss.android.ugc.aweme.df.h.a().b(aVar), com.ss.android.ugc.aweme.beauty.g.class);
            h.f.b.l.b(a2, "");
            return (com.ss.android.ugc.aweme.beauty.g) a2;
        }

        public static void b(ShortVideoContext shortVideoContext) {
            String str;
            String str2;
            CommentVideoModel commentVideoModel = shortVideoContext.f124767l;
            if (commentVideoModel == null || (str = commentVideoModel.getEnterMethod()) == null) {
                str = shortVideoContext.f124760e;
            }
            if (str == null) {
                str = "";
            }
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r);
            String str3 = null;
            if (!CommentUtils.needMob(shortVideoContext)) {
                str2 = "";
            } else if (commentVideoModel != null) {
                str2 = commentVideoModel.getCommentId();
            } else {
                str2 = null;
            }
            com.ss.android.ugc.tools.f.b a3 = a2.a("reply_comment_id", str2);
            if (!CommentUtils.needMob(shortVideoContext)) {
                str3 = "";
            } else if (commentVideoModel != null) {
                str3 = commentVideoModel.getUserId();
            }
            com.ss.android.ugc.tools.f.b a4 = a3.a("reply_user_id", str3).a("enter_from", "video_shoot_page").a("from_group_id", dv.a()).a("enter_method", str).a("is_westwindow_exist", shortVideoContext.aR);
            if (shortVideoContext.C != 0) {
                a4.a("draft_id", shortVideoContext.C);
            }
            String str4 = shortVideoContext.D;
            h.f.b.l.b(str4, "");
            if (str4.length() > 0) {
                a4.a("new_draft_id", shortVideoContext.D);
            }
            a4.a("shoot_page", "video_shoot_page");
            a4.a("shoot_tab_name", shortVideoContext.r());
            com.ss.android.ugc.aweme.common.r.a("click_upload_entrance", a4.f149193a);
        }

        public static void a(Activity activity, ShortVideoContext shortVideoContext) {
            String str;
            Long l2;
            String stickerId;
            h.f.b.l.d(activity, "");
            h.f.b.l.d(shortVideoContext, "");
            Mission a2 = com.ss.android.ugc.aweme.port.in.c.f115633l.a(shortVideoContext.af.f124735c);
            if (a2 != null) {
                String musicId = a2.getMusicId();
                if ((musicId != null && musicId.length() != 0) || ((stickerId = a2.getStickerId()) != null && stickerId.length() != 0)) {
                    String stickerId2 = a2.getStickerId();
                    if (stickerId2 == null || stickerId2.length() == 0 || !a2.isStickerToasted()) {
                        String musicId2 = a2.getMusicId();
                        if (musicId2 == null || musicId2.length() == 0 || !a2.isMusicToasted()) {
                            Integer num = null;
                            if (!a2.isMusicToasted()) {
                                String musicId3 = a2.getMusicId();
                                com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
                                if (cVar != null) {
                                    l2 = Long.valueOf(cVar.id);
                                } else {
                                    l2 = null;
                                }
                                if (!TextUtils.equals(musicId3, String.valueOf(l2))) {
                                    a2.setMusicToasted(true);
                                    shortVideoContext.af.f124735c = com.ss.android.ugc.aweme.port.in.c.f115633l.a(shortVideoContext.af.f124735c, a2);
                                    return;
                                }
                            }
                            com.ss.android.ugc.tools.view.widget.d.b(activity, R.string.d58).b();
                            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("reason", 4).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                            com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                            if (e2 != null) {
                                num = Integer.valueOf(e2.m());
                            }
                            com.ss.android.ugc.tools.f.b a4 = a3.a("creator_followers", num);
                            if (com.ss.android.ugc.aweme.port.in.l.f115658a.z().j()) {
                                str = "0";
                            } else {
                                str = "1";
                            }
                            com.ss.android.ugc.aweme.common.r.a("mission_requirement_toast", a4.a("creator_type", str).f149193a);
                        }
                    }
                }
            }
        }

        public static void a(Activity activity, ShortVideoContext shortVideoContext, com.bytedance.o.f fVar) {
            h.f.b.l.d(activity, "");
            h.f.b.l.d(shortVideoContext, "");
            h.f.b.l.d(fVar, "");
            b.i.b(new b(new C3973a(shortVideoContext, activity, fVar)), b.i.f4824a);
        }
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.C;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.v
    public androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147715a;

        static {
            Covode.recordClassIndex(97361);
        }

        b(d dVar) {
            this.f147715a = dVar;
        }

        public final void run() {
            com.bytedance.tux.tooltip.a aVar = this.f147715a.f147712l;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147720a;

        static {
            Covode.recordClassIndex(97367);
        }

        g(d dVar) {
            this.f147720a = dVar;
        }

        public final void run() {
            if (this.f147720a.r() != null) {
                d.a(this.f147720a).getLocationOnScreen(new int[2]);
            }
        }
    }

    public final void K() {
        if (!this.B) {
            this.B = true;
            ((FirstPhotoViewModel) androidx.lifecycle.ae.a(com.bytedance.scene.ktx.c.b(this), (ad.b) null).a(FirstPhotoViewModel.class)).f131908a.observe(this, new C3974d(this));
            UploadButton uploadButton = this.f147710j;
            if (uploadButton == null) {
                h.f.b.l.a("uploadButton");
            }
            uploadButton.setOnClickListener(new e(this));
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147719a;

        static {
            Covode.recordClassIndex(97366);
        }

        f(d dVar) {
            this.f147719a = dVar;
        }

        public final void run() {
            if (this.f147719a.J() && d.a(this.f147719a).getVisibility() == 0) {
                this.f147719a.f147707g.f147805a.storeBoolean("upload_tip_show", true);
                com.bytedance.tux.tooltip.a aVar = this.f147719a.t;
                if (aVar != null) {
                    aVar.a();
                }
                com.ss.android.ugc.aweme.common.r.a("photo_music_toast_show", new com.ss.android.ugc.tools.f.b().a("creation_id", this.f147719a.E().q).a("shoot_way", this.f147719a.E().r).a("enter_from", "video_shoot_page").f149193a);
            }
        }
    }

    public final boolean J() {
        if (this.f42913m == null) {
            return false;
        }
        try {
            String str = null;
            com.ss.android.ugc.gamora.recorder.b.b bVar = (com.ss.android.ugc.gamora.recorder.b.b) getDiContainer().b(com.ss.android.ugc.gamora.recorder.b.b.class, null);
            if (bVar != null) {
                str = bVar.getCurrentBottomTag();
            }
            Activity activity = this.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            if (TextUtils.equals(str, activity.getString(R.string.f_2))) {
                return true;
            }
            Activity activity2 = this.f42913m;
            if (activity2 == null) {
                h.f.b.l.b();
            }
            if (TextUtils.equals(str, activity2.getString(R.string.f_4))) {
                return true;
            }
            if (db.b()) {
                Activity activity3 = this.f42913m;
                if (activity3 == null) {
                    h.f.b.l.b();
                }
                if (TextUtils.equals(str, activity3.getString(R.string.f_3))) {
                    return true;
                }
            }
            Activity activity4 = this.f42913m;
            if (activity4 == null) {
                h.f.b.l.b();
            }
            if (TextUtils.equals(str, activity4.getString(R.string.f_5))) {
                return true;
            }
            return false;
        } catch (h.y unused) {
            return false;
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.views.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147717a;

        static {
            Covode.recordClassIndex(97364);
        }

        public static final class a implements v.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ e f147718a;

            static {
                Covode.recordClassIndex(97365);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            a(e eVar) {
                this.f147718a = eVar;
            }

            @Override // com.ss.android.ugc.aweme.port.in.v.a
            public final void a(String[] strArr, int[] iArr) {
                Activity t = this.f147718a.f147717a.t();
                h.f.b.l.b(t, "");
                a.a(t, this.f147718a.f147717a.E());
                b.a.f132249a.start(OpenAlbumPanelPerformanceMonitor.f132344a, "onClick");
                this.f147718a.f147717a.E().f124759d = "click_button";
                this.f147718a.f147717a.E().f124760e = "click_button";
                this.f147718a.f147717a.a(true);
                Activity t2 = this.f147718a.f147717a.t();
                h.f.b.l.b(t2, "");
                a.a(t2, this.f147718a.f147717a.E(), this.f147718a.f147717a.getDiContainer());
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(0, false, 3);
            this.f147717a = dVar;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
        @Override // com.ss.android.ugc.aweme.views.k
        public final void a(android.view.View r5) {
            /*
            // Method dump skipped, instructions count: 110
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.e.d.e.a(android.view.View):void");
        }
    }

    public static final class i extends com.bytedance.creativex.recorder.gesture.api.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147722a;

        static {
            Covode.recordClassIndex(97369);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(d dVar) {
            this.f147722a = dVar;
        }

        @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.a, com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.b
        public final boolean b(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            com.bytedance.creativex.recorder.gesture.api.d dVar;
            if (motionEvent == null || motionEvent2 == null) {
                return super.b(motionEvent, motionEvent2, f2, f3);
            }
            com.bytedance.creativex.recorder.gesture.api.b I = this.f147722a.I();
            if (I != null) {
                dVar = I.a(6);
            } else {
                dVar = null;
            }
            if (dVar != null && dVar.b(motionEvent, motionEvent2, f2, f3)) {
                return true;
            }
            if (motionEvent2.getY() >= motionEvent.getY() || Math.abs(motionEvent.getY() - motionEvent2.getY()) <= Math.abs(motionEvent.getX() - motionEvent2.getX()) || this.f147722a.H().d().f6468a.getValue().booleanValue() || this.f147722a.r() == null) {
                return false;
            }
            ShortVideoContext E = this.f147722a.E();
            com.bytedance.o.f diContainer = this.f147722a.getDiContainer();
            Context r = this.f147722a.r();
            if (r == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(r, "");
            if (!com.ss.android.ugc.gamora.recorder.quickupload.l.a(E, diContainer, r)) {
                b.a.f132249a.start(OpenAlbumPanelPerformanceMonitor.f132344a, "onClick");
                this.f147722a.E().f124759d = "slide_full";
                this.f147722a.E().f124760e = "slide_up";
                Activity t = this.f147722a.t();
                h.f.b.l.b(t, "");
                a.a(t, this.f147722a.E(), this.f147722a.getDiContainer());
                this.f147722a.a(true);
            }
            return false;
        }
    }

    public static final class u implements com.ss.android.ugc.aweme.sticker.d.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147735a;

        static {
            Covode.recordClassIndex(97383);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        u(d dVar) {
            this.f147735a = dVar;
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
            h.f.b.l.d(aVar, "");
            if (aVar.f135380c == com.ss.android.ugc.aweme.sticker.d.b.a.MANUAL_SET) {
                d.c(this.f147735a).setVisibility(0);
            }
        }

        @Override // com.ss.android.ugc.aweme.sticker.d.e
        public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.d dVar) {
            h.f.b.l.d(dVar, "");
            d.c(this.f147735a).setVisibility(8);
        }
    }

    static final class p<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147729a;

        static {
            Covode.recordClassIndex(97376);
        }

        p(d dVar) {
            this.f147729a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            d.b(this.f147729a).setNoBlockTouchListener(new TouchSensitiveRelativeLayout.a(this) {
                /* class com.ss.android.ugc.gamora.recorder.e.d.p.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p f147730a;

                static {
                    Covode.recordClassIndex(97377);
                }

                {
                    this.f147730a = r1;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout.a
                public final void a() {
                    this.f147730a.f147729a.f147703c.a(z.f158842a);
                }
            });
        }
    }

    public static final /* synthetic */ UploadButton a(d dVar) {
        UploadButton uploadButton = dVar.f147710j;
        if (uploadButton == null) {
            h.f.b.l.a("uploadButton");
        }
        return uploadButton;
    }

    public static final /* synthetic */ TouchSensitiveRelativeLayout b(d dVar) {
        TouchSensitiveRelativeLayout touchSensitiveRelativeLayout = dVar.f147705e;
        if (touchSensitiveRelativeLayout == null) {
            h.f.b.l.a("recordTool");
        }
        return touchSensitiveRelativeLayout;
    }

    public static final /* synthetic */ View c(d dVar) {
        View view = dVar.f147709i;
        if (view == null) {
            h.f.b.l.a("ivCrossIcon");
        }
        return view;
    }

    public final void e(int i2) {
        UploadButton uploadButton = this.f147710j;
        if (uploadButton == null) {
            h.f.b.l.a("uploadButton");
        }
        uploadButton.setVisibility(i2);
    }

    @Override // com.bytedance.jedi.arch.b
    public <VM1 extends JediViewModel<S1>, S1 extends af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.e.d$d  reason: collision with other inner class name */
    public static final class C3974d<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147716a;

        static {
            Covode.recordClassIndex(97363);
        }

        C3974d(d dVar) {
            this.f147716a = dVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.mediachoose.a.d dVar = (com.ss.android.ugc.aweme.mediachoose.a.d) obj;
            if (dVar != null) {
                d.a(this.f147716a).a(true, dVar.f109351a.f109353a, dVar.f109352b, d.a.f109380a);
            }
        }
    }

    static final class k<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147724a;

        static {
            Covode.recordClassIndex(97371);
        }

        k(d dVar) {
            this.f147724a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup viewGroup = this.f147724a.f147706f;
            if (viewGroup == null) {
                h.f.b.l.a("effectContainer");
            }
            h.f.b.l.b(num, "");
            viewGroup.setVisibility(num.intValue());
        }
    }

    static final class l<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147725a;

        static {
            Covode.recordClassIndex(97372);
        }

        l(d dVar) {
            this.f147725a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.tux.tooltip.a aVar;
            com.bytedance.tux.tooltip.a aVar2 = this.f147725a.f147712l;
            if (aVar2 != null && aVar2.isShowing() && (aVar = this.f147725a.f147712l) != null) {
                aVar.dismiss();
            }
        }
    }

    static final class m<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147726a;

        static {
            Covode.recordClassIndex(97373);
        }

        m(d dVar) {
            this.f147726a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            com.bytedance.tux.tooltip.a aVar;
            com.bytedance.tux.tooltip.a aVar2 = this.f147726a.t;
            if (aVar2 != null && aVar2.isShowing() && (aVar = this.f147726a.t) != null) {
                aVar.dismiss();
            }
        }
    }

    static final class o<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147728a;

        static {
            Covode.recordClassIndex(97375);
        }

        o(d dVar) {
            this.f147728a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (d.c(this.f147728a).getVisibility() == 0) {
                d.c(this.f147728a).setVisibility(8);
            }
        }
    }

    static final class q<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147731a;

        static {
            Covode.recordClassIndex(97378);
        }

        q(d dVar) {
            this.f147731a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (com.ss.android.ugc.aweme.port.in.g.a().e().getEnableCommerceUnlockStickerCollectTips(true)) {
                com.bytedance.scene.ktx.c.a(this.f147731a, new Runnable(this) {
                    /* class com.ss.android.ugc.gamora.recorder.e.d.q.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ q f147732a;

                    static {
                        Covode.recordClassIndex(97379);
                    }

                    {
                        this.f147732a = r1;
                    }

                    public final void run() {
                        d dVar = this.f147732a.f147731a;
                        Activity activity = dVar.f42913m;
                        if (activity == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(activity, "");
                        com.bytedance.tux.tooltip.a.b.a aVar = new com.bytedance.tux.tooltip.a.b.a(activity);
                        View view = dVar.f147708h;
                        if (view == null) {
                            h.f.b.l.a("ivTool");
                        }
                        ((com.bytedance.tux.tooltip.a.b.a) aVar.b(view).a(com.bytedance.tux.tooltip.h.TOP)).e(R.string.g6z).a(3000L).d();
                        com.ss.android.ugc.aweme.port.in.g.a().e().setEnableCommerceUnlockStickerCollectTips(false);
                    }
                });
            }
        }
    }

    static final class j<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147723a;

        static {
            Covode.recordClassIndex(97370);
        }

        j(d dVar) {
            this.f147723a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = en.a(33.0d, com.ss.android.ugc.aweme.port.in.i.f115645a) + this.f147723a.f147711k;
            } else {
                i2 = this.f147723a.f147711k;
            }
            ViewGroup.LayoutParams layoutParams = d.b(this.f147723a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i2;
            d.b(this.f147723a).setLayoutParams(layoutParams2);
        }
    }

    static final class n<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147727a;

        static {
            Covode.recordClassIndex(97374);
        }

        n(d dVar) {
            this.f147727a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (a.a(this.f147727a.E())) {
                this.f147727a.e(4);
                if (num == null) {
                    return;
                }
            } else {
                d dVar = this.f147727a;
                h.f.b.l.b(num, "");
                dVar.e(num.intValue());
            }
            if (num.intValue() == 0) {
                this.f147727a.K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<OpeningChooseMediaPageState, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(97381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(OpeningChooseMediaPageState openingChooseMediaPageState) {
            h.f.b.l.d(openingChooseMediaPageState, "");
            if (h.f.b.l.a(openingChooseMediaPageState, OpeningChooseMediaPageState.OnSceneAnimationEnded.INSTANCE)) {
                if (this.this$0.F().b()) {
                    this.this$0.F().d().a("RecordLocalMediaScene", com.bytedance.bpea.store.a.a.n());
                } else {
                    this.this$0.F().b(false, com.bytedance.bpea.store.a.a.n());
                }
            }
            return z.f158842a;
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147721a;

        static {
            Covode.recordClassIndex(97368);
        }

        h(d dVar) {
            this.f147721a = dVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((Number) ((h.u) obj).getFirst()).intValue() == 3) {
                this.f147721a.F().ag();
                if (this.f147721a.E().f124757b.r != null) {
                    this.f147721a.G().E().e();
                }
                if (this.f147721a.F().b()) {
                    com.ss.android.ugc.aweme.cn.a.f.a(this.f147721a.F().c(), "action_name_start_preview", com.bytedance.bpea.store.a.a.e(), new com.ss.android.ugc.aweme.cn.e(false, false, false, null, null, false, null, false, 254));
                } else {
                    this.f147721a.F().a(false, com.bytedance.bpea.store.a.a.e());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t extends h.f.b.m implements h.f.a.b<ClosingChooseMediaPageState, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(97382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ClosingChooseMediaPageState closingChooseMediaPageState) {
            h.f.b.l.d(closingChooseMediaPageState, "");
            if (h.f.b.l.a(closingChooseMediaPageState, ClosingChooseMediaPageState.Closed.INSTANCE)) {
                if (this.this$0.F().b()) {
                    this.this$0.F().d().b("RecordLocalMediaScene", com.bytedance.bpea.store.a.a.f());
                } else {
                    com.ss.android.ugc.gamora.recorder.b.b bVar = (com.ss.android.ugc.gamora.recorder.b.b) this.this$0.getDiContainer().b(com.ss.android.ugc.gamora.recorder.b.b.class, null);
                    if (bVar != null && bVar.isCurrentTabNeedCamera()) {
                        this.this$0.F().a(false, com.bytedance.bpea.store.a.a.f());
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(97362);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar) {
            super(1);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            RecordPresetResource recordPresetResource;
            String str2 = str;
            h.f.b.l.d(str2, "");
            d dVar = this.this$0;
            String str3 = dVar.E().T;
            if (AVExternalServiceImpl.a().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && dVar.E().f124757b.b()) {
                str3 = dVar.E().X;
            }
            if ((str3 == null || str3.length() == 0) && ((recordPresetResource = dVar.E().V) == null || (str3 = recordPresetResource.getEffectId()) == null)) {
                str3 = dVar.G().D().c();
            }
            com.ss.android.ugc.aweme.common.r.a(str2, new com.ss.android.ugc.tools.f.b().a("creation_id", dVar.E().q).a("shoot_way", dVar.E().r).a("enter_from", "video_shoot_page").a("prop_id", str3).a("prop_selected_from", FaceStickerBean.sCurPropSource).f149193a);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements VEListener.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f147733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f147734b;

        static {
            Covode.recordClassIndex(97380);
        }

        r(d dVar, boolean z) {
            this.f147733a = dVar;
            this.f147734b = z;
        }

        @Override // com.ss.android.vesdk.VEListener.j
        public final void a(int i2) {
            int i3;
            int i4;
            d dVar = this.f147733a;
            boolean z = this.f147734b;
            if (com.ss.android.ugc.aweme.sticker.f.e.a(dVar.G()) != null) {
                dVar.F().D().getEffectController().b(true);
            }
            ShortVideoContext E = dVar.E();
            h.f.b.l.d(E, "");
            if (E.ai) {
                i3 = 1002;
            } else {
                i3 = 3;
            }
            if ((!E.o() || !dd.a()) && CommentUtils.isDataValid(E.f124767l)) {
                i4 = 4;
            } else {
                i4 = 6;
            }
            if (E.ah != null) {
                i4 = 4;
            }
            LocalMediaArgument localMediaArgument = new LocalMediaArgument(1, i3, i4, true, 0, di.a(), com.ss.android.ugc.gamora.recorder.localmedia.c.f148049a, com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(), com.ss.android.ugc.gamora.recorder.localmedia.c.f148049a, com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.a());
            h.f.b.l.d(localMediaArgument, "");
            Bundle bundle = new Bundle();
            bundle.putParcelable("local_media_argument", localMediaArgument);
            bundle.putBoolean("from_upload_btn_click", z);
            bundle.putLong("click_album_icon_time", dVar.u);
            com.bytedance.scene.ktx.b.b(dVar).a(com.ss.android.ugc.gamora.recorder.localmedia.a.class, bundle, (com.bytedance.scene.c.f) null);
        }
    }

    public final void a(boolean z2) {
        if (com.ss.android.ugc.aweme.shortvideo.sticker.c.h(G().t().f())) {
            F().D().h();
        } else {
            com.ss.android.ugc.gamora.recorder.choosemusic.a.a aVar = (com.ss.android.ugc.gamora.recorder.choosemusic.a.a) getDiContainer().b(com.ss.android.ugc.gamora.recorder.choosemusic.a.a.class, null);
            if (aVar != null) {
                aVar.c(null);
            }
        }
        F().a(new r(this, z2));
        if (E().f124757b.r != null) {
            G().E().d();
        }
        if (z2 && !com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(com.bytedance.scene.ktx.c.b(this)).a(ChooseMediaViewModel.class);
            h.f.b.l.b(a2, "");
            ChooseMediaViewModel chooseMediaViewModel = (ChooseMediaViewModel) a2;
            f.a.b.b unused = chooseMediaViewModel.a(this, e.f147736a, new ah(), new s(this));
            f.a.b.b unused2 = chooseMediaViewModel.a(this, f.f147737a, new ah(), new t(this));
        } else if (!F().b()) {
            F().b(false, com.bytedance.bpea.store.a.a.o());
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        boolean z2;
        com.bytedance.creativex.recorder.gesture.api.b I;
        Intent intent;
        com.bytedance.als.g<h.u<Integer, Integer, Intent>> e2;
        super.a(bundle);
        View c2 = c(R.id.dow);
        h.f.b.l.b(c2, "");
        this.f147705e = (TouchSensitiveRelativeLayout) c2;
        View c3 = c(R.id.atv);
        h.f.b.l.b(c3, "");
        this.f147706f = (ViewGroup) c3;
        View c4 = c(R.id.c26);
        h.f.b.l.b(c4, "");
        this.f147708h = c4;
        View c5 = c(R.id.c27);
        h.f.b.l.b(c5, "");
        this.f147709i = c5;
        View c6 = c(R.id.a08);
        h.f.b.l.b(c6, "");
        UploadButton uploadButton = (UploadButton) c6;
        this.f147710j = uploadButton;
        if (uploadButton == null) {
            h.f.b.l.a("uploadButton");
        }
        uploadButton.setText(R.string.h79);
        UploadButton uploadButton2 = this.f147710j;
        if (uploadButton2 == null) {
            h.f.b.l.a("uploadButton");
        }
        uploadButton2.post(new g(this));
        if (!e.a.a().isQuickPromoPlusEnabled() || !h.f.b.l.a((Object) E().x, (Object) "super_entrance")) {
            z2 = false;
        } else {
            z2 = true;
        }
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) activity;
        View view = this.n;
        h.f.b.l.b(view, "");
        com.ss.android.ugc.gamora.recorder.sticker.c.j G2 = G();
        com.bytedance.o.f diContainer = getDiContainer();
        c cVar = new c(this);
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(this, "");
        h.f.b.l.d(view, "");
        h.f.b.l.d(G2, "");
        h.f.b.l.d(diContainer, "");
        h.f.b.l.d(cVar, "");
        new com.ss.android.ugc.gamora.recorder.sticker.c.g(dVar, this, z2, G2, cVar, (ViewGroup) view.findViewById(R.id.atv), (RemoteImageView) view.findViewById(R.id.c26), (RemoteImageView) view.findViewById(R.id.c28), (RemoteImageView) view.findViewById(R.id.c27), diContainer);
        ShortVideoContext E2 = E();
        h.f.b.l.d(E2, "");
        if (E2.f124757b.b() || E2.f124757b.c() || E2.c() || a.a(E2)) {
            e(4);
        } else {
            K();
        }
        this.G.a(this, new j(this));
        this.D.a(this, new k(this));
        if (TextUtils.equals(E().r, "upload_anchor")) {
            b.a.f132249a.start(OpenAlbumPanelPerformanceMonitor.f132344a, "onClick");
            a(false);
        }
        this.H.f147699a.a(this, new l(this));
        this.H.f147700b.a(this, new m(this));
        this.E.a(this, new n(this));
        H().i().a(this, new o(this));
        this.F.a(this, new p(this));
        this.H.f147701c.a(this, new q(this));
        com.ss.android.ugc.aweme.shortvideo.h.a aVar = (com.ss.android.ugc.aweme.shortvideo.h.a) getDiContainer().b(com.ss.android.ugc.aweme.shortvideo.h.a.class, null);
        if (!(aVar == null || (e2 = aVar.e()) == null)) {
            e2.a(this, new h(this));
        }
        Activity activity2 = this.f42913m;
        if (!(activity2 == null || (intent = activity2.getIntent()) == null)) {
            String a2 = a(intent, "extra_super_entrance_pop");
            if (!TextUtils.isEmpty(a2)) {
                if (this.f147712l == null) {
                    Activity activity3 = this.f42913m;
                    if (activity3 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity3, "");
                    com.bytedance.tux.tooltip.a.b.a aVar2 = new com.bytedance.tux.tooltip.a.b.a(activity3);
                    if (a2 == null) {
                        h.f.b.l.b();
                    }
                    com.bytedance.tux.tooltip.b a3 = aVar2.a(a2).a(-1001L).a(com.bytedance.tux.tooltip.h.TOP);
                    View view2 = this.f147708h;
                    if (view2 == null) {
                        h.f.b.l.a("ivTool");
                    }
                    this.f147712l = a3.b(view2).d();
                }
                View view3 = this.f147708h;
                if (view3 == null) {
                    h.f.b.l.a("ivTool");
                }
                view3.postDelayed(new b(this), 1000);
                new SuperEntranceEvent(1, false).post();
            }
        }
        UploadButton uploadButton3 = this.f147710j;
        if (uploadButton3 == null) {
            h.f.b.l.a("uploadButton");
        }
        if (uploadButton3.getVisibility() == 0 && !this.f147707g.f147805a.getBoolean("upload_tip_show", false) && !h.f.b.l.a((Object) E().r, (Object) "duet") && !h.f.b.l.a((Object) E().r, (Object) "split") && !h.f.b.l.a((Object) E().r, (Object) "react")) {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            h.f.b.l.b(createIAVServiceProxybyMonsterPlugin, "");
            if (!createIAVServiceProxybyMonsterPlugin.getStoryService().e() || com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                if (this.t == null) {
                    Activity activity4 = this.f42913m;
                    if (activity4 == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(activity4, "");
                    com.bytedance.tux.tooltip.b a4 = new com.bytedance.tux.tooltip.a.b.a(activity4).e(R.string.b0m).a(-1001L).a(com.bytedance.tux.tooltip.h.TOP);
                    UploadButton uploadButton4 = this.f147710j;
                    if (uploadButton4 == null) {
                        h.f.b.l.a("uploadButton");
                    }
                    this.t = a4.b(uploadButton4).a(5000L).d();
                }
                UploadButton uploadButton5 = this.f147710j;
                if (uploadButton5 == null) {
                    h.f.b.l.a("uploadButton");
                }
                uploadButton5.postDelayed(new f(this), 100);
            }
        }
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().isDuetAutoApplyEffectEnabled() && E().f124757b.b()) {
            G().u().a(new u(this));
        }
        if (!com.ss.android.ugc.aweme.port.in.g.a().A().a() && az.a() == 1 && (I = I()) != null) {
            I.a(new i(this), 0);
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public <VM1 extends JediViewModel<S1>, S1 extends af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.bit, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, ah<ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, ah<ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public <S extends af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends ac<? extends A>> kVar, ah<ak<ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, ah<al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, ah<ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public d(com.bytedance.o.f fVar, com.bytedance.als.h<Integer> hVar, com.bytedance.als.h<Integer> hVar2, com.bytedance.als.g<z> gVar, com.bytedance.als.h<Boolean> hVar3, c cVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(hVar, "");
        h.f.b.l.d(hVar2, "");
        h.f.b.l.d(gVar, "");
        h.f.b.l.d(hVar3, "");
        h.f.b.l.d(cVar, "");
        this.C = fVar;
        this.D = hVar;
        this.E = hVar2;
        this.F = gVar;
        this.G = hVar3;
        this.H = cVar;
        com.bytedance.als.k<z> kVar = new com.bytedance.als.k<>();
        this.f147703c = kVar;
        this.f147704d = kVar;
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, ah<am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public <S extends af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, ah<an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(sVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
