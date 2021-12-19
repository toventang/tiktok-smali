package com.ss.android.ugc.aweme.tools.draft.ftc.pages;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.draft.ftc.util.e;
import com.ss.android.ugc.aweme.tools.draft.ftc.viewmodel.KidsDraftOptionViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;

public final class d extends com.google.android.material.bottomsheet.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f139579a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f139580b;

    static {
        Covode.recordClassIndex(91251);
    }

    private View a(int i2) {
        if (this.f139580b == null) {
            this.f139580b = new HashMap();
        }
        View view = (View) this.f139580b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f139580b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final KidsDraftOptionViewModel a() {
        return (KidsDraftOptionViewModel) this.f139579a.getValue();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f139580b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class a extends m implements h.f.a.a<KidsDraftOptionViewModel> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(91252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ KidsDraftOptionViewModel invoke() {
            ac a2 = new ad(this.this$0.requireActivity(), new ad.b() {
                /* class com.ss.android.ugc.aweme.tools.draft.ftc.pages.d.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(91253);
                }

                @Override // androidx.lifecycle.ad.b
                public final <T extends ac> T a(Class<T> cls) {
                    l.d(cls, "");
                    return new KidsDraftOptionViewModel();
                }
            }).a(KidsDraftOptionViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    public final int b() {
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            if (arguments == null) {
                l.b();
            }
            if (arguments.containsKey("draft_selected_video_index")) {
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    l.b();
                }
                return arguments2.getInt("draft_selected_video_index", -1);
            }
        }
        return -1;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        super.onActivityCreated(bundle);
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        View view3 = view2;
        if (view3 != null) {
            view3.setBackgroundColor(0);
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f139581a;

        static {
            Covode.recordClassIndex(91254);
        }

        b(d dVar) {
            this.f139581a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139581a.a().f139772a.postValue(new com.ss.android.ugc.aweme.tools.draft.ftc.util.a<>(new e.c(this.f139581a.b())));
            this.f139581a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f139582a;

        static {
            Covode.recordClassIndex(91255);
        }

        c(d dVar) {
            this.f139582a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139582a.a().f139772a.postValue(new com.ss.android.ugc.aweme.tools.draft.ftc.util.a<>(new e.b(this.f139582a.b())));
            this.f139582a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.pages.d$d  reason: collision with other inner class name */
    static final class View$OnClickListenerC3685d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f139583a;

        static {
            Covode.recordClassIndex(91256);
        }

        View$OnClickListenerC3685d(d dVar) {
            this.f139583a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f139583a.a().f139772a.postValue(new com.ss.android.ugc.aweme.tools.draft.ftc.util.a<>(new e.a(this.f139583a.b())));
            this.f139583a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        super.onDismiss(dialogInterface);
        com.ss.android.ugc.tools.f.b bVar = new com.ss.android.ugc.tools.f.b();
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        Serializable serializable = null;
        if (e2 != null) {
            str = e2.c();
        } else {
            str = null;
        }
        com.ss.android.ugc.tools.f.b a2 = bVar.a("author_id", str);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("draft_current_video");
        }
        Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        r.a("close_more_button", a2.a("group_id", ((VideoPublishEditModel) serializable).creationId).f149193a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((LinearLayout) a(R.id.co_)).setOnClickListener(new b(this));
        ((LinearLayout) a(R.id.co9)).setOnClickListener(new c(this));
        ((LinearLayout) a(R.id.co8)).setOnClickListener(new View$OnClickListenerC3685d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ads, viewGroup, false);
    }
}
