package com.ss.android.ugc.aweme.shortvideo.page.linkanchor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.f.b.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.i;

public final class b {
    static {
        Covode.recordClassIndex(85062);
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f129589a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f129590b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LiveData f129591c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ LiveData f129592d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ am f129593e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f129594f = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

        static {
            Covode.recordClassIndex(85063);
        }

        a(z.e eVar, r rVar, LiveData liveData, LiveData liveData2, am amVar) {
            this.f129589a = eVar;
            this.f129590b = rVar;
            this.f129591c = liveData;
            this.f129592d = liveData2;
            this.f129593e = amVar;
        }

        @Override // androidx.lifecycle.u
        public final void onChanged(T t) {
            T t2 = this.f129589a.element;
            if (t2 != null) {
                t2.a(null);
            }
            this.f129589a.element = (T) i.a(this.f129593e, null, null, new m<am, d<? super h.z>, Object>(this, null) {
                /* class com.ss.android.ugc.aweme.shortvideo.page.linkanchor.b.a.AnonymousClass1 */
                int label;
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(85064);
                }

                {
                    this.this$0 = r2;
                }

                @Override // h.c.b.a.a
                public final d<h.z> create(Object obj, d<?> dVar) {
                    l.d(dVar, "");
                    return 
                }
