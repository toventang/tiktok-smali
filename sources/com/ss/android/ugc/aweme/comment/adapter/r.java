package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentMultiAnchorTagLayout;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentRichTagView;
import com.ss.android.ugc.aweme.comment.barrage.view.CommentTaggedPeopleView;
import com.ss.android.ugc.aweme.comment.widget.CommentDescView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class r extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: l  reason: collision with root package name */
    public static final a f71402l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final SmartAvatarImageView f71403a;

    /* renamed from: b  reason: collision with root package name */
    final TuxTextView f71404b;

    /* renamed from: c  reason: collision with root package name */
    final CommentDescView f71405c;

    /* renamed from: d  reason: collision with root package name */
    TuxTextView f71406d;

    /* renamed from: e  reason: collision with root package name */
    final CommentTaggedPeopleView f71407e;

    /* renamed from: f  reason: collision with root package name */
    final CommentMultiAnchorTagLayout f71408f;

    /* renamed from: g  reason: collision with root package name */
    CommentRichTagView f71409g;

    /* renamed from: h  reason: collision with root package name */
    final int f71410h;

    /* renamed from: i  reason: collision with root package name */
    User f71411i;

    /* renamed from: j  reason: collision with root package name */
    public DataCenter f71412j;

    /* renamed from: k  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.comment.g.a f71413k;

    /* renamed from: m  reason: collision with root package name */
    private final Context f71414m;
    private final e n;

    static {
        Covode.recordClassIndex(43952);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43953);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        String str;
        com.ss.android.ugc.aweme.comment.g.a aVar;
        String str2;
        String str3;
        ClickAgent.onClick(view);
        String str4 = null;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if ((valueOf.intValue() == R.id.or || valueOf.intValue() == R.id.title) && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                User user = this.f71411i;
                if (user != null) {
                    str = user.getUid();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && (aVar = this.f71413k) != null) {
                    User user2 = this.f71411i;
                    if (user2 != null) {
                        str2 = user2.getUid();
                    } else {
                        str2 = null;
                    }
                    User user3 = this.f71411i;
                    if (user3 != null) {
                        str4 = user3.getSecUid();
                    }
                    if (view.getId() == R.id.or) {
                        str3 = "click_head";
                    } else {
                        str3 = "click_name";
                    }
                    aVar.a(str2, str4, str3);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(View view, com.ss.android.ugc.aweme.comment.g.a aVar) {
        super(view);
        l.d(view, "");
        this.f71413k = aVar;
        Context context = view.getContext();
        this.f71414m = context;
        Context context2 = view.getContext();
        Objects.requireNonNull(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.n = (e) context2;
        View findViewById = view.findViewById(R.id.or);
        l.b(findViewById, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById;
        this.f71403a = smartAvatarImageView;
        View findViewById2 = view.findViewById(R.id.title);
        l.b(findViewById2, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.f71404b = tuxTextView;
        View findViewById3 = view.findViewById(R.id.a_3);
        l.b(findViewById3, "");
        this.f71405c = (CommentDescView) findViewById3;
        View findViewById4 = view.findViewById(R.id.aa6);
        l.b(findViewById4, "");
        this.f71406d = (TuxTextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.eid);
        l.b(findViewById5, "");
        this.f71407e = (CommentTaggedPeopleView) findViewById5;
        View findViewById6 = view.findViewById(R.id.cox);
        l.b(findViewById6, "");
        this.f71408f = (CommentMultiAnchorTagLayout) findViewById6;
        this.f71409g = (CommentRichTagView) view.findViewById(R.id.dt);
        this.f71410h = (int) n.b(context, 32.0f);
        com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) smartAvatarImageView.getHierarchy();
        l.b(aVar2, "");
        com.facebook.drawee.f.e eVar = aVar2.f47454a;
        if (eVar != null) {
            eVar.c((float) com.ss.android.ugc.aweme.base.utils.n.a(0.5d));
            eVar.f47480f = smartAvatarImageView.getResources().getColor(R.color.b4);
        }
        smartAvatarImageView.setOnClickListener(this);
        tuxTextView.setOnClickListener(this);
        TextPaint paint = tuxTextView.getPaint();
        l.b(paint, "");
        paint.setFakeBoldText(true);
    }
}
