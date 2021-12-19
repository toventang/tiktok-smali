package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.a.z;
import h.f.b.m;
import h.h;
import h.i;
import java.util.List;

public final class bz {

    /* renamed from: a  reason: collision with root package name */
    public static final bz f89676a = new bz();

    /* renamed from: b  reason: collision with root package name */
    private static final h f89677b = i.a((h.f.a.a) a.f89680a);

    /* renamed from: c  reason: collision with root package name */
    private static final h f89678c = i.a((h.f.a.a) b.f89681a);

    /* renamed from: d  reason: collision with root package name */
    private static final h f89679d = i.a((h.f.a.a) c.f89682a);

    public static int a() {
        return ((Number) f89677b.getValue()).intValue();
    }

    public static final boolean b() {
        return ((Boolean) f89678c.getValue()).booleanValue();
    }

    public static final List<String> c() {
        return (List) f89679d.getValue();
    }

    private bz() {
    }

    static final class b extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f89681a = new b();

        static {
            Covode.recordClassIndex(56357);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (bz.a() != 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f89680a = new a();

        static {
            Covode.recordClassIndex(56356);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(com.bytedance.ies.abmock.b.a().a(true, "detail_page_experiment", 0));
        }
    }

    static final class c extends m implements h.f.a.a<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f89682a = new c();

        static {
            Covode.recordClassIndex(56358);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<? extends String> invoke() {
            int a2 = bz.a();
            if (a2 == 1) {
                return n.b("common_feed_item_feed", "common_feed_item_feed", "common_feed_item_feed");
            }
            if (a2 != 2) {
                return z.INSTANCE;
            }
            return n.b("aweme_comment_fragment_input_detail", "common_feed_item_feed", "common_feed_item_feed", "common_feed_item_feed");
        }
    }

    static {
        Covode.recordClassIndex(56355);
    }
}
