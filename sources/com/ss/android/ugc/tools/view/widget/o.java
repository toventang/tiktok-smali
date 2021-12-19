package com.ss.android.ugc.tools.view.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.view.widget.b.d;
import com.ss.android.ugc.tools.view.widget.b.e;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.Map;

public final class o extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private d f150459a;

    static {
        Covode.recordClassIndex(98937);
    }

    public final void show() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            super.show();
            d dVar = this.f150459a;
            if (dVar != null) {
                dVar.setState(com.ss.android.ugc.tools.view.widget.b.a.LOADING);
            }
        }
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            d dVar = this.f150459a;
            if (dVar != null) {
                dVar.setVisibility(8);
            }
            d dVar2 = this.f150459a;
            if (dVar2 != null) {
                dVar2.setState(com.ss.android.ugc.tools.view.widget.b.a.NONE);
            }
        }
    }

    static final class a extends m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f150460a = new a();

        static {
            Covode.recordClassIndex(98938);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return e.a(viewGroup2);
        }
    }

    static final class b extends m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f150461a = new b();

        static {
            Covode.recordClassIndex(98939);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return e.a(viewGroup2, (h.f.a.m<? super TextView, ? super TextView, z>) null);
        }
    }

    static final class c extends m implements h.f.a.b<ViewGroup, View> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f150462a = new c();

        static {
            Covode.recordClassIndex(98940);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.d(viewGroup2, "");
            return e.a(viewGroup2, (q<? super TextView, ? super TextView, ? super TextView, z>) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Activity activity) {
        super(activity, R.style.a1q);
        l.d(activity, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Map a2 = ag.a(v.a(com.ss.android.ugc.tools.view.widget.b.a.LOADING, a.f150460a), v.a(com.ss.android.ugc.tools.view.widget.b.a.EMPTY, b.f150461a), v.a(com.ss.android.ugc.tools.view.widget.b.a.ERROR, c.f150462a));
        Context context = getContext();
        l.b(context, "");
        d dVar = new d(context, a2, com.ss.android.ugc.tools.view.widget.b.a.NONE, (byte) 0);
        this.f150459a = dVar;
        setContentView(dVar);
    }
}
