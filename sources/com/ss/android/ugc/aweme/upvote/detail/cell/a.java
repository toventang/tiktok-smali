package com.ss.android.ugc.aweme.upvote.detail.cell;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.translation.a.c;
import com.ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.ss.android.ugc.aweme.upvote.c.h;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;

public final class a implements com.ss.android.ugc.aweme.translation.ui.a {

    /* renamed from: a  reason: collision with root package name */
    h f142104a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxTextView f142105b;

    /* renamed from: c  reason: collision with root package name */
    public final UpvoteDetailPanelViewModel f142106c;

    static {
        Covode.recordClassIndex(92886);
    }

    @Override // com.ss.android.ugc.aweme.translation.ui.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.translation.ui.a
    public final void a(c cVar) {
        String str;
        if (cVar != null && (str = cVar.f141015a) != null) {
            h hVar = this.f142104a;
            if (hVar == null) {
                l.a("upvote");
            }
            a(str, hVar.getCreateTime());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.a$a  reason: collision with other inner class name */
    static final class C3789a extends m implements h.f.a.b<View, z> {
        final /* synthetic */ boolean $isShowTranslation;
        final /* synthetic */ String $toUid;
        final /* synthetic */ h $upvote;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3789a(a aVar, boolean z, h hVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$isShowTranslation = z;
            this.$upvote = hVar;
            this.$toUid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            if (this.$isShowTranslation) {
                this.this$0.a(this.$upvote.getText(), this.$upvote.getCreateTime());
            }
            UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = this.this$0.f142106c;
            h hVar = this.$upvote;
            a aVar = this.this$0;
            l.d(hVar, "");
            l.d(aVar, "");
            String commentId = hVar.getCommentId();
            if (upvoteDetailPanelViewModel.a(commentId)) {
                UpvoteDetailPanelViewModel.a aVar2 = upvoteDetailPanelViewModel.h().get(commentId);
                if (aVar2 != null) {
                    aVar2.f142149a = false;
                }
            } else {
                UpvoteDetailPanelViewModel.a aVar3 = upvoteDetailPanelViewModel.h().get(hVar.getCommentId());
                if (aVar3 != null) {
                    aVar3.f142149a = true;
                    aVar.a(aVar3.f142150b);
                } else {
                    String text = hVar.getText();
                    if (text != null) {
                        String h2 = SettingServiceImpl.v().h();
                        String b2 = com.ss.android.ugc.aweme.live.b.a().b(n.a(new com.ss.android.ugc.aweme.upvote.c.a(text)));
                        UpvoteApi upvoteApi = UpvoteApi.f142023a;
                        l.b(b2, "");
                        f.a.b.b a2 = upvoteApi.translate(h2, b2, 2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new UpvoteDetailPanelViewModel.i(upvoteDetailPanelViewModel, commentId, aVar), new UpvoteDetailPanelViewModel.j(aVar));
                        l.b(a2, "");
                        f.a.j.a.a(a2, upvoteDetailPanelViewModel.g());
                    }
                }
            }
            r.a("translate_recommendation", v.a(this.$toUid, "to_user_id"));
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.b<View, z> {
        final /* synthetic */ String $toUid;
        final /* synthetic */ h $upvote;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, h hVar, String str) {
            super(1);
            this.this$0 = aVar;
            this.$upvote = hVar;
            this.$toUid = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            double d2;
            int i2;
            int i3;
            l.d(view, "");
            Context context = this.this$0.f142105b.getContext();
            String str = null;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                CommentService e2 = CommentServiceImpl.e();
                String commentId = this.$upvote.getCommentId();
                User user = this.$upvote.getUser();
                if (user != null) {
                    str = user.getUid();
                }
                String itemId = this.$upvote.getItemId();
                a aVar = this.this$0;
                if (((com.ss.android.ugc.aweme.upvote.detail.panel.l) aVar.f142106c.e()).f142201c == 0.0f) {
                    d2 = 0.5d;
                } else {
                    d2 = 0.73d;
                }
                Context context2 = aVar.f142105b.getContext();
                l.b(context2, "");
                Resources resources = context2.getResources();
                l.a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i2 = displayMetrics.heightPixels;
                } else {
                    i2 = 0;
                }
                Context context3 = aVar.f142105b.getContext();
                l.b(context3, "");
                int identifier = context3.getResources().getIdentifier("status_bar_height", "dimen", "android");
                if (identifier > 0) {
                    i3 = context3.getResources().getDimensionPixelSize(identifier);
                } else {
                    i3 = 0;
                }
                double d3 = (double) i2;
                Double.isNaN(d3);
                double d4 = d2 * d3;
                double d5 = (double) i3;
                Double.isNaN(d5);
                e2.a(activity, commentId, str, itemId, (int) (d4 + d5));
                r.a("report_recommendation", v.a(this.$toUid, "to_user_id"));
            }
            return z.f158842a;
        }
    }

    public a(TuxTextView tuxTextView, UpvoteDetailPanelViewModel upvoteDetailPanelViewModel) {
        l.d(tuxTextView, "");
        l.d(upvoteDetailPanelViewModel, "");
        this.f142105b = tuxTextView;
        this.f142106c = upvoteDetailPanelViewModel;
    }

    public final void a(String str, long j2) {
        boolean z;
        int color;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = com.ss.android.ugc.aweme.base.utils.h.b(((Number) com.ss.android.ugc.aweme.upvote.b.b.a(Integer.valueOf((int) R.string.f94), Integer.valueOf((int) R.string.fdc))).intValue());
            l.b(str, "");
            this.f142105b.setTextColorRes(R.attr.bj);
        } else {
            this.f142105b.setTextColorRes(R.attr.bc);
        }
        String a2 = gb.a(str);
        l.b(a2, "");
        h hVar = this.f142104a;
        if (hVar == null) {
            l.a("upvote");
        }
        if (hVar.isFake()) {
            this.f142105b.setText(a2);
            return;
        }
        String a3 = ib.a(this.f142105b.getContext(), j2 * 1000);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2 + ' ' + a3);
        com.bytedance.tux.f.a.b bVar = new com.bytedance.tux.f.a.b(61, false);
        Context context = this.f142105b.getContext();
        l.b(context, "");
        l.c(context, "");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.bd, typedValue, true);
        if (typedValue.type < 28 || typedValue.type > 31) {
            color = context.getResources().getColor(0);
        } else {
            color = typedValue.data;
        }
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int length = spannableStringBuilder.length() - a3.length();
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(bVar, length, length2, 17);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, length2, 17);
        this.f142105b.setText(spannableStringBuilder);
    }
}
