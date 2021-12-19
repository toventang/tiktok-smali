package com.ss.android.ugc.aweme.sticker.view.internal.pager.b;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.sticker.view.a.l;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.g;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.tools.b;
import com.ss.android.ugc.tools.view.style.j;
import com.ss.ugc.effectplatform.model.UrlModel;
import h.m.p;
import java.util.List;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.aweme.sticker.view.a.a<j, Fragment> {
    static {
        Covode.recordClassIndex(89079);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.b.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3558a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f136402a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectCategoryModel f136403b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f136404c;

        static {
            Covode.recordClassIndex(89080);
        }

        View$OnClickListenerC3558a(a aVar, EffectCategoryModel effectCategoryModel, h.f.a.a aVar2) {
            this.f136402a = aVar;
            this.f136403b = effectCategoryModel;
            this.f136404c = aVar2;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f136404c.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.a.a
    public final d<Fragment> a(int i2, l.b bVar, l.a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        h.f.b.l.d(recycledViewPool, "");
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        g gVar = new g();
        gVar.a(i2, bVar, aVar, recycledViewPool);
        return gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.sticker.view.a.a
    public final /* synthetic */ j a(e eVar, EffectCategoryModel effectCategoryModel, TabLayout tabLayout, h.f.a.a aVar) {
        boolean z;
        List<String> list;
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(effectCategoryModel, "");
        h.f.b.l.d(tabLayout, "");
        h.f.b.l.d(aVar, "");
        j a2 = b.a(eVar);
        String extra = effectCategoryModel.getExtra();
        if (extra == null || p.a((CharSequence) extra)) {
            z = false;
        } else {
            z = new JSONObject(extra).optBoolean("is_show_icon_only");
        }
        UrlModel icon_selected = effectCategoryModel.getIcon_selected();
        if (icon_selected != null) {
            list = icon_selected.getUrl_list();
        } else {
            list = null;
        }
        if (!com.ss.android.ugc.tools.utils.d.a(list)) {
            com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
            urlModel.setUrlList(list);
            a2.setImage(urlModel);
        } else {
            a2.setImageVisibility(false);
        }
        if (z) {
            a2.setTextVisibility(false);
        } else {
            a2.setText(effectCategoryModel.getName());
        }
        a2.setOnClickListener(new View$OnClickListenerC3558a(this, effectCategoryModel, aVar));
        return a2;
    }
}
