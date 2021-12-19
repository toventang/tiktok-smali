package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.q;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class o extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    public static final int f117470e = 9;

    /* renamed from: f  reason: collision with root package name */
    public static final a f117471f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f117472a;

    /* renamed from: b  reason: collision with root package name */
    public String f117473b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f117474c;

    /* renamed from: d  reason: collision with root package name */
    public final a f117475d = new a(this.f117472a, this.f117473b);

    /* renamed from: g  reason: collision with root package name */
    private View f117476g;

    /* renamed from: h  reason: collision with root package name */
    private SparseArray f117477h;

    public final View a(int i2) {
        if (this.f117477h == null) {
            this.f117477h = new SparseArray();
        }
        View view = (View) this.f117477h.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f117477h.put(i2, findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75884);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f117479a;

        static {
            Covode.recordClassIndex(75889);
        }

        d(o oVar) {
            this.f117479a = oVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f117479a.f117474c;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    public final void a() {
        i supportFragmentManager;
        e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.c();
        }
    }

    static {
        Covode.recordClassIndex(75883);
    }

    public o() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        this.f117472a = curUser.getUid();
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        User curUser2 = g3.getCurUser();
        l.b(curUser2, "");
        this.f117473b = curUser2.getSecUid();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ViewGroup publishAddVideoContainer = AVExternalServiceImpl.a().publishService().getPublishAddVideoContainer(getActivity());
        this.f117474c = publishAddVideoContainer;
        if (publishAddVideoContainer != null) {
            publishAddVideoContainer.postDelayed(new d(this), 300);
        }
        AVExternalServiceImpl.a().publishService().setDestroyFlag(getActivity());
        SparseArray sparseArray = this.f117477h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f117478a;

        static {
            Covode.recordClassIndex(75885);
        }

        b(o oVar) {
            this.f117478a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117478a.a();
        }
    }

    static final class c extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(75886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.a(this.this$0, (h.f.a.b<? super com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>) new h.f.a.b<com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c>, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.o.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(75887);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar) {
                    com.bytedance.assem.arch.core.i<com.bytedance.assem.arch.extensions.c> iVar2 = iVar;
                    l.d(iVar2, "");
                    iVar2.a(new c(this.this$0.this$0.f117472a, this.this$0.this$0.f117473b, this.this$0.this$0));
                    return z.f158842a;
                }
            });
            assembler2.b(this.this$0, new h.f.a.b<q, z>(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.o.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(75888);
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
                    qVar2.a(ab.a(com.ss.android.ugc.aweme.profile.assem.a.class));
                    qVar2.f25596b = new com.ss.android.ugc.aweme.profile.assem.a();
                    qVar2.f25599e = (LinearLayout) this.this$0.this$0.a(R.id.cb9);
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
        ImageView imageView = (ImageView) a(R.id.a7n);
        this.f117476g = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new b(this));
        }
        com.bytedance.assem.arch.extensions.d.a(this, new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.aoc, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == f117470e && i3 == -1) {
            AVExternalServiceImpl.a().publishService().addMyVideoChain(getActivity(), this.f117475d.f117387a, this.f117475d.f117388b, this.f117475d.f117391e, this.f117475d.f117389c, this.f117475d.f117390d, "click_preview", this.f117475d.f117392f, this.f117475d.f117393g);
            a();
            ViewGroup viewGroup = this.f117474c;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }
}
