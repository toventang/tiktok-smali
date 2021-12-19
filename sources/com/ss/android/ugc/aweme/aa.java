package com.ss.android.ugc.aweme;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public class aa extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static ab f62438b = ab.NO_TYPE;

    /* renamed from: c  reason: collision with root package name */
    public static final a f62439c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public bl f62440a;

    /* renamed from: d  reason: collision with root package name */
    private SparseArray f62441d;

    public View a(int i2) {
        if (this.f62441d == null) {
            this.f62441d = new SparseArray();
        }
        View view = (View) this.f62441d.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f62441d.put(i2, findViewById);
        return findViewById;
    }

    public void a() {
        SparseArray sparseArray = this.f62441d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38419);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(ab abVar) {
            l.d(abVar, "");
            aa.f62438b = abVar;
        }
    }

    static {
        Covode.recordClassIndex(38418);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            e activity = getActivity();
            if (!(activity instanceof bl)) {
                activity = null;
            }
            this.f62440a = (bl) activity;
        }
    }
}
