package com.ss.android.ugc.aweme.comment.util;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.t;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f72866a = new q();

    private q() {
    }

    static {
        Covode.recordClassIndex(44885);
    }

    private static List<UrlModel> a(String str) {
        if (str == null) {
            return null;
        }
        try {
            p pVar = (p) dg.a().a(str, p.class);
            if (pVar != null) {
                return pVar.getIconUrlList();
            }
            return null;
        } catch (t e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return null;
        }
    }

    public static String a(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct == null) {
            return "";
        }
        String extra = anchorCommonStruct.getExtra();
        if (extra == null || extra.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
            if (jSONObject.optLong("linked_effect_id", 0) > 0) {
                return String.valueOf(jSONObject.optLong("linked_effect_id"));
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static Integer b(AnchorCommonStruct anchorCommonStruct) {
        boolean z;
        if (anchorCommonStruct != null) {
            String extra = anchorCommonStruct.getExtra();
            if (extra == null || extra.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
                    if (jSONObject.optInt("ngo_id", 0) > 0) {
                        return Integer.valueOf(jSONObject.optInt("ngo_id"));
                    }
                } catch (Exception unused) {
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f72867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f72868b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f72869c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f72870d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ AnchorCommonStruct f72871e;

        static {
            Covode.recordClassIndex(44886);
        }

        a(Aweme aweme, String str, View view, String str2, AnchorCommonStruct anchorCommonStruct) {
            this.f72867a = aweme;
            this.f72868b = str;
            this.f72869c = view;
            this.f72870d = str2;
            this.f72871e = anchorCommonStruct;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            Aweme aweme = this.f72867a;
            if (aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                l.b(view, "");
                SmartRoute withParam = SmartRouter.buildRoute(view.getContext(), "aweme://donation/pannel").withParam("enter_method", "comment_click").withParam("enter_from", this.f72868b);
                View view2 = this.f72869c;
                if (view2 != null) {
                    i2 = view2.getHeight();
                } else {
                    i2 = 0;
                }
                withParam.withParam("height", i2).withParam("log_pb", this.f72870d).withParam("aweme_id", this.f72867a.getAid()).withParam("sticker_id", q.a(this.f72871e)).withParam("ngo_id", q.b(this.f72871e)).open();
            }
        }
    }

    private static void a(SmartCircleImageView smartCircleImageView, SmartCircleImageView smartCircleImageView2, TextView textView) {
        smartCircleImageView.setImageResource(2131231201);
        smartCircleImageView2.setVisibility(8);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.a) layoutParams).f2048e = R.id.os;
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.a) layoutParams2).p = R.id.os;
    }

    public static void a(String str, String str2, View view, Aweme aweme, View view2) {
        List<UrlModel> a2;
        l.d(view, "");
        SmartCircleImageView smartCircleImageView = (SmartCircleImageView) view.findViewById(R.id.os);
        SmartCircleImageView smartCircleImageView2 = (SmartCircleImageView) view.findViewById(R.id.ot);
        TextView textView = (TextView) view.findViewById(R.id.ak7);
        List<AnchorCommonStruct> a3 = com.ss.android.ugc.aweme.base.ui.anchor.a.f68349a.a(aweme);
        if (a3 == null) {
            l.b();
        }
        AnchorCommonStruct anchorCommonStruct = a3.get(0);
        if (anchorCommonStruct == null) {
            l.b();
        }
        if (TextUtils.isEmpty(anchorCommonStruct.getExtra()) || (a2 = a(anchorCommonStruct.getExtra())) == null || a2.size() <= 1) {
            l.b(smartCircleImageView, "");
            l.b(smartCircleImageView2, "");
            l.b(textView, "");
            a(smartCircleImageView, smartCircleImageView2, textView);
        } else {
            v a4 = r.a(com.ss.android.ugc.aweme.base.v.a(a2.get(0))).a("CommentDonation");
            a4.f39916l = R.color.f159922f;
            a4.E = smartCircleImageView;
            a4.c();
            v a5 = r.a(com.ss.android.ugc.aweme.base.v.a(a2.get(1))).a("CommentDonation");
            a5.f39916l = R.color.f159922f;
            a5.E = smartCircleImageView2;
            a5.c();
            l.b(smartCircleImageView2, "");
            smartCircleImageView2.setVisibility(0);
            l.b(textView, "");
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.a) layoutParams).f2048e = R.id.ot;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.a) layoutParams2).p = R.id.ot;
        }
        textView.setLayoutParams(textView.getLayoutParams());
        String keyword = anchorCommonStruct.getKeyword();
        if (keyword == null) {
            keyword = "";
        }
        textView.setText(keyword);
        view.setOnClickListener(new a(aweme, str2, view2, str, anchorCommonStruct));
    }
}
