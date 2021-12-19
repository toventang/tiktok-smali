package com.bytedance.android.livesdk.qa;

import androidx.h.d;
import androidx.h.i;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.l.c;

public class QuestionViewModel extends PagingViewModel<af> {

    /* renamed from: a  reason: collision with root package name */
    c<Object> f20318a = new c<>();

    /* renamed from: i  reason: collision with root package name */
    LiveData<i<af>> f20319i;

    /* renamed from: j  reason: collision with root package name */
    public ae f20320j;

    /* renamed from: k  reason: collision with root package name */
    d.a f20321k;

    /* renamed from: l  reason: collision with root package name */
    i.d f20322l;

    static {
        Covode.recordClassIndex(11998);
    }

    @Override // com.bytedance.android.live.core.paging.viewmodel.PagingViewModel
    public final void b() {
        this.f20318a.onNext(com.bytedance.android.livesdk.util.rxutils.i.f22198c);
    }

    public QuestionViewModel() {
        i.d.a aVar = new i.d.a();
        aVar.f3168b = 2;
        aVar.f3167a = 50;
        this.f20322l = aVar.a();
    }

    public final void a(Room room, boolean z, boolean z2) {
        this.f20320j = new ae(this.f9214e, this.f9212c, this.f9213d, ((PagingViewModel) this).f9211b, this.f20318a);
        this.f20321k = new d.a() {
            /* class com.bytedance.android.livesdk.qa.QuestionViewModel.AnonymousClass1 */

            static {
                Covode.recordClassIndex(11999);
            }

            @Override // androidx.h.d.a
            public final d a() {
                return QuestionViewModel.this.f20320j;
            }
        };
        this.f20320j.a(room);
        this.f20320j.f20330h = z;
        this.f20320j.f20331i = z2;
    }
}
