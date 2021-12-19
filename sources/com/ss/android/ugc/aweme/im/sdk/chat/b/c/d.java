package com.ss.android.ugc.aweme.im.sdk.chat.b.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.e.b;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatusResponse;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import f.a.d.g;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f100192a = new d();

    /* access modifiers changed from: package-private */
    public static final class a extends h.c.b.a.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(63864);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, h.c.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(null, this);
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(63863);
    }

    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f100193a;

        static {
            Covode.recordClassIndex(63865);
        }

        public b(List list) {
            this.f100193a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            List list = this.f100193a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ai) obj).getMsgType() == 40) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
            return null;
        }
    }

    public static final class c<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f100194a = new c();

        static {
            Covode.recordClassIndex(63866);
        }

        c() {
        }

        static final class a extends m implements h.f.a.b<ai, CharSequence> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f100195a = new a();

            static {
                Covode.recordClassIndex(63867);
            }

            a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ CharSequence invoke(ai aiVar) {
                ai aiVar2 = aiVar;
                l.d(aiVar2, "");
                BaseContent b2 = b.f.b(aiVar2);
                Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent");
                String commentId = ((CommentContent) b2).getCommentId();
                l.b(commentId, "");
                return commentId;
            }
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            l.d(list, "");
            return new p(list, n.a(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.f100195a, 30));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d$d  reason: collision with other inner class name */
    public static final class C2464d<T, R> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final C2464d f100196a = new C2464d();

        static {
            Covode.recordClassIndex(63868);
        }

        C2464d() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            final p pVar = (p) obj;
            l.d(pVar, "");
            String str = (String) pVar.getSecond();
            l.d(str, "");
            return ((TikTokImApi) com.ss.android.ugc.aweme.im.sdk.common.data.api.b.f102474a.getValue()).getCommentStatusBatch(str).c(new g() {
                /* class com.ss.android.ugc.aweme.im.sdk.chat.b.c.d.C2464d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(63869);
                }

                @Override // f.a.d.g
                public final /* synthetic */ Object apply(Object obj) {
                    T t;
                    boolean z;
                    String str;
                    String str2;
                    CommentStatusResponse commentStatusResponse = (CommentStatusResponse) obj;
                    l.d(commentStatusResponse, "");
                    List list = (List) pVar.getFirst();
                    List<CommentStatus> commentStatus = commentStatusResponse != null ? commentStatusResponse.getCommentStatus() : null;
                    ArrayList arrayList = new ArrayList();
                    if (list != null) {
                        for (T t2 : list) {
                            BaseContent b2 = b.f.b(t2);
                            Objects.requireNonNull(b2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent");
                            CommentContent commentContent = (CommentContent) b2;
                            if (commentStatus != null) {
                                Iterator<T> it = commentStatus.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        t = null;
                                        break;
                                    }
                                    t = it.next();
                                    T t3 = t;
                                    if (l.a((Object) String.valueOf(t3 != null ? t3.getCommentId() : null), (Object) commentContent.getCommentId())) {
                                        break;
                                    }
                                }
                                T t4 = t;
                                if (t4 != null) {
                                    String valueOf = String.valueOf(t4.getSharingStatus());
                                    String reason = t4.getReason();
                                    if (reason == null) {
                                        l.b();
                                    }
                                    if (valueOf == null || valueOf.length() == 0 || !((str2 = t2.getLocalExt().get("access_status")) == null || str2.length() == 0 || (!l.a((Object) valueOf, (Object) t2.getLocalExt().get("access_status"))))) {
                                        z = false;
                                    } else {
                                        t2.addLocalExt("access_status", valueOf);
                                        z = true;
                                    }
                                    if (reason != null && reason.length() != 0 && ((str = t2.getLocalExt().get("reason_string")) == null || str.length() == 0 || (!l.a((Object) reason, (Object) t2.getLocalExt().get("reason_string"))))) {
                                        t2.addLocalExt("reason_string", reason);
                                    } else if (!z) {
                                    }
                                    t.a((ai) t2);
                                    arrayList.add(t2);
                                }
                            }
                            com.ss.android.ugc.aweme.im.service.m.a.e("CommentStateManager", "Comment " + commentContent.getCommentId() + " remote status request failed!");
                        }
                    }
                    return arrayList;
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent r9, h.c.d<? super com.ss.android.ugc.aweme.feed.model.Aweme> r10) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.c.d.a(com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent, h.c.d):java.lang.Object");
    }
}
