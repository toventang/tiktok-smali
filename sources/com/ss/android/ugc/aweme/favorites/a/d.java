package com.ss.android.ugc.aweme.favorites.a;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.favorites.j.i;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.question.c;
import com.ss.android.ugc.aweme.question.g.b;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d extends f<c> {

    /* renamed from: a  reason: collision with root package name */
    public final Fragment f90428a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f90429b;

    static {
        Covode.recordClassIndex(56765);
    }

    public d(Activity activity, Fragment fragment) {
        l.d(activity, "");
        l.d(fragment, "");
        this.f90429b = activity;
        this.f90428a = fragment;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.zz, viewGroup, false);
        l.b(a2, "");
        return new i(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        UrlModel urlModel;
        Drawable drawable;
        Resources resources;
        String content;
        Integer videosCount;
        Resources resources2;
        User user;
        UrlModel urlModel2;
        User creator;
        User creator2;
        Long l2;
        l.d(viewHolder, "");
        c cVar = (c) e().get(i2);
        i iVar = (i) viewHolder;
        Activity activity = this.f90429b;
        Fragment fragment = this.f90428a;
        l.d(this, "");
        if (cVar != null && activity != null && fragment != null) {
            iVar.f90702c = activity;
            iVar.f90703d = fragment;
            iVar.f90700a = cVar;
            iVar.f90701b = cVar.getContent();
            iVar.f90704e = this;
            iVar.f90705f = new i.a(iVar);
            iVar.f90706g = com.ss.android.ugc.aweme.question.g.c.a();
            com.ss.android.ugc.aweme.question.g.c cVar2 = iVar.f90706g;
            String str = null;
            if (cVar2 != null) {
                c cVar3 = iVar.f90700a;
                if (cVar3 != null) {
                    l2 = cVar3.getId();
                } else {
                    l2 = null;
                }
                com.ss.android.ugc.aweme.arch.widgets.base.c<b> a2 = cVar2.a(String.valueOf(l2));
                if (a2 != null) {
                    a2.a(iVar, false);
                }
            }
            iVar.n.setVisibility(8);
            c cVar4 = iVar.f90700a;
            if (cVar4 == null || (creator2 = cVar4.getCreator()) == null) {
                urlModel = null;
            } else {
                urlModel = creator2.getAvatarThumb();
            }
            if (urlModel != null) {
                c cVar5 = iVar.f90700a;
                if (cVar5 == null || (creator = cVar5.getCreator()) == null) {
                    urlModel2 = null;
                } else {
                    urlModel2 = creator.getAvatarThumb();
                }
                v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(urlModel2));
                a3.K = true;
                v a4 = a3.a("collection_question");
                a4.E = iVar.f90709j;
                a4.c();
            } else {
                SmartCircleImageView smartCircleImageView = iVar.f90709j;
                Activity activity2 = iVar.f90702c;
                if (activity2 == null || (resources = activity2.getResources()) == null) {
                    drawable = null;
                } else {
                    drawable = resources.getDrawable(2131231879);
                }
                smartCircleImageView.setBackground(drawable);
                iVar.f90709j.setPlaceholderImage(2131231879);
            }
            c cVar6 = iVar.f90700a;
            if (cVar6 == null || cVar6.getCreator() == null) {
                iVar.f90710k.setVisibility(8);
                p.a((View) iVar.f90711l, (int) n.b(activity, 8.0f));
            } else {
                TuxTextView tuxTextView = iVar.f90710k;
                c cVar7 = iVar.f90700a;
                if (cVar7 != null) {
                    user = cVar7.getCreator();
                } else {
                    user = null;
                }
                tuxTextView.setText(in.a(user, false));
            }
            c cVar8 = iVar.f90700a;
            if (!(cVar8 == null || (videosCount = cVar8.getVideosCount()) == null)) {
                int intValue = videosCount.intValue();
                String a5 = com.ss.android.ugc.aweme.i18n.b.a((long) intValue);
                Activity activity3 = iVar.f90702c;
                if (!(activity3 == null || (resources2 = activity3.getResources()) == null)) {
                    str = resources2.getQuantityString(R.plurals.h1, intValue, a5);
                }
                iVar.f90712m.setText(str);
            }
            c cVar9 = iVar.f90700a;
            if (!(cVar9 == null || (content = cVar9.getContent()) == null)) {
                iVar.f90711l.setText(new a.C0730a().a(new h.m.l("(?m)^[ \t]*\r?\n").replace(content, "")).f33382a);
                EOYServiceImpl.b().a(iVar.f90711l);
            }
            iVar.f90708i.setOnClickListener(iVar);
            iVar.f90708i.setOnLongClickListener(iVar);
            iVar.f90707h.setOnClickListener(new i.View$OnClickListenerC2195i(iVar));
        }
    }
}
