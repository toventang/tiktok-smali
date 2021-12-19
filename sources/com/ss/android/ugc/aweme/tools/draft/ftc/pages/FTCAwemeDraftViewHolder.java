package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.h.v;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.l.o;
import com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Map;
import java.util.Objects;

public final class FTCAwemeDraftViewHolder extends com.ss.android.ugc.aweme.tools.draft.a.a<com.ss.android.ugc.aweme.draft.model.c> implements WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    ExpandableMentionTextView f139551a;

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f139552b;

    /* renamed from: c  reason: collision with root package name */
    TextView f139553c;

    /* renamed from: d  reason: collision with root package name */
    TextView f139554d;

    /* renamed from: e  reason: collision with root package name */
    ImageView f139555e;

    /* renamed from: f  reason: collision with root package name */
    public SimpleDraweeView f139556f;

    /* renamed from: g  reason: collision with root package name */
    View f139557g;

    /* renamed from: h  reason: collision with root package name */
    ImageView f139558h;

    /* renamed from: i  reason: collision with root package name */
    AppCompatCheckBox f139559i;

    /* renamed from: j  reason: collision with root package name */
    FTCDraftItemView f139560j;

    /* renamed from: k  reason: collision with root package name */
    Space f139561k;

    /* renamed from: l  reason: collision with root package name */
    RelativeLayout f139562l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f139563m;
    public boolean n;
    final a o;
    final Context p;
    long q;
    final Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r;
    private Space s;
    private com.ss.android.ugc.tools.view.e.b w;

    public interface a {
        static {
            Covode.recordClassIndex(91240);
        }

        void a(int i2, com.ss.android.ugc.aweme.draft.model.c cVar);

        void a(View view, com.ss.android.ugc.aweme.draft.model.c cVar);
    }

    static {
        Covode.recordClassIndex(91239);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class d implements FTCDraftItemView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAwemeDraftViewHolder f139567a;

        static {
            Covode.recordClassIndex(91243);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f139567a = fTCAwemeDraftViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.ftc.pages.FTCDraftItemView.a
        public final void a(int i2, boolean z) {
            int i3;
            int i4;
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f139567a;
            ViewGroup viewGroup = fTCAwemeDraftViewHolder.f139552b;
            if (viewGroup == null) {
                l.a("mAwemeTitleContainer");
                l.b();
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ExpandableMentionTextView expandableMentionTextView = fTCAwemeDraftViewHolder.f139551a;
            if (expandableMentionTextView == null) {
                l.a("mAwemeTitle");
                l.b();
            }
            int i5 = 1;
            if (com.ss.android.ugc.aweme.tools.c.a(expandableMentionTextView.getContext())) {
                int i6 = marginLayoutParams.leftMargin;
                if (z) {
                    i5 = -1;
                }
                i3 = i6 + (i2 * i5);
                i4 = marginLayoutParams.rightMargin;
            } else {
                i3 = marginLayoutParams.leftMargin;
                int i7 = marginLayoutParams.rightMargin;
                if (!z) {
                    i5 = -1;
                }
                i4 = (i2 * i5) + i7;
            }
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            ViewGroup viewGroup2 = fTCAwemeDraftViewHolder.f139552b;
            if (viewGroup2 == null) {
                l.a("mAwemeTitleContainer");
                l.b();
            }
            viewGroup2.setLayoutParams(marginLayoutParams);
        }
    }

    public static final /* synthetic */ SimpleDraweeView a(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
        SimpleDraweeView simpleDraweeView = fTCAwemeDraftViewHolder.f139556f;
        if (simpleDraweeView == null) {
            l.a("mCover");
        }
        return simpleDraweeView;
    }

    static final class f implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAwemeDraftViewHolder f139569a;

        static {
            Covode.recordClassIndex(91245);
        }

        f(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f139569a = fTCAwemeDraftViewHolder;
        }

        public final boolean onLongClick(View view) {
            com.ss.android.ugc.aweme.draft.model.c cVar;
            l.d(view, "");
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f139569a;
            cr.a();
            if (!cr.a(view.getContext()) || (cVar = (com.ss.android.ugc.aweme.draft.model.c) fTCAwemeDraftViewHolder.t) == null) {
                return true;
            }
            fTCAwemeDraftViewHolder.o.a(view, cVar);
            return true;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        l.d(message, "");
        Context context = this.p;
        Object obj = message.obj;
        Objects.requireNonNull(obj, "null cannot be cast to non-null type android.content.Intent");
        Intent intent = (Intent) obj;
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
        com.ss.android.ugc.tools.view.e.b bVar = this.w;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
            this.w = null;
        }
    }

    public static final class c implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAwemeDraftViewHolder f139565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f139566b;

        static {
            Covode.recordClassIndex(91242);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            l.d(bitmap, "");
            if (!bitmap.isRecycled() && FTCAwemeDraftViewHolder.a(this.f139565a) != null) {
                SimpleDraweeView a2 = FTCAwemeDraftViewHolder.a(this.f139565a);
                if (a2 == null) {
                    l.b();
                }
                if (l.a(a2.getTag(), (Object) this.f139566b.r())) {
                    SimpleDraweeView a3 = FTCAwemeDraftViewHolder.a(this.f139565a);
                    if (!bitmap.isRecycled()) {
                        a3.setImageBitmap(bitmap);
                    }
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> a4 = o.a(bitmap);
                    com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) this.f139565a.t;
                    if (cVar == null) {
                        l.b();
                    }
                    o.a(a4, cVar.r());
                    FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f139565a;
                    SimpleDraweeView a5 = FTCAwemeDraftViewHolder.a(fTCAwemeDraftViewHolder);
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> b2 = a4.clone();
                    l.b(b2, "");
                    com.facebook.common.h.a<com.facebook.imagepipeline.j.c> put = fTCAwemeDraftViewHolder.r.put(a5, b2);
                    if (put != null) {
                        com.facebook.common.h.a.c(put);
                    }
                }
            }
        }

        c(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder, com.ss.android.ugc.aweme.draft.model.c cVar) {
            this.f139565a = fTCAwemeDraftViewHolder;
            this.f139566b = cVar;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAwemeDraftViewHolder f139568a;

        static {
            Covode.recordClassIndex(91244);
        }

        e(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f139568a = fTCAwemeDraftViewHolder;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            l.d(view, "");
            FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder = this.f139568a;
            if (fTCAwemeDraftViewHolder.f139563m) {
                AppCompatCheckBox appCompatCheckBox = fTCAwemeDraftViewHolder.f139559i;
                if (appCompatCheckBox == null) {
                    l.a("mCheckBox");
                    l.b();
                }
                Object obj = fTCAwemeDraftViewHolder.t;
                if (obj == null) {
                    l.b();
                }
                appCompatCheckBox.setChecked(!((com.ss.android.ugc.aweme.draft.model.c) obj).y);
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - fTCAwemeDraftViewHolder.q >= 500) {
                fTCAwemeDraftViewHolder.q = currentTimeMillis;
                com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) fTCAwemeDraftViewHolder.t;
                if (cVar != null) {
                    fTCAwemeDraftViewHolder.o.a(fTCAwemeDraftViewHolder.getAdapterPosition(), cVar);
                }
            }
        }
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FTCAwemeDraftViewHolder f139564a;

        static {
            Covode.recordClassIndex(91241);
        }

        b(FTCAwemeDraftViewHolder fTCAwemeDraftViewHolder) {
            this.f139564a = fTCAwemeDraftViewHolder;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.ss.android.ugc.aweme.draft.model.c cVar = (com.ss.android.ugc.aweme.draft.model.c) this.f139564a.t;
            if (cVar == null) {
                l.b();
            }
            cVar.y = z;
            IDraftService a2 = com.ss.android.ugc.aweme.tools.draft.j.c.a();
            com.ss.android.ugc.aweme.draft.model.c cVar2 = (com.ss.android.ugc.aweme.draft.model.c) this.f139564a.t;
            if (cVar2 == null) {
                l.b();
            }
            a2.notifyDraftCheckedChanged(cVar2, z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCAwemeDraftViewHolder(View view, Map<ImageView, com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> map, a aVar) {
        super(view);
        l.d(view, "");
        l.d(map, "");
        l.d(aVar, "");
        View c2 = v.c(view, (int) R.id.q2);
        l.b(c2, "");
        this.f139551a = (ExpandableMentionTextView) c2;
        View c3 = v.c(view, (int) R.id.cgw);
        l.b(c3, "");
        this.f139552b = (ViewGroup) c3;
        View c4 = v.c(view, (int) R.id.eyt);
        l.b(c4, "");
        this.f139553c = (TextView) c4;
        View c5 = v.c(view, (int) R.id.pt);
        l.b(c5, "");
        this.f139554d = (TextView) c5;
        View c6 = v.c(view, (int) R.id.a46);
        l.b(c6, "");
        this.f139555e = (ImageView) c6;
        View c7 = v.c(view, (int) R.id.agf);
        l.b(c7, "");
        this.f139556f = (SimpleDraweeView) c7;
        View c8 = v.c(view, (int) R.id.exg);
        l.b(c8, "");
        this.f139557g = c8;
        View c9 = v.c(view, (int) R.id.apk);
        l.b(c9, "");
        this.f139558h = (ImageView) c9;
        View c10 = v.c(view, (int) R.id.a5_);
        l.b(c10, "");
        this.f139559i = (AppCompatCheckBox) c10;
        View c11 = v.c(view, (int) R.id.ces);
        l.b(c11, "");
        FTCDraftItemView fTCDraftItemView = (FTCDraftItemView) c11;
        this.f139560j = fTCDraftItemView;
        if (fTCDraftItemView == null) {
            l.a("mContainerLl");
        }
        fTCDraftItemView.setOnScrollListener(new d(this));
        View c12 = v.c(view, (int) R.id.apj);
        l.b(c12, "");
        this.s = (Space) c12;
        View c13 = v.c(view, (int) R.id.api);
        l.b(c13, "");
        this.f139561k = (Space) c13;
        View c14 = v.c(view, (int) R.id.apf);
        l.b(c14, "");
        RelativeLayout relativeLayout = (RelativeLayout) c14;
        this.f139562l = relativeLayout;
        if (relativeLayout == null) {
            l.a("mDraftListItemLayout");
        }
        relativeLayout.setOnClickListener(new e(this));
        RelativeLayout relativeLayout2 = this.f139562l;
        if (relativeLayout2 == null) {
            l.a("mDraftListItemLayout");
        }
        relativeLayout2.setOnLongClickListener(new f(this));
        this.o = aVar;
        Context context = view.getContext();
        l.b(context, "");
        this.p = context;
        Activity a2 = com.ss.android.ugc.aweme.utils.i.a(context);
        if (a2 instanceof androidx.fragment.app.e) {
            ((androidx.core.app.d) a2).getLifecycle().a(this);
        }
        this.r = map;
    }
}
