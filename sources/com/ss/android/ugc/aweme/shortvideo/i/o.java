package com.ss.android.ugc.aweme.shortvideo.i;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.a.ag;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.m.p;
import h.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f128564a = new o();

    private o() {
    }

    public static final class a<K, V> extends LinkedHashMap<K, V> {
        static {
            Covode.recordClassIndex(84303);
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<Map.Entry<K, V>> entrySet() {
            return getEntries();
        }

        public final Set getEntries() {
            return super.entrySet();
        }

        public final Set getKeys() {
            return super.keySet();
        }

        public final int getSize() {
            return super.size();
        }

        public final Collection getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Set<K> keySet() {
            return getKeys();
        }

        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final Collection<V> values() {
            return getValues();
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
        public final V put(K k2, V v) {
            if (v == null) {
                return null;
            }
            return (V) super.put(k2, v);
        }
    }

    static {
        Covode.recordClassIndex(84302);
    }

    public static String b(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mRecordFilterIds == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        String str = videoPublishEditModel.mRecordFilterIds;
        l.b(str, "");
        for (String str2 : p.c(str, new String[]{","})) {
            if (true ^ l.a((Object) str2, (Object) "null")) {
                sb.append(str2).append(",");
            }
        }
        if (sb.length() <= 0) {
            return sb.toString();
        }
        String sb2 = sb.toString();
        l.b(sb2, "");
        Objects.requireNonNull(sb2, "null cannot be cast to non-null type java.lang.String");
        String substring = sb2.substring(0, sb.length() - 1);
        l.b(substring, "");
        return substring;
    }

    public static Map<String, String> a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel.mBeautyMetadatas == null || videoPublishEditModel.mBeautyMetadatas.isEmpty()) {
            return ag.a();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList<BeautyMetadata> arrayList6 = videoPublishEditModel.mBeautyMetadatas;
        l.b(arrayList6, "");
        for (T t : arrayList6) {
            if (t.getBeautyName().length() > 0) {
                arrayList.add(t.getBeautyName());
                arrayList2.add(t.getBeautyStrength());
                arrayList3.add(t.getBeautyId());
                arrayList4.add(t.getBeautyRes());
                arrayList5.add(t.getBeautyValid());
            }
        }
        if (arrayList.isEmpty()) {
            return ag.a();
        }
        return ag.a(v.a("te_record_beauty_name", n.a(arrayList, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)), v.a("te_record_beauty_strength", n.a(arrayList2, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)), v.a("te_record_beauty_id", n.a(arrayList3, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)), v.a("te_record_beauty_res", n.a(arrayList4, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)), v.a("te_record_beauty_res_valid", n.a(arrayList5, ";", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62)));
    }
}
