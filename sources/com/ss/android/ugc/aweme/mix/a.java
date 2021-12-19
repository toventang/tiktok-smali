package com.ss.android.ugc.aweme.mix;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class a extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f109705a;

    static {
        Covode.recordClassIndex(70237);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f109705a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f109705a == null) {
            this.f109705a = new SparseArray();
        }
        View view = (View) this.f109705a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f109705a.put(i2, findViewById);
        return findViewById;
    }

    public abstract Fragment a();

    /* renamed from: com.ss.android.ugc.aweme.mix.a$a  reason: collision with other inner class name */
    static final class C2811a extends m implements b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2811a f109706a = new C2811a();

        static {
            Covode.recordClassIndex(70238);
        }

        C2811a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f109708a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C2811a.f109706a);
        super.onCreate(bundle);
        setContentView(R.layout.akm);
        getSupportFragmentManager().a().a(R.anim.dq, R.anim.dx, 0, R.anim.dx).b(R.id.b94, a(), "TAG_CONTAINER").c();
    }
}
