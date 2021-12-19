package com.ss.android.ugc.aweme.upvote.detail.bubble;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.upvote.detail.bubble.a;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f142087a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(92856);
    }

    public static final class d implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C3786a f142090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f142091b;

        static {
            Covode.recordClassIndex(92860);
        }

        public final void onAnimationEnd(Animator animator) {
            l.c(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.c(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.c(animator, "");
        }

        public final void onAnimationCancel(Animator animator) {
            l.c(animator, "");
            this.f142090a.f142082a.setAlpha(1.0f);
            this.f142090a.f142082a.setTranslationY(this.f142091b);
        }

        public d(a.C3786a aVar, float f2) {
            this.f142090a = aVar;
            this.f142091b = f2;
        }
    }

    public static final class f implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C3786a f142094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f142095b;

        static {
            Covode.recordClassIndex(92862);
        }

        public final void onAnimationEnd(Animator animator) {
            l.c(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.c(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.c(animator, "");
        }

        public final void onAnimationCancel(Animator animator) {
            l.c(animator, "");
            this.f142094a.f142083b.setAlpha(0.0f);
            this.f142094a.f142083b.setTranslationY(this.f142095b);
        }

        public f(a.C3786a aVar, float f2) {
            this.f142094a = aVar;
            this.f142095b = f2;
        }
    }

    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C3786a f142088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f142089b;

        static {
            Covode.recordClassIndex(92859);
        }

        c(a.C3786a aVar, float f2) {
            this.f142088a = aVar;
            this.f142089b = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f142088a.f142082a.setAlpha(1.0f - floatValue);
            this.f142088a.f142082a.setTranslationY(this.f142089b - (floatValue * ((float) a.f142070e)));
        }
    }

    static final class e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.C3786a f142092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f142093b;

        static {
            Covode.recordClassIndex(92861);
        }

        e(a.C3786a aVar, float f2) {
            this.f142092a = aVar;
            this.f142093b = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            this.f142092a.f142083b.setAlpha(floatValue);
            this.f142092a.f142083b.setTranslationY(this.f142093b + ((1.0f - floatValue) * ((float) a.f142070e)));
        }
    }

    public static void a(AvatarImageView avatarImageView, UrlModel urlModel) {
        if (urlModel != null) {
            com.ss.android.ugc.aweme.base.e.a(avatarImageView, urlModel);
        } else {
            avatarImageView.setActualImageResource(R.raw.icon_color_default_avatar);
        }
        avatarImageView.setVisibility(0);
    }

    public static void a(UpvoteBubbleView upvoteBubbleView, h hVar) {
        l.d(upvoteBubbleView, "");
        l.d(hVar, "");
        upvoteBubbleView.setAvatar(new a(hVar));
        String text = hVar.getText();
        if (text == null || text.length() == 0) {
            a(upvoteBubbleView, hVar.getUser());
        } else {
            upvoteBubbleView.a(true, hVar.getText(), null);
        }
    }

    private static void a(UpvoteBubbleView upvoteBubbleView, User user) {
        String a2;
        String str = "";
        if (in.g(user)) {
            String string = upvoteBubbleView.getContext().getString(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f98), Integer.valueOf((int) R.string.fdh))).intValue());
            l.b(string, str);
            upvoteBubbleView.a(false, string, null);
            return;
        }
        String string2 = upvoteBubbleView.getContext().getString(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f97), Integer.valueOf((int) R.string.fdg))).intValue());
        l.b(string2, str);
        if (!(user == null || (a2 = in.a(user, false)) == null)) {
            str = a2;
        }
        upvoteBubbleView.a(false, string2, str);
    }

    static final class a extends m implements q<AvatarImageView, AvatarImageView, AvatarImageView, z> {
        final /* synthetic */ h $upvoteStruct;

        static {
            Covode.recordClassIndex(92857);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(3);
            this.$upvoteStruct = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(AvatarImageView avatarImageView, AvatarImageView avatarImageView2, AvatarImageView avatarImageView3) {
            UrlModel urlModel;
            AvatarImageView avatarImageView4 = avatarImageView;
            AvatarImageView avatarImageView5 = avatarImageView2;
            AvatarImageView avatarImageView6 = avatarImageView3;
            l.d(avatarImageView4, "");
            l.d(avatarImageView5, "");
            l.d(avatarImageView6, "");
            avatarImageView5.setVisibility(8);
            avatarImageView6.setVisibility(8);
            User user = this.$upvoteStruct.getUser();
            if (user != null) {
                urlModel = user.getAvatarThumb();
            } else {
                urlModel = null;
            }
            b.a(avatarImageView4, urlModel);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.b$b  reason: collision with other inner class name */
    static final class C3788b extends m implements q<AvatarImageView, AvatarImageView, AvatarImageView, z> {
        final /* synthetic */ int $total;
        final /* synthetic */ List $upvoteList;

        static {
            Covode.recordClassIndex(92858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3788b(int i2, List list) {
            super(3);
            this.$total = i2;
            this.$upvoteList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(AvatarImageView avatarImageView, AvatarImageView avatarImageView2, AvatarImageView avatarImageView3) {
            User user;
            UrlModel urlModel;
            User user2;
            User user3;
            UrlModel urlModel2;
            UrlModel urlModel3;
            User user4;
            User user5;
            User user6;
            AvatarImageView avatarImageView4 = avatarImageView;
            AvatarImageView avatarImageView5 = avatarImageView2;
            AvatarImageView avatarImageView6 = avatarImageView3;
            l.d(avatarImageView4, "");
            l.d(avatarImageView5, "");
            l.d(avatarImageView6, "");
            int i2 = this.$total;
            UrlModel urlModel4 = null;
            if (i2 == 1) {
                avatarImageView6.setVisibility(8);
                avatarImageView5.setVisibility(8);
                h hVar = (h) n.b(this.$upvoteList, 0);
                if (!(hVar == null || (user = hVar.getUser()) == null)) {
                    urlModel4 = user.getAvatarThumb();
                }
                b.a(avatarImageView4, urlModel4);
            } else if (i2 != 2) {
                h hVar2 = (h) n.b(this.$upvoteList, 0);
                if (hVar2 == null || (user6 = hVar2.getUser()) == null) {
                    urlModel2 = null;
                } else {
                    urlModel2 = user6.getAvatarThumb();
                }
                b.a(avatarImageView4, urlModel2);
                h hVar3 = (h) n.b(this.$upvoteList, 1);
                if (hVar3 == null || (user5 = hVar3.getUser()) == null) {
                    urlModel3 = null;
                } else {
                    urlModel3 = user5.getAvatarThumb();
                }
                b.a(avatarImageView5, urlModel3);
                h hVar4 = (h) n.b(this.$upvoteList, 2);
                if (!(hVar4 == null || (user4 = hVar4.getUser()) == null)) {
                    urlModel4 = user4.getAvatarThumb();
                }
                b.a(avatarImageView6, urlModel4);
            } else {
                avatarImageView6.setVisibility(8);
                h hVar5 = (h) n.b(this.$upvoteList, 0);
                if (hVar5 == null || (user3 = hVar5.getUser()) == null) {
                    urlModel = null;
                } else {
                    urlModel = user3.getAvatarThumb();
                }
                b.a(avatarImageView4, urlModel);
                h hVar6 = (h) n.b(this.$upvoteList, 1);
                if (!(hVar6 == null || (user2 = hVar6.getUser()) == null)) {
                    urlModel4 = user2.getAvatarThumb();
                }
                b.a(avatarImageView5, urlModel4);
            }
            return z.f158842a;
        }
    }

    public static void a(UpvoteBubbleView upvoteBubbleView, List<h> list, int i2) {
        l.d(upvoteBubbleView, "");
        l.d(list, "");
        upvoteBubbleView.setAvatar(new C3788b(i2, list));
        User user = null;
        if (i2 == 1) {
            h hVar = (h) n.b((List) list, 0);
            if (hVar != null) {
                user = hVar.getUser();
            }
            a(upvoteBubbleView, user);
            return;
        }
        String quantityString = upvoteBubbleView.getResources().getQuantityString(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.plurals.h8), Integer.valueOf((int) R.plurals.he))).intValue(), i2);
        l.b(quantityString, "");
        String a2 = com.a.a(quantityString, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
        l.b(a2, "");
        upvoteBubbleView.a(false, a2, null);
    }
}
