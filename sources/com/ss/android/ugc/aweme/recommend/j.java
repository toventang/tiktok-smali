package com.ss.android.ugc.aweme.recommend;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.friends.model.RecommendUserHint;
import com.ss.android.ugc.aweme.friends.ui.av;
import com.ss.android.ugc.aweme.friends.ui.aw;
import com.ss.android.ugc.aweme.friends.ui.ax;
import com.ss.android.ugc.aweme.friends.ui.y;
import com.ss.android.ugc.aweme.newfollow.c.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class j extends f<User> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f120071d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final RecommendUserHint f120072a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f120073b;

    /* renamed from: c  reason: collision with root package name */
    public final String f120074c;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<String, Boolean> f120075e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final Set<String> f120076f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private final k<User> f120077g;

    static {
        Covode.recordClassIndex(78047);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78048);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        User user = (User) this.f76354l.get(i2);
        if (!(user instanceof RecommendUserHint) || ((RecommendUserHint) user).getRecDialogType() != 1) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        int c2 = b.c(viewGroup.getContext(), R.color.c4);
        f(c2);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        DmtStatusView.a c3 = dmtStatusView.c();
        c3.f33605g = 0;
        Context context = viewGroup.getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c2);
        tuxTextView.setTuxFont(61);
        tuxTextView.setText(R.string.f80);
        dmtStatusView.setBuilder(c3.b(tuxTextView));
        l.b(a_, "");
        return a_;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof ax) {
            ax axVar = (ax) viewHolder;
            User data = axVar.f97226a.getData();
            if (data != null && !this.f120076f.contains(data.getUid())) {
                Set<String> set = this.f120076f;
                String uid = data.getUid();
                l.b(uid, "");
                set.add(uid);
                this.f120077g.a(103, data, axVar.getAdapterPosition());
                e.a.f112592a.a(3, data.getUid());
            }
        }
    }

    public j(k<User> kVar, String str) {
        l.d(kVar, "");
        this.f120077g = kVar;
        this.f120074c = str;
        RecommendUserHint recommendUserHint = new RecommendUserHint();
        recommendUserHint.setRecDialogType(1);
        this.f120072a = recommendUserHint;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 != 1) {
            com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            Context context = viewGroup.getContext();
            l.b(context, "");
            y a2 = aVar.a(context, this.f120075e, false, false);
            if (a2 == null) {
                l.b();
            }
            a2.setEnterFrom("others_homepage");
            a2.setListener(this.f120077g);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.ui.RecommendUserDialogItemView");
            return new ax((aw) a2);
        }
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a2p, viewGroup, false);
        l.b(a3, "");
        av avVar = new av(a3);
        String str = this.f120074c;
        if (str == null) {
            str = "";
        }
        l.d(str, "");
        avVar.f97203b = str;
        return avVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder == null) {
            return;
        }
        if (viewHolder instanceof av) {
            av avVar = (av) viewHolder;
            avVar.f97202a.setMovementMethod(LinkMovementMethod.getInstance());
            avVar.f97202a.setHighlightColor(b.c(avVar.f97202a.getContext(), R.color.c9));
            Context context = avVar.f97202a.getContext();
            l.b(context, "");
            String string = context.getResources().getString(R.string.cwj);
            l.b(string, "");
            Context context2 = avVar.f97202a.getContext();
            l.b(context2, "");
            String string2 = context2.getResources().getString(R.string.cab, string);
            l.b(string2, "");
            int a2 = p.a((CharSequence) string2, string, 0, false, 6);
            int length = string.length() + a2;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && a2 >= 0) {
                spannableString.setSpan(new av.a(avVar), a2, length, 34);
                spannableString.setSpan(new StyleSpan(1), a2, length, 34);
            }
            avVar.f97202a.setText(spannableString);
        } else if (viewHolder instanceof ax) {
            ax axVar = (ax) viewHolder;
            Object obj = this.f76354l.get(i2);
            l.b(obj, "");
            User user = (User) obj;
            l.d(user, "");
            axVar.f97226a.setData(user);
            axVar.f97226a.setPositionInApiList(i2);
        }
    }

    public final void a(User user, int i2) {
        l.d(user, "");
        List list = this.f76354l;
        l.b(list, "");
        Iterator it = n.a((Collection<?>) list).iterator();
        while (it.hasNext()) {
            int a2 = ((af) it).a();
            Object obj = this.f76354l.get(a2);
            l.b(obj, "");
            if (TextUtils.equals(((User) obj).getUid(), user.getUid())) {
                Object obj2 = this.f76354l.get(a2);
                l.b(obj2, "");
                ((User) obj2).setFollowStatus(i2);
                notifyItemChanged(a2);
            }
        }
    }
}
