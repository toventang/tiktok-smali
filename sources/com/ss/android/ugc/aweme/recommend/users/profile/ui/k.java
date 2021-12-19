package com.ss.android.ugc.aweme.recommend.users.profile.ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.i;
import com.bytedance.assem.arch.core.q;
import com.bytedance.assem.arch.extensions.d;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.d.c;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class k extends Fragment implements c {

    /* renamed from: a  reason: collision with root package name */
    public User f120171a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f120172b;

    static {
        Covode.recordClassIndex(78158);
    }

    public final View a(int i2) {
        if (this.f120172b == null) {
            this.f120172b = new SparseArray();
        }
        View view = (View) this.f120172b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f120172b.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.c
    public final RecyclerView a() {
        return (RecyclerView) a(R.id.d7z);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f120172b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.d.c
    public final void a(User user) {
        this.f120171a = user;
    }

    static final class a extends m implements b<Assembler, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(78159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (b<? super i<com.bytedance.assem.arch.extensions.c>, z>) new b<i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.recommend.users.profile.ui.k.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(78160);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(i<com.bytedance.assem.arch.extensions.c> iVar) {
                    i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new l(this.this$0.this$0.f120171a));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.recommend.users.profile.ui.k.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(78161);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(q qVar) {
                    q qVar2 = qVar;
                    l.d(qVar2, "");
                    qVar2.a(ab.a(b.class));
                    qVar2.f25596b = new b();
                    qVar2.f25599e = (RelativeLayout) this.this$0.this$0.a(R.id.fdj);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        d.a(this, new a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a1r, viewGroup, false);
    }
}
