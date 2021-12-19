package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.b;
import androidx.core.h.h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.c.e;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b.c;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends f<b> {
    static {
        Covode.recordClassIndex(64342);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        return new c(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        b bVar;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(viewHolder instanceof c)) {
            viewHolder = null;
        }
        c cVar = (c) viewHolder;
        if (cVar != null && (bVar = (b) this.f76354l.get(i2)) != null) {
            l.d(bVar, "");
            if (i2 == 0) {
                View view = cVar.itemView;
                l.b(view, "");
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.b68);
                l.b(frameLayout, "");
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = layoutParams;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                if (marginLayoutParams2 != null) {
                    h.a(marginLayoutParams2, 0);
                }
            }
            if (bVar.f100589b > 0) {
                View view2 = cVar.itemView;
                l.b(view2, "");
                e a2 = com.bytedance.tux.c.f.a(c.a.f100590a);
                Context context = ((AvatarImageView) view2.findViewById(R.id.a6_)).getContext();
                l.b(context, "");
                a2.a(context);
                a.C0730a aVar = new a.C0730a();
                aVar.c("+");
                aVar.a(String.valueOf(bVar.f100589b));
                View view3 = cVar.itemView;
                l.b(view3, "");
                TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.fd8);
                l.b(tuxTextView, "");
                tuxTextView.setText(aVar.f33382a);
                View view4 = cVar.itemView;
                l.b(view4, "");
                TuxTextView tuxTextView2 = (TuxTextView) view4.findViewById(R.id.fd8);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(0);
                return;
            }
            IMUser iMUser = bVar.f100588a;
            if (iMUser != null) {
                View view5 = cVar.itemView;
                l.b(view5, "");
                com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view5.findViewById(R.id.a6_), iMUser.getDisplayAvatar());
            } else {
                View view6 = cVar.itemView;
                l.b(view6, "");
                com.ss.android.ugc.aweme.base.e.a((RemoteImageView) view6.findViewById(R.id.a6_), 2131232324);
            }
            com.facebook.drawee.f.e b2 = com.facebook.drawee.f.e.b(com.c.a.a.a(20));
            View view7 = cVar.itemView;
            l.b(view7, "");
            b2.a(b.c(view7.getContext(), R.color.f159928l), com.c.a.a.a(1));
            View view8 = cVar.itemView;
            l.b(view8, "");
            com.facebook.drawee.view.c cVar2 = (com.facebook.drawee.view.c) view8.findViewById(R.id.a6_);
            l.b(cVar2, "");
            com.facebook.drawee.f.a aVar2 = (com.facebook.drawee.f.a) cVar2.getHierarchy();
            l.b(aVar2, "");
            aVar2.a(b2);
            View view9 = cVar.itemView;
            l.b(view9, "");
            TuxTextView tuxTextView3 = (TuxTextView) view9.findViewById(R.id.fd8);
            l.b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
    }
}
