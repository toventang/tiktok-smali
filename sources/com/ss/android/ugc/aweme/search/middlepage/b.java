package com.ss.android.ugc.aweme.search.middlepage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.ss.android.ugc.aweme.discover.ui.ag;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b extends RecyclerView.ViewHolder implements ag {

    /* renamed from: c  reason: collision with root package name */
    public static final a f121478c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<com.bytedance.ies.powerlist.b.a> f121479a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final al.c f121480b;

    /* renamed from: d  reason: collision with root package name */
    private PowerList f121481d;

    static {
        Covode.recordClassIndex(79140);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79141);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view, al.c cVar) {
        super(view);
        l.d(view, "");
        this.f121480b = cVar;
        View findViewById = view.findViewById(R.id.d7z);
        l.b(findViewById, "");
        this.f121481d = (PowerList) findViewById;
        this.f121481d.setItemAnimator(null);
        this.f121481d.a(VisitedAccountCell.class, VisitedAccountTitleCell.class);
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ag
    public final void a(VisitedAccount visitedAccount, int i2) {
        String str;
        if (i2 < this.f121481d.getState().b()) {
            al.c cVar = this.f121480b;
            if (cVar != null) {
                cVar.a(visitedAccount, i2);
            }
            this.f121481d.getState().a(i2);
            SuggestWordsApi.a aVar = new SuggestWordsApi.a();
            if (visitedAccount != null) {
                str = visitedAccount.getUid();
            } else {
                str = null;
            }
            aVar.f80823h = str;
            SuggestWordsApi.b(aVar);
            if (this.f121481d.getState().b() == 1) {
                this.f121481d.getState().a();
            }
        }
    }

    public final void a(List<VisitedAccount> list, String str) {
        if (list != null) {
            this.f121479a.clear();
            this.f121479a.add(new e());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f121479a.add(new d(it.next(), str, this));
            }
            this.f121481d.getState().a();
            this.f121481d.getState().a(this.f121479a);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.ui.ag
    public final void a(VisitedAccount visitedAccount, String str, int i2) {
        al.c cVar = this.f121480b;
        if (cVar != null) {
            cVar.a(visitedAccount, str, i2);
        }
    }
}
