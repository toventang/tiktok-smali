package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.e.f;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;

public class c extends a implements SectionIndexer {

    /* renamed from: m  reason: collision with root package name */
    public SectionIndexer f103208m;
    public b n = new b();

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f103210a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f103211b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f103212c;

        /* renamed from: d  reason: collision with root package name */
        public String f103213d;

        static {
            Covode.recordClassIndex(66171);
        }
    }

    static {
        Covode.recordClassIndex(66169);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public /* synthetic */ a.b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public Object[] getSections() {
        SectionIndexer sectionIndexer = this.f103208m;
        if (sectionIndexer != null) {
            return sectionIndexer.getSections();
        }
        return new String[]{" "};
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public int getItemCount() {
        if (this.f103175c != null) {
            return this.f103175c.size() + b();
        }
        return b();
    }

    public int getPositionForSection(int i2) {
        SectionIndexer sectionIndexer = this.f103208m;
        if (sectionIndexer != null) {
            return sectionIndexer.getPositionForSection(i2);
        }
        return -1;
    }

    public int getSectionForPosition(int i2) {
        SectionIndexer sectionIndexer = this.f103208m;
        if (sectionIndexer != null) {
            return sectionIndexer.getSectionForPosition(i2);
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public int getItemViewType(int i2) {
        if (b(i2)) {
            return 1;
        }
        return super.getItemViewType(i2 - b());
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public final String a(IMContact iMContact) {
        IMUser a2 = f.a(iMContact);
        if (a2 == null) {
            return null;
        }
        if (TextUtils.isEmpty(a2.getRemarkName()) || TextUtils.isEmpty(a2.getNickName())) {
            return a2.getSignature();
        }
        return d.a().getString(R.string.cgi, a2.getNickName());
    }

    public final b c(int i2) {
        if (this.n.f103210a == i2) {
            return this.n;
        }
        this.n.f103210a = i2;
        int sectionForPosition = getSectionForPosition(i2);
        boolean z = false;
        if (sectionForPosition == -1 || getPositionForSection(sectionForPosition) != i2) {
            this.n.f103211b = false;
            this.n.f103213d = null;
        } else {
            this.n.f103211b = true;
            this.n.f103213d = (String) getSections()[sectionForPosition];
        }
        b bVar = this.n;
        if (getPositionForSection(sectionForPosition + 1) - 1 == i2) {
            z = true;
        }
        bVar.f103212c = z;
        return this.n;
    }

    public class a extends a.b {
        static {
            Covode.recordClassIndex(66170);
        }

        public a(View view) {
            super(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public a.b a(ViewGroup viewGroup, int i2) {
        return new a(this.f103179g);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public /* synthetic */ void onBindViewHolder(a.b bVar, int i2) {
        onBindViewHolder(bVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public final void a(a.b bVar, int i2) {
        if (!b(i2)) {
            int b2 = i2 - b();
            bVar.a((IMContact) this.f103175c.get(b2), b2);
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6594);
        a.b a3 = cVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(6594);
        return a3;
    }
}
