package com.ss.android.ugc.aweme.tools.draft.viewholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
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
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.draft.model.k;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.tools.draft.DraftItemView;
import com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.z;
import java.io.File;
import java.util.List;
import java.util.Objects;

public final class DraftViewHolder extends a<com.ss.android.ugc.aweme.tools.draft.d.d> implements l {

    /* renamed from: a  reason: collision with root package name */
    public final String f139871a = "DraftViewHolder";

    /* renamed from: b  reason: collision with root package name */
    ExpandableMentionTextView f139872b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f139873c;

    /* renamed from: d  reason: collision with root package name */
    public SimpleDraweeView f139874d;

    /* renamed from: e  reason: collision with root package name */
    AppCompatCheckBox f139875e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.draft.f.a f139876f;

    /* renamed from: g  reason: collision with root package name */
    long f139877g;

    /* renamed from: h  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.draft.d.d f139878h;

    /* renamed from: i  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.tools.draft.viewmodel.a f139879i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f139880j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f139881k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f139882l;

    /* renamed from: m  reason: collision with root package name */
    private View f139883m;
    private ImageView n;
    private DraftItemView o;
    private Space p;
    private RelativeLayout q;
    private Context r;
    private k s;

    final /* synthetic */ class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.b f139889a;

        static {
            Covode.recordClassIndex(91424);
        }

        f(h.f.a.b bVar) {
            this.f139889a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.b.l.b(this.f139889a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(91418);
    }

    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class c implements DraftItemView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraftViewHolder f139887a;

        static {
            Covode.recordClassIndex(91421);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(DraftViewHolder draftViewHolder) {
            this.f139887a = draftViewHolder;
        }

        @Override // com.ss.android.ugc.aweme.tools.draft.DraftItemView.a
        public final void a(int i2, boolean z) {
            int i3;
            int i4;
            DraftViewHolder draftViewHolder = this.f139887a;
            ViewGroup viewGroup = draftViewHolder.f139873c;
            if (viewGroup == null) {
                h.f.b.l.a("mAwemeTitleContainer");
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ExpandableMentionTextView expandableMentionTextView = draftViewHolder.f139872b;
            if (expandableMentionTextView == null) {
                h.f.b.l.a("mAwemeTitle");
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
            ViewGroup viewGroup2 = draftViewHolder.f139873c;
            if (viewGroup2 == null) {
                h.f.b.l.a("mAwemeTitleContainer");
            }
            viewGroup2.setLayoutParams(marginLayoutParams);
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.tools.draft.d.d a(DraftViewHolder draftViewHolder) {
        com.ss.android.ugc.aweme.tools.draft.d.d dVar = draftViewHolder.f139878h;
        if (dVar == null) {
            h.f.b.l.a("mData");
        }
        return dVar;
    }

    public static final /* synthetic */ SimpleDraweeView b(DraftViewHolder draftViewHolder) {
        SimpleDraweeView simpleDraweeView = draftViewHolder.f139874d;
        if (simpleDraweeView == null) {
            h.f.b.l.a("mCover");
        }
        return simpleDraweeView;
    }

    public static final class b implements IEffectService.OnVideoCoverCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraftViewHolder f139885a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.draft.model.c f139886b;

        static {
            Covode.recordClassIndex(91420);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverFailed(int i2) {
            bj.b(this.f139885a.f139871a + " :onGetVideoCoverFailed: errorCode = " + i2);
        }

        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            h.f.b.l.d(bitmap, "");
            bj.a(this.f139885a.f139871a + " : onGetVideoCoverSuccess: ");
            if (!bitmap.isRecycled() && DraftViewHolder.b(this.f139885a).getTag() != null && !(!h.f.b.l.a(DraftViewHolder.b(this.f139885a).getTag(), (Object) this.f139886b.r()))) {
                SimpleDraweeView b2 = DraftViewHolder.b(this.f139885a);
                if (!bitmap.isRecycled()) {
                    b2.setImageBitmap(bitmap);
                }
            }
        }

        b(DraftViewHolder draftViewHolder, com.ss.android.ugc.aweme.draft.model.c cVar) {
            this.f139885a = draftViewHolder;
            this.f139886b = cVar;
        }
    }

    static final class e implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraftViewHolder f139888a;

        static {
            Covode.recordClassIndex(91423);
        }

        e(DraftViewHolder draftViewHolder) {
            this.f139888a = draftViewHolder;
        }

        public final boolean onLongClick(View view) {
            DraftViewHolder draftViewHolder = this.f139888a;
            if (view == null) {
                h.f.b.l.b();
            }
            cr.a();
            if (!cr.a(view.getContext())) {
                return true;
            }
            com.ss.android.ugc.aweme.tools.draft.f.a aVar = draftViewHolder.f139876f;
            com.ss.android.ugc.aweme.tools.draft.d.d dVar = draftViewHolder.f139878h;
            if (dVar == null) {
                h.f.b.l.a("mData");
            }
            aVar.a(view, dVar);
            return true;
        }
    }

    static final /* synthetic */ class d extends j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(91422);
        }

        d(DraftViewHolder draftViewHolder) {
            super(1, draftViewHolder, DraftViewHolder.class, "clickDraft", "clickDraft(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            h.f.b.l.d(view, "");
            DraftViewHolder draftViewHolder = (DraftViewHolder) this.receiver;
            com.ss.android.ugc.aweme.tools.draft.d.d dVar = draftViewHolder.f139878h;
            if (dVar == null) {
                h.f.b.l.a("mData");
            }
            if (dVar.f139476a) {
                AppCompatCheckBox appCompatCheckBox = draftViewHolder.f139875e;
                if (appCompatCheckBox == null) {
                    h.f.b.l.a("mCheckBox");
                }
                com.ss.android.ugc.aweme.tools.draft.d.d dVar2 = draftViewHolder.f139878h;
                if (dVar2 == null) {
                    h.f.b.l.a("mData");
                }
                appCompatCheckBox.setChecked(!dVar2.f139482e);
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - draftViewHolder.f139877g >= 500) {
                    draftViewHolder.f139877g = currentTimeMillis;
                    com.ss.android.ugc.aweme.tools.draft.f.a aVar = draftViewHolder.f139876f;
                    int adapterPosition = draftViewHolder.getAdapterPosition();
                    com.ss.android.ugc.aweme.tools.draft.d.d dVar3 = draftViewHolder.f139878h;
                    if (dVar3 == null) {
                        h.f.b.l.a("mData");
                    }
                    aVar.a(adapterPosition, dVar3);
                }
            }
            return z.f158842a;
        }
    }

    private final void a(com.ss.android.ugc.aweme.tools.draft.d.d dVar) {
        MethodCollector.i(2524);
        ExpandableMentionTextView expandableMentionTextView = this.f139872b;
        if (expandableMentionTextView == null) {
            h.f.b.l.a("mAwemeTitle");
        }
        expandableMentionTextView.setSpanColor(androidx.core.content.b.c(this.r, R.color.bx));
        String str = dVar.f139487j;
        if (str.length() == 0) {
            ExpandableMentionTextView expandableMentionTextView2 = this.f139872b;
            if (expandableMentionTextView2 == null) {
                h.f.b.l.a("mAwemeTitle");
            }
            expandableMentionTextView2.setText(this.r.getText(R.string.bd9));
            ExpandableMentionTextView expandableMentionTextView3 = this.f139872b;
            if (expandableMentionTextView3 == null) {
                h.f.b.l.a("mAwemeTitle");
            }
            expandableMentionTextView3.setTextColor(androidx.core.content.b.c(this.r, R.color.c5));
            MethodCollector.o(2524);
            return;
        }
        ExpandableMentionTextView expandableMentionTextView4 = this.f139872b;
        if (expandableMentionTextView4 == null) {
            h.f.b.l.a("mAwemeTitle");
        }
        expandableMentionTextView4.setText(str);
        if (dVar.f139488k != null) {
            ExpandableMentionTextView expandableMentionTextView5 = this.f139872b;
            if (expandableMentionTextView5 == null) {
                h.f.b.l.a("mAwemeTitle");
            }
            expandableMentionTextView5.a(com.ss.android.ugc.aweme.shortvideo.ae.f.a((List<AVTextExtraStruct>) dVar.f139488k), !g.a().A().a());
            List<? extends AVTextExtraStruct> list = dVar.f139488k;
            if (list == null) {
                h.f.b.l.b();
            }
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                if (aVTextExtraStruct.getType() == 0 || aVTextExtraStruct.getType() == 5) {
                    int subType = aVTextExtraStruct.getSubType();
                    if (subType != 1) {
                        if (subType == 2) {
                            ExpandableMentionTextView expandableMentionTextView6 = this.f139872b;
                            if (expandableMentionTextView6 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            Context context = expandableMentionTextView6.getContext();
                            h.f.b.l.b(context, "");
                            ExpandableMentionTextView expandableMentionTextView7 = this.f139872b;
                            if (expandableMentionTextView7 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            com.ss.android.ugc.aweme.shortvideo.aa.c cVar = new com.ss.android.ugc.aweme.shortvideo.aa.c(context, expandableMentionTextView7);
                            ExpandableMentionTextView expandableMentionTextView8 = this.f139872b;
                            if (expandableMentionTextView8 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            Context context2 = expandableMentionTextView8.getContext();
                            h.f.b.l.b(context2, "");
                            cVar.f124818a = BitmapFactory.decodeResource(context2.getResources(), 2131233934);
                            ExpandableMentionTextView expandableMentionTextView9 = this.f139872b;
                            if (expandableMentionTextView9 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            expandableMentionTextView9.a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar);
                        } else if (subType == 3) {
                            ExpandableMentionTextView expandableMentionTextView10 = this.f139872b;
                            if (expandableMentionTextView10 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            Context context3 = expandableMentionTextView10.getContext();
                            h.f.b.l.b(context3, "");
                            ExpandableMentionTextView expandableMentionTextView11 = this.f139872b;
                            if (expandableMentionTextView11 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            com.ss.android.ugc.aweme.shortvideo.aa.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.aa.c(context3, expandableMentionTextView11);
                            ExpandableMentionTextView expandableMentionTextView12 = this.f139872b;
                            if (expandableMentionTextView12 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            Context context4 = expandableMentionTextView12.getContext();
                            h.f.b.l.b(context4, "");
                            cVar2.f124818a = BitmapFactory.decodeResource(context4.getResources(), 2131233936);
                            ExpandableMentionTextView expandableMentionTextView13 = this.f139872b;
                            if (expandableMentionTextView13 == null) {
                                h.f.b.l.a("mAwemeTitle");
                            }
                            expandableMentionTextView13.a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), cVar2);
                        } else if (subType != 6) {
                        }
                    }
                    ExpandableMentionTextView expandableMentionTextView14 = this.f139872b;
                    if (expandableMentionTextView14 == null) {
                        h.f.b.l.a("mAwemeTitle");
                    }
                    Context context5 = expandableMentionTextView14.getContext();
                    h.f.b.l.b(context5, "");
                    ExpandableMentionTextView expandableMentionTextView15 = this.f139872b;
                    if (expandableMentionTextView15 == null) {
                        h.f.b.l.a("mAwemeTitle");
                    }
                    com.ss.android.ugc.aweme.shortvideo.aa.a aVar = new com.ss.android.ugc.aweme.shortvideo.aa.a(context5, expandableMentionTextView15);
                    ExpandableMentionTextView expandableMentionTextView16 = this.f139872b;
                    if (expandableMentionTextView16 == null) {
                        h.f.b.l.a("mAwemeTitle");
                    }
                    expandableMentionTextView16.a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), aVar);
                }
            }
        }
        ExpandableMentionTextView expandableMentionTextView17 = this.f139872b;
        if (expandableMentionTextView17 == null) {
            h.f.b.l.a("mAwemeTitle");
        }
        expandableMentionTextView17.setTextColor(androidx.core.content.b.c(this.r, R.color.bx));
        MethodCollector.o(2524);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.ss.android.ugc.aweme.tools.draft.d.a] */
    @Override // com.ss.android.ugc.aweme.tools.draft.viewholder.a
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.tools.draft.d.d dVar) {
        com.ss.android.ugc.aweme.tools.draft.d.d dVar2 = dVar;
        h.f.b.l.d(dVar2, "");
        this.f139878h = dVar2;
        if (dVar2 == null) {
            h.f.b.l.a("mData");
        }
        dVar2.f139482e = false;
        com.ss.android.ugc.aweme.tools.draft.d.d dVar3 = this.f139878h;
        if (dVar3 == null) {
            h.f.b.l.a("mData");
        }
        if (dVar3.f139476a) {
            DraftItemView draftItemView = this.o;
            if (draftItemView == null) {
                h.f.b.l.a("mContainerLl");
            }
            draftItemView.a();
            ImageView imageView = this.n;
            if (imageView == null) {
                h.f.b.l.a("mDraftPlay");
            }
            imageView.animate().alpha(0.0f).setDuration(200).start();
        } else {
            DraftItemView draftItemView2 = this.o;
            if (draftItemView2 == null) {
                h.f.b.l.a("mContainerLl");
            }
            draftItemView2.b();
            ImageView imageView2 = this.n;
            if (imageView2 == null) {
                h.f.b.l.a("mDraftPlay");
            }
            imageView2.animate().alpha(1.0f).setDuration(200).start();
            com.ss.android.ugc.aweme.tools.draft.d.d dVar4 = this.f139878h;
            if (dVar4 == null) {
                h.f.b.l.a("mData");
            }
            dVar4.f139482e = false;
        }
        com.ss.android.ugc.aweme.tools.draft.d.d dVar5 = this.f139878h;
        if (dVar5 == null) {
            h.f.b.l.a("mData");
        }
        if (dVar5.f139477b) {
            TextView textView = this.f139882l;
            if (textView == null) {
                h.f.b.l.a("mDraftSize");
            }
            Context context = this.r;
            com.ss.android.ugc.aweme.tools.draft.d.d dVar6 = this.f139878h;
            if (dVar6 == null) {
                h.f.b.l.a("mData");
            }
            long j2 = dVar6.f139483f;
            h.f.b.l.d(context, "");
            double d2 = (double) j2;
            Double.isNaN(d2);
            String string = context.getString(R.string.fpi, Double.valueOf(d2 / 1048576.0d));
            h.f.b.l.b(string, "");
            textView.setText(string);
        }
        AppCompatCheckBox appCompatCheckBox = this.f139875e;
        if (appCompatCheckBox == null) {
            h.f.b.l.a("mCheckBox");
        }
        appCompatCheckBox.setOnCheckedChangeListener(null);
        AppCompatCheckBox appCompatCheckBox2 = this.f139875e;
        if (appCompatCheckBox2 == null) {
            h.f.b.l.a("mCheckBox");
        }
        com.ss.android.ugc.aweme.tools.draft.d.d dVar7 = this.f139878h;
        if (dVar7 == null) {
            h.f.b.l.a("mData");
        }
        appCompatCheckBox2.setChecked(dVar7.f139482e);
        AppCompatCheckBox appCompatCheckBox3 = this.f139875e;
        if (appCompatCheckBox3 == null) {
            h.f.b.l.a("mCheckBox");
        }
        appCompatCheckBox3.setOnCheckedChangeListener(new a(this));
        SimpleDraweeView simpleDraweeView = this.f139874d;
        if (simpleDraweeView == null) {
            h.f.b.l.a("mCover");
        }
        com.ss.android.ugc.aweme.tools.draft.d.d dVar8 = this.f139878h;
        if (dVar8 == null) {
            h.f.b.l.a("mData");
        }
        simpleDraweeView.setTag(((com.ss.android.ugc.aweme.tools.draft.d.c) dVar8).f139480c);
        SimpleDraweeView simpleDraweeView2 = this.f139874d;
        if (simpleDraweeView2 == null) {
            h.f.b.l.a("mCover");
        }
        simpleDraweeView2.setActualImageResource(2131232427);
        com.ss.android.ugc.aweme.tools.draft.d.d dVar9 = this.f139878h;
        if (dVar9 == null) {
            h.f.b.l.a("mData");
        }
        File file = new File(dVar9.f139481d);
        if (file.exists()) {
            Uri fromFile = Uri.fromFile(file);
            SimpleDraweeView simpleDraweeView3 = this.f139874d;
            if (simpleDraweeView3 == null) {
                h.f.b.l.a("mCover");
            }
            com.ss.android.ugc.tools.c.a.a(simpleDraweeView3, fromFile.toString(), -1, -1);
        } else {
            com.ss.android.ugc.aweme.draft.model.c a2 = this.f139879i.a(((com.ss.android.ugc.aweme.tools.draft.d.c) dVar9).f139480c);
            if (a2 == null) {
                bj.b(this.f139871a + ": bindDraftCover -> draft is null");
                com.bytedance.services.apm.api.a.a("queryNull -> " + this.f139871a + " : bindDraftCover");
            } else {
                int dimensionPixelOffset = this.r.getResources().getDimensionPixelOffset(R.dimen.j6);
                k kVar = new k(dimensionPixelOffset, dimensionPixelOffset, Bitmap.Config.ARGB_8888);
                this.s = kVar;
                com.ss.android.ugc.aweme.draft.model.d.a(a2, kVar, new b(this, a2));
            }
        }
        com.ss.android.ugc.aweme.tools.draft.d.d dVar10 = this.f139878h;
        if (dVar10 == null) {
            h.f.b.l.a("mData");
        }
        a(dVar10);
        TextView textView2 = this.f139880j;
        if (textView2 == null) {
            h.f.b.l.a("mAwemeChallenge");
        }
        textView2.setVisibility(8);
        ImageView imageView3 = this.f139881k;
        if (imageView3 == null) {
            h.f.b.l.a("mChallengeIcon");
        }
        imageView3.setVisibility(8);
        RelativeLayout relativeLayout = this.q;
        if (relativeLayout == null) {
            h.f.b.l.a("mDraftListItemLayout");
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        Space space = this.p;
        if (space == null) {
            h.f.b.l.a("mDraftListSpaceTop");
        }
        ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
        int b2 = (int) n.b(this.r, 8.0f);
        int b3 = (int) n.b(this.r, 88.0f);
        if (dVar2.f139490m) {
            layoutParams2.height = b2 * 2;
            b3 += b2;
        } else {
            layoutParams2.height = b2;
        }
        com.ss.android.ugc.aweme.tools.draft.d.d dVar11 = this.f139878h;
        if (dVar11 == null) {
            h.f.b.l.a("mData");
        }
        if (!dVar11.f139489l) {
            View view = this.f139883m;
            if (view == null) {
                h.f.b.l.a("mContentDivider1");
            }
            view.setVisibility(4);
            layoutParams.height = b3 - b2;
        } else {
            View view2 = this.f139883m;
            if (view2 == null) {
                h.f.b.l.a("mContentDivider1");
            }
            view2.setVisibility(0);
            layoutParams.height = b3;
        }
        Space space2 = this.p;
        if (space2 == null) {
            h.f.b.l.a("mDraftListSpaceTop");
        }
        space2.setLayoutParams(layoutParams2);
        RelativeLayout relativeLayout2 = this.q;
        if (relativeLayout2 == null) {
            h.f.b.l.a("mDraftListItemLayout");
        }
        relativeLayout2.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout3 = this.q;
        if (relativeLayout3 == null) {
            h.f.b.l.a("mDraftListItemLayout");
        }
        relativeLayout3.setLayoutParams(layoutParams);
    }

    static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DraftViewHolder f139884a;

        static {
            Covode.recordClassIndex(91419);
        }

        a(DraftViewHolder draftViewHolder) {
            this.f139884a = draftViewHolder;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            bj.b(this.f139884a.f139871a + "click checkBox");
            DraftViewHolder.a(this.f139884a).f139482e = z;
            this.f139884a.f139876f.a(DraftViewHolder.a(this.f139884a), z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DraftViewHolder(View view, com.ss.android.ugc.aweme.tools.draft.f.a aVar, com.ss.android.ugc.aweme.tools.draft.viewmodel.a aVar2) {
        super(view);
        h.f.b.l.d(view, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(aVar2, "");
        this.f139879i = aVar2;
        this.f139876f = aVar;
        Context context = view.getContext();
        h.f.b.l.b(context, "");
        this.r = context;
        View c2 = v.c(view, (int) R.id.q2);
        h.f.b.l.b(c2, "");
        this.f139872b = (ExpandableMentionTextView) c2;
        View c3 = v.c(view, (int) R.id.cgw);
        h.f.b.l.b(c3, "");
        this.f139873c = (ViewGroup) c3;
        View c4 = v.c(view, (int) R.id.eyt);
        h.f.b.l.b(c4, "");
        this.f139882l = (TextView) c4;
        View c5 = v.c(view, (int) R.id.pt);
        h.f.b.l.b(c5, "");
        this.f139880j = (TextView) c5;
        View c6 = v.c(view, (int) R.id.a46);
        h.f.b.l.b(c6, "");
        this.f139881k = (ImageView) c6;
        View c7 = v.c(view, (int) R.id.agf);
        h.f.b.l.b(c7, "");
        this.f139874d = (SimpleDraweeView) c7;
        View c8 = v.c(view, (int) R.id.exg);
        h.f.b.l.b(c8, "");
        this.f139883m = c8;
        View c9 = v.c(view, (int) R.id.apk);
        h.f.b.l.b(c9, "");
        this.n = (ImageView) c9;
        View c10 = v.c(view, (int) R.id.a5_);
        h.f.b.l.b(c10, "");
        this.f139875e = (AppCompatCheckBox) c10;
        View c11 = v.c(view, (int) R.id.ces);
        h.f.b.l.b(c11, "");
        DraftItemView draftItemView = (DraftItemView) c11;
        this.o = draftItemView;
        if (draftItemView == null) {
            h.f.b.l.a("mContainerLl");
        }
        draftItemView.setOnScrollListener(new c(this));
        View c12 = v.c(view, (int) R.id.apj);
        h.f.b.l.b(c12, "");
        this.p = (Space) c12;
        View c13 = v.c(view, (int) R.id.apf);
        h.f.b.l.b(c13, "");
        RelativeLayout relativeLayout = (RelativeLayout) c13;
        this.q = relativeLayout;
        if (relativeLayout == null) {
            h.f.b.l.a("mDraftListItemLayout");
        }
        relativeLayout.setOnClickListener(new f(new d(this)));
        RelativeLayout relativeLayout2 = this.q;
        if (relativeLayout2 == null) {
            h.f.b.l.a("mDraftListItemLayout");
        }
        relativeLayout2.setOnLongClickListener(new e(this));
    }
}
