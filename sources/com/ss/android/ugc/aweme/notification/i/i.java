package com.ss.android.ugc.aweme.notification.i;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.a.d;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class i extends com.ss.android.ugc.aweme.base.f.a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final h f113782a = h.i.a((h.f.a.a) b.f113785a);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f113783b;

    static {
        Covode.recordClassIndex(73156);
    }

    public View a(int i2) {
        if (this.f113783b == null) {
            this.f113783b = new SparseArray();
        }
        View view = (View) this.f113783b.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f113783b.put(i2, findViewById);
        return findViewById;
    }

    public void n() {
        SparseArray sparseArray = this.f113783b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final Map<Class<? extends a>, a> o() {
        return (Map) this.f113782a.getValue();
    }

    public List<a> l() {
        return z.INSTANCE;
    }

    static final class b extends m implements h.f.a.a<Map<Class<? extends a>, a>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113785a = new b();

        static {
            Covode.recordClassIndex(73158);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Class<? extends a>, a> invoke() {
            return new LinkedHashMap();
        }
    }

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public i f113784c;

        static {
            Covode.recordClassIndex(73157);
        }

        public void a() {
        }

        public void a(int i2) {
        }

        public void a(View view, Bundle bundle) {
            l.d(view, "");
        }

        public void bZ_() {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        /* access modifiers changed from: protected */
        public final i j() {
            i iVar = this.f113784c;
            if (iVar == null) {
                l.a("fragment");
            }
            return iVar;
        }

        /* access modifiers changed from: protected */
        public final e k() {
            i iVar = this.f113784c;
            if (iVar == null) {
                l.a("fragment");
            }
            return iVar.getActivity();
        }

        /* access modifiers changed from: protected */
        public final e l() {
            e k2 = k();
            if (k2 == null) {
                l.b();
            }
            return k2;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
            if (r0 == null) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final <T extends android.view.View> T c(int r3) {
            /*
                r2 = this;
                com.ss.android.ugc.aweme.notification.i.i r1 = r2.f113784c
                if (r1 != 0) goto L_0x0009
                java.lang.String r0 = "fragment"
                h.f.b.l.a(r0)
            L_0x0009:
                android.view.View r0 = r1.getView()
                if (r0 == 0) goto L_0x0019
                android.view.View r0 = r0.findViewById(r3)
                if (r0 != 0) goto L_0x0018
            L_0x0015:
                h.f.b.l.b()
            L_0x0018:
                return r0
            L_0x0019:
                r0 = 0
                goto L_0x0015
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.i.i.a.c(int):android.view.View");
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        o().clear();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onDestroyView() {
        super.onDestroyView();
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().bZ_();
        }
        n();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @Override // com.bytedance.hox.a.d
    public void b(Bundle bundle) {
        l.d(bundle, "");
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends com.ss.android.ugc.aweme.notification.i.i$a> */
    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        for (T t : l()) {
            l.d(this, "");
            t.f113784c = this;
            o().put(t.getClass(), t);
        }
    }

    @Override // com.bytedance.hox.a.d
    public void a(Bundle bundle) {
        l.d(bundle, "");
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().a(view, bundle);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator<T> it = o().values().iterator();
        while (it.hasNext()) {
            it.next().a(i2);
        }
    }
}
