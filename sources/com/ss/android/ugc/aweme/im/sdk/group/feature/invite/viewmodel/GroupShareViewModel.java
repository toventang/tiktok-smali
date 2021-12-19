package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ac;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.GroupChatDetailActivity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.e;
import h.a.n;
import h.c.b.a.k;
import h.c.f;
import h.f.b.l;
import h.r;
import h.z;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class GroupShareViewModel extends ac implements au {

    /* renamed from: f  reason: collision with root package name */
    public static final b f102687f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f102688a;

    /* renamed from: b  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b> f102689b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public final t<e> f102690c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f102691d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public final String f102692e;

    /* renamed from: g  reason: collision with root package name */
    private final am f102693g = an.a(new a(CoroutineExceptionHandler.f158926c));

    static {
        Covode.recordClassIndex(65755);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
    }

    public static final class b {
        static {
            Covode.recordClassIndex(65757);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void a() {
        bz unused = kotlinx.coroutines.i.a(this.f102693g, bf.f159041b, null, new d(this, null), 2);
    }

    public final void b() {
        this.f102691d.postValue(true);
    }

    public static final class a extends h.c.a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(65756);
        }

        public a(f.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(f fVar, Throwable th) {
            com.ss.android.ugc.aweme.im.service.m.a.a(th);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.sharer.b, Boolean> {
        final /* synthetic */ GroupChatDetailActivity $activity;

        static {
            Covode.recordClassIndex(65758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(GroupChatDetailActivity groupChatDetailActivity) {
            super(1);
            this.$activity = groupChatDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.sharer.b bVar) {
            com.ss.android.ugc.aweme.sharer.b bVar2 = bVar;
            l.d(bVar2, "");
            return Boolean.valueOf(!bVar2.b(this.$activity));
        }
    }

    public GroupShareViewModel(String str) {
        l.d(str, "");
        this.f102692e = str;
        this.f102688a = a.C0745a.a().a(str);
    }

    static final class d extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ GroupShareViewModel this$0;

        static {
            Covode.recordClassIndex(65759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(GroupShareViewModel groupShareViewModel, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = groupShareViewModel;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new d(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b bVar;
            String str;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                try {
                    String str2 = this.this$0.f102692e;
                    this.label = 1;
                    obj = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.a().getGroupInviteInfo(str2).a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Exception e2) {
                    com.ss.android.ugc.aweme.im.service.m.a.a(e2);
                    bVar = null;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.b) obj;
            this.this$0.f102689b.postValue(bVar);
            com.ss.android.ugc.aweme.im.service.m.a.c("GroupShareViewModel", "response: ".concat(String.valueOf(bVar)));
            if (bVar != null && bVar.f102667e == null) {
                GroupShareViewModel groupShareViewModel = this.this$0;
                Activity a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.a.a();
                if (!(a2 instanceof GroupChatDetailActivity)) {
                    a2 = null;
                }
                GroupChatDetailActivity groupChatDetailActivity = (GroupChatDetailActivity) a2;
                if (groupChatDetailActivity != null) {
                    SharePackage.a aVar2 = new SharePackage.a();
                    String str3 = bVar.f102664b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    GroupSharePackage groupSharePackage = new GroupSharePackage(aVar2.e(str3).a("group"));
                    UrlModel urlModel = new UrlModel();
                    String[] strArr = new String[1];
                    com.ss.android.ugc.aweme.im.sdk.group.feature.invite.a.a aVar3 = bVar.f102666d;
                    if (aVar3 != null) {
                        str = aVar3.getAvatarUrl();
                    } else {
                        str = null;
                    }
                    strArr[0] = str;
                    urlModel.setUrlList(n.c(strArr));
                    groupSharePackage.f124595i.putSerializable("video_cover", urlModel);
                    e.b bVar2 = new e.b();
                    Bundle bundle = groupSharePackage.f124595i;
                    bundle.putString("invite_id", bVar.f102663a);
                    Long l2 = bVar.f102665c;
                    if (l2 != null) {
                        bundle.putLong("expired_at", l2.longValue());
                    }
                    bundle.putSerializable("group", bVar.f102666d);
                    com.ss.android.ugc.aweme.sharer.b a3 = ShareDependService.b.a(ShareDependService.a.a(), groupSharePackage, null, 6);
                    if (a3 != null) {
                        bVar2.f124662a.add(a3);
                    }
                    ah.f123352a.a(bVar2, (Activity) groupChatDetailActivity, true);
                    bVar2.a(new com.ss.android.ugc.aweme.share.improve.b.b());
                    bVar2.n = groupSharePackage;
                    e a4 = bVar2.a();
                    if (a4.f124652d) {
                        n.a((List) a4.f124649a, (h.f.a.b) new c(groupChatDetailActivity));
                    }
                    groupShareViewModel.f102690c.postValue(a4);
                }
            }
            return z.f158842a;
        }
    }
}
