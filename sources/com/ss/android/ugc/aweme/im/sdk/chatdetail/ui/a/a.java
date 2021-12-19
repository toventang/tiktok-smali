package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.ChooseAdminController;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.List;

public final class a extends com.bytedance.ies.foundation.fragment.a {

    /* renamed from: e  reason: collision with root package name */
    public IMUser f101554e;

    /* renamed from: f  reason: collision with root package name */
    public final Activity f101555f;

    /* renamed from: g  reason: collision with root package name */
    public final List<IMUser> f101556g;

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.b<IMUser, z> f101557h;

    /* renamed from: i  reason: collision with root package name */
    private final h f101558i = i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private HashMap f101559j;

    static {
        Covode.recordClassIndex(64932);
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final View a(int i2) {
        if (this.f101559j == null) {
            this.f101559j = new HashMap();
        }
        View view = (View) this.f101559j.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f101559j.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final void br_() {
        HashMap hashMap = this.f101559j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    public final ChooseAdminController c() {
        return (ChooseAdminController) this.f101558i.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        br_();
    }

    static final class b extends m implements h.f.a.a<ChooseAdminController> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(64934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ChooseAdminController invoke() {
            return new ChooseAdminController(this.this$0.f101555f, new h.f.a.b<IMUser, z>(this) {
                /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(64935);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(IMUser iMUser) {
                    final IMUser iMUser2 = iMUser;
                    l.d(iMUser2, "");
                    this.this$0.this$0.f101554e = iMUser2;
                    TuxButton tuxButton = (TuxButton) this.this$0.this$0.a(R.id.a5o);
                    l.b(tuxButton, "");
                    tuxButton.setEnabled(true);
                    ((TuxButton) this.this$0.this$0.a(R.id.a5o)).setOnClickListener(new View.OnClickListener(this) {
                        /* class com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a.b.AnonymousClass1.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f101561a;

                        static {
                            Covode.recordClassIndex(64936);
                        }

                        {
                            this.f101561a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f101561a.this$0.this$0.f101557h.invoke(iMUser2);
                            a.b.a(this.f101561a.this$0.this$0, c.C1111c.f45283a);
                        }
                    });
                    this.this$0.this$0.c().setData(this.this$0.this$0.f101556g, iMUser2);
                    return z.f158842a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC2524a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f101560a;

        static {
            Covode.recordClassIndex(64933);
        }

        View$OnClickListenerC2524a(a aVar) {
            this.f101560a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.b.a(this.f101560a, c.d.f45284a);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((TuxIconView) a(R.id.a5n)).setOnClickListener(new View$OnClickListenerC2524a(this));
        ((EpoxyRecyclerView) a(R.id.a5q)).setController(c());
        RecyclerView recyclerView = (RecyclerView) a(R.id.a5q);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        c().setData(this.f101556g, this.f101554e);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a4h, viewGroup, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.IMUser, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Activity activity, List<? extends IMUser> list, h.f.a.b<? super IMUser, z> bVar) {
        l.d(activity, "");
        l.d(list, "");
        l.d(bVar, "");
        this.f101555f = activity;
        this.f101556g = list;
        this.f101557h = bVar;
    }
}
