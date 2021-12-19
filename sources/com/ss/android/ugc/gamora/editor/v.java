package com.ss.android.ugc.gamora.editor;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.b;
import com.bytedance.o.n;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.v;
import com.ss.android.ugc.aweme.services.shoutout.IShoutOutsService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.k;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.ds;
import com.ss.android.ugc.aweme.utils.fa;
import com.ss.android.ugc.aweme.view.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.c.b;
import com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel;
import com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class v extends com.ss.android.ugc.gamora.editor.rootscene.d implements com.bytedance.jedi.arch.b, com.bytedance.o.a, ab, s {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f147172b = {new h.f.b.y(v.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};
    public static final ab t = new ab((byte) 0);
    private final h.h A = h.i.a(h.m.NONE, new s(this));
    private final h.h B = h.i.a(h.m.NONE, new d(this));
    private final h.h C = h.i.a(h.m.NONE, new e(this));
    private final h.h.d D = new aa(this, this);
    private final h.h E = h.i.a(h.m.NONE, new f(this));
    private final h.h F = h.i.a(h.m.NONE, new t(this));
    private final h.h G = h.i.a(h.m.NONE, new h(this));
    private final h.h H = h.i.a(h.m.NONE, new i(this));
    private final h.h I = h.i.a(h.m.NONE, new j(this));
    private final h.h J = h.i.a(h.m.NONE, new u(this));
    private final h.h K = h.i.a(h.m.NONE, new C3949v(this));
    private final h.h L = h.i.a(h.m.NONE, new b(this));
    private final h.h M = h.i.a(h.m.NONE, new w(this));
    private final h.h N = h.i.a(h.m.NONE, new x(this));
    private final h.h O = h.i.a(h.m.NONE, new y(this));
    private final h.h P = h.i.a(h.m.NONE, new z(this));
    private final h.h Q;
    private com.ss.android.ugc.aweme.infoSticker.i R;
    private com.ss.android.ugc.aweme.shortvideo.edit.bq S;
    private Dialog T;
    private boolean U;
    private final h.h V;
    private final h.h W;
    private final com.bytedance.o.f X;

    /* renamed from: c  reason: collision with root package name */
    public VideoPublishEditModel f147173c;

    /* renamed from: d  reason: collision with root package name */
    final h.h f147174d = h.i.a(h.m.NONE, new g(this));

    /* renamed from: e  reason: collision with root package name */
    final h.h f147175e = h.i.a(h.m.NONE, new k(this));

    /* renamed from: f  reason: collision with root package name */
    final h.h f147176f = h.i.a(h.m.NONE, new c(this));

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.f.a.a.j f147177g;

    /* renamed from: h  reason: collision with root package name */
    View f147178h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.editor.a.b f147179i;

    /* renamed from: j  reason: collision with root package name */
    boolean f147180j;

    /* renamed from: k  reason: collision with root package name */
    boolean f147181k;

    /* renamed from: l  reason: collision with root package name */
    final h.h f147182l;
    private final h.h v = h.i.a(h.m.NONE, new q(this));
    private final h.h w = h.i.a((h.f.a.a) new cs(this));
    private final h.h x = h.i.a((h.f.a.a) new ct(this));
    private final h.h y = h.i.a(h.m.NONE, new a(this));
    private final h.h z = h.i.a(h.m.NONE, new r(this));

    static {
        Covode.recordClassIndex(96962);
    }

    private final com.ss.android.ugc.gamora.editor.corner.a ar() {
        return (com.ss.android.ugc.gamora.editor.corner.a) this.H.getValue();
    }

    private final EditToolbarViewModel as() {
        return (EditToolbarViewModel) this.W.getValue();
    }

    public final w E() {
        return (w) this.w.getValue();
    }

    /* renamed from: F */
    public final com.ss.android.ugc.gamora.editor.sticker.core.c G() {
        return (com.ss.android.ugc.gamora.editor.sticker.core.c) this.x.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.toolbar.s H() {
        return (com.ss.android.ugc.gamora.editor.toolbar.s) this.y.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c I() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c) this.z.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h J() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h) this.A.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.edit.effect.a K() {
        return (com.ss.android.ugc.aweme.shortvideo.edit.effect.a) this.B.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.b.a L() {
        return (com.ss.android.ugc.gamora.editor.b.a) this.C.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.music.a M() {
        return (com.ss.android.ugc.gamora.editor.music.a) this.D.a(this, f147172b[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.filter.core.a N() {
        return (com.ss.android.ugc.gamora.editor.filter.core.a) this.E.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.progress.a O() {
        return (com.ss.android.ugc.gamora.editor.progress.a) this.F.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.sticker.core.a P() {
        return (com.ss.android.ugc.gamora.editor.sticker.core.a) this.G.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.e.c Q() {
        return (com.ss.android.ugc.gamora.editor.e.c) this.I.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.multiedit.a R() {
        return (com.ss.android.ugc.gamora.editor.multiedit.a) this.J.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.sticker.panel.a S() {
        return (com.ss.android.ugc.gamora.editor.sticker.panel.a) this.K.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.cutmusic.a U() {
        return (com.ss.android.ugc.gamora.editor.cutmusic.a) this.L.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.subtitle.e V() {
        return (com.ss.android.ugc.gamora.editor.subtitle.e) this.M.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.gamora.editor.a.d Y() {
        return (com.ss.android.ugc.gamora.editor.a.d) this.N.getValue();
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.editcut.f Z() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.f) this.O.getValue();
    }

    public final com.ss.android.ugc.gamora.editor.progressbar.a ab() {
        return (com.ss.android.ugc.gamora.editor.progressbar.a) this.P.getValue();
    }

    public final com.ss.android.ugc.aweme.shortvideo.subtitle.b ac() {
        return (com.ss.android.ugc.aweme.shortvideo.subtitle.b) this.V.getValue();
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void af() {
        this.f147180j = false;
    }

    @Override // com.bytedance.jedi.arch.h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public static final class ab {
        static {
            Covode.recordClassIndex(96965);
        }

        private ab() {
        }

        public /* synthetic */ ab(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final boolean W() {
        return this.f147180j;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.ae
    public final /* bridge */ /* synthetic */ com.bytedance.jedi.arch.i getReceiver() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.isStickPointMode) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            if (!videoPublishEditModel2.mIsFromDraft) {
                new com.ss.android.ugc.aweme.tux.a.i.a(this.f42913m).a(R.string.g7g).a();
                return;
            }
            return;
        }
        boolean z3 = false;
        H().a(false);
        com.ss.android.ugc.aweme.port.in.l.f115658a.b().i();
        com.ss.android.ugc.gamora.editor.music.a M2 = M();
        if (M2 != null) {
            M2.b(z2);
        }
        Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        com.ss.android.ugc.aweme.shortvideo.c cVar = com.ss.android.ugc.aweme.shortvideo.cr.a().f125295a;
        boolean isMvThemeMusic = cVar != null ? cVar.isMvThemeMusic() : false;
        ac aq2 = aq();
        VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        if (com.ss.android.ugc.aweme.shortvideo.edit.bp.m(videoPublishEditModel3) && !isMvThemeMusic) {
            z3 = true;
        }
        aq2.a(z3);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(boolean z2, boolean z3, Runnable runnable) {
        h.f.b.l.d(runnable, "");
        a(z2, z3, runnable, (Runnable) null);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(boolean z2, boolean z3, Runnable runnable, Runnable runnable2) {
        h.f.b.l.d(runnable, "");
        com.ss.android.ugc.asve.editor.g value = Q().C().getValue();
        if (value != null) {
            VideoPublishEditModel videoPublishEditModel = this.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel.getPreviewInfo().setPreviewVideoLength(value.j());
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel2.mIsFromDraft) {
            VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel3.isDraftMusicIllegal && com.ss.android.ugc.aweme.shortvideo.cr.a().f125295a != null) {
                VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
                if (videoPublishEditModel4 == null) {
                    h.f.b.l.a("mModel");
                }
                videoPublishEditModel4.isDraftMusicIllegal = false;
            }
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel5.isMvThemeVideoType()) {
            au();
            com.ss.android.ugc.asve.editor.g ak2 = ak();
            VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
            if (videoPublishEditModel6 == null) {
                h.f.b.l.a("mModel");
            }
            String str = videoPublishEditModel6.mvCreateVideoData.videoCoverImgPath;
            VideoPublishEditModel videoPublishEditModel7 = this.f147173c;
            if (videoPublishEditModel7 == null) {
                h.f.b.l.a("mModel");
            }
            new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c(ak2, str, videoPublishEditModel7.mvCreateVideoData.videoCoverStartTime, az.f147219a, new ba(this, z2, z3, runnable, runnable2));
            return;
        }
        VideoPublishEditModel videoPublishEditModel8 = this.f147173c;
        if (videoPublishEditModel8 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel8.isMultiVideoEdit()) {
            VideoPublishEditModel videoPublishEditModel9 = this.f147173c;
            if (videoPublishEditModel9 == null) {
                h.f.b.l.a("mModel");
            }
            if (es.j(videoPublishEditModel9)) {
                av();
                com.ss.android.ugc.asve.editor.g ak3 = ak();
                VideoPublishEditModel videoPublishEditModel10 = this.f147173c;
                if (videoPublishEditModel10 == null) {
                    h.f.b.l.a("mModel");
                }
                String str2 = videoPublishEditModel10.multiEditVideoRecordData.coverImagePath;
                VideoPublishEditModel videoPublishEditModel11 = this.f147173c;
                if (videoPublishEditModel11 == null) {
                    h.f.b.l.a("mModel");
                }
                new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c(ak3, str2, (int) videoPublishEditModel11.getMultiEditVideoStartTime(), bb.f147225a, new bc(this, z2, z3, runnable, runnable2));
                return;
            }
        }
        a(false, z2, z3, runnable, runnable2);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(boolean z2, boolean z3, boolean z4, Runnable runnable) {
        h.f.b.l.d(runnable, "");
        b(z2, z3, z4, runnable);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(boolean z2, boolean z3, boolean z4, Runnable runnable, Runnable runnable2) {
        h.f.b.l.d(runnable, "");
        a((Runnable) new ai(this, runnable2, z2, z3, z4, runnable), true);
    }

    public final void a(boolean z2, boolean z3, Intent intent) {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.mShoutOutsData == null) {
            Activity t2 = t();
            h.f.b.l.b(t2, "");
            com.ss.android.ugc.gamora.editor.c.c.a(new b.c(z2, z3, t2, intent));
            return;
        }
        String str = com.ss.android.ugc.aweme.shoutouts.d.MODE_CREATE;
        VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        if (!h.f.b.l.a((Object) str, (Object) videoPublishEditModel2.mShoutOutsData.getShoutOutsMode())) {
            String str2 = com.ss.android.ugc.aweme.shoutouts.d.MODE_EDIT;
            VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            if (!h.f.b.l.a((Object) str2, (Object) videoPublishEditModel3.mShoutOutsData.getShoutOutsMode())) {
                String str3 = com.ss.android.ugc.aweme.shoutouts.d.MODE_SEND;
                VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
                if (videoPublishEditModel4 == null) {
                    h.f.b.l.a("mModel");
                }
                if (h.f.b.l.a((Object) str3, (Object) videoPublishEditModel4.mShoutOutsData.getShoutOutsMode())) {
                    IShoutOutsService shoutOutsService = AVExternalServiceImpl.a().shoutOutsService();
                    Activity t3 = t();
                    Objects.requireNonNull(t3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    androidx.fragment.app.e eVar = (androidx.fragment.app.e) t3;
                    VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
                    if (videoPublishEditModel5 == null) {
                        h.f.b.l.a("mModel");
                    }
                    shoutOutsService.publishShoutOuts(eVar, videoPublishEditModel5);
                    return;
                }
                return;
            }
        }
        IShoutOutsService shoutOutsService2 = AVExternalServiceImpl.a().shoutOutsService();
        Activity t4 = t();
        h.f.b.l.b(t4, "");
        shoutOutsService2.startShoutoutsPublishActivity(t4, intent);
    }

    @Override // com.ss.android.ugc.gamora.editor.s
    public final void a(String str, int i2, int i3, int i4, boolean z2) {
        h.f.b.l.d(str, "");
        ax();
        b.i.b(new be(this, str, i2, i3, z2), b.i.f4824a).a(new bf(this, str, z2, i4, i2), b.i.f4826c, null);
    }

    static final class ac extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.subtitle.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f147185a = new ac();

        static {
            Covode.recordClassIndex(96966);
        }

        ac() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.subtitle.b invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.subtitle.b();
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.n> {

        /* renamed from: a  reason: collision with root package name */
        public static final ak f147199a = new ak();

        static {
            Covode.recordClassIndex(96974);
        }

        ak() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.n invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.edit.n();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cn extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ cm $createCommentOrQaTitle$1;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        cn(v vVar, cm cmVar) {
            super(0);
            this.this$0 = vVar;
            this.$createCommentOrQaTitle$1 = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            int i2;
            AVTextExtraStruct createQuestionStruct;
            CommentVideoModel commentVideoModel = v.a(this.this$0).commentVideoModel;
            if (commentVideoModel != null) {
                StringBuilder a2 = this.$createCommentOrQaTitle$1.invoke("@" + commentVideoModel.getUserName());
                ArrayList arrayList = new ArrayList();
                String userName = commentVideoModel.getUserName();
                if (userName == null) {
                    userName = "";
                }
                int indexOf = a2.indexOf(userName) - 1;
                int i3 = indexOf + 1;
                String userName2 = commentVideoModel.getUserName();
                if (userName2 != null) {
                    i2 = userName2.length();
                } else {
                    i2 = 0;
                }
                int i4 = i3 + i2;
                String str = "0";
                if (commentVideoModel.isComment()) {
                    String userId = commentVideoModel.getUserId();
                    if (userId != null) {
                        str = userId;
                    }
                    createQuestionStruct = AVTextExtraStructHelper.createCommentStruct(indexOf, i4, str);
                } else {
                    String userId2 = commentVideoModel.getUserId();
                    if (userId2 != null) {
                        str = userId2;
                    }
                    createQuestionStruct = AVTextExtraStructHelper.createQuestionStruct(indexOf, i4, str);
                }
                arrayList.add(createQuestionStruct);
                if (v.a(this.this$0).structList != null) {
                    for (AVTextExtraStruct aVTextExtraStruct : v.a(this.this$0).structList) {
                        h.f.b.l.b(aVTextExtraStruct, "");
                        aVTextExtraStruct.setStart(aVTextExtraStruct.getStart() + a2.toString().length());
                        aVTextExtraStruct.setEnd(aVTextExtraStruct.getEnd() + a2.toString().length());
                    }
                    VideoPublishEditModel a3 = v.a(this.this$0);
                    List list = v.a(this.this$0).structList;
                    h.f.b.l.b(list, "");
                    a3.structList = h.a.n.d((Collection) arrayList, (Iterable) list);
                } else {
                    v.a(this.this$0).structList = arrayList;
                }
                String sb = a2.toString();
                VideoPublishEditModel a4 = v.a(this.this$0);
                a4.title = v.a(this.this$0).title != null ? sb + v.a(this.this$0).title : sb;
                VideoPublishEditModel a5 = v.a(this.this$0);
                if (v.a(this.this$0).chain != null) {
                    sb = sb + v.a(this.this$0).chain;
                }
                a5.chain = sb;
                v.a(this.this$0).disableDeleteChain = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class co extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ cm $createCommentOrQaTitle$1;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        co(v vVar, cm cmVar) {
            super(0);
            this.this$0 = vVar;
            this.$createCommentOrQaTitle$1 = cmVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            int i2;
            String str;
            if (v.a(this.this$0).structList != null && v.a(this.this$0).structList.size() != 0) {
                AVTextExtraStruct aVTextExtraStruct = null;
                List list = v.a(this.this$0).structList;
                String str2 = "";
                h.f.b.l.b(list, str2);
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) v.a(this.this$0).structList.get(i5);
                    h.f.b.l.b(aVTextExtraStruct2, str2);
                    if (aVTextExtraStruct2.getSubType() == 2) {
                        i4 = i5;
                        aVTextExtraStruct = aVTextExtraStruct2;
                    }
                }
                if (aVTextExtraStruct != null) {
                    String str3 = v.a(this.this$0).title;
                    h.f.b.l.b(str3, str2);
                    int start = aVTextExtraStruct.getStart();
                    int end = aVTextExtraStruct.getEnd();
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                    String substring = str3.substring(start, end);
                    h.f.b.l.b(substring, str2);
                    int length = this.$createCommentOrQaTitle$1.invoke(substring).length();
                    List list2 = v.a(this.this$0).structList;
                    h.f.b.l.b(list2, str2);
                    int size2 = list2.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        if (i6 > i4) {
                            Object obj = v.a(this.this$0).structList.get(i6);
                            h.f.b.l.b(obj, str2);
                            AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) obj;
                            aVTextExtraStruct3.setStart(aVTextExtraStruct3.getStart() - length);
                            Object obj2 = v.a(this.this$0).structList.get(i6);
                            h.f.b.l.b(obj2, str2);
                            AVTextExtraStruct aVTextExtraStruct4 = (AVTextExtraStruct) obj2;
                            aVTextExtraStruct4.setEnd(aVTextExtraStruct4.getEnd() - length);
                        }
                    }
                    aVTextExtraStruct.getEnd();
                    aVTextExtraStruct.getStart();
                    try {
                        VideoPublishEditModel a2 = v.a(this.this$0);
                        String str4 = v.a(this.this$0).title;
                        if (str4 != null) {
                            i2 = str4.length();
                        } else {
                            i2 = 0;
                        }
                        if (i2 >= length) {
                            String str5 = v.a(this.this$0).title;
                            h.f.b.l.b(str5, str2);
                            int end2 = (aVTextExtraStruct.getEnd() - length) + 1;
                            int end3 = aVTextExtraStruct.getEnd() + 1;
                            if (str5 != null) {
                                str = h.m.p.a(str5, end2, end3).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            str = str2;
                        }
                        a2.title = str;
                        VideoPublishEditModel a3 = v.a(this.this$0);
                        String str6 = v.a(this.this$0).chain;
                        if (str6 != null) {
                            i3 = str6.length();
                        }
                        if (i3 >= length) {
                            String str7 = v.a(this.this$0).chain;
                            h.f.b.l.b(str7, str2);
                            int end4 = (aVTextExtraStruct.getEnd() - length) + 1;
                            int end5 = aVTextExtraStruct.getEnd() + 1;
                            if (str7 != null) {
                                str2 = h.m.p.a(str7, end4, end5).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                        a3.chain = str2;
                        v.a(this.this$0).structList.remove(aVTextExtraStruct);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cr extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ cp $createQaCaptionTitle$4;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        cr(v vVar, cp cpVar) {
            super(0);
            this.this$0 = vVar;
            this.$createQaCaptionTitle$4 = cpVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            a();
            return h.z.f158842a;
        }

        public final void a() {
            int i2;
            AVTextExtraStruct aVTextExtraStruct;
            Object obj;
            String str;
            String str2;
            int i3;
            int end;
            int i4;
            int end2;
            int i5;
            String str3;
            if (v.a(this.this$0).structList != null && v.a(this.this$0).structList.size() != 0) {
                List list = v.a(this.this$0).structList;
                String str4 = "";
                h.f.b.l.b(list, str4);
                int size = list.size();
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    i2 = R.string.f6j;
                    if (i7 < size) {
                        aVTextExtraStruct = (AVTextExtraStruct) v.a(this.this$0).structList.get(i7);
                        h.f.b.l.b(aVTextExtraStruct, str4);
                        if (aVTextExtraStruct.getSubType() == 5) {
                            i2 = R.string.f6k;
                            break;
                        } else if (aVTextExtraStruct.getSubType() == 7) {
                            break;
                        } else {
                            i7++;
                        }
                    } else {
                        return;
                    }
                }
                String str5 = v.a(this.this$0).title;
                h.f.b.l.b(str5, str4);
                int start = aVTextExtraStruct.getStart();
                int end3 = aVTextExtraStruct.getEnd();
                Objects.requireNonNull(str5, "null cannot be cast to non-null type java.lang.String");
                String substring = str5.substring(start, end3);
                h.f.b.l.b(substring, str4);
                int length = this.$createQaCaptionTitle$4.a(substring, i2).length();
                List list2 = v.a(this.this$0).structList;
                h.f.b.l.b(list2, str4);
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    if (i8 > i7) {
                        Object obj2 = v.a(this.this$0).structList.get(i8);
                        h.f.b.l.b(obj2, str4);
                        AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) obj2;
                        aVTextExtraStruct2.setStart(aVTextExtraStruct2.getStart() - length);
                        Object obj3 = v.a(this.this$0).structList.get(i8);
                        h.f.b.l.b(obj3, str4);
                        AVTextExtraStruct aVTextExtraStruct3 = (AVTextExtraStruct) obj3;
                        aVTextExtraStruct3.setEnd(aVTextExtraStruct3.getEnd() - length);
                    }
                }
                try {
                    if (((aVTextExtraStruct.getEnd() + 1) + 1) - length < 0) {
                        i3 = 0;
                    } else {
                        i3 = ((aVTextExtraStruct.getEnd() + 1) + 1) - length;
                    }
                    if (aVTextExtraStruct.getEnd() + 1 > v.a(this.this$0).title.length()) {
                        end = v.a(this.this$0).title.length();
                    } else {
                        end = aVTextExtraStruct.getEnd() + 1;
                    }
                    if (i3 < v.a(this.this$0).title.length()) {
                        VideoPublishEditModel a2 = v.a(this.this$0);
                        String str6 = v.a(this.this$0).title;
                        if (str6 != null) {
                            i5 = str6.length();
                        } else {
                            i5 = 0;
                        }
                        if (i5 >= length) {
                            String str7 = v.a(this.this$0).title;
                            h.f.b.l.b(str7, str4);
                            if (str7 != null) {
                                str3 = h.m.p.a(str7, i3, end).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        } else {
                            str3 = str4;
                        }
                        a2.title = str3;
                    }
                    if (((aVTextExtraStruct.getEnd() + 1) + 1) - length < 0) {
                        i4 = 0;
                    } else {
                        i4 = ((aVTextExtraStruct.getEnd() + 1) + 1) - length;
                    }
                    if (aVTextExtraStruct.getEnd() + 1 > v.a(this.this$0).chain.length()) {
                        end2 = v.a(this.this$0).chain.length();
                    } else {
                        end2 = aVTextExtraStruct.getEnd() + 1;
                    }
                    if (i4 < v.a(this.this$0).chain.length()) {
                        VideoPublishEditModel a3 = v.a(this.this$0);
                        String str8 = v.a(this.this$0).chain;
                        if (str8 != null) {
                            i6 = str8.length();
                        }
                        if (i6 >= length) {
                            String str9 = v.a(this.this$0).chain;
                            h.f.b.l.b(str9, str4);
                            if (str9 != null) {
                                str4 = h.m.p.a(str9, i4, end2).toString();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                            }
                        }
                        a3.chain = str4;
                    }
                    v.a(this.this$0).structList.remove(aVTextExtraStruct);
                } catch (Exception unused) {
                    StringBuilder append = new StringBuilder("start: ").append(Integer.valueOf(aVTextExtraStruct.getStart())).append(" end: ").append(Integer.valueOf(aVTextExtraStruct.getEnd())).append(" chainLength ");
                    VideoPublishEditModel a4 = v.a(this.this$0);
                    Object obj4 = "null";
                    if (a4 == null || (str2 = a4.chain) == null) {
                        obj = obj4;
                    } else {
                        obj = Integer.valueOf(str2.length());
                    }
                    StringBuilder append2 = append.append(obj).append("titleLength ");
                    VideoPublishEditModel a5 = v.a(this.this$0);
                    if (!(a5 == null || (str = a5.title) == null)) {
                        obj4 = Integer.valueOf(str.length());
                    }
                    com.ss.android.ugc.tools.utils.q.a("EditRootScene", append2.append(obj4).toString());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.s
    public final void X() {
        a(false);
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void ag() {
        super.ag();
        this.f147181k = true;
    }

    @Override // com.bytedance.jedi.arch.v
    public final androidx.lifecycle.m getLifecycleOwner() {
        return b.a.a(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.v getLifecycleOwnerHolder() {
        return b.a.b(this);
    }

    @Override // com.bytedance.jedi.arch.h
    public final com.bytedance.jedi.arch.ae<com.bytedance.jedi.arch.i> getReceiverHolder() {
        return b.a.c(this);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.toolbar.s> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.toolbar.s] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.toolbar.s invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.toolbar.s> r1 = com.ss.android.ugc.gamora.editor.toolbar.s.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.a.invoke():com.bytedance.als.b");
        }
    }

    public static final class ag implements com.ss.android.ugc.aweme.shortvideo.subtitle.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f147190b;

        static {
            Covode.recordClassIndex(96970);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.l
        public final void a() {
            this.f147190b.element.dismiss();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.subtitle.l
        public final void b() {
            this.f147189a.ac().f130920a.storeBoolean("has_accept_caption_protocol_" + com.ss.android.ugc.aweme.shortvideo.bn.a(com.ss.android.ugc.aweme.port.in.g.a().A().c()), true);
            VideoPublishEditModel a2 = v.a(this.f147189a);
            h.f.b.l.d(a2, "");
            com.ss.android.ugc.aweme.common.r.a("caption_intro_accept", com.ss.android.ugc.aweme.shortvideo.edit.bl.d(a2).f149193a);
            this.f147189a.aj();
        }

        ag(v vVar, z.e eVar) {
            this.f147189a = vVar;
            this.f147190b = eVar;
        }
    }

    public static final class av implements com.ss.android.ugc.aweme.infoSticker.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147214a;

        static {
            Covode.recordClassIndex(96988);
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.g
        public final void L() {
            this.f147214a.G().L();
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.g
        public final void M() {
            this.f147214a.G().M();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        av(v vVar) {
            this.f147214a = vVar;
        }

        @Override // com.ss.android.ugc.aweme.infoSticker.g
        public final void a(Effect effect, String str) {
            h.f.b.l.d(effect, "");
            this.f147214a.G().a(effect, str);
        }
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.cutmusic.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(96993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.cutmusic.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.cutmusic.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.cutmusic.a> r1 = com.ss.android.ugc.gamora.editor.cutmusic.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.b.invoke():com.bytedance.als.b");
        }
    }

    static final class ba implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147220a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f147221b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f147222c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f147223d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Runnable f147224e;

        static {
            Covode.recordClassIndex(96994);
        }

        ba(v vVar, boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
            this.f147220a = vVar;
            this.f147221b = z;
            this.f147222c = z2;
            this.f147223d = runnable;
            this.f147224e = runnable2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a
        public final void a() {
            this.f147220a.a(false, this.f147221b, this.f147222c, this.f147223d, this.f147224e);
        }
    }

    static final class bc implements com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f147227b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f147228c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f147229d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Runnable f147230e;

        static {
            Covode.recordClassIndex(96996);
        }

        bc(v vVar, boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
            this.f147226a = vVar;
            this.f147227b = z;
            this.f147228c = z2;
            this.f147229d = runnable;
            this.f147230e = runnable2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a
        public final void a() {
            this.f147226a.a(false, this.f147227b, this.f147228c, this.f147229d, this.f147230e);
        }
    }

    public static final class bg implements VEListener.p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147242a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f147243b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f147244c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Intent f147245d;

        static {
            Covode.recordClassIndex(97000);
        }

        @Override // com.ss.android.vesdk.VEListener.p
        public final void a() {
            this.f147242a.a(this.f147243b, this.f147244c, this.f147245d);
        }

        @Override // com.ss.android.vesdk.VEListener.p
        public final void b() {
            this.f147242a.a(this.f147243b, this.f147244c, this.f147245d);
        }

        bg(v vVar, boolean z, boolean z2, Intent intent) {
            this.f147242a = vVar;
            this.f147243b = z;
            this.f147244c = z2;
            this.f147245d = intent;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.volume.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97021);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.volume.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.volume.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.volume.a> r1 = com.ss.android.ugc.gamora.editor.volume.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.c.invoke():com.bytedance.als.b");
        }
    }

    static final class cs extends h.f.b.m implements h.f.a.a<w> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        cs(v vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ w invoke() {
            w wVar = new w();
            this.this$0.a(R.id.atb, wVar, "EditStickerDeleteScene");
            return wVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.effect.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.effect.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.effect.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.effect.a> r1 = com.ss.android.ugc.aweme.shortvideo.edit.effect.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.d.invoke():com.bytedance.als.b");
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.b.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.b.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.b.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.b.a> r1 = com.ss.android.ugc.gamora.editor.b.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.e.invoke():com.bytedance.als.b");
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.filter.core.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.core.a> r1 = com.ss.android.ugc.gamora.editor.filter.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.f.invoke():com.bytedance.als.b");
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.filter.indicator.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.filter.indicator.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.filter.indicator.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.filter.indicator.a> r1 = com.ss.android.ugc.gamora.editor.filter.indicator.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.g.invoke():com.bytedance.als.b");
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.core.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.sticker.core.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.core.a> r1 = com.ss.android.ugc.gamora.editor.sticker.core.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.h.invoke():com.bytedance.als.b");
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.corner.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.corner.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.corner.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.corner.a> r1 = com.ss.android.ugc.gamora.editor.corner.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.i.invoke():com.bytedance.als.b");
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.e.c> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.e.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.e.c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.e.c> r1 = com.ss.android.ugc.gamora.editor.e.c.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.j.invoke():com.bytedance.als.b");
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.gesture.a> {
        final /* synthetic */ com.bytedance.o.a $this_api;

        static {
            Covode.recordClassIndex(97057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(com.bytedance.o.a aVar) {
            super(0);
            this.$this_api = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.gesture.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.gesture.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_api
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.gesture.a> r1 = com.ss.android.ugc.gamora.editor.gesture.a.class
                r0 = 0
                java.lang.Object r0 = r2.a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.k.invoke():com.bytedance.als.b");
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c> r1 = com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.r.invoke():com.bytedance.als.b");
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h> r1 = com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.s.invoke():com.bytedance.als.b");
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progress.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97066);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public t(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.progress.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progress.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progress.a> r1 = com.ss.android.ugc.gamora.editor.progress.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.t.invoke():com.bytedance.als.b");
        }
    }

    public static final class u extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.multiedit.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97067);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.multiedit.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.multiedit.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.multiedit.a> r1 = com.ss.android.ugc.gamora.editor.multiedit.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.u.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.v$v  reason: collision with other inner class name */
    public static final class C3949v extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.panel.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3949v(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.panel.a, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.panel.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.panel.a> r1 = com.ss.android.ugc.gamora.editor.sticker.panel.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.C3949v.invoke():com.bytedance.als.b");
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.subtitle.e> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.subtitle.e, com.bytedance.als.b] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.subtitle.e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.subtitle.e> r1 = com.ss.android.ugc.gamora.editor.subtitle.e.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.w.invoke():com.bytedance.als.b");
        }
    }

    public static final class x extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.a.d> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.a.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.a.d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.a.d> r1 = com.ss.android.ugc.gamora.editor.a.d.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.x.invoke():com.bytedance.als.b");
        }
    }

    public static final class y extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.f> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97071);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.shortvideo.editcut.f] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.shortvideo.editcut.f invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.editcut.f> r1 = com.ss.android.ugc.aweme.shortvideo.editcut.f.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.y.invoke():com.bytedance.als.b");
        }
    }

    public static final class z extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.progressbar.a> {
        final /* synthetic */ com.bytedance.o.a $this_optApi;

        static {
            Covode.recordClassIndex(97072);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public z(com.bytedance.o.a aVar) {
            super(0);
            this.$this_optApi = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.editor.progressbar.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.progressbar.a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.$this_optApi
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.editor.progressbar.a> r1 = com.ss.android.ugc.gamora.editor.progressbar.a.class
                r0 = 0
                java.lang.Object r0 = r2.b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.z.invoke():com.bytedance.als.b");
        }
    }

    private static boolean at() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.ab
    public final com.ss.android.ugc.aweme.shortvideo.edit.bq T() {
        com.ss.android.ugc.aweme.shortvideo.edit.bq bqVar = this.S;
        if (bqVar == null) {
            h.f.b.l.a("mVideoSizeProvider");
        }
        return bqVar;
    }

    public final com.ss.android.ugc.asve.editor.g ak() {
        return Q().C().getValue();
    }

    public final void al() {
        Dialog dialog = this.T;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.T = null;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void an() {
        com.ss.android.ugc.aweme.shortvideo.editcut.f Z = Z();
        if (Z != null) {
            Z.a();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        com.bytedance.o.f b2 = com.bytedance.als.dsl.c.b(this);
        if (b2 == null) {
            h.f.b.l.b();
        }
        return b2;
    }

    @Override // com.bytedance.scene.j
    public final void n_() {
        super.n_();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127972a = 0;
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127973b = 0;
    }

    @Override // com.bytedance.scene.j
    public final void x() {
        super.x();
        com.ss.android.ugc.aweme.shortvideo.util.ar.f132216a.b();
    }

    static final class ct extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.gamora.editor.sticker.core.c> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ct(v vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.core.c invoke() {
            com.bytedance.scene.j a2 = this.this$0.a("EditStickerScene");
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            return a2;
        }
    }

    public static final class q extends h.f.b.m implements h.f.a.a<EditInfoStickerViewModel> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(v vVar) {
            super(0);
            this.this$0 = vVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel invoke() {
            /*
                r2 = this;
                com.ss.android.ugc.gamora.editor.v r0 = r2.this$0
                androidx.fragment.app.e r0 = com.bytedance.scene.ktx.c.b(r0)
                com.bytedance.jedi.arch.s r1 = com.bytedance.jedi.arch.t.a(r0)
                java.lang.Class<com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel> r0 = com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel.class
                com.bytedance.jedi.arch.JediViewModel r0 = r1.a(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.q.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    private final void av() {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
        if (multiEditVideoStatusRecordData != null) {
            String str = multiEditVideoStatusRecordData.coverImagePath;
            if (str == null || str.length() == 0) {
                multiEditVideoStatusRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
            }
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final boolean aa() {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (com.ss.android.ugc.aweme.shortvideo.edit.bp.q(videoPublishEditModel) || G().N()) {
            return true;
        }
        return false;
    }

    public final void ae() {
        H().a(4, false);
        com.ss.android.ugc.gamora.editor.sticker.panel.a S2 = S();
        if (S2 != null) {
            S2.a((com.ss.android.ugc.gamora.editor.sticker.panel.a) true, (boolean) "click_button");
        }
        Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        com.ss.android.ugc.aweme.shortvideo.edit.w.b("sticker");
    }

    public final void ai() {
        Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
        com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c I2 = I();
        if (I2 != null) {
            I2.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void ap() {
        com.ss.android.ugc.gamora.editor.multiedit.a R2 = R();
        if (R2 != null) {
            Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            az();
            R2.a();
        }
    }

    @Override // com.bytedance.scene.j
    public final void o() {
        super.o();
        com.ss.android.ugc.gamora.editor.subtitle.e V2 = V();
        if (V2 != null) {
            V2.g();
        }
        com.ss.android.ugc.aweme.port.in.l.f115658a.b().l().d();
    }

    /* access modifiers changed from: package-private */
    public static final class ax<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147216a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f147217b;

        static {
            Covode.recordClassIndex(96990);
        }

        ax(v vVar, Runnable runnable) {
            this.f147216a = vVar;
            this.f147217b = runnable;
        }

        private Void a() {
            try {
                this.f147216a.al();
                this.f147216a.G().a(false);
                Runnable runnable = this.f147217b;
                if (runnable == null) {
                    return null;
                }
                runnable.run();
                return null;
            } catch (Throwable th) {
                com.ss.android.ugc.tools.utils.q.b("Crash happens in edit -> publish: " + com.ss.android.ugc.aweme.tools.c.b.a(th));
                com.bytedance.services.apm.api.a.a(th, "edit -> publish");
                return null;
            }
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            return a();
        }
    }

    private final void au() {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (TextUtils.isEmpty(videoPublishEditModel.mvCreateVideoData.videoCoverImgPath)) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel2.mvCreateVideoData.videoCoverImgPath = com.ss.android.ugc.aweme.port.in.l.f115658a.d().a().a();
        }
    }

    private final void ax() {
        if (this.T == null) {
            Activity t2 = t();
            h.f.b.l.b(t2, "");
            com.ss.android.ugc.aweme.view.b a2 = b.C3836b.a(t2);
            a2.setMessage(c_(R.string.ewe));
            this.T = a2;
        }
        Dialog dialog = this.T;
        if (dialog != null) {
            dialog.show();
        }
    }

    /* access modifiers changed from: package-private */
    public final void ad() {
        ac rVar;
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (com.ss.android.ugc.aweme.shortvideo.edit.bp.l(videoPublishEditModel)) {
            Activity activity = this.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            rVar = new f((androidx.fragment.app.e) activity, this, getDiContainer());
        } else {
            Activity activity2 = this.f42913m;
            Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            rVar = new r((androidx.fragment.app.e) activity2, this, getDiContainer());
        }
        a(rVar);
    }

    static final class ai implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f147193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f147194c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f147195d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f147196e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Runnable f147197f;

        static {
            Covode.recordClassIndex(96972);
        }

        ai(v vVar, Runnable runnable, boolean z, boolean z2, boolean z3, Runnable runnable2) {
            this.f147192a = vVar;
            this.f147193b = runnable;
            this.f147194c = z;
            this.f147195d = z2;
            this.f147196e = z3;
            this.f147197f = runnable2;
        }

        public final void run() {
            Runnable runnable = this.f147193b;
            if (runnable != null) {
                runnable.run();
            } else if (this.f147194c) {
                VideoPublishEditModel a2 = v.a(this.f147192a);
                com.ss.android.ugc.aweme.draft.k.a("[saveDraft]: save draft creation id = " + a2.creationId);
                new com.ss.android.ugc.aweme.shortvideo.edit.bn("VEVideoPublishEditActivity");
                com.ss.android.ugc.aweme.draft.model.c a3 = com.ss.android.ugc.aweme.shortvideo.edit.bn.a(a2);
                h.f.b.l.b(a3, "");
                a3.I = System.currentTimeMillis();
                com.ss.android.ugc.aweme.port.in.g.a().c().a(a3);
                com.ss.android.ugc.aweme.port.in.g.a().c().a(a3, false);
                if (this.f147192a.f42913m instanceof VEVideoPublishEditActivity) {
                    Activity activity = this.f147192a.f42913m;
                    Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                    ((VEVideoPublishEditActivity) activity).j();
                }
            } else {
                this.f147192a.b(this.f147195d, this.f147196e, this.f147197f);
            }
        }
    }

    public static final class be implements Callable<Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147232a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f147233b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f147234c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f147235d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f147236e;

        static {
            Covode.recordClassIndex(96998);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d> call() {
            if (this.f147232a.Q().C().getValue() == null) {
                return null;
            }
            com.ss.android.ugc.asve.editor.g value = this.f147232a.Q().C().getValue();
            if (value == null) {
                h.f.b.l.b();
            }
            int a2 = value.a(this.f147233b, this.f147234c, this.f147235d);
            com.ss.android.ugc.asve.editor.g value2 = this.f147232a.Q().C().getValue();
            if (value2 == null) {
                h.f.b.l.b();
            }
            value2.t();
            if (a2 < 0 || !this.f147236e) {
                return new Pair(Integer.valueOf(a2), null);
            }
            return new Pair(Integer.valueOf(a2), k.b.a(this.f147233b, true, null));
        }

        be(v vVar, String str, int i2, int i3, boolean z) {
            this.f147232a = vVar;
            this.f147233b = str;
            this.f147234c = i2;
            this.f147235d = i3;
            this.f147236e = z;
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.a<EditStickerViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(97061);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.sticker.core.EditStickerViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.o.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public static final class p extends h.f.b.m implements h.f.a.a<EditToolbarViewModel> {
        final /* synthetic */ com.bytedance.scene.j $this_hostViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(97062);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(com.bytedance.scene.j jVar, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_hostViewModel = jVar;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                com.bytedance.scene.j r5 = r0.o
                h.k.c r0 = r6.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                h.f.b.l.b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.s.a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass$inlined     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                h.f.b.l.b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.$viewModelClass     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = h.f.a.a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.$this_hostViewModel
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.c.b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r1 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r6.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.p.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static androidx.lifecycle.ac com_ss_android_ugc_gamora_editor_EditRootScene$$special$$inlined$hostViewModel$2_androidx_lifecycle_VScopeLancet_get(androidx.lifecycle.ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            androidx.lifecycle.ac a2 = adVar.a(str, cls);
            androidx.lifecycle.ab.a(a2, adVar);
            return a2;
        }
    }

    public final void ah() {
        String str;
        String str2;
        com.ss.android.ugc.gamora.editor.multiedit.a R2 = R();
        if (R2 != null) {
            boolean aa2 = aa();
            if (aa2) {
                new a.C0731a(this.f42913m).b(R.string.bjw).b(R.string.bjx, (DialogInterface.OnClickListener) null, false).a(R.string.bjy, (DialogInterface.OnClickListener) new cl(new af(aa2, this)), false).a().b().show();
            } else {
                c(aa2);
            }
            boolean b2 = R2.b();
            VideoPublishEditModel videoPublishEditModel = this.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            int k2 = com.ss.android.ugc.aweme.shortvideo.edit.bl.k(videoPublishEditModel);
            com.ss.android.ugc.tools.f.b c2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.c();
            if (aa2) {
                str = "1";
            } else {
                str = "0";
            }
            com.ss.android.ugc.tools.f.b a2 = c2.a("is_warn_shown", str).a("is_multi_content", k2);
            if (b2) {
                str2 = "single";
            } else {
                str2 = "multiple";
            }
            com.ss.android.ugc.aweme.common.r.a("click_video_trim", a2.a("segment_type", str2).f149193a);
        }
    }

    public final void ao() {
        Activity activity = this.f42913m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = com.bytedance.jedi.arch.t.a((androidx.fragment.app.e) activity).a(EditInfoStickerViewModel.class);
        h.f.b.l.b(a2, "");
        EditInfoStickerViewModel editInfoStickerViewModel = (EditInfoStickerViewModel) a2;
        com.ss.android.ugc.asve.editor.g ak2 = ak();
        if (ak2 == null) {
            h.f.b.l.b();
        }
        Integer valueOf = Integer.valueOf(ak2.G());
        com.ss.android.ugc.asve.editor.g ak3 = ak();
        if (ak3 == null) {
            h.f.b.l.b();
        }
        editInfoStickerViewModel.a(new h.p<>(valueOf, Integer.valueOf(ak3.j())));
    }

    @Override // com.bytedance.scene.j
    public final void w() {
        super.w();
        com.ss.android.ugc.tools.utils.q.a("VEVideoPublishEditActivity onResume EditRootScene");
        this.U = false;
        this.f147181k = false;
        this.f147180j = false;
        com.ss.android.ugc.aweme.shortvideo.util.ar.f132216a.a(this.f42913m, (ViewGroup) this.n);
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (com.ss.android.ugc.aweme.utils.bz.a(videoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            h.f.b.l.d(videoPublishEditModel2, "");
            if (!com.ss.android.ugc.aweme.utils.ca.a().getBoolean(videoPublishEditModel2.creationId, true)) {
                H().a(1);
                VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                com.ss.android.ugc.aweme.utils.bz.a(videoPublishEditModel3, true);
            }
        }
    }

    private final void ay() {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.isDisableOriginalSound()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel2.resetVolume();
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel3.veAudioEffectParam = null;
        VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel4.veAudioRecorderParam = null;
        VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel5.mSelectedId = 0;
        VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel6.mTimeEffect = null;
        VideoPublishEditModel videoPublishEditModel7 = this.f147173c;
        if (videoPublishEditModel7 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel7.mCurFilterIds = null;
        VideoPublishEditModel videoPublishEditModel8 = this.f147173c;
        if (videoPublishEditModel8 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel8.mSelectedFilterId = null;
        VideoPublishEditModel videoPublishEditModel9 = this.f147173c;
        if (videoPublishEditModel9 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel9.mSelectedFilterLabel = null;
        VideoPublishEditModel videoPublishEditModel10 = this.f147173c;
        if (videoPublishEditModel10 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel10.captionStruct = null;
        VideoPublishEditModel videoPublishEditModel11 = this.f147173c;
        if (videoPublishEditModel11 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel11.autoEnhanceOn = false;
        VideoPublishEditModel videoPublishEditModel12 = this.f147173c;
        if (videoPublishEditModel12 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel12.autoEnhanceType = 0;
        com.ss.android.ugc.gamora.editor.subtitle.e V2 = V();
        if (V2 != null) {
            V2.a(null);
        }
        com.ss.android.ugc.gamora.editor.subtitle.e V3 = V();
        if (V3 != null) {
            V3.e();
        }
    }

    private final void az() {
        int i2;
        N().e();
        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.h J2 = J();
        if (J2 != null) {
            com.ss.android.ugc.gamora.editor.e.c Q2 = Q();
            VideoPublishEditModel videoPublishEditModel = this.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            J2.a(Q2, videoPublishEditModel);
        }
        if (com.ss.android.ugc.aweme.property.av.a()) {
            as().c(false);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel2.autoEnhanceOn) {
            com.ss.android.ugc.gamora.editor.toolbar.s H2 = H();
            Activity activity = this.f42913m;
            if (activity == null) {
                h.f.b.l.b();
            }
            if (com.ss.android.ugc.aweme.property.av.a()) {
                i2 = 2131230929;
            } else {
                i2 = 2131230930;
            }
            Drawable a2 = androidx.core.content.b.a(activity, i2);
            if (a2 == null) {
                h.f.b.l.b();
            }
            h.f.b.l.b(a2, "");
            VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            H2.a(new com.ss.android.ugc.gamora.editor.toolbar.a(a2, videoPublishEditModel3.autoEnhanceOn, false));
            L().a(false);
        }
        Activity activity2 = this.f42913m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        androidx.lifecycle.ac a3 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity2, (ad.b) null).a(EditEffectVideoModel.class);
        h.f.b.l.b(a3, "");
        ((EditEffectVideoModel) a3).i().setValue(null);
        am();
        ay();
        VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel4.commentVideoModel != null) {
            VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
            if (videoPublishEditModel5 == null) {
                h.f.b.l.a("mModel");
            }
            CommentVideoModel commentVideoModel = videoPublishEditModel5.commentVideoModel;
            if (commentVideoModel != null) {
                commentVideoModel.setStartTime(0);
            }
            VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
            if (videoPublishEditModel6 == null) {
                h.f.b.l.a("mModel");
            }
            CommentVideoModel commentVideoModel2 = videoPublishEditModel6.commentVideoModel;
            if (commentVideoModel2 != null) {
                commentVideoModel2.setEndTime(0);
            }
        }
    }

    private final void aw() {
        String userName;
        String userName2;
        z.c cVar = new z.c();
        cVar.element = 0;
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        String str = "";
        if (videoPublishEditModel.structList != null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            for (AVTextExtraStruct aVTextExtraStruct : videoPublishEditModel2.structList) {
                h.f.b.l.b(aVTextExtraStruct, str);
                if (aVTextExtraStruct.getSubType() == 2 || aVTextExtraStruct.getSubType() == 3) {
                    cVar.element = aVTextExtraStruct.getSubType();
                }
            }
        }
        QaStruct i2 = P().i();
        cm cmVar = new cm(this, cVar);
        cn cnVar = new cn(this, cmVar);
        co coVar = new co(this, cmVar);
        cp cpVar = new cp(this);
        cq cqVar = new cq(this, i2);
        cr crVar = new cr(this, cpVar);
        VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel3.commentVideoModel != null) {
            VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            Boolean bool = videoPublishEditModel4.isCommentDeleted;
            h.f.b.l.b(bool, str);
            if (bool.booleanValue()) {
                VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
                if (videoPublishEditModel5 == null) {
                    h.f.b.l.a("mModel");
                }
                if (videoPublishEditModel5.commentVideoModel.isCommentFromPanel()) {
                    if (cVar.element != 0) {
                        coVar.a();
                    }
                    VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
                    if (videoPublishEditModel6 == null) {
                        h.f.b.l.a("mModel");
                    }
                    if (!videoPublishEditModel6.commentVideoModel.isCommentFromEditPanel()) {
                        VideoPublishEditModel videoPublishEditModel7 = this.f147173c;
                        if (videoPublishEditModel7 == null) {
                            h.f.b.l.a("mModel");
                        }
                        videoPublishEditModel7.commentVideoModel = null;
                    }
                } else if (cVar.element == 0) {
                    if (P().i() == null) {
                        crVar.a();
                        cnVar.a();
                    } else {
                        coVar.a();
                    }
                }
            } else if (cVar.element != 0) {
                VideoPublishEditModel videoPublishEditModel8 = this.f147173c;
                if (videoPublishEditModel8 == null) {
                    h.f.b.l.a("mModel");
                }
                Object obj = videoPublishEditModel8.structList.get(0);
                h.f.b.l.b(obj, str);
                String userId = ((AVTextExtraStruct) obj).getUserId();
                VideoPublishEditModel videoPublishEditModel9 = this.f147173c;
                if (videoPublishEditModel9 == null) {
                    h.f.b.l.a("mModel");
                }
                if (!h.f.b.l.a((Object) userId, (Object) videoPublishEditModel9.commentVideoModel.getUserId())) {
                    coVar.a();
                    if (P().i() == null) {
                        crVar.a();
                        cnVar.a();
                    }
                }
            } else if (P().i() == null) {
                cnVar.a();
            } else {
                coVar.a();
            }
        } else if (cVar.element != 0) {
            VideoPublishEditModel videoPublishEditModel10 = this.f147173c;
            if (videoPublishEditModel10 == null) {
                h.f.b.l.a("mModel");
            }
            Boolean bool2 = videoPublishEditModel10.isCommentDeleted;
            h.f.b.l.b(bool2, str);
            if (bool2.booleanValue()) {
                coVar.a();
            }
        }
        crVar.a();
        if (P().i() != null) {
            QaStruct i3 = P().i();
            if (i3 == null || i3.getQuestionId() == 0) {
                if (!(i2 == null || (userName = i2.getUserName()) == null)) {
                    str = userName;
                }
                cqVar.a(cpVar.a(str, R.string.f6k), 5);
                return;
            }
            if (!(i2 == null || (userName2 = i2.getUserName()) == null)) {
                str = userName2;
            }
            cqVar.a(cpVar.a(str, R.string.f6j), 7);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void aj() {
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (!videoPublishEditModel.hasOriginalAudio()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            if (!videoPublishEditModel2.hasRecord()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(q()).a(R.string.y3).a();
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        if (!videoPublishEditModel3.hasRecord()) {
            VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel4.voiceVolume == 0.0f) {
                new com.ss.android.ugc.aweme.tux.a.i.a(q()).a(R.string.b7l).a();
                return;
            }
        }
        if (!com.bytedance.ies.abmock.b.a().a(true, "tool_show_caption_license", true) || ac().f130920a.getBoolean("has_accept_caption_protocol_" + com.ss.android.ugc.aweme.shortvideo.bn.a(com.ss.android.ugc.aweme.port.in.g.a().A().c()), false)) {
            VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
            if (videoPublishEditModel5 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel5.isTimeEffectApply()) {
                new a.C0731a(t()).a(R.string.y1).b(R.string.y0).b(R.string.bcn, (DialogInterface.OnClickListener) null, false).a(R.string.fbo, (DialogInterface.OnClickListener) new ah(this), false).a().b().show();
                return;
            }
            b(false);
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = at();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                new com.ss.android.ugc.aweme.tux.a.i.a(q()).a(c_(R.string.xw)).a();
                return;
            }
            ((EditStickerViewModel) this.Q.getValue()).n().setValue(true);
            com.ss.android.ugc.gamora.editor.subtitle.e V2 = V();
            if (V2 != null) {
                V2.b();
            }
            H().b();
            return;
        }
        VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("mModel");
        }
        h.f.b.l.d(videoPublishEditModel6, "");
        com.ss.android.ugc.aweme.common.r.a("caption_intro_show", com.ss.android.ugc.aweme.shortvideo.edit.bl.d(videoPublishEditModel6).f149193a);
        Context s2 = s();
        h.f.b.l.b(s2, "");
        com.ss.android.ugc.aweme.shortvideo.subtitle.g gVar = new com.ss.android.ugc.aweme.shortvideo.subtitle.g(s2, (byte) 0);
        z.e eVar = new z.e();
        eVar.element = (T) new a.C1112a().a(gVar).a(1).b((int) com.bytedance.common.utility.n.b(s(), 593.0f)).f45299a;
        gVar.setOnCaptionWelcomeViewCallback(new ag(this, eVar));
        Activity t2 = t();
        Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        eVar.element.show(((androidx.fragment.app.e) t2).getSupportFragmentManager(), "caption_welcome");
    }

    public final boolean am() {
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar;
        aa aaVar;
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel.mTimeEffect == null) {
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            if (com.bytedance.common.utility.h.a(videoPublishEditModel2.mEffectList)) {
                VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                if (!videoPublishEditModel3.hasInfoStickers() && !G().N()) {
                    return false;
                }
            }
        }
        com.ss.android.ugc.gamora.editor.sticker.core.c F2 = G();
        F2.Q().e();
        F2.S().e();
        F2.R().e();
        F2.U().e();
        if (!(F2.f146432k == null || (aaVar = F2.f146432k) == null)) {
            aaVar.G();
        }
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = F2.v;
        if (bVar != null) {
            bVar.C().d();
        }
        if (!(F2.f146430i == null || (hVar = F2.f146430i) == null)) {
            hVar.H();
        }
        o oVar = F2.t;
        if (oVar != null) {
            ((a) oVar).f145663b.r();
        }
        l lVar = F2.u;
        if (lVar != null) {
            ((a) lVar).f145663b.r();
        }
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = F2.M;
        if (aVar != null) {
            aVar.m();
        }
        F2.ai();
        G().ah();
        ArrayList<EffectPointModel> r2 = Q().r();
        dmt.av.video.g<dmt.av.video.p> p2 = Q().p();
        if (!com.bytedance.common.utility.h.a(r2)) {
            int size = r2.size();
            int[] iArr = new int[size];
            String[] strArr = new String[r2.size()];
            for (int i2 = 0; i2 < size; i2++) {
                EffectPointModel effectPointModel = r2.get(i2);
                h.f.b.l.b(effectPointModel, "");
                iArr[i2] = effectPointModel.getIndex();
                EffectPointModel effectPointModel2 = r2.get(i2);
                h.f.b.l.b(effectPointModel2, "");
                strArr[i2] = effectPointModel2.getUuid();
            }
            p2.setValue(dmt.av.video.p.b(iArr, strArr));
        }
        VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        if (com.bytedance.common.utility.h.a(videoPublishEditModel4.mEffectList)) {
            return true;
        }
        VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel5.mEffectList.clear();
        return true;
    }

    static final class ci extends h.f.b.m implements h.f.a.b<com.bytedance.o.n, h.z> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ci(v vVar) {
            super(1);
            this.this$0 = vVar;
        }

        public static final class f extends com.bytedance.o.p<z> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ci f147304a;

            static {
                Covode.recordClassIndex(97036);
            }

            public static final class a implements z {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f147305a;

                static {
                    Covode.recordClassIndex(97037);
                }

                a(f fVar) {
                    this.f147305a = fVar;
                }

                @Override // com.ss.android.ugc.gamora.editor.z
                public final void a(Runnable runnable) {
                    h.f.b.l.d(runnable, "");
                    this.f147305a.f147304a.this$0.a(runnable, true);
                }
            }

            public f(ci ciVar) {
                this.f147304a = ciVar;
            }

            @Override // com.bytedance.o.p
            public final z get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return new a(this);
            }
        }

        public static final class a extends com.bytedance.o.p<com.bytedance.f.a.a.j> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ci f147299a;

            static {
                Covode.recordClassIndex(97031);
            }

            public a(ci ciVar) {
                this.f147299a = ciVar;
            }

            @Override // com.bytedance.o.p
            public final com.bytedance.f.a.a.j get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return v.b(this.f147299a.this$0);
            }
        }

        public static final class b extends com.bytedance.o.p<w> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ci f147300a;

            static {
                Covode.recordClassIndex(97032);
            }

            public b(ci ciVar) {
                this.f147300a = ciVar;
            }

            @Override // com.bytedance.o.p
            public final w get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f147300a.this$0.E();
            }
        }

        public static final class c extends com.bytedance.o.p<v> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ci f147301a;

            static {
                Covode.recordClassIndex(97033);
            }

            public c(ci ciVar) {
                this.f147301a = ciVar;
            }

            @Override // com.bytedance.o.p
            public final v get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f147301a.this$0;
            }
        }

        public static final class d extends com.bytedance.o.p<VideoPublishEditModel> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ci f147302a;

            static {
                Covode.recordClassIndex(97034);
            }

            public d(ci ciVar) {
                this.f147302a = ciVar;
            }

            @Override // com.bytedance.o.p
            public final VideoPublishEditModel get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return v.a(this.f147302a.this$0);
            }
        }

        public static final class e extends com.bytedance.o.p<ac> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ci f147303a;

            static {
                Covode.recordClassIndex(97035);
            }

            public e(ci ciVar) {
                this.f147303a = ciVar;
            }

            @Override // com.bytedance.o.p
            public final ac get(com.bytedance.o.f fVar) {
                h.f.b.l.d(fVar, "");
                return this.f147303a.this$0.aq();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.o.n nVar) {
            com.bytedance.o.n nVar2 = nVar;
            h.f.b.l.d(nVar2, "");
            h.f.b.l.b(nVar2.a(com.bytedance.f.a.a.j.class, (String) null, (com.bytedance.o.p) new a(this)), "");
            n.a a2 = nVar2.a(w.class, (String) null, (com.bytedance.o.p) new b(this));
            h.f.b.l.b(a2, "");
            a2.a(com.ss.android.ugc.aweme.editSticker.interact.e.class);
            n.a a3 = nVar2.a(v.class, (String) null, (com.bytedance.o.p) new c(this));
            h.f.b.l.b(a3, "");
            a3.a(ab.class, s.class);
            h.f.b.l.b(nVar2.a(VideoPublishEditModel.class, (String) null, (com.bytedance.o.p) new d(this)), "");
            h.f.b.l.b(nVar2.a(ac.class, (String) null, (com.bytedance.o.p) new e(this)), "");
            h.f.b.l.b(nVar2.a(z.class, (String) null, (com.bytedance.o.p) new f(this)), "");
            return h.z.f158842a;
        }
    }

    public static final class ad implements v.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147186a;

        static {
            Covode.recordClassIndex(96967);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ad(v vVar) {
            this.f147186a = vVar;
        }

        @Override // com.ss.android.ugc.aweme.port.in.v.a
        public final void a(String[] strArr, int[] iArr) {
            if (strArr == null || iArr == null || strArr.length == 0 || iArr.length == 0) {
                Activity activity = this.f147186a.f42913m;
                if (activity == null) {
                    h.f.b.l.b();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(activity).a(R.string.axc).a();
            } else if (iArr[0] == 0) {
                this.f147186a.ai();
            } else {
                Activity activity2 = this.f147186a.f42913m;
                if (activity2 == null) {
                    h.f.b.l.b();
                }
                new com.ss.android.ugc.aweme.tux.a.i.a(activity2).a(R.string.axc).a();
            }
        }
    }

    public static final class aj implements com.ss.android.ugc.gamora.editor.filter.core.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147198a;

        static {
            Covode.recordClassIndex(96973);
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(String str) {
            h.f.b.l.d(str, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        aj(v vVar) {
            this.f147198a = vVar;
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(float f2) {
            FilterBean filterBean;
            com.ss.android.ugc.aweme.filter.c.a value = this.f147198a.Q().j().getValue();
            if (value != null && (filterBean = value.f95494b) != null) {
                com.ss.android.ugc.aweme.filter.repository.a.n value2 = this.f147198a.Q().k().getValue();
                if (value2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value2, "");
                com.ss.android.ugc.aweme.filter.repository.a.n nVar = value2;
                com.ss.android.ugc.aweme.filter.repository.a.k value3 = this.f147198a.Q().l().getValue();
                if (value3 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value3, "");
                v.a(this.f147198a).mSelectedFilterIntensity = ((float) nVar.a(filterBean, value3)) / 100.0f;
            }
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(boolean z, FilterBean filterBean) {
            this.f147198a.Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) (!z), false, r1);
        }

        @Override // com.ss.android.ugc.gamora.editor.filter.core.b
        public final void a(FilterBean filterBean, boolean z, Context context) {
            if (filterBean != null) {
                com.ss.android.ugc.aweme.filter.repository.a.n value = this.f147198a.Q().k().getValue();
                if (value == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value, "");
                com.ss.android.ugc.aweme.filter.repository.a.n nVar = value;
                com.ss.android.ugc.aweme.filter.repository.a.k value2 = this.f147198a.Q().l().getValue();
                if (value2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(value2, "");
                v.a(this.f147198a).mSelectedId = com.ss.android.ugc.aweme.filter.repository.a.a.c.a(com.ss.android.ugc.aweme.port.in.g.a().r().d().f(), filterBean);
                v.a(this.f147198a).mSelectedFilterId = String.valueOf(filterBean.getId());
                v.a(this.f147198a).mSelectedFilterLabel = filterBean.getEnName();
                v.a(this.f147198a).mSelectedFilterResId = filterBean.getResId();
                v.a(this.f147198a).mSelectedFilterIntensity = ((float) nVar.a(filterBean, value2)) / 100.0f;
                com.ss.android.ugc.aweme.utils.ad.a(context, String.valueOf(filterBean.getId()), 3);
                com.ss.android.ugc.aweme.port.in.l.f115658a.f().a(v.a(this.f147198a).getAvetParameter().getContentType(), "mid_page", filterBean.getEnName());
                if (z) {
                    com.ss.android.ugc.aweme.shortvideo.edit.bl.a(v.a(this.f147198a), "slide", filterBean.getEnName(), filterBean.getId());
                } else {
                    com.ss.android.ugc.aweme.shortvideo.edit.bl.a(v.a(this.f147198a), "click", filterBean.getEnName(), filterBean.getId());
                }
            } else {
                v.a(this.f147198a).mSelectedId = 0;
                v.a(this.f147198a).mSelectedFilterId = "";
                v.a(this.f147198a).mSelectedFilterLabel = "";
                v.a(this.f147198a).mSelectedFilterResId = "";
            }
        }
    }

    public static final class al extends com.bytedance.f.a.a.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147200a;

        static {
            Covode.recordClassIndex(96975);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        al(v vVar) {
            this.f147200a = vVar;
        }

        @Override // com.bytedance.f.a.a.h.a, com.bytedance.f.a.a.h.b
        public final boolean c(MotionEvent motionEvent) {
            com.ss.android.ugc.gamora.editor.sticker.core.c F = this.f147200a.G();
            com.ss.android.ugc.gamora.editor.sticker.poll.a Q = F.Q();
            if (Q.l()) {
                Q.b();
            }
            com.ss.android.ugc.gamora.editor.sticker.duet.a S = F.S();
            if (S.j()) {
                S.b();
            }
            com.ss.android.ugc.gamora.editor.sticker.livecd.a R = F.R();
            if (R.g()) {
                R.h();
            }
            o oVar = F.t;
            if (oVar != null && ((a) oVar).f145663b.a()) {
                ((a) oVar).f145663b.n();
            }
            l lVar = F.u;
            if (lVar != null && ((a) lVar).f145663b.a()) {
                ((a) lVar).f145663b.n();
            }
            com.ss.android.ugc.gamora.editor.subtitle.b bVar = F.v;
            if (bVar != null && bVar.C().a()) {
                bVar.C().n();
            }
            com.ss.android.ugc.aweme.editSticker.text.als.a aVar = F.M;
            if (aVar != null) {
                return aVar.n();
            }
            return false;
        }
    }

    public static final class l extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.lightening.c.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147310a;

        static {
            Covode.recordClassIndex(97058);
        }

        public l(com.bytedance.als.dsl.d dVar) {
            this.f147310a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.lightening.c.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.lightening.c.c(fVar);
        }
    }

    public static final class m extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.a.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147311a;

        static {
            Covode.recordClassIndex(97059);
        }

        public m(com.bytedance.als.dsl.d dVar) {
            this.f147311a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.a.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.a.e(fVar);
        }
    }

    public static final class n extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.b.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147312a;

        static {
            Covode.recordClassIndex(97060);
        }

        public n(com.bytedance.als.dsl.d dVar) {
            this.f147312a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.b.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.b.b(fVar);
        }
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        ar().a(z2);
    }

    /* access modifiers changed from: package-private */
    public static final class ay<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147218a;

        static {
            Covode.recordClassIndex(96991);
        }

        ay(v vVar) {
            this.f147218a = vVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            this.f147218a.G().ai();
            return null;
        }
    }

    static final class az implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final az f147219a = new az();

        static {
            Covode.recordClassIndex(96992);
        }

        az() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
        }
    }

    static final class bb implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public static final bb f147225a = new bb();

        static {
            Covode.recordClassIndex(96995);
        }

        bb() {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c.b
        public final void a(String str) {
            com.ss.android.ugc.aweme.port.in.g.a().I().a(str);
        }
    }

    public static final class bh extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.corner.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147247b;

        static {
            Covode.recordClassIndex(97001);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.corner.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.corner.b(fVar, this.f147247b);
        }

        public bh(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147246a = dVar;
            this.f147247b = vVar;
        }
    }

    public static final class bi extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.toolbar.ah> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147249b;

        static {
            Covode.recordClassIndex(97002);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.toolbar.ah get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.toolbar.ah(fVar, this.f147249b);
        }

        public bi(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147248a = dVar;
            this.f147249b = vVar;
        }
    }

    public static final class bl extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.progress.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147254a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147255b;

        static {
            Covode.recordClassIndex(97005);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.progress.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.progress.b(fVar, this.f147255b);
        }

        public bl(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147254a = dVar;
            this.f147255b = vVar;
        }
    }

    public static final class bm extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.progressbar.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147256a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147257b;

        static {
            Covode.recordClassIndex(97006);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.progressbar.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.progressbar.b(fVar, this.f147257b);
        }

        public bm(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147256a = dVar;
            this.f147257b = vVar;
        }
    }

    public static final class bn extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147258a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147259b;

        static {
            Covode.recordClassIndex(97007);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.d(fVar, this.f147259b);
        }

        public bn(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147258a = dVar;
            this.f147259b = vVar;
        }
    }

    public static final class bo extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147261b;

        static {
            Covode.recordClassIndex(97008);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.i(fVar, this.f147261b);
        }

        public bo(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147260a = dVar;
            this.f147261b = vVar;
        }
    }

    public static final class bp extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.edit.effect.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147263b;

        static {
            Covode.recordClassIndex(97009);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.effect.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.edit.effect.b(fVar, this.f147263b);
        }

        public bp(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147262a = dVar;
            this.f147263b = vVar;
        }
    }

    public static final class bq extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.panel.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147264a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147265b;

        static {
            Covode.recordClassIndex(97010);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.panel.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.sticker.panel.b(fVar, this.f147265b);
        }

        public bq(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147264a = dVar;
            this.f147265b = vVar;
        }
    }

    public static final class br extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.cutmusic.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147266a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147267b;

        static {
            Covode.recordClassIndex(97011);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.cutmusic.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.cutmusic.b(fVar, this.f147267b);
        }

        public br(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147266a = dVar;
            this.f147267b = vVar;
        }
    }

    public static final class bs extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.gesture.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147268a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147269b;

        static {
            Covode.recordClassIndex(97012);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.gesture.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.gesture.b(fVar, this.f147269b);
        }

        public bs(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147268a = dVar;
            this.f147269b = vVar;
        }
    }

    public static final class bt extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.volume.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147270a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147271b;

        static {
            Covode.recordClassIndex(97013);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.volume.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.volume.b(fVar, this.f147271b);
        }

        public bt(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147270a = dVar;
            this.f147271b = vVar;
        }
    }

    public static final class bu extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.subtitle.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147272a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147273b;

        static {
            Covode.recordClassIndex(97014);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.subtitle.f get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.subtitle.f(fVar, this.f147273b);
        }

        public bu(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147272a = dVar;
            this.f147273b = vVar;
        }
    }

    public static final class bv extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.music.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147274a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147275b;

        static {
            Covode.recordClassIndex(97015);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.h get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.music.h(fVar, this.f147275b);
        }

        public bv(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147274a = dVar;
            this.f147275b = vVar;
        }
    }

    public static final class bw extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.music.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147276a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147277b;

        static {
            Covode.recordClassIndex(97016);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.music.b(fVar, this.f147277b);
        }

        public bw(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147276a = dVar;
            this.f147277b = vVar;
        }
    }

    public static final class bx extends com.bytedance.o.p<com.ss.android.ugc.aweme.shortvideo.editcut.g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147278a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147279b;

        static {
            Covode.recordClassIndex(97017);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.g get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.aweme.shortvideo.editcut.g(fVar, this.f147279b);
        }

        public bx(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147278a = dVar;
            this.f147279b = vVar;
        }
    }

    public static final class by extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.multiedit.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147280a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147281b;

        static {
            Covode.recordClassIndex(97018);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.multiedit.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.multiedit.b(fVar, this.f147281b);
        }

        public by(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147280a = dVar;
            this.f147281b = vVar;
        }
    }

    public static final class cb extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.core.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147286a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147287b;

        static {
            Covode.recordClassIndex(97023);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.core.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.sticker.core.b(fVar, this.f147287b);
        }

        public cb(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147286a = dVar;
            this.f147287b = vVar;
        }
    }

    public static final class cc extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.toolbar.ab> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147288a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147289b;

        static {
            Covode.recordClassIndex(97024);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.toolbar.ab get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.toolbar.ab(fVar, this.f147289b);
        }

        public cc(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147288a = dVar;
            this.f147289b = vVar;
        }
    }

    public static final class cd extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.lightening.b.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147290a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147291b;

        static {
            Covode.recordClassIndex(97025);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.lightening.b.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.lightening.b.e(fVar, this.f147291b, true);
        }

        public cd(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147290a = dVar;
            this.f147291b = vVar;
        }
    }

    public static final class cf extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.lightening.d.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147295b;

        static {
            Covode.recordClassIndex(97027);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.lightening.d.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.lightening.d.b(fVar, this.f147295b);
        }

        public cf(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147294a = dVar;
            this.f147295b = vVar;
        }
    }

    public static final class cg extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.lightening.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147296a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147297b;

        static {
            Covode.recordClassIndex(97028);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.lightening.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.lightening.a.a(fVar, this.f147297b);
        }

        public cg(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147296a = dVar;
            this.f147297b = vVar;
        }
    }

    static final class ch extends h.f.b.m implements h.f.a.b<com.bytedance.als.dsl.e, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ch f147298a = new ch();

        static {
            Covode.recordClassIndex(97029);
        }

        ch() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.als.dsl.e eVar) {
            com.bytedance.als.dsl.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            eVar2.f6462a = com.ss.android.ugc.aweme.setting.i.f.a();
            return h.z.f158842a;
        }
    }

    public static final /* synthetic */ VideoPublishEditModel a(v vVar) {
        VideoPublishEditModel videoPublishEditModel = vVar.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        return videoPublishEditModel;
    }

    public static final /* synthetic */ com.bytedance.f.a.a.j b(v vVar) {
        com.bytedance.f.a.a.j jVar = vVar.f147177g;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        return jVar;
    }

    @Override // com.bytedance.jedi.arch.b
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af> S1 getState(VM1 vm1) {
        h.f.b.l.d(vm1, "");
        return (S1) b.a.a(this, vm1);
    }

    static final class aq<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147209a;

        static {
            Covode.recordClassIndex(96983);
        }

        aq(v vVar) {
            this.f147209a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            v vVar = this.f147209a;
            vVar.b(true);
            vVar.K().b();
            vVar.Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
            this.f147209a.ao();
        }
    }

    static final class ar<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147210a;

        static {
            Covode.recordClassIndex(96984);
        }

        ar(v vVar) {
            this.f147210a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            v vVar = this.f147210a;
            com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c I = vVar.I();
            if (I != null) {
                I.b();
            }
            vVar.Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }
    }

    static final class as<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147211a;

        static {
            Covode.recordClassIndex(96985);
        }

        as(v vVar) {
            this.f147211a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            v vVar = this.f147211a;
            vVar.b(true);
            com.ss.android.ugc.gamora.editor.subtitle.e V = vVar.V();
            if (V != null) {
                V.c();
            }
            vVar.Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) true, false, true);
        }
    }

    public static final class ca extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.sticker.a.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147284a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147285b;

        static {
            Covode.recordClassIndex(97022);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.sticker.a.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            v vVar = this.f147285b;
            return new com.ss.android.ugc.gamora.editor.sticker.a.a(fVar, vVar, R.id.aa9, v.a(vVar));
        }

        public ca(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147284a = dVar;
            this.f147285b = vVar;
        }
    }

    public static final class ce extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.lightening.b.e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147292a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147293b;

        static {
            Covode.recordClassIndex(97026);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.lightening.b.e get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.lightening.b.e(fVar, this.f147293b, AVExternalServiceImpl.a().configService().avsettingsConfig().enableNewMusicMarquee());
        }

        public ce(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147292a = dVar;
            this.f147293b = vVar;
        }
    }

    static final class cj extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.gamora.editor.filter.core.d, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final cj f147306a = new cj();

        static {
            Covode.recordClassIndex(97038);
        }

        cj() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.gamora.editor.filter.core.d dVar) {
            com.ss.android.ugc.gamora.editor.filter.core.d dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            dVar2.a(com.ss.android.ugc.gamora.editor.filter.core.j.Circle);
            dVar2.f145901b = true;
            return h.z.f158842a;
        }
    }

    static final class ae extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.tools.f.b, h.z> {
        final /* synthetic */ boolean $isSingle;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(96968);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ae(boolean z, v vVar) {
            super(1);
            this.$isSingle = z;
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.tools.f.b bVar) {
            String str;
            String str2;
            com.ss.android.ugc.tools.f.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            if (this.this$0.aa()) {
                str = "1";
            } else {
                str = "0";
            }
            bVar2.a("is_warn_shown", str);
            if (this.$isSingle) {
                str2 = "single";
            } else {
                str2 = "multiple";
            }
            bVar2.a("segment_type", str2);
            bVar2.a("is_multi_content", com.ss.android.ugc.aweme.shortvideo.edit.bl.k(v.a(this.this$0)));
            return h.z.f158842a;
        }
    }

    static final class an<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147203a;

        static {
            Covode.recordClassIndex(96977);
        }

        an(v vVar) {
            this.f147203a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            View c2 = this.f147203a.c(R.id.c9b);
            h.f.b.l.b(c2, "");
            FrameLayout frameLayout = (FrameLayout) c2;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            h.f.b.l.b(num, "");
            marginLayoutParams.topMargin = num.intValue();
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    static final class au<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147213a;

        static {
            Covode.recordClassIndex(96987);
        }

        au(v vVar) {
            this.f147213a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (h.f.b.l.a(obj, (Object) false)) {
                this.f147213a.G().aj();
                this.f147213a.G().U().g();
            }
        }
    }

    public static final class bj extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.filter.indicator.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147251b;

        static {
            Covode.recordClassIndex(97003);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.filter.indicator.b get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.filter.indicator.b(fVar, this.f147251b, com.ss.android.ugc.aweme.port.in.g.a().r().c().a(0), com.ss.android.ugc.aweme.port.in.g.a().r().d());
        }

        public bj(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147250a = dVar;
            this.f147251b = vVar;
        }
    }

    public static final class bk extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.filter.core.c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147253b;

        static {
            Covode.recordClassIndex(97004);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.filter.core.c get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            return new com.ss.android.ugc.gamora.editor.filter.core.c(fVar, this.f147253b, com.ss.android.ugc.aweme.port.in.g.a().r().d(), com.ss.android.ugc.aweme.port.in.g.a().r().e(), new aj(this.f147253b), cj.f147306a);
        }

        public bk(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147252a = dVar;
            this.f147253b = vVar;
        }
    }

    public static final class bz extends com.bytedance.o.p<com.ss.android.ugc.gamora.editor.lightening.canvas.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.als.dsl.d f147282a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147283b;

        static {
            Covode.recordClassIndex(97019);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.o.p
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.lightening.canvas.a get(com.bytedance.o.f fVar) {
            h.f.b.l.d(fVar, "");
            Activity t = this.f147283b.t();
            h.f.b.l.b(t, "");
            Intent intent = t.getIntent();
            h.f.b.l.b(intent, "");
            return new com.ss.android.ugc.gamora.editor.lightening.canvas.a(intent, fVar, this.f147283b, new h.f.a.a<com.bytedance.f.a.a.j>(this) {
                /* class com.ss.android.ugc.gamora.editor.v.bz.AnonymousClass1 */
                final /* synthetic */ bz this$0;

                static {
                    Covode.recordClassIndex(97020);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ com.bytedance.f.a.a.j invoke() {
                    return v.b(this.this$0.f147283b);
                }
            });
        }

        public bz(com.bytedance.als.dsl.d dVar, v vVar) {
            this.f147282a = dVar;
            this.f147283b = vVar;
        }
    }

    public static final class ck implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147307a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f147308b;

        static {
            Covode.recordClassIndex(97039);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.cutmusic.k.c
        public final void a(Object obj) {
            this.f147307a.U().a(this.f147308b);
            int a2 = fa.a(v.a(this.f147307a).mMusicPath);
            com.ss.android.ugc.gamora.editor.cutmusic.a U = this.f147307a.U();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean");
            U.a((com.ss.android.ugc.aweme.shortvideo.d) obj, a2, 0);
        }

        ck(v vVar, int i2) {
            this.f147307a = vVar;
            this.f147308b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d(boolean z2) {
        com.ss.android.ugc.gamora.editor.multiedit.a R2 = R();
        if (R2 != null) {
            R2.a(z2, true);
            VideoPublishEditModel videoPublishEditModel = this.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            MultiEditVideoRecordData curMultiEditVideoRecordData = videoPublishEditModel.getCurMultiEditVideoRecordData();
            if (curMultiEditVideoRecordData == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.asve.editor.g ak2 = ak();
            if (ak2 == null) {
                h.f.b.l.b();
            }
            curMultiEditVideoRecordData.preVideoDuration = ak2.j();
        }
    }

    static final class am<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.gamora.editor.a.d f147201a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147202b;

        static {
            Covode.recordClassIndex(96976);
        }

        am(com.ss.android.ugc.gamora.editor.a.d dVar, v vVar) {
            this.f147201a = dVar;
            this.f147202b = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (v.a(this.f147202b).realHasOriginalSound() || com.ss.android.ugc.aweme.shortvideo.edit.bp.e(v.a(this.f147202b))) {
                if (com.ss.android.ugc.aweme.shortvideo.cr.a().f125295a != null) {
                    com.ss.android.ugc.gamora.editor.a.b bVar = this.f147202b.f147179i;
                    h.f.b.l.b(bool, "");
                    bVar.f145677a.storeBoolean("double_track", bool.booleanValue());
                } else {
                    com.ss.android.ugc.gamora.editor.a.b bVar2 = this.f147202b.f147179i;
                    h.f.b.l.b(bool, "");
                    bVar2.f145677a.storeBoolean("single_track", bool.booleanValue());
                }
            }
            this.f147202b.H().f();
            this.f147201a.c();
        }
    }

    static final class ao<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147204a;

        static {
            Covode.recordClassIndex(96978);
        }

        ao(v vVar) {
            this.f147204a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            v vVar = this.f147204a;
            vVar.G().a(vVar.Q().a(), vVar.Q().b(), vVar.Q().c());
            v vVar2 = this.f147204a;
            int i2 = 0;
            if (com.bytedance.ies.abmock.b.a().a(true, "studio_black_layer_optimization", 0) == 2) {
                ViewGroup.MarginLayoutParams a2 = vVar2.Q().a();
                View view = vVar2.f147178h;
                if (view != null) {
                    if (a2.topMargin != 0) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cm extends h.f.b.m implements h.f.a.b<String, StringBuilder> {
        final /* synthetic */ z.c $hasCommentOrQaTag;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        cm(v vVar, z.c cVar) {
            super(1);
            this.this$0 = vVar;
            this.$hasCommentOrQaTag = cVar;
        }

        /* renamed from: a */
        public final StringBuilder invoke(String str) {
            int i2;
            h.f.b.l.d(str, "");
            StringBuilder sb = new StringBuilder();
            CommentVideoModel commentVideoModel = v.a(this.this$0).commentVideoModel;
            if ((commentVideoModel == null || !commentVideoModel.isComment()) && this.$hasCommentOrQaTag.element != 2) {
                i2 = R.string.dd;
            } else {
                i2 = R.string.am3;
            }
            String string = this.this$0.s().getString(i2, str);
            h.f.b.l.b(string, "");
            sb.append(string).append(" ");
            return sb;
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(com.ss.android.ugc.aweme.infoSticker.i iVar) {
        h.f.b.l.d(iVar, "");
        this.R = iVar;
    }

    public final void c(boolean z2) {
        com.ss.android.ugc.gamora.editor.progressbar.a ab2 = ab();
        if (ab2 != null) {
            ab2.a(1, -1);
        }
        ap();
        d(z2);
        int b2 = Q().b();
        int c2 = Q().c();
        if (ak() != null) {
            com.ss.android.ugc.asve.editor.g ak2 = ak();
            if (ak2 == null) {
                h.f.b.l.b();
            }
            VESize a2 = ak2.a(b2, c2);
            if (a2.width > 0 && a2.height > 0) {
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.c.a(b2, c2, a2.width, a2.height);
            }
        }
    }

    static final class ap<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147205a;

        static {
            Covode.recordClassIndex(96979);
        }

        ap(v vVar) {
            this.f147205a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.df.e.a("receive prepare done event in edit page");
            v vVar = this.f147205a;
            com.ss.android.ugc.tools.utils.q.a("VEVideoPublishEditActivity initAllStickerModules");
            vVar.G().ad();
            com.ss.android.ugc.gamora.editor.sticker.panel.a S = vVar.S();
            if (S != null) {
                S.a();
            }
            com.ss.android.ugc.gamora.editor.sticker.panel.a S2 = vVar.S();
            if (S2 != null) {
                S2.a(new av(vVar));
            }
            vVar.G().ae();
            vVar.G().af();
            vVar.H().a(4, true);
            vVar.H().a(3, true);
            vVar.H().a(11, true);
            VideoPublishEditModel videoPublishEditModel = vVar.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                VideoPublishEditModel videoPublishEditModel2 = vVar.f147173c;
                if (videoPublishEditModel2 == null) {
                    h.f.b.l.a("mModel");
                }
                if (videoPublishEditModel2.isRetakeVideo()) {
                    vVar.d(false);
                }
            }
            f.a.t.b(v.a(this.f147205a)).a(f.a.h.a.b(f.a.k.a.f158006c)).d(AnonymousClass1.f147206a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                /* class com.ss.android.ugc.gamora.editor.v.ap.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ap f147207a;

                static {
                    Covode.recordClassIndex(96981);
                }

                {
                    this.f147207a = r1;
                }

                @Override // f.a.d.f
                public final /* synthetic */ void accept(Object obj) {
                    Integer num = (Integer) obj;
                    this.f147207a.f147205a.f147182l.getValue();
                    Context r = this.f147207a.f147205a.r();
                    if (r == null) {
                        h.f.b.l.b();
                    }
                    h.f.b.l.b(r, "");
                    View view = this.f147207a.f147205a.n;
                    h.f.b.l.b(view, "");
                    ViewParent parent = view.getParent();
                    Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    h.f.b.l.b(num, "");
                    num.intValue();
                    h.f.b.l.d(r, "");
                    h.f.b.l.d(parent, "");
                    com.ss.android.ugc.aweme.port.in.g.a();
                }
            }, AnonymousClass3.f147208a);
        }
    }

    static final class at<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147212a;

        static {
            Covode.recordClassIndex(96986);
        }

        at(v vVar) {
            this.f147212a = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a2, code lost:
            if (r1 != r0.j()) goto L_0x00a4;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 253
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.at.onChanged(java.lang.Object):void");
        }
    }

    public static final class bf implements b.g<Pair<Integer, com.ss.android.ugc.aweme.shortvideo.d>, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147237a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f147238b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f147239c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f147240d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f147241e;

        static {
            Covode.recordClassIndex(96999);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x013e  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x017b  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x01c9  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(b.i<android.util.Pair<java.lang.Integer, com.ss.android.ugc.aweme.shortvideo.d>> r9) {
            /*
            // Method dump skipped, instructions count: 496
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.bf.then(b.i):java.lang.Void");
        }

        bf(v vVar, String str, boolean z, int i2, int i3) {
            this.f147237a = vVar;
            this.f147238b = str;
            this.f147239c = z;
            this.f147240d = i2;
            this.f147241e = i3;
        }
    }

    public v(com.bytedance.o.f fVar) {
        h.f.b.l.d(fVar, "");
        this.X = fVar;
        h.k.c a2 = h.f.b.ab.a(EditStickerViewModel.class);
        this.Q = h.i.a((h.f.a.a) new o(this, a2, a2));
        this.V = h.i.a((h.f.a.a) ac.f147185a);
        this.f147179i = new com.ss.android.ugc.gamora.editor.a.b();
        h.k.c a3 = h.f.b.ab.a(EditToolbarViewModel.class);
        this.W = h.i.a((h.f.a.a) new p(this, a3, a3));
        this.f147182l = h.i.a((h.f.a.a) ak.f147199a);
    }

    @Override // com.ss.android.ugc.gamora.editor.ab
    public final void a(StickerItemModel stickerItemModel) {
        int i2;
        int i3;
        h.f.b.l.d(stickerItemModel, "");
        if (com.ss.android.ugc.aweme.video.e.b(stickerItemModel.path)) {
            VideoPublishEditModel videoPublishEditModel = this.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (!videoPublishEditModel.hasInfoStickers()) {
                VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
                if (videoPublishEditModel2 == null) {
                    h.f.b.l.a("mModel");
                }
                VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
                if (videoPublishEditModel3 == null) {
                    h.f.b.l.a("mModel");
                }
                videoPublishEditModel2.infoStickerModel = new InfoStickerModel(videoPublishEditModel3.draftDir());
            }
            VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel4.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
                if (videoPublishEditModel5 == null) {
                    h.f.b.l.a("mModel");
                }
                i2 = 1;
                for (StickerItemModel stickerItemModel2 : videoPublishEditModel5.infoStickerModel.stickers) {
                    h.f.b.l.b(stickerItemModel2, "");
                    if (com.ss.android.ugc.aweme.editSticker.model.c.a(stickerItemModel2) && stickerItemModel2.layerWeight > i2) {
                        i2 = stickerItemModel2.layerWeight;
                    }
                }
            } else {
                i2 = 1;
            }
            stickerItemModel.layerWeight += i2;
            VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
            if (videoPublishEditModel6 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel6.infoStickerModel.stickers.add(stickerItemModel);
            ArrayList arrayList = new ArrayList();
            VideoPublishEditModel videoPublishEditModel7 = this.f147173c;
            if (videoPublishEditModel7 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel7.infoStickerModel.stickers.size() > 0) {
                VideoPublishEditModel videoPublishEditModel8 = this.f147173c;
                if (videoPublishEditModel8 == null) {
                    h.f.b.l.a("mModel");
                }
                i3 = 1;
                for (StickerItemModel stickerItemModel3 : videoPublishEditModel8.infoStickerModel.stickers) {
                    if (stickerItemModel3.type == 4) {
                        h.f.b.l.b(stickerItemModel3, "");
                        arrayList.add(stickerItemModel3);
                    } else if (stickerItemModel3.type == 7) {
                        h.f.b.l.b(stickerItemModel3, "");
                        arrayList.add(stickerItemModel3);
                    } else if (stickerItemModel3.type == 19) {
                        h.f.b.l.b(stickerItemModel3, "");
                        arrayList.add(stickerItemModel3);
                    } else if (stickerItemModel3.layerWeight > i3) {
                        i3 = stickerItemModel3.layerWeight;
                    }
                }
            } else {
                i3 = 1;
            }
            if (arrayList.size() > 1) {
                h.a.n.a((List) arrayList, (Comparator) new cu());
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((StickerItemModel) arrayList.get(i4)).layerWeight = i3 + i4 + 1;
            }
        }
    }

    static final class bd<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147231a;

        static {
            Covode.recordClassIndex(96997);
        }

        bd(v vVar) {
            this.f147231a = vVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.gamora.editor.subtitle.e V;
            int i2;
            LiveData<Boolean> e2;
            LiveData<Boolean> c2;
            LiveData<Boolean> i3;
            LiveData<Boolean> e3;
            com.ss.android.ugc.aweme.df.e.a("receive FirstFrameVisible event in edit page");
            v vVar = this.f147231a;
            VideoPublishEditModel videoPublishEditModel = vVar.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            if (!com.ss.android.ugc.aweme.shortvideo.edit.bp.j(videoPublishEditModel)) {
                com.ss.android.ugc.aweme.port.in.g.a().l().requestDuetSettingPermission();
                ((com.ss.android.ugc.gamora.editor.gesture.a) vVar.f147175e.getValue()).a();
                vVar.P().a();
                com.ss.android.ugc.gamora.editor.progress.a O = vVar.O();
                if (O != null) {
                    O.b();
                }
                vVar.N().a();
                ((com.ss.android.ugc.gamora.editor.filter.indicator.a) vVar.f147174d.getValue()).a();
                vVar.e(vVar.E());
                VideoPublishEditModel videoPublishEditModel2 = vVar.f147173c;
                if (videoPublishEditModel2 == null) {
                    h.f.b.l.a("mModel");
                }
                if (videoPublishEditModel2.isMultiVideoEdit()) {
                    VideoPublishEditModel videoPublishEditModel3 = vVar.f147173c;
                    if (videoPublishEditModel3 == null) {
                        h.f.b.l.a("mModel");
                    }
                    if (videoPublishEditModel3.isRetakeVideo()) {
                        vVar.ap();
                    }
                }
            }
            v vVar2 = this.f147231a;
            vVar2.aq().k();
            VideoPublishEditModel videoPublishEditModel4 = vVar2.f147173c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            if (com.ss.android.ugc.aweme.shortvideo.edit.bp.f(videoPublishEditModel4)) {
                com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a();
            }
            v vVar3 = this.f147231a;
            VideoPublishEditModel videoPublishEditModel5 = vVar3.f147173c;
            if (videoPublishEditModel5 == null) {
                h.f.b.l.a("mModel");
            }
            if (videoPublishEditModel5.isAutoEnhanceEnable(com.ss.android.ugc.aweme.shortvideo.edit.b.a.a())) {
                vVar3.L().a();
            }
            v vVar4 = this.f147231a;
            vVar4.Q().Q().observe(vVar4, new an(vVar4));
            vVar4.Q().X().observe(vVar4, new ao(vVar4));
            vVar4.Q().e().observe(vVar4, new ap(vVar4));
            Activity activity = vVar4.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            androidx.lifecycle.ac a2 = androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(EditEffectVideoModel.class);
            h.f.b.l.b(a2, "");
            ((EditEffectVideoModel) a2).k().observe(vVar4, new aq(vVar4));
            com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.c I = vVar4.I();
            if (!(I == null || (e3 = I.e()) == null)) {
                e3.observe(vVar4, new ar(vVar4));
            }
            com.ss.android.ugc.gamora.editor.subtitle.e V2 = vVar4.V();
            if (!(V2 == null || (i3 = V2.i()) == null)) {
                i3.observe(vVar4, new as(vVar4));
            }
            com.ss.android.ugc.gamora.editor.multiedit.a R = vVar4.R();
            if (!(R == null || (c2 = R.c()) == null)) {
                c2.observe(vVar4, new at(vVar4));
            }
            com.ss.android.ugc.gamora.editor.multiedit.a R2 = vVar4.R();
            if (!(R2 == null || (e2 = R2.e()) == null)) {
                e2.observe(vVar4, new au(vVar4));
            }
            com.ss.android.ugc.gamora.editor.a.d Y = vVar4.Y();
            if (Y != null) {
                VideoPublishEditModel videoPublishEditModel6 = vVar4.f147173c;
                if (videoPublishEditModel6 == null) {
                    h.f.b.l.a("mModel");
                }
                if (videoPublishEditModel6.isAudioEnhance) {
                    if (!com.ss.android.ugc.gamora.editor.a.c.c()) {
                        Y.b();
                        Activity activity2 = vVar4.f42913m;
                        if (activity2 == null) {
                            h.f.b.l.b();
                        }
                        h.f.b.l.b(activity2, "");
                        new com.bytedance.tux.g.b(activity2).e(R.string.bp4).b();
                    } else {
                        VideoPublishEditModel videoPublishEditModel7 = vVar4.f147173c;
                        if (videoPublishEditModel7 == null) {
                            h.f.b.l.a("mModel");
                        }
                        if (!videoPublishEditModel7.mIsFromDraft && com.ss.android.ugc.aweme.property.aa.a() && !vVar4.f147179i.f145677a.getBoolean("display_noise_on_v3", false)) {
                            Activity activity3 = vVar4.f42913m;
                            if (activity3 == null) {
                                h.f.b.l.b();
                            }
                            h.f.b.l.b(activity3, "");
                            new com.bytedance.tux.g.b(activity3).e(R.string.dia).b();
                            vVar4.f147179i.f145677a.storeBoolean("display_noise_on_v3", true);
                        }
                    }
                    Y.a().observe(vVar4, new am(Y, vVar4));
                }
            }
            vVar4.H().c().observe(vVar4, new aw(vVar4));
            com.ss.android.ugc.gamora.editor.subtitle.e V3 = this.f147231a.V();
            if (V3 != null) {
                VideoPublishEditModel a3 = v.a(this.f147231a);
                com.ss.android.ugc.asve.editor.g ak = this.f147231a.ak();
                if (ak != null) {
                    i2 = ak.j();
                } else {
                    i2 = -1;
                }
                V3.a(a3, i2);
            }
            if (com.ss.android.ugc.aweme.shortvideo.subtitle.f.a(v.a(this.f147231a)) && (V = this.f147231a.V()) != null) {
                V.f();
            }
        }
    }

    static final class aw<T> implements androidx.lifecycle.u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147215a;

        static {
            Covode.recordClassIndex(96989);
        }

        aw(v vVar) {
            this.f147215a = vVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:205:0x044a, code lost:
            r0 = r3.J();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x044e, code lost:
            if (r0 == null) goto L_0x0453;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0450, code lost:
            r0.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x0453, code lost:
            r3.Q().a((com.ss.android.ugc.aweme.shortvideo.preview.a) false, false, false);
            com.ss.android.ugc.aweme.shortvideo.edit.w.b("voice");
            r9 = r3.f147173c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0461, code lost:
            if (r9 != null) goto L_0x0466;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0463, code lost:
            h.f.b.l.a("mModel");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0466, code lost:
            h.f.b.l.d(r9, "");
            com.ss.android.ugc.aweme.common.r.a("click_voice_modify", com.ss.android.ugc.aweme.shortvideo.edit.bl.l(r9).a("creation_id", r9.creationId).a("enter_from", "video_edit_page").a("shoot_way", r9.mShootWay).a("content_source", com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f.a("content_source", r9)).a("shoot_entrance", com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f.a("shoot_entrance", r9)).a("content_type", com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.f.a("content_type", r9)).a("local_time_ms", java.lang.System.currentTimeMillis()).a("is_multi_content", com.ss.android.ugc.aweme.shortvideo.edit.bl.k(r9)).f149193a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x04b0, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:290:0x0600, code lost:
            if (r1 == 1) goto L_0x0602;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
            if (com.ss.android.ugc.aweme.shortvideo.edit.bp.g(r0) != false) goto L_0x0087;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
            if (r0.veAudioRecorderParam.hasRecord() == false) goto L_0x00a1;
         */
        @Override // androidx.lifecycle.u
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r17) {
            /*
            // Method dump skipped, instructions count: 1752
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.aw.onChanged(java.lang.Object):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0445, code lost:
        if (com.ss.android.ugc.aweme.shortvideo.edit.bp.e(r0) != false) goto L_0x0447;
     */
    @Override // com.bytedance.scene.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Bundle r13) {
        /*
        // Method dump skipped, instructions count: 1165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.v.a(android.os.Bundle):void");
    }

    public static final class aa implements h.h.d<Object, com.ss.android.ugc.gamora.editor.music.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.a f147183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147184b;

        static {
            Covode.recordClassIndex(96964);
        }

        public aa(com.bytedance.o.a aVar, v vVar) {
            this.f147183a = aVar;
            this.f147184b = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.h.d
        public final /* synthetic */ com.ss.android.ugc.gamora.editor.music.a a(Object obj, h.k.i iVar) {
            h.f.b.l.d(obj, "");
            h.f.b.l.d(iVar, "");
            Object b2 = this.f147183a.getDiContainer().b(com.ss.android.ugc.gamora.editor.music.a.class, null);
            if (com.ss.android.ugc.aweme.shortvideo.edit.bp.l(v.a(this.f147184b))) {
                return b2;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class af implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f147187a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f147188b;

        static {
            Covode.recordClassIndex(96969);
        }

        af(boolean z, v vVar) {
            this.f147187a = z;
            this.f147188b = vVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f147188b.c(this.f147187a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cl implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DialogInterface.OnClickListener f147309a;

        static {
            Covode.recordClassIndex(97040);
        }

        cl(DialogInterface.OnClickListener onClickListener) {
            this.f147309a = onClickListener;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            DialogInterface.OnClickListener onClickListener = this.f147309a;
            if (onClickListener != null) {
                onClickListener.onClick(dialogInterface, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cp extends h.f.b.m implements h.f.a.m<String, Integer, String> {
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        cp(v vVar) {
            super(2);
            this.this$0 = vVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ String invoke(String str, Integer num) {
            return a(str, num.intValue());
        }

        public final String a(String str, int i2) {
            h.f.b.l.d(str, "");
            StringBuilder sb = new StringBuilder();
            String string = this.this$0.s().getString(i2, "@".concat(String.valueOf(str)));
            h.f.b.l.b(string, "");
            String sb2 = sb.append(string).append(" ").toString();
            h.f.b.l.b(sb2, "");
            return sb2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class cq extends h.f.b.m implements h.f.a.m<String, Integer, h.z> {
        final /* synthetic */ QaStruct $currentOnScreenQaStickerStruct;
        final /* synthetic */ v this$0;

        static {
            Covode.recordClassIndex(97045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        cq(v vVar, QaStruct qaStruct) {
            super(2);
            this.this$0 = vVar;
            this.$currentOnScreenQaStickerStruct = qaStruct;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(String str, Integer num) {
            a(str, num.intValue());
            return h.z.f158842a;
        }

        public final void a(String str, int i2) {
            h.f.b.l.d(str, "");
            QaStruct qaStruct = this.$currentOnScreenQaStickerStruct;
            if (qaStruct != null) {
                ArrayList arrayList = new ArrayList();
                String userName = qaStruct.getUserName();
                if (userName == null) {
                    userName = "";
                }
                int i3 = 0;
                int a2 = h.m.p.a((CharSequence) str, userName, 0, false, 6) - 1;
                int i4 = a2 + 1;
                String userName2 = qaStruct.getUserName();
                if (userName2 != null) {
                    i3 = userName2.length();
                }
                arrayList.add(AVTextExtraStructHelper.createQaStickerStruct(a2, i4 + i3, String.valueOf(qaStruct.getUserId()), i2));
                if (v.a(this.this$0).structList != null) {
                    for (AVTextExtraStruct aVTextExtraStruct : v.a(this.this$0).structList) {
                        h.f.b.l.b(aVTextExtraStruct, "");
                        aVTextExtraStruct.setStart(aVTextExtraStruct.getStart() + str.length());
                        aVTextExtraStruct.setEnd(aVTextExtraStruct.getEnd() + str.length());
                    }
                    VideoPublishEditModel a3 = v.a(this.this$0);
                    List list = v.a(this.this$0).structList;
                    h.f.b.l.b(list, "");
                    a3.structList = h.a.n.d((Collection) arrayList, (Iterable) list);
                } else {
                    v.a(this.this$0).structList = arrayList;
                }
                String str2 = str.toString();
                VideoPublishEditModel a4 = v.a(this.this$0);
                a4.title = v.a(this.this$0).title != null ? str2 + v.a(this.this$0).title : str2;
                VideoPublishEditModel a5 = v.a(this.this$0);
                if (v.a(this.this$0).chain != null) {
                    str2 = str2 + v.a(this.this$0).chain;
                }
                a5.chain = str2;
                v.a(this.this$0).disableDeleteChain = true;
            }
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <VM1 extends JediViewModel<S1>, S1 extends com.bytedance.jedi.arch.af, R> R withState(VM1 vm1, h.f.a.b<? super S1, ? extends R> bVar) {
        h.f.b.l.d(vm1, "");
        h.f.b.l.d(bVar, "");
        return (R) b.a.a(this, vm1, bVar);
    }

    public static final class cu<T> implements Comparator {
        static {
            Covode.recordClassIndex(97049);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(Integer.valueOf(t.layerWeight), Integer.valueOf(t2.layerWeight));
        }
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    static final class ah implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f147191a;

        static {
            Covode.recordClassIndex(96971);
        }

        ah(v vVar) {
            this.f147191a = vVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            Activity activity = this.f147191a.f42913m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ((EditEffectVideoModel) androidx.lifecycle.ae.a((androidx.fragment.app.e) activity, (ad.b) null).a(EditEffectVideoModel.class)).j().setValue(null);
            this.f147191a.aj();
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.a(view, bundle);
        com.bytedance.f.a.a.j jVar = this.f147177g;
        if (jVar == null) {
            h.f.b.l.a("gestureService");
        }
        jVar.a(new com.bytedance.f.a.a.f(0, new al(this)));
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.atb, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) a2;
        Context context = viewGroup.getContext();
        h.f.b.l.b(context, "");
        this.f147177g = com.bytedance.f.a.a.a.a(context, (FrameLayout) viewGroup2.findViewById(R.id.asl));
        this.f147178h = viewGroup2.findViewById(R.id.ati);
        return viewGroup2;
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void a(Effect effect, CustomStickerInfo customStickerInfo) {
        h.f.b.l.d(effect, "");
        h.f.b.l.d(customStickerInfo, "");
        Q().v().setValue(dmt.av.video.t.b(0));
        com.ss.android.ugc.gamora.editor.sticker.panel.a S2 = S();
        if (S2 != null) {
            S2.a(effect, ds.a(customStickerInfo.a()));
        }
    }

    public final void a(Runnable runnable, boolean z2) {
        com.ss.android.ugc.aweme.editSticker.text.a.c a2;
        String str;
        String effectId;
        com.ss.android.ugc.tools.utils.q.a("VEVideoPublishEditActivity compileStickers");
        com.ss.android.ugc.aweme.editSticker.text.als.a aVar = G().M;
        if (aVar != null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<com.ss.android.ugc.aweme.editSticker.text.view.q> r2 = aVar.r();
            int size = r2.size();
            for (int i2 = 0; i2 < size; i2++) {
                TextStickerData data = r2.get(i2).getData();
                if (!(data == null || (a2 = com.ss.android.ugc.aweme.editSticker.text.a.b.a().a(data.getFontType())) == null)) {
                    if (a2.f88294b == null) {
                        str = "";
                    } else {
                        str = a2.f88294b;
                    }
                    sb.append(str);
                    if (a2.f88301i == null) {
                        effectId = "";
                    } else {
                        effectId = a2.f88301i.getEffectId();
                    }
                    sb2.append(effectId);
                    if (i2 != r2.size() - 1) {
                        sb.append(",");
                        sb2.append(",");
                    }
                }
            }
            VideoPublishEditModel videoPublishEditModel = this.f147173c;
            if (videoPublishEditModel == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel.textTypes = sb.toString();
            VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel2.textEffectIds = sb2.toString();
        } else {
            VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
            if (videoPublishEditModel3 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel3.textTypes = "";
            VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
            if (videoPublishEditModel4 == null) {
                h.f.b.l.a("mModel");
            }
            videoPublishEditModel4.textEffectIds = "";
        }
        com.ss.android.ugc.gamora.editor.sticker.poll.a Q2 = G().Q();
        com.ss.android.ugc.gamora.editor.sticker.duet.a S2 = G().S();
        aa aaVar = G().f146432k;
        com.ss.android.ugc.gamora.editor.sticker.donation.h hVar = G().f146430i;
        o oVar = G().t;
        l lVar = G().u;
        com.ss.android.ugc.gamora.editor.sticker.livecd.a R2 = G().R();
        com.ss.android.ugc.asve.editor.g ak2 = ak();
        if (ak2 == null) {
            h.f.b.l.b();
        }
        com.ss.android.ugc.aweme.shortvideo.edit.bq bqVar = this.S;
        if (bqVar == null) {
            h.f.b.l.a("mVideoSizeProvider");
        }
        com.ss.android.ugc.aweme.editSticker.interact.d[] dVarArr = new com.ss.android.ugc.aweme.editSticker.interact.d[10];
        dVarArr[0] = ((EditInfoStickerViewModel) this.v.getValue()).h();
        dVarArr[1] = S2.h();
        dVarArr[2] = aVar != null ? aVar.q() : null;
        dVarArr[3] = Q2.i();
        dVarArr[4] = R2.c();
        dVarArr[5] = aaVar != null ? aaVar.L() : null;
        dVarArr[6] = hVar != null ? hVar.K() : null;
        dVarArr[7] = oVar != null ? ((a) oVar).f145663b : null;
        dVarArr[8] = lVar != null ? ((a) lVar).f145663b : null;
        com.ss.android.ugc.gamora.editor.subtitle.b bVar = G().v;
        dVarArr[9] = bVar != null ? bVar.C() : null;
        boolean a3 = com.ss.android.ugc.aweme.shortvideo.edit.y.a(ak2, bqVar, dVarArr);
        com.ss.android.ugc.aweme.shortvideo.edit.bq bqVar2 = this.S;
        if (bqVar2 == null) {
            h.f.b.l.a("mVideoSizeProvider");
        }
        bqVar2.a(a3, true);
        long currentTimeMillis = System.currentTimeMillis();
        G().a(true);
        com.ss.android.ugc.gamora.editor.sticker.core.c F2 = G();
        com.ss.android.ugc.asve.editor.g ak3 = ak();
        if (ak3 == null) {
            h.f.b.l.b();
        }
        b.i<h.z> a4 = F2.a(ak3, this, (h.f.a.b<? super String, String>) null);
        com.ss.android.ugc.gamora.editor.sticker.core.c F3 = G();
        com.ss.android.ugc.asve.editor.g ak4 = ak();
        if (ak4 == null) {
            h.f.b.l.b();
        }
        b.i iVar = F3.b(ak4, this, (h.f.a.b<? super String, String>) null);
        if (!a4.a() || (iVar != null && !iVar.a())) {
            b.i a5 = b.i.b((Collection<? extends b.i<?>>) h.a.n.b(a4, iVar)).a(new ay(this), b.i.f4826c, null);
            h.f.b.l.b(a5, "");
            if (!a5.a()) {
                ax();
                b.i<Void> a6 = b.i.a(Math.max(0L, 50 - (System.currentTimeMillis() - currentTimeMillis)));
                h.f.b.l.b(a6, "");
                a5 = b.i.b((Collection<? extends b.i<?>>) h.a.n.b(a5, a6));
            }
            a5.a(new ax(this, runnable), b.i.f4826c, null);
            return;
        }
        G().ai();
        G().a(false);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af> f.a.b.b subscribe(JediViewModel<S> jediViewModel, com.bytedance.jedi.arch.ah<S> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super S, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.a(this, jediViewModel, ahVar, mVar);
    }

    public final void b(boolean z2, boolean z3, Runnable runnable) {
        float f2;
        AVChallenge aVChallenge;
        String str;
        if (this.U) {
            com.ss.android.ugc.aweme.port.in.g.a();
            com.ss.android.ugc.tools.utils.q.b("DoubleGoPublishActivity VEVideoPublishEditActivity");
            com.ss.android.ugc.aweme.df.f.a("DoubleGoPublishActivity VEVideoPublishEditActivity");
            if (SettingsManager.a().a("is_block_error_go_publish", true)) {
                com.ss.android.ugc.tools.utils.q.b("BlockErrorGoPublish");
                return;
            }
        }
        this.U = true;
        VideoPublishEditModel videoPublishEditModel = this.f147173c;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("mModel");
        }
        com.ss.android.ugc.gamora.editor.e.c Q2 = Q();
        com.ss.android.ugc.asve.editor.g ak2 = ak();
        if (ak2 != null) {
            f2 = ak2.F();
        } else {
            f2 = -1.0f;
        }
        com.ss.android.ugc.aweme.shortvideo.edit.bl.a(videoPublishEditModel, Q2, f2, "go_publish");
        Intent intent = new Intent();
        Activity t2 = t();
        h.f.b.l.b(t2, "");
        Intent intent2 = t2.getIntent();
        h.f.b.l.b(intent2, "");
        Bundle a2 = a(intent2);
        if (a2 != null) {
            a2.putInt("fromDraft", 0);
            intent.putExtras(a2);
        }
        VideoPublishEditModel videoPublishEditModel2 = this.f147173c;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("mModel");
        }
        com.ss.android.ugc.aweme.shortvideo.cr a3 = com.ss.android.ugc.aweme.shortvideo.cr.a();
        h.f.b.l.b(a3, "");
        videoPublishEditModel2.setMultiEditChallenges(a3.f125306m);
        VideoPublishEditModel videoPublishEditModel3 = this.f147173c;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel3.setMultiEditStickIds();
        VideoPublishEditModel videoPublishEditModel4 = this.f147173c;
        if (videoPublishEditModel4 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel4.setMultiEditBeautyMetadatas();
        VideoPublishEditModel videoPublishEditModel5 = this.f147173c;
        if (videoPublishEditModel5 == null) {
            h.f.b.l.a("mModel");
        }
        videoPublishEditModel5.setMultiEditCameraLensInfo();
        ArrayList arrayList = new ArrayList();
        VideoPublishEditModel videoPublishEditModel6 = this.f147173c;
        if (videoPublishEditModel6 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel6.challenges == null) {
            com.ss.android.ugc.aweme.infoSticker.i iVar = this.R;
            if (iVar == null) {
                h.f.b.l.a("stickerChallengeManager");
            }
            if (!iVar.c().isEmpty()) {
                com.ss.android.ugc.aweme.infoSticker.i iVar2 = this.R;
                if (iVar2 == null) {
                    h.f.b.l.a("stickerChallengeManager");
                }
                arrayList.addAll(iVar2.c());
            }
        }
        VideoPublishEditModel videoPublishEditModel7 = this.f147173c;
        if (videoPublishEditModel7 == null) {
            h.f.b.l.a("mModel");
        }
        AudioEffectParam audioEffectParam = videoPublishEditModel7.veAudioEffectParam;
        if (audioEffectParam != null) {
            aVChallenge = audioEffectParam.getChallenge();
            if (aVChallenge != null) {
                VideoPublishEditModel videoPublishEditModel8 = this.f147173c;
                if (videoPublishEditModel8 == null) {
                    h.f.b.l.a("mModel");
                }
                if (com.ss.android.ugc.aweme.shortvideo.edit.bp.h(videoPublishEditModel8)) {
                    VideoPublishEditModel videoPublishEditModel9 = this.f147173c;
                    if (videoPublishEditModel9 == null) {
                        h.f.b.l.a("mModel");
                    }
                    if (videoPublishEditModel9.hasNotAudioRecord()) {
                        VideoPublishEditModel videoPublishEditModel10 = this.f147173c;
                        if (videoPublishEditModel10 == null) {
                            h.f.b.l.a("mModel");
                        }
                        com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b.a(videoPublishEditModel10);
                    }
                }
                arrayList.add(aVChallenge);
            }
        } else {
            aVChallenge = null;
        }
        VideoPublishEditModel videoPublishEditModel11 = this.f147173c;
        if (videoPublishEditModel11 == null) {
            h.f.b.l.a("mModel");
        }
        if (videoPublishEditModel11.challenges != null) {
            VideoPublishEditModel videoPublishEditModel12 = this.f147173c;
            if (videoPublishEditModel12 == null) {
                h.f.b.l.a("mModel");
            }
            arrayList.addAll(videoPublishEditModel12.challenges);
            com.ss.android.ugc.aweme.infoSticker.i iVar3 = this.R;
            if (iVar3 == null) {
                h.f.b.l.a("stickerChallengeManager");
            }
            VideoPublishEditModel videoPublishEditModel13 = this.f147173c;
            if (videoPublishEditModel13 == null) {
                h.f.b.l.a("mModel");
            }
            List list = videoPublishEditModel13.challenges;
            h.f.b.l.b(list, "");
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                String str2 = ((AVChallenge) obj).challengeName;
                if (aVChallenge == null || (str = aVChallenge.challengeName) == null) {
                    str = "";
                }
                if (!h.f.b.l.a((Object) str2, (Object) str)) {
                    arrayList2.add(obj);
                }
            }
            iVar3.a(arrayList2);
        }
        VideoPublishEditModel videoPublishEditModel14 = this.f147173c;
        if (videoPublishEditModel14 == null) {
            h.f.b.l.a("mModel");
        }
        com.ss.android.ugc.aweme.infoSticker.i iVar4 = this.R;
        if (iVar4 == null) {
            h.f.b.l.a("stickerChallengeManager");
        }
        videoPublishEditModel14.stickerChallenge = iVar4.a();
        aw();
        VideoPublishEditModel videoPublishEditModel15 = this.f147173c;
        if (videoPublishEditModel15 == null) {
            h.f.b.l.a("mModel");
        }
        VideoPublishEditModel makeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel15);
        com.ss.android.ugc.aweme.tools.b.g.a(com.ss.android.ugc.aweme.shortvideo.q.a(makeCopy), com.ss.android.ugc.aweme.shortvideo.q.b(makeCopy), com.ss.android.ugc.aweme.tools.b.e.EDIT, com.ss.android.ugc.aweme.tools.b.e.PUBLISH);
        Objects.requireNonNull(makeCopy, "null cannot be cast to non-null type java.io.Serializable");
        intent.putExtra("args", (Serializable) makeCopy);
        com.ss.android.ugc.aweme.df.e.a("GoPublishActivity from new edit page  newOne = ".concat(String.valueOf(makeCopy)));
        intent.putExtra("is_from_sys_share", z2);
        intent.putExtra("challenge", arrayList);
        intent.putExtra("enter_record_from_other_platform", z3);
        Activity activity = this.f42913m;
        if (activity == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity, "");
        boolean booleanExtra = activity.getIntent().getBooleanExtra("extra_enter_from_live", false);
        intent.putExtra("extra_enter_from_live", booleanExtra);
        Activity activity2 = this.f42913m;
        if (activity2 == null) {
            h.f.b.l.b();
        }
        h.f.b.l.b(activity2, "");
        intent.putExtra("edit_publish_session_end_together", activity2.getIntent().getBooleanExtra("edit_publish_session_end_together", false));
        int b2 = aq().b();
        if (b2 >= 0) {
            intent.putExtra("music_rec_type", b2);
        }
        runnable.run();
        if (!com.ss.android.ugc.aweme.setting.q.a() || ak() == null) {
            a(z3, booleanExtra, intent);
            return;
        }
        com.ss.android.ugc.asve.editor.g ak3 = ak();
        if (ak3 != null) {
            ak3.a(new bg(this, z3, booleanExtra, intent));
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.rootscene.d
    public final void b(boolean z2, boolean z3, boolean z4, Runnable runnable) {
        h.f.b.l.d(runnable, "");
        a(z2, z3, z4, runnable, (Runnable) null);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<A>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        return b.a.d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.d<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.d<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.b
    public final <S extends com.bytedance.jedi.arch.af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.ac<? extends A>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.ac<A>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.b, ? super A, h.z> mVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(mVar, "");
        b.a.c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.al<A, B>> ahVar, h.f.a.q<? super com.bytedance.jedi.arch.i, ? super A, ? super B, h.z> qVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(qVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, T> f.a.b.b asyncSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends com.bytedance.jedi.arch.a<? extends T>> kVar, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.ak<com.bytedance.jedi.arch.a<T>>> ahVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super Throwable, h.z> mVar, h.f.a.b<? super com.bytedance.jedi.arch.i, h.z> bVar, h.f.a.m<? super com.bytedance.jedi.arch.i, ? super T, h.z> mVar2) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(ahVar, "");
        return b.a.a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.am<A, B, C>> ahVar, h.f.a.r<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, h.z> rVar) {
        h.f.b.l.d(jediViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(ahVar, "");
        h.f.b.l.d(rVar, "");
        return b.a.a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.h
    public final <S extends com.bytedance.jedi.arch.af, A, B, C, D> f.a.b.b selectSubscribe(JediViewModel<S> jediViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.jedi.arch.ah<com.bytedance.jedi.arch.an<A, B, C, D>> ahVar, h.f.a.s<? super com.bytedance.jedi.arch.i, ? super A, ? super B, ? super C, ? super D, h.z> sVar) {
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
