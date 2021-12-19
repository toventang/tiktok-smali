package com.bytedance.hybrid.spark.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.a.c;
import com.bytedance.hybrid.spark.a.g;
import h.f.b.l;
import java.util.HashMap;

public final class a extends Fragment implements g {

    /* renamed from: b  reason: collision with root package name */
    public static final C0659a f31215b = new C0659a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public c f31216a;

    /* renamed from: c  reason: collision with root package name */
    private SparkContext f31217c;

    /* renamed from: d  reason: collision with root package name */
    private c f31218d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f31219e;

    static {
        Covode.recordClassIndex(18116);
    }

    /* renamed from: com.bytedance.hybrid.spark.page.a$a  reason: collision with other inner class name */
    public static final class C0659a {
        static {
            Covode.recordClassIndex(18117);
        }

        private C0659a() {
        }

        public /* synthetic */ C0659a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        c cVar = this.f31216a;
        if (cVar != null) {
            return cVar.d();
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        c cVar = this.f31216a;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f31219e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.hybrid.spark.a.g
    public final void b() {
        com.bytedance.hybrid.spark.e.c.a("SparkFragment", "refresh", this.f31217c);
        c cVar = this.f31216a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.c(view, "");
        super.onViewCreated(view, bundle);
        c cVar = this.f31216a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SparkContext sparkContext;
        c cVar;
        l.c(layoutInflater, "");
        Bundle arguments = getArguments();
        c cVar2 = null;
        if (arguments != null) {
            sparkContext = (SparkContext) arguments.getParcelable("sparkContext");
        } else {
            sparkContext = null;
        }
        this.f31217c = sparkContext;
        com.bytedance.hybrid.spark.e.c.a("SparkFragment", "onCreateView", sparkContext);
        Context context = getContext();
        if (context != null) {
            l.a((Object) context, "");
            cVar = new c(context, (byte) 0);
        } else {
            cVar = null;
        }
        this.f31216a = cVar;
        SparkContext sparkContext2 = this.f31217c;
        if (!(sparkContext2 == null || cVar == null)) {
            cVar.a(sparkContext2);
        }
        SparkContext sparkContext3 = this.f31217c;
        if (sparkContext3 != null) {
            cVar2 = (c) sparkContext3.a(c.class);
        }
        this.f31218d = cVar2;
        return this.f31216a;
    }
}
