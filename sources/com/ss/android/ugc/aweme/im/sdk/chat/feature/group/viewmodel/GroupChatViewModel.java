package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.im.core.d.h;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.i;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public final class GroupChatViewModel extends ac {

    /* renamed from: g  reason: collision with root package name */
    public static final a f100600g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<Integer> f100601a;

    /* renamed from: b  reason: collision with root package name */
    public final t<h> f100602b;

    /* renamed from: c  reason: collision with root package name */
    public final LiveData<Boolean> f100603c;

    /* renamed from: d  reason: collision with root package name */
    public final t<Boolean> f100604d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b f100605e;

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.ies.im.core.api.b.a f100606f;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f100607h;

    static {
        Covode.recordClassIndex(64355);
    }

    public final h a() {
        return (h) this.f100607h.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64356);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<h> {
        final /* synthetic */ GroupChatViewModel this$0;

        static {
            Covode.recordClassIndex(64357);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GroupChatViewModel groupChatViewModel) {
            super(0);
            this.this$0 = groupChatViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return this.this$0.f100606f.a(this.this$0.f100605e.getConversationId());
        }
    }

    @Override // androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        h a2 = a();
        if (a2 != null) {
            long conversationShortId = a2.getConversationShortId();
            t<Integer> tVar = this.f100601a;
            l.d(tVar, "");
            CopyOnWriteArrayList<t<Integer>> copyOnWriteArrayList = com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102652c.get(Long.valueOf(conversationShortId));
            if (copyOnWriteArrayList != null) {
                Objects.requireNonNull(copyOnWriteArrayList, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                ad.b(copyOnWriteArrayList).remove(tVar);
            }
        }
    }

    public /* synthetic */ GroupChatViewModel(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar) {
        this(bVar, a.C0745a.a());
    }

    static final class c<I, O> implements androidx.a.a.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100608a = new c();

        static {
            Covode.recordClassIndex(64358);
        }

        c() {
        }

        @Override // androidx.a.a.c.a
        public final /* synthetic */ Object a(Object obj) {
            return Boolean.valueOf(com.ss.android.ugc.aweme.im.sdk.group.a.a.a.b((h) obj));
        }
    }

    private GroupChatViewModel(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b bVar, com.bytedance.ies.im.core.api.b.a aVar) {
        Long l2;
        l.d(bVar, "");
        l.d(aVar, "");
        this.f100605e = bVar;
        this.f100606f = aVar;
        t<Integer> tVar = new t<>();
        this.f100601a = tVar;
        t<h> tVar2 = new t<>();
        this.f100602b = tVar2;
        this.f100607h = i.a((h.f.a.a) new b(this));
        LiveData<Boolean> a2 = aa.a(tVar2, c.f100608a);
        l.b(a2, "");
        this.f100603c = a2;
        this.f100604d = new t<>();
        h a3 = a();
        int i2 = 0;
        if (a3 != null) {
            long conversationShortId = a3.getConversationShortId();
            l.d(tVar, "");
            if (com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102652c.get(Long.valueOf(conversationShortId)) == null) {
                com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102652c.put(Long.valueOf(conversationShortId), new CopyOnWriteArrayList<>());
            }
            CopyOnWriteArrayList<t<Integer>> copyOnWriteArrayList = com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102652c.get(Long.valueOf(conversationShortId));
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.add(tVar);
            }
            Integer num = com.ss.android.ugc.aweme.im.sdk.group.b.a.a.f102650a.get(Long.valueOf(conversationShortId));
            tVar.postValue(num != null ? num : i2);
        } else {
            tVar.setValue(0);
        }
        tVar2.setValue(a());
        h a4 = a();
        if (a4 != null) {
            l.d(a4, "");
            String conversationId = a4.getConversationId();
            l.b(conversationId, "");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.f101508c = conversationId;
            com.bytedance.im.core.d.i coreInfo = a4.getCoreInfo();
            if (coreInfo != null) {
                l2 = Long.valueOf(coreInfo.getOwner());
            } else {
                l2 = null;
            }
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(l.a((Object) String.valueOf(l2), (Object) com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b().toString()));
        }
    }
}
