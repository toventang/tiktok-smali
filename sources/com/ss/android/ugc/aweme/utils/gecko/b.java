package com.ss.android.ugc.aweme.utils.gecko;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import h.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f142988a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f142989b = i.a(m.NONE, a.f142990a);

    public static Keva a() {
        return (Keva) f142989b.getValue();
    }

    private b() {
    }

    static final class a extends h.f.b.m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f142990a = new a();

        static {
            Covode.recordClassIndex(93577);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepoSync("repo_gecko_channel_list", 0);
        }
    }

    static {
        Covode.recordClassIndex(93576);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gecko.b$b  reason: collision with other inner class name */
    public static final class C3814b extends h.f.b.m implements h.f.a.b<List<? extends String>, z> {
        final /* synthetic */ SharedPreferences.Editor $editor;

        static {
            Covode.recordClassIndex(93578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3814b(SharedPreferences.Editor editor) {
            super(1);
            this.$editor = editor;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            l.d(list2, "");
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            inst.getGeckoInitialHighPriorityChannels().b(this.$editor, new HashSet(list2));
            return z.f158842a;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<String[], z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f142991a = new c();

        static {
            Covode.recordClassIndex(93579);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String[] strArr) {
            String[] strArr2 = strArr;
            l.d(strArr2, "");
            b.a().storeStringArray("high_pri_channels", strArr2);
            return z.f158842a;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<List<? extends String>, z> {
        final /* synthetic */ SharedPreferences.Editor $editor;

        static {
            Covode.recordClassIndex(93580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(SharedPreferences.Editor editor) {
            super(1);
            this.$editor = editor;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends String> list) {
            List<? extends String> list2 = list;
            l.d(list2, "");
            SharePrefCache inst = SharePrefCache.inst();
            l.b(inst, "");
            inst.getGeckoChannels().b(this.$editor, new HashSet(list2));
            return z.f158842a;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<String[], z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f142992a = new e();

        static {
            Covode.recordClassIndex(93581);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String[] strArr) {
            String[] strArr2 = strArr;
            l.d(strArr2, "");
            b.a().storeStringArray("normal_channels", strArr2);
            return z.f158842a;
        }
    }

    public static void a(List<String> list, h.f.a.b<? super List<String>, z> bVar, h.f.a.b<? super String[], z> bVar2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        bVar.invoke(list);
        if (com.bytedance.ies.abmock.b.a().a(true, "gecko_channel_store", false) && (list instanceof ArrayList)) {
            Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.String> /* = java.util.ArrayList<kotlin.String> */");
            ArrayList arrayList = (ArrayList) list;
            if (arrayList != null) {
                Object array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                bVar2.invoke(array);
            }
        }
    }
}
