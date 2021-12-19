package com.ss.android.ugc.aweme.donation.detail;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.donation.detail.f;
import com.ss.android.ugc.aweme.donation.e;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;

public final class a extends f<e> {

    /* renamed from: a  reason: collision with root package name */
    public final b f82969a;

    static {
        Covode.recordClassIndex(51731);
    }

    public a(b bVar) {
        l.d(bVar, "");
        this.f82969a = bVar;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.y5, viewGroup, false);
        l.b(a2, "");
        return new f(a2, this.f82969a);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        UrlModel urlModel;
        long currentTimeMillis;
        if ((viewHolder instanceof f) && e() != null && e().get(i2) != null) {
            f fVar = (f) viewHolder;
            Object obj = e().get(i2);
            l.b(obj, "");
            e eVar = (e) obj;
            l.d(eVar, "");
            fVar.f83015f.setText(R.string.bb0);
            TextView textView = fVar.f83016g;
            l.b(textView, "");
            textView.setText("•");
            if (eVar.f83027f) {
                ImageView imageView = fVar.f83014e;
                l.b(imageView, "");
                imageView.setVisibility(0);
                TextView textView2 = fVar.f83015f;
                l.b(textView2, "");
                textView2.setVisibility(0);
                TextView textView3 = fVar.f83016g;
                l.b(textView3, "");
                textView3.setVisibility(0);
            } else {
                ImageView imageView2 = fVar.f83014e;
                l.b(imageView2, "");
                imageView2.setVisibility(8);
                TextView textView4 = fVar.f83015f;
                l.b(textView4, "");
                textView4.setVisibility(8);
                TextView textView5 = fVar.f83016g;
                l.b(textView5, "");
                textView5.setVisibility(8);
            }
            if (l.a((Object) eVar.f83026e, (Object) true)) {
                View view = fVar.itemView;
                l.b(view, "");
                String string = view.getContext().getString(R.string.baz);
                l.b(string, "");
                TextView textView6 = fVar.f83011b;
                l.b(textView6, "");
                textView6.setText(string);
                v a2 = r.a((int) R.drawable.cc1).a("Donation");
                a2.E = fVar.f83010a;
                a2.f39916l = R.color.f159922f;
                a2.c();
                fVar.f83010a.setOnClickListener(f.b.f83018a);
                fVar.f83011b.setOnClickListener(f.c.f83019a);
            } else {
                f.d dVar = new f.d(fVar, eVar);
                fVar.f83010a.setOnClickListener(dVar);
                fVar.f83011b.setOnClickListener(dVar);
                String e2 = in.e(eVar.f83022a);
                TextView textView7 = fVar.f83011b;
                l.b(textView7, "");
                textView7.setText(e2);
                User user = eVar.f83022a;
                String str = null;
                if (user != null) {
                    urlModel = user.getAvatarThumb();
                } else {
                    urlModel = null;
                }
                IAccountUserService e3 = AccountService.a().e();
                l.b(e3, "");
                User curUser = e3.getCurUser();
                if (!(curUser == null || curUser.getUid() == null)) {
                    String uid = curUser.getUid();
                    User user2 = eVar.f83022a;
                    if (user2 != null) {
                        str = user2.getUid();
                    }
                    if (l.a((Object) uid, (Object) str)) {
                        urlModel = curUser.getAvatarThumb();
                    }
                }
                if (!(fVar.f83010a == null || urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0)) {
                    v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel));
                    int[] a4 = em.a(100);
                    if (a4 == null) {
                        l.b();
                    }
                    v b2 = a3.b(a4);
                    int i3 = f.f83008i;
                    v a5 = b2.a(i3, i3);
                    a5.K = true;
                    v a6 = a5.a("Donation");
                    a6.f39916l = R.color.f159922f;
                    a6.E = fVar.f83010a;
                    a6.c();
                }
            }
            View view2 = fVar.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            l.b(context, "");
            Long l2 = eVar.f83023b;
            if (l2 != null) {
                currentTimeMillis = l2.longValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            String a7 = ib.a(context, currentTimeMillis * 1000);
            l.b(a7, "");
            String replace = new h.m.l("(.)").replace(a7, "$1⁠");
            String str2 = eVar.f83024c;
            if (str2 == null) {
                str2 = "";
            }
            StringBuilder sb = new StringBuilder();
            View view3 = fVar.itemView;
            l.b(view3, "");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.append(view3.getContext().getString(R.string.bay)).append(' ').append(eVar.f83024c).append(' ').append(replace).toString());
            int a8 = p.a((CharSequence) spannableStringBuilder, str2, 0, false, 6);
            int a9 = p.a((CharSequence) spannableStringBuilder, replace, 0, false, 6);
            View view4 = fVar.itemView;
            l.b(view4, "");
            Context context2 = view4.getContext();
            l.b(context2, "");
            spannableStringBuilder.setSpan(new DonationVH$bind$$inlined$apply$lambda$1(context2.getResources().getColor(R.color.bx), fVar, str2, replace), a8, str2.length() + a8, 34);
            View view5 = fVar.itemView;
            l.b(view5, "");
            Context context3 = view5.getContext();
            l.b(context3, "");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context3.getResources().getColor(R.color.c5)), a9, replace.length() + a9, 34);
            TextView textView8 = fVar.f83012c;
            l.b(textView8, "");
            textView8.setText(spannableStringBuilder);
            String str3 = eVar.f83025d;
            if (str3 == null || str3.length() == 0) {
                TextView textView9 = fVar.f83013d;
                l.b(textView9, "");
                textView9.setText("");
                return;
            }
            TextView textView10 = fVar.f83013d;
            l.b(textView10, "");
            textView10.setText("+ " + eVar.f83025d);
        }
    }
}
