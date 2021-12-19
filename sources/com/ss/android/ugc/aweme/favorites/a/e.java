package com.ss.android.ugc.aweme.favorites.a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.google.c.c.ap;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.j.j;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.i18n.b;
import com.ss.android.ugc.aweme.model.a.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class e extends f<g> {
    static {
        Covode.recordClassIndex(56766);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return new j(a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.a9s, viewGroup, false));
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        g gVar = (g) e().get(i2);
        j jVar = (j) viewHolder;
        jVar.f90736h = gVar;
        jVar.f90730b.setText(gVar.name);
        jVar.f90731c.setText(gVar.ownerName);
        if (gVar.effectSource == 1) {
            o.b(true, jVar.f90732d);
            if (jVar.f90732d != null) {
                jVar.f90732d.setText(R.string.ex6);
            }
        } else {
            o.b(false, jVar.f90732d);
        }
        jVar.f90733e.setText(jVar.f90733e.getContext().getString(R.string.dd4, b.a(gVar.userCount)));
        if (gVar.iconUrl == null || gVar.iconUrl.getUrlList() == null || gVar.iconUrl.getUrlList().isEmpty()) {
            com.ss.android.ugc.aweme.base.e.a(jVar.f90729a, 2131232910);
        } else {
            com.ss.android.ugc.aweme.base.e.b(jVar.f90729a, gVar.iconUrl.getUrlList().get(0), -1, -1);
        }
        jVar.f90735g.setOnClickListener(new bp(gVar) {
            /* class com.ss.android.ugc.aweme.favorites.j.j.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f90737a;

            static {
                Covode.recordClassIndex(56979);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                Context context = j.this.f90735g.getContext();
                g gVar = this.f90737a;
                String str = gVar.id;
                d dVar = new d();
                if (!TextUtils.isEmpty("")) {
                    dVar.a("tab_name", "");
                }
                r.a("click_personal_collection", dVar.a("enter_from", "collection_prop").a("content", "prop").a("prop_id", str).f66730a);
                String str2 = gVar.id;
                d dVar2 = new d();
                if (!TextUtils.isEmpty("")) {
                    dVar2.a("tab_name", "");
                }
                r.a("enter_prop_detail", dVar2.a("enter_from", "collection_prop").a("enter_method", "click_collection_prop").a("prop_id", str2).f66730a);
                SmartRouter.buildRoute(context, "aweme://stickers/detail").withParam("extra_stickers", ap.a(gVar.id)).open();
            }

            {
                this.f90737a = r2;
            }
        });
        jVar.f90734f.setOnClickListener(new bp(gVar) {
            /* class com.ss.android.ugc.aweme.favorites.j.j.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f90739a;

            static {
                Covode.recordClassIndex(56980);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                Context context;
                List<String> a2;
                if (view != null) {
                    context = view.getContext();
                } else {
                    context = null;
                }
                if (context == null || !MSAdaptionService.c().b(context)) {
                    FaceStickerBean.sCurPropSource = "favorite_prop";
                    a.C2826a b2 = new a.C2826a().a("prop_page").b("prop_auto");
                    l.d("prop_collection", "");
                    b2.f110687c = "prop_collection";
                    com.ss.android.ugc.aweme.model.a.a a3 = b2.a(k.f90741a).a();
                    if (this.f90739a.children == null || this.f90739a.children.isEmpty()) {
                        a2 = ap.a(this.f90739a.id);
                    } else {
                        a2 = this.f90739a.children;
                    }
                    PropReuseServiceImpl.c().a(j.this.f90734f.getContext(), a2, a3, AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                    com.ss.android.ugc.aweme.favorites.i.a.a(2, this.f90739a.id);
                    return;
                }
                Toast makeText = Toast.makeText(context, context.getString(R.string.bey), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            }

            {
                this.f90739a = r2;
            }
        });
        jVar.c();
    }
}
