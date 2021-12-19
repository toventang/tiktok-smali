package com.ss.android.ugc.aweme.comment.page.tag;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class SearchResultListCell extends BaseFriendsListCell<j> {

    /* renamed from: j  reason: collision with root package name */
    private final h f72158j = i.a((h.f.a.a) a.f72159a);

    static {
        Covode.recordClassIndex(44398);
    }

    private final IIMService c() {
        return (IIMService) this.f72158j.getValue();
    }

    static final class a extends m implements h.f.a.a<IIMService> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f72159a = new a();

        static {
            Covode.recordClassIndex(44399);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IIMService invoke() {
            return IMService.createIIMServicebyMonsterPlugin(false);
        }
    }

    /* access modifiers changed from: private */
    public void a(j jVar) {
        l.d(jVar, "");
        super.a((g) jVar);
        IIMService c2 = c();
        if (c2 != null) {
            View view = this.itemView;
            l.b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.csg);
            l.b(tuxTextView, "");
            c2.setHighlightText(tuxTextView, a().a(jVar.f72258a), jVar.f72265c);
        }
        IIMService c3 = c();
        if (c3 != null) {
            View view2 = this.itemView;
            l.b(view2, "");
            TuxTextView tuxTextView2 = (TuxTextView) view2.findViewById(R.id.al5);
            l.b(tuxTextView2, "");
            c3.setHighlightText(tuxTextView2, a().b(jVar.f72258a), jVar.f72265c);
        }
    }
}
