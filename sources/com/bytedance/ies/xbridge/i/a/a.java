package com.bytedance.ies.xbridge.i.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.e;
import com.bytedance.ies.xbridge.i;
import com.bytedance.ies.xbridge.i.c.b;
import com.bytedance.ies.xbridge.m;
import com.bytedance.ies.xbridge.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class a extends com.bytedance.ies.xbridge.c.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f36049a = "x.chooseMedia";

    /* renamed from: b  reason: collision with root package name */
    private final b.a f36050b = b.a.PRIVATE;

    /* renamed from: com.bytedance.ies.xbridge.i.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0838a {
        static {
            Covode.recordClassIndex(21564);
        }

        void a(int i2, String str);

        void a(com.bytedance.ies.xbridge.i.c.b bVar, String str);
    }

    static {
        Covode.recordClassIndex(21563);
    }

    public abstract void a(com.bytedance.ies.xbridge.i.c.a aVar, AbstractC0838a aVar2, e eVar);

    @Override // com.bytedance.ies.xbridge.b
    public final String b() {
        return this.f36049a;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final b.a c() {
        return this.f36050b;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.i.c.a> d() {
        return com.bytedance.ies.xbridge.i.c.a.class;
    }

    @Override // com.bytedance.ies.xbridge.c.a, com.bytedance.ies.xbridge.b
    public final Class<com.bytedance.ies.xbridge.i.c.b> e() {
        return com.bytedance.ies.xbridge.i.c.b.class;
    }

    public static final class b implements AbstractC0838a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f36051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b.AbstractC0814b f36052b;

        static {
            Covode.recordClassIndex(21565);
        }

        b(a aVar, b.AbstractC0814b bVar) {
            this.f36051a = aVar;
            this.f36052b = bVar;
        }

        @Override // com.bytedance.ies.xbridge.i.a.a.AbstractC0838a
        public final void a(int i2, String str) {
            l.c(str, "");
            com.bytedance.ies.xbridge.c.a.a(this.f36052b, i2, str, null, 8);
        }

        @Override // com.bytedance.ies.xbridge.i.a.a.AbstractC0838a
        public final void a(com.bytedance.ies.xbridge.i.c.b bVar, String str) {
            l.c(bVar, "");
            l.c(str, "");
            l.c(bVar, "");
            if (bVar.f36102a == null) {
                com.bytedance.ies.xbridge.c.a.a(this.f36052b, -5, null, null, 12);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            List<b.C0845b> list = bVar.f36102a;
            if (list != null) {
                for (T t : list) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("tempFilePath", t.f36104b);
                    linkedHashMap2.put("size", Long.valueOf(t.f36105c));
                    linkedHashMap2.put("mediaType", t.f36106d);
                    byte[] bArr = t.f36107e;
                    if (bArr == null) {
                        bArr = "";
                    }
                    linkedHashMap2.put("binaryData", bArr);
                    String str2 = t.f36103a;
                    if (str2 != null) {
                        linkedHashMap2.put("base64Data", str2);
                    }
                    arrayList.add(linkedHashMap2);
                }
            }
            linkedHashMap.put("tempFiles", arrayList);
            a.a(this.f36052b, linkedHashMap, str);
        }
    }

    @Override // com.bytedance.ies.xbridge.b
    public final void a(n nVar, b.AbstractC0814b bVar, e eVar) {
        l.c(nVar, "");
        l.c(bVar, "");
        l.c(eVar, "");
        l.c(nVar, "");
        m c2 = i.c(nVar, "mediaTypes");
        if (c2 != null) {
            ArrayList arrayList = new ArrayList();
            int a2 = c2.a();
            for (int i2 = 0; i2 < a2; i2++) {
                arrayList.add(c2.d(i2));
            }
            String str = i.a(nVar, "sourceType", "");
            if (str.length() != 0) {
                int a3 = i.a(nVar, "maxCount", 1);
                boolean a4 = i.a(nVar, "compressImage", false);
                boolean a5 = i.a(nVar, "saveToPhotoAlbum", false);
                String str2 = i.a(nVar, "cameraType", "");
                boolean a6 = i.a(nVar, "needBinaryData", false);
                int a7 = i.a(nVar, "compressWidth", 0);
                int a8 = i.a(nVar, "compressHeight", 0);
                boolean a9 = i.a(nVar, "isNeedCut", false);
                int a10 = i.a(nVar, "cropRatioHeight", 0);
                int a11 = i.a(nVar, "cropRatioWidth", 0);
                boolean a12 = i.a(nVar, "needBase64Data", false);
                com.bytedance.ies.xbridge.i.c.a aVar = new com.bytedance.ies.xbridge.i.c.a();
                l.c(arrayList, "");
                aVar.f36088a = arrayList;
                l.c(str, "");
                aVar.f36089b = str;
                aVar.f36090c = a3;
                aVar.f36091d = a4;
                aVar.f36092e = a5;
                l.c(str2, "");
                aVar.f36093f = str2;
                aVar.f36094g = a6;
                aVar.f36095h = a7;
                aVar.f36096i = a8;
                aVar.f36097j = a9;
                aVar.f36098k = a11;
                aVar.f36099l = a10;
                aVar.f36100m = a12;
                a(aVar, new b(this, bVar), eVar);
                return;
            }
        }
        com.bytedance.ies.xbridge.c.a.a(bVar, -3, null, null, 12);
    }
}
