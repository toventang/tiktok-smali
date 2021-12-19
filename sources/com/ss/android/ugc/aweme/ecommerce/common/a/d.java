package com.ss.android.ugc.aweme.ecommerce.common.a;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ecommerce.router.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public class d extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    private m f85731a;

    static {
        Covode.recordClassIndex(53612);
    }

    static final class a extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(53613);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            d.super.onBackPressed();
            return z.f158842a;
        }
    }

    public void onBackPressed() {
        m mVar = this.f85731a;
        if (mVar != null) {
            mVar.a(new a(this));
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.google.android.material.bottomsheet.a
    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.vn);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public /* synthetic */ d(Context context) {
        this(context, R.style.vo);
    }

    public final void a(m mVar) {
        l.d(mVar, "");
        this.f85731a = mVar;
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(View view) {
        l.d(view, "");
        super.setContentView(view);
        a(view);
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.setStatusBarColor(0);
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h, android.app.Dialog
    public void setContentView(int i2) {
        MethodCollector.i(7480);
        View inflate = View.inflate(getContext(), i2, null);
        super.setContentView(inflate);
        a(inflate);
        MethodCollector.o(7480);
    }

    private final void a(View view) {
        ViewParent viewParent;
        while (!(!l.a((Object) Build.MODEL, (Object) "M2004J19C"))) {
            if (view != null) {
                view.setFitsSystemWindows(false);
            }
            ViewGroup viewGroup = null;
            if (view != null) {
                viewParent = view.getParent();
            } else {
                viewParent = null;
            }
            if (viewParent instanceof ViewGroup) {
                viewGroup = viewParent;
            }
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup2 != null) {
                view = viewGroup2;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, int i2) {
        super(context, i2);
        l.d(context, "");
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l.d(view, "");
        super.setContentView(view, layoutParams);
        a(view);
    }
}
