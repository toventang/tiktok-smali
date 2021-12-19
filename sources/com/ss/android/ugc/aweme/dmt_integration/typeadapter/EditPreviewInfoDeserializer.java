package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

public final class EditPreviewInfoDeserializer implements k<EditPreviewInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82947a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51699);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51700);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static EditPreviewInfo a(l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            o j2 = lVar.j();
            h.f.b.l.b(j2, "");
            a.a(j2, "reverseVideoArray");
            a.a(j2, "tempVideoArray");
            g gVar = new g();
            gVar.f54714d = true;
            return (EditPreviewInfo) gVar.a((Type) EditVideoSegment.class, (Object) new EditVideoSegmentDeserializer()).b().a((l) j2, EditPreviewInfo.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ EditPreviewInfo a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
