package com.ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.utils.f;
import com.ss.android.ugc.aweme.emoji.utils.j;
import h.a.n;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.ci;
import kotlinx.coroutines.i;
import kotlinx.coroutines.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends g implements d {

    /* renamed from: a  reason: collision with root package name */
    static final List<d> f89428a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public static final b f89429b = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final am f89430f = an.a(bf.f159040a);

    private b() {
    }

    static {
        Covode.recordClassIndex(56190);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.b$b  reason: collision with other inner class name */
    static final class C2164b extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ List $list;
        final /* synthetic */ com.ss.android.ugc.aweme.emoji.emojichoose.model.b $resources;
        int label;

        static {
            Covode.recordClassIndex(56193);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2164b(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, List list, d dVar) {
            super(2, dVar);
            this.$resources = bVar;
            this.$list = list;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C2164b(this.$resources, this.$list, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C2164b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                b.f89429b.a(this.$resources, this.$list);
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ boolean $preload;
        final /* synthetic */ List $resourcesList;
        int label;

        static {
            Covode.recordClassIndex(56191);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List list, boolean z, d dVar) {
            super(2, dVar);
            this.$resourcesList = list;
            this.$preload = z;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$resourcesList, this.$preload, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                List<com.ss.android.ugc.aweme.emoji.emojichoose.model.b> list = this.$resourcesList;
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                for (com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar : list) {
                    arrayList.add(b.a(bVar));
                }
                ArrayList arrayList2 = arrayList;
                final LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList2.size());
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    linkedHashMap.put(this.$resourcesList.get(i3), arrayList2.get(i3));
                }
                ci ciVar = o.f159148a;
                AnonymousClass1 r1 = new m<am, d<? super z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.emoji.systembigemoji.b.a.AnonymousClass1 */
                    int label;
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(56192);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final d<z> create(Object obj, d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        static List<com.ss.android.ugc.aweme.emoji.g.a> a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar) {
                            JSONObject jSONObject;
                            String a2 = f.a(new File(j.b(bVar) + "/info.json"));
                            ArrayList arrayList = new ArrayList();
                            if (com.bytedance.common.utility.m.a(a2)) {
                                return arrayList;
                            }
                            try {
                                JSONArray jSONArray = new JSONObject(a2).getJSONArray("stickers");
                                int length = jSONArray.length();
                                for (int i2 = 0; i2 < length; i2++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    if (jSONObject2 != null) {
                                        com.ss.android.ugc.aweme.emoji.g.a aVar = new com.ss.android.ugc.aweme.emoji.g.a();
                                        aVar.setAnimateType(jSONObject2.getString("animate_type"));
                                        aVar.setDisplayName(jSONObject2.getString("display_name"));
                                        aVar.setId(jSONObject2.getLong("id"));
                                        aVar.setWidth(jSONObject2.getInt("width"));
                                        aVar.setHeight(jSONObject2.getInt("height"));
                                        String string = jSONObject2.getString("static_url");
                                        String string2 = jSONObject2.getString("animate_url");
                                        aVar.setStaticUrl(com.ss.android.ugc.aweme.emoji.utils.l.a(string, aVar.getWidth(), aVar.getHeight()));
                                        aVar.setStaticType(jSONObject2.getString("static_type"));
                                        aVar.setAnimateUrl(com.ss.android.ugc.aweme.emoji.utils.l.a(string2, aVar.getWidth(), aVar.getHeight()));
                                        aVar.setVersion(bVar.getVersion());
                                        aVar.setResourcesId(bVar.getId());
                                        Iterator<String> it = null;
                                        try {
                                            jSONObject = jSONObject2.getJSONObject("display_name_lang");
                                        } catch (JSONException e2) {
                                            e2.printStackTrace();
                                            jSONObject = null;
                                        }
                                        if (jSONObject != null) {
                                            it = jSONObject.keys();
                                        }
                                        if (it != null) {
                                            HashMap<String, String> hashMap = new HashMap<>();
                                            Iterator<String> keys = jSONObject.keys();
                                            while (keys.hasNext()) {
                                                String next = keys.next();
                                                l.b(next, "");
                                                String string3 = jSONObject.getString(next);
                                                l.b(string3, "");
                                                hashMap.put(next, string3);
                                            }
                                            aVar.setDisplayNameLangs(hashMap);
                                        }
                                        arrayList.add(aVar);
                                    }
                                }
                            } catch (JSONException e3) {
                                e3.printStackTrace();
                            }
                            return arrayList;
                        }

                        @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.d
                        public final void a(LinkedHashMap<com.ss.android.ugc.aweme.emoji.emojichoose.model.b, List<com.ss.android.ugc.aweme.emoji.g.a>> linkedHashMap) {
                            for (d dVar : f89428a) {
                                dVar.a(linkedHashMap);
                            }
                        }

                        @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.d
                        public final void a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, List<? extends com.ss.android.ugc.aweme.emoji.g.a> list) {
                            l.d(bVar, "");
                            for (d dVar : f89428a) {
                                dVar.a(bVar, list);
                            }
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.g
                        public final void a(com.ss.android.ugc.aweme.emoji.emojichoose.model.b bVar, boolean z) {
                            List<com.ss.android.ugc.aweme.emoji.g.a> list;
                            l.d(bVar, "");
                            if (z) {
                                list = a(bVar);
                            } else {
                                list = null;
                            }
                            bz unused = i.a(f89430f, o.f159148a, null, new C2164b(bVar, list, null), 2);
                        }

                        /* access modifiers changed from: protected */
                        @Override // com.ss.android.ugc.aweme.emoji.systembigemoji.g
                        public final void a(String str, List<? extends com.ss.android.ugc.aweme.emoji.emojichoose.model.b> list, boolean z) {
                            l.d(str, "");
                            l.d(list, "");
                            bz unused = i.a(f89430f, null, null, new a(list, z, null), 3);
                        }
                    }
