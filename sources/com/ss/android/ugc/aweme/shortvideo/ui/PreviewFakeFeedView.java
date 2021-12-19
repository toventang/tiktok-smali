package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.AvatarWithBorderView;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.widget.AVTextView;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public final class PreviewFakeFeedView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public AvatarWithBorderView f131127a;

    /* renamed from: b  reason: collision with root package name */
    public CircleImageView f131128b;

    /* renamed from: c  reason: collision with root package name */
    public CircleImageView f131129c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f131130d;

    /* renamed from: e  reason: collision with root package name */
    public TuxTag f131131e;

    /* renamed from: f  reason: collision with root package name */
    public AVTextView f131132f;

    /* renamed from: g  reason: collision with root package name */
    public ExpandableMentionTextView f131133g;

    /* renamed from: h  reason: collision with root package name */
    public LinearLayout f131134h;

    /* renamed from: i  reason: collision with root package name */
    public SmartImageView f131135i;

    /* renamed from: j  reason: collision with root package name */
    public TextView f131136j;

    /* renamed from: k  reason: collision with root package name */
    public LinearLayout f131137k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f131138l;

    /* renamed from: m  reason: collision with root package name */
    public TuxTag f131139m;
    public ConstraintLayout n;
    public LinearLayout o;
    public View p;
    private final h q = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(85930);
    }

    /* access modifiers changed from: package-private */
    public final SafeHandler getUiHandler() {
        return (SafeHandler) this.q.getValue();
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewFakeFeedView f131140a;

        static {
            Covode.recordClassIndex(85931);
        }

        a(PreviewFakeFeedView previewFakeFeedView) {
            this.f131140a = previewFakeFeedView;
        }

        public final void run() {
            this.f131140a.getTvMusic().requestFocus();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PreviewFakeFeedView f131142a;

        static {
            Covode.recordClassIndex(85933);
        }

        c(PreviewFakeFeedView previewFakeFeedView) {
            this.f131142a = previewFakeFeedView;
        }

        public final void run() {
            this.f131142a.getTvMusic().requestFocus();
        }
    }

    static final class d extends m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ PreviewFakeFeedView this$0;

        static {
            Covode.recordClassIndex(85934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(PreviewFakeFeedView previewFakeFeedView) {
            super(0);
            this.this$0 = previewFakeFeedView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0.getLifecycleOwner());
        }
    }

    public final SmartImageView getAnchorIcon() {
        SmartImageView smartImageView = this.f131135i;
        if (smartImageView == null) {
            l.a("anchorIcon");
        }
        return smartImageView;
    }

    public final LinearLayout getAnchorLayout() {
        LinearLayout linearLayout = this.f131134h;
        if (linearLayout == null) {
            l.a("anchorLayout");
        }
        return linearLayout;
    }

    public final TextView getAnchorText() {
        TextView textView = this.f131136j;
        if (textView == null) {
            l.a("anchorText");
        }
        return textView;
    }

    public final ConstraintLayout getBottomTab() {
        ConstraintLayout constraintLayout = this.n;
        if (constraintLayout == null) {
            l.a("bottomTab");
        }
        return constraintLayout;
    }

    public final View getItemView() {
        View view = this.p;
        if (view == null) {
            l.a("itemView");
        }
        return view;
    }

    public final CircleImageView getIvOriginMusicCover() {
        CircleImageView circleImageView = this.f131129c;
        if (circleImageView == null) {
            l.a("ivOriginMusicCover");
        }
        return circleImageView;
    }

    public final LinearLayout getLeftBottomContent() {
        LinearLayout linearLayout = this.o;
        if (linearLayout == null) {
            l.a("leftBottomContent");
        }
        return linearLayout;
    }

    public final AvatarWithBorderView getMAvatarView() {
        AvatarWithBorderView avatarWithBorderView = this.f131127a;
        if (avatarWithBorderView == null) {
            l.a("mAvatarView");
        }
        return avatarWithBorderView;
    }

    public final CircleImageView getMMusicCoverView() {
        CircleImageView circleImageView = this.f131128b;
        if (circleImageView == null) {
            l.a("mMusicCoverView");
        }
        return circleImageView;
    }

    public final LinearLayout getPermissionLL() {
        LinearLayout linearLayout = this.f131137k;
        if (linearLayout == null) {
            l.a("permissionLL");
        }
        return linearLayout;
    }

    public final TuxTag getPermissionTag() {
        TuxTag tuxTag = this.f131139m;
        if (tuxTag == null) {
            l.a("permissionTag");
        }
        return tuxTag;
    }

    public final TextView getPreviewTitle() {
        TextView textView = this.f131138l;
        if (textView == null) {
            l.a("previewTitle");
        }
        return textView;
    }

    public final ExpandableMentionTextView getTvDescription() {
        ExpandableMentionTextView expandableMentionTextView = this.f131133g;
        if (expandableMentionTextView == null) {
            l.a("tvDescription");
        }
        return expandableMentionTextView;
    }

    public final AVTextView getTvMusic() {
        AVTextView aVTextView = this.f131132f;
        if (aVTextView == null) {
            l.a("tvMusic");
        }
        return aVTextView;
    }

    public final TextView getTvName() {
        TextView textView = this.f131130d;
        if (textView == null) {
            l.a("tvName");
        }
        return textView;
    }

    public final TuxTag getTvSocialVideoTagged() {
        TuxTag tuxTag = this.f131131e;
        if (tuxTag == null) {
            l.a("tvSocialVideoTagged");
        }
        return tuxTag;
    }

    public final float getBottomMarginForCaptionSticker() {
        float height = (float) getHeight();
        LinearLayout linearLayout = this.o;
        if (linearLayout == null) {
            l.a("leftBottomContent");
        }
        return height - ((float) linearLayout.getTop());
    }

    public final androidx.lifecycle.m getLifecycleOwner() {
        Context context = getContext();
        while (!(context instanceof androidx.lifecycle.m)) {
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.content.ContextWrapper");
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (androidx.lifecycle.m) context;
    }

    public final void setAnchorIcon(SmartImageView smartImageView) {
        l.d(smartImageView, "");
        this.f131135i = smartImageView;
    }

    public final void setAnchorLayout(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f131134h = linearLayout;
    }

    public final void setAnchorText(TextView textView) {
        l.d(textView, "");
        this.f131136j = textView;
    }

    public final void setBottomTab(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        this.n = constraintLayout;
    }

    public final void setItemView(View view) {
        l.d(view, "");
        this.p = view;
    }

    public final void setIvOriginMusicCover(CircleImageView circleImageView) {
        l.d(circleImageView, "");
        this.f131129c = circleImageView;
    }

    public final void setLeftBottomContent(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.o = linearLayout;
    }

    public final void setMAvatarView(AvatarWithBorderView avatarWithBorderView) {
        l.d(avatarWithBorderView, "");
        this.f131127a = avatarWithBorderView;
    }

    public final void setMMusicCoverView(CircleImageView circleImageView) {
        l.d(circleImageView, "");
        this.f131128b = circleImageView;
    }

    public final void setPermissionLL(LinearLayout linearLayout) {
        l.d(linearLayout, "");
        this.f131137k = linearLayout;
    }

    public final void setPermissionTag(TuxTag tuxTag) {
        l.d(tuxTag, "");
        this.f131139m = tuxTag;
    }

    public final void setPreviewTitle(TextView textView) {
        l.d(textView, "");
        this.f131138l = textView;
    }

    public final void setTvDescription(ExpandableMentionTextView expandableMentionTextView) {
        l.d(expandableMentionTextView, "");
        this.f131133g = expandableMentionTextView;
    }

    public final void setTvMusic(AVTextView aVTextView) {
        l.d(aVTextView, "");
        this.f131132f = aVTextView;
    }

    public final void setTvName(TextView textView) {
        l.d(textView, "");
        this.f131130d = textView;
    }

    public final void setTvSocialVideoTagged(TuxTag tuxTag) {
        l.d(tuxTag, "");
        this.f131131e = tuxTag;
    }

    public final void setBottomMargin(int i2) {
        View view = this.p;
        if (view == null) {
            l.a("itemView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = i2;
        View view2 = this.p;
        if (view2 == null) {
            l.a("itemView");
        }
        view2.setLayoutParams(layoutParams2);
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        public static final b f131141a = new b();

        static {
            Covode.recordClassIndex(85932);
        }

        b() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
            AVTextExtraStruct aVTextExtraStruct2 = (AVTextExtraStruct) obj2;
            l.d(aVTextExtraStruct, "");
            l.d(aVTextExtraStruct2, "");
            return l.a(aVTextExtraStruct.getStart(), aVTextExtraStruct2.getStart());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreviewFakeFeedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String a2;
        UrlModel urlModel;
        l.d(context, "");
        MethodCollector.i(12135);
        View a3 = com.a.a(LayoutInflater.from(getContext()), R.layout.bw, this, false);
        l.b(a3, "");
        this.p = a3;
        if (a3 == null) {
            l.a("itemView");
        }
        View findViewById = a3.findViewById(R.id.fcu);
        l.b(findViewById, "");
        AvatarWithBorderView avatarWithBorderView = (AvatarWithBorderView) findViewById;
        this.f131127a = avatarWithBorderView;
        if (avatarWithBorderView == null) {
            l.a("mAvatarView");
        }
        avatarWithBorderView.setBorderColor(R.color.f159928l);
        View view = this.p;
        if (view == null) {
            l.a("itemView");
        }
        View findViewById2 = view.findViewById(R.id.cpt);
        l.b(findViewById2, "");
        this.f131128b = (CircleImageView) findViewById2;
        View view2 = this.p;
        if (view2 == null) {
            l.a("itemView");
        }
        View findViewById3 = view2.findViewById(R.id.d0c);
        l.b(findViewById3, "");
        this.f131129c = (CircleImageView) findViewById3;
        View view3 = this.p;
        if (view3 == null) {
            l.a("itemView");
        }
        View findViewById4 = view3.findViewById(R.id.f3c);
        l.b(findViewById4, "");
        this.f131130d = (TextView) findViewById4;
        View view4 = this.p;
        if (view4 == null) {
            l.a("itemView");
        }
        View findViewById5 = view4.findViewById(R.id.e7b);
        l.b(findViewById5, "");
        this.f131131e = (TuxTag) findViewById5;
        View view5 = this.p;
        if (view5 == null) {
            l.a("itemView");
        }
        View findViewById6 = view5.findViewById(R.id.f32);
        l.b(findViewById6, "");
        this.f131132f = (AVTextView) findViewById6;
        View view6 = this.p;
        if (view6 == null) {
            l.a("itemView");
        }
        View findViewById7 = view6.findViewById(R.id.d8s);
        l.b(findViewById7, "");
        this.f131133g = (ExpandableMentionTextView) findViewById7;
        View view7 = this.p;
        if (view7 == null) {
            l.a("itemView");
        }
        View findViewById8 = view7.findViewById(R.id.d8l);
        l.b(findViewById8, "");
        this.f131134h = (LinearLayout) findViewById8;
        View view8 = this.p;
        if (view8 == null) {
            l.a("itemView");
        }
        View findViewById9 = view8.findViewById(R.id.ju);
        l.b(findViewById9, "");
        this.f131135i = (SmartImageView) findViewById9;
        View view9 = this.p;
        if (view9 == null) {
            l.a("itemView");
        }
        View findViewById10 = view9.findViewById(R.id.jp);
        l.b(findViewById10, "");
        this.f131136j = (TextView) findViewById10;
        View view10 = this.p;
        if (view10 == null) {
            l.a("itemView");
        }
        View findViewById11 = view10.findViewById(R.id.d8q);
        l.b(findViewById11, "");
        this.f131138l = (TextView) findViewById11;
        View view11 = this.p;
        if (view11 == null) {
            l.a("itemView");
        }
        View findViewById12 = view11.findViewById(R.id.ddm);
        l.b(findViewById12, "");
        this.f131139m = (TuxTag) findViewById12;
        View view12 = this.p;
        if (view12 == null) {
            l.a("itemView");
        }
        View findViewById13 = view12.findViewById(R.id.ddl);
        l.b(findViewById13, "");
        this.o = (LinearLayout) findViewById13;
        View view13 = this.p;
        if (view13 == null) {
            l.a("itemView");
        }
        addView(view13);
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        UrlModel urlModel2 = null;
        if (e2 == null || e2.f() == null) {
            AvatarWithBorderView avatarWithBorderView2 = this.f131127a;
            if (avatarWithBorderView2 == null) {
                l.a("mAvatarView");
            }
            com.ss.android.ugc.tools.c.a.a(avatarWithBorderView2, 2131232324);
        } else {
            AvatarWithBorderView avatarWithBorderView3 = this.f131127a;
            if (avatarWithBorderView3 == null) {
                l.a("mAvatarView");
            }
            UrlModel f2 = e2.f();
            Context context2 = getContext();
            l.b(context2, "");
            int a4 = (int) r.a(context2, 49.0f);
            Context context3 = getContext();
            l.b(context3, "");
            com.ss.android.ugc.tools.c.a.a(avatarWithBorderView3, f2, a4, (int) r.a(context3, 49.0f));
        }
        TextView textView = this.f131130d;
        if (textView == null) {
            l.a("tvName");
        }
        StringBuilder sb = new StringBuilder("@");
        com.ss.android.ugc.aweme.account.model.a e3 = g.a().A().e();
        Resources resources = getResources();
        l.b(resources, "");
        textView.setText(sb.append(com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(e3, resources)).toString());
        CircleImageView circleImageView = this.f131129c;
        if (circleImageView == null) {
            l.a("ivOriginMusicCover");
        }
        if (cVar != null && (urlModel = cVar.coverThumb) != null) {
            urlModel2 = urlModel;
        } else if (e2 != null) {
            urlModel2 = e2.f();
        }
        com.ss.android.ugc.tools.c.a.a(circleImageView, urlModel2, 27, 27);
        CircleImageView circleImageView2 = this.f131128b;
        if (circleImageView2 == null) {
            l.a("mMusicCoverView");
        }
        com.ss.android.ugc.tools.c.a.a(circleImageView2, 2131232322);
        AVTextView aVTextView = this.f131132f;
        if (aVTextView == null) {
            l.a("tvMusic");
        }
        Context context4 = getContext();
        l.b(context4, "");
        com.ss.android.ugc.aweme.account.model.a e4 = g.a().A().e();
        l.d(context4, "");
        com.ss.android.ugc.aweme.shortvideo.c cVar2 = cr.a().f125295a;
        if (cVar2 != null) {
            a2 = cVar2.musicName + " — @" + cVar2.authorName;
        } else {
            a2 = com.ss.android.ugc.aweme.shortvideo.edit.c.a.a(context4, e4);
        }
        aVTextView.setText(a2);
        getUiHandler().post(new a(this));
        MethodCollector.o(12135);
    }

    public final void a(VideoPublishEditModel videoPublishEditModel, String str, UrlModel urlModel, int i2) {
        String str2;
        boolean z;
        ArrayList<InteractionTagUserInfo> arrayList;
        String a2;
        String str3;
        List<AVTextExtraStruct> list;
        String str4;
        MethodCollector.i(11985);
        if (videoPublishEditModel != null) {
            str2 = videoPublishEditModel.title;
        } else {
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ExpandableMentionTextView expandableMentionTextView = this.f131133g;
            if (expandableMentionTextView == null) {
                l.a("tvDescription");
            }
            expandableMentionTextView.setVisibility(0);
            if (videoPublishEditModel != null) {
                str4 = videoPublishEditModel.title;
                list = videoPublishEditModel.structList;
                if (com.ss.android.ugc.aweme.port.in.l.f115658a.e().d() && str4 != null && p.a((CharSequence) str4, (CharSequence) "\n", false)) {
                    l.d(videoPublishEditModel, "");
                    String str5 = videoPublishEditModel.title;
                    l.b(str5, "");
                    String replace = new h.m.l("\n+").replace(str5, " ");
                    List list2 = videoPublishEditModel.structList;
                    l.b(list2, "");
                    List<AVTextExtraStruct> g2 = n.g((Collection) list2);
                    n.a(g2, (Comparator) b.f131141a);
                    int i3 = 0;
                    for (AVTextExtraStruct aVTextExtraStruct : g2) {
                        String substring = str5.substring(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd());
                        l.b(substring, "");
                        int a3 = p.a((CharSequence) replace, substring, i3, false, 4);
                        if (a3 >= 0) {
                            i3 = a3 + substring.length();
                            aVTextExtraStruct.setStart(a3);
                            aVTextExtraStruct.setEnd(i3);
                        }
                    }
                    Pair pair = new Pair(g2, replace);
                    list = (List) pair.first;
                    str4 = (String) pair.second;
                }
            } else {
                str4 = null;
                list = null;
            }
            ExpandableMentionTextView expandableMentionTextView2 = this.f131133g;
            if (expandableMentionTextView2 == null) {
                l.a("tvDescription");
            }
            expandableMentionTextView2.setText(str4);
            ExpandableMentionTextView expandableMentionTextView3 = this.f131133g;
            if (expandableMentionTextView3 == null) {
                l.a("tvDescription");
            }
            expandableMentionTextView3.setTextColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
            ExpandableMentionTextView expandableMentionTextView4 = this.f131133g;
            if (expandableMentionTextView4 == null) {
                l.a("tvDescription");
            }
            expandableMentionTextView4.setSpanColor(androidx.core.content.b.c(getContext(), R.color.f159928l));
            if (list != null) {
                for (AVTextExtraStruct aVTextExtraStruct2 : list) {
                    l.b(aVTextExtraStruct2, "");
                    if (aVTextExtraStruct2.getType() == 0) {
                        int subType = aVTextExtraStruct2.getSubType();
                        if (subType == 1) {
                            Context context = getContext();
                            l.b(context, "");
                            ExpandableMentionTextView expandableMentionTextView5 = this.f131133g;
                            if (expandableMentionTextView5 == null) {
                                l.a("tvDescription");
                            }
                            com.ss.android.ugc.aweme.shortvideo.aa.a aVar = new com.ss.android.ugc.aweme.shortvideo.aa.a(context, expandableMentionTextView5);
                            ExpandableMentionTextView expandableMentionTextView6 = this.f131133g;
                            if (expandableMentionTextView6 == null) {
                                l.a("tvDescription");
                            }
                            expandableMentionTextView6.a(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd(), aVar);
                        } else if (subType == 2) {
                            Context context2 = getContext();
                            l.b(context2, "");
                            ExpandableMentionTextView expandableMentionTextView7 = this.f131133g;
                            if (expandableMentionTextView7 == null) {
                                l.a("tvDescription");
                            }
                            com.ss.android.ugc.aweme.shortvideo.aa.c cVar = new com.ss.android.ugc.aweme.shortvideo.aa.c(context2, expandableMentionTextView7);
                            Context context3 = getContext();
                            l.b(context3, "");
                            cVar.f124818a = BitmapFactory.decodeResource(context3.getResources(), 2131233935);
                            ExpandableMentionTextView expandableMentionTextView8 = this.f131133g;
                            if (expandableMentionTextView8 == null) {
                                l.a("tvDescription");
                            }
                            expandableMentionTextView8.a(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd(), cVar);
                        } else if (subType == 3) {
                            Context context4 = getContext();
                            l.b(context4, "");
                            ExpandableMentionTextView expandableMentionTextView9 = this.f131133g;
                            if (expandableMentionTextView9 == null) {
                                l.a("tvDescription");
                            }
                            com.ss.android.ugc.aweme.shortvideo.aa.c cVar2 = new com.ss.android.ugc.aweme.shortvideo.aa.c(context4, expandableMentionTextView9);
                            Context context5 = getContext();
                            l.b(context5, "");
                            cVar2.f124818a = BitmapFactory.decodeResource(context5.getResources(), 2131233937);
                            ExpandableMentionTextView expandableMentionTextView10 = this.f131133g;
                            if (expandableMentionTextView10 == null) {
                                l.a("tvDescription");
                            }
                            expandableMentionTextView10.a(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd(), cVar2);
                        }
                    }
                }
            }
        }
        if (!(str == null || str.length() == 0 || urlModel == null)) {
            LinearLayout linearLayout = this.f131134h;
            if (linearLayout == null) {
                l.a("anchorLayout");
            }
            linearLayout.setVisibility(0);
            TextView textView = this.f131136j;
            if (textView == null) {
                l.a("anchorText");
            }
            textView.setText(str);
            List<String> urlList = urlModel.getUrlList();
            if (urlList == null || (str3 = (String) n.g((List) urlList)) == null) {
                str3 = "";
            }
            v a4 = com.bytedance.lighten.a.r.a(str3);
            SmartImageView smartImageView = this.f131135i;
            if (smartImageView == null) {
                l.a("anchorIcon");
            }
            a4.E = smartImageView;
            a4.c();
        }
        if (i2 == 1) {
            TuxTag tuxTag = this.f131139m;
            if (tuxTag == null) {
                l.a("permissionTag");
            }
            tuxTag.setVisibility(0);
            TuxTag tuxTag2 = this.f131139m;
            if (tuxTag2 == null) {
                l.a("permissionTag");
            }
            Context context6 = getContext();
            l.b(context6, "");
            tuxTag2.setText(context6.getResources().getText(R.string.evo));
            TuxTag tuxTag3 = this.f131139m;
            if (tuxTag3 == null) {
                l.a("permissionTag");
            }
            tuxTag3.setTagIcon(Integer.valueOf((int) R.raw.icon_lock_fill));
        } else if (i2 == 2) {
            TuxTag tuxTag4 = this.f131139m;
            if (tuxTag4 == null) {
                l.a("permissionTag");
            }
            tuxTag4.setVisibility(0);
            TuxTag tuxTag5 = this.f131139m;
            if (tuxTag5 == null) {
                l.a("permissionTag");
            }
            Context context7 = getContext();
            l.b(context7, "");
            tuxTag5.setText(context7.getResources().getText(R.string.c1r));
            TuxTag tuxTag6 = this.f131139m;
            if (tuxTag6 == null) {
                l.a("permissionTag");
            }
            tuxTag6.setTagIcon(Integer.valueOf((int) R.raw.icon_person_arrow_left_right_fill));
        }
        Context context8 = getContext();
        l.b(context8, "");
        Integer a5 = com.bytedance.tux.h.d.a(context8, R.attr.ac);
        if (a5 != null) {
            int intValue = a5.intValue();
            TuxTag tuxTag7 = this.f131139m;
            if (tuxTag7 == null) {
                l.a("permissionTag");
            }
            tuxTag7.setTagBackgroundColor(intValue);
            if (videoPublishEditModel == null || (arrayList = videoPublishEditModel.tagUserList) == null || !(!arrayList.isEmpty())) {
                MethodCollector.o(11985);
                return;
            }
            TuxTag tuxTag8 = this.f131131e;
            if (tuxTag8 == null) {
                l.a("tvSocialVideoTagged");
            }
            tuxTag8.setVisibility(0);
            TuxTag tuxTag9 = this.f131131e;
            if (tuxTag9 == null) {
                l.a("tvSocialVideoTagged");
            }
            tuxTag9.setTagIcon(Integer.valueOf((int) R.raw.icon_person_fill));
            TuxTag tuxTag10 = this.f131131e;
            if (tuxTag10 == null) {
                l.a("tvSocialVideoTagged");
            }
            if (arrayList.size() == 1) {
                Boolean b2 = g.a().y().b();
                l.b(b2, "");
                if (b2.booleanValue()) {
                    a2 = arrayList.get(0).getNickname();
                } else {
                    a2 = arrayList.get(0).getUniqueId();
                }
            } else {
                Context context9 = getContext();
                l.b(context9, "");
                String string = context9.getResources().getString(R.string.gc1);
                l.b(string, "");
                a2 = com.a.a(string, Arrays.copyOf(new Object[]{"", Integer.valueOf(arrayList.size())}, 2));
                l.b(a2, "");
            }
            tuxTag10.setText(a2);
            MethodCollector.o(11985);
            return;
        }
        MethodCollector.o(11985);
    }
}
