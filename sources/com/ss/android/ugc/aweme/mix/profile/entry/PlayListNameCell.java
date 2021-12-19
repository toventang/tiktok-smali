package com.ss.android.ugc.aweme.mix.profile.entry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.g;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class PlayListNameCell extends PowerCell<b> {
    static {
        Covode.recordClassIndex(70746);
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayListNameCell f110228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f110229b;

        static {
            Covode.recordClassIndex(70748);
        }

        /* JADX WARNING: Removed duplicated region for block: B:52:0x015a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x015d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
            // Method dump skipped, instructions count: 371
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.profile.entry.PlayListNameCell.b.onPreDraw():boolean");
        }

        b(PlayListNameCell playListNameCell, b bVar) {
            this.f110228a = playListNameCell;
            this.f110229b = bVar;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoz, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PlayListNameCell f110224a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f110225b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f110226c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.mix.e.b f110227d;

        static {
            Covode.recordClassIndex(70747);
        }

        a(PlayListNameCell playListNameCell, b bVar, boolean z, com.ss.android.ugc.aweme.mix.e.b bVar2) {
            this.f110224a = playListNameCell;
            this.f110225b = bVar;
            this.f110226c = z;
            this.f110227d = bVar2;
        }

        public final void onClick(View view) {
            boolean z;
            ClickAgent.onClick(view);
            IMixFeedService k2 = MixFeedService.k();
            View view2 = this.f110224a.itemView;
            l.b(view2, "");
            Context context = ((TuxButton) view2).getContext();
            String str = this.f110225b.f110233d;
            if (str == null) {
                str = "";
            }
            String str2 = this.f110225b.f110235f;
            String str3 = this.f110225b.f110236g;
            if (!this.f110226c || this.f110225b.f110238i) {
                z = false;
            } else {
                z = true;
            }
            k2.a(context, "", (Aweme) null, "from_profile_mix_list", str, str2, str3, z, this.f110227d, this.f110225b.f110237h);
            String str4 = this.f110225b.f110237h;
            String str5 = this.f110225b.f110233d;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.f110225b.f110235f;
            String str7 = this.f110225b.f110240k;
            if (str7 == null) {
                str7 = "";
            }
            String str8 = this.f110225b.f110241l;
            if (str8 == null) {
                str8 = "";
            }
            String str9 = this.f110225b.f110239j;
            if (str9 == null) {
                str9 = "";
            }
            com.ss.android.ugc.aweme.mix.a.a.a(str4, str5, str6, null, 0, "click_profile", str7, str8, str9, this.f110227d, 8);
            String str10 = this.f110225b.f110237h;
            String str11 = this.f110225b.f110233d;
            if (str11 == null) {
                str11 = "";
            }
            String str12 = this.f110225b.f110235f;
            l.d(str10, "");
            l.d(str11, "");
            l.d("", "");
            l.d(str12, "");
            r.a("click_playlist_entrance", new d().a("enter_from", str10).a("playlist_id", str11).a("group_id", "").a("author_id", str12).f66730a);
            g gVar = this.f110225b.n;
            if (gVar != null) {
                gVar.a(this.f110225b.f110233d, this.f110225b.f110231b, Integer.valueOf(this.f110224a.getLayoutPosition()));
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final /* synthetic */ void a(b bVar) {
        int i2;
        b bVar2 = bVar;
        l.d(bVar2, "");
        Objects.requireNonNull(this.itemView, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
        View view = this.itemView;
        l.b(view, "");
        ((TuxButton) this.itemView).setIconTintColor(((TuxButton) view).getResources().getColor(R.color.bx));
        View view2 = this.itemView;
        l.b(view2, "");
        ((TuxButton) view2).setText(bVar2.f110231b);
        com.ss.android.ugc.aweme.account.b.a();
        IAccountUserService e2 = com.ss.android.ugc.aweme.account.b.f62864a.e();
        l.b(e2, "");
        boolean a2 = l.a((Object) e2.getCurUserId(), (Object) bVar2.f110235f);
        String str = bVar2.f110240k;
        if (bVar2.f110238i) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        com.ss.android.ugc.aweme.mix.e.b bVar3 = new com.ss.android.ugc.aweme.mix.e.b(str, Integer.valueOf(i2), bVar2.f110242m, 0, 8, null);
        if (bVar2.f110234e) {
            String str2 = bVar2.f110237h;
            String str3 = bVar2.f110233d;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = bVar2.f110235f;
            String str5 = bVar2.f110240k;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = bVar2.f110241l;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = bVar2.f110239j;
            if (str7 == null) {
                str7 = "";
            }
            com.ss.android.ugc.aweme.mix.a.a.a(str2, str3, null, str4, str5, str6, str7, bVar3, 4);
            bVar2.f110234e = false;
        }
        this.itemView.setOnClickListener(new a(this, bVar2, a2, bVar3));
        View view3 = this.itemView;
        l.b(view3, "");
        ((TuxButton) view3).setMinWidth(c.o);
        View view4 = this.itemView;
        l.b(view4, "");
        ((TuxButton) view4).getViewTreeObserver().addOnPreDrawListener(new b(this, bVar2));
    }
}
