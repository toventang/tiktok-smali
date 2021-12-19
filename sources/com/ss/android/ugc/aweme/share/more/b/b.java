package com.ss.android.ugc.aweme.share.more.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sharer.ui.h;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public interface b {
    static {
        Covode.recordClassIndex(81519);
    }

    List<h> a(List<? extends h> list);

    List<h> b(List<? extends h> list);

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f124119a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final List<String> f124120b = n.b("video_tag_remove", "report", "dislike", "save", "promote", "favorite", "video_tag_edit", "live_photo");

        private a() {
        }

        static {
            Covode.recordClassIndex(81520);
        }

        @Override // com.ss.android.ugc.aweme.share.more.b.b
        public final List<h> a(List<? extends h> list) {
            l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (f124120b.contains(t.c())) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }

        @Override // com.ss.android.ugc.aweme.share.more.b.b
        public final List<h> b(List<? extends h> list) {
            l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!f124120b.contains(t.c())) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.more.b.b$b  reason: collision with other inner class name */
    public static final class C3230b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C3230b f124121a = new C3230b();

        /* renamed from: b  reason: collision with root package name */
        private static final List<String> f124122b = n.b("video_tag_remove", "save", "promote", "play_list", "favorite", "video_tag_edit");

        /* renamed from: c  reason: collision with root package name */
        private static final List<String> f124123c = n.b("report", "dislike", "privacy", "delete");

        private C3230b() {
        }

        static {
            Covode.recordClassIndex(81521);
        }

        @Override // com.ss.android.ugc.aweme.share.more.b.b
        public final List<h> a(List<? extends h> list) {
            l.d(list, "");
            return z.INSTANCE;
        }

        @Override // com.ss.android.ugc.aweme.share.more.b.b
        public final List<h> b(List<? extends h> list) {
            l.d(list, "");
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (f124122b.contains(t.c())) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : list) {
                if (f124123c.contains(t2.c())) {
                    arrayList3.add(t2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            for (T t3 : list) {
                T t4 = t3;
                if (!f124122b.contains(t4.c()) && !f124123c.contains(t4.c())) {
                    arrayList5.add(t3);
                }
            }
            ArrayList arrayList6 = arrayList5;
            ArrayList arrayList7 = new ArrayList();
            if (!arrayList2.isEmpty()) {
                arrayList7.addAll(arrayList2);
                arrayList7.add(new a());
            }
            if (!arrayList4.isEmpty()) {
                arrayList7.addAll(arrayList4);
                arrayList7.add(new a());
            }
            if (!arrayList6.isEmpty()) {
                arrayList7.addAll(arrayList6);
                arrayList7.add(new a());
            }
            arrayList7.remove(arrayList7.size() - 1);
            return arrayList7;
        }
    }
}
