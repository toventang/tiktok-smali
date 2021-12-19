package com.bytedance.android.livesdk.g;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private static final String f17825a = f.class.getCanonicalName();

    /* renamed from: b  reason: collision with root package name */
    private Context f17826b;

    /* renamed from: c  reason: collision with root package name */
    private View f17827c;

    /* renamed from: d  reason: collision with root package name */
    private Bundle f17828d;

    /* renamed from: e  reason: collision with root package name */
    private List<a> f17829e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    private int f17830f = 0;

    static {
        Covode.recordClassIndex(9896);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f17830f = 4;
        Iterator<a> it = this.f17829e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f17830f = 3;
        Iterator<a> it = this.f17829e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f17830f = 2;
        Iterator<a> it = this.f17829e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f17830f = 5;
        Iterator<a> it = this.f17829e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.f17830f != 6) {
            this.f17830f = 6;
            for (a aVar : this.f17829e) {
                aVar.a();
            }
            this.f17829e.clear();
            super.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Iterator<a> it = this.f17829e.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17830f = 1;
        for (a aVar : this.f17829e) {
            aVar.a(this.f17826b, this.f17827c);
        }
    }

    private void a(Context context, View view, Bundle bundle) {
        this.f17826b = context;
        this.f17827c = view;
        this.f17828d = bundle;
    }

    public static f a(Fragment fragment, View view, Bundle bundle) {
        return a(fragment.getChildFragmentManager(), fragment.getContext(), view, bundle);
    }

    private static f a(i iVar, Context context, View view, Bundle bundle) {
        f fVar = new f();
        fVar.a(context, view, bundle);
        iVar.a().a(fVar, f17825a).e();
        return fVar;
    }
}
