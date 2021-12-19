package com.ss.android.ugc.aweme.ecommerce.common;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.ss.android.ugc.aweme.base.a.f;
import com.ss.android.ugc.aweme.ecommerce.track.c;
import h.f.b.l;
import h.f.b.m;
import h.z;

public abstract class b extends com.bytedance.ies.foundation.activity.a implements f {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray f85733a;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.base.a.b f85734g;

    static {
        Covode.recordClassIndex(53615);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f85733a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f85733a == null) {
            this.f85733a = new SparseArray();
        }
        View view = (View) this.f85733a.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f85733a.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
    }

    @Override // com.ss.android.ugc.aweme.base.a.f
    public void setActivityResultListener(com.ss.android.ugc.aweme.base.a.b bVar) {
        l.d(bVar, "");
        this.f85734g = bVar;
    }

    static final class a extends m implements h.f.a.b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f85735a = new a();

        static {
            Covode.recordClassIndex(53616);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f85736a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        activityConfiguration(a.f85735a);
        c.a("rd_tiktokec_android_activity_create", new C2052b(this, bundle));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.common.b$b  reason: collision with other inner class name */
    static final class C2052b extends m implements h.f.a.b<c.a, z> {
        final /* synthetic */ Bundle $savedInstanceState;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(53618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2052b(b bVar, Bundle bundle) {
            super(1);
            this.this$0 = bVar;
            this.$savedInstanceState = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(c.a aVar) {
            int i2;
            c.a aVar2 = aVar;
            l.d(aVar2, "");
            if (this.$savedInstanceState == null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            aVar2.b("is_bundle_null", Integer.valueOf(i2));
            String simpleName = this.this$0.getClass().getSimpleName();
            l.b(simpleName, "");
            aVar2.b("class_name", simpleName);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        com.ss.android.ugc.aweme.base.a.b bVar = this.f85734g;
        if (bVar != null) {
            bVar.a(i2, i3, intent);
        }
    }
}
