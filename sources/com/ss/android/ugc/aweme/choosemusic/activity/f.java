package com.ss.android.ugc.aweme.choosemusic.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.h.v;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.scene.j;
import com.bytedance.scene.n;
import com.ss.android.ugc.aweme.choosemusic.model.a;
import com.ss.android.ugc.aweme.choosemusic.model.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final h f70367a = i.a((h.f.a.a) a.f70368a);

    public static final int a() {
        return ((Number) f70367a.getValue()).intValue();
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f70368a = new a();

        static {
            Covode.recordClassIndex(43401);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(v.a());
        }
    }

    static {
        Covode.recordClassIndex(43400);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.activity.f$f  reason: collision with other inner class name */
    public static final class C1592f extends m implements h.f.a.a<z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ LiveData $closeChooseMusicPageAnimState;
        final /* synthetic */ n $delegate;
        final /* synthetic */ FrameLayout $layout;
        final /* synthetic */ LiveData $openChooseMusicPageAnimState;
        final /* synthetic */ h.f.a.m $resultCallback;
        final /* synthetic */ ViewGroup $rootView;

        static {
            Covode.recordClassIndex(43406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1592f(LiveData liveData, androidx.fragment.app.e eVar, n nVar, ViewGroup viewGroup, FrameLayout frameLayout, LiveData liveData2, h.f.a.m mVar) {
            super(0);
            this.$openChooseMusicPageAnimState = liveData;
            this.$activity = eVar;
            this.$delegate = nVar;
            this.$rootView = viewGroup;
            this.$layout = frameLayout;
            this.$closeChooseMusicPageAnimState = liveData2;
            this.$resultCallback = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            MethodCollector.i(3893);
            this.$openChooseMusicPageAnimState.removeObservers(this.$activity);
            this.$delegate.b();
            this.$rootView.removeView(this.$layout);
            this.$closeChooseMusicPageAnimState.removeObservers(this.$activity);
            this.$resultCallback.invoke(0, null);
            z zVar = z.f158842a;
            MethodCollector.o(3893);
            return zVar;
        }
    }

    public static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f70369a;

        static {
            Covode.recordClassIndex(43402);
        }

        public b(h.f.a.a aVar) {
            this.f70369a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (l.a(obj, a.C1596a.f70585a)) {
                this.f70369a.invoke();
            }
        }
    }

    public static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f70370a;

        static {
            Covode.recordClassIndex(43403);
        }

        public c(h.f.a.a aVar) {
            this.f70370a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            if (l.a(obj, a.C1596a.f70585a)) {
                this.f70370a.invoke();
            }
        }
    }

    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f70371a;

        static {
            Covode.recordClassIndex(43404);
        }

        public d(h.f.a.b bVar) {
            this.f70371a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            h.f.a.b bVar = this.f70371a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    public static final class e extends m implements h.f.a.b<s, z> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ LiveData $chooseMusicResult;
        final /* synthetic */ h.f.a.m $resultCallback;

        static {
            Covode.recordClassIndex(43405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(LiveData liveData, androidx.fragment.app.e eVar, h.f.a.m mVar) {
            super(1);
            this.$chooseMusicResult = liveData;
            this.$activity = eVar;
            this.$resultCallback = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(s sVar) {
            s sVar2 = sVar;
            l.d(sVar2, "");
            if (sVar2.f70682a != Integer.MAX_VALUE) {
                this.$chooseMusicResult.removeObservers(this.$activity);
                this.$resultCallback.invoke(Integer.valueOf(sVar2.f70682a), sVar2.f70683b);
            }
            return z.f158842a;
        }
    }

    public static final class g implements com.bytedance.scene.l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f70372a;

        static {
            Covode.recordClassIndex(43407);
        }

        public g(e eVar) {
            this.f70372a = eVar;
        }

        @Override // com.bytedance.scene.l
        public final j instantiateScene(ClassLoader classLoader, String str, Bundle bundle) {
            l.d(classLoader, "");
            l.d(str, "");
            if (TextUtils.equals("com.ss.android.ugc.aweme.choosemusic.activity.e", str)) {
                return this.f70372a;
            }
            return null;
        }
    }
}
