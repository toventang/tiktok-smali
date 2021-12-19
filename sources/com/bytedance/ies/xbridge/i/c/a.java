package com.bytedance.ies.xbridge.i.c;

import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class a extends com.bytedance.ies.xbridge.model.params.a {
    public static final C0844a n = new C0844a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<String> f36088a;

    /* renamed from: b  reason: collision with root package name */
    public String f36089b;

    /* renamed from: c  reason: collision with root package name */
    public int f36090c = 1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f36091d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36092e;

    /* renamed from: f  reason: collision with root package name */
    public String f36093f = "";

    /* renamed from: g  reason: collision with root package name */
    public boolean f36094g;

    /* renamed from: h  reason: collision with root package name */
    public int f36095h;

    /* renamed from: i  reason: collision with root package name */
    public int f36096i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f36097j;

    /* renamed from: k  reason: collision with root package name */
    public int f36098k;

    /* renamed from: l  reason: collision with root package name */
    public int f36099l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f36100m;

    static {
        Covode.recordClassIndex(21586);
    }

    /* renamed from: com.bytedance.ies.xbridge.i.c.a$a  reason: collision with other inner class name */
    public static final class C0844a {
        static {
            Covode.recordClassIndex(21587);
        }

        private C0844a() {
        }

        public /* synthetic */ C0844a(byte b2) {
            this();
        }
    }

    public final String a() {
        String str = this.f36089b;
        if (str == null) {
            l.a("sourceType");
        }
        return str;
    }

    @Override // com.bytedance.ies.xbridge.model.params.a
    public final List<String> provideParamList() {
        return n.b("mediaTypes", "sourceType", "maxCount", "compressImage", "saveToPhotoAlbum", "cameraType", "needBinaryData", "compressWidth", "compressHeight", "isNeedCut", "cropRatioWidth", "cropRatioHeight", "needBase64Data");
    }
}
