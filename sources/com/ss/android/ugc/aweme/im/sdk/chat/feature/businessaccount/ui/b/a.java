package com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import h.c.f;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.ah;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.cd;

public abstract class a extends com.bytedance.ies.foundation.activity.a implements am {

    /* renamed from: a  reason: collision with root package name */
    private bz f100480a;

    /* renamed from: b  reason: collision with root package name */
    private HashMap f100481b;

    static {
        Covode.recordClassIndex(64228);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f100481b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public View _$_findCachedViewById(int i2) {
        if (this.f100481b == null) {
            this.f100481b = new HashMap();
        }
        View view = (View) this.f100481b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f100481b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // kotlinx.coroutines.am
    public final f a() {
        ah ahVar = bf.f159041b;
        bz bzVar = this.f100480a;
        if (bzVar == null) {
            l.a("job");
        }
        return ahVar.plus(bzVar);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        super.onDestroy();
        bz bzVar = this.f100480a;
        if (bzVar == null) {
            l.a("job");
        }
        bzVar.a((CancellationException) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.b.a$a  reason: collision with other inner class name */
    static final class C2472a extends m implements b<BaseActivityViewModel, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2472a f100482a = new C2472a();

        static {
            Covode.recordClassIndex(64229);
        }

        C2472a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            l.d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(AnonymousClass1.f100483a);
            return z.f158842a;
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        activityConfiguration(C2472a.f100482a);
        super.onCreate(bundle);
        this.f100480a = cd.a(null);
    }
}
