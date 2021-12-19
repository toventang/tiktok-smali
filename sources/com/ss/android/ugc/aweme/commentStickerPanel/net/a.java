package com.ss.android.ugc.aweme.commentStickerPanel.net;

import com.bytedance.als.k;
import com.bytedance.als.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.a.c;
import com.ss.android.ugc.aweme.commentStickerPanel.a.e;
import h.a.n;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static CommentStickerPanelRequestApi f73273a = new CommentStickerPanelRequestApi();

    /* renamed from: b  reason: collision with root package name */
    public static final List<CommentVideoModel> f73274b;

    /* renamed from: c  reason: collision with root package name */
    public static final List<CommentVideoModel> f73275c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f73276d;

    /* renamed from: e  reason: collision with root package name */
    public static final k<Boolean> f73277e = new k<>();

    /* renamed from: f  reason: collision with root package name */
    public static String f73278f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f73279g = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final l<List<Object>> f73280h;

    /* renamed from: i  reason: collision with root package name */
    private static final l<List<Object>> f73281i;

    private a() {
    }

    public static boolean a() {
        return f73274b.isEmpty();
    }

    public static boolean b() {
        return f73275c.isEmpty();
    }

    static {
        Covode.recordClassIndex(45128);
        ArrayList arrayList = new ArrayList();
        f73274b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        f73275c = arrayList2;
        f73280h = new l<>(arrayList);
        f73281i = new l<>(arrayList2);
    }

    public static CommentVideoModel a(com.ss.android.ugc.aweme.commentStickerPanel.a.b bVar) {
        String str;
        String str2;
        h.f.b.l.d(bVar, "");
        com.ss.android.ugc.aweme.commentStickerPanel.a.k kVar = bVar.f73116a;
        UrlModel urlModel = null;
        if (kVar != null) {
            str = kVar.f73145a;
        } else {
            str = null;
        }
        com.ss.android.ugc.aweme.commentStickerPanel.a.k kVar2 = bVar.f73116a;
        if (kVar2 != null) {
            str2 = kVar2.f73146b;
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.commentStickerPanel.a.k kVar3 = bVar.f73116a;
        if (kVar3 != null) {
            urlModel = kVar3.f73147c;
        }
        return new CommentVideoModel(str, str2, urlModel, bVar.f73117b, bVar.f73118c, bVar.f73119d, bVar.f73122g, bVar.f73120e, bVar.f73121f, 0, null, 0, 0, null, null, null, 65024, null);
    }

    public static final class b extends m implements h.f.a.b<e, z> {
        final /* synthetic */ h.f.a.b $update;

        static {
            Covode.recordClassIndex(45130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(h.f.a.b bVar) {
            super(1);
            this.$update = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            Integer num;
            List<com.ss.android.ugc.aweme.commentStickerPanel.a.b> list;
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            List<c> list2 = eVar2.f73132b;
            if (!(list2 == null || list2.size() != 1 || (num = list2.get(0).f73127e) == null || num.intValue() != 1 || (list = list2.get(0).f73123a) == null)) {
                List<CommentVideoModel> list3 = a.f73275c;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.a(it.next()));
                }
                list3.addAll(arrayList);
            }
            h.f.a.b bVar = this.$update;
            if (bVar != null) {
                bVar.invoke(eVar2);
            }
            a.f73277e.a((Boolean) true);
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.net.a$a  reason: collision with other inner class name */
    public static final class C1634a extends m implements h.f.a.b<e, z> {
        final /* synthetic */ h.f.a.b $callback;

        static {
            Covode.recordClassIndex(45129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1634a(h.f.a.b bVar) {
            super(1);
            this.$callback = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e eVar) {
            List<com.ss.android.ugc.aweme.commentStickerPanel.a.b> list;
            e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            List<c> list2 = eVar2.f73132b;
            if (list2 != null) {
                for (c cVar : list2) {
                    Integer num = cVar.f73127e;
                    if (num != null) {
                        if (num.intValue() == 1) {
                            List<com.ss.android.ugc.aweme.commentStickerPanel.a.b> list3 = cVar.f73123a;
                            if (list3 != null) {
                                List<CommentVideoModel> list4 = a.f73275c;
                                ArrayList arrayList = new ArrayList(n.a((Iterable) list3, 10));
                                Iterator<T> it = list3.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(a.a(it.next()));
                                }
                                list4.addAll(arrayList);
                                a.f73276d = true;
                            }
                        } else if (num.intValue() == 2 && (list = cVar.f73123a) != null) {
                            List<CommentVideoModel> list5 = a.f73274b;
                            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
                            Iterator<T> it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(a.a(it2.next()));
                            }
                            list5.addAll(arrayList2);
                            a.f73276d = true;
                        }
                    }
                }
                a.f73277e.a((Boolean) true);
            }
            this.$callback.invoke(eVar2);
            return z.f158842a;
        }
    }
}
