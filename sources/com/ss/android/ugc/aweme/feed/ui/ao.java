package com.ss.android.ugc.aweme.feed.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class ao extends an {
    private MutualRelationView A;
    public VideoTitleFollowBtn p;
    View q;
    String r = "";
    public int s;
    public int t;
    public int u;
    private View v;
    private TuxTextView w;
    private MutualRelationView x;
    private View y;
    private TuxTextView z;

    static {
        Covode.recordClassIndex(59883);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f94264a;

        static {
            Covode.recordClassIndex(59887);
        }

        b(ao aoVar) {
            this.f94264a = aoVar;
        }

        public final void run() {
            int i2;
            ao aoVar = this.f94264a;
            View view = aoVar.f94238b;
            if (view != null) {
                i2 = view.getHeight();
            } else {
                i2 = 0;
            }
            aoVar.t = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f94265a;

        static {
            Covode.recordClassIndex(59888);
        }

        c(ao aoVar) {
            this.f94265a = aoVar;
        }

        public final void run() {
            int i2;
            ao aoVar = this.f94265a;
            TextView textView = aoVar.f94237a;
            if (textView != null) {
                i2 = textView.getHeight();
            } else {
                i2 = 0;
            }
            aoVar.s = i2;
            ao aoVar2 = this.f94265a;
            aoVar2.u = aoVar2.t - this.f94265a.s;
        }
    }

    private final void d() {
        View view = this.f94238b;
        if (view != null) {
            view.post(new b(this));
        }
        TextView textView = this.f94237a;
        if (textView != null) {
            textView.post(new c(this));
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f94267a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowStatus f94268b;

        static {
            Covode.recordClassIndex(59890);
        }

        e(ao aoVar, FollowStatus followStatus) {
            this.f94267a = aoVar;
            this.f94268b = followStatus;
        }

        public final void run() {
            if (!TextUtils.isEmpty(this.f94268b.userId) && TextUtils.equals(ac.a(this.f94267a.f94242f), this.f94268b.userId) && this.f94268b.followStatus == 1) {
                VideoTitleFollowBtn videoTitleFollowBtn = this.f94267a.p;
                if (videoTitleFollowBtn != null) {
                    videoTitleFollowBtn.a(this.f94268b.followStatus, this.f94268b.followerStatus);
                }
                ao aoVar = this.f94267a;
                String str = aoVar.r;
                if (str != null) {
                    bm.a(str);
                }
                if (aoVar.u > 0) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    l.b(ofFloat, "");
                    ofFloat.setStartDelay(200);
                    ofFloat.setDuration(300L);
                    ofFloat.addUpdateListener(new d(aoVar));
                    ofFloat.start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f94262a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ao f94263b;

        static {
            Covode.recordClassIndex(59886);
        }

        a(Object obj, ao aoVar) {
            this.f94262a = obj;
            this.f94263b = aoVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94263b.c();
        }
    }

    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ao f94266a;

        static {
            Covode.recordClassIndex(59889);
        }

        d(ao aoVar) {
            this.f94266a = aoVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ao aoVar = this.f94266a;
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            int a2 = h.g.a.a(255.0f * floatValue);
            int i2 = (int) (((float) aoVar.t) - ((1.0f - floatValue) * ((float) aoVar.u)));
            View view = aoVar.f94238b;
            if (view != null) {
                Drawable background = view.getBackground();
                l.b(background, "");
                background.setAlpha(a2);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i2;
                view.setLayoutParams(layoutParams);
                if (floatValue == 0.0f) {
                    view.setBackground(new ColorDrawable(androidx.core.content.b.c(aoVar.f94249m, R.color.c9)));
                }
            }
            TextView textView = aoVar.f94237a;
            if (textView != null) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                int b2 = (int) (n.b(aoVar.f94249m, 8.0f) * floatValue);
                if (!gb.a(aoVar.f94249m)) {
                    layoutParams3.leftMargin = b2;
                } else {
                    layoutParams3.rightMargin = b2;
                }
                layoutParams3.topMargin = b2;
                textView.setLayoutParams(layoutParams3);
            }
            VideoTitleFollowBtn videoTitleFollowBtn = aoVar.p;
            if (videoTitleFollowBtn != null) {
                videoTitleFollowBtn.setAlpha(floatValue);
                if (floatValue == 0.0f) {
                    videoTitleFollowBtn.setVisibility(8);
                }
            }
            View view2 = aoVar.q;
            if (view2 != null) {
                view2.setAlpha(floatValue);
            }
        }
    }

    private final void b(HashMap<String, Object> hashMap) {
        View view;
        float f2;
        String str;
        int i2;
        InteractionTagInfo interactionTagInfo;
        List<InteractionTagUserInfo> taggedUsers;
        InteractionTagInfo interactionTagInfo2;
        float f3;
        TextPaint paint;
        Object obj = hashMap.get("social_video_tagged_state");
        if (obj != null && g.b()) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            if (!(TextUtils.isEmpty((String) obj) || 1 == 0 || (view = this.y) == null)) {
                TuxTextView tuxTextView = this.z;
                if (tuxTextView != null) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    tuxTextView.setText((String) obj);
                }
                TuxTextView tuxTextView2 = this.z;
                float f4 = 0.0f;
                if (tuxTextView2 == null || (paint = tuxTextView2.getPaint()) == null) {
                    f2 = 0.0f;
                } else {
                    f2 = paint.measureText((String) obj);
                }
                Aweme aweme = this.f94242f;
                if (aweme == null || (interactionTagInfo2 = aweme.getInteractionTagInfo()) == null || interactionTagInfo2.getInterestLevel() != InteractionTagInterestLevel.HIGH.getLevel()) {
                    MutualRelationView mutualRelationView = this.A;
                    if (mutualRelationView != null) {
                        mutualRelationView.setVisibility(8);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    List<InteractionTagUserInfo> taggedUsers2 = interactionTagInfo2.getTaggedUsers();
                    if (taggedUsers2 != null) {
                        ArrayList<InteractionTagUserInfo> arrayList2 = new ArrayList();
                        for (T t2 : taggedUsers2) {
                            if (t2.getInterestLevel() == InteractionTagInterestLevel.HIGH.getLevel()) {
                                arrayList2.add(t2);
                            }
                        }
                        for (InteractionTagUserInfo interactionTagUserInfo : arrayList2) {
                            arrayList.add(InteractionTagInfoKt.toMutualUser(interactionTagUserInfo));
                            if (arrayList.size() == 2) {
                                break;
                            }
                        }
                    }
                    if (arrayList.size() > 0) {
                        Context context = this.f94249m;
                        if (arrayList.size() == 1) {
                            f3 = 18.0f;
                        } else {
                            f3 = 31.0f;
                        }
                        f4 = n.b(context, f3);
                        MutualRelationView mutualRelationView2 = this.A;
                        if (mutualRelationView2 != null) {
                            mutualRelationView2.setVisibility(0);
                        }
                        MutualRelationView mutualRelationView3 = this.A;
                        if (mutualRelationView3 != null) {
                            mutualRelationView3.a(new MutualStruct(0, arrayList.size(), arrayList), 4);
                        }
                        a("high_interest");
                    } else {
                        MutualRelationView mutualRelationView4 = this.A;
                        if (mutualRelationView4 != null) {
                            mutualRelationView4.setVisibility(8);
                        }
                    }
                }
                float b2 = f2 + f4 + b();
                if (b2 > a()) {
                    a("low_interest");
                    MutualRelationView mutualRelationView5 = this.A;
                    if (mutualRelationView5 != null) {
                        mutualRelationView5.setVisibility(8);
                    }
                    if (b2 - a() > f4) {
                        Aweme aweme2 = this.f94242f;
                        if (aweme2 == null || (interactionTagInfo = aweme2.getInteractionTagInfo()) == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null) {
                            i2 = 1;
                        } else {
                            i2 = taggedUsers.size();
                        }
                        TuxTextView tuxTextView3 = this.z;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setText(String.valueOf(i2));
                        }
                    }
                }
                view.setVisibility(0);
                view.setOnClickListener(new a(obj, this));
                HashMap<String, String> hashMap2 = this.n;
                if (hashMap2 != null) {
                    Aweme aweme3 = this.f94242f;
                    if (aweme3 == null || (str = aweme3.getAid()) == null) {
                        str = "";
                    }
                    hashMap2.put(str, this.f94245i);
                }
                if (this.f94247k && !this.f94248l) {
                    this.f94248l = true;
                    a(this.f94242f);
                    return;
                }
                return;
            }
        }
        View view2 = this.y;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.an
    public final void a(HashMap<String, Object> hashMap) {
        Aweme aweme;
        MatchedFriendStruct matchedFriendStruct;
        l.d(hashMap, "");
        super.a(hashMap);
        Object obj = hashMap.get("is_need_show_relation_view");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((Boolean) obj).booleanValue()) {
            User user = (User) hashMap.get("author_state");
            if (user != null && (aweme = (Aweme) hashMap.get("aweme_state")) != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                Integer a2 = com.bytedance.tux.h.d.a(this.f94249m, R.attr.a4);
                if (a2 != null) {
                    gradientDrawable.setColor(a2.intValue());
                }
                gradientDrawable.setCornerRadius(n.b(this.f94249m, 4.0f));
                View view = this.f94238b;
                if (view != null) {
                    view.setBackground(gradientDrawable);
                    view.getLayoutParams().height = -2;
                }
                TextView textView = this.f94237a;
                if (textView != null) {
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    int b2 = (int) n.b(this.f94249m, 8.0f);
                    if (!gb.a(this.f94249m)) {
                        layoutParams2.leftMargin = b2;
                    } else {
                        layoutParams2.rightMargin = b2;
                    }
                    layoutParams2.topMargin = b2;
                    textView.setLayoutParams(layoutParams2);
                }
                View view2 = this.q;
                if (view2 != null) {
                    view2.setVisibility(0);
                    view2.setAlpha(1.0f);
                }
                if (aweme.getMutualRelation() != null) {
                    TuxTextView tuxTextView = this.w;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                    }
                    MutualRelationView mutualRelationView = this.x;
                    if (mutualRelationView != null) {
                        mutualRelationView.setTextColor(androidx.core.content.b.c(this.f94249m, R.color.a9));
                        mutualRelationView.setDarkMode(true);
                        mutualRelationView.setVisibility(0);
                        mutualRelationView.a(aweme.getMutualRelation(), com.ss.android.ugc.aweme.friends.e.e());
                    }
                } else {
                    User author = aweme.getAuthor();
                    if (author != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && matchedFriendStruct.getExternalRecommendReasonStruct() != null) {
                        TuxTextView tuxTextView2 = this.w;
                        if (tuxTextView2 != null) {
                            com.ss.android.ugc.aweme.social.ext.a.a(tuxTextView2, null, aweme, Integer.valueOf(tuxTextView2.getMaxWidth()), 1);
                        }
                    } else if (aweme.getHybridLabels() != null && aweme.getHybridLabels().size() > 0) {
                        TuxTextView tuxTextView3 = this.w;
                        if (tuxTextView3 != null) {
                            tuxTextView3.setVisibility(0);
                            tuxTextView3.setText(aweme.getHybridLabels().get(0).getText());
                        }
                        MutualRelationView mutualRelationView2 = this.x;
                        if (mutualRelationView2 != null) {
                            mutualRelationView2.setVisibility(8);
                        }
                    }
                }
                VideoTitleFollowBtn videoTitleFollowBtn = this.p;
                if (videoTitleFollowBtn != null) {
                    videoTitleFollowBtn.a(user.getFollowStatus(), user.getFollowerStatus());
                    videoTitleFollowBtn.setVisibility(0);
                    videoTitleFollowBtn.setAlpha(1.0f);
                }
                d();
                bm.a(aweme.getAid(), true);
                b(hashMap);
                return;
            }
            return;
        }
        View view3 = this.f94238b;
        if (view3 != null) {
            view3.setBackground(new ColorDrawable(androidx.core.content.b.c(this.f94249m, R.color.c9)));
        }
        TextView textView2 = this.f94237a;
        if (textView2 != null) {
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
            int b3 = (int) n.b(this.f94249m, 0.0f);
            if (!gb.a(this.f94249m)) {
                layoutParams4.leftMargin = b3;
            } else {
                layoutParams4.rightMargin = b3;
            }
            layoutParams4.topMargin = b3;
            textView2.setLayoutParams(layoutParams4);
        }
        View view4 = this.q;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        VideoTitleFollowBtn videoTitleFollowBtn2 = this.p;
        if (videoTitleFollowBtn2 != null) {
            videoTitleFollowBtn2.setVisibility(8);
        }
        bm.a(this.r, false);
        View view5 = this.y;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        a(hashMap, false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.an
    public final void a(VideoItemParams videoItemParams, HashMap<String, Object> hashMap) {
        Aweme aweme;
        AwemeRelationRecommendModel relationRecommendInfo;
        Aweme aweme2;
        Aweme aweme3;
        List<AwemeHybridLabelModel> hybridLabels;
        l.d(hashMap, "");
        super.a(videoItemParams, hashMap);
        Aweme aweme4 = this.f94242f;
        String str = null;
        if (aweme4 != null) {
            str = aweme4.getAid();
        }
        this.r = str;
        User user = (User) hashMap.get("author_state");
        boolean z2 = false;
        if (!(bm.b(this.r) || (aweme = this.f94242f) == null || (relationRecommendInfo = aweme.getRelationRecommendInfo()) == null || relationRecommendInfo.getRecType() == null || ((((aweme2 = this.f94242f) == null || aweme2.getMutualRelation() == null) && ((aweme3 = this.f94242f) == null || (hybridLabels = aweme3.getHybridLabels()) == null || hybridLabels.size() <= 0)) || !hh.b() || user == null || user.getFollowStatus() != 0))) {
            z2 = true;
        }
        hashMap.put("is_need_show_relation_view", Boolean.valueOf(z2));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ao(View view, View.OnTouchListener onTouchListener, Context context, HashMap<String, String> hashMap) {
        super(view, onTouchListener, context, hashMap);
        View view2;
        View view3;
        View view4;
        MutualRelationView mutualRelationView;
        TuxTextView tuxTextView;
        VideoTitleFollowBtn videoTitleFollowBtn;
        TuxTextView tuxTextView2;
        MutualRelationView mutualRelationView2;
        View findViewById;
        l.d(context, "");
        View view5 = null;
        if (view != null) {
            view2 = view.findViewById(R.id.doz);
        } else {
            view2 = null;
        }
        this.f94238b = view2;
        if (view != null) {
            view3 = view.findViewById(R.id.cgv);
        } else {
            view3 = null;
        }
        this.v = view3;
        if (view != null) {
            view4 = view.findViewById(R.id.cga);
        } else {
            view4 = null;
        }
        this.q = view4;
        if (view != null) {
            mutualRelationView = (MutualRelationView) view.findViewById(R.id.crw);
        } else {
            mutualRelationView = null;
        }
        this.x = mutualRelationView;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.f5p);
        } else {
            tuxTextView = null;
        }
        this.w = tuxTextView;
        if (view != null) {
            videoTitleFollowBtn = (VideoTitleFollowBtn) view.findViewById(R.id.yf);
        } else {
            videoTitleFollowBtn = null;
        }
        this.p = videoTitleFollowBtn;
        if (videoTitleFollowBtn != null) {
            videoTitleFollowBtn.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.feed.ui.ao.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ao f94260a;

                static {
                    Covode.recordClassIndex(59884);
                }

                {
                    this.f94260a = r1;
                }

                public final void onClick(View view) {
                    Aweme aweme;
                    User author;
                    ClickAgent.onClick(view);
                    ao aoVar = this.f94260a;
                    if (aoVar.f94242f != null && (aweme = aoVar.f94242f) != null) {
                        DataCenter dataCenter = aoVar.f94243g;
                        if (dataCenter != null) {
                            dataCenter.a("VIDEO_CANCEL_REPORT_SKIP_BEHAVIOR", aweme.getAid());
                        }
                        if (view != null && view.getVisibility() == 0 && !com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme) && !aweme.isDelete() && (author = aweme.getAuthor()) != null) {
                            String uid = author.getUid();
                            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                            l.b(g2, "");
                            if (!TextUtils.equals(uid, g2.getCurUserId())) {
                                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aa(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.Y(aweme)) {
                                    com.ss.android.ugc.aweme.commercialize.g.a().a(aoVar.f94249m, aweme, "plus_sign");
                                }
                                f fVar = f.a.f68431a;
                                l.b(fVar, "");
                                if (!fVar.c()) {
                                    new com.ss.android.ugc.aweme.tux.a.i.a(aoVar.f94249m).a(R.string.de8).a();
                                } else if (aoVar.f94243g != null && author.getFollowStatus() == 0) {
                                    ag agVar = new ag(12, aweme);
                                    agVar.n = "card_button";
                                    DataCenter dataCenter2 = aoVar.f94243g;
                                    if (dataCenter2 != null) {
                                        dataCenter2.a("feed_internal_event", agVar);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        View view6 = this.f94238b;
        if (view6 != null) {
            view6.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.feed.ui.ao.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ ao f94261a;

                static {
                    Covode.recordClassIndex(59885);
                }

                {
                    this.f94261a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    DataCenter dataCenter = this.f94261a.f94243g;
                    if (dataCenter != null) {
                        dataCenter.a("title_view_click", (Object) null);
                    }
                }
            });
        }
        d();
        if (view != null) {
            tuxTextView2 = (TuxTextView) view.findViewById(R.id.e76);
        } else {
            tuxTextView2 = null;
        }
        this.z = tuxTextView2;
        if (view == null || (mutualRelationView2 = (MutualRelationView) view.findViewById(R.id.e75)) == null) {
            mutualRelationView2 = null;
        } else {
            mutualRelationView2.setSocialVideoTag(true);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            mutualRelationView2.a(a2, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        }
        this.A = mutualRelationView2;
        if (!(view == null || (findViewById = view.findViewById(R.id.e77)) == null)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(n.b(context, 2.0f));
            Integer a3 = com.bytedance.tux.h.d.a(context, R.attr.a9);
            if (a3 != null) {
                gradientDrawable.setColor(a3.intValue());
            }
            findViewById.setBackground(gradientDrawable);
            view5 = findViewById;
        }
        this.y = view5;
    }
}
