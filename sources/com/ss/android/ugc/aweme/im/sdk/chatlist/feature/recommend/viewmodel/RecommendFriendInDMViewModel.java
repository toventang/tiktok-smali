package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.model.RecommendUserInDMBean;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.h;
import com.ss.android.ugc.aweme.im.sdk.common.controller.a.i;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.d.f;
import f.a.d.g;
import f.a.x;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class RecommendFriendInDMViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a f101994a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f101995b;

    /* renamed from: c  reason: collision with root package name */
    public final t<List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a>> f101996c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f101997d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.b.a f101998e = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.b.a();

    static {
        Covode.recordClassIndex(65261);
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f101995b.a();
    }

    public RecommendFriendInDMViewModel() {
        com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a aVar = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a();
        this.f101994a = aVar;
        i a2 = h.a();
        if (a2 != null) {
            boolean z = false;
            if (a2.f102182a == 0) {
                aVar.f101965a = false;
            } else if (System.currentTimeMillis() < a.C2542a.a().f101959a.getLong("next_session_time_ms", -1)) {
                aVar.f101965a = false;
            } else {
                aVar.f101965a = true;
                aVar.f101966b = a2.f102183b == 1 ? true : z;
            }
        }
        this.f101995b = new f.a.b.a();
        this.f101996c = new t<>();
        this.f101997d = new t<>();
    }

    public final void a() {
        if (this.f101994a.f101965a) {
            f.a.b.b a2 = com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.b.a.a().c(new b(this)).a((g<? super RecommendUserInDMBean, ? extends x<? extends R>>) new c(this), false).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this), new e(this));
            l.b(a2, "");
            f.a.j.a.a(a2, this.f101995b);
        }
    }

    public final void b() {
        List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a> value = this.f101996c.getValue();
        T t = null;
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next.f101970c == 2) {
                    t = next;
                    break;
                }
            }
        }
        List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a> value2 = this.f101996c.getValue();
        if (value2 != null) {
            Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            ad.b(value2).remove(t);
        }
        t<List<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a>> tVar = this.f101996c;
        tVar.setValue(tVar.getValue());
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendInDMViewModel f101999a;

        static {
            Covode.recordClassIndex(65263);
        }

        b(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f101999a = recommendFriendInDMViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f101999a.f101997d.postValue(true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendInDMViewModel f102002a;

        static {
            Covode.recordClassIndex(65266);
        }

        e(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f102002a = recommendFriendInDMViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f102002a.f101997d.postValue(false);
        }
    }

    public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a, Boolean> {
        final /* synthetic */ User $user$inlined;

        static {
            Covode.recordClassIndex(65262);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(User user) {
            super(1);
            this.$user$inlined = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a aVar) {
            String str;
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a aVar2 = aVar;
            l.d(aVar2, "");
            String uid = this.$user$inlined.getUid();
            User user = aVar2.f101969b;
            if (user != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            return Boolean.valueOf(l.a((Object) uid, (Object) str));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendInDMViewModel f102001a;

        static {
            Covode.recordClassIndex(65265);
        }

        d(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f102001a = recommendFriendInDMViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f102001a.f101996c.postValue(obj);
            this.f102001a.f101997d.postValue(false);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecommendFriendInDMViewModel f102000a;

        static {
            Covode.recordClassIndex(65264);
        }

        c(RecommendFriendInDMViewModel recommendFriendInDMViewModel) {
            this.f102000a = recommendFriendInDMViewModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x004d  */
        @Override // f.a.d.g
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            // Method dump skipped, instructions count: 145
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.viewmodel.RecommendFriendInDMViewModel.c.apply(java.lang.Object):java.lang.Object");
        }
    }

    public static void a(RecommendUserInDMBean recommendUserInDMBean, ArrayList<com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a> arrayList) {
        List<User> users = recommendUserInDMBean.getUsers();
        if (users != null) {
            Iterator<T> it = users.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.b.a.a(3, it.next(), 0, 4));
            }
        }
    }
}
